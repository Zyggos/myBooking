import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * This class implements the GUI for the place search process
 */

public class PlaceToRentSearchMenu implements ActionListener {

    Client currentClient;

    JPanel panel = new JPanel(new GridLayout(10, 1, 0, 0));


    JScrollPane scrollPane = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);


    JFrame frame = new JFrame();


    JButton searchButton = new JButton("Search");
    JButton cancelButton = new JButton("Cancel");

    JTextField countryField = new JTextField();
    JTextField cityField = new JTextField();
    JTextField minPriceField = new JTextField();
    JTextField maxPriceField = new JTextField();
    JTextField minSquareFeetField = new JTextField();
    JTextField maxSquareFeetField = new JTextField();
    JTextField minRoomsField = new JTextField();
    JTextField maxRoomsField = new JTextField();


    JCheckBox wifiBox = new JCheckBox("Wifi");
    JCheckBox parkingBox = new JCheckBox("Parking");
    JCheckBox kitchenBox = new JCheckBox("Kitchen");
    JCheckBox heatingBox = new JCheckBox("Heating");
    JCheckBox backyardBox = new JCheckBox("Backyard");
    JCheckBox tvBox = new JCheckBox("TV");
    JCheckBox poolBox = new JCheckBox("Pool");

    JRadioButton villaButton = new JRadioButton("Villa");
    JRadioButton apartmentButton = new JRadioButton("Apartment");
    JRadioButton hotelButton = new JRadioButton("Hotel");
    JRadioButton cabinButton = new JRadioButton("Cabin");
    JRadioButton cottageButton = new JRadioButton("Cottage");
    JRadioButton bungalowButton = new JRadioButton("Bungalow");

    JLabel countryLabel = new JLabel("Country:");
    JLabel cityLabel = new JLabel("City:");
    JLabel minPriceLabel = new JLabel("Min Price:");
    JLabel maxPriceLabel = new JLabel("Max Price:");
    JLabel minSquareFeetLabel = new JLabel("Min Square Feet:");
    JLabel maxSquareFeetLabel = new JLabel("Max Square Feet:");
    JLabel minRoomsLabel = new JLabel("Min Number of Rooms:");
    JLabel maxRoomsLabel = new JLabel("Max Number of Rooms:");
    JLabel amenities = new JLabel("<html>Pick which of the following amenities <br/>are a requirement<html>");
    JLabel type = new JLabel("Pick the type of property");

    JLabel emptyCountry = new JLabel("Country field cannot be left empty");
    JLabel emptyCity = new JLabel("City field cannot be left empty");
    JLabel priceInvalid = new JLabel("<html>The price values you have<br/> chosen are invalid<html>");
    JLabel squareFeetInvalid = new JLabel("<html>The square feet values<br/> you have chosen are invalid<html>");
    JLabel roomsInvalid = new JLabel("<html>The rooms numbers you have<br/> chosen are invalid<html>");



    public PlaceToRentSearchMenu(Client client) {

        currentClient = client;

        scrollPane.setBounds(1000,100,400, 650);
        frame.add(scrollPane);

        searchButton.setBounds(500, 730, 80, 25);
        searchButton.addActionListener(this);
        cancelButton.setBounds(600, 730, 80, 25);
        cancelButton.addActionListener(this);

        countryField.setBounds(185, 100, 200, 25);
        cityField.setBounds(185, 150, 200, 25);
        minPriceField.setBounds(185, 200, 40, 25);
        maxPriceField.setBounds(185, 250,40, 25);
        minSquareFeetField.setBounds(185, 300, 40, 25);
        maxSquareFeetField.setBounds(185, 350, 40, 25);
        minRoomsField.setBounds(185, 400, 40, 25);
        maxRoomsField.setBounds(185, 450, 40, 25);


        countryLabel.setBounds(50, 100, 100, 25);
        cityLabel.setBounds(50, 150, 100, 25);
        minPriceLabel.setBounds(50, 200, 100, 25);
        maxPriceLabel.setBounds(50, 250, 100, 25);
        minSquareFeetLabel.setBounds(50, 300, 100, 25);
        maxSquareFeetLabel.setBounds(50, 350, 100, 25);
        minRoomsLabel.setBounds(50, 400, 150, 25);
        maxRoomsLabel.setBounds(50, 450, 150, 25);
        type.setBounds(50, 520, 350, 25);

        amenities.setBounds(500,100,250,35);
        wifiBox.setBounds(500, 150, 150, 25);
        parkingBox.setBounds(500, 200, 150, 25);
        kitchenBox.setBounds(500, 250, 150, 25);
        heatingBox.setBounds(500, 300, 150, 25);
        backyardBox.setBounds(500, 350, 150, 25);
        tvBox.setBounds(500, 400, 150, 25);
        poolBox.setBounds(500, 450, 150, 25);


        villaButton.setBounds(50, 550, 100, 25);
        apartmentButton.setBounds(50, 580, 100, 25);
        hotelButton.setBounds(50, 610, 100, 25);
        cabinButton.setBounds(50, 640, 100, 25);
        cottageButton.setBounds(50, 670, 100, 25);
        bungalowButton.setBounds(50, 700, 100, 25);

        ButtonGroup group = new ButtonGroup();
        group.add(villaButton);
        group.add(apartmentButton);
        group.add(hotelButton);
        group.add(cabinButton);
        group.add(cottageButton);
        group.add(bungalowButton);

        emptyCountry.setBounds(185,120,200,25);
        emptyCountry.setVisible(false);
        emptyCity.setBounds(185, 170, 200, 25);
        emptyCity.setVisible(false);
        priceInvalid.setBounds(235, 222, 200, 25);
        priceInvalid.setVisible(false);
        squareFeetInvalid.setBounds(235, 322, 200, 25);
        squareFeetInvalid.setVisible(false);
        roomsInvalid.setBounds(235, 422, 200, 25);
        roomsInvalid.setVisible(false);


        frame.add(searchButton);
        frame.add(cancelButton);

        frame.add(countryField);
        frame.add(countryLabel);
        frame.add(cityField);
        frame.add(cityLabel);
        frame.add(minPriceField);
        frame.add(minPriceLabel);
        frame.add(minSquareFeetField);
        frame.add(minSquareFeetLabel);
        frame.add(minRoomsField);
        frame.add(minRoomsLabel);
        frame.add(maxPriceField);
        frame.add(maxPriceLabel);
        frame.add(maxSquareFeetLabel);
        frame.add(maxSquareFeetField);
        frame.add(maxRoomsLabel);
        frame.add(maxRoomsField);


        frame.add(amenities);
        frame.add(wifiBox);
        frame.add(parkingBox);
        frame.add(kitchenBox);
        frame.add(heatingBox);
        frame.add(backyardBox);
        frame.add(tvBox);
        frame.add(poolBox);

        frame.add(type);
        frame.add(villaButton);
        frame.add(apartmentButton);
        frame.add(hotelButton);
        frame.add(cabinButton);
        frame.add(cottageButton);
        frame.add(bungalowButton);

        frame.add(emptyCountry);
        frame.add(emptyCity);
        frame.add(priceInvalid);
        frame.add(squareFeetInvalid);
        frame.add(roomsInvalid);



        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        ArrayList<PlaceToRent> matchingPlaces;

        String country = countryField.getText();
        String city = cityField.getText();
        String minPrice = minPriceField.getText();
        String maxPrice = maxPriceField.getText();
        String minSquareFeet = minSquareFeetField.getText();
        String maxSquareFeet = maxSquareFeetField.getText();
        String minRooms = minRoomsField.getText();
        String maxRooms = maxRoomsField.getText();
        boolean wifi = wifiBox.isSelected();
        boolean parking = parkingBox.isSelected();
        boolean kitchen = kitchenBox.isSelected();
        boolean heating = heatingBox.isSelected();
        boolean backyard = backyardBox.isSelected();
        boolean TV = tvBox.isSelected();
        boolean pool = poolBox.isSelected();

        String houseType = "";
        if (villaButton.isSelected()) {
            houseType = "Villa";
        } else if (apartmentButton.isSelected()) {
            houseType = "Apartment";
        } else if (hotelButton.isSelected()) {
            houseType = "Hotel";
        } else if (cabinButton.isSelected()) {
            houseType = "Cabin";
        } else if (cottageButton.isSelected()) {
            houseType = "Cottage";
        } else if (bungalowButton.isSelected()) {
            houseType = "Bungalow";
        }

        boolean correctInfo = true;


        if (e.getSource() == searchButton)
        {
            if (country.isEmpty()) {
                emptyCountry.setVisible(true);
                correctInfo = false;
            } else {
                emptyCountry.setVisible(false);
            }

            if (city.isEmpty()) {
                emptyCity.setVisible(true);
                correctInfo = false;
            } else {
                emptyCity.setVisible(false);
            }

            if (!minPrice.matches("[0-9]+") || !maxPrice.matches("[0-9]+") || Integer.parseInt(minPrice) < 0 || Integer.parseInt(maxPrice) < Integer.parseInt(minPrice)) {
                priceInvalid.setVisible(true);
                correctInfo = false;
            } else {
                priceInvalid.setVisible(false);
            }

            if ((!minSquareFeet.matches("[0-9]+") || !maxSquareFeet.matches("[0-9]+") || Integer.parseInt(minSquareFeet) < 0 || Integer.parseInt(maxSquareFeet) < Integer.parseInt(minSquareFeet))) {
                squareFeetInvalid.setVisible(true);
                correctInfo = false;
            } else {
                squareFeetInvalid.setVisible(false);
            }

            if (!minRooms.matches("[0-9]+") || !maxRooms.matches("[0-9]+") || Integer.parseInt(minRooms) < 0 || Integer.parseInt(maxRooms) < Integer.parseInt(minRooms)) {
                roomsInvalid.setVisible(true);
                correctInfo = false;
            }  else {
                roomsInvalid.setVisible(false);
            }


            if (correctInfo) {
                panel.removeAll();
                panel.revalidate();
                panel.repaint();
                ArrayList<JButton> buttons = new ArrayList<>();
                PlaceToRentSearchLogic search = new PlaceToRentSearchLogic(houseType,country,city,Integer.parseInt(minPrice),Integer.parseInt(maxPrice),Integer.parseInt(minSquareFeet),Integer.parseInt(maxSquareFeet),Integer.parseInt(minRooms),Integer.parseInt(maxRooms),wifi,parking,kitchen,heating,backyard,TV,pool);
                matchingPlaces = search.search();
                for (int i = 0; i < matchingPlaces.size(); i++) {
                    JButton nextPlacePicture = new JButton();
                    int finalI = i;
                    nextPlacePicture.addActionListener(e1 -> {
                        PlaceToRentInfoUI placeToRentInfoUI = new PlaceToRentInfoUI(matchingPlaces.get(finalI), currentClient);
                    });
                    ImageIcon icon = new ImageIcon (new ImageIcon("src/images/" + matchingPlaces.get(i).getPictures().get(i)).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
                    nextPlacePicture.setIcon(icon);
                    buttons.add(nextPlacePicture);
                    JLabel nextPlaceDescription = new JLabel("<html>" + matchingPlaces.get(i).getCountry() + ", " +matchingPlaces.get(i).getCity() + "<br/>" + matchingPlaces.get(i).getDescription() + "<html>");
                    panel.add(nextPlaceDescription);
                    panel.add(nextPlacePicture);
                    frame.validate();
                }

            }

        }
        else if(e.getSource() == cancelButton)
        {
           ClientMenu clientMenu= new ClientMenu();
           clientMenu.startClientMenu(currentClient);
            frame.setVisible(false);
        }


    }
}
