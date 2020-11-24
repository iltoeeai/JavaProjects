import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener { //graphical user interface
//need to implement mehods ^

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    JButton button;



    public GUI(){

        frame = new JFrame();// frame - window. creating a new object - the window
        panel = new JPanel(); //layout
        button = new JButton("Click me");
        button.addActionListener(this);
        label = new JLabel("Number of clicks: 0");

        panel.setBorder(BorderFactory.createEmptyBorder(30, 60, 10, 80));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER); //add the panel to the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set what happens when they close the frame
        frame.setTitle("Our GUI");
        frame.pack(); //set the window to match the certain size
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) { //once the button is clicked the action is performed

        count++;
        label.setText("Number of clicks: 0" + count);
    }
}
