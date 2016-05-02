import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
/**
 * Created by FEEPRo on 28.04.2016.
 */
public class Main {
    Integer numb = new Integer(1);
    static Border solidBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
    public static void main(String arg[]) {
        JFrame frame = new JFrame("2048");
        frame.setSize(450,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        InputMass(frame);
        frame.setVisible(true);
    }
    public static void InputMass(JFrame frame){
        Font font = new Font("Crystal", Font.PLAIN, 72);
        JPanel jp1 = new JPanel();
        Integer numb[][];
        numb =new Integer[4][4];
        frame.add(jp1);
        jp1.setLayout(new GridLayout(4,4));

        JLabel t1[][] = new JLabel[4][4];

        for (int i = 0; i <= t1.length-1; i++) {
            for (int j = 0; j <= t1.length-1; j++) {
                numb[i][j]=0;
                t1[i][j]=new JLabel(numb[i][j]+"");
                t1[i][j].setFont(font);
                t1[i][j].setVerticalAlignment(JLabel.CENTER);
                t1[i][j].setHorizontalAlignment(JLabel.CENTER);
                t1[i][j].setBorder(solidBorder);
                jp1.add(t1[i][j]);
            }
        }
        keyuse.butDO(t1,numb,jp1,frame);
    }
}
