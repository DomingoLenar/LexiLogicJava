package org.amalgam.lexilogicserver;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import org.amalgam.lexilogicserver.model.microservices.daemonHandler.ORBDException;
import org.amalgam.lexilogicserver.model.microservices.daemonHandler.ORBDOperationCallback;
import org.amalgam.lexilogicserver.views.addplayer.AddPlayerController;
import org.amalgam.lexilogicserver.views.changegame.ChangeGameController;
import org.amalgam.lexilogicserver.views.runserver.RunServerRunningController;
import org.amalgam.lexilogicserver.views.servermainmenu.ServerMainMenuController;
import org.amalgam.lexilogicserver.views.runorbd.RunORBDController;
import org.amalgam.lexilogicserver.views.runserver.RunServerController;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Future;

public class ServerController implements ORBDOperationCallback {
    public Stage stage;

    public static ServerMainMenuController serverMainMenuController;
    public static AnchorPane serverMainMenuPane;

    public static ChangeGameController changeGameController;
    public static AnchorPane changeGamePane;

    public static RunORBDController runORBDController;
    public static AnchorPane runORBDPane;

    public static RunServerController runServerController;
    public static AnchorPane runServerPane;

    public static Future<Integer> ORBExitCode;


    /**
     * Getters and Setters of Controllers and Panels
     */
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public ServerMainMenuController getServerMainMenuController() {
        return serverMainMenuController;
    }

    public ChangeGameController getChangeGameController() {
        return changeGameController;
    }

    public RunORBDController getRunORBDController() {
        return runORBDController;
    }

    public RunServerController getRunServerController() {
        return runServerController;
    }

