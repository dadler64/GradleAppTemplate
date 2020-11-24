package com.adlerd;

import com.adlerd.gui.TestGUI;
import com.adlerd.gui.TempRun;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        TestGUI gui = new TestGUI();
        SwingUtilities.invokeLater(new TempRun(gui));
    }
}
