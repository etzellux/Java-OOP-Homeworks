package soru1;
/**
 *
 * @author etzellux
 */
import java.util.Calendar;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ClockPane extends Application
{
    @Override
    public void start(Stage stage)
    {
        Calendar cal = Calendar.getInstance();

        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        double secondAngle = second * (360.0 / 60.0);
        double minuteAngle = (minute + secondAngle * 360.0) * (360.0 / 60.0);
        double hourAngle = (hour + minuteAngle * 360.0) * (360.0 / 12.0);

        Pane hourHand = createHand(200,Color.RED);
        Pane minuteHand = createHand(190,Color.GREEN);
        Pane secondHand = createHand(180,Color.BLUE);

        RotateTransition rtH = createRT(Duration.hours(12),hourHand,hourAngle);
        rtH.play();
        RotateTransition rtM = createRT(Duration.minutes(60),minuteHand,minuteAngle);
        rtM.play();
        RotateTransition rtS = createRT(Duration.seconds(60),secondHand,secondAngle);
        rtS.play();

        Circle circle = new Circle(250,250,200);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        Pane texts = new Pane();
        Text text1 = new Text("12");
        text1.setFont(new Font(20));
        text1.setX(240);
        text1.setY(70);

        Text text2 = new Text("9");
        text2.setFont(new Font(20));
        text2.setX(50);
        text2.setY(250);

        Text text3 = new Text("6");
        text3.setFont(new Font(20));
        text3.setX(240);
        text3.setY(450);

        Text text4 = new Text("3");
        text4.setFont(new Font(20));
        text4.setX(440);
        text4.setY(260);

        texts.getChildren().addAll(text1,text2,text3,text4);
        StackPane root = new StackPane(circle);
        root.getChildren().addAll(hourHand,minuteHand,secondHand,texts);

        Scene scene = new Scene(root,500,500);
        stage.setTitle("Soru1");
        stage.setScene(scene);
        stage.show();
    }
    public RotateTransition createRT(Duration duration,Node node,double startAngle)
    {
        RotateTransition rt = new RotateTransition();
        rt.setDuration(duration);
        rt.setNode(node);
        rt.setByAngle(360);
        rt.setFromAngle(startAngle);
        rt.setInterpolator(Interpolator.LINEAR);
        rt.setAutoReverse(false);
        rt.setCycleCount(Animation.INDEFINITE);
        return rt;
    }
    public Pane createHand(double size,Color color)
    {
        Pane pane = new Pane();
        pane.setPrefHeight(400);
        pane.setPrefWidth(400);
        Line hand = new Line();
        hand.setStartX(250);
        hand.setStartY(250);
        hand.setEndX(250);
        hand.setEndY(250 - size);
        hand.setStroke(color);
        pane.getChildren().add(hand);
        return pane;
    }

    public static void main(String args[])
    {
        launch(args);
    }
}