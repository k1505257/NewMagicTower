package com.magic;

import com.magic.bean.DialoguesBean;
import com.magic.bean.PlayerBean;
import com.magic.data.ImageData;
import com.magic.data.MonsterData;
import com.magic.util.*;

import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import java.util.HashMap;
import java.util.Random;

import static com.magic.MTGame.currentFloor;
import static com.magic.MTGame.playerBean_1;
import static com.magic.data.MapData.*;
import static com.magic.util.RandomMoveUtil.rmu;

public class MTGame extends JPanel {

    public static final int GAME_PIX_54 = 54;
    public static final int GAME_PIX_72 = 72;

    public static HashMap<Integer, BufferedImage> imgSource = ImageData.imagesMap0;     // switch frames
    public static PlayerBean playerBean_1 = new PlayerBean();                           // keep the value of player

    public static JFrame gameFrame;
    public static JPanel gamePanel;

    // Game Time MIN SEC
    public static JLabel timeLabel;
    public static int gameMin = 0;
    public static double gameSec = 0;

    // Variable overall
    public static boolean inConversation = false;   // Allow keyboard interaction
    public static boolean talked = false;
    public static int currentFloor = 0;     // Current Floor
    public static int maxFloor = 0;         // Max Floor

    
    // The constructor
    public MTGame() {
        setLayout(null);
        gameFrame = new JFrame("Magic Tower Remake Vertion");

        // initialize the time panel
        timeLabel = new JLabel();
        timeLabel.setBounds(80, 800, 250, 100);
        timeLabel.setForeground(Color.WHITE);
        timeLabel.setFont(new Font("Serif", 0, 25));

        // initialize picture shift
        new Timer(500, new ActionListener() {
            boolean change = true;

            @Override
            public void actionPerformed(ActionEvent e) {
                MTGame.gameSec += 0.5;  // 1/frequency is 0.5s
                if (gameSec == 60) {
                    gameSec = 0;
                    gameMin++;
                }
                MTGame.timeLabel.setText(" Game Time: " + gameMin + " min" + (int) gameSec + " sec");
                if (change) {
                    change = false;
                    imgSource = ImageData.imagesMap0;
                } else {
                    change = true;
                    imgSource = ImageData.imagesMap1;
                }
                repaint();
            }
        }).start();
        
        
        // initialize the random move of the monster
        new Thread(rmu,"Monster Randomly Move").start();
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        // Draw the main background of the game
        g2.drawImage(ImageData.gameBgImg, 0, 0, null);

        // Draw the map
        this.drawMap(playerBean_1.getPlayerX(), playerBean_1.getPlayerY(), g2);
        
        
        // Draw the player
        g2.drawImage(playerBean_1.draw(), (playerBean_1.getPosX() + 6) * GAME_PIX_72, (playerBean_1.getPosY() + 1) * GAME_PIX_72, null);

        // Draw the player data label
        g2.setFont(new Font("Arial", 0, 30));
        g2.setColor(Color.WHITE);
        g2.drawString(playerBean_1.getLevel() + "", 230, 150);
        g2.drawString(playerBean_1.getHp() + "", 220, 215);
        g2.drawString(playerBean_1.getAttack() + "", 220, 270);
        g2.drawString(playerBean_1.getDefend() + "", 220, 325);
        g2.drawString(playerBean_1.getMoney() + "", 220, 385);
        g2.drawString(playerBean_1.getExp() + "", 220, 440);

        // Draw current floor
        g2.drawString((currentFloor+1) + "", 200, 750);
    }


