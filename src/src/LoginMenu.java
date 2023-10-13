import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class implements the GUI of the log in process
 */

public class LoginMenu implements ActionListener
{
    JFrame frame= new JFrame();
    JButton loginButton= new JButton("Login");
    JButton registerButton= new JButton("Register");
    JButton exitButton = new JButton("EXIT");
    JTextField emailField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel emailLabel = new JLabel("Email:");
    JLabel userPasswordLabel = new JLabel("Password:");
    JLabel falseInfo = new JLabel("There is no user with the details you have provided");

    public LoginMenu()
    {


        emailLabel.setBounds(50,100,75,25);
        userPasswordLabel.setBounds(50,150,75,25);
        falseInfo.setBounds(50,175,400,25);
        falseInfo.setVisible(false);

        emailField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);

        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        registerButton.setBounds(225,200,100,25);
        registerButton.setFocusable(false);
        registerButton.addActionListener(this);

        exitButton.setBounds(175,250,100,25);
        exitButton.setFocusable(false);
        exitButton.addActionListener(this);

        frame.add(emailLabel);
        frame.add(userPasswordLabel);

        frame.add(emailField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(registerButton);
        frame.add(exitButton);
        frame.add(falseInfo);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }






    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == registerButton)
        {
            frame.setVisible(false);
            RegisterMenu registerMenu= new RegisterMenu();
        }
        if(e.getSource()==loginButton)
        {
            LogInLogic logic = new LogInLogic();
            logic.setEmail(emailField.getText());
            logic.setPassword(String.valueOf(userPasswordField.getPassword()));
            if(logic.verifyInfo()){
                frame.dispose();
            } else {
                falseInfo.setVisible(true);

            }

        }
        if(e.getSource() == exitButton) {
            frame.dispose();
            Main.run = false;
        }

    }
}
