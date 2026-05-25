import javax.swing.*;
import java.awt.*;

public class NOCApp extends JFrame {
    public NOCApp() {
        setTitle("NOC LPG Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(800, 600);
        setLocationRelativeTo(null);

        Image image = new ImageIcon("assets/unnamed.png").getImage();
        setIconImage(image);

        setVisible(true);
    }

    public static void main(String[] args) {
        new NOCApp();
    }

}
