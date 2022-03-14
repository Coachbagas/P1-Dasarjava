import javax.swing.*;

public class R_InputDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println("my name is" + name);
        System.exit(0);
    }
}
