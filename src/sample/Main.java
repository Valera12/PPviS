package sample;

import javax.swing.*;
import java.awt.*;

public class Main {

    public Main() {

        JFrame frame = new JFrame("this is title");

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(new GridBagLayout());

        String label = new String();
        String swap = new String();

        JTextField textField = new JTextField(10);
        JTextField textField2 = new JTextField(10);

        JComboBox comboBox = new JComboBox();

        JButton myButton = new JButton("Button №1");
        JButton myButton2 = new JButton("Button №2 ");
        JButton myButton3 = new JButton("Button №3 ");

        myButton.addActionListener(new myButtonActionListener(textField, label, comboBox));
        myButton2.addActionListener(new myButton2ActionListener(textField2, swap, myButton2, myButton3));
        myButton3.addActionListener(new myButton3ActionListener(textField2, swap, myButton2, myButton3));

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 6;
        c.gridy = 2;

        GridBagConstraints a = new GridBagConstraints();
        a.gridx = 6;
        a.gridy = 1;

        GridBagConstraints b = new GridBagConstraints();
        b.gridx = 4;
        b.gridy = 2;

        GridBagConstraints d = new GridBagConstraints();
        d.gridx = 6;
        d.gridy = 5;

        GridBagConstraints g = new GridBagConstraints();
        g.gridx = 7;
        g.gridy = 5;

        frame.add(myButton, c);
        frame.add(myButton2,d);
        frame.add(myButton3,g);
        frame.add(textField, a);
        frame.add(comboBox, b);
        frame.add(textField2);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Main();
    }
}