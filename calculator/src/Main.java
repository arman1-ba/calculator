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
        frame.setSize(370, 360);
        frame.setResizable(false); // размер кона статичный
        frame.setVisible(true);


        JButton button = new JButton("+");
        button.setSize(65, 60);
        button.setLocation(5, 60);
        JButton button1 = new JButton("-");
        button1.setSize(65, 60);
        button1.setLocation(75, 60);
        JButton button2 = new JButton("%");
        button2.setSize(65, 60);
        button2.setLocation(145, 60);
        JButton button3 = new JButton("CLE");
        button3.setSize(65, 60);
        button3.setLocation(215, 60);
        JButton button4 = new JButton("DEL");
        button4.setSize(65, 60);
        button4.setLocation(285, 60);


        JButton button5 = new JButton("X");
        button5.setSize(65, 60);
        button5.setLocation(5, 125);
        JButton button6 = new JButton("/");
        button6.setSize(65, 60);
        button6.setLocation(75, 125);
        JButton button7 = new JButton("1");
        button7.setSize(65, 60);
        button7.setLocation(145, 125);
        JButton button8 = new JButton("2");
        button8.setSize(65, 60);
        button8.setLocation(215, 125);
        JButton button9 = new JButton("3");
        button9.setSize(65, 60);
        button9.setLocation(285, 125);


        JButton button10 = new JButton("(");
        button10.setSize(65, 60);
        button10.setLocation(5, 190);
        JButton button11 = new JButton(")");
        button11.setSize(65, 60);
        button11.setLocation(75, 190);
        JButton button12 = new JButton("4");
        button12.setSize(65, 60);
        button12.setLocation(145, 190);
        JButton button13 = new JButton("5");
        button13.setSize(65, 60);
        button13.setLocation(215, 190);
        JButton button14 = new JButton("6");
        button14.setSize(65, 60);
        button14.setLocation(285, 190);


        JButton button15 = new JButton("sin");
        button15.setSize(65, 60);
        button15.setLocation(5, 255);
        JButton button16 = new JButton("cos");
        button16.setSize(65, 60);
        button16.setLocation(75, 255);
        JButton button17 = new JButton("7");
        button17.setSize(65, 60);
        button17.setLocation(145, 255);
        JButton button18 = new JButton("8");
        button18.setSize(65, 60);
        button18.setLocation(215, 255);
        JButton button19 = new JButton("9");
        button19.setSize(65, 60);
        button19.setLocation(285, 255);


        frame.getContentPane().add(button);
        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);
        frame.getContentPane().add(button3);
        frame.getContentPane().add(button4);
        frame.getContentPane().add(button5);
        frame.getContentPane().add(button6);
        frame.getContentPane().add(button7);
        frame.getContentPane().add(button8);
        frame.getContentPane().add(button9);
        frame.getContentPane().add(button10);
        frame.getContentPane().add(button11);
        frame.getContentPane().add(button12);
        frame.getContentPane().add(button13);
        frame.getContentPane().add(button14);
        frame.getContentPane().add(button15);
        frame.getContentPane().add(button16);
        frame.getContentPane().add(button17);
        frame.getContentPane().add(button18);
        frame.getContentPane().add(button19);

        Container con = frame.getContentPane(); // чтобы последняя кнопка,
        con.setLayout(null); // не закрывала остальные

        button.addActionListener(new ListenerAction());
        button1.addActionListener(new ListenerAction());
        button2.addActionListener(new ListenerAction());
        button3.addActionListener(new ListenerAction());
        button4.addActionListener(new ListenerAction());
        button5.addActionListener(new ListenerAction());
        button6.addActionListener(new ListenerAction());
        button7.addActionListener(new ListenerAction());
        button8.addActionListener(new ListenerAction());
        button9.addActionListener(new ListenerAction());
        button10.addActionListener(new ListenerAction());
        button11.addActionListener(new ListenerAction());
        button12.addActionListener(new ListenerAction());
        button13.addActionListener(new ListenerAction());
        button14.addActionListener(new ListenerAction());
        button15.addActionListener(new ListenerAction());
        button16.addActionListener(new ListenerAction());
        button17.addActionListener(new ListenerAction());
        button18.addActionListener(new ListenerAction());
        button19.addActionListener(new ListenerAction());


        text.setFont(new Font("Arial", Font.BOLD, 36));
        text.setBounds(145, 10, 205, 45);
        text.setBackground(Color.white);
        text.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(text);

    }

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
