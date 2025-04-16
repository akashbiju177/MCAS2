import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener {
    TextField t1, t2, result;
    Button add, sub, mul, div;

    SimpleCalculator() {
        // Initialize text fields and buttons
        t1 = new TextField(10);
        t2 = new TextField(10);
        result = new TextField(20);
        result.setEditable(false);

        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");

        // Adding ActionListener to buttons
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        // Set layout
        setLayout(new FlowLayout());

        // Adding components to the frame
        add(new Label("Number 1:"));
        add(t1);
        add(new Label("Number 2:"));
        add(t2);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(new Label("Result:"));
        add(result);

        // Set the frame properties
        setSize(300, 200);
        setTitle("Simple Calculator");
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
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            double res = 0;

            // Perform operations based on the button clicked
            if (e.getSource() == add) res = num1 + num2;
            else if (e.getSource() == sub) res = num1 - num2;
            else if (e.getSource() == mul) res = num1 * num2;
            else if (e.getSource() == div) {
                if (num2 == 0) {
                    result.setText("Cannot divide by zero");
                    return;
                }
                res = num1 / num2;
            }

            // Display result
            result.setText(String.valueOf(res));

        } catch (NumberFormatException ex) {
            // Handle invalid input
            result.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
