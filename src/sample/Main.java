package sample;

        import javafx.application.Application;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Pizza Keeper");

        Scene scene1 = new Scene(root);


//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
        primaryStage.setScene(scene1);
        primaryStage.setHeight(900);
        primaryStage.setWidth(1600);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
