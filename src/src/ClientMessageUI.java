import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class implements the GUI where the client can look at his incoming messages
 */

public class ClientMessageUI implements ActionListener
{
    JFrame frame= new JFrame();
    JButton goBackButton= new JButton("Go back");

    Client currentClient;

    JLabel showMessagesLabel = new JLabel("These are your messages:");
    JLabel noMessagesLabel = new JLabel("You have no messages.");


    public void startClientMessagesUI(Client loggedInClient)
    {

        currentClient= loggedInClient;

        JLabel[] messagesLabel = new JLabel[currentClient.getSizeMessages()];

        int j=150;
        if(currentClient.getSizeMessages() == 0)
        {
            noMessagesLabel.setBounds(125,100,400,25);
            frame.add(noMessagesLabel);
        }
        else
        {
            showMessagesLabel.setBounds(125,100,400,25);
            frame.add(showMessagesLabel);
            for(int i=0; i < currentClient.getSizeMessages();i++ )
            {
                messagesLabel[i]= new JLabel();
                messagesLabel[i].setText(currentClient.getMessage(i).toString() );
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
            ClientMenu clientMenu= new ClientMenu();
            clientMenu.startClientMenu(currentClient);
            frame.setVisible(false);
        }
    }
}
