import java.awt.*;
import java.awt.event.*;

public class MathematicalShapes extends Frame {

    MathematicalShapes() {
        setTitle("Mathematical Shapes");
        setSize(500, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void paint(Graphics g) {
        g.drawLine(50, 80, 200, 80);
        g.drawString("Line", 100, 65);

        g.drawRect(50, 120, 120, 70);
        g.drawString("Rectangle", 75, 210);

        g.drawOval(220, 120, 140, 70);
        g.drawString("Oval", 275, 210);

        g.drawOval(100, 240, 80, 80);
        g.drawString("Circle", 120, 340);
    }

    public static void main(String[] args) {
        new MathematicalShapes();
    }
}
