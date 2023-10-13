import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class implements the GUI that allows an owner to look at all the places he has put up for rent
 */

public class ShowAllYourPlacesForRentUI implements ActionListener
{
    JFrame frame= new JFrame();
    JButton goBackButton= new JButton("Go back");
    JButton editButton= new JButton("Edit");

    JTextField choiceField = new JTextField();

    Owner currentOwner;

    JLabel showBookingsLabel = new JLabel("Your places that are up for renting:");
    JLabel choiceLabel = new JLabel("Which place do u want to edit(type the number of the place in the text field):");
    public void startShowAllYourPlacesForRentUI (Owner loggedInOwner)
    {
        currentOwner= loggedInOwner;
        int j=125;
        JLabel[] placesForRent= new JLabel[currentOwner.getNumberOfPlacesForRent()];
        for(int i = 0; i < currentOwner.getNumberOfPlacesForRent(); i++)
        {

            String numb= Integer.toString(i+1);
            PlaceToRent ownersPlace=currentOwner.getPlaceOfRenting(i);
            placesForRent[i]= new JLabel();
            placesForRent[i].setText("<html>"+numb+":" +" Type: " +ownersPlace.getType()+ " Location: " +ownersPlace.getLocation()+ " Price per day: " +ownersPlace.getPrice_per_day()+ "<br/>"+ " Square feet: " +ownersPlace.getSquare_feet()+ " Rooms: " +ownersPlace.getRooms()+ " Wifi: " +ownersPlace.hasWifi()+ " Parking: " +ownersPlace.hasParking()+" Heating: "+ownersPlace.hasHeating()+" Kitchen: "+ownersPlace.hasKitchen()+" Pool: "+ownersPlace.hasPool()+" Backyard: "+ownersPlace.hasBackyard()+" TV: "+ownersPlace.hasBackyard()+"<html>");
            placesForRent[i].setBounds(100,j,425,60);
            frame.add(placesForRent[i]);
            j+=50;
        }
        showBookingsLabel.setBounds(125,100,400,25);
        choiceLabel.setBounds(100,j+25,500,25);

        choiceField.setBounds(250,j+50,50,25);

        goBackButton.setBounds(150,j+100,100,25);
        goBackButton.setFocusable(false);
        goBackButton.addActionListener(this);

        editButton.setBounds(250,j+100,100,25);
        editButton.setFocusable(false);
        editButton.addActionListener(this);


        frame.add(goBackButton);
        frame.add(showBookingsLabel);
        frame.add(choiceLabel);
        frame.add(choiceField);
        frame.add(editButton);

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
        if(e.getSource()== editButton)
        {

            try {
                frame.setVisible(false);
                EditPlaceForRentUI editPlaceForRentUI= new EditPlaceForRentUI();
                int indexOfPlaceForRent = Integer.parseInt(choiceField.getText());
                currentOwner.getPlaceOfRenting(indexOfPlaceForRent-1).getType();
                editPlaceForRentUI.startEditPlaceForRentUI(currentOwner,indexOfPlaceForRent-1);
            }
            catch(Exception exception)
            {
                frame.setVisible(false);
                ShowAllYourPlacesForRentUI showAllYourPlacesForRentUI= new ShowAllYourPlacesForRentUI();
                showAllYourPlacesForRentUI.startShowAllYourPlacesForRentUI(currentOwner);
            }

        }

    }
}
