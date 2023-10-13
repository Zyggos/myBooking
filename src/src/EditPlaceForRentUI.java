import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

/**
 * This class implements the GUI for the property detail editing process
 */

public class EditPlaceForRentUI implements ActionListener
{
    JFrame frame= new JFrame();

    JButton goBackButton= new JButton("Go back");
    JButton picturesButton = new JButton("Pictures");
    JButton typeButton = new JButton("Type(Villa,Condo ect)");
    JButton streetNameButton = new JButton("Street name");
    JButton streetNumberButton = new JButton("Street number");
    JButton cityButton = new JButton("City");
    JButton countryButton = new JButton("Country");
    JButton pricePerDayButton = new JButton("Price per day");
    JButton sqFeetButton = new JButton("Square feet");
    JButton roomsButton = new JButton("How many rooms");
    JButton wifiButton = new JButton("Does it have wifi(True/False)");
    JButton parkingButton= new JButton("Does it have parking(True/False)");
    JButton kitchenButton = new JButton("Does it have kitchen(True/False)");
    JButton heatingButton= new JButton("Does it have heating(True/False)");
    JButton backyardButton= new JButton("Does it have backyard(True/False)");
    JButton poolButton= new JButton("Does it have a pool(True/False)");
    JButton tvButton= new JButton("Does it have a tv(True/False)");

