package lab3;

public class Knight extends Piece {

    public Knight (boolean isWhite) {
        super (isWhite);
        this.value = 2;
    }

    @Override
    public void setValue(int value) {
        if (value == 2) {
            this.value = value;
        }
    }

    @Override
    public void move() {
        System.out.println("Like an L");
    }

    @Override
    public String toString() {
        return "Knight{value='" + value + '\'' + '}';
    }
}
