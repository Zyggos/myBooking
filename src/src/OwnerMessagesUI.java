import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class implements the GUI through which the owner can check their incoming messages
 */

public class OwnerMessagesUI implements ActionListener
{
    JFrame frame= new JFrame();
    JButton goBackButton= new JButton("Go back");

    Owner currentOwner;

    JLabel showMessagesLabel = new JLabel("These are your messages:");
    JLabel noMessagesLabel = new JLabel("You have no messages.");


    public void startOwnerMessagesUI(Owner loggedInOwner)
    {
         currentOwner= loggedInOwner;

        JLabel[] messagesLabel = new JLabel[currentOwner.getSizeMessages()];

        int j=150;
        if(loggedInOwner.getSizeMessages() == 0)
        {
            noMessagesLabel.setBounds(125,100,400,25);
            frame.add(noMessagesLabel);
        }
        else
        {
            showMessagesLabel.setBounds(125,100,400,25);
            frame.add(showMessagesLabel);
            for(int i=0; i < currentOwner.getSizeMessages();i++ )
            {
                messagesLabel[i]= new JLabel();
                messagesLabel[i].setText(currentOwner.getMessage(i).toString() );
                messagesLabel[i].setBounds(125, j, 400, 25);
                frame.add(messagesLabel[i]);
                j+=25;
            }

        }


        goBackButton.setBounds(125,j+100,300,25);
        goBackButton.setFocusable(false);
        goBackButton.addActionListener(this);

        frame.add(goBackButton);


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
