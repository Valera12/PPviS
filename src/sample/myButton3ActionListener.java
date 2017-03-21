package sample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myButton3ActionListener implements ActionListener {
    JTextField textField = new JTextField();
    JButton myButton2 = new JButton();
    JButton myButton3 = new JButton();
    String swap = new String();

    public myButton3ActionListener(JTextField textField, String label, JButton myButton2, JButton myButton3) {
        this.textField = textField;
        this.swap = swap;
        this.myButton2 = myButton2;
        this.myButton3 = myButton3;

    }
    public void actionPerformed (ActionEvent event) {
        swap = myButton2.getText();
        myButton2.setText(myButton3.getText());
        myButton3.setText(swap);
    }
}
