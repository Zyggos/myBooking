import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class implements the GUI for the registration process
 */

public class RegisterMenu implements ActionListener
{
    JFrame frame= new JFrame();
    JButton CreateAccountButton= new JButton("Create Account");
    JButton cancelButton= new JButton("Cancel");
    JTextField emailField = new JTextField();
    JTextField firstNameField = new JTextField();
    JTextField lastNameField = new JTextField();
    JTextField phoneNumberField = new JTextField();
    JTextField countryField = new JTextField();
    JTextField cityField= new JTextField();
    JTextField streetNameField = new JTextField();
    JTextField streetNumberField= new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel emailLabel = new JLabel("Email:");
    JLabel userPasswordLabel = new JLabel("Password:");
    JLabel firstNameLabel = new JLabel("First Name:");
    JLabel lastNameLabel = new JLabel("Last Name:");
    JLabel phoneNumberLabel = new JLabel("Phone number:");
    JLabel countryLabel = new JLabel("Country:");
    JLabel cityLabel= new JLabel("City:");
    JLabel streetNameLabel = new JLabel("Street name:");
    JLabel streetNumberLabel= new JLabel("Street number:");
    JLabel typeOfUserLabel= new JLabel("Owner or Client:");
    JLabel emptyEmail = new JLabel("E-mail field cannot be left empty");
    JLabel wrongDomainEmail = new JLabel("Accepted e-mail types are: @gmail.com, @yahoo.com, @hotmail.com and @csd.auth.gr");
    JLabel emailInUse = new JLabel("That e-mail is already in use");
    JLabel passwordShort = new JLabel("Password must be at least 4 characters long");
    JLabel firstNameEmpty = new JLabel("First name field cannot be left empty");
    JLabel lastNameEmpty = new JLabel("Last name field cannot be left empty");
    JLabel phoneNumberInvalid = new JLabel("Phone number must be 10 digits long");
    JLabel countryEmpty = new JLabel("Country field cannot be left empty");
    JLabel cityEmpty = new JLabel("City field cannot be left empty");
    JLabel streetNameEmpty = new JLabel("Street name field cannot be left empty");
    JLabel streetNumberInvalid = new JLabel("Street number must be an integer");

    JRadioButton typeOfUserClient = new JRadioButton("Client", true);
    JRadioButton typeOfUserOwner = new JRadioButton("Owner",  false);

