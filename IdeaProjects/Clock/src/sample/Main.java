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
        final int hoursinday = 24;
        final int mininhours = 60;
        final int secinmin = 60;
        long int finalseconds;
        long int finalsecondsnextyear;
        long int secondsleft;
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
        int nextyear = Integer.parseInt(year.format(gr));
        int yearinnextsyear = Integer.parseInt(year.format(gr));
        String monthinthisyear =  month.format(data);String monthinnextyear = month.format(gr);
        if(a%4==0 && a%100!=0 || a%400==0 ){
            daysinyear=daysinyear+1;
        }else {
            int acctualyear = Integer.parseInt(year.format(data));
            finalseconds = acctualyear * acctualdayinyear * hoursinday * mininhours * secinmin;
            finalsecondsnextyear = nextyear * (daysinyear + 1) * hoursinday * mininhours * secinmin;
            secondsleft = finalsecondsnextyear - finalseconds;
            System.out.println(secondsleft);
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