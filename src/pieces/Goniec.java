package pieces;

public class Goniec extends Figure{
    public Goniec(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "♗" : "♝";
    }

    @Override
    public String toString() {
        return "Goniec{" +
                "isWhite=" + isWhite +
                '}';
    }
}
