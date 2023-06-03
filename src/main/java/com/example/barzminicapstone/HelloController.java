package com.example.barzminicapstone;

import javafx.collections.FXCollections;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {

    // Main Components
    @FXML
    private TextArea display_result;
    @FXML
    private TextField display_subject;
    @FXML
    private ComboBox combo_subject;

    // Text Fields
    @FXML
    private TextField text_name;
    @FXML
    private TextField text_address;
    @FXML
    private TextField text_city;
    @FXML
    private TextField text_province;
    @FXML
    private TextField text_postal;
    @FXML
    private TextField text_phone;
    @FXML
    private TextField text_email;
    @FXML
    private CheckBox checkbox_council;
    @FXML
    private CheckBox checkbox_volunteer;

    // Major
    private String studentMajor = "";

    private ObservableList<String> computerSubjects =
            FXCollections.observableArrayList("Java Programming", "WebApp Development", "Advanced Database");

    private ObservableList<String> businessSubjects =
            FXCollections.observableArrayList("Macroeconomics", "Statistics", "Marketing 101");

    private ObservableList<String> selectedSubjects =
            FXCollections.observableArrayList();

    // Selecting Major ( Populate Combo box );
    @FXML
    private void clickComputerScience(ActionEvent event)
    {
        combo_subject.setItems(computerSubjects);
        ObservableList<String> emptyList = FXCollections.observableArrayList();
        selectedSubjects = emptyList;
        display_subject.setText(selectedSubjects.toString());
        studentMajor = "Computer Science";
    }
    @FXML
    private void clickBusiness(ActionEvent event)
    {
        combo_subject.setItems(businessSubjects);
        ObservableList<String> emptyList = FXCollections.observableArrayList();
        selectedSubjects = emptyList;
        display_subject.setText(selectedSubjects.toString());
        studentMajor = "Business";
    }

    // Add Subject
    @FXML
    private void addSubject(ActionEvent event) {
        String selected = combo_subject.getValue().toString();

        if (!selectedSubjects.contains(selected))
        {
            selectedSubjects.add(selected);
        }
        display_subject.setText(selectedSubjects.toString());
    }

    // Display Results
    @FXML
    private void displayResult(ActionEvent event) {
        StudentRecordModel record = new StudentRecordModel();

        record.setVolunteer(checkbox_volunteer.isSelected());
        record.setCouncil(checkbox_council.isSelected());
        record.setFullName(text_name.getText());
        record.setAddress(text_address.getText());
        record.setCity(text_city.getText());
        record.setProvince(text_province.getText());
        record.setPostal(text_postal.getText());
        record.setPhone(text_phone.getText());
        record.setEmail(text_email.getText());
        record.setMajor(studentMajor);
        record.setSubjects(selectedSubjects);

        display_result.setText(record.displayRecord());
    }
}


