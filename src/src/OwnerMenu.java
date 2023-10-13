import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class implements the GUI of the menu for the Owner user type, allowing them to put a place
 * up for rent, go through their bookings, look at their incoming messages, edit the details of
 * one of their properties, remove properties and look at their account details
 */

public class OwnerMenu implements ActionListener
{


    JFrame frame= new JFrame();
    JButton addPlaceForRentButton= new JButton("Put a place up for rent");
    JButton showBookingsButton= new JButton("Look at your bookings");
    JButton messagesButton= new JButton("Look at your incoming messages");
    JButton editPlaceForRentButton= new JButton("Edit the details of one of your properties");
    JButton removePlaceForRentButton= new JButton("Remove property ");
    JButton infoCardButton= new JButton("Look at your account details");
    JButton logoutButton= new JButton("Logout");
    Owner currentOwner;

    JLabel optionsLabel = new JLabel("What would you like to do?");




    public void startOwnerMenu(Owner loggedInOwner)
    {

        currentOwner=loggedInOwner;


        optionsLabel.setBounds(200,100,300,25);


        addPlaceForRentButton.setBounds(125,200,300,25);
        addPlaceForRentButton.setFocusable(false);
        addPlaceForRentButton.addActionListener(this);

        showBookingsButton.setBounds(125,225,300,25);
        showBookingsButton.setFocusable(false);
        showBookingsButton.addActionListener(this);

        messagesButton.setBounds(125,250,300,25);
        messagesButton.setFocusable(false);
        messagesButton.addActionListener(this);

        editPlaceForRentButton.setBounds(125,275,300,25);
        editPlaceForRentButton.setFocusable(false);
        editPlaceForRentButton.addActionListener(this);

        removePlaceForRentButton.setBounds(125,300,300,25);
        removePlaceForRentButton.setFocusable(false);
        removePlaceForRentButton.addActionListener(this);

        infoCardButton.setBounds(125,325,300,25);
        infoCardButton.setFocusable(false);
        infoCardButton.addActionListener(this);

        logoutButton.setBounds(125,350,300,25);
        logoutButton.setFocusable(false);
        logoutButton.addActionListener(this);



        frame.add(optionsLabel);

        frame.add(addPlaceForRentButton);
        frame.add(showBookingsButton);
        frame.add(messagesButton);
        frame.add(editPlaceForRentButton);
        frame.add(removePlaceForRentButton);
        frame.add(infoCardButton);
        frame.add(logoutButton);


        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == addPlaceForRentButton)
        {
            PutPlaceUpForRentMenu putPlaceForRent = new PutPlaceUpForRentMenu(currentOwner);


        }
        if(e.getSource() == showBookingsButton)
        {
            ShowBookingsOfYourPlacesUI showBookingsOfYourPlacesUI= new ShowBookingsOfYourPlacesUI();
            showBookingsOfYourPlacesUI.startShowBookingsOfYourPlacesUI(currentOwner);
            frame.setVisible(false);

        }
        if(e.getSource() == messagesButton)
        {
           OwnerMessagesUI ownerMessagesUI= new OwnerMessagesUI();
            ownerMessagesUI.startOwnerMessagesUI(currentOwner);
            frame.setVisible(false);

        }
        if(e.getSource() == editPlaceForRentButton)
        {
            ShowAllYourPlacesForRentUI showAllYourPlacesForRentUI= new ShowAllYourPlacesForRentUI();
            showAllYourPlacesForRentUI.startShowAllYourPlacesForRentUI(currentOwner);
            frame.setVisible(false);

        }
        if(e.getSource() == removePlaceForRentButton)
        {
           RemovePlaceForRentUI removePlaceForRentUI= new RemovePlaceForRentUI();
           removePlaceForRentUI.startRemovePlaceForRentUI(currentOwner);
            frame.setVisible(false);

        }
        if(e.getSource() == infoCardButton)
        {
            InfoCardOwnerUI infoCardOwnerUI= new InfoCardOwnerUI();
            infoCardOwnerUI.startInfoCardOwnerUI(currentOwner);


        }
        if(e.getSource()==logoutButton)
        {
           LoginMenu loginMenu= new LoginMenu();
            frame.setVisible(false);
        }

    }
}