    // Interaction Function
    public static void interaction(int x, int y) {
    	if(playerBean_1.alive() == false) {
    		
    		MsgUtil.displayMessage("You are lost in the Magic Tower! The Game will end in Two seconds!");
    		
    		try {
    			Thread.currentThread();
				Thread.sleep(2000);
    		}
    		catch(Exception e){}
    		System.exit(0);
    	}
        int id = LvMap[currentFloor][y][x];
        switch (id) {
            case 0:     
                playerBean_1.move(x, y);
                playerBean_1.checkLevelUp();
                System.out.println(playerBean_1.getPlayerX() +","+ playerBean_1.getPlayerY());
                break;
            case 1:     // wall
                break;
            case 5:     // Stone
                break;

            case 9:     // Sapphire
                LvMap[currentFloor][y][x] = 0;
                playerBean_1.move(x, y);
                MTGame.playerBean_1.setDefend(MTGame.playerBean_1.getDefend() + 3);
                MsgUtil.displayMessage("Get a Sapphire: Defense +3 !");
                break;
            case 10:    // Ruby
                LvMap[currentFloor][y][x] = 0;
                playerBean_1.move(x, y);
                MTGame.playerBean_1.setAttack(MTGame.playerBean_1.getAttack() + 3);
                MsgUtil.displayMessage("Get a Ruby: Attack +3!");
                break;
            case 11:    // Red Potion
                LvMap[currentFloor][y][x] = 0;
                playerBean_1.move(x, y);
                MTGame.playerBean_1.setHp(MTGame.playerBean_1.getHp() + 200);
                MsgUtil.displayMessage("Get a small blood bottle: Health +200!");
                break;
            case 12:    // Blue Potion
                LvMap[currentFloor][y][x] = 0;
                playerBean_1.move(x, y);
                MTGame.playerBean_1.setHp(MTGame.playerBean_1.getHp() + 500);
                MsgUtil.displayMessage("Get a big blood bottle: Health +500!");
                break;
            case 13:    // Upstairs
                currentFloor++;
                maxFloor = Math.max(maxFloor, currentFloor);
                playerBean_1.moveFloor(initPos[currentFloor][0], initPos[currentFloor][1]);
                break;
            case 14:    // Downstairs
                currentFloor--;
                playerBean_1.moveFloor(finPos[currentFloor][0], finPos[currentFloor][1]);
                break;

            case 22:    // Store
                if (currentFloor == 0) {
                    ShopUtil.shop(0);
                } else if (currentFloor == 1) {
                    ShopUtil.shop(1);
                }
                break;
            case 24:    // [Dialogue] Fairy
                new DialoguesBean(id);
                break;
            case 28:   
                LvMap[currentFloor][y][x] = 0;
                playerBean_1.move(x, y);
                MsgUtil.finishMessage();
                break;

            case 30:    // Small Flight feather
                LvMap[currentFloor][y][x] = 0;
                playerBean_1.move(x, y);
                MTGame.playerBean_1.setLevel(MTGame.playerBean_1.getLevel() + 1);
                playerBean_1.setHp(MTGame.playerBean_1.getHp() + 1000);
                playerBean_1.setAttack(MTGame.playerBean_1.getAttack() + 20);
                playerBean_1.setDefend(MTGame.playerBean_1.getDefend() + 20);
                MsgUtil.displayMessage("Get a small flying feather: Attack and Defend +20");
                break;
            case 31:    // Big Flight feather
                LvMap[currentFloor][y][x] = 0;
                playerBean_1.move(x, y);
                playerBean_1.setLevel(MTGame.playerBean_1.getLevel() + 3);
                playerBean_1.setHp(MTGame.playerBean_1.getHp() + 3000);
                playerBean_1.setAttack(MTGame.playerBean_1.getAttack() + 60);
                playerBean_1.setDefend(MTGame.playerBean_1.getDefend() + 60);
                MsgUtil.displayMessage("Get a big flying feather: Attack and Defend +60");
                break;

            case 33:    // Holy Water
                LvMap[currentFloor][y][x] = 0;
                playerBean_1.move(x, y);
                MTGame.playerBean_1.setHp(MTGame.playerBean_1.getHp() * 2);
                MsgUtil.displayMessage("Drink Holy Water: Health *2");
                break;

            case 39:    // Gold Bullion
                LvMap[currentFloor][y][x] = 0;
                playerBean_1.move(x, y);
                MTGame.playerBean_1.setMoney(MTGame.playerBean_1.getMoney() + 300);
                MsgUtil.displayMessage("Collect Gold Bullion: money +300");
                break;
            case 40:    // [鎬墿 monster]
            case 41:    // [鎬墿 monster]
            case 42:    // [鎬墿 monster]
            case 43:    // [鎬墿 monster]
            case 44:    // [鎬墿 monster]
            case 45:    // [鎬墿 monster]
            case 46:    // [鎬墿 monster]
            case 47:    // [鎬墿 monster]
            case 48:    // [鎬墿 monster]
            case 49:    // [鎬墿 monster]
            case 50:    // [鎬墿 monster]
            case 51:    // [鎬墿 monster]
            case 52:    // [鎬墿 monster]
            case 53:    // [鎬墿 monster]
            case 54:    // [鎬墿 monster]
            case 55:    // [鎬墿 monster]
            case 56:    // [鎬墿 monster]
            case 57:    // [鎬墿 monster]
            case 58:    // [鎬墿 monster]
            case 59:    // [鎬墿 monster]
            case 60:    // [鎬墿 monster]
            case 61:    // [鎬墿 monster]
            case 62:    // [鎬墿 monster]
            case 63:    // [鎬墿 monster]
            case 64:    // [鎬墿 monster]
            case 65:    // [鎬墿 monster]
            case 66:    // [鎬墿 monster]
            case 67:    // [鎬墿 monster]
            case 68:    // [鎬墿 monster]
            case 69:    // [鎬墿 monster]
            case 70:    // [鎬墿 monster]
                    new BattleUtil(id, x, y);
                break;
            case 71:    // Iron Sword
                LvMap[currentFloor][y][x] = 0;
                playerBean_1.move(x, y);
                MTGame.playerBean_1.setAttack(MTGame.playerBean_1.getAttack() + 10);
                MsgUtil.displayMessage("Iron Sword: Attack +10");
                break;
            case 73:    // Steel Sword
                LvMap[currentFloor][y][x] = 0;
                playerBean_1.move(x, y);
                MTGame.playerBean_1.setAttack(MTGame.playerBean_1.getAttack() + 30);
                MsgUtil.displayMessage("Steel Sword: Attack +30");
                break;
            case 75:    // Excalibur
                LvMap[currentFloor][y][x] = 0;
                playerBean_1.move(x, y);
                MTGame.playerBean_1.setAttack(MTGame.playerBean_1.getAttack() + 120);
                MsgUtil.displayMessage("Excalibur: Attack +120");
                break;
            case 76:    // Iron Shield
                LvMap[currentFloor][y][x] = 0;
                playerBean_1.move(x, y);
                MTGame.playerBean_1.setDefend(MTGame.playerBean_1.getDefend() + 10);
                MsgUtil.displayMessage("Iron Shield: Denfence +10");
                break;
            case 78:    // Steel Shield
                LvMap[currentFloor][y][x] = 0;
                playerBean_1.move(x, y);
                MTGame.playerBean_1.setDefend(MTGame.playerBean_1.getDefend() + 30);
                MsgUtil.displayMessage("Steel Shiled: Denfence +30");
                break;
            case 80:    // Divine Shield
                LvMap[currentFloor][y][x] = 0;
                playerBean_1.move(x, y);
                MTGame.playerBean_1.setDefend(MTGame.playerBean_1.getDefend() + 120);
                MsgUtil.displayMessage("Divine Shiled: Defence +120");
                break;
        }
    }
    
    public void drawMap(int playerX,int playerY,Graphics2D g2){
    	// Draw Map Data
    	int x=0;
    	int y=0;
    	if(playerX>8)
    		x=playerX-8;
    	if(playerY>8)
    		y=playerY-8;
    	
        for (int i=0; i <11; i++) {
            for (int j=0; j <11; j++) {
            	int mapX=x+j;
            	int mapY=y+i;
            	if(mapX>49)
            		mapX=49;
            	if(mapY>49)
            		mapY=49;
                int id = LvMap[currentFloor][mapY][mapX];
                BufferedImage a = imgSource.get(id);
                g2.drawImage(a, GAME_PIX_72 * j + GAME_PIX_72 * 6, GAME_PIX_72 * i + GAME_PIX_72, null);
            }
        }
    }
   
}