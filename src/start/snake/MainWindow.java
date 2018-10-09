package start.snake;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private static final int POS_X = 600;
    private static final int POS_Y = 200;
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    public MainWindow(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Snake");
        setBackground(Color.PINK);
        setVisible(true);

    }



//    private void setBackground() {
//        Color bgColor = new Color(144, 23, 255);
//
//    }


    public static void main(String[] args) {
      new MainWindow();
    }
}