    /**
     * Loads and displays the server main menu view.
     */
    public void loadServerMainMenu() {
        try {
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/BowlbyOneSC.ttf"), 20);
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/Brygada1918.ttf"), 20);

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/amalgam/server.views/servermainmenu/servermainmenu-view.fxml"));
            AnchorPane serverMainMenu = fxmlLoader.load();

            InputStream inputStream = getClass().getResourceAsStream("/org/amalgam/icons/Logo.png");
            if (inputStream != null) {
                Image image = new Image(inputStream);
                stage.getIcons().add(image);
            } else {
                System.err.println("Failed to load image: Logo.png");
            }

            Scene scene = new Scene(serverMainMenu);

            if (stage == null) {
                throw new IllegalStateException("Stage is not set. Please set the stage before calling the panel.");
            }

            stage.setScene(scene);
            stage.setResizable(false);
            stage.setTitle("Lexi Logic");
            ServerMainMenuController serverMainMenuController = fxmlLoader.getController();
            serverMainMenuController.setServerController(this);
            serverMainMenuController.initialize();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads and displays the run server view.
     */
    public void loadRunServer() {
        try {
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/BowlbyOneSC.ttf"), 20);
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/Brygada1918.ttf"), 20);

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/amalgam/server.views/runserver/runserver-view.fxml"));
            AnchorPane runServer = fxmlLoader.load();

            InputStream inputStream = getClass().getResourceAsStream("/org/amalgam/icons/Logo.png");
            if (inputStream != null) {
                Image image = new Image(inputStream);
                stage.getIcons().add(image);
            } else {
                System.err.println("Failed to load image: Logo.png");
            }

            Scene scene = new Scene(runServer);

            if (stage == null) {
                throw new IllegalStateException("Stage is not set. Please set the stage before calling the panel.");
            }

            stage.setScene(scene);
            stage.setResizable(false);
            stage.setTitle("Lexi Logic");
            RunServerController runServerController = fxmlLoader.getController();
            runServerController.setServerController(this);
            runServerController.initialize();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads and displays the run server view.
     */
    public void loadRunServerRunning() {
        try {
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/BowlbyOneSC.ttf"), 20);
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/Brygada1918.ttf"), 20);

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/amalgam/server.views/runserver/runserverrunning-view.fxml"));
            AnchorPane runServerRunning = fxmlLoader.load();

            InputStream inputStream = getClass().getResourceAsStream("/org/amalgam/icons/Logo.png");
            if (inputStream != null) {
                Image image = new Image(inputStream);
                stage.getIcons().add(image);
            } else {
                System.err.println("Failed to load image: Logo.png");
            }

            Scene scene = new Scene(runServerRunning);

            if (stage == null) {
                throw new IllegalStateException("Stage is not set. Please set the stage before calling the panel.");
            }

            stage.setScene(scene);
            stage.setResizable(false);
            stage.setTitle("Lexi Logic");
            RunServerRunningController runServerRunningController = fxmlLoader.getController();
            runServerRunningController.setServerController(this);
            runServerRunningController.initialize();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads and displays the run orbd view.
     */
    public void loadRunORBD() {
        try {
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/BowlbyOneSC.ttf"), 20);
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/Brygada1918.ttf"), 20);

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/amalgam/server.views/runorbd/runorbd-view.fxml"));
            AnchorPane runORBD = fxmlLoader.load();

            InputStream inputStream = getClass().getResourceAsStream("/org/amalgam/icons/Logo.png");
            if (inputStream != null) {
                Image image = new Image(inputStream);
                stage.getIcons().add(image);
            } else {
                System.err.println("Failed to load image: Logo.png");
            }

            Scene scene = new Scene(runORBD);

            if (stage == null) {
                throw new IllegalStateException("Stage is not set. Please set the stage before calling the panel.");
            }

            stage.setScene(scene);
            stage.setResizable(false);
            stage.setTitle("Lexi Logic");
            RunORBDController runORBDController = fxmlLoader.getController();
            runORBDController.setServerController(this);
            runORBDController.initialize();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads and displays the change game view.
     */
    public void loadChangeGame() {
        try {
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/BowlbyOneSC.ttf"), 20);
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/Brygada1918.ttf"), 20);

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/amalgam/server.views/changegame/changegame-view.fxml"));
            AnchorPane changeGame = fxmlLoader.load();

            InputStream inputStream = getClass().getResourceAsStream("/org/amalgam/icons/Logo.png");
            if (inputStream != null) {
                Image image = new Image(inputStream);
                stage.getIcons().add(image);
            } else {
                System.err.println("Failed to load image: Logo.png");
            }

            Scene scene = new Scene(changeGame);

            if (stage == null) {
                throw new IllegalStateException("Stage is not set. Please set the stage before calling the panel.");
            }

            stage.setScene(scene);
            stage.setResizable(false);
            stage.setTitle("Lexi Logic");
            ChangeGameController changeGameController = fxmlLoader.getController();
            changeGameController.setServerController(this);
            changeGameController.initialize();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        /**
     * Loads and displays the change game view.
     */
    public void loadAddPlayer() {
        try {
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/BowlbyOneSC.ttf"), 20);
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/Brygada1918.ttf"), 20);

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/amalgam/server.views/addplayer/addplyer-view.fxml"));
            AnchorPane addPlayer = fxmlLoader.load();

            InputStream inputStream = getClass().getResourceAsStream("/org/amalgam/icons/Logo.png");
            if (inputStream != null) {
                Image image = new Image(inputStream);
                stage.getIcons().add(image);
            } else {
                System.err.println("Failed to load image: Logo.png");
            }

            Scene scene = new Scene(addPlayer);

            if (stage == null) {
                throw new IllegalStateException("Stage is not set. Please set the stage before calling the panel.");
            }

            stage.setScene(scene);
            stage.setResizable(false);
            stage.setTitle("Lexi Logic");
            AddPlayerController addPlayerController = fxmlLoader.getController();
            addPlayerController.setServerController(this);
            addPlayerController.initialize();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void notifyOrbExit() throws ORBDException {
        try {
            //TODO: Prompt with ui that ORB has exited
            System.out.println("ORB has exited with exit code: " + ORBExitCode.get());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

