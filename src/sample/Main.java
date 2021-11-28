package sample;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class Main extends Application {

    private static Stage stage;

    private static Scene loginScene;
    private static Scene homeScene;
    private static Scene communityScene;

    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;
        primaryStage.setTitle("Game World");
        primaryStage.setResizable(false);

        // Login
        Parent fxmlLogin = FXMLLoader.load(getClass().getResource("sample.fxml"));
        loginScene = new Scene(fxmlLogin, 385, 760);

        String loginCss = getClass().getResource("styles/login.css").toExternalForm();
        loginScene.getStylesheets().add(loginCss);

        //Home
        Parent fxmlHome = FXMLLoader.load(getClass().getResource("home.fxml"));
        homeScene = new Scene(fxmlHome, 385, 760);

        String homeCss = getClass().getResource("styles/home.css").toExternalForm();
        homeScene.getStylesheets().add(homeCss);

        //Community
        Parent fxmlComunnity = FXMLLoader.load(getClass().getResource("community.fxml"));
        communityScene = new Scene(fxmlComunnity, 385, 760);

        String communityCss = getClass().getResource("styles/community.css").toExternalForm();
        communityScene.getStylesheets().add(communityCss);

        primaryStage.setScene(loginScene);
        primaryStage.show();
    }

    //Trocar de tela
    public static void changeScreen(String scr) {
        switch (scr) {
            case "login":
                stage.setScene(loginScene);
                break;
            case "home":
                stage.setScene(homeScene);
                break;
            case "community":
                stage.setScene(communityScene);
                break;
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
