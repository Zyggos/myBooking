import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class implements the GUI for the Client user type menu, allowing them to search for places to rent, look
 * at their current bookings and cancel them, look at their incoming messages and check their account details
 */

public class ClientMenu implements ActionListener
{

    JFrame frame= new JFrame();

    JButton searchPlaceForRentButton= new JButton("Search for places to rent");
    JButton showBookingsButton= new JButton("Look at your current bookings");
    JButton removeBookingButton= new JButton("Cancel a booking");
    JButton messagesButton= new JButton("Look at your incoming messages");
    JButton infoCardButton= new JButton("Look at your account details");
    JButton logoutButton= new JButton("Logout");

    Client currentClient;

    JLabel optionsLabel = new JLabel("What would you like to do?");




    public void startClientMenu(Client loggedInClient)
    {

        currentClient= loggedInClient;

        optionsLabel.setBounds(200,100,300,25);


        searchPlaceForRentButton.setBounds(125,200,300,25);
        searchPlaceForRentButton.setFocusable(false);
        searchPlaceForRentButton.addActionListener(this);

        showBookingsButton.setBounds(125,225,300,25);
        showBookingsButton.setFocusable(false);
        showBookingsButton.addActionListener(this);

        removeBookingButton.setBounds(125,250,300,25);
        removeBookingButton.setFocusable(false);
        removeBookingButton.addActionListener(this);

        messagesButton.setBounds(125,275,300,25);
        messagesButton.setFocusable(false);
        messagesButton.addActionListener(this);

        infoCardButton.setBounds(125,300,300,25);
        infoCardButton.setFocusable(false);
        infoCardButton.addActionListener(this);



        logoutButton.setBounds(125,325,300,25);
        logoutButton.setFocusable(false);
        logoutButton.addActionListener(this);



        frame.add(optionsLabel);
        frame.add(searchPlaceForRentButton);
        frame.add(showBookingsButton);
        frame.add(messagesButton);
        frame.add(removeBookingButton);
        frame.add(infoCardButton);
        frame.add(logoutButton);


        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == searchPlaceForRentButton)
        {
            PlaceToRentSearchMenu placeToRentSearchMenu = new PlaceToRentSearchMenu(currentClient);
            frame.setVisible(false);

        }
        if(e.getSource() == showBookingsButton)
        {
            YourBookingsUI yourBookingsUI= new YourBookingsUI();
            yourBookingsUI.startYourBookingsUI(currentClient);
            frame.setVisible(false);

        }
        if(e.getSource() == messagesButton)
        {
            ClientMessageUI clientMessageUI= new ClientMessageUI();
            clientMessageUI.startClientMessagesUI(currentClient);
            frame.setVisible(false);

        }
        if(e.getSource() == removeBookingButton)
        {
            RemoveBookingUI removeBookingUI= new RemoveBookingUI();
            removeBookingUI.startRemoveBookingUI(currentClient);
            frame.setVisible(false);

        }
        if(e.getSource() == infoCardButton)
        {
            InfoCardClientUI infoCardClientUI= new InfoCardClientUI();
            infoCardClientUI.startInfoCardClientUI(currentClient);


        }

        if(e.getSource()==logoutButton)
        {
            LoginMenu loginMenu= new LoginMenu();
            frame.setVisible(false);
        }
         
    }
}
