import javax.swing.*;
import java.awt.*;

public class q6 extends JFrame {
    q6(){
        setTitle("Random Labels");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        for (int i=0 ; i<20 ; i++){
            int x = (int)(Math.random()*200) + 50;
            int y = (int)(Math.random()*200) + 50;

            JLabel label = new JLabel();
            label.setLocation(x,y);
            label.setSize(10,10);
            label.setOpaque(true);
            label.setBackground(Color.BLUE);
            c.add(label);
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new q6();
    }
}