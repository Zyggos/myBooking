import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class implements the GUI for the removal of a place that an owner has put up for renting
 */

public class RemovePlaceForRentUI implements ActionListener
{
    JFrame frame= new JFrame();
    JButton goBackButton= new JButton("Go back");
    JButton removeButton= new JButton("Remove");

    JTextField choiceField = new JTextField();

    Owner currentOwner;

    JLabel showPlacesLabel = new JLabel("Your places that are up for renting:");
    JLabel choiceLabel = new JLabel("Which place do u want to remove(type the number of the place in the text field):");
    public void startRemovePlaceForRentUI (Owner loggedInOwner)
    {
        currentOwner= loggedInOwner;
        int j=125;
        JLabel[] placesForRent= new JLabel[currentOwner.getNumberOfPlacesForRent()];
        for(int i = 0; i < currentOwner.getNumberOfPlacesForRent(); i++)
        {

            String numb= Integer.toString(i+1);
            PlaceToRent ownersPlace=currentOwner.getPlaceOfRenting(i);
            placesForRent[i]= new JLabel();
            placesForRent[i].setText("<html>"+numb+":" +" Type: " +ownersPlace.getType()+ " Location: " +ownersPlace.getLocation()+ " Price per day: " +ownersPlace.getPrice_per_day()+ " Square feet: " +ownersPlace.getSquare_feet()+ "<br/>"+ " Rooms: " +ownersPlace.getRooms()+ " Wifi: " +ownersPlace.hasWifi()+ " Parking: " +ownersPlace.hasParking()+" Heating: "+ownersPlace.hasHeating()+" Kitchen: "+ownersPlace.hasKitchen()+" Pool: "+ownersPlace.hasPool()+" Backyard: "+ownersPlace.hasBackyard()+" TV: "+ownersPlace.hasBackyard()+"<html>" );
            placesForRent[i].setBounds(100,j,425,60);
            frame.add(placesForRent[i]);
            currentOwner.getPlaceOfRenting(i).showPlaceInfo();
            j+=50;
        }
        showPlacesLabel.setBounds(125,100,400,25);
        choiceLabel.setBounds(100,j+25,500,25);

        choiceField.setBounds(250,j+50,50,25);

        goBackButton.setBounds(150,j+100,100,25);
        goBackButton.setFocusable(false);
        goBackButton.addActionListener(this);
        removeButton.setBounds(250,j+100,100,25);
        removeButton.setFocusable(false);
        removeButton.addActionListener(this);

        frame.add(goBackButton);
        frame.add(showPlacesLabel);
        frame.add(choiceLabel);
        frame.add(choiceField);
        frame.add(removeButton);


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
        if(e.getSource()== removeButton)
        {
            try {
                int indexOfPlaceForRent= Integer.parseInt(choiceField.getText());
                currentOwner.removePlaceOfRenting(indexOfPlaceForRent-1);
                frame.setVisible(false);
                RemovePlaceForRentUI removePlaceForRentUI= new RemovePlaceForRentUI();
                removePlaceForRentUI.startRemovePlaceForRentUI(currentOwner);
            }
            catch(Exception exception)
            {
                frame.setVisible(false);
                RemovePlaceForRentUI removePlaceForRentUI= new RemovePlaceForRentUI();
                removePlaceForRentUI.startRemovePlaceForRentUI(currentOwner);
            }


        }

    }
}
