package lab3;

public class Rook extends Piece{
    public Rook (boolean isWhite) {
        super (isWhite);
        this.value = 5;
    }

    @Override
    public void setValue(int value) {
        if (value == 5) {
            this.value = value;
        }
    }

    @Override
    public void move() {
        System.out.println("Horizontally or vertically");
    }

    @Override
    public String toString() {
        return "Rook{value='" + value + '\'' + '}';
    }
}
