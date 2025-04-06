package main;

import javax.swing.*;
import gui.BoardPanel;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Chess");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setResizable(false);

        BoardPanel boardPanel = new BoardPanel();
        frame.add(boardPanel);

        frame.setVisible(true);
    }
}