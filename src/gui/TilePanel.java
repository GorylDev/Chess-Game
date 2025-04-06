package gui;

import pieces.Figure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TilePanel extends JPanel {
    private final int row;
    private final int col;
    private Figure figure;

    public TilePanel(int row, int col) {
        this.row = row;
        this.col = col;
        setPreferredSize(new Dimension(100, 100));
        setBackground(getTileColor(row, col));
        setOpaque(true);
        setBorder(BorderFactory.createLineBorder(getTileColor(row, col)));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Container parent = getParent();
                if (parent instanceof BoardPanel board) {
                    System.out.println("Kliknięto: " + row + ", " + col);
                    board.handleTileClick(TilePanel.this);
                }
            }
        });

        if (row == 0 && col == 0) {
            setBorder(BorderFactory.createLineBorder(Color.RED, 3));
        }

    }

    private boolean isHighlighted = false;

    public void highlight() {
        isHighlighted = true;
        repaint();
    }

    public void unhighlight() {
        isHighlighted = false;
        setBorder(BorderFactory.createLineBorder(getTileColor(row, col)));
        repaint();
    }

    private Color getTileColor(int row, int col) {
        if ((row + col) % 2 == 0) {
            return Color.WHITE;
        } else {
            return Color.GRAY;
        }
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
        repaint();
    }

    public Figure getFigure() {
        return figure;
    }

    public void resetColor() {
        setBackground(getTileColor(row, col));
    }

    public void resetBorder() {
        setBorder(BorderFactory.createLineBorder(getTileColor(row, col)));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(getTileColor(row, col));
        if (figure != null) {
            g.setFont(new Font("SansSerif", Font.PLAIN, 60));
            g.drawString(figure.getSymbol(), getWidth() / 2 - 20, getHeight() / 2 + 20);
        }
        if (isHighlighted) {
            setBorder(BorderFactory.createLineBorder(Color.YELLOW, 3));
        }

    }
}