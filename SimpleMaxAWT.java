import java.awt.*;
import java.awt.event.*;

public class SimpleMaxAWT extends Frame implements ActionListener {
    TextField t1 = new TextField(5);
    TextField t2 = new TextField(5);
    TextField t3 = new TextField(5);
    Label result = new Label();
    Button findMaxButton = new Button("Find Max");

    SimpleMaxAWT() {
        setLayout(new FlowLayout());

        add(new Label("Num1:"));
        add(t1);
        add(new Label("Num2:"));
        add(t2);
        add(new Label("Num3:"));
        add(t3);
        add(findMaxButton);
        add(result);

        // Add action listener to button
        findMaxButton.addActionListener(this);

        setSize(250, 150);
        setTitle("Max Finder");
        setVisible(true);

        // Window closing event listener
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            // Parse the input numbers
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = Integer.parseInt(t3.getText());

            // Find the maximum of the three numbers
            int max = Math.max(a, Math.max(b, c));

            // Display the result
            result.setText("Max is: " + max);

        } catch (NumberFormatException ex) {
            // Handle invalid input (non-numeric input)
            result.setText("Invalid input! Please enter numbers.");
        }
    }

    public static void main(String[] args) {
        new SimpleMaxAWT();
    }
}
