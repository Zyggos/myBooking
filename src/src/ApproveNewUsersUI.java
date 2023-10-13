import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class implements the GUI for the new user approval process
 */

public class ApproveNewUsersUI implements ActionListener
{
    JFrame frame= new JFrame();
    JButton goBackButton= new JButton("Go back");
    JButton approveButton= new JButton("Approve");

    Admin currentAdmin;

    JLabel approvalsLabel = new JLabel("Your pending approvals:");
    JLabel noApprovalsLabel = new JLabel("There are no pending approvals.");
    JLabel indexLabel= new JLabel("Give the number of the user you want to approve");
    JTextField indexField= new JTextField();
    JLabel[] pendingOwners= new JLabel[UserBase.getPendingOwnersNumber()];

    public void startApproveNewUsersUI (Admin loggedInClient)
    {
        currentAdmin= loggedInClient;

        int j=125;

        if (UserBase.getPendingOwnersNumber() == 0)
        {
            noApprovalsLabel.setBounds(125,100,400,25);
            frame.add(noApprovalsLabel);

        }
        else
        {
            for (int i = 0; i < UserBase.getPendingOwnersNumber(); i++)
            {

                String numb = Integer.toString(i + 1);

                Owner pOwner = UserBase.getPendingOwner(i);
                approvalsLabel.setBounds(125,100,400,25);
                pendingOwners[i] = new JLabel();
                pendingOwners[i].setText(numb + ". " + "Email: " + pOwner.getEmail() + " First name: " + pOwner.getFirstName() + " Last name: " + pOwner.getLastName());
                pendingOwners[i].setBounds(100, j, 600, 25);
                frame.add(pendingOwners[i]);
                j += 25;
            }

            indexLabel.setBounds(100,j+25,500,25);
            indexField.setBounds(250,j+50,50,25);

            frame.add(indexField);
            frame.add(indexLabel);
        }

        goBackButton.setBounds(150,j+100,100,25);
        goBackButton.setFocusable(false);
        goBackButton.addActionListener(this);
        approveButton.setBounds(250,j+100,100,25);
        approveButton.setFocusable(false);
        approveButton.addActionListener(this);


        frame.add(goBackButton);
        frame.add(approvalsLabel);
        frame.add(approveButton);

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
        if(e.getSource()== approveButton)
        {
            try
            {
                int index= Integer.parseInt(indexField.getText());
                Owner approvedUser = UserBase.getPendingOwner(index - 1);
                currentAdmin.approveOwner(approvedUser);
                frame.setVisible(false);
                ApproveNewUsersUI approveNewUsersUI= new ApproveNewUsersUI();
                approveNewUsersUI.startApproveNewUsersUI(currentAdmin);
            }
            catch(Exception exception)
            {
                frame.setVisible(false);
                ApproveNewUsersUI approveNewUsersUI= new ApproveNewUsersUI();
                approveNewUsersUI.startApproveNewUsersUI(currentAdmin);
            }

        }

    }
}
