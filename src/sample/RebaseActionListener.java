package sample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RebaseActionListener implements ActionListener
{
    JTextField textField = new JTextField();
    JTable table = new JTable();
    JButton myButton7 = new JButton();
    String tblSwap = new String();

    public RebaseActionListener(JTextField textField, String tblSwap, JButton myButton7, JTable table)
    {
        this.textField = textField;
        this.tblSwap = tblSwap;
        this.myButton7 = myButton7;
        this.table = table;
    }
    public void actionPerformed (ActionEvent event)
    {
        tblSwap = (String) table.getValueAt(0, 0);
        table.setValueAt(tblSwap, 0, 1);
        table.setValueAt(null, 0,0);
    }
}