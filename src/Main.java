import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame=new JFrame("hello world");

        JLabel label = new JLabel("Label Text");
        frame.add(label);

        label.setBounds(100,50,100,60);

        JButton button=new JButton("Click me!");
        button.setBounds(100,100,100,60);
        frame.add(button);

        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}