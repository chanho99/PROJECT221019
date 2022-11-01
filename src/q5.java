import javax.swing.*;
import java.awt.*;

public class q5 extends JFrame {
    public q5() {
        setTitle("4x4 Color Frame");
        setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new GridLayout(4, 4));

        Color color[] = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.PINK, Color.GRAY, Color.LIGHT_GRAY, Color.DARK_GRAY, Color.MAGENTA, Color.BLACK, Color.WHITE, Color.RED, Color.BLUE, Color.GREEN};

        for (int i = 0; i < 16; i++) {
            JLabel jl = new JLabel(Integer.toString(i));
            jl.setBackground(color[i]);
            jl.setOpaque(true);
            c.add(jl);
        }

        setVisible(true);
    }

    public static void main(String[] args){
        new q5();
    }
}
