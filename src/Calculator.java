public class Calculator {
    private double x1;
    private double x2;
    char Operation;

    public void setX1(double x1) {
        this.x1 = x1;
    }
    public void setX2(double x2) {
        this.x2 =x2;
    }

    public double getX1() {
        return x1;
    }
    public double getX2() {
        return x2;
    }

    public static double addition (double x1, double x2) {
        double add_result = x1 + x2;
        return add_result;
    }
    public static double subtraction (double x1, double x2) {
        double subtract_result = x1 - x2;
        return subtract_result;
    }
    public static double multiplication(double x1, double x2) {
        double multiply_result = x1 * x2;
        return multiply_result;
    }
    public static double divide (double x1, double x2) {
        double divide_result = x1 / x2;
        return divide_result;
    }
}
