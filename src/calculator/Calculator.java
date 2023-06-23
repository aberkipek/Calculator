package calculator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Stack;

/**
 * This program implements the basic functionalities of a calculator application with user interface
 *
 * @author    Abdullah Berk İpek
 * @version   1.0
 * @since     2022-08-11
 */

public class Calculator extends JFrame {
    private JFrame errorFrame;
    private JPanel errorPanel;
    private JTextField errorMessage;
    private JPanel mainPanel;
    private JPanel buttonPanel1;
    private JPanel buttonPanel2;
    private JPanel mainButtonPanel;
    private JPanel displayPanel;
    private JTextField display;
    private JButton button0;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JButton calculateButton;
    private JButton piButton;
    private JButton eButton;
    private JButton lnButton;
    private JButton logButton;
    private JButton sqrtButton;
    private JButton squareButton;
    private JButton absValButton;
    private JButton percentButton;
    private JButton pointButton;
    private JButton signButton;
    private JButton parenthesisButton;
    private JButton deleteButton;
    private JButton resetButton;
    private static int countDots = 0;
    private static int countParenthesis = 0;
    private int calculateButtonClickCounter = 0;
    private final int FRAME_WIDTH = 375;
    private final int FRAME_HEIGHT = 675;

    public Calculator() {
        createDisplay();
        createButton();
        createFunctionalButton();
        createPanel();
        addButton();
        addPanel();
        createFrame();
    }

