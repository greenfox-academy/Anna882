import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {

    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        int countOfStars = 27;

        for (int i = 0; i <= countOfStars; i++) {
            int x = (int) (Math.random() * (WIDTH - 2) + 1);
            int y = (int) (Math.random() * (HEIGHT -2) + 1);
            int red = (int) (Math.random() * 256);
            int green = (int) (Math.random() * 256);
            int blue = (int) (Math.random() * 256);
            Color starColor = new Color(red, green, blue);

            graphics.setColor(starColor);
            graphics.fillRect(x, y, 5, 5);
        }

    }














    // Don't touch the code below
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

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
                super.paintComponent(graphics);
                this.setBackground(Color.BLACK);
            mainDraw(graphics);
        }
    }
}