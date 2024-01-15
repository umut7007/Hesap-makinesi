package base;

public class Division implements CalculationProcess {
    public double calculate(double number1, double number2) {
        if (number2 != 0) {
            return number1 / number2;
        } else {
            System.out.println("Hata: Sıfıra bölme hatası!");
            return Double.NaN;
        }
    }
}