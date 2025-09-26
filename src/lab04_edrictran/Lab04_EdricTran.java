/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab04_edrictran;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Edric
 */
public class Lab04_EdricTran extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label nDays = new Label("Number of days on the trip: ");
        Label nAirFare = new Label("Amount of airfare, if any: ");
        Label nCarRentalFees = new Label("Amount of car rental fees: ");
        Label nMilesDriven = new Label("Number of miles driven, if a private vehicle was used: ");
        Label nParkingFees = new Label("Amount of parking fees, if any: ");
        Label nTaxiCharges = new Label("Amount of taxi charges, if any: ");
        Label confSemFees = new Label("Conference or seminar registration fees, if any: ");
        Label lodgingCharges = new Label("Lodging charges, per night: ");
        Label messageLabel = new Label();
        Label totalExpensesLabel = new Label();
        Label allowableLabel = new Label();
        Label savedOrExcess = new Label();
        
        TextField nDaysText = new TextField();
        TextField nAirFareText = new TextField();
        TextField nCarRentalFeesText = new TextField();
        TextField nMilesDrivenText = new TextField();
        TextField nParkingFeesText = new TextField();
        TextField nTaxiChargesText = new TextField();
        TextField confSemFeesText = new TextField();
        TextField lodgingChargesText = new TextField();
        
        
        GridPane gp = new GridPane();
        gp.setAlignment(Pos.CENTER);
        gp.setHgap(10);
        gp.setVgap(10);
        gp.setPadding(new Insets(25, 25, 25, 25));
        
        gp.add(nDays, 0, 0);
        gp.add(nAirFare, 0, 1);
        gp.add(nCarRentalFees, 0, 2);
        gp.add(nMilesDriven, 0, 3);
        gp.add(nParkingFees, 0, 4);
        gp.add(nTaxiCharges, 0, 5);
        gp.add(confSemFees, 0, 6);
        gp.add(lodgingCharges, 0, 7);
        gp.add(messageLabel, 0, 9, 2, 1);
        gp.add(totalExpensesLabel, 0, 10, 2, 1);
        gp.add(allowableLabel, 0, 11, 2, 1);
        gp.add(savedOrExcess, 0, 12, 2 ,1);

        Button calc = new Button("Calculate");
        gp.add(calc, 0, 8);
        
        calc.setOnAction(event -> {
            try {
                int days = Integer.parseInt(nDaysText.getText());
                int airfare = Integer.parseInt(nAirFareText.getText());
                int carRental = Integer.parseInt(nCarRentalFeesText.getText());
                double miles = Double.parseDouble(nMilesDrivenText.getText());
                int parking = Integer.parseInt(nParkingFeesText.getText());
                int taxi = Integer.parseInt(nTaxiChargesText.getText());
                int confFees = Integer.parseInt(confSemFeesText.getText());
                int lodging = Integer.parseInt(lodgingChargesText.getText());
                
                if (days < 0 || airfare < 0 || carRental < 0 || miles < 0 ||
                parking < 0 || taxi < 0 || confFees < 0 || lodging < 0) {
                      messageLabel.setText(" Negative numbers are not allowed");
                      messageLabel.setStyle("-fx-text-fill: red; -fx-font-weight: bold;");
                      totalExpensesLabel.setText("");
                      allowableLabel.setText("");
                      savedOrExcess.setText("");
                      return;
        }
                double totalExpenses = airfare + carRental + parking + taxi 
                        + confFees + (lodging * days);
                double allowableExpenses = days * (37 + 10 + 20 + 95) + (miles * 0.27);
                
                totalExpensesLabel.setText("Total Expenses: $" + totalExpenses);
                allowableLabel.setText("Allowable Expenses: $" + allowableExpenses);

                double difference = totalExpenses - allowableExpenses;
                if (difference > 0) {
                    savedOrExcess.setText("Excess: $" + difference);
                } else {
                    savedOrExcess.setText("Amount Saved: " + "$" + difference * -1);
                }
                messageLabel.setText("");
                
                
                
            } catch (NumberFormatException e) {
                messageLabel.setText("Enter whole numbers only");
                messageLabel.setStyle("-fx-text-fill: red; -fx-font-weight: bold;");
                totalExpensesLabel.setText("");
                allowableLabel.setText("");
                savedOrExcess.setText("");
            }
        });

        
        gp.add(nDaysText, 1, 0);
        gp.add(nAirFareText, 1, 1);
        gp.add(nCarRentalFeesText, 1, 2);
        gp.add(nMilesDrivenText, 1, 3);
        gp.add(nParkingFeesText, 1, 4);
        gp.add(nTaxiChargesText, 1, 5);
        gp.add(confSemFeesText, 1, 6);
        gp.add(lodgingChargesText, 1, 7);

        Scene scene = new Scene(gp, 450, 450);
        
        stage.setTitle("Hello World");
        stage.setScene(scene);
        stage.show();

    }
}
