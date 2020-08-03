package com.magic.util;

import static com.magic.MTGame.GAME_PIX_72;
import static com.magic.MTGame.currentFloor;
import static com.magic.data.MapData.LvMap;
import static com.magic.util.BattleUtil.IS_FIGHT;
import static com.magic.util.RandomMoveUtil.rmu;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.Timer;

import com.magic.MTGame;
import com.magic.bean.MonsterBean;
import com.magic.data.ImageData;
import com.magic.data.MonsterData;

/**
 * BattleUtil 宸ュ叿绫�
 * <p>
 * 缁樺埗鎴樻枟杩囩▼椤甸潰銆傦紙 鍦ㄧ帺瀹惰兘鍑昏触鎬墿鐨勬儏鍐典笅 锛�
 *
 * @author ZYY
 * @since 2018-7-14
 */
public class BattleUtil {

    // 鎴樻枟椤甸潰鏂囧瓧鐨勯璁炬牸寮� Font
    private static final Font BATTLE_FONT = new Font("Serif", 0, 35);

    public static JLayeredPane battleLPane = new JLayeredPane();       // 鎴樻枟淇℃伅闈㈡澘

    private JLabel battleBgLabel;
    private JLabel monsterImg;                      // 鎬墿鍥剧墖
    private JLabel monster_hp = new JLabel();       // 鎬墿鐢熷懡鍊�
    private JLabel monster_attack = new JLabel();   // 鎬墿鏀诲嚮鍔�
    private JLabel monster_defend = new JLabel();   // 鎬墿闃插尽鍔�
    private JLabel player_hp = new JLabel();        // 鐜╁鐢熷懡鍊�
    private JLabel player_attack = new JLabel();    // 鐜╁鏀诲嚮鍔�
    private JLabel player_defend = new JLabel();    // 鐜╁闃插尽鍔�

    private MonsterBean monsterBean;
    private int hp;
    private int attack;
    private int defend;
    public static AtomicBoolean IS_FIGHT=new AtomicBoolean(false);//AtomicBoolean鍦ㄤ慨鏀规椂涓嶄細浜х敓鏂板璞★紝鑰宐oolean鍦ㄤ慨鏀规椂浜х敓鏂板璞�

    /**
     * @param id 鎬墿id
     * @param x  鎬墿x鍧愭爣
     * @param y  鎬墿y鍧愭爣
     */
    public BattleUtil(int id, int x, int y) {
    	IS_FIGHT.set(true);

        monsterBean = MonsterData.monsterMap.get(id);
        hp = monsterBean.getHp();
        attack = monsterBean.getAttack();
        defend = monsterBean.getDefend();

        // 鍙栧浘
        battleBgLabel = new JLabel(new ImageIcon(ImageData.battleBgImg));
        monsterImg = new JLabel(new ImageIcon(MTGame.imgSource.get(id)));

        // 鍒濆鍖� 鎴樻枟淇℃伅闈㈡澘
        battleLPane.setLayout(null);
        battleLPane.setBounds(27, GAME_PIX_72 * 2, 1242, 541);
        battleBgLabel.setBounds(0, 0, 1242, 541);
        battleLPane.add(battleBgLabel, 1, 0);
        battleLPane.setOpaque(true);
        battleLPane.setVisible(false);

        //
        int tmp = -50;
        monster_hp.setBounds(400, 37 + tmp, 300, 300);
        monster_hp.setFont(BATTLE_FONT);
        monster_hp.setForeground(Color.WHITE);

        monster_attack.setBounds(400, 157 + tmp, 300, 300);
        monster_attack.setFont(BATTLE_FONT);
        monster_attack.setForeground(Color.WHITE);

        monster_defend.setBounds(400, 291 + tmp, 300, 300);
        monster_defend.setFont(BATTLE_FONT);
        monster_defend.setForeground(Color.WHITE);

        player_hp.setBounds(785, 37 + tmp, 300, 300);
        player_hp.setFont(BATTLE_FONT);
        player_hp.setForeground(Color.WHITE);

        player_attack.setBounds(785, 157 + tmp, 300, 300);
        player_attack.setFont(BATTLE_FONT);
        player_attack.setForeground(Color.WHITE);

        player_defend.setBounds(785, 291 + tmp, 300, 300);
        player_defend.setFont(BATTLE_FONT);
        player_defend.setForeground(Color.WHITE);

        battleLPane.add(monster_hp, 2, 0);
        battleLPane.add(monster_attack, 3, 0);
        battleLPane.add(monster_defend, 4, 0);
        battleLPane.add(player_hp, 5, 0);
        battleLPane.add(player_attack, 6, 0);
        battleLPane.add(player_defend, 7, 0);

        monsterImg.setBounds(100, 120, 72, 72);
        battleLPane.add(monsterImg, 8, 0);

        monster_hp.setText(hp + "");
        monster_attack.setText(attack + "");
        monster_defend.setText(defend + "");

        player_hp.setText(MTGame.playerBean_1.getHp() + "");
        player_attack.setText(MTGame.playerBean_1.getAttack() + "");
        player_defend.setText(MTGame.playerBean_1.getDefend() + "");
        battleLPane.setVisible(true);
        MTGame.inConversation = true;
        Timer bFrame = new Timer(500, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ex) {
                attack(/*monsterBean?*/);
                monster_hp.setText(hp + "");
                player_hp.setText(MTGame.playerBean_1.getHp() + "");
                MTGame.gameFrame.repaint();
                if (hp <= 0) {
                	
                    battleLPane.setVisible(false);
                    MTGame.inConversation = false;

                    MTGame.playerBean_1.setExp(MTGame.playerBean_1.getExp() + monsterBean.getExp());//exp += monsterBean.getExp();
                    MTGame.playerBean_1.setMoney(MTGame.playerBean_1.getMoney() + monsterBean.getMoney());// += monsterBean.getMoney();
                    MsgUtil.displayMessage("Gold:+ " + monsterBean.getExp() + " Exe:+ " + monsterBean.getMoney() + " !");
                    battleLPane.remove(monsterImg);
                    battleLPane.remove(monster_hp);
                    battleLPane.remove(monster_attack);
                    battleLPane.remove(monster_defend);
                    battleLPane.remove(player_hp);
                    battleLPane.remove(player_attack);
                    battleLPane.remove(player_defend);

                    LvMap[currentFloor][y][x] = 0;
                    MTGame.playerBean_1.move(x, y);
                    ((Timer) ex.getSource()).stop();
                   
                    rmu.wakeUp();
                }
            }
        });
        bFrame.start();
    }

    private void attack(/*MonsterBean e*/) {
        if (MTGame.playerBean_1.getAttack() > defend) {
            hp = hp - MTGame.playerBean_1.getAttack() + defend;
        }
        if (hp <= 0) return;
        if (attack > MTGame.playerBean_1.getDefend()) {
            MTGame.playerBean_1.setHp(MTGame.playerBean_1.getHp() - attack + MTGame.playerBean_1.getDefend()); //= hp - e.getAttack() + defend;
        }
        if (MTGame.playerBean_1.getAttack() < defend && attack < MTGame.playerBean_1.getDefend()) return;
    }
}