    private void createButton() {
        button0 = new JButton("0");
        button0.setBackground(Color.LIGHT_GRAY);
        button0.setFont(new Font("Arial",Font.BOLD,35));
        button0.setFocusable(false);
        button1 = new JButton("1");
        button1.setBackground(Color.LIGHT_GRAY);
        button1.setFont(new Font("Arial",Font.BOLD,35));
        button1.setFocusable(false);
        button2 = new JButton("2");
        button2.setBackground(Color.LIGHT_GRAY);
        button2.setFont(new Font("Arial",Font.BOLD,35));
        button2.setFocusable(false);
        button3 = new JButton("3");
        button3.setBackground(Color.LIGHT_GRAY);
        button3.setFont(new Font("Arial",Font.BOLD,35));
        button3.setFocusable(false);
        button4 = new JButton("4");
        button4.setBackground(Color.LIGHT_GRAY);
        button4.setFont(new Font("Arial",Font.BOLD,35));
        button4.setFocusable(false);
        button5 = new JButton("5");
        button5.setBackground(Color.LIGHT_GRAY);
        button5.setFont(new Font("Arial",Font.BOLD,35));
        button5.setFocusable(false);
        button6 = new JButton("6");
        button6.setBackground(Color.LIGHT_GRAY);
        button6.setFont(new Font("Arial",Font.BOLD,35));
        button6.setFocusable(false);
        button7 = new JButton("7");
        button7.setBackground(Color.LIGHT_GRAY);
        button7.setFont(new Font("Arial",Font.BOLD,35));
        button7.setFocusable(false);
        button8 = new JButton("8");
        button8.setBackground(Color.LIGHT_GRAY);
        button8.setFont(new Font("Arial",Font.BOLD,35));
        button8.setFocusable(false);
        button9 = new JButton("9");
        button9.setBackground(Color.LIGHT_GRAY);
        button9.setFont(new Font("Arial",Font.BOLD,35));
        button9.setFocusable(false);
        addButton = new JButton("+");
        addButton.setBackground(Color.BLACK);
        addButton.setForeground(Color.WHITE);
        addButton.setFont(new Font("Arial",Font.BOLD,25));
        addButton.setFocusable(false);
        subtractButton = new JButton("-");
        subtractButton.setBackground(Color.BLACK);
        subtractButton.setForeground(Color.WHITE);
        subtractButton.setFont(new Font("Arial",Font.BOLD,25));
        subtractButton.setFocusable(false);
        multiplyButton = new JButton("×");
        multiplyButton.setBackground(Color.BLACK);
        multiplyButton.setForeground(Color.WHITE);
        multiplyButton.setFont(new Font("Arial",Font.BOLD,25));
        multiplyButton.setFocusable(false);
        divideButton = new JButton("÷");
        divideButton.setBackground(Color.BLACK);
        divideButton.setForeground(Color.WHITE);
        divideButton.setFont(new Font("Arial",Font.BOLD,25));
        divideButton.setFocusable(false);
        calculateButton= new JButton("=");
        calculateButton.setBackground(Color.BLACK);
        calculateButton.setForeground(Color.WHITE);
        calculateButton.setFont(new Font("Arial",Font.BOLD,25));
        calculateButton.setFocusable(false);
        piButton = new JButton("π");
        piButton.setBackground(Color.DARK_GRAY);
        piButton.setForeground(Color.WHITE);
        piButton.setFont(new Font("Elegant",Font.BOLD,25));
        piButton.setFocusable(false);
        eButton = new JButton("e");
        eButton.setBackground(Color.DARK_GRAY);
        eButton.setForeground(Color.WHITE);
        eButton.setFont(new Font("Arial",Font.BOLD,25));
        eButton.setFocusable(false);
        lnButton = new JButton("ln");
        lnButton.setBackground(Color.DARK_GRAY);
        lnButton.setForeground(Color.WHITE);
        lnButton.setFont(new Font("Arial",Font.BOLD,25));
        lnButton.setFocusable(false);
        logButton = new JButton("log");
        logButton.setBackground(Color.DARK_GRAY);
        logButton.setForeground(Color.WHITE);
        logButton.setFont(new Font("Arial",Font.BOLD,25));
        logButton.setFocusable(false);
        sqrtButton = new JButton("√x");//√sqrt(x)");
        sqrtButton.setBackground(Color.DARK_GRAY);
        sqrtButton.setForeground(Color.WHITE);
        sqrtButton.setFont(new Font("Arial",Font.BOLD,25));
        sqrtButton.setFocusable(false);
        squareButton = new JButton("x²");
        squareButton.setBackground(Color.DARK_GRAY);
        squareButton.setForeground(Color.WHITE);
        squareButton.setFont(new Font("Arial",Font.BOLD,25));
        squareButton.setFocusable(false);
        absValButton = new JButton("|x|");
        absValButton.setBackground(Color.DARK_GRAY);
        absValButton.setForeground(Color.WHITE);
        absValButton.setFont(new Font("Arial",Font.BOLD,25));
        absValButton.setFocusable(false);
        percentButton = new JButton("%");
        percentButton.setBackground(Color.LIGHT_GRAY);
        percentButton.setForeground(Color.BLACK);
        percentButton.setFont(new Font("Arial",Font.PLAIN,25));
        percentButton.setFocusable(false);
        pointButton = new JButton(".");
        pointButton.setBackground(Color.BLACK);
        pointButton.setForeground(Color.WHITE);
        pointButton.setFont(new Font("Arial",Font.BOLD,25));
        pointButton.setFocusable(false);
        signButton = new JButton("+/-");
        signButton.setBackground(Color.BLACK);
        signButton.setForeground(Color.WHITE);
        signButton.setFont(new Font("Arial",Font.BOLD,25));
        signButton.setFocusable(false);
        parenthesisButton = new JButton("( )");
        parenthesisButton.setBackground(Color.LIGHT_GRAY);
        parenthesisButton.setForeground(Color.BLACK);
        parenthesisButton.setFont(new Font("Arial",Font.PLAIN,25));
        parenthesisButton.setFocusable(false);
        deleteButton = new JButton("⌫");
        deleteButton.setBackground(Color.LIGHT_GRAY);
        deleteButton.setForeground(Color.BLACK);
        deleteButton.setFont(new Font("Elegant",Font.BOLD,25));
        deleteButton.setFocusable(false);
        resetButton = new JButton("C");
        resetButton.setFont(new Font("Arial",Font.PLAIN,25));
        resetButton.setForeground(Color.BLACK);
        resetButton.setBackground(Color.LIGHT_GRAY);
        resetButton.setFocusable(false);
    }

