package sample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonActionListener implements ActionListener
{
    JTextField textField = new JTextField();
    JButton myButton4 = new JButton();
    JRadioButton radioButton1 = new JRadioButton();
    JRadioButton radioButton2 = new JRadioButton();
    JRadioButton radioButton3 = new JRadioButton();


    public RadioButtonActionListener(JTextField textField,
                                     JButton myButton4, JRadioButton radioButton1, JRadioButton radioButton2,
                                     JRadioButton radioButton3)
    {
        this.textField = textField;
        this.myButton4 = myButton4;
        this.radioButton1 = radioButton1;
        this.radioButton2 = radioButton2;
        this.radioButton3 = radioButton3;

    }

    @Override
    public void actionPerformed(ActionEvent event)
    {
        String str1 = textField.getText();
        String str2 = radioButton1.getText();
        String str3 = radioButton2.getText();
        String str4 = radioButton3.getText();

        if (str1.equals(str2))
        {
            radioButton1.doClick();
            return;
        }
        if (str1.equals(str3))
        {
            radioButton2.doClick();
            return;
        }
        if (str1.equals(str4))
        {
            radioButton3.doClick();
            return;
        }
        else
            {
            JOptionPane.showMessageDialog(new JFrame(), "ERROR!");
            }

    }
}

