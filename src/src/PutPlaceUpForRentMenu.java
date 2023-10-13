import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

/**
 * This class implements the GUI for the process of putting a property up for rent
 */

public class PutPlaceUpForRentMenu implements ActionListener {

    Owner currentOwner;

    JFrame frame = new JFrame();

    JButton finishButton = new JButton("Finish");
    JButton cancelButton = new JButton("Cancel");

    JTextField countryField = new JTextField();
    JTextField cityField = new JTextField();
    JTextField streetNameField = new JTextField();
    JTextField streetNumberField = new JTextField();
    JTextField priceField = new JTextField();
    JTextField squareFeetField = new JTextField();
    JTextField roomsField = new JTextField();
    JTextArea descriptionField = new JTextArea();
    JTextField imageField1 = new JTextField();
    JTextField imageField2 = new JTextField();
    JTextField imageField3 = new JTextField();
    JTextField imageField4 = new JTextField();
    JTextField imageField5 = new JTextField();

    JCheckBox wifiBox = new JCheckBox("Wifi");
    JCheckBox parkingBox = new JCheckBox("Parking");
    JCheckBox kitchenBox = new JCheckBox("Kitchen");
    JCheckBox heatingBox = new JCheckBox("Heating");
    JCheckBox backyardBox = new JCheckBox("Backyard");
    JCheckBox tvBox = new JCheckBox("TV");
    JCheckBox poolBox = new JCheckBox("Pool");

    JRadioButton villaButton = new JRadioButton("Villa", true);
    JRadioButton apartmentButton = new JRadioButton("Apartment");
    JRadioButton hotelButton = new JRadioButton("Hotel");
    JRadioButton cabinButton = new JRadioButton("Cabin");
    JRadioButton cottageButton = new JRadioButton("Cottage");
    JRadioButton bungalowButton = new JRadioButton("Bungalow");

    JLabel countryLabel = new JLabel("Country:");
    JLabel cityLabel = new JLabel("City:");
    JLabel streetNameLabel = new JLabel("Street Name:");
    JLabel streetNumberLabel = new JLabel("Street Number:");
    JLabel priceLabel = new JLabel("Price:");
    JLabel squareFeetLabel = new JLabel("Square Feet:");
    JLabel roomsLabel = new JLabel("Number of Rooms:");
    JLabel descriptionLabel = new JLabel("Description:");
    JLabel imageLabel1 = new JLabel("Picture 1:");
    JLabel imageLabel2 = new JLabel("Picture 2 (Optional):");
    JLabel imageLabel3 = new JLabel("Picture 3 (Optional):");
    JLabel imageLabel4 = new JLabel("Picture 4 (Optional):");
    JLabel imageLabel5 = new JLabel("Picture 5 (Optional):");
    JLabel images = new JLabel("Name of image (including extension):");
    JLabel amenities = new JLabel("<html>Pick which of the following amenities <br/>your property possesses<html>");
    JLabel type = new JLabel("Pick the type of property");

    JLabel emptyCountry = new JLabel("Country field cannot be left empty");
    JLabel emptyCity = new JLabel("City field cannot be left empty");
    JLabel emptyStreetName = new JLabel("Street name field cannot be left empty");
    JLabel invalidStreetNumber = new JLabel("Street number value is invalid");
    JLabel priceInvalid = new JLabel("Price value is invalid");
    JLabel squareFeetInvalid = new JLabel("Square feet value is invalid");
    JLabel roomsInvalid = new JLabel("Rooms value is invalid");
    JLabel descriptionEmpty = new JLabel("Description cannot be left empty");
    JLabel imageLabelEmpty = new JLabel("You must include at least one image");
    JLabel imageLabel1Wrong = new JLabel("The picture does not exist");
    JLabel imageLabel2Wrong = new JLabel("The picture does not exist");
    JLabel imageLabel3Wrong = new JLabel("The picture does not exist");
    JLabel imageLabel4Wrong = new JLabel("The picture does not exist");
    JLabel imageLabel5Wrong = new JLabel("The picture does not exist");


