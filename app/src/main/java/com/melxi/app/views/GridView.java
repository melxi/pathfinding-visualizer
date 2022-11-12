package com.melxi.app.views;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class GridView {
    private StackPane stackPane;
    private int[][] cells = new int[12][12];

    public GridView() {
        stackPane = new StackPane();
        stackPane.setMinSize(360, 360);
        addBorders();
    }

    private void addBorders() {
        for (int row = 0; row < cells.length; row++){
            for (int col = 0; col < cells[row].length; col++){
                Rectangle rect = new Rectangle();
                rect.setWidth(30);
                rect.setHeight(30);
                rect.setFill(Color.TRANSPARENT);
                rect.setStroke(Color.BLACK);

                rect.setTranslateX((col * 30) - 260);
                rect.setTranslateY((row * 30) - 160);

                stackPane.getChildren().add(rect);
            }
        }
    }

    public StackPane getGridView() {
        return stackPane;
    }
}
