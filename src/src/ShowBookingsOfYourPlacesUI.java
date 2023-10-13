import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * This class implements the GUI that allows the owner to look at all the bookings of the places he has put up for rent
 */

public class ShowBookingsOfYourPlacesUI implements ActionListener
{
    JFrame frame= new JFrame();
    JButton goBackButton= new JButton("Go back");
    Owner currentOwner;


    JLabel showBookingsLabel = new JLabel("These are the current bookings of your places up for rent:");
   public void startShowBookingsOfYourPlacesUI(Owner loggedInOwner)
   {
       int j=125;

       JLabel[] bookings= new JLabel[500];
       currentOwner= loggedInOwner;
        int i =0;

        for (PlaceToRent place : currentOwner.getOwnersPlacesForRent())
        {
            for (Booking clientsBooking : place.getBookings())
            {
                String numb = Integer.toString(i + 1);
                Date startD = clientsBooking.startDate();
                Date endD = clientsBooking.endDate();
                bookings[i] = new JLabel();
                bookings[i].setText(numb + ": " + startD.getDate() + "/" + (startD.getMonth() + 1) + "/" + (startD.getYear() - 100) + " - " + endD.getDate() + "/" + (endD.getMonth() + 1) + "/" + (endD.getYear() - 100) + " by: " + clientsBooking.getPerson().getEmail() + " on the: " + clientsBooking.getPlace().getType()+" in: "+clientsBooking.getPlace().getLocation());

                bookings[i].setBounds(100, j, 600, 25);
                frame.add(bookings[i]);

                i += 1;
                j += 25;
            }
        }



       showBookingsLabel.setBounds(125,100,400,25);

       goBackButton.setBounds(125,200,300,25);
       goBackButton.setFocusable(false);
       goBackButton.addActionListener(this);

       frame.add(goBackButton);
       frame.add(showBookingsLabel);

       frame.setSize(600,600);
       frame.setLayout(null);
       frame.setVisible(true);
   }
    @Override
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource()== goBackButton)
       {
           OwnerMenu ownerMenu= new OwnerMenu();
           ownerMenu.startOwnerMenu(currentOwner);
           frame.setVisible(false);
       }
    }
}
