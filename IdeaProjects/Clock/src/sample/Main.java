package sample;
import java.io.Console;
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

    int secondsLeft;
    StringBuilder builder = new StringBuilder();
    //
    @Override
    public void start(Stage primaryStage) {
        int daysinyear = 365;
        final int monthInYear = 12;
        final int hoursInDay = 24;
        final int minInHours = 60;
        final int secInMin = 60;
        int finalSeconds;
        int finalSecondsNextYear;

        SimpleDateFormat year = new SimpleDateFormat("yyyy");
        SimpleDateFormat df = new SimpleDateFormat("EEEE yyyy.mm.dd 'Godzina: ' HH:mm:ss");;
        SimpleDateFormat month = new SimpleDateFormat("MMMM");
        SimpleDateFormat day = new SimpleDateFormat("D");
        SimpleDateFormat hours = new SimpleDateFormat("HH");
        SimpleDateFormat minutes = new SimpleDateFormat("mm");
        SimpleDateFormat seconds = new SimpleDateFormat("ss");
        Date data = new Date();
        Date gr = new Date(118, 11,32);
        int a = Integer.parseInt(year.format(data));
        int n = Integer.parseInt(year.format(gr));
        int acctualdayinyear = Integer.parseInt(day.format(data));
        int nextYear = Integer.parseInt(year.format(gr));
        int yearInNextsYear = Integer.parseInt(year.format(gr));
        int secondsToNextYear;
        int minutesToNextYear;
        int hoursToNextYear;
        int daysToNextYear;
        int monthstonextyear;
        String monthinthisyear =  month.format(data);String monthinnextyear = month.format(gr);
        if(a%4==0 && a%100!=0 || a%400==0 ){
            daysinyear=daysinyear+1;

        }else {
            //convert acctual hours, minutes to seconds
            int secondsbetweenhoursandsec = ((Integer.parseInt(hours.format(data))*minInHours)*secInMin) + (Integer.parseInt(minutes.format(data))*secInMin) + Integer.parseInt(seconds.format(data));
            int acctualyear = Integer.parseInt(year.format(data));
            finalSeconds = acctualdayinyear * hoursInDay * minInHours * secInMin+secondsbetweenhoursandsec;
            finalSecondsNextYear = (daysinyear+1) * hoursInDay * minInHours * secInMin;
            secondsLeft = finalSecondsNextYear - finalSeconds;

        }

        daysToNextYear = secondsLeft / secInMin / minInHours / hoursInDay;
        secondsLeft = secondsLeft - daysToNextYear * secInMin * minInHours * hoursInDay;
        hoursToNextYear = secondsLeft / secInMin / minInHours;
        secondsLeft = secondsLeft - hoursToNextYear * secInMin * minInHours;
        minutesToNextYear = secondsLeft / secInMin;
        secondsLeft = secondsLeft - minutesToNextYear * secInMin;
        builder.append("There is "+daysToNextYear+" days "+ hoursToNextYear+" hours "+ minutesToNextYear+" minutes "+ secondsLeft+" seconds to next year");
        String completedString = builder.toString();
        System.out.println(completedString);
        Text text= new Text(50,50,"Czas do końca roku blyat"+"\n"+completedString );
        Pane root = new Pane();
        StackPane pane = new StackPane();
        root.getChildren().addAll(text);
        Scene scene = new Scene(root,500,500);

        primaryStage.setTitle("Zegar tyka");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}