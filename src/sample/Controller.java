package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.Optional;

public class Controller {

    int boyutAcikMi = 1, pizzalarAcikMi = 1, tatlilarAcikMi = 1, iceceklerAcikMi = 1;

    @FXML public TitledPane pizzalarTitledPane;
    @FXML public TitledPane boyutTitledPane;
    @FXML public TitledPane tatlilarTitledPane;
    @FXML public TitledPane iceceklerTitledPane;

    @FXML public JFXButton signUp;
    @FXML public HBox leftHBox;
    @FXML public HBox rightHBox;
    @FXML public AnchorPane loginAnchorPane;
    @FXML public AnchorPane signupAnchorPane;
    @FXML public JFXTextField emailInfo;
    @FXML public JFXPasswordField passwdInfo;
    @FXML public AnchorPane mainAnchorPane;

    @FXML private RadioButton mediumRadioButton;
    @FXML private RadioButton largeRadioButton;
    @FXML private RadioButton extraLargeRadioButton;
    @FXML private RadioButton extraExtraLargeRadioButton;

    @FXML private RadioButton egeliSebzeliPizza;
    @FXML private RadioButton favoriDortluPizza;
    @FXML private RadioButton yaprakDonerliPizza;
    @FXML private RadioButton kampusPizza;
    @FXML private RadioButton keyfimPizza;
    @FXML private RadioButton italyanPizza;
    @FXML private RadioButton margaritaPizza;
    @FXML private RadioButton simartanPizza;
    @FXML private RadioButton sucukZenginiPizza;
    @FXML private RadioButton superKarisikPizza;
    @FXML private RadioButton tavukluAciliPizza;
    @FXML private RadioButton tavukluPizza;

    @FXML private RadioButton ucAdetSufle;
    @FXML private RadioButton algidaMarasDondurma;
    @FXML private RadioButton carteDorKarnavaliDondurma;
    @FXML private RadioButton cikolataliLatte;
    @FXML private RadioButton cikolataliPasta;
    @FXML private RadioButton mozaikPasta;

    @FXML private RadioButton liptonSeftaliUcYuzML;
    @FXML private RadioButton pepsiDortYuzElliML;
    @FXML private RadioButton pepsiKutuUcYuzOtuzML;
    @FXML private RadioButton yedigunUcYuzOtuzML;

    private ToggleGroup boyut;
    private ToggleGroup pizzalar;
    private ToggleGroup tatlilarDondurmalar;
    private ToggleGroup icecekler;

    public void girisMetodu(){
        if(emailInfo.getText().equals("root") && passwdInfo.getText().equals("123")){
            System.out.println("Success");
            boyut = new ToggleGroup();
            this.mediumRadioButton.setToggleGroup(boyut);
            this.largeRadioButton.setToggleGroup(boyut);
            this.extraLargeRadioButton.setToggleGroup(boyut);
            this.extraExtraLargeRadioButton.setToggleGroup(boyut);

            pizzalar = new ToggleGroup();
            this.egeliSebzeliPizza.setToggleGroup(pizzalar);
            this.favoriDortluPizza.setToggleGroup(pizzalar);
            this.yaprakDonerliPizza.setToggleGroup(pizzalar);
            this.kampusPizza.setToggleGroup(pizzalar);
            this.keyfimPizza.setToggleGroup(pizzalar);
            this.italyanPizza.setToggleGroup(pizzalar);
            this.margaritaPizza.setToggleGroup(pizzalar);
            this.simartanPizza.setToggleGroup(pizzalar);
            this.sucukZenginiPizza.setToggleGroup(pizzalar);
            this.superKarisikPizza.setToggleGroup(pizzalar);
            this.tavukluAciliPizza.setToggleGroup(pizzalar);
            this.tavukluPizza.setToggleGroup(pizzalar);

            tatlilarDondurmalar = new ToggleGroup();
            this.ucAdetSufle.setToggleGroup(tatlilarDondurmalar);
            this.algidaMarasDondurma.setToggleGroup(tatlilarDondurmalar);
            this.carteDorKarnavaliDondurma.setToggleGroup(tatlilarDondurmalar);
            this.cikolataliLatte.setToggleGroup(tatlilarDondurmalar);
            this.cikolataliPasta.setToggleGroup(tatlilarDondurmalar);
            this.mozaikPasta.setToggleGroup(tatlilarDondurmalar);

            icecekler = new ToggleGroup();
            this.liptonSeftaliUcYuzML.setToggleGroup(icecekler);
            this.pepsiDortYuzElliML.setToggleGroup(icecekler);
            this.pepsiKutuUcYuzOtuzML.setToggleGroup(icecekler);
            this.yedigunUcYuzOtuzML.setToggleGroup(icecekler);

            showMainPane();
        }
        else {
            System.out.println("Nope");
        }
    }

