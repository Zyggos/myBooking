import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * This class implements the GUI that allows a Client to look at all their bookings
 */

public class YourBookingsUI implements ActionListener
{
    JFrame frame= new JFrame();

    JButton goBackButton= new JButton("Go back");
    JButton editButton= new JButton("Edit");

    Client currentClient;
    JLabel showBookingsLabel = new JLabel("Your bookings:");

    public void startYourBookingsUI (Client loggedInClient)
    {
        currentClient= loggedInClient;
        int j=125;
        JLabel[] bookings= new JLabel[currentClient.getNumberOfBookings()];
        for(int i = 0; i < currentClient.getNumberOfBookings(); i++)
        {
            String numb= Integer.toString(i+1);
            Booking clientsBooking= currentClient.getBooking(i);
            Date startD=clientsBooking.startDate();
            Date endD=clientsBooking.endDate();
            bookings[i]= new JLabel();
            bookings[i].setText(numb+": "+ startD.getDate()+"/"+(startD.getMonth()+1)+"/"+(startD.getYear()-100) + " - " + endD.getDate()+"/"+(endD.getMonth()+1)+"/"+(endD.getYear()-100)+ " on a: " + clientsBooking.getPlace().getType()+" in: "+clientsBooking.getPlace().getLocation());
            bookings[i].setBounds(100,j,600,25);
            frame.add(bookings[i]);
            j+=25;
        }
        showBookingsLabel.setBounds(125,100,400,25);

        goBackButton.setBounds(150,j+100,100,25);
        goBackButton.setFocusable(false);
        goBackButton.addActionListener(this);



        frame.add(goBackButton);
        frame.add(showBookingsLabel);
        frame.add(editButton);


        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== goBackButton)
        {
            ClientMenu clientMenu= new ClientMenu();
            clientMenu.startClientMenu(currentClient);
            frame.setVisible(false);
        }


    }
}
