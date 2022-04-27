package progetto.server;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import progetto.client.login.Login;

public class Server extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/server.fxml"));
        primaryStage.setTitle("SERVER LOG");
        Scene s = new Scene(root, 600, 500);
        s.getStylesheets().add(Login.class.getResource("/css.css").toExternalForm());
        primaryStage.setScene(s);
        primaryStage.setResizable(false);
        primaryStage.setOnCloseRequest(event -> {
            Platform.exit();
            System.exit(0);
        }); // disable server when close window
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}