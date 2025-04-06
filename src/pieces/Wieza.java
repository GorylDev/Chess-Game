package pieces;

public class Wieza extends Figure{
    public Wieza(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "♖" : "♜";
    }

    @Override
    public String toString() {
        return "Wieza{" +
                "isWhite=" + isWhite +
                '}';
    }
}
