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
        frame.setSize(400, 400);

        JButton button = new JButton("Press");
          button.setSize(80, 30);
          button.setLocation(5,5);

        JButton button1 = new JButton("press2");
          button1.setSize(80, 30);
          button1.setLocation(60,60);

        JButton button2 = new JButton("X");
          button2.setSize(80, 30);
          button2.setLocation(80,80);

        JButton button3 = new JButton("/");
          button3.setSize(80, 30);
          button3.setLocation(40,40);

        frame.getContentPane().add(button);
        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);
        frame.getContentPane().add(button3);

        button.addActionListener(new ListenerAction());
        button1.addActionListener(new ListenerAction());
        button2.addActionListener(new ListenerAction());
        button3.addActionListener(new ListenerAction());

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