package pieces;

public class Kon extends Figure{
    public Kon(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "♞" : "♞";
    }

    @Override
    public String toString() {
        return "Kon{" +
                "isWhite=" + isWhite +
                '}';
    }
}
