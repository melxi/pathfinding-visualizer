package com.melxi.app.views;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;

public class ToolBarView {
    private ToolBar toolBar;

    public ToolBarView() {
        toolBar = new ToolBar();
        addButtons(toolBar);
    }

    public ToolBar getToolBarView() {
        return toolBar;
    }
    public void addButtons(ToolBar toolBar) {
        Button dijkstra = new Button("Dijkstra");
        dijkstra.setOnAction(this::handleBSF);
        Button idaStarButton = new Button("IDA*");
        idaStarButton.setOnAction(this::handleDijkstra);

        toolBar.getItems().addAll(dijkstra, idaStarButton);
    }
    private void handleBSF(ActionEvent actionEvent) {
        System.out.println("Dijkstra");
    }

    private void handleDijkstra(ActionEvent actionEvent) {
        System.out.println("IDA*");
    }
}