    public void loginButton(ActionEvent event) {
        girisMetodu();
    }
    public void pressedEnterToLogin(KeyEvent keyEvent) {
        if(keyEvent.getCode() == KeyCode.ENTER){
            girisMetodu();
        }
    }



    public void cikisYap(ActionEvent actionEvent) {
        loginAnchorPane.setVisible(true);
        signupAnchorPane.setVisible(false);
        leftHBox.setVisible(true);
        rightHBox.setVisible(true);
        mainAnchorPane.setVisible(false);
    }

    public void showMainPane(){
        signupAnchorPane.setVisible(false);
        loginAnchorPane.setVisible(false);
        leftHBox.setVisible(false);
        rightHBox.setVisible(false);
        mainAnchorPane.setVisible(true);
    }

    public void showLoginAnchorPane(ActionEvent event) {
        loginAnchorPane.setVisible(true);
        signupAnchorPane.setVisible(false);
        leftHBox.setVisible(true);
        rightHBox.setVisible(true);
        mainAnchorPane.setVisible(false);
    }

    public void showSignupAnchorPane(ActionEvent event) {

        loginAnchorPane.setVisible(false);
        signupAnchorPane.setVisible(true);
        leftHBox.setVisible(true);
        rightHBox.setVisible(true);
        mainAnchorPane.setVisible(false);
    }

    public void snapPizzalar(MouseEvent mouseEvent) {

        if(boyutAcikMi == 1){
            boyutTitledPane.setPrefHeight(0);
            boyutAcikMi = 0;
        }
        else{
            boyutTitledPane.setPrefHeight(69);
            boyutAcikMi = 1;
        }

    }
    public void snapTatlilar(MouseEvent mouseEvent) {
        if(pizzalarAcikMi == 1){
            pizzalarTitledPane.setPrefHeight(0);
            pizzalarAcikMi = 0;
        }
        else {
            pizzalarTitledPane.setPrefHeight(242);
            pizzalarAcikMi = 1;
        }
    }

    public void snapIcecekler(MouseEvent mouseEvent) {
        if(tatlilarAcikMi == 1){
            tatlilarTitledPane.setPrefHeight(0);
            tatlilarAcikMi = 0;
        }
        else {
            tatlilarTitledPane.setPrefHeight(235);
            tatlilarAcikMi = 1;
        }
    }

    public void hakkindaMetodu(ActionEvent actionEvent) {
        Alert al = new Alert(Alert.AlertType.INFORMATION);
        al.setTitle("Hakkında");
        al.setHeaderText("Hakkında");
        al.setContentText("Emeği Geçenler:\n\nAydın Yalçın\nLevent Buğdaycı\nOsman Dirmencioğlu\nBerkan Sözer");
        al.showAndWait();
    }

    public void kapat(ActionEvent actionEvent) {
        Alert cikisAlert = new Alert(Alert.AlertType.CONFIRMATION);
        cikisAlert.setTitle("Çıkış Yap");
        cikisAlert.setHeaderText("Emin misiniz?");
        cikisAlert.setResizable(false);


        Optional<ButtonType> result = cikisAlert.showAndWait();
        if(!result.isPresent()){
        }
        else if(result.get() == ButtonType.OK){
            Platform.exit();
            System.exit(0);
        }
        //oke button is pressed
        else if(result.get() == ButtonType.CANCEL){

        }

    }
}
