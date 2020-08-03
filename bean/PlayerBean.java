package com.magic.bean;

import java.awt.image.BufferedImage;
import java.io.Serializable;

import com.magic.data.ImageData;
import com.magic.util.MsgUtil;


/**
 * PlayerBean 瀹炰綋绫�
 * <p>
 * 鐜╁绫汇�傜帺瀹剁殑鍚勪釜灞炴��
 *
 * @author ZYY
 */
public class PlayerBean implements Serializable{

    private int level;      
    private int hp;         
    private int attack;     
    private int defend;     
    private int money;      
    private int exp;        
    private int Ykey;       
    private int Bkey;       
    private int Rkey;   
    private int ExperienceToLevelUp;

    private int toward;     
    private int posX;      
    private int posY;      
    private int playerX;	
    private int playerY;	

    
    public PlayerBean() {

        this.level = 1;    
        this.hp = 1000;    
        this.attack = 10;   
        this.defend = 10;   
        this.money = 0;     
        this.exp = 0;       
        this.Ykey = 0;      
        this.Bkey = 0;      
        this.Rkey = 0;      

        this.toward = 1;    
        this.posX = 2;      
        this.posY = 2;      
        this.playerX=2;		
        this.playerY=2;

    }

    public void initPlayerXY(){
    	 this.playerX=2;		
         this.playerY=2;
    }
  
    public void moveFloor(int playerX,int playerY){
    	this.playerX=playerX;
    	this.playerY=playerY;
    	move(playerX,playerY);
    }
    
    public void move(int cx, int cy) {
    	
    	if(cx>playerX)
    		playerX+=1;
    	else if(cx<playerX){
    		playerX-=1;
    		
    	}
    	
    	if(cy>playerY)
    		playerY+=1;
    	else if(cy<playerY){
    		playerY-=1;
    		
    	}
    	
    	if(cx>=8)
    		posX=8;
    	else
    		posX = cx;
    	
    	if(cy>=8)
    		posY=8;
    	else
    		posY = cy;
       
    }
    
    public void checkLevelUp() {
    	
    	this.ExperienceToLevelUp = 20 + 10*this.level;
    	
        if(this.exp>this.ExperienceToLevelUp) {
        	this.level++;
        	this.attack = this.attack + 50;
        	this.defend = this.defend + 50;
        	this.exp = this.exp - this.ExperienceToLevelUp;
        	MsgUtil.displayMessage("Level Up!: Level +1 , exp -" + this.ExperienceToLevelUp);
        }
    }

    public boolean alive(){
    	if(this.hp<0) {
    		MsgUtil.displayMessage("You are lost in the Magic Tower! The Game will end in Two seconds!");
    		return false;
    	}
    	return true;
    }
    
    public BufferedImage draw() {
        if (toward == 0)
            return ImageData.playerMap.get(-1);
        if (toward == 1)
            return ImageData.playerMap.get(-2);
        if (toward == 2)
            return ImageData.playerMap.get(-3);
        if (toward == 3)
            return ImageData.playerMap.get(-4);
        return null;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefend() {
        return defend;
    }

    public void setDefend(int defend) {
        this.defend = defend;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getYkey() {
        return Ykey;
    }

    public void setYkey(int ykey) {
        Ykey = ykey;
    }

    public int getBkey() {
        return Bkey;
    }

    public void setBkey(int bkey) {
        Bkey = bkey;
    }

    public int getRkey() {
        return Rkey;
    }

    public void setRkey(int rkey) {
        Rkey = rkey;
    }

    public int getToward() {
        return toward;
    }

    public void setToward(int toward) {
        this.toward = toward;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

	public int getPlayerX() {
		return playerX;
	}

	public int getPlayerY() {
		return playerY;
	}

	public void setPlayerX(int playerX) {
		this.playerX = playerX;
	}

	public void setPlayerY(int playerY) {
		this.playerY = playerY;
	}
    
    
}
