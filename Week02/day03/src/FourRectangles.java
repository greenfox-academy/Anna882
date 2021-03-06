import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        //String[] colors = {"red", "blue", "green", "yellow"};
        for (int i = 0; i < 4; i++) {
            int x = (int) (Math.random() * (WIDTH - 2) + 1);
            int y = (int) (Math.random() * (HEIGHT -2) + 1);
            int width = (int) (Math.random() * (WIDTH - x));
            int height = (int) (Math.random() * (WIDTH - y));
            int red = (int) (Math.random() * 256);
            int green = (int) (Math.random() * 256);
            int blue = (int) (Math.random() * 256);
            Color inputColor = new Color(red, green, blue);
            drawRectangle(x, y, width, height, inputColor,  graphics);
        }
    }

    public static void drawRectangle(int x, int y, int width, int height, Color inputColor, Graphics graphics) {
        graphics.setColor(inputColor);
        graphics.drawRect(x, y, width, height);
    }
    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}