package com.example.firsteverjavafx;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;


public class UsingAGUI extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    Button btn;
    @Override public void start(Stage stage){
        // Create a button
        btn = new Button("Super Long Button");
        btn.setMinSize(150,10);
        btn.setText("Click me");
        btn.setDefaultButton(true);
        btn.setOnAction(e -> buttonClick());

        // Add the button to a layout pane
        BorderPane pane = new BorderPane();
        pane.setCenter(btn);

        // Add the layout pane to a scene
        Scene scene = new Scene(pane, 300, 250);

        // Finalise and show stage
        stage.setScene(scene);
        stage.setTitle("Using a button");
        stage.show();

    }
    public void buttonClick() {
        if (btn.getText().equals("Click Me")){
            btn.setText("I've been clicked");
        }
        else {
            btn.setText("Click Me");
        }
    }



}
