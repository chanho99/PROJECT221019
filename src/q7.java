import javax.swing.*;
import java.awt.*;

public class q7 extends JFrame {
    q7(){
        setTitle("계산기 프레임");
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c=getContentPane();
        c.setLayout(new BorderLayout());

        JPanel top=new JPanel();
        top.setLayout(new FlowLayout());
        top.setBackground(Color.LIGHT_GRAY);
        top.add(new JLabel("수식입력"));
        top.add(new JTextField(" ",20));

        c.add(top,BorderLayout.NORTH);

        JPanel center=new JPanel();
        center.setLayout(new GridLayout(4,4,5,5));
        JButton btn[]=new JButton[16];
        String name[]= {"0","1","2","3","4","5","6","7","8","9","CE","계산","+","-","x","/"};

        for(int i=0;i<16;i++) {
            btn[i]=new JButton(name[i]);
            if(i>=12) {
                btn[i].setBackground(Color.CYAN);
            }
            center.add(btn[i]);
        }

        c.add(center,BorderLayout.CENTER);

        JPanel bottom=new JPanel();
        bottom.setLayout(new FlowLayout());
        bottom.setBackground(Color.YELLOW);
        bottom.add(new JLabel("계산 결과"));
        bottom.add(new JTextField(" ",20));
        c.add(bottom,BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args){
        new q7();
    }
}
