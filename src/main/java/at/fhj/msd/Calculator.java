package at.fhj.msd;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("add: "+add(21.3924,-12.45));
        System.out.println("minus: "+minus(21.3924,-12.45));
        System.out.println("divide: "+divide(21.3924,-12.45));
        System.out.println("multiply: "+multiply(21.3924,-12.45));

    }

    public static double add(double number1, double number2){
        return number1 + number2;
    }
    public static double minus(double number1, double number2){
        return number1 - number2;
    }
    public static double divide(double number1, double number2){
        return number1 == 0 ? null : number1 / number2;
    }
    public static double multiply(double number1, double number2){
        return number1 * number2;
    }
}
