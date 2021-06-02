package CoureseWorkSemTwo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main extends Application {

    @Override
    //Welcome Window That have all 4 Calculator buttons and the help Button
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Main Window Page");
        //Buttons on Main Window

       FileInputStream input = new FileInputStream("E:\\IIT\\1st Year\\IdeaProjects\\Programming Principles\\src\\CoureseWorkSemTwo\\Images\\business-graph-chart-stock-market-investment-trading-blue-background_62391-235.jpg");
        Image imgLoan = new Image(input);
        ImageView imageView = new ImageView(imgLoan);
        imageView.setFitHeight(437.0);
        imageView.setFitWidth(645.0);

        Button btnAuLoanCal = new Button("Auto Loan Calculator");
        btnAuLoanCal.setLayoutX(197.0);
        btnAuLoanCal.setLayoutY(40.0);
        btnAuLoanCal.setStyle("-fx-background-color: lightgreen;-fx-font-weight: bold;-fx-font-size: 18px;-fx-border-color: darkgreen");
        btnAuLoanCal.setFont(new Font("Lucida Fax",18));
        btnAuLoanCal.setPrefWidth(231.0);
        btnAuLoanCal.setPrefHeight(38.0);

        Button btnMorCal = new Button("Mortgage Calculator");
        btnMorCal.setLayoutX(226.0);
        btnMorCal.setLayoutY(194.0);
        btnMorCal.setStyle("-fx-background-color: lightgreen;-fx-font-weight: bold;-fx-border-color: darkgreen");
        btnMorCal.setFont(new Font("Lucida Fax", 18));
        btnMorCal.setPrefWidth(210.0);
        btnMorCal.setPrefHeight(38.0);

        Button btnComIntr = new Button("Compound Interest");
        btnComIntr.setLayoutX(144.0);
        btnComIntr.setLayoutY(286.0);
        btnComIntr.setStyle("-fx-background-color: lightgreen;-fx-font-weight: bold;-fx-border-color: darkgreen");
        btnComIntr.setFont(new Font("Lucida Fax", 18));
        btnComIntr.setPrefWidth(347.0);
        btnComIntr.setPrefHeight(29.0);

        Button btnComInSavingsLump = new Button("Compound Interest Calculator (No Payments)");
        btnComInSavingsLump.setLayoutX(106.0);
        btnComInSavingsLump.setLayoutY(115.0);
        btnComInSavingsLump.setStyle("-fx-background-color: lightgreen;-fx-font-weight: bold;-fx-border-color: darkgreen");
        btnComInSavingsLump.setFont(new Font("Lucida Fax", 18));
        btnComInSavingsLump.setPrefWidth(413.0);
        btnComInSavingsLump.setPrefHeight(38.0);

        Button btnHelp = new Button("Help");
        btnHelp.setLayoutX(271.0);
        btnHelp.setLayoutY(355.0);
        btnHelp.setStyle("-fx-background-color: lightgreen;-fx-font-weight: bold;-fx-border-color: darkgreen");
        btnHelp.setFont(new Font("Lucida Fax", 18));
        btnHelp.setPrefWidth(83.0);
        btnHelp.setPrefHeight(39.0);

        
        Pane rootOne = new Pane();
        rootOne.getChildren().addAll(btnAuLoanCal, btnComInSavingsLump, btnComIntr, btnMorCal, btnHelp);

        primaryStage.setScene(new Scene(rootOne, 630, 429));
        primaryStage.show();


        btnHelp.setOnAction(new EventHandler<ActionEvent>() {
            //Information for Help
            @Override
            public void handle(ActionEvent event) {
                Stage helpStage=new Stage();
                helpStage.setTitle("Help Stage");
                Label helpLabel=new Label();
                helpLabel.setText("Help"+
                        "This java Application is contains from four Different Calculators \n"+
                        "1. Auto Loan Calculator\n"+
                        "2. Compound Interest Calculator (Fixed Deposit)\n"+
                        "3. Mortgage Calculator\n"+
                        "4. Compound Interest Calculator (No Paymensts)\n\n\n"+
                        "When you click on above any calculator Button, A new Window will be open.\nInside of that You can Enter the data as your Purpose\n"+
                        "Make sure to enter the data in Correct form\n"+
                        "When you Click on Some textfield, a numpad will display on lift side of specific Window\n"+
                        "You can easily select on textfield and enter the Numbers by using the Num Pad.");
                helpLabel.setLayoutX(13.0);
                helpLabel.setLayoutY(23.0);
                helpLabel.setPrefSize(575,355);
                helpLabel.setStyle("-fx-background-color: lightgreen; -fx-font-weight: bold");

                Pane rootOne = new Pane();
                //adding all the labels,buttons,images and textfields into rootTwo Pane
                rootOne.getChildren().add(helpLabel);

                helpStage.setScene(new Scene(rootOne, 645, 430));
                helpStage.show();

            }
        });

        //Auto Loan Calculator Window

        btnAuLoanCal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage autoLoanStage = new Stage();
                autoLoanStage.setTitle("Auto Loan Calculator");
                //Image on Auto loan Window
                FileInputStream input = null;
                try {
                    input = new FileInputStream("E:\\IIT\\1st Year\\IdeaProjects\\Programming Principles\\src\\CoureseWorkSemTwo\\Images\\S3Lqme.jpg");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                Image imgLoan = new Image(input);
                ImageView imageView = new ImageView(imgLoan);
                imageView.setFitHeight(437.0);
                imageView.setFitWidth(645.0);

                //Labels and textfields of Auto Loan Window
                Label lblHead = new Label();
                lblHead.setLayoutX(39.0);
                lblHead.setLayoutY(39.0);
                lblHead.setText("AUTO LOAN CALCULATOR");
                lblHead.setFont(new Font("Book Antiqua", 26));
                lblHead.setTextFill(Paint.valueOf("#e6fa00"));

                Label lblLoan = new Label();
                lblLoan.setLayoutX(65.0);
                lblLoan.setLayoutY(141.0);
                lblLoan.setText("Loan Value ($)");
                lblLoan.setStyle("-fx-font-weight: bold");
                lblLoan.setFont(new Font("Book Antiqua", 18));
                lblLoan.setTextFill(Paint.valueOf("#00f454"));
                TextField txtLoan = new TextField("");
                txtLoan.setLayoutX(219.0);
                txtLoan.setLayoutY(142.0);

                Label lblMonthVal = new Label();
                lblMonthVal.setLayoutX(65.0);
                lblMonthVal.setLayoutY(258.0);
                lblMonthVal.setText("Interest (Per Year)");
                lblMonthVal.setStyle("-fx-font-weight: bold");
                lblMonthVal.setFont(new Font("Book Antiqua", 18));
                lblMonthVal.setTextFill(Paint.valueOf("#00f454"));
                TextField txtMonthVal = new TextField("");
                txtMonthVal.setLayoutX(219.0);
                txtMonthVal.setLayoutY(199.0);

                Label lblIRate = new Label();
                lblIRate.setLayoutX(65.0);
                lblIRate.setLayoutY(198.0);
                lblIRate.setText("Month Value ($)");
                lblIRate.setStyle("-fx-font-weight: bold");
                lblIRate.setFont(new Font("Book Antiqua", 18));
                lblIRate.setTextFill(Paint.valueOf("#00f454"));
                TextField txtRate = new TextField("");
                txtRate.setLayoutX(219.0);
                txtRate.setLayoutY(259.0);

                Label lblTime = new Label();
                lblTime.setLayoutX(65.0);
                lblTime.setLayoutY(322.0);
                lblTime.setText("Time (Months)");
                lblTime.setStyle("-fx-font-weight: bold");
                lblTime.setFont(new Font("Book Antiqua", 18));
                lblTime.setTextFill(Paint.valueOf("#00f454"));
                TextField txtTime = new TextField("");
                txtTime.setLayoutX(219.0);
                txtTime.setLayoutY(323.0);

                Button btnCal = new Button("Calculator");  //calculator button of Autoloan Window
                btnCal.setLayoutX(217.0);
                btnCal.setLayoutY(352.0);
                btnCal.setStyle("-fx-background-color: lightgreen");
                btnCal.setFont(new Font("Lucida Fax", 18));
                btnCal.setPrefWidth(110.0);
                btnCal.setPrefHeight(43.0);
                //calculation of the data which is entered by the user
                btnCal.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        if (txtLoan.getText().equals("") && !txtMonthVal.getText().equals("") && !txtRate.getText().equals("") && !txtTime.getText().equals("")) {
                            Double mValue = Double.parseDouble(txtMonthVal.getText());
                            Double iRate = Double.parseDouble(txtRate.getText());
                            Double time = Double.parseDouble(txtTime.getText());
                            Double loanCal = mValue * (1 + (iRate * time));   //calculation of the Value of Loan

                            Double roundAns=Math.round(loanCal*1.00)/1.00;
                            String roundAnsTwo=String.valueOf(roundAns);
                            txtLoan.setText(roundAnsTwo);

                        } else if (!txtLoan.getText().equals("") && txtMonthVal.getText().equals("") && !txtRate.getText().equals("") && !txtTime.getText().equals("")) {
                            Double loan = Double.parseDouble(txtLoan.getText());
                            Double iRate = Double.parseDouble(txtRate.getText());
                            Double time = Double.parseDouble(txtTime.getText());
                            Double mValCal = loan / (1 + (iRate * time));    //calculation of the Monthly Value

                            Double roundAns=Math.round(mValCal*1.00)/1.00;
                            String roundAnsTwo=String.valueOf(roundAns);
                            txtMonthVal.setText(roundAnsTwo);


                        } else if (!txtLoan.getText().equals("") && !txtMonthVal.getText().equals("") && txtRate.getText().equals("") && !txtTime.getText().equals("")) {
                            Double loan = Double.parseDouble(txtLoan.getText());
                            Double mValue = Double.parseDouble(txtMonthVal.getText());
                            Double time = Double.parseDouble(txtTime.getText());
                            Double iRateCal = ((loan / mValue) - 1) / time;     //calculation of the Interest Rate

                            Double roundAns=Math.round(iRateCal*1.00)/1.00;
                            String roundAnsTwo=String.valueOf(roundAns);
                            txtRate.setText(roundAnsTwo);


                        } else if (!txtLoan.getText().equals("") && !txtMonthVal.getText().equals("") && !txtRate.getText().equals("") && txtTime.getText().equals("")) {
                            Double loan = Double.parseDouble(txtLoan.getText());
                            Double mValue = Double.parseDouble(txtMonthVal.getText());
                            Double iRate = Double.parseDouble(txtRate.getText());
                            Double timeCal = ((loan / mValue) - 1) / iRate;     //calculation of the number of months that have to pay

                            Double roundAns=Math.round(timeCal*1.00)/1.00;
                            String roundAnsTwo=String.valueOf(roundAns);
                            txtTime.setText(roundAnsTwo);

                        } else if (!txtLoan.getText().equals("") && !txtMonthVal.getText().equals("") && !txtRate.getText().equals("") && !txtTime.getText().equals("")) {
                            Alert a = new Alert(Alert.AlertType.INFORMATION);
                            a.setAlertType(Alert.AlertType.INFORMATION);
                            a.setContentText("Your Loan Amount is " + txtLoan.getText() + " and You must pay " + txtMonthVal.getText() + " on the Interest Rate of " + txtRate.getText() + " for " + txtTime.getText() + " months");
                            a.showAndWait();

                        } else {
                            Alert none = new Alert(Alert.AlertType.INFORMATION);  //Will prompt when User not entered data Properly
                            none.setAlertType(Alert.AlertType.INFORMATION);
                            none.setContentText("Please Check whether that you have entered Details Properly!!");
                            none.showAndWait();
                        }
                    }
                });

                Pane rootTwo = new Pane();
                //adding all the labels,buttons,images and textfields into rootTwo Pane
                rootTwo.getChildren().addAll( lblHead, lblLoan, lblIRate, lblMonthVal, lblTime, txtLoan, txtRate, txtMonthVal, txtTime, btnCal);
                //Displaying the keyboard
                keyboard(txtLoan,rootTwo);
                keyboard(txtMonthVal,rootTwo);
                keyboard(txtRate,rootTwo);
                keyboard(txtTime,rootTwo);
                //adding above all to autoloan Stage
                autoLoanStage.setScene(new Scene(rootTwo, 645, 430));
                autoLoanStage.show();

            }
        });
        //New window of Compound interest savings (No Payments)
        btnComInSavingsLump.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage comNoPayStage = new Stage();
                comNoPayStage.setTitle("Compound Interest Savings (No Payments)");
                //image on CIS (No Payment window)
                /*FileInputStream input = null;
                try {
                    input = new FileInputStream("E:\\IIT\\IdeaProjects\\Programming Principles\\src\\CoureseWorkSemTwo\\Images\\buisnessman_coins_27_05.jpg");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                Image imgNoPay = new Image(input);
                ImageView imageView = new ImageView(imgNoPay);
                imageView.setFitHeight(437.0);
                imageView.setFitWidth(645.0);*/
                //labels and textfield on this Window
                Label lblHead = new Label();
                lblHead.setLayoutX(39.0);
                lblHead.setLayoutY(39.0);
                lblHead.setText("Compound Interest (No Payments)");
                lblHead.setFont(new Font("Book Antiqua", 26));
                lblHead.setTextFill(Paint.valueOf("#00FF00"));

                Label lblLoan = new Label();
                lblLoan.setLayoutX(44.0);
                lblLoan.setLayoutY(116.0);
                lblLoan.setText("Amount ($)");
                lblLoan.setStyle("-fx-font-weight: bold");
                lblLoan.setFont(new Font("Book Antiqua", 18));
                lblLoan.setTextFill(Paint.valueOf("#00f454"));
                TextField txtLoan = new TextField("");
                txtLoan.setLayoutX(198.0);
                txtLoan.setLayoutY(117.0);

                Label lblPriAmount = new Label();
                lblPriAmount.setLayoutX(44.0);
                lblPriAmount.setLayoutY(173.0);
                lblPriAmount.setText("Present Amount($)");
                lblPriAmount.setStyle("-fx-font-weight: bold");
                lblPriAmount.setFont(new Font("Book Antiqua", 18));
                lblPriAmount.setTextFill(Paint.valueOf("#00f454"));
                TextField txtPriAmount = new TextField("");
                txtPriAmount.setLayoutX(198.0);
                txtPriAmount.setLayoutY(174.0);

                Label lblRate = new Label();
                lblRate.setLayoutX(44.0);
                lblRate.setLayoutY(233.0);
                lblRate.setText("Interest Rate(%)");
                lblRate.setStyle("-fx-font-weight: bold");
                lblRate.setFont(new Font("Book Antiqua", 18));
                lblRate.setTextFill(Paint.valueOf("#00f454"));
                TextField txtRate = new TextField("");
                txtRate.setLayoutX(198.0);
                txtRate.setLayoutY(234.0);

                Label lblTime = new Label();
                lblTime.setLayoutX(44.0);
                lblTime.setLayoutY(297.0);
                lblTime.setText("Time (Months)");
                lblTime.setStyle("-fx-font-weight: bold");
                lblTime.setFont(new Font("Book Antiqua", 18));
                lblTime.setTextFill(Paint.valueOf("#00f454"));
                TextField txtTime = new TextField("");
                txtTime.setLayoutX(198.0);
                txtTime.setLayoutY(298.0);

                Button btnCal = new Button("Calculate");  //Calculate Button of Compound Interest Saving (No pay) Window
                btnCal.setLayoutX(217.0);
                btnCal.setLayoutY(352.0);
                btnCal.setStyle("-fx-background-color: lightgreen");
                btnCal.setFont(new Font("Lucida Fax", 18));
                btnCal.setPrefWidth(110.0);
                btnCal.setPrefHeight(43.0);
                //calculations of data which is entered by the user
                btnCal.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        if (txtLoan.getText().equals("") && !txtPriAmount.getText().equals("") && !txtRate.getText().equals("") && !txtTime.getText().equals("")) {
                            Double priAmount = Double.parseDouble(txtPriAmount.getText());
                            Double rate = Double.parseDouble(txtRate.getText());
                            Double time = Double.parseDouble(txtTime.getText());
                            Double loanCal = priAmount * Math.pow(1 + (rate / 12), 12 * time);  //Calculating the Value of Loan

                            Double roundAns=Math.round(loanCal*1.00)/1.00;
                            String roundAnsTwo=String.valueOf(roundAns);
                            txtLoan.setText(roundAnsTwo);


                        } else if (!txtLoan.getText().equals("") && txtPriAmount.getText().equals("") && !txtRate.getText().equals("") && !txtTime.getText().equals("")) {
                            Double loan = Double.parseDouble(txtLoan.getText());
                            Double rate = Double.parseDouble(txtRate.getText());
                            Double time = Double.parseDouble(txtTime.getText());
                            Double priAmontCal = loan / Math.pow(1 + (rate / 12), 12 * time);   //Calculating the Principle investment Amount

                            Double roundAns=Math.round(priAmontCal*1.00)/1.00;
                            String roundAnsTwo=String.valueOf(roundAns);
                            txtPriAmount.setText(roundAnsTwo);

                        } else if (!txtLoan.getText().equals("") && !txtPriAmount.getText().equals("") && txtRate.getText().equals("") && !txtTime.getText().equals("")) {
                            Double loan = Double.parseDouble(txtLoan.getText());
                            Double priAmount = Double.parseDouble(txtPriAmount.getText());
                            Double time = Double.parseDouble(txtTime.getText());
                            Double rateCal = 12 * (Math.pow(loan / priAmount, (1 / 12 * time)) - 1);   //Calculating the Interest Rate

                            Double roundAns=Math.round(rateCal*1.00)/1.00;
                            String roundAnsTwo=String.valueOf(roundAns);
                            txtRate.setText(roundAnsTwo);

                        } else if (!txtLoan.getText().equals("") && !txtPriAmount.getText().equals("") && !txtRate.getText().equals("") && txtTime.getText().equals("")) {
                            Double loan = Double.parseDouble(txtLoan.getText());
                            Double priAmount = Double.parseDouble(txtPriAmount.getText());
                            Double rate = Double.parseDouble(txtRate.getText());
                            Double timeCal = Math.log(loan / priAmount) / (12 * (Math.log(1 + (rate / 12))));  //Calculating the Times in Months

                            Double roundAns=Math.round(timeCal*1.00)/1.00;
                            String roundAnsTwo=String.valueOf(roundAns);
                            txtTime.setText(roundAnsTwo);


                        }else if(!txtLoan.getText().equals("") && !txtPriAmount.getText().equals("") && !txtRate.getText().equals("") && txtTime.getText().equals("")) {
                            Alert none = new Alert(Alert.AlertType.INFORMATION);
                            none.setAlertType(Alert.AlertType.INFORMATION);
                            none.setContentText("Your Future Value of the loan $"+txtLoan.getText()+", and the Present Value is $"+txtPriAmount.getText()+". As the annual interest rate of "+txtRate.getText()+"%. You should pay if for "+txtTime.getText()+" Months.");
                            none.showAndWait();


                        } else {
                            Alert none = new Alert(Alert.AlertType.INFORMATION);
                            none.setAlertType(Alert.AlertType.INFORMATION);
                            none.setContentText("Please Check whether that you have entered Details Properly!!");
                            none.showAndWait();
                        }
                    }
                });

                Pane rootThr = new Pane();
                rootThr.getChildren().addAll(lblHead, lblLoan, lblPriAmount, lblRate, lblTime, txtLoan, txtPriAmount, txtRate, txtTime, btnCal);

                keyboard(txtLoan,rootThr);
                keyboard(txtPriAmount,rootThr);
                keyboard(txtRate,rootThr);
                keyboard(txtTime,rootThr);

                comNoPayStage.setScene(new Scene(rootThr, 645, 430));
                comNoPayStage.show();
            }
        });
        //Mortgage Calculator Window
        btnMorCal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage mortgageStage = new Stage();
                mortgageStage.setTitle("Mortgage Calculator");
                //Image of Mortgage Calculator Window
                /*FileInputStream input = null;
                try {
                    input = new FileInputStream("E:\\IIT\\IdeaProjects\\Programming Principles\\src\\CoureseWorkSemTwo\\Images\\20151024113953-homeloan_1600.jpeg");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                Image imgLoan = new Image(input);
                ImageView imageView = new ImageView(imgLoan);
                imageView.setFitHeight(437.0);
                imageView.setFitWidth(645.0);*/
                //labels, textfields and the buttons
                Label lblMorHead = new Label();
                lblMorHead.setLayoutX(36.0);
                lblMorHead.setLayoutY(60.0);
                lblMorHead.setText("MORTGAGE CALCULATOR");
                lblMorHead.setFont(new Font("Book Antiqua", 26));
                lblMorHead.setTextFill(Paint.valueOf("#120790"));

                Label lblMortgage = new Label("Value  ($)");
                lblMortgage.setLayoutX(57.0);
                lblMortgage.setLayoutY(168.0);
                lblMortgage.setFont(new Font("Lucida Fax", 17));
                lblMortgage.setStyle("-fx-font-weight: bold");
                TextField txtMortgage = new TextField("");
                txtMortgage.setLayoutX(187.0);
                txtMortgage.setLayoutY(169.0);

                Label lblCount = new Label("Times (Monthly)");
                lblCount.setLayoutX(57.0);
                lblCount.setLayoutY(222.0);
                lblCount.setFont(new Font("Lucida Fax", 17));
                lblCount.setStyle("-fx-font-weight: bold");
                TextField txtCount = new TextField();
                txtCount.setLayoutX(187.0);
                txtCount.setLayoutY(223.0);

                Label lblMorRate = new Label("Annual Rate (%)");
                lblMorRate.setLayoutX(57.0);
                lblMorRate.setLayoutY(278.0);
                lblMorRate.setFont(new Font("Lucida Fax", 17));
                lblMorRate.setStyle("-fx-font-weight: bold");
                TextField txtMorRate = new TextField();
                txtMorRate.setLayoutX(187.0);
                txtMorRate.setLayoutY(279.0);

                Label lblMonVal = new Label("Month Value ($)");
                lblMonVal.setLayoutX(57.0);
                lblMonVal.setLayoutY(328.0);
                lblMonVal.setFont(new Font("Lucida Fax", 17));
                lblMonVal.setStyle("-fx-font-weight: bold");
                TextField txtMonthVal = new TextField("");
                txtMonthVal.setLayoutX(187.0);
                txtMonthVal.setLayoutY(329.0);

                Button btnMorCal = new Button("Calculate");
                btnMorCal.setLayoutX(414.0);
                btnMorCal.setLayoutY(342.0);
                btnMorCal.setStyle("-fx-background-color: lightblue;-fx-font-weight: bold;-fx-font-size: 17px");
                btnMorCal.setPrefWidth(100.0);
                btnMorCal.setPrefHeight(41.0);

                btnMorCal.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        if (txtMortgage.getText().equals("") && !txtCount.getText().equals("") && !txtMorRate.getText().equals("") && !txtMonthVal.getText().equals("")) {
                            Double count = Double.parseDouble(txtCount.getText());
                            Double rate=Double.parseDouble(txtMorRate.getText());
                            Double monRate=(rate/100.0)/12.0;
                            Double monVal=Double.parseDouble(txtMonthVal.getText());
                            Double mortgage =(monVal*(Math.pow(1+monRate,count)-1))/(Math.pow(1+monRate,count)*monRate); //calculation of the Value of Mortgage

                            Double roundAns=Math.round(mortgage*1.00)/1.00;  //round the Mortgage value
                            String roundAnsTwo=String.valueOf(roundAns);
                            txtMortgage.setText(roundAnsTwo);

                        }else if(!txtMortgage.getText().equals("") && txtCount.getText().equals("") && !txtMorRate.getText().equals("") && !txtMonthVal.getText().equals("")) {
                            Double mortgage = Double.parseDouble(txtMortgage.getText());
                            Double rate=Double.parseDouble(txtMorRate.getText());
                            Double monVal=Double.parseDouble(txtMonthVal.getText());
                            Double countCal=(Math.log((monVal/(monVal-(mortgage*rate/12*100)))))/(Math.log(1+(rate/12*100)));  //Calculation of the number of times

                            Double roundAns=Math.round(countCal*1.00)/1.00;
                            String roundAnsTwo=String.valueOf(roundAns);
                            txtCount.setText(roundAnsTwo);

                        }else if (!txtMortgage.getText().equals("") && !txtCount.getText().equals("") && !txtMorRate.getText().equals("") && txtMonthVal.getText().equals("")) {

                            Double mortgage = Double.parseDouble(txtMortgage.getText());
                            Double count = Double.parseDouble(txtCount.getText());
                            Double rate = Double.parseDouble(txtMorRate.getText());
                            Double monRate = (rate / 100.00) / 12.00;
                            Double monVal = (mortgage * (Math.pow(1 + monRate, count)) * monRate) / ((Math.pow(1 + monRate, count)) - 1);  //Calculation of the Monthly Value

                            Double roundAns=Math.round(monVal*1.00)/1.00;
                            String roundAnsTwo=String.valueOf(roundAns);
                            txtMonthVal.setText(roundAnsTwo);

                        }else if (!txtMortgage.getText().equals("") && !txtCount.getText().equals("") && txtMorRate.getText().equals("") && !txtMonthVal.getText().equals("")) {
                            Alert noRate = new Alert(Alert.AlertType.INFORMATION);    //will display when user not entered the Interest rate
                            noRate.setAlertType(Alert.AlertType.INFORMATION);
                            noRate.setContentText("Please Enter the Interest Rate in %");
                            noRate.showAndWait();

                        }else if (!txtMortgage.getText().equals("") && !txtCount.getText().equals("") && !txtMorRate.getText().equals("") && !txtMonthVal.getText().equals("")) {
                            Alert all = new Alert(Alert.AlertType.INFORMATION);
                            all.setAlertType(Alert.AlertType.INFORMATION);
                            all.setContentText("Your Mortgage Value is "+txtMortgage.getText()+"$, and You should pay "+txtMonthVal.getText()+"$ per Month for "+txtCount.getText()+ " times as the Annual Rate of "+txtMorRate.getText()+"%");
                            all.showAndWait();

                        }else {
                            Alert none = new Alert(Alert.AlertType.INFORMATION);
                            none.setAlertType(Alert.AlertType.INFORMATION);
                            none.setContentText("Please Enter the Data Correctly");
                            none.showAndWait();
                        }
                    }

                });

                Pane rootFour = new Pane();
                rootFour.getChildren().addAll(lblMorHead, lblMortgage, lblCount, lblMonVal,lblMorRate, btnMorCal, txtMortgage, txtCount, txtMonthVal,txtMorRate);
                //keyboard/ num pad
                keyboard(txtMortgage,rootFour);
                keyboard(txtCount,rootFour);
                keyboard(txtMorRate,rootFour);
                keyboard(txtMonthVal,rootFour);

                mortgageStage.setScene(new Scene(rootFour, 645, 430));
                mortgageStage.show();
            }
        });
        //Window of Compound Interest Calculator
        btnComIntr.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage comIntrStage = new Stage();
                comIntrStage.setTitle("Compound Interest Calculator");
                //image of New Window
                /*FileInputStream input = null;
                try {
                    input = new FileInputStream("E:\\IIT\\IdeaProjects\\Programming Principles\\src\\CoureseWorkSemTwo\\Images\\Yield-Growth-Corp12.jpg");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                Image imgLoan = new Image(input);
                ImageView imageView = new ImageView(imgLoan);
                imageView.setFitHeight(437.0);
                imageView.setFitWidth(645.0);*/
                //Labels, Textfields and button of the new Window
                Label lblComHead = new Label();
                lblComHead.setLayoutX(48.0);
                lblComHead.setLayoutY(29.0);
                lblComHead.setText("Compound Interest Calculator");
                lblComHead.setFont(new Font("Book Antiqua", 26));
                lblComHead.setTextFill(Paint.valueOf("#0000FF"));

                Label lblAmount = new Label();
                lblAmount.setLayoutX(47.0);
                lblAmount.setLayoutY(104.0);
                lblAmount.setText("Principle Amount");
                lblAmount.setStyle("-fx-font-weight: bold");
                lblAmount.setFont(new Font("Book Antiqua", 18));
                TextField txtAmount = new TextField("");
                txtAmount.setLayoutX(198.0);
                txtAmount.setLayoutY(105.0);

                Label lblAnnuRate = new Label();
                lblAnnuRate.setLayoutX(46.0);
                lblAnnuRate.setLayoutY(159.0);
                lblAnnuRate.setText("Annual Rate (%)");
                lblAnnuRate.setStyle("-fx-font-weight: bold");
                lblAnnuRate.setFont(new Font("Book Antiqua", 18));
                TextField txtAnnuRate = new TextField("");
                txtAnnuRate.setLayoutX(198.0);
                txtAnnuRate.setLayoutY(160.0);

                Label lblComTime = new Label();
                lblComTime.setLayoutX(47.0);
                lblComTime.setLayoutY(213.0);
                lblComTime.setText("Compount Times");
                lblComTime.setStyle("-fx-font-weight: bold");
                lblComTime.setFont(new Font("Book Antiqua", 18));
                TextField txtComTime = new TextField("");
                txtComTime.setLayoutX(198.0);
                txtComTime.setLayoutY(216.0);

                Label lblTime = new Label();
                lblTime.setLayoutX(46.0);
                lblTime.setLayoutY(270.0);
                lblTime.setText("Time");
                lblTime.setStyle("-fx-font-weight: bold");
                lblTime.setFont(new Font("Book Antiqua", 18));
                TextField txtTime = new TextField("");
                txtTime.setLayoutX(198.0);
                txtTime.setLayoutY(271.0);

                Label lblPayment = new Label();
                lblPayment.setLayoutX(46.0);
                lblPayment.setLayoutY(326.0);
                lblPayment.setText("Payment");
                lblPayment.setStyle("-fx-font-weight: bold");
                lblPayment.setFont(new Font("Book Antiqua", 18));
                TextField txtPayment = new TextField("");
                txtPayment.setLayoutX(198.0);
                txtPayment.setLayoutY(327.0);

                Label lblFutureVal = new Label();
                lblFutureVal.setLayoutX(45.0);
                lblFutureVal.setLayoutY(395.0);
                lblFutureVal.setText("Future Value");
                lblFutureVal.setStyle("-fx-font-weight: bold");
                lblFutureVal.setFont(new Font("Book Antiqua", 18));
                TextField txtFutVal = new TextField("");
                txtFutVal.setLayoutX(197.0);
                txtFutVal.setLayoutY(395.0);


                Button btnCalComIntr = new Button("Calculate");   //Calculation Button of Compound Interest Calculator Button
                btnCalComIntr.setLayoutX(453.0);
                btnCalComIntr.setLayoutY(340.0);
                btnCalComIntr.setPrefWidth(89.0);
                btnCalComIntr.setPrefHeight(37.0);
                btnCalComIntr.setFont(new Font(15));
                btnCalComIntr.setStyle("-fx-background-color:lightgreen;-fx-font-weight: bold;-fx-border-color: darkblue");
                btnCalComIntr.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        if (!txtAmount.getText().equals("")&&!txtAnnuRate.getText().equals("")&&!txtPayment.getText().equals("")&&!txtComTime.getText().equals("")&&!txtTime.getText().equals("")){
                            Double annuRate=Double.parseDouble(txtAnnuRate.getText());
                            Double payment=Double.parseDouble(txtPayment.getText());
                            Double time=Double.parseDouble(txtTime.getText());
                            Double comTime=Double.parseDouble(txtComTime.getText());
                            Double futureCal=payment*((Math.pow(1+(annuRate/comTime),(comTime*time))-1)/(annuRate/comTime));    //Calculation of the Future Value and rounding it

                            Double roundAns=Math.round(futureCal*1.00)/1.00;
                            String roundAnsTwo=String.valueOf(roundAns);
                            txtFutVal.setText(roundAnsTwo);


                        }else if (!txtAmount.getText().equals("")&&!txtAnnuRate.getText().equals("")&&!txtComTime.getText().equals("")&&!txtTime.getText().equals("")&&!txtFutVal.getText().equals("")) {
                            Double annuRate=Double.parseDouble(txtAnnuRate.getText());
                            Double comTime=Double.parseDouble(txtComTime.getText());
                            Double futureVal=Double.parseDouble(txtFutVal.getText());
                            Double inTime=Double.parseDouble(txtTime.getText());
                            Double paymentCal=futureVal*annuRate/((Math.pow(1+(annuRate/comTime),(comTime*inTime))-1)*comTime);  //Calculation of the Payment Value and Roundig it

                            Double roundAns=Math.round(paymentCal*1.00)/1.00;
                            String roundAnsTwo=String.valueOf(roundAns);
                            txtPayment.setText(roundAnsTwo);


                        }else if (!txtAmount.getText().equals("")&&!txtAnnuRate.getText().equals("")&&!txtComTime.getText().equals("")&&!txtTime.getText().equals("")&&!txtFutVal.getText().equals("")) {
                            Double annuRate=Double.parseDouble(txtAnnuRate.getText());
                            Double comTime=Double.parseDouble(txtComTime.getText());
                            Double payment=Double.parseDouble(txtPayment.getText());
                            Double futureVal=Double.parseDouble(txtFutVal.getText());

                            Double timeCalOne=Math.log(((futureVal*annuRate)/payment*comTime)+1);   //Calculation of the Time and Rounding it
                            Double timeCalTwo=Math.log(1+(annuRate/comTime));
                            Double timeCalThr=timeCalOne/(comTime*timeCalTwo);

                            Double roundAns=Math.round(timeCalThr*1.00)/1.00;
                            String roundAnsTwo=String.valueOf(roundAns);
                            txtTime.setText(roundAnsTwo);

                        } else{
                            Alert none = new Alert(Alert.AlertType.INFORMATION);
                            none.setAlertType(Alert.AlertType.INFORMATION);
                            none.setContentText("Please Check whether You have entered details Properly!!!");
                            none.showAndWait();
                        }
                    }
                });


                Pane rootFive = new Pane();
                rootFive.getChildren().addAll(txtAmount,txtAnnuRate,txtFutVal,txtPayment,txtComTime,txtTime,lblAmount,lblAnnuRate,lblComHead,lblComTime,lblFutureVal,lblPayment,lblTime,btnCalComIntr);
                //keyboard/num pad
                keyboard(txtAmount,rootFive);
                keyboard(txtAnnuRate,rootFive);
                keyboard(txtFutVal,rootFive);
                keyboard(txtPayment,rootFive);
                keyboard(txtComTime,rootFive);
                keyboard(txtTime,rootFive);

                comIntrStage.setScene(new Scene(rootFive, 645, 430));
                comIntrStage.show();

            }
        });
    }
    //Keyboard (Num Pad)
    static void keyboard(TextField tField, Pane pane) {
        tField.setOnMousePressed(new EventHandler<MouseEvent>() {   //when user click on the relavant textField

            @Override
            public void handle(MouseEvent event) {
                //Button Number 1 to 0 , . button,Clear and backspace Button
                Button btnNumOne = new Button("1");
                btnNumOne.setLayoutX(393.0);
                btnNumOne.setLayoutY(135.0);
                btnNumOne.setPrefSize(39, 43);
                btnNumOne.setStyle("-fx-background-color:lightgreen;-fx-font-weight: bold;-fx-border-color: darkgreen");

                btnNumOne.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        String text = tField.getText();
                        tField.setText(text + "1");
                    }
                });

                Button btnNumTwo = new Button("2");
                btnNumTwo.setLayoutX(438.0);
                btnNumTwo.setLayoutY(135.0);
                btnNumTwo.setPrefSize(39, 43);
                btnNumTwo.setStyle("-fx-background-color:lightgreen;-fx-font-weight: bold;-fx-border-color: darkgreen");

                btnNumTwo.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        String text = tField.getText();
                        tField.setText(text + "2");
                    }
                });

                Button btnNumThr = new Button("3");
                btnNumThr.setLayoutX(483.0);
                btnNumThr.setLayoutY(135.0);
                btnNumThr.setPrefSize(39, 43);
                btnNumThr.setStyle("-fx-background-color:lightgreen;-fx-font-weight: bold;-fx-border-color: darkgreen");

                btnNumThr.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        String text = tField.getText();
                        tField.setText(text + "3");
                    }
                });

                Button btnNumFour = new Button("4");
                btnNumFour.setLayoutX(393.0);
                btnNumFour.setLayoutY(181.0);
                btnNumFour.setPrefSize(39, 43);
                btnNumFour.setStyle("-fx-background-color:lightgreen;-fx-font-weight: bold;-fx-border-color: darkgreen");

                btnNumFour.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        String text = tField.getText();
                        tField.setText(text + "4");
                    }
                });

                Button btnNumFive = new Button("5");
                btnNumFive.setLayoutX(438.0);
                btnNumFive.setLayoutY(180.0);
                btnNumFive.setPrefSize(39, 43);
                btnNumFive.setStyle("-fx-background-color:lightgreen;-fx-font-weight: bold;-fx-border-color: darkgreen");

                btnNumFive.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        String text = tField.getText();
                        tField.setText(text + "5");
                    }
                });

                Button btnNumSix = new Button("6");
                btnNumSix.setLayoutX(483.0);
                btnNumSix.setLayoutY(181.0);
                btnNumSix.setPrefSize(39, 43);
                btnNumSix.setStyle("-fx-background-color:lightgreen;-fx-font-weight: bold;-fx-border-color: darkgreen");
                btnNumSix.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        String text = tField.getText();
                        tField.setText(text + "6");
                    }
                });

                Button btnNumSev = new Button("7");
                btnNumSev.setLayoutX(393.0);
                btnNumSev.setLayoutY(227.0);
                btnNumSev.setPrefSize(39, 43);
                btnNumSev.setStyle("-fx-background-color:lightgreen;-fx-font-weight: bold;-fx-border-color: darkgreen");
                btnNumSev.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        String text = tField.getText();
                        tField.setText(text + "7");
                    }
                });

                Button btnNumEight = new Button("8");
                btnNumEight.setLayoutX(438.0);
                btnNumEight.setLayoutY(227.0);
                btnNumEight.setPrefSize(39, 43);
                btnNumEight.setStyle("-fx-background-color:lightgreen;-fx-font-weight: bold;-fx-border-color: darkgreen");

                btnNumEight.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        String text = tField.getText();
                        tField.setText(text + "8");
                    }
                });

                Button btnNumNine = new Button("9");
                btnNumNine.setLayoutX(483.0);
                btnNumNine.setLayoutY(227.0);
                btnNumNine.setPrefSize(39, 43);
                btnNumNine.setStyle("-fx-background-color:lightgreen;-fx-font-weight: bold;-fx-border-color: darkgreen");
                btnNumNine.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        String text = tField.getText();
                        tField.setText(text + "9");
                    }
                });

                Button btnNumZero = new Button("0");
                btnNumZero.setLayoutX(392.0);
                btnNumZero.setLayoutY(273.0);
                btnNumZero.setPrefSize(88,43);
                btnNumZero.setStyle("-fx-background-color:lightgreen;-fx-font-weight: bold;-fx-border-color: darkgreen");

                btnNumZero.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        String text = tField.getText();
                        tField.setText(text + "0");
                    }
                });

                Button btnBack = new Button("Back");
                btnBack.setLayoutX(526.0);
                btnBack.setLayoutY(224.0);
                btnBack.setPrefSize(46,92);
                btnBack.setStyle("-fx-background-color:lightgreen;-fx-font-weight: bold;-fx-border-color: darkgreen");
                btnBack.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        String text = tField.getText();
                        tField.setText(text.substring(0, text.length() - 1));
                    }
                });

                Button btnPoint = new Button(".");
                btnPoint.setLayoutX(484.0);
                btnPoint.setLayoutY(273.0);
                btnPoint.setPrefSize(39,43);
                btnPoint.setStyle("-fx-background-color:lightgreen;-fx-font-weight: bold;-fx-border-color: darkgreen");
                btnPoint.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        String text = tField.getText();
                        tField.setText(text + ".");
                    }
                });
                Button btnClear = new Button("C");
                btnClear.setLayoutX(526.0);
                btnClear.setLayoutY(135.0);
                btnClear.setPrefSize(46,86);
                btnClear.setStyle("-fx-background-color:lightgreen;-fx-font-weight: bold;-fx-border-color: darkgreen");
                btnClear.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        tField.setText("");
                    }
                });
                pane.getChildren().addAll(btnNumOne, btnNumTwo, btnNumThr, btnNumFour, btnNumFive, btnNumSix, btnNumSev, btnNumEight, btnNumNine, btnNumZero, btnBack,btnPoint,btnClear);
                //adding all num pad numbers into pane
            }
        });
    }
}

