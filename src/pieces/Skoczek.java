package pieces;

public class Skoczek extends Figure{
    public Skoczek(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "♞" : "♞";
    }

    @Override
    public String toString() {
        return "Skoczek{" +
                "isWhite=" + isWhite +
                '}';
    }
}
