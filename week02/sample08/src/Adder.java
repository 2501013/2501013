public class Adder {
    private int num1;
    private int num2;

    public Adder(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    private int sum() {
        return num1 + num2;
    }

    @Override
    public String toString() {
        return String.format("%d + %d = %d", num1, num2, sum());

    }
}
