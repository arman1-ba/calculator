package Calculator.calculator.src;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

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
        System.out.println("What operation?");
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
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(370, 400);

        JButton button = new JButton("+");
          button.setSize(65, 60);
          button.setLocation(5,50);

        JButton button1 = new JButton("-");
          button1.setSize(65, 60);
          button1.setLocation(75,50);

        JButton button2 = new JButton("X");
          button2.setSize(65, 60);
          button2.setLocation(145,50);

        JButton button3 = new JButton("/");
          button3.setSize(65, 60);
          button3.setLocation(215,50);

        JButton button4 = new JButton("DEL");
          button4.setSize(65, 60);
          button4.setLocation(285,50);

        JButton button5 = new JButton("%");
          button5.setSize(65, 60);
          button5.setLocation(5,115);

        JButton button6 = new JButton(".");
          button6.setSize(65, 60);
          button6.setLocation(75,115);

        JButton button7 = new JButton("1");
          button7.setSize(65, 60);
          button7.setLocation(145,115);

        JButton button8 = new JButton("2");
          button8.setSize(65, 60);
          button8.setLocation(215,115);

        JButton button9 = new JButton("3");
          button9.setSize(65, 60);
          button9.setLocation(285,115);

        JButton button10 = new JButton("(");
          button10.setSize(65, 60);
          button10.setLocation(5,180);

        JButton button11 = new JButton(")");
          button11.setSize(65, 60);
          button11.setLocation(75,180);

        JButton button12 = new JButton("sin");
          button12.setSize(65, 60);
          button12.setLocation(145,180);

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

        frame.setVisible(true);

    }

    static class ListenerAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println("Нажатие кнопки от - " + e.getActionCommand());
            System.out.println("Answer = " + e.getActionCommand());
        }
    }
}