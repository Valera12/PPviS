package sample;

import java.util.Timer;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;

class SelectedItemCombobBox implements ActionListener {
    Timer time = new Timer();
    JComboBox comboBox = new JComboBox();


    public SelectedItemCombobBox(JComboBox comboBox, Timer time) {
        this.comboBox = comboBox;
        this.time = time;
    }

    @Override
    public void actionPerformed(ActionEvent event) {


        comboBox.addItem( "1");
        comboBox.addItem( "2");
        comboBox.addItem( "3");
        comboBox.addItem( "4");
        comboBox.addItem( "5");
        comboBox.addItem( "6");
        comboBox.addItem( "7");

        time.schedule(new TimerTask() {
            int i = 0;
            public void run() {
                if(i >= comboBox.getItemCount()){
                    System.out.println("Таймер завершил свою работу");
                    time.cancel();
                    return;
                }
                comboBox.setSelectedIndex(i);
                i = i + 1;
            }
        }, 1000, 1000);

    }

}