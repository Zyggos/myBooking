import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * This class implements the GUI of the booking process. It also contains some info of the property.
 */

public class PlaceToRentInfoUI implements ActionListener {

    PlaceToRent currentPlace;
    Client currentClient;

    JFrame frame = new JFrame();

    JButton exit = new JButton("Exit");
    JButton bookPlace = new JButton("Confirm Booking");

    JLabel addressLabel = new JLabel();
    JLabel priceLabel = new JLabel();
    JLabel squareFeetLabel = new JLabel();
    JLabel roomsLabel = new JLabel();
    JLabel descriptionLabel = new JLabel();
    JLabel book = new JLabel("From which date to which date would you like to book the property?");
    JLabel format = new JLabel("Please use the dd/mm/yyyy format");
    JLabel startingDateLabel = new JLabel("From:");
    JLabel endDateLabel = new JLabel("To:");
    JLabel wrongDates = new JLabel("The dates you have provided are invalid");
    JLabel alreadyBooked = new JLabel("The property is already booked on those dates");

    JTextField startingDateField = new JTextField();
    JTextField endDateField = new JTextField();

    PlaceToRentInfoUI(PlaceToRent place, Client client) {

        currentPlace = place;
        currentClient = client;

        addressLabel.setText(place.getCountry() + ", " + place.getCity() + ", " + place.getStreetName() + " " + place.getStreetNumber());
        addressLabel.setBounds(100,100,500,25);
        priceLabel.setText("The cost of the property per night is: " + place.getPrice_per_day() + "€");
        priceLabel.setBounds(100,400, 300, 25);
        squareFeetLabel.setText("The property is " + place.getSquare_feet() + " square feet big");
        squareFeetLabel.setBounds(100,450,300,25);
        roomsLabel.setText("It has " + place.getRooms() + " rooms");
        roomsLabel.setBounds(100,500,300,25);
        descriptionLabel.setText(place.getDescription());
        descriptionLabel.setBounds(100, 550, 800, 50);
        book.setBounds(800, 400, 500, 25);
        format.setBounds(800,430,500,25);
        startingDateLabel.setBounds(800, 480, 100, 25);
        endDateLabel.setBounds(800, 520, 100, 25);
        startingDateField.setBounds(850, 480, 100, 25);
        endDateField.setBounds(850, 520, 100, 25);
        exit.setBounds(1050, 570, 100, 25);
        exit.addActionListener(this);
        bookPlace.setBounds(850,570,200,25);
        bookPlace.addActionListener(this);
        wrongDates.setBounds(850, 542, 500, 25);
        wrongDates.setVisible(false);
        alreadyBooked.setBounds(850, 542, 500, 25);
        alreadyBooked.setVisible(false);

        for (int i = 0; i < place.getPictures().size(); i++) {
            ImageIcon startingIcon = new ImageIcon("src/images/" + place.getPictures().get(i));
            Image startingImage = startingIcon.getImage();
            Image newImage = startingImage.getScaledInstance(250,250, java.awt.Image.SCALE_SMOOTH);
            JLabel picture = new JLabel(new ImageIcon(newImage));
            picture.setBounds(50 + 260*i, 130, 250, 250);
            frame.add(picture);
        }

        frame.add(priceLabel);
        frame.add(addressLabel);
        frame.add(squareFeetLabel);
        frame.add(roomsLabel);
        frame.add(descriptionLabel);
        frame.add(book);
        frame.add(format);
        frame.add(startingDateLabel);
        frame.add(startingDateField);
        frame.add(endDateLabel);
        frame.add(endDateField);
        frame.add(exit);
        frame.add(bookPlace);
        frame.add(wrongDates);
        frame.add(alreadyBooked);

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLayout(null);
        frame.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        String date1 = startingDateField.getText();
        String date2 = endDateField.getText();
        boolean correctDates = true;
        if (e.getSource() == exit) {
            frame.dispose();
        }

        if (e.getSource() == bookPlace) {
            String regex = "^((0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|2[0-9])[0-9]{2})$";
            if (date1.matches(regex) && date2.matches(regex)) {
                wrongDates.setVisible(false);
                alreadyBooked.setVisible(false);
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                dateFormat.setLenient(false);
                try {
                    dateFormat.parse(date1);
                } catch (Exception ex) {
                    correctDates = false;
                }

                try {
                    dateFormat.parse(date2);
                } catch (Exception ex) {
                    correctDates = false;
                }

                if (correctDates) {
                    ArrayList<Date> dates = new ArrayList<>();
                    Calendar calendar = new GregorianCalendar();
                    Date objectDate1 = null, objectDate2 = null;
                    try {
                        objectDate1 = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
                    } catch (ParseException ex) {
                        ex.printStackTrace();
                    }

                    try {
                        objectDate2 = new SimpleDateFormat("dd/MM/yyyy").parse(date2);
                    } catch (ParseException ex) {
                        ex.printStackTrace();
                    }


                    calendar.setTime(objectDate1);
                    while (calendar.getTime().before(objectDate2))
                    {
                        Date result = calendar.getTime();
                        dates.add(result);
                        calendar.add(Calendar.DATE, 1);
                    }
                    
                    if (dates.isEmpty()){
                        wrongDates.setVisible(true);
                        return;
                    }

                    if (currentPlace.isAvailable(dates)) {
                        Booking newBooking = new Booking(currentClient,currentPlace,dates);
                        currentPlace.addBooking(newBooking);
                        currentClient.addBooking(newBooking);
                    } else {
                        alreadyBooked.setVisible(true);
                    }
                }
            } else {
                wrongDates.setVisible(true);
            }
        }


    }
}
