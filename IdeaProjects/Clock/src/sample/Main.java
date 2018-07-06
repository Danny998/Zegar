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
        int daysinyear = 365;
        final int monthinyear = 12;
        final int mininhours = 60;
        final int secinmin = 60;
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
        int acctualday = Integer.parseInt(day.format(data));
        int yearinnextsyear = Integer.parseInt(year.format(gr));
        String monthinthisyear =  month.format(data);String monthinnextyear = month.format(gr);
        int dayinthisyear =  Integer.parseInt(day.format(data));int daysinnextyear = Integer.parseInt(day.format(gr));
        int hoursinthisyear = Integer.parseInt(hours.format(data));int hoursinnextyear = Integer.parseInt(hours.format(gr));
        int minutesinthisyear = Integer.parseInt(minutes.format(data));int minutesinnextyear = Integer.parseInt(minutes.format(gr));
        int secondsinthisyear = Integer.parseInt(seconds.format(data));int secondsinnextyear = Integer.parseInt(seconds.format(gr));
        if(a%4==0 && a%100!=0 || a%400==0 ){
            daysinyear=daysinyear+1;
        }else{
            int acctualyear = Integer.parseInt(year.format(data));
            String acctualmonth = month.format(data);
            switch (acctualmonth){
                case "styczen":
                    if(acctualday<=31){}
                    break;
                case "luty":
                    31
                    break;
                case "marzec":
                    31+28
                    break;
                case "kwiecien":
                    31+28+31
                    break;
                case "maj":
                    31+28+31+30
                    break;
                case "czerwiec":
                    31+28+31+30+31
                    break;
                case "lipiec":
                    31+28+31+30+31+30
                    break;
                case "sierpien":
                    31+28+31+30+31+30+31
                    break;
                case "wrzesien":
                    31+28+31+30+31+30+31+31
                    break;
                case "pazdziernik":
                    31+28+31+30+31+30+31+31+30
                    break;
                case "listopad":
                    31+28+31+30+31+30+31+31+30+31

                    break;
                case "grudzien":
                    31+28+31+30+31+30+31+31+30+31+30
                    break;
            }

        }
        int allsecondsleft;
        //adding data variables
        Pane root = new Pane();;
        Text text= new Text(150,50,"Czas do końca roku blyat");
        /*text.setText("Czas do końca roku blyat");
        text.setX(400);
        text.setY(100);
        */
        StackPane pane = new StackPane();
        /*
        if(hourstonextyear >  0 ){
            hourstonextyear = hourstonextyear * mininhours * secinmin;
        }
        if(minutestonextyear > 0 ) {
            minutestonextyear = minutestonextyear * secinmin;
        }
        allsecondsleft = hourstonextyear + minutestonextyear + secondstonextyear;
        System.out.println("There is "+monthtonextyear+" months "+daytonextyear+" days "+hourstonextyear+" hours "+minutestonextyear+" minutes "+secondstonextyear+" seconds to next year" );
        */
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