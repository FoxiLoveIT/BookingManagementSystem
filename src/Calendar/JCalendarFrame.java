package Calendar;

import Gui.BuyTickets;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JCalendarFrame {

    public final JFrame frame;
    private DateButtonField transactionDateButtonField;

    public JCalendarFrame(String Arr) {
        
        frame = new JFrame("JCalendar");
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        JPanel mainPanel = createMainPanel();
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
        System.out.println(frame.getSize());
        transactionDateButtonField.getCalendarButton()
                .addActionListener(new TransactionDateListener(Arr));

    }

    public JPanel createMainPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.weightx = 1.0;
        gbc.gridy = 2;
        LocalDate currentDate = LocalDate.now();
        transactionDateButtonField = new DateButtonField(panel, gbc,
                "Flight ", currentDate);

        panel = transactionDateButtonField.getPanel();
        String df = updateDateField(currentDate);
        String dl = updateDateLabel(currentDate);
        transactionDateButtonField.getDateField().setText(df);
        transactionDateButtonField.getDateLabel().setText(dl);
        Dimension d = panel.getPreferredSize();
        panel.setPreferredSize(new Dimension(500, d.height));

        return panel;

    }

    public String updateDateField(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(" DD/MM/YYYY");
        String dateString = date.format(formatter);
        return dateString;
    }

    public String updateDateLabel(LocalDate date) {
        StringBuilder builder = new StringBuilder();
        builder.append("The date selected is ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");
        String dateString = date.format(formatter);
        builder.append(dateString);
        builder.append(".");
        return builder.toString();

    }

    public class DateButtonField {

        private final JButton calendarButton;
        private final JLabel dateLabel;
        private final JButton save;
        private final JPanel panel;

        private final JTextField dateField;

        public DateButtonField(JPanel panel, GridBagConstraints gbc,
                String labelText, LocalDate currentDate) {
            
            this.panel = panel;

            gbc.gridwidth = 1;
            gbc.gridx = 0;
            gbc.gridy = 1;
            JLabel label = new JLabel(labelText);
            panel.add(label, gbc);

            gbc.gridx++;
            gbc.weightx = 0.0;
            dateField = new JTextField(6);
            panel.add(dateField, gbc);
            gbc.gridx++;
            calendarButton = new JButton();
            calendarButton.setText("Calendar");
            Dimension d = dateField.getPreferredSize();
            calendarButton.setPreferredSize(new Dimension(100, 30));
            calendarButton.setFont(new java.awt.Font("Segoe UI", 1, 14));
            panel.add(calendarButton, gbc);

            gbc.gridx = 2;
            gbc.gridy = 2;
            save = new JButton("Save");
            panel.add(save, gbc);
            save.setFont(new java.awt.Font("Segoe UI", 1, 14));
            save.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    saveActionPerformed(evt);
                }
            });
            gbc.gridwidth = 3;
            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.weightx = 1.0;
            dateLabel = new JLabel("");
            panel.add(dateLabel, gbc);
        }

        public JButton getSave() {
            return save;
        }

        public JButton getCalendarButton() {
            return calendarButton;
        }

        public JLabel getDateLabel() {
            return dateLabel;
        }

        public JPanel getPanel() {
            return panel;
        }

        public JTextField getDateField() {
            return dateField;
        }

    }
    private void saveActionPerformed(java.awt.event.ActionEvent evt){
       frame.setVisible(false);
}
    public class TransactionDateListener implements ActionListener {

        private final String Arr;

        public TransactionDateListener(String Arr) {
            this.Arr = Arr;
        }

        @Override
        public void actionPerformed(ActionEvent event) {
            JCalendar calendar = new JCalendar(frame, LocalDate.now(),
                    "Transaction Date");
            calendar.setEarliestDate(LocalDate.now().minusMonths(500L));
            calendar.setLatestDate(LocalDate.now().plusMonths(500L));
            if (Arr.equals("Paris")) {
                calendar.setDaysToExclude(DayOfWeek.SUNDAY, DayOfWeek.THURSDAY);
            } else if (Arr.equals("Frankfurt am Main")) {
                calendar.setDaysToExclude(DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY);
            } else if (Arr.equals("London")) {
                calendar.setDaysToExclude(DayOfWeek.TUESDAY);
            } else {
                calendar.setDaysToExclude();
            }
            calendar.start();
            LocalDate selectedDate = calendar.getSelectedDate();
            if (selectedDate != null) {
                String df = updateDateField(selectedDate);
                String dl = updateDateLabel(selectedDate);
                transactionDateButtonField.getDateField().setText(df);
                transactionDateButtonField.getDateLabel().setText(dl);
                BuyTickets.txtData.setText(df);
            }
        }

    }

}

