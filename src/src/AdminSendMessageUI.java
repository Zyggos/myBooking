import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

/**
 * This class implements the GUI for the messaging process, where the Admin who is currently logged
 * in sends a message to a user of his choice, by specifying their email.
 */

public class AdminSendMessageUI implements ActionListener
{
    JFrame frame= new JFrame();
    JButton goBackButton= new JButton("Go back");
    JButton sendButton= new JButton("Send");

    JTextArea messageField = new JTextArea();
    JTextField emailField = new JTextField();

    Admin currentAdmin;

    JLabel personLabel = new JLabel("What is the email of the user you want to send a message to?");
    JLabel emailLabel = new JLabel("Email:");
    JLabel messageLabel = new JLabel("What is your message?");
    JLabel messageSent = new JLabel("Your message has been sent successfully");
    JLabel messageNotSent = new JLabel("There is no such user");

    public void startAdminSendMessageUI (Admin loggedInAdmin)
    {
        currentAdmin= loggedInAdmin;


        personLabel.setBounds(125,100,400,25);
        emailLabel.setBounds(125,125,100,25);
        messageLabel.setBounds(150,175,700,25);
        messageSent.setBounds(125,150,500,25);
        messageSent.setVisible(false);
        messageNotSent.setBounds(175,150, 400, 25);
        messageNotSent.setVisible(false);

        emailField.setBounds(200,125,100,25);
        messageField.setBounds(125,200,400,200);
        messageField.setLineWrap(true);

        goBackButton.setBounds(150,500,100,25);
        goBackButton.setFocusable(false);
        goBackButton.addActionListener(this);
        sendButton.setBounds(250,500,100,25);
        sendButton.setFocusable(false);
        sendButton.addActionListener(this);


        frame.add(goBackButton);
        frame.add(personLabel);
        frame.add(messageLabel);
        frame.add(emailLabel);


        frame.add(messageField);
        frame.add(emailField);
        frame.add(sendButton);
        frame.add(messageSent);
        frame.add(messageNotSent);

        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        boolean sent = false;
        if(e.getSource()== goBackButton)
        {
           AdminMenu adminMenu= new AdminMenu();
           adminMenu.startAdminMenu(currentAdmin);
            frame.setVisible(false);
        }
        if(e.getSource() == sendButton)
        {
            for (int i = 0; i < UserBase.getClientsNumber(); i++) {
                if (Objects.equals(UserBase.getClient(i).getEmail(), emailField.getText())) {
                    currentAdmin.sendMessage(UserBase.getClient(i),messageField.getText());
                    sent = true;
                    messageSent.setVisible(true);
                    messageNotSent.setVisible(false);
                }
            }

            for(int i = 0; i < UserBase.getOwnersNumber(); i++) {
                if (Objects.equals(UserBase.getOwner(i).getEmail(), emailField.getText())) {
                    currentAdmin.sendMessage(UserBase.getOwner(i),messageField.getText());
                    sent = true;
                    messageSent.setVisible(true);
                    messageNotSent.setVisible(false);
                }
            }
            if (!sent) {
                messageNotSent.setVisible(true);
                messageSent.setVisible(false);
            }
        }

    }
}
