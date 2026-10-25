import javax.swing.*;
import java.awt.*;

public class MapPanel extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.GRAY);
        g.fillRect(0, 150, 400, 30);
        g.fillRect(180, 0, 30, 350);

        g.setColor(Color.RED);
        g.fillOval(80, 100, 20, 20);
        g.fillOval(280, 220, 20, 20);

        g.setColor(Color.BLACK);
        g.drawString("College", 55, 95);
        g.drawString("Bus Stand", 270, 215);

        g.setColor(Color.BLUE);
        g.drawRect(10, 10, 370, 320);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Map Panel");
        MapPanel panel = new MapPanel();

        frame.add(panel);
        frame.setSize(420, 390);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
