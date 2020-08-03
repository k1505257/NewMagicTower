package com.magic.bean;

import static com.magic.MTGame.currentFloor;

import java.awt.image.BufferedImage;

import com.magic.MTGame;
import com.magic.data.ImageData;
import com.magic.data.MapData;
import com.magic.util.DialogUtil;

public class DialoguesBean {

    private static int id;

    public DialoguesBean(int id) {
        this.id = id;

        String[] messages;
        BufferedImage[] characters = new BufferedImage[50];
        int[] w = new int[50];
        int[] h = new int[50];
        for (int x = 0; x < 50; x++) {
            w[x] = 540;
            h[x] = 170;
        }
        for (int x = 0; x < characters.length; x++) {
            if (x % 2 == 0) {
                characters[x] = ImageData.playerMap.get(-2);
            } else {
                characters[x] = MTGame.imgSource.get(id);
            }
        }
        switch (this.id) {
            case 24:    
                messages = new String[]{
                        "   Where am I?(Press 'Space' and read carefully)",
                        "    You are in the Magic Tower!",
                        "    Where is the princess? I want to save her.",
                        "    She is on the third floor.",
                        "    How can i move?",
                        "    With the direction key on the keyboard",
                        "   Ok seeyou",
                        "    Wait! There is a shop in the Tower. You can shop with key W, S and Space",
                        "    Ok,I cant wait any more" ,
                      
                        "     Good Luck! Warrior"
                };
                h[9] = 220;
                h[13] = 400;
                h[15] = 380;
                h[17] = 200;
                DialogUtil.talk(messages, characters, w, h);
                MapData.LvMap[currentFloor][8][5] = 0;
                MapData.LvMap[currentFloor][8][4] = 24;
//                MTGame.baseBeanMap[0][4][8] = new DialoguesBean(1);
//                MTGame.baseBeanMap[0][5][8] = null;
                MTGame.playerBean_1.setYkey(MTGame.playerBean_1.getYkey() + 1);
                MTGame.playerBean_1.setBkey(MTGame.playerBean_1.getBkey() + 1);
                MTGame.playerBean_1.setRkey(MTGame.playerBean_1.getRkey() + 1);
                break;
            case 1:     
//                if (!MTGame.hasCross) {
//                    MTGame.inConversation = false;
//                    return;
//                }
                messages = new String[]{
                        "121321321321321321"
                };

                break;
        }
    }
}
