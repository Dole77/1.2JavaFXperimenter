import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;
import org.jetbrains.annotations.NotNull;

public class GuiController {
    public Label label;
    public Label label2;
    public Button EKG;
/*
        @FXML
        public TextArea EKGWiev;

        public void startEkg(MouseEvent mouseEvent) {
            public static void main(String[] args) {
                launch(args);
            }

            @Override
            public void start(Stage primaryStage) {
                Label l = new Label("Hello, JavaFX!");
                Label l2 = new Label("Its a fine day!");
                FlowPane flowPane = new FlowPane(Orientation.VERTICAL);
                flowPane.getChildren().add(l);
                flowPane.getChildren().add(l2);
                Scene scene = new Scene(flowPane,640,480);
                primaryStage.setScene(scene);
                primaryStage.show();

            }
        }




/*
    public void EKG(@NotNull Stage primaryStage) {
        Button button = new Button("Draw a graph");
        Polyline polyline = new Polyline();

        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                for (int i = 0; i < 40; i++) {
                    polyline.getPoints().addAll(i*5.0 , Math.random() * 480);
                    try {
                        Thread.sleep(250);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getChildren().addAll(button,polyline);
        Scene scene = new Scene(anchorPane,640,480);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void buttonClicked(ActionEvent actionEvent) {
        label.setText("Hurra!");
        Node source = (Node) actionEvent.getSource();/*
        Scene scene = source.getScene();
        Stage window = (Stage) scene.getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Patient.fxml"));
    }
    public void buttonClicked2(ActionEvent actionEvent) {
        label2.setText("Math");
        Node source = (Node) actionEvent.getSource();/*
        Scene scene = source.getScene();
        Stage window = (Stage) scene.getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Patient.fxml"));
    }*/
}
