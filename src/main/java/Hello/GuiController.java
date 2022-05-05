package Hello;

import Buisnes.EKGController;
import Buisnes.EKGControllerImpl;
import Buisnes.EKGObserver;
import Data.EKGData;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;


public class GuiController implements EKGObserver {
    EKGController ekgController = new EKGControllerImpl();
    @FXML
    public TextArea ekgView;

    public void startEkg(MouseEvent mouseEvent) {
        ekgController.startrecording();
        ekgController.registerObserver(this);
    }

    @Override
    public void handle(EKGData ekgData) {
        ekgView.setText(ekgView.getText() + "\n" + ekgData);

    }
 /*   public Label label;
    public Label label2;
    public Button EKG;*/

}
