package com.melxi.app.views;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class GridView {
    private GridPane gridPane;
    private Cell[][] cells = new Cell[12][12];

    public GridView() {
        gridPane = new GridPane();
        gridPane.setMinSize(360, 360);
        addCells();
        setSourceCell(1, 1);
        setDestinationCell(10, 10);
    }

    public void addCells() {
        for (int row = 0; row < cells.length; row++){
            for (int col = 0; col < cells[row].length; col++){
                Cell rect = new Cell();

                GridPane.setRowIndex(rect.getRectangle(), row);
                GridPane.setColumnIndex(rect.getRectangle(), col);

                gridPane.getChildren().addAll(rect.getRectangle());

                cells[row][col] = rect;
            }
        }
    }

    public Cell getCell(int x, int y) {
        return cells[x][y];
    }

    public void setSourceCell(int row, int col) {
        Cell cell = getCell(row, col);

        cell.getRectangle().setFill(Color.GREEN);
    }

    private void setDestinationCell(int row, int col) {
        Cell cell = getCell(row, col);

        cell.getRectangle().setFill(Color.RED);
    }

    public GridPane getGridView() {
        return gridPane;
    }

    private class Cell {
        private Rectangle rect;
        public Cell() {
            rect = new Rectangle();
            rect.setWidth(30);
            rect.setHeight(30);
            rect.setFill(Color.TRANSPARENT);
            rect.setStroke(Color.BLACK);
        }

        public Rectangle getRectangle() {
            return rect;
        }
    }
}
