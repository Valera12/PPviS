package sample;

import javax.swing.*;
import java.awt.*;

public class Main {

    public Main() {

        JFrame frame = new JFrame("MY GUI INTERFACE");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());
        String str1 = new String();
        String str2 = new String();
        String str3 = new String();
        String str4 = new String();
        String label = new String();
        String swap = new String();

        JRadioButton radioButton1 = new JRadioButton("THE FIRST");
        JRadioButton radioButton2 = new JRadioButton("THE SECOND");
        JRadioButton radioButton3 = new JRadioButton("THE THIRD");

        JCheckBox checkBox1 = new JCheckBox("THE FIRST");
        JCheckBox checkBox2 = new JCheckBox("THE SECOND");
        JCheckBox checkBox3 = new JCheckBox("THE THIRD");

        JTextField textField = new JTextField(10);

        JComboBox comboBox = new JComboBox();

        JButton myButton = new JButton("Add EL to ComboBox");
        JButton myButton2 = new JButton("Rename");
        JButton myButton3 = new JButton("Swap ");
        JButton myButton4 = new JButton("RadioButton");
        JButton myButton5 =new JButton("CheckBox");

        myButton.addActionListener(new MyButtonActionListener(textField, label, comboBox));
        myButton2.addActionListener(new MyButton2ActionListener(textField, swap, myButton2, myButton3));
        myButton3.addActionListener(new MyButton3ActionListener(textField, swap, myButton2, myButton3));
        myButton4.addActionListener(new MyButton4ActionListener(textField, myButton4, radioButton1, radioButton2,
                radioButton3));
        myButton5.addActionListener(new MyButton5ActionListener(textField, myButton5, checkBox1, checkBox2, checkBox3));




        frame.add(myButton, new GridBagConstraints(0, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
                new Insets(1, 1,1,1),0, 0));

        frame.add(myButton2, new GridBagConstraints(1, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
                new Insets(1, 1,1,1),0, 0));

        frame.add(myButton3, new GridBagConstraints(2, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
                new Insets(1, 1,1,1),0, 0));

        frame.add(textField, new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
                new Insets(1, 1,1,1),0, 0));

        frame.add(comboBox, new GridBagConstraints(0, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
        new Insets(1, 1,1,1),0, 0));

        frame.add(radioButton1, new GridBagConstraints(0, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
                new Insets(1, 1,1,1),0, 0));

        frame.add(radioButton2, new GridBagConstraints(1, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
                new Insets(1, 1,1,1),0, 0));

        frame.add(radioButton3, new GridBagConstraints(2, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
                new Insets(1, 1,1,1),0, 0));

        frame.add(myButton4, new GridBagConstraints(3, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
                new Insets(1, 1,1,1),0, 0));

        frame.add(myButton5, new GridBagConstraints(4, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
                new Insets(1, 1,1,1),0, 0));

        frame.add(checkBox1, new GridBagConstraints(3, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
                new Insets(1, 1,1,1),0, 0));

        frame.add(checkBox2, new GridBagConstraints(3, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
                new Insets(1, 1,1,1),0, 0));

        frame.add(checkBox3, new GridBagConstraints(3, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH,GridBagConstraints.HORIZONTAL,
                new Insets(1, 1,1,1),0, 0));


        frame.setVisible(true);
        frame.pack();

    }

    public static void main(String[] args) {
        new Main();
    }
}