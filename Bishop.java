package lab3;

public class Bishop extends Piece {

    public Bishop (boolean isWhite) {
        super (isWhite);
        this.value = 3;
    }

    @Override
    public void setValue(int value) {
        if (value == 3) {
            this.value = value;
        }
    }

    @Override
    public void move() {
        System.out.println("Diagonally");
    }

    @Override
    public String toString() {
        return "Bishop{value='" + value + '\'' + '}';
    }
}
