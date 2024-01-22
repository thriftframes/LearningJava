public class  Calculator {

    //declare variables
    double mynum1 = 20.8;
    double mynum2 =4.2;

    //method addition
    double add(double mynum1, double mynum2) {
        return mynum1 + mynum2;
    }
       //method subtractions
    double subtract( double mynum1 , double mynum2){
        return mynum1 - mynum2;
    }
    //method multiplication
    double multiply(double mynum1, double mynum2){
        return mynum1 * mynum2;
    }
    //method for division
    double divide(double mynum1, double mynum2) {
        return mynum1/mynum2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        //Test addition method
        double resultadd = calculator.add(calculator.mynum1, calculator.mynum2);
        System.out.println("Addition Result:" + resultadd);
        //Test subtraction method
        double resultsub = calculator.subtract(calculator.mynum1, calculator.mynum2);
        System.out.println("Subtraction Result: " + resultsub);
        //Test multiplication method
        double resultmult = calculator.multiply(calculator.mynum1, calculator.mynum2);
        System.out.println("Multiplication Result: " + resultmult);
        //Test division method
        double resultdiv = calculator.divide(calculator.mynum1, calculator.mynum2);
        System.out.println("Division Result: " + resultdiv);
    }
}