package com.magic.util;

import com.magic.MTGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static com.magic.MTGame.*;
import static com.magic.util.DialogUtil.*;

public class ShopUtil {

    private static String[] choice = new String[4];

    public static void shop(int id) {
        switch (id) {
            case 0:     
                choice = new String[]{"◆  Add 800 health(25 Gold)", "◇  Add 20 attack(10 Gold)", "◇  Add 20 Defense(10 Gold)", "◇  Leave the shop"};
                imgIco.setIcon(new ImageIcon(MTGame.imgSource.get(22)));
                break;
            case 1:     
                choice = new String[]{"◆  Add 800 health(25 Gold)", "◇  Add 20 attack(10 Gold)", "◇  Add 20 Defense(10 Gold)", "◇  Leave the shop"};
                imgIco.setIcon(new ImageIcon(MTGame.imgSource.get(22)));
                break;
        }

        Insets insets = dialogLPane.getInsets();
        imgIco.setBounds(20 + insets.left, 20 + insets.top, GAME_PIX_72, GAME_PIX_72);
        text.setBounds(100 + insets.left, 20 + insets.top, 550 - 50, 250);
        text.setText("Choose one good: \n " + choice[0] + " \n " + choice[1] + " \n " + choice[2] + " \n " + choice[3]);
        dialogBgImg.setBounds(0, 0, 550, 250);
        dialogLPane.setBounds(550, 230, 550, 250);
        dialogLPane.add(imgIco, 2, 0);
        dialogLPane.add(text, 3, 0);
        gamePanel.add(dialogLPane);
        gamePanel.repaint();

        gameFrame.addKeyListener(new KeyListener() {
            int selection = 0;
            String message = "Choose one good: \n " + choice[0] + " \n " + choice[1] + " \n " + choice[2] + " \n " + choice[3];

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (selection != 3 && e.getKeyCode() == e.VK_S) {
                    choice[selection] = choice[selection].replaceAll("◆", "◇");
                    selection = selection + 1;
                    choice[selection] = choice[selection].replaceAll("◇", "◆");
                    message = "Choose one good: \n " + choice[0] + " \n " + choice[1] + " \n " + choice[2] + " \n " + choice[3];
                    text.setText(message);
                    gameFrame.repaint();
                }
                if (selection != 0 && e.getKeyCode() == e.VK_W) {
                    choice[selection] = choice[selection].replaceAll("◆", "◇");
                    selection = selection - 1;
                    choice[selection] = choice[selection].replaceAll("◇", "◆");
                    message = "Choose one good: \n " + choice[0] + " \n " + choice[1] + " \n " + choice[2] + " \n " + choice[3];
                    text.setText(message);
                    gameFrame.repaint();
                }
                if (e.getKeyCode() == e.VK_SPACE) {
                    switch (id) {
                        case 0:     
                            switch (selection) {
                                case 0:
                                    if (playerBean_1.getMoney() >= 25) {
                                        playerBean_1.setMoney(playerBean_1.getMoney() - 25);
                                        playerBean_1.setHp(playerBean_1.getHp() + 800);
                                    }
                                    break;
                                case 1:
                                    if (playerBean_1.getMoney() >= 10) {
                                        playerBean_1.setMoney(playerBean_1.getMoney() - 10);
                                        playerBean_1.setAttack(playerBean_1.getAttack() + 20);
                                    }
                                    break;
                                case 2:
                                    if (playerBean_1.getMoney() >= 10) {
                                        playerBean_1.setMoney(playerBean_1.getMoney() - 10);
                                        playerBean_1.setDefend(playerBean_1.getDefend() + 20);
                                    }
                                    break;
                                case 3:
                                    dialogLPane.remove(imgIco);
                                    dialogLPane.remove(text);
                                    gamePanel.remove(dialogLPane);
                                    gameFrame.repaint();
                                    inConversation = false;
                                    gameFrame.removeKeyListener(this);
                                    break;
                            }
                            break;
                        case 1:     
                            switch (selection) {
                                case 0:
                                    if (playerBean_1.getMoney() >= 25) {
                                        playerBean_1.setMoney(playerBean_1.getMoney() - 25);
                                        playerBean_1.setHp(playerBean_1.getHp() + 800);
                                    }
                                    break;
                                case 1:
                                    if (playerBean_1.getMoney() >= 10) {
                                        playerBean_1.setMoney(playerBean_1.getMoney() - 10);
                                        playerBean_1.setAttack(playerBean_1.getAttack() + 20);
                                    }
                                    break;
                                case 2:
                                    if (playerBean_1.getMoney() >= 10) {
                                        playerBean_1.setMoney(playerBean_1.getMoney() - 10);
                                        playerBean_1.setDefend(playerBean_1.getDefend() + 20);
                                    }
                                    break;
                                case 3:
                                    dialogLPane.remove(imgIco);
                                    dialogLPane.remove(text);
                                    gamePanel.remove(dialogLPane);
                                    gameFrame.repaint();
                                    inConversation = false;
                                    gameFrame.removeKeyListener(this);
                                    break;
                            }
                            break;
                            
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }
}
