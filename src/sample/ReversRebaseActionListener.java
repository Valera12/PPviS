package sample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ReversRebaseActionListener implements ActionListener {
    JTextField textField = new JTextField();
    JTable table = new JTable();
    JButton myButton8 = new JButton();
    String tblSwap = new String();

    public ReversRebaseActionListener(JTextField textField, String tblSwap, JButton myButton8, JTable table) {
        this.textField = textField;
        this.tblSwap = tblSwap;
        this.myButton8 = myButton8;
        this.table = table;

    }
    public void actionPerformed (ActionEvent event) {
        tblSwap = (String) table.getValueAt(0, 1);
        table.setValueAt(tblSwap, 0, 0);
        table.setValueAt(null, 0,1);

    }
}
