import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Calculator myCalc = new Calculator();
        System.out.println("Enter first number : ");
        double x1 = reader.nextDouble();
        myCalc.setX1(x1);
        System.out.println("Enter second number : ");
        double x2 = reader.nextDouble();
        myCalc.setX2(x2);
        System.out.println("Choose operation Number ! ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Divide");
        char operator = reader.next().charAt(0);
        myCalc.Operation = operator;
        switch(myCalc.Operation) {
            case '1': {
                double Answer = myCalc.addition(myCalc.getX1(), myCalc.getX2());
                System.out.println("Answer is: " + Answer);
                break;
            }
            case '2': {
                double Answer = myCalc.subtraction(myCalc.getX1(), myCalc.getX2());
                System.out.println("Answer is: " + Answer);
                break;
            }
            case '3': {
                double Answer = myCalc.multiplication(myCalc.getX1(), myCalc.getX2());
                System.out.println("Answer is: " + Answer);
                break;
            }
            case '4': {
                double Answer = myCalc.divide(myCalc.getX1(), myCalc.getX2());
                System.out.println("Answer is: " + Answer);
                break;
            }
            default: {
                System.out.println("Operation number is invalid");
            }
        }
    }
}
