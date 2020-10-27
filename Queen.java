package lab3;

public class Queen extends Piece {
    public Queen (boolean isWhite) {
        super (isWhite);
        this.value = 9;
    }

    @Override
    public void setValue(int value) {
        if (value == 9) {
            this.value = value;
        }
    }

    @Override
    public void move() {
        System.out.println("Like bishop and rook");
    }

    @Override
    public String toString() {
        return "Queen{value='" + value + '\'' + '}';
    }
}
