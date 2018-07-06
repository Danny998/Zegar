package sample;

import java.text.SimpleDateFormat;
import java.util.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import java.util.Date.*;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Date gr = new Date(118, 11,32);
        Pane root = new Pane();;
        SimpleDateFormat year = new SimpleDateFormat("yyyy");
        SimpleDateFormat month = new SimpleDateFormat("MM");
        SimpleDateFormat day = new SimpleDateFormat("dd");
        SimpleDateFormat hours = new SimpleDateFormat("HH");
        SimpleDateFormat minutes = new SimpleDateFormat("mm");
        SimpleDateFormat seconds = new SimpleDateFormat("ss");
        Text text= new Text(150,50,"Czas do końca roku blyat");
        /*text.setText("Czas do końca roku blyat");
        text.setX(400);
        text.setY(100);
        */
        SimpleDateFormat df = new SimpleDateFormat("EEEE yyyy.MM.dd 'Godzina: ' HH:mm:ss");
        StackPane pane = new StackPane();
        System.out.print(df.format(gr));
        Date data = new Date();
        int monthtonextyear =  Integer.parseInt(month.format(data)) - Integer.parseInt(month.format(gr));
        int daytonextyear =  Integer.parseInt(day.format(data)) - Integer.parseInt(day.format(gr));
        System.out.print(daytonextyear);
        Text date = new Text(200,250,df.format(data));
        root.getChildren().addAll(date,text);
        Scene scene = new Scene(root,500,500);

        primaryStage.setTitle("Zegar tyka");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}