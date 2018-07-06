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
    SimpleDateFormat year = new SimpleDateFormat("yyyy");
    Date data = new Date();
    Date gr = new Date(118, 11,32);
    public int getacctualYear() {
        int x = Integer.parseInt(year.format(data));
        return x;
    }
    public int getnextYear(){
        int y = Integer.parseInt(year.format(gr));
        return y;
    }


    @Override
    public void start(Stage primaryStage) {

        final int dayinyear = 365;
        final int monthinyear = 12;
        final int mininhours = 60;
        final int secinmin = 60;
        int allsecondsleft;
        //adding data variables
        Pane root = new Pane();
        SimpleDateFormat df = new SimpleDateFormat("EEEE yyyy.mm.dd 'Godzina: ' HH:mm:ss");;
        SimpleDateFormat month = new SimpleDateFormat("MM");
        SimpleDateFormat day = new SimpleDateFormat("D");
        SimpleDateFormat hours = new SimpleDateFormat("HH");
        SimpleDateFormat minutes = new SimpleDateFormat("mm");
        SimpleDateFormat seconds = new SimpleDateFormat("ss");
        Text text= new Text(150,50,"Czas do końca roku blyat");
        /*text.setText("Czas do końca roku blyat");
        text.setX(400);
        text.setY(100);
        */
        StackPane pane = new StackPane();
        int yearinnextsyear = Integer.parseInt(year.format(gr));
        int monthinthisyear =  Integer.parseInt(month.format(data));int monthinnextyear = Integer.parseInt(month.format(gr));
        int dayinthisyear =  Integer.parseInt(day.format(data));int daysinnextyear = Integer.parseInt(day.format(gr));
        int hoursinthisyear = Integer.parseInt(hours.format(data));int hoursinnextyear = Integer.parseInt(hours.format(gr));
        int minutesinthisyear = Integer.parseInt(minutes.format(data));int minutesinnextyear = Integer.parseInt(minutes.format(gr));
        int secondsinthisyear = Integer.parseInt(seconds.format(data));int secondsinnextyear = Integer.parseInt(seconds.format(gr));
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
        System.out.println();
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