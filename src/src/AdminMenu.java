import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class implements the GUI for the Admin user type, allowing them to search for users, look at
 * all current bookings, approve new accounts and send messages to users.
 */

public class AdminMenu implements ActionListener
{
    JFrame frame= new JFrame();

    JButton searchForUsersButton= new JButton("Search for users");
    JButton showAllBookingsButton= new JButton("Look at all bookings");
    JButton approveNewAccountsButton= new JButton("Approve new accounts");
    JButton messagesButton= new JButton("Send a message");
    JButton logoutButton= new JButton("Logout");

    Admin currentAdmin;

    JLabel optionsLabel = new JLabel("What would you like to do?");




    public void startAdminMenu(Admin loggedInAdmin)
    {
        currentAdmin=loggedInAdmin;

        optionsLabel.setBounds(200,100,300,25);


        searchForUsersButton.setBounds(125,200,300,25);
        searchForUsersButton.setFocusable(false);
        searchForUsersButton.addActionListener(this);

        showAllBookingsButton.setBounds(125,225,300,25);
        showAllBookingsButton.setFocusable(false);
        showAllBookingsButton.addActionListener(this);

        approveNewAccountsButton.setBounds(125,250,300,25);
        approveNewAccountsButton.setFocusable(false);
        approveNewAccountsButton.addActionListener(this);

        messagesButton.setBounds(125,275,300,25);
        messagesButton.setFocusable(false);
        messagesButton.addActionListener(this);

        logoutButton.setBounds(125,325,300,25);
        logoutButton.setFocusable(false);
        logoutButton.addActionListener(this);



        frame.add(optionsLabel);
        frame.add(searchForUsersButton);
        frame.add(showAllBookingsButton);
        frame.add(messagesButton);
        frame.add(approveNewAccountsButton);
        frame.add(logoutButton);


        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == searchForUsersButton)
        {
            UserSearchMenu searchMenu = new UserSearchMenu(currentAdmin);
            frame.setVisible(false);

        }
        if(e.getSource() == showAllBookingsButton)
        {
            AllBookingsAdminUI allBookingsAdminUI= new AllBookingsAdminUI();
            allBookingsAdminUI.startAllBookingsAdminUI(currentAdmin);
            frame.setVisible(false);

        }
        if(e.getSource() == messagesButton)
        {
            AdminSendMessageUI adminSendMessageUI= new AdminSendMessageUI();
            adminSendMessageUI.startAdminSendMessageUI(currentAdmin);
            frame.setVisible(false);

        }
        if(e.getSource() == approveNewAccountsButton)
        {
            ApproveNewUsersUI approveNewUsersUI= new ApproveNewUsersUI();
            approveNewUsersUI.startApproveNewUsersUI(currentAdmin);
            frame.setVisible(false);

        }

        if(e.getSource()==logoutButton)
        {
            LoginMenu loginMenu= new LoginMenu();
            frame.setVisible(false);
        }

    }
}

