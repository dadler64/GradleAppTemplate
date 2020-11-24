package com.adlerd.gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestGUI {

    final JButton testButton = new JButton(Strings.get("buttonTest"));
    final JFrame frame = new JFrame(Strings.get("frameTitle"));


    public void initGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        testButton.setPreferredSize(new Dimension(200, 25));
        testButton.addActionListener(e -> testDialog());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.CENTER;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 0;
        constraints.weighty = 0;

        URL iconPath = ClassLoader.getSystemResource("GradleAppTemplate.png");
        if (iconPath != null) {
            System.out.println("Icon Location: " + iconPath.toString());
            frame.setIconImage(Toolkit.getDefaultToolkit().getImage(iconPath));
        } else {
            System.out.println("Icon Location: INVALID");

        }

        frame.getContentPane().setLayout(new GridBagLayout());
        frame.getContentPane().add(testButton, constraints);
        frame.setMinimumSize(new Dimension(300, 100));
        frame.setPreferredSize(new Dimension(300, 180));
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                closeDialog();
            }

        });
    }

    private void testDialog() {
        JOptionPane.showMessageDialog(frame, Strings.get("testMessage"));
    }

    private void closeDialog() {
        Object[] options = new Object[]{Strings.get("optionYes"), Strings.get("optionNo")};
        int optionDialog = JOptionPane
                .showOptionDialog(frame, Strings.get("quitPrompt"), Strings.get("quitTitle"), JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (optionDialog == JOptionPane.YES_OPTION) {
            frame.setVisible(false);
            frame.dispose();
            System.exit(0);
        }
    }
}