    private void createPanel() {
        mainPanel = new JPanel(new BorderLayout());
        mainButtonPanel = new JPanel(new BorderLayout());
        buttonPanel1 = new JPanel(new GridLayout(6,4));
        buttonPanel2 = new JPanel(new GridLayout(1,4));
        displayPanel = new JPanel(new GridLayout(1,1));
        displayPanel.add(display);
    }

    private void createFunctionalButton() {
        ActionListener cl0 = new Button0();
        button0.addActionListener(cl0);
        ActionListener cl1 = new Button1();
        button1.addActionListener(cl1);
        ActionListener cl2 = new Button2();
        button2.addActionListener(cl2);
        ActionListener cl3 = new Button3();
        button3.addActionListener(cl3);
        ActionListener cl4 = new Button4();
        button4.addActionListener(cl4);
        ActionListener cl5 = new Button5();
        button5.addActionListener(cl5);
        ActionListener cl6 = new Button6();
        button6.addActionListener(cl6);
        ActionListener cl7 = new Button7();
        button7.addActionListener(cl7);
        ActionListener cl8 = new Button8();
        button8.addActionListener(cl8);
        ActionListener cl9 = new Button9();
        button9.addActionListener(cl9);
        ActionListener cl10 = new PointButton();
        pointButton.addActionListener(cl10);
        ActionListener cl11 = new ResetButton();
        resetButton.addActionListener(cl11);
        ActionListener cl12 = new PercentButton();
        percentButton.addActionListener(cl12);
        ActionListener cl13 = new DeleteButton();
        deleteButton.addActionListener(cl13);
        ActionListener cl14 = new ParenthesisButton();
        parenthesisButton.addActionListener(cl14);
        ActionListener cl15 = new SignButton();
        signButton.addActionListener(cl15);
        ActionListener cl16 = new AdditionButton();
        addButton.addActionListener(cl16);
        ActionListener cl17 = new SubtractionButton();
        subtractButton.addActionListener(cl17);
        ActionListener cl18 = new MultiplicationButton();
        multiplyButton.addActionListener(cl18);
        ActionListener cl19 = new DivisionButton();
        divideButton.addActionListener(cl19);
        ActionListener cl20 = new CalculateButton();
        calculateButton.addActionListener(cl20);
        ActionListener cl21 = new PiButton();
        piButton.addActionListener(cl21);
        ActionListener cl22 = new AbsValButton();
        absValButton.addActionListener(cl22);
        ActionListener cl23 = new EButton();
        eButton.addActionListener(cl23);
        ActionListener cl24 = new SqrtButton();
        sqrtButton.addActionListener(cl24);
        ActionListener cl25 = new SquareButton();
        squareButton.addActionListener(cl25);
        ActionListener cl26 = new LogButton();
        logButton.addActionListener(cl26);
        ActionListener cl27 = new LnButton();
        lnButton.addActionListener(cl27);
    }

    private void addButton() {
        buttonPanel1.add(squareButton);
        buttonPanel1.add(sqrtButton);
        buttonPanel1.add(absValButton);
        buttonPanel1.add(piButton);
        buttonPanel1.add(eButton);
        buttonPanel1.add(lnButton);
        buttonPanel1.add(logButton);
        buttonPanel1.add(divideButton);
        buttonPanel1.add(button7);
        buttonPanel1.add(button8);
        buttonPanel1.add(button9);
        buttonPanel1.add(multiplyButton);
        buttonPanel1.add(button4);
        buttonPanel1.add(button5);
        buttonPanel1.add(button6);
        buttonPanel1.add(subtractButton);
        buttonPanel1.add(button1);
        buttonPanel1.add(button2);
        buttonPanel1.add(button3);
        buttonPanel1.add(addButton);
        buttonPanel1.add(signButton);
        buttonPanel1.add(button0);
        buttonPanel1.add(pointButton);
        buttonPanel1.add(calculateButton);
        buttonPanel2.add(resetButton);
        buttonPanel2.add(parenthesisButton);
        buttonPanel2.add(percentButton);
        buttonPanel2.add(deleteButton);
    }

