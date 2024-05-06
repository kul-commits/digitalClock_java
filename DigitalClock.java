import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DigitalClock extends JFrame {

    private JLabel timeLabel;

    public DigitalClock() {
        super("Digital Clock");

        // Create the label to display time
        timeLabel = new JLabel();
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 70));
        timeLabel.setForeground(Color.WHITE);

        // Add label to the frame
        getContentPane().add(timeLabel, BorderLayout.CENTER);
        getContentPane().setBackground(Color.BLACK);

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);

        // Update time every second
        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();
    }

    private void updateTime() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss a");
        String time = dateFormat.format(calendar.getTime());
        timeLabel.setText(time);
    }

    public static void main(String[] args) {
        new DigitalClock();
    }
}
