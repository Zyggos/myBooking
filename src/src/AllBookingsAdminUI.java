import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * This class implements the GUI where the Admin looks through all the current bookings
 */


public class AllBookingsAdminUI implements ActionListener
{
    JFrame frame= new JFrame();
    JButton goBackButton= new JButton("Go back");


    Admin currentAdmin;
    JLabel showBookingsLabel = new JLabel("All bookings in the Database:");

    public void startAllBookingsAdminUI (Admin loggedInAdmin)
    {
        currentAdmin= loggedInAdmin;


        int j=125;

        JLabel[] bookings= new JLabel[500];
        for(int i = 0; i < UserBase.getClientsNumber(); i++)
        {
            Client client = UserBase.getClient(i);
            for (int z = 0; z < client.getNumberOfBookings(); z++)
            {
                String numb= Integer.toString(z+1);
                Booking clientsBooking= client.getBooking(z);
                Date startD=clientsBooking.startDate();
                Date endD=clientsBooking.endDate();
                bookings[z]= new JLabel();
                bookings[z].setText(numb+": "+ startD.getDate()+"/"+(startD.getMonth()+1)+"/"+(startD.getYear()-100) + " - " + endD.getDate()+"/"+(endD.getMonth()+1)+"/"+(endD.getYear()-100)+" by: "+ client.getEmail()+" on: "+clientsBooking.getPlace());

                bookings[z].setBounds(100,j,600,25);
                frame.add(bookings[z]);

                j+=25;
            }

        }

        showBookingsLabel.setBounds(125,100,400,25);

        goBackButton.setBounds(150,j+100,100,25);
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
            AdminMenu adminMenu= new AdminMenu();
            adminMenu.startAdminMenu(currentAdmin);

            frame.setVisible(false);
        }


    }
}
