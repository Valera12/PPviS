package sample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxActionListener implements ActionListener
{
    JTextField textField = new JTextField();
    JButton myButton5 = new JButton();
    JCheckBox checkBox1 = new JCheckBox();
    JCheckBox checkBox2 = new JCheckBox();
    JCheckBox checkBox3 = new JCheckBox();


    public CheckBoxActionListener(JTextField textField,
                                  JButton myButton5, JCheckBox checkBox1, JCheckBox checkBox2, JCheckBox checkBox3)
    {
        this.textField = textField;
        this.myButton5 = myButton5;
        this.checkBox1 = checkBox1;
        this.checkBox2 = checkBox2;
        this.checkBox3 = checkBox3;

    }

    @Override
    public void actionPerformed(ActionEvent event)
    {
        String str1 = textField.getText();
        String str2 = checkBox1.getText();
        String str3 = checkBox2.getText();
        String str4 = checkBox3.getText();

        if (str1.equals(str2))
        {
            checkBox1.doClick();
            return;
        }
        if (str1.equals(str3))
        {
            checkBox2.doClick();
            return;
        }
        if (str1.equals(str4))
        {
            checkBox3.doClick();
            return;
        }
        else
            {
            JOptionPane.showMessageDialog(new JFrame(), "ERROR!");
            }

    }
}

