package first;
import javax.swing.*;
import java.awt.*;
import java.text.*;
import java.util.*;

public class DigitalWatch implements Runnable {

    JFrame f;
    Thread t = null;
    int hours = 0, minutes = 0, seconds = 0;
    String timeString = "";
    JButton b;

    DigitalWatch() {

        f = new JFrame();

        t = new Thread(this);
        t.start();

        b = new JButton();
        b.setBounds(100, 100, 100, 50);
        f.add(b);
        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void run() {
        try {
            while (true) {

                Calendar cal = Calendar.getInstance(); // Corrected the typo "Calender" to "Calendar"
                hours = cal.get(Calendar.HOUR_OF_DAY); // Corrected "Calender.HOUR_OF_DAY" to "Calendar.HOUR_OF_DAY"
                if (hours > 12) hours -= 12;
                minutes = cal.get(Calendar.MINUTE); // Corrected "Calender.MINUTE" to "Calendar.MINUTE"
                seconds = cal.get(Calendar.SECOND); // Corrected "Calender.SECOND" to "Calendar.SECOND"

                SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss"); // Corrected "SimpleDateFormate" to "SimpleDateFormat"
                Date date = cal.getTime();
                timeString = formatter.format(date);

                printTime();
                Thread.sleep(1000); // Corrected "t.sleep(1000);" to "Thread.sleep(1000);"
            }
        } catch (Exception e) {
            e.printStackTrace(); // Print the exception stack trace for debugging
        }
    }

    public void printTime() {
        b.setText(timeString);
    }

    public static void main(String[] args) {
        new DigitalWatch();
    }
}
