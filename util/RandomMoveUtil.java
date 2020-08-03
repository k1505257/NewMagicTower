
package com.magic.util;


import static com.magic.MTGame.currentFloor;
import static com.magic.MTGame.playerBean_1;
import static com.magic.data.MapData.LvMap;
import static com.magic.util.BattleUtil.IS_FIGHT;

import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RandomMoveUtil implements Runnable{

	private final Lock lock=new ReentrantLock();
	
	private final Condition cond=lock.newCondition();
	
	public static RandomMoveUtil rmu=new RandomMoveUtil();
	
	
	public void run() {
		lock.lock();
		try{
			while(true){
				if(IS_FIGHT.get()==true){
					cond.await();
					/*if(((ReentrantLock) lock).hasQueuedThreads())
						lock.unlock();*/
				}else{
					Random ran=new Random();
	    	    	int monsterNmu=0;
	    	    	
	    	    	for(int x=0;x<50;x++){
	    	    		
	    	    		for(int y=0;y<50;y++){
	    	    			short id=LvMap[currentFloor][y][x];
	    	    			
	    	    			if(id>=40&&id<=70){
	    	    				
	    	    				int ranX=ran.nextInt(3)-1;
	    	    				int ranY=ran.nextInt(3)-1;
	    	    				
	    	    				if(LvMap[currentFloor][y+ranY][x+ranX]==0&&(y+ranY!=playerBean_1.getPlayerY()&&x+ranX!=playerBean_1.getPlayerX())){
	    	    					LvMap[currentFloor][y][x]=0;
	    	    					LvMap[currentFloor][y+ranY][x+ranX]=id;
	    	    				}
	    	    			}
	    	    		}
	    	    	}
	    	    	
	    	    	for(int i=0;i<50;i++){
	    	    		for(int j=0;j<50;j++){
	    	    			if(LvMap[currentFloor][j][i]==40){
	    	    				monsterNmu++;
	    	    			}
	    	    		}
	    	    	}
	    	    	
	    	    	Thread.sleep(1000);
				}
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		finally {
			lock.unlock();
		}
	}

	public void wakeUp(){
		
		 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		IS_FIGHT.set(false);
		
		lock.lock();
		cond.signal();
		lock.unlock();
		
	}
}
