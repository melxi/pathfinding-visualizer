package com.melxi.app;

import com.melxi.app.views.GridView;
import com.melxi.app.views.ToolBarView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public GridView gridView;
    public ToolBarView toolBarView;
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane root = new BorderPane();
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("view.fxml"));
        Scene scene = new Scene(root, 640, 480);
        initLayout(root);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public void initLayout(BorderPane root) {
        initGridView(root);
        initToolBarView(root);
    }

    public void initGridView(BorderPane root) {
        gridView = new GridView();
        root.setCenter(gridView.getGridView());
    }

    public void initToolBarView(BorderPane root) {
        toolBarView = new ToolBarView();
        root.setBottom(toolBarView.getToolBarView());
    }

    public static void main(String[] args) {
        launch();
    }
}