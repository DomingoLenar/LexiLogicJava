package org.amalgam.client.loading;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;
import org.amalgam.client.MainController;
import javafx.scene.image.ImageView;

public class LoadingController {

    // Private Variables
    @FXML
    private AnchorPane loadingPane;
    @FXML
    private ImageView loadingLogImage;

    private MainController mainController;
    /**
     * Sets the Main Controller.
     *
     * @param mainController
     */
    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
    /**
     * Gets the objects used.
     * This method returns a string indicating the type of objects used by the controller.
     *
     * @return A string representing the objects used.
     */
    //TODO: @Override
    private void getObjectsUsed() {
        //TODO: Return Value
        //return "user";
    }

    public void animateLog(){
        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setNode(loadingLogImage);
        rotateTransition.setDuration(Duration.millis(1000));
        rotateTransition.setCycleCount(TranslateTransition.INDEFINITE);
        rotateTransition.setInterpolator(Interpolator.LINEAR);
        rotateTransition.setByAngle(360);
        rotateTransition.setAxis(Rotate.Z_AXIS);
        rotateTransition.play();

    }

    /**
     * Fetches and updates data remotely.
     * This method is called to update the data displayed in the UI.
     *
     */
    //TODO: @Override
    private void fetchAndUpdate() {
        //TODO: Fetching of Data
    }

    @FXML
    public void initialize() {
        // animation for the loading log (c.o lestat)
        animateLog();
    }
}
