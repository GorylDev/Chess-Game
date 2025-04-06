package gui;

import pieces.Figure;
import pieces.Pionek;

import javax.swing.*;
import java.awt.*;

public class BoardPanel extends JPanel {
    public static final int BOARD_SIZE = 8;
    private TilePanel selectedTile = null;
    private boolean whiteTurn = true;

    String[] places = {
            "a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8",
            "a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7",
            "a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6",
            "a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5",
            "a4", "b4", "c4", "d4", "e4", "f4", "g4", "h4",
            "a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3",
            "a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2",
            "a1", "b1","c1","d1","e1","f1","g1","h1"
    };

    public BoardPanel() {
        super(new GridLayout(BOARD_SIZE, BOARD_SIZE));
        setPreferredSize(new Dimension(800, 800));
        setBackground(Color.LIGHT_GRAY);
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        initializeBoard();
    }

    private void initializeBoard() {
        for(int row =0; row < BOARD_SIZE; row++) {
            for(int col = 0; col < BOARD_SIZE; col++) {
                TilePanel tile = new TilePanel(row, col);

                if(row == 1) tile.setFigure(new Pionek(false));
                if(row == 6) tile.setFigure(new Pionek(true));
                if(row == 0 || row == 7){
                    boolean isWhite = row == 7;
                    switch (col) {
                        case 0, 7 -> tile.setFigure(new pieces.Wieza(isWhite));
                        case 1, 6 -> tile.setFigure(new pieces.Kon(isWhite));
                        case 2, 5 -> tile.setFigure(new pieces.Goniec(isWhite));
                        case 3 -> tile.setFigure(new pieces.Krolowa(isWhite));
                        case 4 -> tile.setFigure(new pieces.Krol(isWhite));
                    }
                }

                this.add(tile);
            }
        }
    }

    public void handleTileClick(TilePanel clickedTile) {
        Figure clickedFigure = clickedTile.getFigure();

        if (selectedTile == null) {
            if (clickedFigure != null && clickedFigure.isWhite() == whiteTurn) {
                selectedTile = clickedTile;
                selectedTile.highlight();
            }
        } else {
            if (clickedTile == selectedTile) {
                selectedTile.unhighlight();
                selectedTile = null;
            } else {
                Figure movingFigure = selectedTile.getFigure();
                if (movingFigure != null && (clickedFigure == null || clickedFigure.isWhite() != whiteTurn)) {
                    clickedTile.setFigure(movingFigure);
                    selectedTile.setFigure(null);

                    selectedTile.unhighlight();
                    selectedTile = null;

                    whiteTurn = !whiteTurn;
                    repaint();
                } else {
                    selectedTile.unhighlight();
                    selectedTile = null;
                }
            }
        }
    }


}