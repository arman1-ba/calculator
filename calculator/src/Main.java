package Calculator.calculator.src;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.*;
import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;
import java.awt.KeyboardFocusManager;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Main {

    public static void main(String[] args) {
        int num1;
        int num2;

        char operator;
        double answer = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        num1 = input.nextInt();
        System.out.println("enter second number");
        num2 = input.nextInt();
        System.out.println("what operation?");
        operator = input.next().charAt(0);

        switch (operator) {
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            case '*':
                answer = num1 * num2;
                break;
            case '/':
                answer = num1 / num2;
                break;
        }
        System.out.println(answer);
        calwin();
    }

    private static void calwin() {

        JTextField text = new JTextField();
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(370, 430);
        frame.setResizable(false); // размер кона статичный
        frame.setVisible(true);


        JButton buttonPlus = new JButton("+");
                buttonPlus.setSize(65, 60);
                buttonPlus.setLocation(5, 60);
        JButton buttonMinus = new JButton("-");
                buttonMinus.setSize(65, 60);
                buttonMinus.setLocation(75, 60);
        JButton buttonPercent = new JButton("%");
                buttonPercent.setSize(65, 60);
                buttonPercent.setLocation(145, 60);
        JButton buttonClear = new JButton("CLE");
                buttonClear.setSize(65, 60);
                buttonClear.setLocation(215, 60);
        JButton buttonDelete = new JButton("DEL");
                buttonDelete.setSize(65, 60);
                buttonDelete.setLocation(285, 60);


        JButton buttonMul = new JButton("x");
                buttonMul.setSize(65, 60);
                buttonMul.setLocation(5, 125);
        JButton buttonDiv = new JButton("/");
                buttonDiv.setSize(65, 60);
                buttonDiv.setLocation(75, 125);
        JButton button1 = new JButton("1");
                button1.setSize(65, 60);
                button1.setLocation(145, 125);
        JButton button2 = new JButton("2");
                button2.setSize(65, 60);
                button2.setLocation(215, 125);
        JButton button3 = new JButton("3");
                button3.setSize(65, 60);
                button3.setLocation(285, 125);


        JButton buttonBracketOpen = new JButton("(");
                buttonBracketOpen.setSize(65, 60);
                buttonBracketOpen.setLocation(5, 190);
        JButton buttonBracketClose = new JButton(")");
                buttonBracketClose.setSize(65, 60);
                buttonBracketClose.setLocation(75, 190);
        JButton button4 = new JButton("4");
                button4.setSize(65, 60);
                button4.setLocation(145, 190);
        JButton button5 = new JButton("5");
                button5.setSize(65, 60);
                button5.setLocation(215, 190);
        JButton button6 = new JButton("6");
                button6.setSize(65, 60);
                button6.setLocation(285, 190);



        JButton buttonSin = new JButton("sin");
                buttonSin.setSize(65, 60);
                buttonSin.setLocation(5, 255);
        JButton buttonSqrt = new JButton("\u221A");
                buttonSqrt.setSize(65, 60);
                buttonSqrt.setLocation(75, 255);
        JButton button7 = new JButton("7");
                button7.setSize(65, 60);
                button7.setLocation(145, 255);
        JButton button8 = new JButton("8");
                button8.setSize(65, 60);
                button8.setLocation(215, 255);
        JButton button9 = new JButton("9");
                button9.setSize(65, 60);
                button9.setLocation(285, 255);


        JButton buttonCos = new JButton("cos");
                buttonCos.setSize(65, 60);
                buttonCos.setLocation(5, 320);
        JButton buttonEqual = new JButton("=");
                buttonEqual.setSize(65, 60);
                buttonEqual.setLocation(75, 320);
        JButton buttonComma = new JButton(",");
                buttonComma.setSize(65, 60);
                buttonComma.setLocation(145, 320);
        JButton button0 = new JButton("0");
                button0.setSize(65, 60);
                button0.setLocation(215, 320);
        JButton buttonPlusDivMinus = new JButton("+/-");
                buttonPlusDivMinus.setSize(65, 60);
                buttonPlusDivMinus.setLocation(285, 320);



        frame.getContentPane().add(buttonPlus);
        frame.getContentPane().add(buttonMinus);
        frame.getContentPane().add(buttonPercent);
        frame.getContentPane().add(buttonClear);
        frame.getContentPane().add(buttonDelete);
        frame.getContentPane().add(buttonMul);
        frame.getContentPane().add(buttonDiv);
        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);
        frame.getContentPane().add(button3);
        frame.getContentPane().add(buttonBracketOpen);
        frame.getContentPane().add(buttonBracketClose);
        frame.getContentPane().add(button4);
        frame.getContentPane().add(button5);
        frame.getContentPane().add(button6);
        frame.getContentPane().add(buttonSin);
        frame.getContentPane().add(buttonSqrt);
        frame.getContentPane().add(button7);
        frame.getContentPane().add(button8);
        frame.getContentPane().add(button9);
        frame.getContentPane().add(buttonCos);
        frame.getContentPane().add(buttonEqual);
        frame.getContentPane().add(buttonComma);
        frame.getContentPane().add(button0);
        frame.getContentPane().add(buttonPlusDivMinus);


        Container con = frame.getContentPane(); // чтобы последняя кнопка,
        con.setLayout(null); // не закрывала остальные



        buttonPlus.addActionListener(new ListenerAction());
        buttonPlus.setFont(new Font("Bookman Old Style", Font.BOLD, 25));

        buttonMinus.addActionListener(new ListenerAction());
        buttonMinus.setFont(new Font("Bookman Old Style", Font.BOLD, 25));

        buttonPercent.addActionListener(new ListenerAction());
        buttonPercent.setFont(new Font("Bookman Old Style", Font.BOLD, 25));

        buttonClear.addActionListener(new ListenerAction());
        buttonClear.setFont(new Font("Bookman Old Style", Font.BOLD, 12));

        buttonDelete.addActionListener(new ListenerAction());
        buttonDelete.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
        buttonDelete.setBackground(new Color(255, 0, 0));

        buttonMul.addActionListener(new ListenerAction());
        buttonMul.setFont(new Font("Bookman Old Style", Font.BOLD, 25));

        buttonDiv.addActionListener(new ListenerAction());
        buttonDiv.setFont(new Font("Bookman Old Style", Font.BOLD, 25));

        button1.addActionListener(new ListenerAction());
        button1.setFont(new Font("Bookman Old Style", Font.BOLD, 20));

        button2.addActionListener(new ListenerAction());
        button2.setFont(new Font("Bookman Old Style", Font.BOLD, 20));

        button3.addActionListener(new ListenerAction());
        button3.setFont(new Font("Bookman Old Style", Font.BOLD, 20));

        buttonBracketOpen.addActionListener(new ListenerAction());
        buttonBracketOpen.setFont(new Font("Bookman Old Style", Font.BOLD, 25));

        buttonBracketClose.addActionListener(new ListenerAction());
        buttonBracketClose.setFont(new Font("Bookman Old Style", Font.BOLD, 25));

        button4.addActionListener(new ListenerAction());
        button4.setFont(new Font("Bookman Old Style", Font.BOLD, 20));

        button5.addActionListener(new ListenerAction());
        button5.setFont(new Font("Bookman Old Style", Font.BOLD, 20));

        button6.addActionListener(new ListenerAction());
        button6.setFont(new Font("Bookman Old Style", Font.BOLD, 20));

        buttonSin.addActionListener(new ListenerAction());
        buttonSin.setFont(new Font("Bookman Old Style", Font.BOLD, 20));

        buttonSqrt.addActionListener(new ListenerAction());
        buttonSqrt.setFont(new Font("Bookman Old Style", Font.BOLD, 20));

        button7.addActionListener(new ListenerAction());
        button7.setFont(new Font("Bookman Old Style", Font.BOLD, 20));

        button8.addActionListener(new ListenerAction());
        button8.setFont(new Font("Bookman Old Style", Font.BOLD, 20));

        button9.addActionListener(new ListenerAction());
        button9.setFont(new Font("Bookman Old Style", Font.BOLD, 20));

        buttonCos.addActionListener(new ListenerAction());
        buttonCos.setFont(new Font("Bookman Old Style", Font.BOLD, 18));

        buttonEqual.addActionListener(new ListenerAction());
        buttonEqual.setFont(new Font("Bookman Old Style", Font.BOLD, 20));

        buttonComma.addActionListener(new ListenerAction());
        buttonComma.setFont(new Font("Bookman Old Style", Font.BOLD, 20));

        button0.addActionListener(new ListenerAction());
        button0.setFont(new Font("Bookman Old Style", Font.BOLD, 20));

        buttonPlusDivMinus.addActionListener(new ListenerAction());
        buttonPlusDivMinus.setFont(new Font("Bookman Old Style", Font.BOLD, 20));

        text.setFont(new Font("Arial", Font.BOLD, 36));
        text.setBounds(145, 10, 205, 45);
        text.setBackground(Color.white);
        text.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(text);

    }
// ХЗ КАК ЭТО ДОЛЖНО РАБОТАТЬ
    
//        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
//        manager.addKeyEventDispatcher((KeyEventDispatcher) new KeyDispatcher());

//class KeyDispatcher implements KeyEventDispatcher
//{
//    public boolean dispatchKeyEvent(KeyEvent e)
//    {
//        if (e.getKeyCode() == KeyEvent.VK_ENTER)
//        {
//            result();
//        }
//
//        if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
//        {
//            text.setText("");
//        }
//
//        return false;
//    }
//}

    static class ListenerAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println("Нажатие кнопки от - " + e.getActionCommand());
            System.out.println("Answer = " + e.getActionCommand());
        }
    }
}
