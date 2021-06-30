package ch.bbw.go;

public class Calculator {
    public int summe(int summand1, int summand2) {
        return summand1 + summand2;
    }

    public int differenz(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }

    public int quotient(int dividend, int divisor) {
        return dividend / divisor;
    }

    protected int modulo(int dividend, int divisor) {
        return dividend % divisor;
    }
}
