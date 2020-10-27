package lab3;

public class Pawn extends Piece{
    boolean promoted;
    Piece newPiece;

    public Pawn (boolean isWhite, boolean promoted, Piece newPiece) {
        super (isWhite);
        this.value = 1;
        this.promoted = promoted;
        promote(newPiece);

    }

    public Pawn (boolean isWhite) {
        super (isWhite);
        this.value = 1;
        this.promoted = false;
        this.newPiece = null;
    }

    public boolean isPromoted() {
        return promoted;
    }

    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }

    public Piece getNewPiece() {
        return newPiece;
    }

    public void setNewPiece(Piece newPiece) {
        this.newPiece = newPiece;
    }

    public void promote(Piece newPiece) {
        if (!this.promoted) {
            this.newPiece = null;
        } else {
            if (newPiece.getValue() == 1 || newPiece.getValue() == 1000) {
                this.newPiece = null;
                this.promoted = false;
            } else {
                this.newPiece = newPiece;
            }

        }
    }

    @Override
    public void setValue(int value) {
        if (value == 1) {
            this.value = value;
        }
    }

    @Override
    public void move() {
        System.out.println("Forward 1");
    }

    @Override
    public String toString() {
        return "Pawn{value='" + value + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o.getClass() != this.getClass()) {
            return false;
        }
        final Pawn targetPiece = (Pawn) o;
        if (targetPiece.getValue() == this.value
                && targetPiece.isWhite() == this.isWhite
                && (!targetPiece.promoted && !this.promoted)) {
            return true;
        }
        if (targetPiece.getValue() == this.value
                && targetPiece.isWhite() == this.isWhite
                && (targetPiece.promoted && this.promoted)) {
            if (targetPiece.getNewPiece().getValue() == this.newPiece.getValue()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
