package com.controller;

import com.view.MainWindow;

public class ActionController {
    private final MainWindow window;

    public ActionController(MainWindow window) {
        this.window = window;
    }

    public void addEventListeners() {
        Zoom zoomEventListener = new Zoom(window);
        MouseEventListener dragEventListener = new MouseEventListener(window);
        ButtonEventController buttonEventController = new ButtonEventController(window);
    }
}
