package sample;

import java.util.Timer;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;

class SelectedItemComboBox implements ActionListener
{
    Timer time = new Timer();
    JComboBox comboBox = new JComboBox();
    JFrame frame = new JFrame();



    public SelectedItemComboBox(JComboBox comboBox, Timer time, JFrame frame)
    {
        this.comboBox = comboBox;
        this.time = time;
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent event)
    {
        comboBox.addItem(0b1);
        comboBox.addItem(0b10);
        comboBox.addItem(0b11);
        comboBox.addItem(0b100);
        comboBox.addItem(0b101);
        comboBox.addItem(0b110);
        comboBox.addItem(0b111);

        time.schedule(new TimerTask()
        {
            int comboBoxSelectedItem = 0;
            public void run()
            {
                if(comboBoxSelectedItem >= comboBox.getItemCount())
                {
                    comboBoxSelectedItem = 0;
                    return;
                }
                comboBox.setSelectedItem(comboBox.getItemAt(comboBoxSelectedItem));
                comboBoxSelectedItem++;
                frame.repaint();
            }
        }, 1000, 1000);


    }

}