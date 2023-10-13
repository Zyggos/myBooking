import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class implements the GUI for a part of the property editing process
 */

public class StringEditUI implements ActionListener
{
    JFrame frame= new JFrame();


    JButton goBackButton= new JButton("Go back");
    JButton editButton=new JButton("Edit");
    JLabel questionLabel = new JLabel("What do you want to change it to?");
    JTextField answerField = new JTextField();


    Owner currentOwner;
    int index;
    String choice;
    public void startStringEditUI(int indexOfPlaceToRent,Owner loggedInOwner,String choiceOfWhatToChange)
    {
        currentOwner= loggedInOwner;
        index= indexOfPlaceToRent;
        choice= choiceOfWhatToChange;

        questionLabel.setBounds(150,125,500,25);

        answerField.setBounds(190,150,100,25);

        goBackButton.setBounds(150,200,100,25);
        goBackButton.setFocusable(false);
        goBackButton.addActionListener(this);
        editButton.setBounds(250,200,100,25);
        editButton.setFocusable(false);
        editButton.addActionListener(this);

        frame.add(goBackButton);
        frame.add(editButton);
        frame.add(questionLabel);
        frame.add(answerField);


        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== goBackButton)
        {
            ShowAllYourPlacesForRentUI showAllYourPlacesForRentUI= new ShowAllYourPlacesForRentUI();
            showAllYourPlacesForRentUI.startShowAllYourPlacesForRentUI(currentOwner);
            frame.setVisible(false);
        }
        if(e.getSource()== editButton)
        {
            switch (choice) {
                case "Type":
                    try {
                        currentOwner.getPlaceOfRenting(index).setType(answerField.getText());
                        ShowAllYourPlacesForRentUI showAllYourPlacesForRentUI = new ShowAllYourPlacesForRentUI();
                        showAllYourPlacesForRentUI.startShowAllYourPlacesForRentUI(currentOwner);
                        frame.setVisible(false);
                    } catch (Exception exception) {
                        StringEditUI stringEditUI = new StringEditUI();
                        stringEditUI.startStringEditUI(index, currentOwner, choice);
                        frame.setVisible(false);
                    }
                    break;
                case "Street name":
                    try {
                        currentOwner.getPlaceOfRenting(index).setStreetName(answerField.getText());
                        ShowAllYourPlacesForRentUI showAllYourPlacesForRentUI = new ShowAllYourPlacesForRentUI();
                        showAllYourPlacesForRentUI.startShowAllYourPlacesForRentUI(currentOwner);
                        frame.setVisible(false);
                    } catch (Exception exception) {
                        StringEditUI stringEditUI = new StringEditUI();
                        stringEditUI.startStringEditUI(index, currentOwner, choice);
                        frame.setVisible(false);
                    }
                    break;
                case "Street number":
                    try {
                        currentOwner.getPlaceOfRenting(index).setStreetNumber(answerField.getText());
                        ShowAllYourPlacesForRentUI showAllYourPlacesForRentUI = new ShowAllYourPlacesForRentUI();
                        showAllYourPlacesForRentUI.startShowAllYourPlacesForRentUI(currentOwner);
                        frame.setVisible(false);
                    } catch (Exception exception) {
                        StringEditUI stringEditUI = new StringEditUI();
                        stringEditUI.startStringEditUI(index, currentOwner, choice);
                        frame.setVisible(false);
                    }
                    break;
                case "City":
                    try {
                        currentOwner.getPlaceOfRenting(index).setCity(answerField.getText());
                        ShowAllYourPlacesForRentUI showAllYourPlacesForRentUI = new ShowAllYourPlacesForRentUI();
                        showAllYourPlacesForRentUI.startShowAllYourPlacesForRentUI(currentOwner);
                        frame.setVisible(false);
                    } catch (Exception exception) {
                        StringEditUI stringEditUI = new StringEditUI();
                        stringEditUI.startStringEditUI(index, currentOwner, choice);
                        frame.setVisible(false);
                    }
                    break;
                case "Country":
                    try {
                        currentOwner.getPlaceOfRenting(index).setCountry(answerField.getText());
                        ShowAllYourPlacesForRentUI showAllYourPlacesForRentUI = new ShowAllYourPlacesForRentUI();
                        showAllYourPlacesForRentUI.startShowAllYourPlacesForRentUI(currentOwner);
                        frame.setVisible(false);
                    } catch (Exception exception) {
                        StringEditUI stringEditUI = new StringEditUI();
                        stringEditUI.startStringEditUI(index, currentOwner, choice);
                        frame.setVisible(false);
                    }
                    break;
                case "Price per day":
                    try {
                        int answer = Integer.parseInt(answerField.getText());
                        currentOwner.getPlaceOfRenting(index).setPrice_per_day(answer);
                        ShowAllYourPlacesForRentUI showAllYourPlacesForRentUI = new ShowAllYourPlacesForRentUI();
                        showAllYourPlacesForRentUI.startShowAllYourPlacesForRentUI(currentOwner);
                        frame.setVisible(false);
                    } catch (Exception exception) {
                        StringEditUI stringEditUI = new StringEditUI();
                        stringEditUI.startStringEditUI(index, currentOwner, choice);
                        frame.setVisible(false);
                    }
                    break;
                case "Square feet":
                    try {
                        int answer = Integer.parseInt(answerField.getText());
                        currentOwner.getPlaceOfRenting(index).setSquare_feet(answer);
                        ShowAllYourPlacesForRentUI showAllYourPlacesForRentUI = new ShowAllYourPlacesForRentUI();
                        showAllYourPlacesForRentUI.startShowAllYourPlacesForRentUI(currentOwner);
                        frame.setVisible(false);
                    } catch (Exception exception) {
                        StringEditUI stringEditUI = new StringEditUI();
                        stringEditUI.startStringEditUI(index, currentOwner, choice);
                        frame.setVisible(false);
                    }
                    break;
                case "Rooms":
                    try {
                        int answer = Integer.parseInt(answerField.getText());
                        currentOwner.getPlaceOfRenting(index).setPrice_per_day(answer);
                        ShowAllYourPlacesForRentUI showAllYourPlacesForRentUI = new ShowAllYourPlacesForRentUI();
                        showAllYourPlacesForRentUI.startShowAllYourPlacesForRentUI(currentOwner);
                        frame.setVisible(false);
                    } catch (Exception exception) {
                        StringEditUI stringEditUI = new StringEditUI();
                        stringEditUI.startStringEditUI(index, currentOwner, choice);
                        frame.setVisible(false);
                    }
                    break;
                case "Wifi":
                    try {
                        String answer = answerField.getText();
                        if (answer.equals("True") || answer.equals("true")) {
                            currentOwner.getPlaceOfRenting(index).setWifi(true);
                            ShowAllYourPlacesForRentUI showAllYourPlacesForRentUI = new ShowAllYourPlacesForRentUI();
                            showAllYourPlacesForRentUI.startShowAllYourPlacesForRentUI(currentOwner);
                            frame.setVisible(false);
                        } else if (answer.equals("False") || answer.equals("false")) {
                            currentOwner.getPlaceOfRenting(index).setWifi(false);
                            ShowAllYourPlacesForRentUI showAllYourPlacesForRentUI = new ShowAllYourPlacesForRentUI();
                            showAllYourPlacesForRentUI.startShowAllYourPlacesForRentUI(currentOwner);
                            frame.setVisible(false);
                        } else {
                            frame.setVisible(false);
                            StringEditUI stringEditUI = new StringEditUI();
                            stringEditUI.startStringEditUI(index, currentOwner, choice);
                        }
                    } catch (Exception exception) {
                        StringEditUI stringEditUI = new StringEditUI();
                        stringEditUI.startStringEditUI(index, currentOwner, choice);
                        frame.setVisible(false);
                    }

                    break;
                case "Parking":
                    try {
                        String answer = answerField.getText();
                        if (answer.equals("True") || answer.equals("true")) {
                            currentOwner.getPlaceOfRenting(index).setParking(true);
                            ShowAllYourPlacesForRentUI showAllYourPlacesForRentUI = new ShowAllYourPlacesForRentUI();
                            showAllYourPlacesForRentUI.startShowAllYourPlacesForRentUI(currentOwner);
                            frame.setVisible(false);
                        } else if (answer.equals("False") || answer.equals("false")) {
                            currentOwner.getPlaceOfRenting(index).setParking(false);
                            ShowAllYourPlacesForRentUI showAllYourPlacesForRentUI = new ShowAllYourPlacesForRentUI();
                            showAllYourPlacesForRentUI.startShowAllYourPlacesForRentUI(currentOwner);
                            frame.setVisible(false);
                        } else {
                            frame.setVisible(false);
                            StringEditUI stringEditUI = new StringEditUI();
                            stringEditUI.startStringEditUI(index, currentOwner, choice);
                        }
                    } catch (Exception exception) {
                        StringEditUI stringEditUI = new StringEditUI();
                        stringEditUI.startStringEditUI(index, currentOwner, choice);
                        frame.setVisible(false);
                    }
                    break;
                case "Kitchen":
                    try {
                        String answer = answerField.getText();
                        if (answer.equals("True") || answer.equals("true")) {
                            currentOwner.getPlaceOfRenting(index).setKitchen(true);
                            ShowAllYourPlacesForRentUI showAllYourPlacesForRentUI = new ShowAllYourPlacesForRentUI();
                            showAllYourPlacesForRentUI.startShowAllYourPlacesForRentUI(currentOwner);
                            frame.setVisible(false);
                        } else if (answer.equals("False") || answer.equals("false")) {
                            currentOwner.getPlaceOfRenting(index).setKitchen(false);
                            ShowAllYourPlacesForRentUI showAllYourPlacesForRentUI = new ShowAllYourPlacesForRentUI();
                            showAllYourPlacesForRentUI.startShowAllYourPlacesForRentUI(currentOwner);
                            frame.setVisible(false);
                        } else {
                            frame.setVisible(false);
                            StringEditUI stringEditUI = new StringEditUI();
                            stringEditUI.startStringEditUI(index, currentOwner, choice);
                        }
                    } catch (Exception exception) {
                        StringEditUI stringEditUI = new StringEditUI();
                        stringEditUI.startStringEditUI(index, currentOwner, choice);
                        frame.setVisible(false);
                    }
                    break;
                case "Heating":
                    try {
                        String answer = answerField.getText();
                        if (answer.equals("True") || answer.equals("true")) {
                            currentOwner.getPlaceOfRenting(index).setHeating(true);
                            ShowAllYourPlacesForRentUI showAllYourPlacesForRentUI = new ShowAllYourPlacesForRentUI();
                            showAllYourPlacesForRentUI.startShowAllYourPlacesForRentUI(currentOwner);
                            frame.setVisible(false);
                        } else if (answer.equals("False") || answer.equals("false")) {
                            currentOwner.getPlaceOfRenting(index).setHeating(false);
                            ShowAllYourPlacesForRentUI showAllYourPlacesForRentUI = new ShowAllYourPlacesForRentUI();
                            showAllYourPlacesForRentUI.startShowAllYourPlacesForRentUI(currentOwner);
                            frame.setVisible(false);
                        } else {
                            frame.setVisible(false);
                            StringEditUI stringEditUI = new StringEditUI();
                            stringEditUI.startStringEditUI(index, currentOwner, choice);
                        }
                    } catch (Exception exception) {
                        StringEditUI stringEditUI = new StringEditUI();
                        stringEditUI.startStringEditUI(index, currentOwner, choice);
                        frame.setVisible(false);
                    }
                    break;
                case "Pool":
                    try {
                        String answer = answerField.getText();
                        if (answer.equals("True") || answer.equals("true")) {
                            currentOwner.getPlaceOfRenting(index).setPool(true);
                            ShowAllYourPlacesForRentUI showAllYourPlacesForRentUI = new ShowAllYourPlacesForRentUI();
                            showAllYourPlacesForRentUI.startShowAllYourPlacesForRentUI(currentOwner);
                            frame.setVisible(false);
                        } else if (answer.equals("False") || answer.equals("false")) {
                            currentOwner.getPlaceOfRenting(index).setPool(false);
                            ShowAllYourPlacesForRentUI showAllYourPlacesForRentUI = new ShowAllYourPlacesForRentUI();
                            showAllYourPlacesForRentUI.startShowAllYourPlacesForRentUI(currentOwner);
                            frame.setVisible(false);
                        } else {
                            frame.setVisible(false);
                            StringEditUI stringEditUI = new StringEditUI();
                            stringEditUI.startStringEditUI(index, currentOwner, choice);
                        }
                    } catch (Exception exception) {
                        StringEditUI stringEditUI = new StringEditUI();
                        stringEditUI.startStringEditUI(index, currentOwner, choice);
                        frame.setVisible(false);
                    }
                    break;
                case "TV":
                    try {
                        String answer = answerField.getText();
                        if (answer.equals("True") || answer.equals("true")) {
                            currentOwner.getPlaceOfRenting(index).setTv(true);
                            ShowAllYourPlacesForRentUI showAllYourPlacesForRentUI = new ShowAllYourPlacesForRentUI();
                            showAllYourPlacesForRentUI.startShowAllYourPlacesForRentUI(currentOwner);
                            frame.setVisible(false);
                        } else if (answer.equals("False") || answer.equals("false")) {
                            currentOwner.getPlaceOfRenting(index).setTv(false);
                            ShowAllYourPlacesForRentUI showAllYourPlacesForRentUI = new ShowAllYourPlacesForRentUI();
                            showAllYourPlacesForRentUI.startShowAllYourPlacesForRentUI(currentOwner);
                            frame.setVisible(false);
                        } else {
                            frame.setVisible(false);
                            StringEditUI stringEditUI = new StringEditUI();
                            stringEditUI.startStringEditUI(index, currentOwner, choice);
                        }
                    } catch (Exception exception) {
                        StringEditUI stringEditUI = new StringEditUI();
                        stringEditUI.startStringEditUI(index, currentOwner, choice);
                        frame.setVisible(false);
                    }
                    break;
                case "Backyard":
                    try {
                        String answer = answerField.getText();
                        if (answer.equals("True") || answer.equals("true")) {
                            currentOwner.getPlaceOfRenting(index).setBackyard(true);
                            ShowAllYourPlacesForRentUI showAllYourPlacesForRentUI = new ShowAllYourPlacesForRentUI();
                            showAllYourPlacesForRentUI.startShowAllYourPlacesForRentUI(currentOwner);
                            frame.setVisible(false);
                        } else if (answer.equals("False") || answer.equals("false")) {
                            currentOwner.getPlaceOfRenting(index).setBackyard(false);
                            ShowAllYourPlacesForRentUI showAllYourPlacesForRentUI = new ShowAllYourPlacesForRentUI();
                            showAllYourPlacesForRentUI.startShowAllYourPlacesForRentUI(currentOwner);
                            frame.setVisible(false);
                        } else {
                            frame.setVisible(false);
                            StringEditUI stringEditUI = new StringEditUI();
                            stringEditUI.startStringEditUI(index, currentOwner, choice);
                        }
                    } catch (Exception exception) {
                        StringEditUI stringEditUI = new StringEditUI();
                        stringEditUI.startStringEditUI(index, currentOwner, choice);
                        frame.setVisible(false);
                    }
                    break;
            }


        }



    }
}