import javax.swing.*;
import java.awt.*;

public class q2 extends JFrame {
    q2(){
        setTitle("BorderLayout Practice");
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout (new BorderLayout(5,7));

        c.add(new JButton("North"), BorderLayout.NORTH);
        c.add(new JButton("East"), BorderLayout.EAST);
        c.add(new JButton("West"), BorderLayout.WEST);
        c.add(new JButton("South"), BorderLayout.SOUTH);
        c.add(new JButton("Center"), BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new q2();
    }
}
