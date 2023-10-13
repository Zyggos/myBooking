import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * This class implements the GUI for the use search process
 */

public class UserSearchMenu implements ActionListener {

    Admin currentAdmin;

    JFrame frame = new JFrame();

    JPanel panel = new JPanel(new GridLayout(15, 1, 0, 0));

    JScrollPane scrollPane = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

    JLabel firstNameLabel = new JLabel("First Name");
    JLabel lastNameLabel = new JLabel("Last Name:");
    JLabel searchLabel = new JLabel("You can search for users by first name, last name, or both");
    JLabel emptyFields = new JLabel("Both fields cannot be left empty");

    JButton searchButton = new JButton("Search");
    JButton exitButton = new JButton("Exit");

    JTextField firstNameField = new JTextField();
    JTextField lastNameField = new JTextField();



    public UserSearchMenu(Admin admin) {

        currentAdmin = admin;

        searchButton.addActionListener(this);
        exitButton.addActionListener(this);

        searchLabel.setBounds(90,50,400,25);
        emptyFields.setBounds(210, 200, 300, 25);
        emptyFields.setVisible(false);
        firstNameLabel.setBounds(100,100,100,25);
        lastNameLabel.setBounds(100,  150, 100, 25);
        scrollPane.setBounds(600, 100, 500, 500);
        firstNameField.setBounds(200, 100, 200 ,25);
        lastNameField.setBounds(200, 150, 200, 25);
        searchButton.setBounds(235, 250, 100, 25);
        exitButton.setBounds(335, 250, 100, 25);

        frame.add(searchLabel);
        frame.add(emptyFields);
        frame.add(firstNameLabel);
        frame.add(lastNameLabel);
        frame.add(firstNameField);
        frame.add(lastNameField);
        frame.add(scrollPane);
        frame.add(searchButton);
        frame.add(exitButton);


        frame.setSize(1200,700);
        frame.setLayout(null);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<Owner> matchingOwners = new ArrayList<>();
        ArrayList<Client> matchingClients = new ArrayList<>();
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        UserSearchLogic searchLogic = new UserSearchLogic();

        if(e.getSource() == searchButton)
        {
            if (firstName.isEmpty() && lastName.isEmpty()) {
                emptyFields.setVisible(true);
            } else if (lastName.isEmpty()) {
                matchingClients = searchLogic.searchClientsByFirstName(firstName);
                matchingOwners = searchLogic.searchOwnersByFirstName(firstName);
                emptyFields.setVisible(false);
            } else if (firstName.isEmpty()) {
                matchingClients = searchLogic.searchClientsByLastName(lastName);
                matchingOwners = searchLogic.searchOwnersByLastName(lastName);
                emptyFields.setVisible(false);
            } else {
                matchingClients = searchLogic.searchClientsByFistAndLastName(firstName,lastName);
                matchingOwners = searchLogic.searchOwnersByFistAndLastName(firstName,lastName);
                emptyFields.setVisible(false);
            }

            panel.removeAll();
            panel.revalidate();
            panel.repaint();
            ArrayList<JButton> buttons = new ArrayList<>();
            for(int i = 0; i < matchingClients.size(); i++) {
                JButton nextButton = new JButton(matchingClients.get(i).getFirstName() + " " + matchingClients.get(i).getLastName());
                ArrayList<Client> finalMatchingClients = matchingClients;
                int finalI = i;
                nextButton.addActionListener(e12 -> {
                    InfoCardClientUI clientInfo = new InfoCardClientUI();
                    clientInfo.startInfoCardClientUI(finalMatchingClients.get(finalI));
                });
                buttons.add(nextButton);
                panel.add(nextButton);
                frame.validate();
            }

            for(int i = 0; i < matchingOwners.size(); i++) {
                JButton nextButton = new JButton(matchingOwners.get(i).getFirstName() + " " + matchingOwners.get(i).getLastName());
                ArrayList<Owner> finalMatchingOwners = matchingOwners;
                int finalI = i;
                nextButton.addActionListener(e1 -> {
                    InfoCardOwnerUI ownerInfo = new InfoCardOwnerUI();
                    ownerInfo.startInfoCardOwnerUI(finalMatchingOwners.get(finalI));
                });
                buttons.add(nextButton);
                panel.add(nextButton);
                frame.validate();
            }



        }
        if(e.getSource() == exitButton)
        {
            frame.setVisible(false);
            AdminMenu adminMenu= new AdminMenu();
            adminMenu.startAdminMenu(currentAdmin);
        }

    }
}
