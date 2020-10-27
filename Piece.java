package lab3;

public abstract class Piece {
    int value;
    boolean isWhite;

    public Piece (int value, boolean isWhite) {
        this.value = value;
        this.isWhite = isWhite;
    }

    public Piece (boolean isWhite) {
        this.value = 0;
        this.isWhite = isWhite;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    public boolean isWhite() {
        return isWhite;
    }

    // without {}
    public abstract void move();

    @Override
    public String toString() {
        return "Piece{value='" + value + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o.getClass() != this.getClass()) {
            return false;
        }
        final Piece targetPiece = (Piece) o;
        if (targetPiece.getValue() == this.value && targetPiece.isWhite() == this.isWhite) {
            return true;
        }
        return false;
    }
}
