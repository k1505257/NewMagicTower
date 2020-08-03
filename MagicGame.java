package com.magic;

import static com.magic.MTGame.GAME_PIX_72;
import static com.magic.MTGame.gameFrame;
import static com.magic.MTGame.gamePanel;
import static com.magic.MTGame.interaction;
import static com.magic.MTGame.playerBean_1;
import static com.magic.MTGame.timeLabel;
import static com.magic.util.BattleUtil.battleLPane;
import static com.magic.util.MsgUtil.msgLPane;
import static java.awt.event.KeyEvent.*;
import java.awt.event.KeyListener;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.magic.util.AutoMoveUtil;

public class MagicGame {

	private JFrame frame;
	public static KeyListener listener=new KeyListenerImpl();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MagicGame window = new MagicGame();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MagicGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1296, 936);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		gamePanel =new MTGame();
		gamePanel.setBounds(0, 0, 1296, 936);
		frame.getContentPane().add(gamePanel);
		
		 gamePanel.setPreferredSize(new Dimension(GAME_PIX_72 * 18, GAME_PIX_72 * 13));

	        gamePanel.add(battleLPane);
	        gamePanel.add(msgLPane);
	        gamePanel.add(timeLabel);
	        gameFrame.addKeyListener(listener);

	        gameFrame.setContentPane(gamePanel);
	        gameFrame.setResizable(false);
	        gameFrame.pack();
	        gameFrame.setLocationRelativeTo(null);
	        gameFrame.setVisible(true);
	        gameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
