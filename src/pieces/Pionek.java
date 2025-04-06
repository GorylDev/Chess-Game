package pieces;

public class Pionek extends Figure{
    public Pionek(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "♙" : "♟";
    }

    @Override
    public String toString() {
        return "Pionek{" +
                "isWhite=" + isWhite +
                '}';
    }
}
