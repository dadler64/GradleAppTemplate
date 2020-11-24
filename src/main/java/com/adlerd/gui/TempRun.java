package com.adlerd.gui;

public class TempRun implements Runnable {

    private final TestGUI gui;

    public TempRun(TestGUI gui) {
        this.gui = gui;
    }

    public void run() {
        this.gui.initGUI();
    }
}