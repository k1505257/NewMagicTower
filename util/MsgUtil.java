package com.magic.util;

import com.magic.MagicGame;
import com.magic.data.ImageData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.magic.MTGame.GAME_PIX_72;
import static com.magic.MTGame.gameFrame;
import static com.magic.MTGame.inConversation;

/**
 * MsgUtil 宸ュ叿绫�
 * <p>
 * 缁樺埗鎻愮ず淇℃伅椤甸潰銆傦紙 鑾峰緱閬撳叿銆佸嚮鏉�鎬墿 锛�
 *
 * @author ZYY
 * @since 2018-7-14
 */
public class MsgUtil {

    public static JLayeredPane msgLPane = new JLayeredPane();           // 鎻愮ず淇℃伅闈㈡澘
    public static JLabel msgLabel = new JLabel();

    static {
        msgLPane.setLayout(null);
        msgLPane.setBounds(10, 270, GAME_PIX_72 * 18 - 20, 150);
        msgLabel.setBounds(0, 0, GAME_PIX_72 * 18 - 20, 150);
        msgLabel.setForeground(Color.WHITE);
        msgLabel.setFont(new Font("Serif", 0, 50));
        msgLabel.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel msgBackground = new JLabel(new ImageIcon(ImageData.blankBgImg));
        msgBackground.setLayout(null);
        msgBackground.setBounds(0, 0, GAME_PIX_72 * 18 - 20, 150);
        msgBackground.setBorder(BorderFactory.createLineBorder(new Color(204, 102, 0), 8, true));
        msgLPane.add(msgBackground, 1, 0);
        msgLPane.add(msgLabel, 2, 0);
        msgLPane.setOpaque(true);
        msgLPane.setVisible(false);
    }

    public static void displayMessage(String message) {
        msgLPane.setVisible(true);
        inConversation = true;
        Timer animat = new Timer(500, new ActionListener() {
            int count = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                if (count == 2) {
                    msgLPane.setVisible(false);
                    inConversation = false;
                    ((Timer) e.getSource()).stop();
                }
                msgLabel.setText(message);
                gameFrame.repaint();
            }
        });
        animat.setInitialDelay(0);
        animat.start();
    }
    public static void finishMessage() {
        msgLPane.setVisible(true);
        inConversation = true;
        msgLabel.setText("Thanks! My brave warror!");
        gameFrame.repaint();
        gameFrame.removeKeyListener(MagicGame.listener);
        Timer animat = new Timer(1, (ActionEvent e)->{
        	closeFinishMessage();
        });
        animat.setInitialDelay(5000);
        animat.start();
    }
    
    private static void closeFinishMessage(){
    	msgLPane.setVisible(false);
    	gameFrame.repaint();
    	System.exit(0);
    }
}
