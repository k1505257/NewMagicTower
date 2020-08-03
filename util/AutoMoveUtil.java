
package com.magic.util;


import com.magic.astar.AStar;
import com.magic.astar.Coord;
import com.magic.astar.MapInfo;
import com.magic.astar.Node;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static com.magic.MTGame.currentFloor;
import static com.magic.MTGame.playerBean_1;
import static com.magic.data.MapData.LvMap;

public class AutoMoveUtil implements Runnable {

    private final Lock lock = new ReentrantLock();

    private final Condition cond = lock.newCondition();

    public static AutoMoveUtil rmu = new AutoMoveUtil();


    public void run() {
    	
        lock.lock();
        try {
        	Robot robot = new Robot();
            while (true) {

                short[][] curMap = LvMap[currentFloor];
                Node node=null;
                int[][] maps = new int[curMap.length][];
                for (int i = 0; i < curMap.length; i++) {
                    maps[i] = new int[curMap[i].length];
                    for (int j = 0; j < curMap[i].length; j++) {

                        if (curMap[i][j] == 1||curMap[i][j]==14) {
                            maps[i][j] = 1;
                        } else {
                            maps[i][j] = 0;
                        }
                        if( currentFloor == 0) {
                        	
                        	if(playerBean_1.getAttack()<140) {
                        		if(playerBean_1.getPlayerX() == 33 && playerBean_1.getPlayerY() == 11) {
                        			robot.keyPress(KeyEvent.VK_RIGHT);
                                    robot.keyRelease(KeyEvent.VK_RIGHT);
                        		}else {
                        			node = new Node(33,11);
                        		}
                        	}else {
                        		if(curMap[i][j] == 13) {
                            		node = new Node(i,j);
                            	}
                        	}
                        	
                        }
                        if( currentFloor == 1) {
                        	if(curMap[i][j] == 13) {
                        		node = new Node(i,j);
                        	}
                        }if(currentFloor == 2) {
                        	if(curMap[i][j] == 28) {
                        		node = new Node(i,j);
                        	}
                        }
                    }
                }

                MapInfo info = new MapInfo(maps, maps[0].length, maps.length, new Node(playerBean_1.getPlayerX(), playerBean_1.getPlayerY()),node);
                AStar aStar = new AStar();
                aStar.start(info);
                List<Coord> way = aStar.getWay();


                if (way.size() == 1) {
                    System.out.println("寻路结束");
                    break;
                }
                Coord coord = way.get(way.size() - 2);
                
                
                if (coord.y == playerBean_1.getPlayerY() + 1) {
                    robot.keyPress(KeyEvent.VK_DOWN);
                    robot.keyRelease(KeyEvent.VK_DOWN);
                }
                if (coord.x == playerBean_1.getPlayerX() + 1) {
                    robot.keyPress(KeyEvent.VK_RIGHT);
                    robot.keyRelease(KeyEvent.VK_RIGHT);
                }
                if (coord.y == playerBean_1.getPlayerY() - 1) {
                    robot.keyPress(KeyEvent.VK_UP);
                    robot.keyRelease(KeyEvent.VK_UP);
                }
                if (coord.x == playerBean_1.getPlayerX() - 1) {
                    robot.keyPress(KeyEvent.VK_LEFT);
                    robot.keyRelease(KeyEvent.VK_LEFT);
                }

                Thread.sleep(100);
            }
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    /**
     * 打印地图
     */
    public static void printMap(int[][] maps) {
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length; j++) {
                System.out.print(maps[i][j] + " ");
            }
            System.out.println();
        }
    }

}
