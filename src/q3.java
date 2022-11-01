import javax.swing.*;
import java.awt.*;

public class q3 extends JFrame {
    q3(){
        setTitle("Ten Color Buttons Frame");
        setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new GridLayout(1,10));

        for(int i=0 ; i<10 ; i++){
            c.add(new JButton(i + ""));
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new q3();
    }
}
