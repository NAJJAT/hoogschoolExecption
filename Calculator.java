import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private JTextField display;
    private JButton[] numberButtons;
    private JButton[] operatorButtons;
    private JButton equalsButton, clearButton;
    private JPanel panel;

    private String currentInput;
    private double currentResult;
    private int currentOperator;

    private static final int ADDITION = 0;
    private static final int SUBTRACTION = 1;
    private static final int MULTIPLICATION = 2;
    private static final int DIVISION = 3;

    public Calculator() {
        this.setTitle("Calculator");
        this.setSize(700, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        display = new JTextField();
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }

        operatorButtons = new JButton[4];
        operatorButtons[ADDITION] = new JButton("+");
        operatorButtons[SUBTRACTION] = new JButton("-");
        operatorButtons[MULTIPLICATION] = new JButton("*");
        operatorButtons[DIVISION] = new JButton("/");
        for (JButton button : operatorButtons) {
            button.addActionListener(this);
        }

        equalsButton = new JButton("=");
        equalsButton.addActionListener(this);

        clearButton = new JButton("C");
        clearButton.addActionListener(this);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.add(clearButton);
        for (JButton button : numberButtons) {
            panel.add(button);
        }
        panel.add(operatorButtons[ADDITION]);
        panel.add(operatorButtons[SUBTRACTION]);
        panel.add(operatorButtons[MULTIPLICATION]);
        panel.add(operatorButtons[DIVISION]);
        panel.add(equalsButton);

        this.setLayout(new BorderLayout());
        this.add(display, BorderLayout.NORTH);
        this.add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                currentInput = display.getText() + i;
                display.setText(currentInput);
            }
        }

        if (e.getSource() == clearButton) {
            currentInput = "";
            display.setText("");
            currentResult = 0;
            currentOperator = -1;
        }

        for (int i = 0; i < 4; i++) {
            if (e.getSource() == operatorButtons[i]) {
                performOperation();
                currentOperator = i;
            }
        }

        if (e.getSource() == equalsButton) {
            performOperation();
            currentOperator = -1;
        }
    }

    private void performOperation() {
        if (!currentInput.isEmpty()) {
            double input = Double.parseDouble(currentInput);
            switch (currentOperator) {
                case ADDITION:
                    currentResult += input;
                    break;
                case SUBTRACTION:
                    currentResult -= input;
                    break;
                case MULTIPLICATION:
                    currentResult *= input;
                    break;
                case DIVISION:
                    if (input != 0) {
                        currentResult /= input;
                    } else {
                        currentResult = Double.NaN; // Indicate division by zero
                    }
                    break;
                default:
                    currentResult = input;
                    break;
            }
            display.setText(String.valueOf(currentResult));
            currentInput = "";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
        });
    }
}
