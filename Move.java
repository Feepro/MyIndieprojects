import javax.swing.*;

/**
 * Created by FEEPRo on 01.05.2016.
 йцйуйцуйцуйцу*/
public class Move {
    static int swap;
    public static void moveUp(JLabel t1[][], Integer numb[][], JPanel jp1, JFrame frame){
        for(int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                if(numb[i][j]!=0){
                    if(numb[i][j++]==0){
                        swap=numb[i][j];
                        numb[i][j]=numb[i][j++];
                        numb[i][j++]=swap;
                        t1[i][j].setText(numb[i][j]+"");
                        t1[i][j++].setText(numb[i][j++]+"");

                    }else {System.out.println("qweqweqwe");}

                }


        }}

    }
    public static void moveDown(JLabel t1[][],Integer numb[][],JPanel jp1,JFrame frame){


    }
    public static void moveLeft(JLabel t1[][],Integer numb[][],JPanel jp1,JFrame frame){


    }
    public static void moveRight(JLabel t1[][],Integer numb[][],JPanel jp1,JFrame frame){


    }


}
