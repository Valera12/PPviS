package sample;

import com.sun.javaws.ui.UpdateDialog;

import java.util.Timer;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;

class EndMoveActionListener implements ActionListener
{
    Timer time = new Timer();
    JComboBox comboBox = new JComboBox();
    JFrame frame = new JFrame();



    public EndMoveActionListener(JComboBox comboBox, Timer time, JFrame frame)
    {
        this.comboBox = comboBox;
        this.time = time;
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent event)
    {
        time.cancel();
        System.out.println("Таймер завершил работу!");
    }

}