    public PutPlaceUpForRentMenu(Owner owner) {

        currentOwner = owner;

        finishButton.setBounds(1200, 750, 80, 25);
        finishButton.addActionListener(this);
        cancelButton.setBounds(1300, 750, 80, 25);
        cancelButton.addActionListener(this);

        countryField.setBounds(180, 100, 200, 25);
        cityField.setBounds(180, 150, 200, 25);
        streetNameField.setBounds(180, 200, 200, 25);
        streetNumberField.setBounds(180, 250, 40, 25);
        priceField.setBounds(180, 300, 40, 25);
        squareFeetField.setBounds(180, 350, 40, 25);
        roomsField.setBounds(180, 400, 40, 25);
        descriptionField.setBounds(180, 450, 200, 100);
        descriptionField.setLineWrap(true);
        imageField1.setBounds(1130, 150, 200, 25);
        imageField2.setBounds(1130, 200, 200, 25);
        imageField3.setBounds(1130, 250, 200, 25);
        imageField4.setBounds(1130, 300, 200, 25);
        imageField5.setBounds(1130, 350, 200, 25);

        countryLabel.setBounds(50, 100, 100, 25);
        cityLabel.setBounds(50, 150, 100, 25);
        streetNameLabel.setBounds(50, 200, 100, 25);
        streetNumberLabel.setBounds(50, 250, 100, 25);
        priceLabel.setBounds(50, 300, 100, 25);
        squareFeetLabel.setBounds(50, 350, 100, 25);
        roomsLabel.setBounds(50, 400, 150, 25);
        descriptionLabel.setBounds(50, 450, 150, 25);
        images.setBounds(1000, 100, 250, 25);
        imageLabel1.setBounds(1000, 150, 150, 25);
        imageLabel2.setBounds(1000, 200, 150, 25);
        imageLabel3.setBounds(1000, 250, 150, 25);
        imageLabel4.setBounds(1000, 300, 150, 25);
        imageLabel5.setBounds(1000, 350, 150, 25);
        amenities.setBounds(600,100,250,35);
        type.setBounds(50, 570, 200, 25);

        wifiBox.setBounds(600, 150, 150, 25);
        parkingBox.setBounds(600, 200, 150, 25);
        kitchenBox.setBounds(600, 250, 150, 25);
        heatingBox.setBounds(600, 300, 150, 25);
        backyardBox.setBounds(600, 350, 150, 25);
        tvBox.setBounds(600, 400, 150, 25);
        poolBox.setBounds(600, 450, 150, 25);

        ButtonGroup group = new ButtonGroup();
        group.add(villaButton);
        group.add(apartmentButton);
        group.add(hotelButton);
        group.add(cabinButton);
        group.add(cottageButton);
        group.add(bungalowButton);

        villaButton.setBounds(50, 600, 100, 25);
        apartmentButton.setBounds(50, 630, 100, 25);
        hotelButton.setBounds(50, 660, 100, 25);
        cabinButton.setBounds(50, 690, 100, 25);
        cottageButton.setBounds(50, 720, 100, 25);
        bungalowButton.setBounds(50, 750, 100, 25);

        emptyCountry.setBounds(180,120,200,25);
        emptyCountry.setVisible(false);
        emptyCity.setBounds(180, 170, 200, 25);
        emptyCity.setVisible(false);
        emptyStreetName.setBounds(180, 220, 200, 25);
        emptyStreetName.setVisible(false);
        invalidStreetNumber.setBounds(180,270,200,25);
        invalidStreetNumber.setVisible(false);
        priceInvalid.setBounds(180, 320, 200, 25);
        priceInvalid.setVisible(false);
        squareFeetInvalid.setBounds(180, 370, 200, 25);
        squareFeetInvalid.setVisible(false);
        roomsInvalid.setBounds(180, 420, 200, 25);
        roomsInvalid.setVisible(false);
        descriptionEmpty.setBounds(180, 550, 200, 25);
        descriptionEmpty.setVisible(false);
        imageLabelEmpty.setBounds(1130, 170, 250, 25);
        imageLabelEmpty.setVisible(false);
        imageLabel1Wrong.setBounds(1130, 170, 250, 25);
        imageLabel1Wrong.setVisible(false);
        imageLabel2Wrong.setBounds(1130, 220, 250, 25);
        imageLabel2Wrong.setVisible(false);
        imageLabel3Wrong.setBounds(1130, 270, 250, 25);
        imageLabel3Wrong.setVisible(false);
        imageLabel4Wrong.setBounds(1130, 320, 250, 25);
        imageLabel4Wrong.setVisible(false);
        imageLabel5Wrong.setBounds(1130, 370, 250, 25);
        imageLabel5Wrong.setVisible(false);

        frame.add(finishButton);
        frame.add(cancelButton);
        frame.add(countryField);
        frame.add(countryLabel);
        frame.add(cityField);
        frame.add(cityLabel);
        frame.add(streetNameField);
        frame.add(streetNameLabel);
        frame.add(streetNumberField);
        frame.add(streetNumberLabel);
        frame.add(priceField);
        frame.add(priceLabel);
        frame.add(squareFeetField);
        frame.add(squareFeetLabel);
        frame.add(roomsField);
        frame.add(roomsLabel);
        frame.add(descriptionField);
        frame.add(descriptionLabel);
        frame.add(images);
        frame.add(imageField1);
        frame.add(imageLabel1);
        frame.add(imageField2);
        frame.add(imageLabel2);
        frame.add(imageField3);
        frame.add(imageLabel3);
        frame.add(imageField4);
        frame.add(imageLabel4);
        frame.add(imageField5);
        frame.add(imageLabel5);
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
        frame.add(emptyStreetName);
        frame.add(invalidStreetNumber);
        frame.add(priceInvalid);
        frame.add(squareFeetInvalid);
        frame.add(roomsInvalid);
        frame.add(descriptionEmpty);
        frame.add(imageLabelEmpty);
        frame.add(imageLabel1Wrong);
        frame.add(imageLabel2Wrong);
        frame.add(imageLabel3Wrong);
        frame.add(imageLabel4Wrong);
        frame.add(imageLabel5Wrong);

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String country = countryField.getText();
        String city = cityField.getText();
        String streetName = streetNameField.getText();
        String streetNumber = streetNumberField.getText();
        String price = priceField.getText();
        String squareFeet = squareFeetField.getText();
        String rooms = roomsField.getText();
        String description = descriptionField.getText();
        String image1 = imageField1.getText();
        String image2 = imageField2.getText();
        String image3 = imageField3.getText();
        String image4 = imageField4.getText();
        String image5 = imageField5.getText();
        boolean correctInfo = true;
        if (e.getSource() == finishButton)
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

            if (streetName.isEmpty()) {
                emptyStreetName.setVisible(true);
                correctInfo = false;
            } else {
                emptyStreetName.setVisible(false);
            }

            if (streetNumber.isEmpty() || !streetNumber.matches("[0-9]+") || Integer.parseInt(streetNumber) < 1) {
                invalidStreetNumber.setVisible(true);
                correctInfo = false;
            } else {
                invalidStreetNumber.setVisible(false);
            }

            if (price.isEmpty() || !price.matches("[0-9]+") || Integer.parseInt(price) < 1) {
                priceInvalid.setVisible(true);
                correctInfo = false;
            } else {
                priceInvalid.setVisible(false);
            }

            if (squareFeet.isEmpty() || !squareFeet.matches("[0-9]+") || Integer.parseInt(squareFeet) < 1) {
                squareFeetInvalid.setVisible(true);
                correctInfo = false;
            } else {
                squareFeetInvalid.setVisible(false);
            }

            if (rooms.isEmpty() || !rooms.matches("[0-9]+") || Integer.parseInt(rooms) < 1) {
                roomsInvalid.setVisible(true);
                correctInfo = false;
            } else {
                roomsInvalid.setVisible(false);
            }

            if (description.isEmpty()) {
                descriptionEmpty.setVisible(true);
                correctInfo = false;
            } else {
                descriptionEmpty.setVisible(false);
            }

            if (image1.isEmpty()) {
                imageLabelEmpty.setVisible(true);
                imageLabel1Wrong.setVisible(false);
                correctInfo = false;
            } else if (!(new File("src/images/" + image1).isFile())){
                imageLabelEmpty.setVisible(false);
                imageLabel1Wrong.setVisible(true);
                correctInfo = false;
            } else {
                imageLabelEmpty.setVisible(false);
                imageLabel1Wrong.setVisible(false);
            }

            if (!image2.isEmpty() && !(new File("src/images/" + image2).isFile())) {
                imageLabel2Wrong.setVisible(true);
                correctInfo = false;
            } else {
                imageLabel2Wrong.setVisible(false);
            }

            if (!image3.isEmpty() && !(new File("src/images/" + image3).isFile())) {
                imageLabel3Wrong.setVisible(true);
                correctInfo = false;
            } else {
                imageLabel3Wrong.setVisible(false);
            }

            if (!image4.isEmpty() && !(new File("src/images/" + image4).isFile())) {
                imageLabel4Wrong.setVisible(true);
                correctInfo = false;
            } else {
                imageLabel4Wrong.setVisible(false);
            }

            if (!image5.isEmpty() && !(new File("src/images/" + image5).isFile())) {
                imageLabel5Wrong.setVisible(true);
                correctInfo = false;
            } else {
                imageLabel5Wrong.setVisible(false);
            }

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

            boolean wifi = wifiBox.isSelected();
            boolean parking = parkingBox.isSelected();
            boolean kitchen = kitchenBox.isSelected();
            boolean heating = heatingBox.isSelected();
            boolean backyard = backyardBox.isSelected();
            boolean TV = tvBox.isSelected();
            boolean pool = poolBox.isSelected();

            ArrayList<String> images = new ArrayList<>();
            images.add(image1);
            if(!image2.isEmpty()) {
                images.add(image2);
            }
            if(!image3.isEmpty()) {
                images.add(image3);
            }
            if(!image4.isEmpty()) {
                images.add(image4);
            }
            if(!image5.isEmpty()) {
                images.add(image5);
            }


            if (correctInfo) {
                PlaceToRent place = new PlaceToRent(currentOwner,houseType,country,city,streetName,streetNumber,Integer.parseInt(price),Integer.parseInt(squareFeet), Integer.parseInt(rooms),wifi,parking,kitchen,heating,backyard,TV,pool,images,description);
                currentOwner.addPlace(place);
                frame.dispose();

            }
            /*OwnerMenu ownerMenu= new OwnerMenu();
            ownerMenu.startOwnerMenu(currentOwner);
            frame.setVisible(false);*/



        }
        else if(e.getSource() == cancelButton)
        {
            OwnerMenu ownerMenu= new OwnerMenu();
            ownerMenu.startOwnerMenu(currentOwner);
            frame.setVisible(false);
        }

    }
}
