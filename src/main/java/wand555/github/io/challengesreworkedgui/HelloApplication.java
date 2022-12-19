package wand555.github.io.challengesreworkedgui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("overview.fxml"));
        ResourceBundle.clearCache();
        ResourceBundle bundle = ResourceBundle.getBundle("wand555/github/io/challengesreworkedgui/lang_bundle");
        fxmlLoader.setResources(bundle);
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 1000, 1000);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}