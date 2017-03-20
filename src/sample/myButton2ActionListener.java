package sample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myButton2ActionListener implements ActionListener {

    JTextField textField2 = new JTextField();
    JButton myButton2 = new JButton();
    JButton myButton3 = new JButton();
    String swap = new String();

    public myButton2ActionListener(JTextField textField, String label, JButton myButton2, JButton myButton3) {
        this.textField2 = textField;
        this.swap = swap;
        this.myButton2 = myButton2;
        this.myButton3 = myButton3;

    }

    @Override
    public void actionPerformed(ActionEvent event) {

        myButton2.setText(textField2.getText());

    }


}

