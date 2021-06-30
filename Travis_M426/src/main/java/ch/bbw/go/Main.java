package ch.bbw.go;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int valueA = 0;
        int valueB = 0;

        valueA = 10;
        valueB = 20;
        System.out.println("Summe " + valueA + " + " + valueB + " = " + calculator.summe(valueA, valueB));
        System.out.println("Differenz " + valueA + " - " + valueB + " = " + calculator.differenz(valueA, valueB));
        System.out.println("Quotient " + valueB + " / " + valueA + " = " + calculator.quotient(valueB, valueA));
        System.out.println("Modulo " + valueA + "%" + valueB + "=" + calculator.modulo(valueA, valueB));
    }
}
