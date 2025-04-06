package pieces;

public abstract class Figure {
    protected boolean isWhite;

    public Figure(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public abstract String getSymbol();
}
