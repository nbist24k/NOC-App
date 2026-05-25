import javax.swing.*;

public class NOCApp extends JFrame {
    public NOCApp() {
        setTitle("NOC LPG Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NOCApp();
    }

}
