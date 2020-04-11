package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class Controller {

    @FXML public TitledPane firTitledPane;
    @FXML public JFXButton signUp;
    @FXML public HBox leftHBox;
    @FXML public HBox rightHBox;
    @FXML public AnchorPane loginAnchorPane;
    @FXML public AnchorPane signupAnchorPane;
    @FXML public JFXTextField emailInfo;
    @FXML public JFXPasswordField passwdInfo;
    @FXML public AnchorPane mainAnchorPane;
    @FXML private JFXButton loginButton;

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

    public void loginButton(ActionEvent event) {

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
    }

    public void showSignupAnchorPane(ActionEvent event) {

        loginAnchorPane.setVisible(false);
        signupAnchorPane.setVisible(true);
    }

}
