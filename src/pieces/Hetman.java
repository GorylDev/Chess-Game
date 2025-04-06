package pieces;

public class Hetman extends Figure {
    public Hetman(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "♕" : "♛";
    }

    @Override
    public String toString() {
        return "Hetman{" +
                "isWhite=" + isWhite +
                '}';
    }
}
