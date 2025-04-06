package pieces;

public class Krolowa extends Figure{
    public Krolowa(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "♕" : "♛";
    }

    @Override
    public String toString() {
        return "Krolowa{" +
                "isWhite=" + isWhite +
                '}';
    }
}
