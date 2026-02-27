package BasicJFrame;

import javax.swing.*;

public class Main {

    static void main(String[] args) {
        ImageIcon image = new ImageIcon("BasicJFrame/cat1.PNG");
        JFrame frame = new JFrame();
        frame.setTitle("My App");
        frame.setIconImage(image.getImage());

        //Exits out of App after close button is pressed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true); // Make frame visible

        frame.setSize(420,420);
    }
}
