package pieces;

public class Krol extends Figure{
    public Krol(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "♔" : "♚";
    }

    @Override
    public String toString() {
        return "Krol{" +
                "isWhite=" + isWhite +
                '}';
    }
}
