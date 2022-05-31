package at.fhj.msd;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("add: "+add(21.3924,-12.45));
        System.out.println("minus: "+minus(21.3924,-12.45));
        System.out.println("divide: "+divide(21.3924,-12.45));
        System.out.println("multiply: "+multiply(21.3924,-12.45));

    }

    /**
     * returns number1 plus number2
     *
     * @param number1 the first number
     * @param number2 the second number
     * @return
     */
    public static double add(double number1, double number2){
        return number1 + number2;
    }

    /**
     * returns number1 minus number2
     *
     * @param number1 the first number
     * @param number2 the second number
     * @return
     */
    public static double minus(double number1, double number2){
        return number1 - number2;
    }

    /**
     * returns number1 diveded by number2
     *
     * @param number1 the first number
     * @param number2 the second number
     * @return
     */
    public static double divide(double number1, double number2){
        return number1 == 0 ? null : number1 / number2;
    }

    /**
     * returns number1 multiplyed with number2
     *
     * @param number1 the first number
     * @param number2 the second number
     * @return
     */
    public static double multiply(double number1, double number2){
        return number1 * number2;
    }
}
