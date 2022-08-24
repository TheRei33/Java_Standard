package Java_Standard_7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SeventoThirseven {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new EventHandler());
    }

}

class EventHandler implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        System.out.println("ActionEvent occirred!!!");
    }
}