    private void addPanel() {
        mainButtonPanel.add(buttonPanel1, BorderLayout.CENTER);
        mainButtonPanel.add(buttonPanel2, BorderLayout.NORTH);
        mainPanel.add(displayPanel, BorderLayout.NORTH);
        mainPanel.add(mainButtonPanel, BorderLayout.CENTER);
    }

    private void createDisplay() {
        display = new JTextField(50);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        display.setFont(new Font("Arial",Font.BOLD,50));
        display.setForeground(Color.WHITE);
        display.setBackground(Color.BLACK);
    }

    private void createErrorMessage() {
        errorPanel = new JPanel();
        errorPanel.setLayout(new GridLayout(1,1));
        errorMessage = new JTextField(10);
        errorMessage.setText("Invalid format used!");
        errorMessage.setFont(new Font("Arial",Font.BOLD,15));
        errorMessage.setForeground(Color.WHITE);
        errorMessage.setBackground(Color.DARK_GRAY);
        errorMessage.setHorizontalAlignment(JTextField.CENTER);
        errorMessage.setEditable(false);
        errorPanel.add(errorMessage);
        errorFrame = new JFrame();
        errorFrame.setSize(250,100);
        errorFrame.setLocationRelativeTo(null);
        errorFrame.setTitle("Error");
        errorFrame.add(errorPanel);
        errorFrame.setResizable(false);
        errorFrame.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        reset();
    }

