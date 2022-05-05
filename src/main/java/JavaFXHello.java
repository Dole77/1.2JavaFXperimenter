// Kode hentet fra :
// https://github.com/cbudtz/IT2Lektion08MVCapp

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class JavaFXHello extends Application {
    public static void run() {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui.fxml"));
        Scene scene = loader.load();

        stage.setScene(scene);
        stage.show();

    }
}
