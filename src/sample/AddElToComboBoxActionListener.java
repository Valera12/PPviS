package sample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddElToComboBoxActionListener implements ActionListener
{
    JTextField textField = new JTextField();
    JComboBox comboBox = new JComboBox();
    String label = new String();

    public AddElToComboBoxActionListener(JTextField textField, String label, JComboBox comboBox)
    {
        this.textField = textField;
        this.label = label;
        this.comboBox = comboBox;
    }

    @Override
    public void actionPerformed(ActionEvent event)
    {


        for (int i = 0; i < comboBox.getItemCount(); i++)
        {
            if (textField.getText().equals(comboBox.getItemAt(i)))
            {
                JOptionPane.showMessageDialog(new JFrame(), "ERROR! This line already exist.");
                return;
            }
        }

        comboBox.addItem(textField.getText());

    }

}