    private void createFrame() {
        add(mainPanel);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocationRelativeTo(null);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    class Button0 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(calculateButtonClickCounter == 1) {
                calculateButtonClickCounter = 0;
                display.setText("0");
            }
            else {
                if (display.getText().length() == 0)
                    display.setText("0");

                else if (countDots == 1)
                    display.setText(display.getText() + "0");

                else if (countDots == 0) {

                    if (display.getText().charAt(display.getText().length() - 1) != '0')
                        display.setText(display.getText() + "0");

                    else if (display.getText().length() > 1 && display.getText().charAt(display.getText().length() - 1) != '+') {
                        if(display.getText().charAt(display.getText().length() - 1) != '+')
                            display.setText(display.getText() + "0");
                    }
                }
            }
        }
    }

    class Button1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(calculateButtonClickCounter == 1) {
                calculateButtonClickCounter = 0;
                display.setText("1");
            }

            else {
                if (countDots == 1)
                    display.setText(display.getText() + "1");

                if (countDots == 0) {
                    if (display.getText().length() != 0) {

                        if (display.getText().charAt(display.getText().length() - 1) != '0')
                            display.setText(display.getText() + "1");

                        else if (!display.getText().equals("0"))
                            display.setText(display.getText() + "1");

                        else
                            display.setText("1");
                    }
                    else
                        display.setText(display.getText() + "1");
                }
            }
        }
    }

    class Button2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(calculateButtonClickCounter == 1) {
                calculateButtonClickCounter = 0;
                display.setText("2");
            }
            else {
                if (countDots == 1)
                    display.setText(display.getText() + "2");

                if (countDots == 0) {
                    if (display.getText().length() != 0) {

                        if (display.getText().charAt(display.getText().length() - 1) != '0')
                            display.setText(display.getText() + "2");

                        else if (!display.getText().equals("0"))
                            display.setText(display.getText() + "2");

                        else
                            display.setText("2");
                    }
                    else
                        display.setText(display.getText() + "2");
                }
            }
        }
    }

    class Button3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(calculateButtonClickCounter == 1) {
                calculateButtonClickCounter = 0;
                display.setText("3");
            }
            else {
                if (countDots == 1)
                    display.setText(display.getText() + "3");

                if (countDots == 0) {
                    if (display.getText().length() != 0) {

                        if (display.getText().charAt(display.getText().length() - 1) != '0')
                            display.setText(display.getText() + "3");

                        else if (!display.getText().equals("0"))
                            display.setText(display.getText() + "3");

                        else
                            display.setText("3");
                    }
                    else
                        display.setText(display.getText() + "3");
                }
            }
        }
    }

    class Button4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(calculateButtonClickCounter == 1) {
                calculateButtonClickCounter = 0;
                display.setText("4");
            }
            else {
                if (countDots == 1)
                    display.setText(display.getText() + "4");

                if (countDots == 0) {
                    if (display.getText().length() != 0) {

                        if (display.getText().charAt(display.getText().length() - 1) != '0')
                            display.setText(display.getText() + "4");

                        else if (!display.getText().equals("0"))
                            display.setText(display.getText() + "4");

                        else
                            display.setText("4");
                    }
                    else
                        display.setText(display.getText() + "4");
                }
            }
        }
    }

    class Button5 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(calculateButtonClickCounter == 1) {
                calculateButtonClickCounter = 0;
                display.setText("5");
            }
            else {
                if (countDots == 1)
                    display.setText(display.getText() + "5");

                if (countDots == 0) {
                    if (display.getText().length() != 0) {

                        if (display.getText().charAt(display.getText().length() - 1) != '0')
                            display.setText(display.getText() + "5");

                        else if (!display.getText().equals("0"))
                            display.setText(display.getText() + "5");

                        else
                            display.setText("5");
                    }
                    else
                        display.setText(display.getText() + "5");
                }
            }
        }
    }

    class Button6 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(calculateButtonClickCounter == 1) {
                calculateButtonClickCounter = 0;
                display.setText("6");
            }
            else {
                if (countDots == 1)
                    display.setText(display.getText() + "6");

                if (countDots == 0) {
                    if (display.getText().length() != 0) {

                        if (display.getText().charAt(display.getText().length() - 1) != '0')
                            display.setText(display.getText() + "6");

                        else if (!display.getText().equals("0"))
                            display.setText(display.getText() + "6");

                        else
                            display.setText("6");
                    }
                    else
                        display.setText(display.getText() + "6");
                }
            }
        }
    }

    class Button7 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(calculateButtonClickCounter == 1) {
                calculateButtonClickCounter = 0;
                display.setText("7");
            }

            else {
                if (countDots == 1)
                    display.setText(display.getText() + "7");

                if (countDots == 0) {
                    if (display.getText().length() != 0) {

                        if (display.getText().charAt(display.getText().length() - 1) != '0')
                            display.setText(display.getText() + "7");

                        else if (!display.getText().equals("0"))
                            display.setText(display.getText() + "7");

                        else
                            display.setText("7");
                    }
                    else
                        display.setText(display.getText() + "7");
                }
            }
        }
    }

    class Button8 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(calculateButtonClickCounter == 1) {
                calculateButtonClickCounter = 0;
                display.setText("8");
            }
            else {
                if (countDots == 1)
                    display.setText(display.getText() + "8");

                if (countDots == 0) {
                    if (display.getText().length() != 0) {

                        if (display.getText().charAt(display.getText().length() - 1) != '0')
                            display.setText(display.getText() + "8");

                        else if (!display.getText().equals("0"))
                            display.setText(display.getText() + "8");

                        else
                            display.setText("8");
                    }
                    else
                        display.setText(display.getText() + "8");
                }
            }
        }
    }

    class Button9 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (calculateButtonClickCounter == 1) {
                calculateButtonClickCounter--;
                display.setText("9");
            }
            else {
                if (countDots == 1)
                    display.setText(display.getText() + "9");

                else if (countDots == 0) {
                    if (display.getText().length() != 0) {

                        if (display.getText().charAt(display.getText().length() - 1) != '0')
                            display.setText(display.getText() + "9");

                        else if (!display.getText().equals("0"))
                            display.setText(display.getText() + "9");

                        else
                            display.setText("9");
                    } else
                        display.setText(display.getText() + "9");
                }
            }
        }
    }

    class AdditionButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            calculateButtonClickCounter = 0;
            countDots = 0;
            if(display.getText().equals("")) {
                createErrorMessage();
            }
            else if(display.getText().charAt(display.getText().length()-1) == '.') {
                display.setText(display.getText() + "0+");
            }
            else if(display.getText().charAt(display.getText().length()-1) == '-') {
                display.setText(display.getText().substring(0, display.getText().length() - 1) + "+");
            }
            else if(display.getText().charAt(display.getText().length()-1) == '×') {
                display.setText(display.getText().substring(0, display.getText().length() - 1) + "+");
            }
            else if(display.getText().charAt(display.getText().length()-1) == '÷') {
                display.setText(display.getText().substring(0, display.getText().length() - 1) + "+");
            }
            else {
                if(display.getText().charAt(display.getText().length()-1) != '+')
                    display.setText(display.getText() + "+");
            }
        }
    }

    class SubtractionButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            calculateButtonClickCounter = 0;
            countDots = 0;
            if(display.getText().equals("")) {
                createErrorMessage();
            }
            else if(display.getText().charAt(display.getText().length()-1) == '.') {
                display.setText(display.getText() + "0-");
            }
            else if(display.getText().charAt(display.getText().length()-1) == '+') {
                display.setText(display.getText().substring(0, display.getText().length() - 1) + "-");
            }
            else if(display.getText().charAt(display.getText().length()-1) == '×') {
                display.setText(display.getText().substring(0, display.getText().length() - 1) + "-");
            }
            else if(display.getText().charAt(display.getText().length()-1) == '÷') {
                display.setText(display.getText().substring(0, display.getText().length() - 1) + "-");
            }
            else {
                if(display.getText().charAt(display.getText().length()-1) != '-')
                    display.setText(display.getText() + "-");
            }
        }
    }

    class MultiplicationButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            calculateButtonClickCounter = 0;
            countDots = 0;
            if(display.getText().equals("")) {
                createErrorMessage();
            }
            else if(display.getText().charAt(display.getText().length()-1) == '.') {
                display.setText(display.getText() + "0×");
            }
            else if(display.getText().charAt(display.getText().length()-1) == '-') {
                display.setText(display.getText().substring(0, display.getText().length() - 1) + "×");
            }
            else if(display.getText().charAt(display.getText().length()-1) == '÷') {
                display.setText(display.getText().substring(0, display.getText().length() - 1) + "×");
            }
            else if(display.getText().charAt(display.getText().length()-1) == '+') {
                display.setText(display.getText().substring(0, display.getText().length() - 1) + "×");
            }
            else {
                if(display.getText().charAt(display.getText().length()-1) != '×')
                    display.setText(display.getText() + "×");
            }
        }
    }

    class DivisionButton implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
            calculateButtonClickCounter = 0;
            countDots = 0;
            if(display.getText().equals("")) {
                createErrorMessage();
            }
            else if(display.getText().charAt(display.getText().length()-1) == '.') {
                display.setText(display.getText() + "0÷");
            }
            else if(display.getText().charAt(display.getText().length()-1) == '-') {
                display.setText(display.getText().substring(0, display.getText().length() - 1) + "÷");
            }
            else if(display.getText().charAt(display.getText().length()-1) == '×') {
                display.setText(display.getText().substring(0, display.getText().length() - 1) + "÷");
            }
            else if(display.getText().charAt(display.getText().length()-1) == '+') {
                display.setText(display.getText().substring(0, display.getText().length() - 1) + "÷");
            }
            else {
                if(display.getText().charAt(display.getText().length()-1) != '÷')
                    display.setText(display.getText() + "÷");
            }
        }
    }

    private int findPriority(char operator) {
        if (operator == '+' || operator == '-')
            return 0;

        else if (operator == '×' || operator == '÷')
            return 1;

        else
            return -1;
    }

    private String performOperation(double operand_1, double operand_2, char operator) {
        if(operator == '+')
            return Double.toString(operand_1 + operand_2);

        else if(operator == '-')
            return Double.toString(operand_1 - operand_2);

        else if(operator == '×')
            return Double.toString(operand_1 * operand_2);

        else{
            if(operand_2 != 0)
                return Double.toString(operand_1 / operand_2);

            else {
                createErrorMessage();
                return "";
            }
        }
    }

    private String calculate() {
        Stack<Double> operandsStack = new Stack<>();
        Stack<Character> operatorsStack = new Stack<>();
        String expression = display.getText();

        if (countParenthesis != 0) {
            for (int i = 0; i < countParenthesis; i++) {
                expression += ")";
            }
        }
        String sNum = "";
        double num;
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (Character.isDigit(ch) ||ch == '.') {
                sNum += ch;
                if (i == expression.length() - 1 || expression.charAt(i + 1) == '+' || expression.charAt(i + 1) == '-' || expression.charAt(i + 1) == '×' || expression.charAt(i + 1) == '÷' || expression.charAt(i + 1) == '(' || expression.charAt(i + 1) == ')') {
                    num = Double.parseDouble(sNum);
                    operandsStack.push(num);
                    num = 0;
                    sNum = "";
                }
            }

            else if (ch == '(')
                operatorsStack.push(ch);

            else if (ch == ')') {
                while (!operatorsStack.isEmpty() && operatorsStack.peek() != '(') {
                    double operand_2 = operandsStack.pop();
                    double operand_1 = operandsStack.pop();
                    char operator = operatorsStack.pop();
                    String result = performOperation(operand_1, operand_2, operator);
                    operandsStack.push(Double.parseDouble(result));
                }
                operatorsStack.pop();
            }
            else if (ch == '+' || ch == '-' || ch == '×' || ch == '÷') {
                while (!operatorsStack.isEmpty() && findPriority(ch) <= findPriority(operatorsStack.peek())) {
                    double operand_2 = operandsStack.pop();
                    double operand_1 = operandsStack.pop();
                    char operator = operatorsStack.pop();
                    String result = performOperation(operand_1, operand_2, operator);
                    operandsStack.push(Double.parseDouble(result));
                }
                operatorsStack.push(ch);
            }
        }
        while (!operatorsStack.isEmpty()) {
            double operand_2 = operandsStack.pop();
            double operand_1 = operandsStack.pop();
            char operator = operatorsStack.pop();
            String result = performOperation(operand_1, operand_2, operator);
            operandsStack.push(Double.parseDouble(result));
        }
        reset();
        return Double.toString(operandsStack.pop());
    }

    class CalculateButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(!display.getText().equals("")) {
                if(calculateButtonClickCounter == 0) {
                    calculateButtonClickCounter++;
                    String sNum = calculate();
                    String[] arr = sNum.split("\\.");
                    if(arr[1].equals("0"))
                        display.setText(arr[0]);

                    else
                        display.setText(sNum);
                }
            }
        }
    }

    class PointButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            calculateButtonClickCounter = 0;

            if(display.getText().equals("")) {
                display.setText(display.getText() + "0.");
                countDots++;
            }
            if(countDots == 0) {
                if(display.getText().charAt(display.getText().length()-1) == '+') {
                    display.setText(display.getText() + "0.");
                    countDots++;
                }
                else if(display.getText().charAt(display.getText().length()-1) == '-') {
                    display.setText(display.getText() + "0.");
                    countDots++;
                }
                else if(display.getText().charAt(display.getText().length()-1) == '×') {
                    display.setText(display.getText() + "0.");
                    countDots++;
                }
                else if(display.getText().charAt(display.getText().length()-1) == '÷') {
                    display.setText(display.getText() + "0.");
                    countDots++;
                }
                else {
                    display.setText(display.getText() + ".");
                    countDots++;
                }
            }
        }
    }

    class AbsValButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String sNum = display.getText();
            if(sNum.equals(""))
                createErrorMessage();

            else {
                countDots = 0;
                double num = Double.parseDouble(sNum);
                if (sNum.charAt(sNum.length() - 1) == '.') {
                    if (num < 0) {
                        num *= -1;
                        sNum = Double.toString(num);
                        String[] arr = sNum.split("\\.");

                        if (arr[1].equals("0"))
                            display.setText(arr[0]);

                        else
                            display.setText(sNum);
                    }
                    else
                        display.setText(sNum.substring(0, sNum.length() - 1));
                }
                else {
                    if (num < 0) {
                        num *= -1;
                        sNum = Double.toString(num);
                        String[] arr = sNum.split("\\.");

                        if (arr[1].equals("0"))
                            display.setText(arr[0]);

                        else
                            display.setText(sNum);
                    }
                    else
                        display.setText(sNum);
                }
            }
        }
    }

    class DeleteButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            calculateButtonClickCounter = 0;
            if(!display.getText().isEmpty()) {
                if(display.getText().charAt(display.getText().length() - 1) == '.') {
                    display.setText(display.getText().substring(0,display.getText().length() - 1));
                    countDots = 0;
                }
                else if(display.getText().charAt(display.getText().length() - 1) == '(') {
                    display.setText(display.getText().substring(0,display.getText().length() - 1));
                    countParenthesis--;
                }
                else if(display.getText().charAt(display.getText().length()-1) == ')') {
                    display.setText(display.getText().substring(0,display.getText().length() - 1));
                    countParenthesis++;
                }

                else
                    display.setText(display.getText().substring(0,display.getText().length() - 1));
            }
        }
    }

    class ParenthesisButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            calculateButtonClickCounter = 0;
            if(!display.getText().isEmpty() && countParenthesis == 0) {
                if(display.getText().charAt(display.getText().length() - 1) == '.') {
                    display.setText(display.getText() + "0×(");
                    countParenthesis++;
                }
                else {
                    display.setText(display.getText() + "×(");
                    countParenthesis++;
                }
            }
            else if(display.getText().isEmpty() && countParenthesis == 0) {
                display.setText(display.getText() + "(");
                countParenthesis++;
            }
            else if(display.getText().charAt(display.getText().length() - 1) != '(') {
                if(display.getText().charAt(display.getText().length() - 1) == '.') {
                    display.setText(display.getText() + "0)");
                    countParenthesis--;
                }
                else if(display.getText().charAt(display.getText().length() - 1) == '-') {
                    display.setText(display.getText()+ "(");
                    countParenthesis++;
                }
                else {
                    display.setText(display.getText()+ ")");
                    countParenthesis--;
                }
            }

            else {
                display.setText(display.getText() + "(");
                countParenthesis++;
            }
        }
    }

    class PercentButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String sNum = display.getText();

            if(sNum.equals(""))
                createErrorMessage();

            else {
                double num = Double.parseDouble(sNum)/100;
                sNum = Double.toString(num);
                String[] arr = sNum.split("\\.");

                if(arr[1].equals("0"))
                    display.setText(arr[0]);

                else
                    display.setText(sNum);
            }
        }
    }

    private void reset() {
        countDots = 0;
        countParenthesis = 0;
        display.setText("");
    }
    class ResetButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            reset();
        }
    }

    class SignButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // TODO Implement the basic functionalities of signButton
            // Calculate button cannot differentiate between minus sign and subtraction sign, keeping counter suggested!
        }
    }

    class PiButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display.setText(Double.toString(Math.PI));
            // TODO Implement the basic functionalities of piButton
            // Does not properly work with other buttons, make it integrated!
        }
    }

    class SqrtButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // TODO Implement the basic functionalities of sqrtButton button
        }
    }

    class EButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display.setText(Double.toString(Math.exp(1)));
            // TODO Implement the basic functionalities of eButton button
            // Does not properly work with other buttons, make it integrated!
        }
    }

    class LogButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // TODO Implement the basic functionalities of LogButton button
        }
    }

    class SquareButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(display.getText().equals(""))
                createErrorMessage();
            // TODO Implement the basic functionalities of squareButton
        }
    }

    class LnButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // TODO Implement the basic functionalities of lnButton
        }
    }
}
