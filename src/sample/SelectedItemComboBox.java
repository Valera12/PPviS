package sample;

import com.sun.javaws.ui.UpdateDialog;

import java.util.Timer;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;

class SelectedItemComboBox implements ActionListener {
    Timer time = new Timer();
    JComboBox comboBox = new JComboBox();
    JFrame frame = new JFrame();



    public SelectedItemComboBox(JComboBox comboBox, Timer time, JFrame frame) {
        this.comboBox = comboBox;
        this.time = time;
        this.frame = frame;
    }

   //@Override
    public void actionPerformed(ActionEvent event) {


        comboBox.addItem(0b1);
        comboBox.addItem(0b10);
        comboBox.addItem(0b11);
        comboBox.addItem(0b100);
        comboBox.addItem(0b101);
        comboBox.addItem(0b110);
        comboBox.addItem(0b111);

        time.schedule(new TimerTask() {
            int i = 0;
          //  @Override
            public void run() {
                if(i >= comboBox.getItemCount()){
                    //System.out.println("Таймер завершил свою работу");
                    //time.cancel();
                    i = 0;
                    return;
                }
                comboBox.setSelectedItem(comboBox.getItemAt(i));
                i++;
                frame.invalidate();
                frame.validate();
                frame.repaint();
                //SwingUtilities.updateComponentTreeUI(frame);
            }
        }, 1000, 1000);


    }

}