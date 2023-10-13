import javax.swing.*;

/**
 * This class implements the owner's info tab
 */

public class InfoCardOwnerUI
{
    JFrame frame= new JFrame();



    Owner currentOwner;
    JLabel infoLabel = new JLabel("Basic information:");
    JLabel totalLabel = new JLabel("Total bookings and cancels of your places:");
    JLabel fullNameLabel = new JLabel();
    JLabel emailLabel = new JLabel();
    JLabel phoneLabel = new JLabel();
    JLabel countryLabel = new JLabel();
    JLabel cityLabel = new JLabel();
    JLabel addressLabel = new JLabel();
    JLabel noPlacesLabel = new JLabel(" No places have been added.");

    public void startInfoCardOwnerUI (Owner loggedInOwner)
    {
        currentOwner= loggedInOwner;


        fullNameLabel.setText("Full Name:"+currentOwner.getFirstName()+" "+currentOwner.getLastName());
        emailLabel.setText("Email:"+currentOwner.getEmail());
        phoneLabel.setText("Phone number:"+currentOwner.getPhoneNumber());
        countryLabel.setText("Country:"+currentOwner.getCountry());
        cityLabel.setText("City:"+currentOwner.getCity());
        addressLabel.setText("Address:"+currentOwner.getStreetName()+" "+currentOwner.getStreetNumber());

        currentOwner= loggedInOwner;
        int j=275;
        JLabel[] placesForRent= new JLabel[currentOwner.getNumberOfPlacesForRent()];
        if(currentOwner.getNumberOfPlacesForRent() == 0)
        {
            noPlacesLabel.setBounds(150, j, 400, 25);
            frame.add(noPlacesLabel);
        }
        else {
            for (int i = 0; i < currentOwner.getNumberOfPlacesForRent(); i++) {

                String numb = Integer.toString(i + 1);
                PlaceToRent ownersPlace = currentOwner.getPlaceOfRenting(i);
                placesForRent[i] = new JLabel();
                placesForRent[i].setText(numb + ":" + " Type: " + ownersPlace.getType() + " Location: " + ownersPlace.getLocation() + " Total bookings: " + ownersPlace.getAllTime_total_bookings() + " Total cancels: " + ownersPlace.getTotal_cancelled_bookings());
                placesForRent[i].setBounds(100, j, 500, 50);
                frame.add(placesForRent[i]);
                j += 25;
            }
        }
            infoLabel.setBounds(125, 100, 400, 25);
            fullNameLabel.setBounds(125, 125, 400, 25);
            emailLabel.setBounds(125, 140, 400, 25);
            phoneLabel.setBounds(125, 155, 400, 25);
            countryLabel.setBounds(125, 170, 400, 25);
            cityLabel.setBounds(125, 185, 400, 25);
            addressLabel.setBounds(125, 200, 400, 25);
            totalLabel.setBounds(125, 250, 400, 25);




            frame.add(infoLabel);
            frame.add(fullNameLabel);
            frame.add(emailLabel);
            frame.add(phoneLabel);
            frame.add(countryLabel);
            frame.add(cityLabel);
            frame.add(addressLabel);
            frame.add(totalLabel);



        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);

    }

}