    public RegisterMenu()
    {

        emptyEmail.setBounds(185, 120, 300, 25);
        wrongDomainEmail.setBounds(10, 120, 500, 25);
        emailInUse.setBounds(185, 120, 300, 25);
        passwordShort.setBounds(150, 170, 300, 25);
        firstNameEmpty.setBounds(170, 220, 300, 25);
        lastNameEmpty.setBounds(170, 270, 300, 25);
        phoneNumberInvalid.setBounds(170, 320, 300, 25);
        countryEmpty.setBounds(170, 370, 300, 25);
        cityEmpty.setBounds(170, 420, 300, 25);
        streetNameEmpty.setBounds(170, 470, 300, 25);
        streetNumberInvalid.setBounds(170, 520, 300, 25);
        emptyEmail.setVisible(false);
        wrongDomainEmail.setVisible(false);
        emailInUse.setVisible(false);
        passwordShort.setVisible(false);
        firstNameEmpty.setVisible(false);
        lastNameEmpty.setVisible(false);
        phoneNumberInvalid.setVisible(false);
        countryEmpty.setVisible(false);
        cityEmpty.setVisible(false);
        streetNameEmpty.setVisible(false);
        streetNumberInvalid.setVisible(false);

        frame.add(emptyEmail);
        frame.add(wrongDomainEmail);
        frame.add(emailInUse);
        frame.add(passwordShort);
        frame.add(firstNameEmpty);
        frame.add(lastNameEmpty);
        frame.add(phoneNumberInvalid);
        frame.add(countryEmpty);
        frame.add(cityEmpty);
        frame.add(streetNameEmpty);
        frame.add(streetNumberInvalid);


        ButtonGroup group = new ButtonGroup();
        group.add(typeOfUserClient);
        group.add(typeOfUserOwner);

        typeOfUserClient.setBounds(50,550,150,25);
        typeOfUserOwner.setBounds(250, 550, 150, 25);
        frame.add(typeOfUserClient);
        frame.add(typeOfUserOwner);

        emailLabel.setBounds(50,100,100,25);
        userPasswordLabel.setBounds(50,150,110,25);
        firstNameLabel.setBounds(50,200,100,25);
        lastNameLabel.setBounds(50,250,100,25);
        phoneNumberLabel.setBounds(50,300,100,25);
        countryLabel.setBounds(50,350,100,25);
        cityLabel.setBounds(50,400,100,25);
        streetNameLabel.setBounds(50,450,100,25);
        streetNumberLabel.setBounds(50,500,100,25);
        typeOfUserLabel.setBounds(50,550,150,25);

        emailField.setBounds(180,100,200,25);
        userPasswordField.setBounds(180,150,200,25);
        firstNameField.setBounds(180,200,200,25);
        lastNameField.setBounds(180,250,200,25);
        phoneNumberField.setBounds(180,300,200,25);
        countryField.setBounds(180,350,200,25);
        cityField.setBounds(180,400,200,25);
        streetNameField.setBounds(180,450,200,25);
        streetNumberField.setBounds(180,500,200,25);

        CreateAccountButton.setBounds(125,600,125,25);
        CreateAccountButton.setFocusable(false);
        CreateAccountButton.addActionListener(this);
        cancelButton.setBounds(250,600,100,25);
        cancelButton.setFocusable(false);
        cancelButton.addActionListener(this);



        frame.add(emailLabel);
        frame.add(userPasswordLabel);
        frame.add(firstNameLabel);
        frame.add(lastNameLabel);
        frame.add(phoneNumberLabel);
        frame.add(countryLabel);
        frame.add(cityLabel);
        frame.add(streetNameLabel);
        frame.add(streetNumberLabel);

        frame.add(emailField);
        frame.add(userPasswordField);
        frame.add(firstNameField);
        frame.add(lastNameField);
        frame.add(phoneNumberField);
        frame.add(countryField);
        frame.add(cityField);
        frame.add(streetNameField);
        frame.add(streetNumberField);

        frame.add(CreateAccountButton);
        frame.add(cancelButton);


        frame.setSize(420,800);
        frame.setLayout(null);
        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == CreateAccountButton)
        {
            RegistrationLogic logic = new RegistrationLogic();
            String email = emailField.getText();
            String password = String.valueOf(userPasswordField.getPassword());
            String firstName= firstNameField.getText();
            String lastName= lastNameField.getText();
            String phoneNumber= phoneNumberField.getText();
            String country=countryField.getText();
            String city=cityField.getText();
            String streetName=streetNameField.getText();
            String streetNumber = streetNumberField.getText();
            boolean correctInfo = true;

            if (logic.setEmail(email) == 'E') {
                emptyEmail.setVisible(true);
                wrongDomainEmail.setVisible(false);
                emailInUse.setVisible(false);
                correctInfo = false;
            } else if (logic.setEmail(email) == 'W') {
                wrongDomainEmail.setVisible(true);
                emailInUse.setVisible(false);
                emptyEmail.setVisible(false);
                correctInfo = false;
            } else if (logic.setEmail(email) == 'U') {
                emailInUse.setVisible(true);
                wrongDomainEmail.setVisible(false);
                emptyEmail.setVisible(false);
                correctInfo = false;
            } else {
                emptyEmail.setVisible(false);
                wrongDomainEmail.setVisible(false);
                emailInUse.setVisible(false);
            }

            if(!logic.setPassword(password)) {
                passwordShort.setVisible(true);
                correctInfo = false;
            } else {
                passwordShort.setVisible(false);
            }

            if (!logic.setFirstName(firstName)) {
                firstNameEmpty.setVisible(true);
                correctInfo = false;
            } else {
                firstNameEmpty.setVisible(false);
            }

            if (!logic.setLastName(lastName)) {
                lastNameEmpty.setVisible(true);
                correctInfo = false;
            } else {
                lastNameEmpty.setVisible(false);
            }

            if(!logic.setPhoneNumber(phoneNumber)) {
                phoneNumberInvalid.setVisible(true);
                correctInfo = false;
            } else {
                phoneNumberInvalid.setVisible(false);
            }

            if(!logic.setCountry(country)) {
                countryEmpty.setVisible(true);
                correctInfo = false;
            } else {
                countryEmpty.setVisible(false);
            }

            if(!logic.setCity(city)) {
                cityEmpty.setVisible(true);
                correctInfo = false;
            } else {
                cityEmpty.setVisible(false);
            }

            if(!logic.setStreetName(streetName)) {
                streetNameEmpty.setVisible(true);
                correctInfo = false;
            } else {
                streetNameEmpty.setVisible(false);
            }

            if(!logic.setStreetNumber(streetNumber)) {
                streetNumberInvalid.setVisible(true);
                correctInfo = false;
            } else {
                streetNumberInvalid.setVisible(false);
            }

            if(typeOfUserClient.isSelected()){
                logic.setUserType('C');
            } else {
                logic.setUserType('O');
            }

            if (correctInfo) {
            logic.addNewUser();
            frame.dispose();
            LoginMenu loginMenu= new LoginMenu();
            }


        }
        if(e.getSource()==cancelButton)
        {
            frame.setVisible(false);
            LoginMenu loginMenu= new LoginMenu();
        }

    }
}

