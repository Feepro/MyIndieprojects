

/**
 * Created by FEEPRo on 28.04.2016.
 */
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class keyuse extends Main {
    public static void butDO( JLabel t1[][],Integer numb[][],JPanel jp1,JFrame frame){
        Rand(t1,numb,jp1,frame);
        frame.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == 40){
                    Move.moveDown(t1,numb,jp1,frame);
                 }
                }
        });
    };


    public static void Rand(JLabel t1[][],Integer numb[][],JPanel jp1,JFrame frame){
        for (int i = 0; i <= t1.length-1; i++) {
            for (int j = 0; j <= t1.length - 1; j++) {
                numb[i][j] =(int)getRandomBoolean();
                if(numb[i][j]==1)
                    numb[i][j]++;
                t1[i][j].setText(numb[i][j]+"");
            }
        }
    }
    public static double getRandomBoolean() {
        return Math.random()*2;
        //I tried another approaches here, still the same result

    }
}
