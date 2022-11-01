import javax.swing.*;
import java.awt.*;

public class q4 extends JFrame {
    public q4(){
        setTitle("Ten Color Buttons Frame");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new GridLayout(1,10));

        Color color[] = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.PINK, Color.GRAY, Color.WHITE, Color.BLACK};

        JButton jb[] = new JButton[10];

        for(int i=0 ; i<10 ; i++){
            jb[i] = new JButton(Integer.toString(i));
            jb[i].setBackground(color[i]);
            c.add(jb[i]);
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new q4();
    }
}