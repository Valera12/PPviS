package sample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AddElToTableActionListener implements ActionListener {
    JTextField textField = new JTextField();
    JTable table = new JTable();
    JButton myButton6 = new JButton();
    String tbl = new String();

    public AddElToTableActionListener(JTextField textField, String tbl, JButton myButton6, JTable table) {
        this.textField = textField;
        this.tbl = tbl;
        this.myButton6 = myButton6;
        this.table = table;

    }
    public void actionPerformed (ActionEvent event) {
        tbl = textField.getText();
        table.setValueAt(tbl, 0,0);

    }
}