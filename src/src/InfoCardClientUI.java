import javax.swing.*;

/**
 * This class implements the client's info tab
 */

public class InfoCardClientUI
{
    JFrame frame= new JFrame();



    Client currentClient;
    JLabel infoLabel = new JLabel("Basic information:");
    JLabel fullNameLabel = new JLabel();
    JLabel emailLabel = new JLabel();
    JLabel phoneLabel = new JLabel();
    JLabel countryLabel = new JLabel();
    JLabel cityLabel = new JLabel();
    JLabel addressLabel = new JLabel();


    public void startInfoCardClientUI (Client loggedInClient)
    {
        currentClient= loggedInClient;


        fullNameLabel.setText("Full Name:"+currentClient.getFirstName()+" "+currentClient.getLastName());
        emailLabel.setText("Email:"+currentClient.getEmail());
        phoneLabel.setText("Phone number:"+currentClient.getPhoneNumber());
        countryLabel.setText("Country:"+currentClient.getCountry());
        cityLabel.setText("City:"+currentClient.getCity());
        addressLabel.setText("Address:"+currentClient.getStreetName()+" "+currentClient.getStreetNumber());


        infoLabel.setBounds(125,100,400,25);
        fullNameLabel.setBounds(125,125,400,25);
        emailLabel.setBounds(125,140,400,25);
        phoneLabel.setBounds(125,155,400,25);
        countryLabel.setBounds(125,170,400,25);
        cityLabel.setBounds(125,185,400,25);
        addressLabel.setBounds(125,200,400,25);






        frame.add(infoLabel);
        frame.add(fullNameLabel);
        frame.add(emailLabel);
        frame.add(phoneLabel);
        frame.add(countryLabel);
        frame.add(cityLabel);
        frame.add(addressLabel);


        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);

    }

}
