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
        
        Button calc = new Button("Calculate");
        gp.add(calc, 0, 8);
        
        calc.setOnAction(event -> {
        });

        
        gp.add(nDaysText, 1, 0);
        gp.add(nAirFareText, 1, 1);
        gp.add(nCarRentalFeesText, 1, 2);
        gp.add(nMilesDrivenText, 1, 3);
        gp.add(nParkingFeesText, 1, 4);
        gp.add(nTaxiChargesText, 1, 5);
        gp.add(confSemFeesText, 1, 6);
        gp.add(lodgingChargesText, 1, 7);
        

        Scene scene = new Scene(gp, 800, 800);
        
        stage.setTitle("Hello World");
        stage.setScene(scene);
        stage.show();

    }
    
}
