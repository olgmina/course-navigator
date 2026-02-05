package org.example.coursenavigator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CourseNavigatorApp extends Application {


    public void start(Stage stage) throws IOException {

        mainwork(stage);
}
/*
    загрузка главной сцены - навигации по курсу

 */
   private void mainwork(Stage stage) throws IOException  {
       FXMLLoader fxmlLoader = new FXMLLoader(CourseNavigatorApp.class.getResource("MainView.fxml"));
       Scene scene = new Scene(fxmlLoader.load(), 320, 240);
       stage.setTitle("Навигатор курса - Кросс-платформенная разработка");
       stage.setScene(scene);
       stage.show();
   }

    /*
       загрузка прототипов лаб

    */
    private void work1(Stage stage) throws IOException  {
        FXMLLoader fxmlLoader = new FXMLLoader(CourseNavigatorApp.class.getResource("ConvertView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Лаб. 1");
        stage.setScene(scene);
        stage.show();
    }



    public static void main(String[] args) {
        launch();
    }
}
