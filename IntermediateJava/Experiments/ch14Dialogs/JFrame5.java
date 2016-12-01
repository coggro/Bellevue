import javax.swing.*;
import java.awt.*;

public class JFrame5 
{

    public static void main(String[] args)
    {
    
        final int FRAME_WIDTH = 250;
        final int FRAME_HEIGHT = 100;
        JFrame aFrame = new JFrame("Fifth Frame");
        aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        aFrame.setVisible(true);
        JLabel greeting = new JLabel("Hello");
        JLabel greeting2 = new JLabel("Who are you?");
        aFrame.add(greeting);
        aFrame.add(greeting2);
       ://m.imgur.com/a/Bx52L
        aFrame.invalidate();
        aFrame.validate();
        aFrame.repaint();
        greeting.setFont(headlineFont);
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