    Owner currentOwner;
    int index;
    JLabel messagesLabel = new JLabel("What do u want to change?");
    public void startEditPlaceForRentUI(Owner loggedInOwner, int indexOfPlaceForRent)
    {
        currentOwner= loggedInOwner;
        index= indexOfPlaceForRent;


        messagesLabel.setBounds(200,100,300,25);

        picturesButton.setBounds(125,200,300,25);
        picturesButton.setFocusable(false);
        picturesButton.addActionListener(this);

        typeButton.setBounds(125,225,300,25);
        typeButton.setFocusable(false);
        typeButton.addActionListener(this);

        streetNameButton.setBounds(125,250,300,25);
        streetNameButton.setFocusable(false);
        streetNameButton.addActionListener(this);

        streetNumberButton.setBounds(125,275,300,25);
        streetNumberButton.setFocusable(false);
        streetNumberButton.addActionListener(this);

        cityButton.setBounds(125,300,300,25);
        cityButton.setFocusable(false);
        cityButton.addActionListener(this);

        countryButton.setBounds(125,325,300,25);
        countryButton.setFocusable(false);
        countryButton.addActionListener(this);

        pricePerDayButton.setBounds(125,350,300,25);
        pricePerDayButton.setFocusable(false);
        pricePerDayButton.addActionListener(this);

        sqFeetButton.setBounds(125,375,300,25);
        sqFeetButton.setFocusable(false);
        sqFeetButton.addActionListener(this);

        roomsButton.setBounds(125,400,300,25);
        roomsButton.setFocusable(false);
        roomsButton.addActionListener(this);

        wifiButton.setBounds(125,425,300,25);
        wifiButton.setFocusable(false);
        wifiButton.addActionListener(this);

        parkingButton.setBounds(125,450,300,25);
        parkingButton.setFocusable(false);
        parkingButton.addActionListener(this);

        kitchenButton.setBounds(125,475,300,25);
        kitchenButton.setFocusable(false);
        kitchenButton.addActionListener(this);

        heatingButton.setBounds(125,500,300,25);
        heatingButton.setFocusable(false);
        heatingButton.addActionListener(this);

        backyardButton.setBounds(125,525,300,25);
        backyardButton.setFocusable(false);
        backyardButton.addActionListener(this);

        poolButton.setBounds(125,550,300,25);
        poolButton.setFocusable(false);
        poolButton.addActionListener(this);

        tvButton.setBounds(125,575,300,25);
        tvButton.setFocusable(false);
        tvButton.addActionListener(this);

        goBackButton.setBounds(125,600,300,25);
        goBackButton.setFocusable(false);
        goBackButton.addActionListener(this);

        frame.add(goBackButton);
        frame.add(messagesLabel);
        frame.add(picturesButton);
        frame.add(typeButton);
        frame.add(streetNameButton);
        frame.add(streetNumberButton);
        frame.add(cityButton);
        frame.add(countryButton);
        frame.add(pricePerDayButton);
        frame.add(sqFeetButton);
        frame.add(roomsButton);
        frame.add(wifiButton);
        frame.add(parkingButton);
        frame.add(kitchenButton);
        frame.add(heatingButton);
        frame.add(backyardButton);
        frame.add(poolButton);
        frame.add(tvButton);

        frame.setSize(600,700);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void editPictures() {
        JFrame newFrame = new JFrame();
        JLabel imageLabel1 = new JLabel();
        JLabel imageLabel2 = new JLabel();
        JLabel imageLabel3 = new JLabel();
        JLabel imageLabel4 = new JLabel();
        JLabel imageLabel5 = new JLabel();
        JTextField imageField1 = new JTextField();
        JTextField imageField2 = new JTextField();
        JTextField imageField3 = new JTextField();
        JTextField imageField4 = new JTextField();
        JTextField imageField5 = new JTextField();

        JButton goBackButton = new JButton("Go back");
        JButton editButton = new JButton("Edit");
        imageLabel1.setBounds(100, 150, 150, 25);
        imageLabel2.setBounds(100, 200, 150, 25);
        imageLabel3.setBounds(100, 250, 150, 25);
        imageLabel4.setBounds(100, 300, 150, 25);
        imageLabel5.setBounds(100, 350, 150, 25);
        imageField1.setBounds(300, 150, 200, 25);
        imageField2.setBounds(300, 200, 200, 25);
        imageField3.setBounds(300, 250, 200, 25);
        imageField4.setBounds(300, 300, 200, 25);
        imageField5.setBounds(300, 350, 200, 25);
        editButton.setBounds(300, 400, 100, 25);
        goBackButton.setBounds(400,400,100,25);
        imageLabel1.setText("Picture 1:");
        imageLabel2.setText("Picture 2: (Optional)");
        imageLabel3.setText("Picture 3: (Optional)");
        imageLabel4.setText("Picture 4: (Optional)");
        imageLabel5.setText("Picture 5: (Optional)");

        newFrame.add(imageLabel1);
        newFrame.add(imageLabel2);
        newFrame.add(imageLabel3);
        newFrame.add(imageLabel4);
        newFrame.add(imageLabel5);
        newFrame.add(imageField1);
        newFrame.add(imageField2);
        newFrame.add(imageField3);
        newFrame.add(imageField4);
        newFrame.add(imageField5);
        newFrame.add(editButton);
        newFrame.add(goBackButton);

        goBackButton.addActionListener(e -> newFrame.dispose());

        editButton.addActionListener(e -> {
            boolean correctInfo = true;
            ArrayList<String> images = new ArrayList<>();

            if (imageField1.getText().isEmpty()) {
                correctInfo = false;
            } else if (!(new File("src/images/" + imageField1.getText()).isFile())){
                correctInfo = false;
            } else {
                images.add(imageField1.getText());
            }

            if (!imageField2.getText().isEmpty() && !(new File("src/images/" + imageField2.getText()).isFile())) {
                correctInfo = false;

            } else {
                images.add(imageField2.getText());
            }

            if (!imageField3.getText().isEmpty() && !(new File("src/images/" + imageField3.getText()).isFile())) {
                correctInfo = false;
            } else {
                images.add(imageField3.getText());
            }

            if (!imageField4.getText().isEmpty() && !(new File("src/images/" + imageField4.getText()).isFile())) {
                correctInfo = false;
            } else {
                images.add(imageField4.getText());
            }

            if (!imageField5.getText().isEmpty() && !(new File("src/images/" + imageField5.getText()).isFile())) {
                correctInfo = false;
            } else {
                images.add(imageField5.getText());
            }

            if (correctInfo) {
                currentOwner.getPlaceOfRenting(index).setPictures(images);
                newFrame.dispose();
            }
        });

        newFrame.setSize(600,600);
        newFrame.setLayout(null);
        newFrame.setVisible(true);

    }

    public void editType() {
        JFrame editTypeFrame = new JFrame();

        JButton goBackButton = new JButton("Go back");
        JButton editButton = new JButton("Edit");

        JRadioButton villaButton = new JRadioButton("Villa", true);
        JRadioButton apartmentButton = new JRadioButton("Apartment");
        JRadioButton hotelButton = new JRadioButton("Hotel");
        JRadioButton cabinButton = new JRadioButton("Cabin");
        JRadioButton cottageButton = new JRadioButton("Cottage");
        JRadioButton bungalowButton = new JRadioButton("Bungalow");

        ButtonGroup group = new ButtonGroup();
        group.add(villaButton);
        group.add(apartmentButton);
        group.add(hotelButton);
        group.add(cabinButton);
        group.add(cottageButton);
        group.add(bungalowButton);

        villaButton.setBounds(50, 100, 100, 25);
        apartmentButton.setBounds(50, 130, 100, 25);
        hotelButton.setBounds(50, 160, 100, 25);
        cabinButton.setBounds(50, 190, 100, 25);
        cottageButton.setBounds(50, 220, 100, 25);
        bungalowButton.setBounds(50, 250, 100, 25);
        editButton.setBounds(50,300,100,25);
        goBackButton.setBounds(150,300,100,25);

        editButton.addActionListener(e -> {
            if (villaButton.isSelected()) {
                currentOwner.getPlaceOfRenting(index).setType("Villa");
            } else if (apartmentButton.isSelected()) {
                currentOwner.getPlaceOfRenting(index).setType("Apartment");
            } else if (hotelButton.isSelected()) {
                currentOwner.getPlaceOfRenting(index).setType("Hotel");
            } else if (cabinButton.isSelected()) {
                currentOwner.getPlaceOfRenting(index).setType("Cabin");
            } else if (cottageButton.isSelected()) {
                currentOwner.getPlaceOfRenting(index).setType("Cottage");
            } else if (bungalowButton.isSelected()) {
                currentOwner.getPlaceOfRenting(index).setType("Bungalow");
            }
        });

        goBackButton.addActionListener(e -> editTypeFrame.dispose());

        editTypeFrame.add(villaButton);
        editTypeFrame.add(apartmentButton);
        editTypeFrame.add(hotelButton);
        editTypeFrame.add(cabinButton);
        editTypeFrame.add(cottageButton);
        editTypeFrame.add(bungalowButton);
        editTypeFrame.add(editButton);
        editTypeFrame.add(goBackButton);

        editTypeFrame.setSize(400,600);
        editTypeFrame.setLayout(null);
        editTypeFrame.setVisible(true);
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
        if(e.getSource()== picturesButton)
        {
            editPictures();
            frame.setVisible(false);
        }
        if(e.getSource()== typeButton)
        {
            editType();
            frame.setVisible(false);
        }
        if(e.getSource()== streetNameButton)
        {
            String choice= "Street name";
            StringEditUI stringEditUI= new StringEditUI();
            stringEditUI.startStringEditUI(index,currentOwner,choice);
            frame.setVisible(false);
        }
        if(e.getSource()== streetNumberButton)
        {
            String choice= "Street number";
            StringEditUI stringEditUI= new StringEditUI();
            stringEditUI.startStringEditUI(index,currentOwner,choice);
            frame.setVisible(false);
        }
        if(e.getSource()== cityButton)
        {
            String choice= "City";
            StringEditUI stringEditUI= new StringEditUI();
            stringEditUI.startStringEditUI(index,currentOwner,choice);
            frame.setVisible(false);
        }
        if(e.getSource()== countryButton)
        {
            String choice= "Country";
            StringEditUI stringEditUI= new StringEditUI();
            stringEditUI.startStringEditUI(index,currentOwner,choice);
            frame.setVisible(false);
        }
        if(e.getSource()== pricePerDayButton)
        {
            StringEditUI stringEditUI= new StringEditUI();
            String choice= "Price per day";
            stringEditUI.startStringEditUI(index,currentOwner,choice);
            frame.setVisible(false);
        }
        if(e.getSource()== sqFeetButton)
        {
            String choice= "Square feet";
            StringEditUI stringEditUI= new StringEditUI();
            stringEditUI.startStringEditUI(index,currentOwner,choice);
            frame.setVisible(false);
        }
        if(e.getSource()== roomsButton)
        {
            String choice= "Rooms";
            StringEditUI stringEditUI= new StringEditUI();
            stringEditUI.startStringEditUI(index,currentOwner,choice);
            frame.setVisible(false);
        }
        if(e.getSource()== wifiButton)
        {
            String choice= "Wifi";
            StringEditUI stringEditUI= new StringEditUI();
            stringEditUI.startStringEditUI(index,currentOwner,choice);
            frame.setVisible(false);
        }
        if(e.getSource()== parkingButton)
        {
            String choice= "Parking";
            StringEditUI stringEditUI= new StringEditUI();
            stringEditUI.startStringEditUI(index,currentOwner,choice);
            frame.setVisible(false);
        }
        if(e.getSource()== kitchenButton)
        {
            String choice= "Kitchen";
            StringEditUI stringEditUI= new StringEditUI();
            stringEditUI.startStringEditUI(index,currentOwner,choice);
            frame.setVisible(false);
        }
        if(e.getSource()== heatingButton)
        {
            String choice= "Heating";
            StringEditUI stringEditUI= new StringEditUI();
            stringEditUI.startStringEditUI(index,currentOwner,choice);
            frame.setVisible(false);
        }
        if(e.getSource()== backyardButton)
        {
            String choice= "Backyard";
            StringEditUI stringEditUI= new StringEditUI();
            stringEditUI.startStringEditUI(index,currentOwner,choice);
            frame.setVisible(false);
        }
        if(e.getSource()== poolButton)
        {
            String choice= "Pool";
            StringEditUI stringEditUI= new StringEditUI();
            stringEditUI.startStringEditUI(index,currentOwner,choice);
            frame.setVisible(false);
        }
        if(e.getSource()== tvButton)
        {
            String choice= "TV";
            StringEditUI stringEditUI= new StringEditUI();
            stringEditUI.startStringEditUI(index,currentOwner,choice);
            frame.setVisible(false);
        }


    }
}
