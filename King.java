package lab3;

public class King extends Piece {

    public King (boolean isWhite) {
        super (isWhite);
        this.value = 1000;
    }

    @Override
    public void setValue(int value) {
        if (value == 1000) {
            this.value = value;
        }
    }

    @Override
    public void move() {
        System.out.println("One square");
    }

    @Override
    public String toString() {
        return "King{value='" + value + '\'' + '}';
    }

}
