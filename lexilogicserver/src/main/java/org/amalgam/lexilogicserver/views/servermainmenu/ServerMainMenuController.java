package org.amalgam.lexilogicserver.views.servermainmenu;

import com.sun.org.apache.xpath.internal.operations.Or;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import org.amalgam.lexilogicserver.Server;
import org.amalgam.lexilogicserver.ServerController;
import org.amalgam.lexilogicserver.model.microservices.daemonHandler.ORBDException;
import org.amalgam.lexilogicserver.model.microservices.daemonHandler.ORBDOperationCallback;
import org.amalgam.lexilogicserver.model.microservices.daemonHandler.ORBDRunner;
import org.amalgam.lexilogicserver.model.microservices.serverHandler.ORBServer;
import org.amalgam.lexilogicserver.views.runorbd.RunORBDController;
import org.amalgam.lexilogicserver.views.runserver.RunServerController;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.amalgam.lexilogicserver.views.runorbd.RunORBDController.process;

public class ServerMainMenuController{
    //private variables
    @FXML
    private AnchorPane serverMainMenuPane;
    @FXML
    private Button addPlayerButton;
    @FXML
    private Button changeGameButton;
    @FXML
    private Button runORBDButton;
    @FXML
    private Button runServerButton;
    @FXML
    private Button accountDeletionButton;
    private ServerController serverController;
    private boolean isServerRunning;



    /**
     * Sets the Main Controller.
     *
     * @param serverController
     */
    public void setServerController(ServerController serverController) {
        this.serverController = serverController;
    }

    /**
     * Adds hover effect to the given button.
     *
     * @param button The button to add hover effect to.
     */
    private void addRunHoverEffect(Button button) {
        button.setOnMouseEntered(e -> button.setStyle("-fx-background-color: derive(#9CA16F, -10%);"));
        button.setOnMouseExited(e -> button.setStyle("-fx-background-color: #9CA16F;"));
    }

    private void addHoverEffect(Button button){
        button.setOnMouseEntered(e -> button.setStyle("-fx-background-color: derive(#B07C3B, -10%);"));
        button.setOnMouseExited(e -> button.setStyle("-fx-background-color: #B07C3B;"));
    }

    /**
     * Shows an alert to a user if there is an error.
     *
     * @param message
     */
    private void showAlert(String message){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    private void showSuccess(String message){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success!");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    /**
     * Handles the add player button
     */
    @FXML
    public void handleAddPlayerButton(){
        if (serverController != null) {
            serverController.loadAddPlayer();
        }else {
            System.out.println("Server controller is not set.");
        }
    }
    /**
     * Handles the change game option button
     */
    @FXML
    public void handleChangeGameButton(){
        if (serverController !=null){
            serverController.loadChangeGame();
        }else{
            System.out.println("Server controller is not set.");
        }
    }
    /**
     * Handles the account deletion button
     */
    @FXML
    public void handleAccountDeletionButton(){
        if(serverController !=null){
            serverController.loadAccountDeletion();
        }else {
            System.out.println("Server controller is not set.");
        }
    }
    /**
     * Handles the run ORBD Button
     */
    @FXML
    public void handleRunORBDButton(){
        if (serverController != null) {
            // Check if both server and ORBD are running
            boolean isServerRunning = isServerRunning();
            boolean isORBDRunning = isORBDRunning();

            if (isORBDRunning || isServerRunning) {
                serverController.loadRunORBDRunningView();
            } else {
                serverController.loadRunORBD();
            }
        } else {
            System.out.println("Server Controller is not set.");
        }
    }

    private boolean isServerRunning() {
        return process !=null && process.isAlive();
    }

    private boolean isORBDRunning() {
        return ServerController.isDaemonRunning;
    }
    /**
     * Handles the runServer Button
     */
    @FXML
    public void handleRunServerButton(){
        if (serverController != null) {
            try {
                if(!ServerController.isServerRunning && ServerController.isDaemonRunning){
                    serverController.startServer();
                    serverController.loadRunServerRunning();
                }else if (ServerController.isDaemonRunning){
                    showSuccess("Server Already Running");
                    serverController.loadRunServerRunning();
                } else {
                    showAlert("Run Daemon First");
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error starting server: ");
            }
        } else {
            System.out.println("Server Controller is not set.");
        }
    }
    /**
     * Initializes the controller.
     * This method sets up the UI components and initializes the data model.
     */
    @FXML
    public void initialize() {
        addHoverEffect(addPlayerButton);
        addHoverEffect(changeGameButton);
        addHoverEffect(runORBDButton);
        addHoverEffect(accountDeletionButton);
        addRunHoverEffect(runServerButton);
        addPlayerButton.setOnAction(event -> handleAddPlayerButton());
        changeGameButton.setOnAction(event -> handleChangeGameButton());
        runORBDButton.setOnAction(event -> handleRunORBDButton());
        runServerButton.setOnAction(event -> handleRunServerButton());
        accountDeletionButton.setOnAction(event -> handleAccountDeletionButton());

    }
}
