
package com.magic;

import static com.magic.MTGame.gameFrame;
import static com.magic.MTGame.inConversation;
import static com.magic.MTGame.interaction;
import static com.magic.MTGame.playerBean_1;
import static java.awt.event.KeyEvent.VK_DOWN;
import static java.awt.event.KeyEvent.VK_ENTER;
import static java.awt.event.KeyEvent.VK_J;
import static java.awt.event.KeyEvent.VK_L;
import static java.awt.event.KeyEvent.VK_LEFT;
import static java.awt.event.KeyEvent.VK_RIGHT;
import static java.awt.event.KeyEvent.VK_UP;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.magic.util.AutoMoveUtil;


public class KeyListenerImpl implements KeyListener{

	
	  @Override
      public void keyTyped(KeyEvent e) {
      }

      @Override
      public void keyPressed(KeyEvent e) {
          if (!MTGame.inConversation)
              switch (e.getKeyCode()) {

                  case VK_DOWN:   // 閿洏 鈫�
                      if (playerBean_1.getPosY() + 1 < 11 && playerBean_1.getPosY() + 1 >= 0) {
                          playerBean_1.setToward(1);
                          interaction(playerBean_1.getPlayerX(), playerBean_1.getPlayerY() + 1);
                          MTGame.gameFrame.repaint();
                      }
                      break;
                  case VK_RIGHT:  // 閿洏 鈫�
                      if (playerBean_1.getPosX() + 1 < 11 && playerBean_1.getPosX() + 1 >= 0) {
                          playerBean_1.setToward(2);
                          interaction(playerBean_1.getPlayerX() + 1, playerBean_1.getPlayerY());
                          MTGame.gameFrame.repaint();
                      }
                      break;
                  case VK_UP:     // 閿洏 鈫�
                      if (playerBean_1.getPosY() - 1 < 11 && playerBean_1.getPosY() - 1 >= 0) {
                          playerBean_1.setToward(3);
                          interaction(playerBean_1.getPlayerX(), playerBean_1.getPlayerY() - 1);
                          MTGame.gameFrame.repaint();
                      }
                      break;
                  case VK_LEFT:   // 閿洏 鈫�
                      if (playerBean_1.getPosX() - 1 < 11 && playerBean_1.getPosX() - 1 >= 0) {
                          playerBean_1.setToward(0);
                          interaction(playerBean_1.getPlayerX() - 1, playerBean_1.getPlayerY());
                          gameFrame.repaint();
                      }
                      break;
                  case VK_ENTER:
                  	new Thread(AutoMoveUtil.rmu,"Player Auto Move").start();
                  	break;
              }}
      
      @Override
      public void keyReleased(KeyEvent e) {
      }

}
