import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

public class Calculator {

    // a calculator should be able to add 2 numbers and return the sum, subtract 2 numbers and return
//    the difference, multiply 2 numbers and return the product, divide 2 numbers and return the quotient,
//    and return the square root of a number

    //use the @Before annotation to do your setup so that you don't have to repeat your calculator declaration
//    and initialization in each method
//    BONUS - modify your Add() method so instead of accepting two numbers, it takes an ArrayList of Integers and
//    adds all the numbers in the collection

    double answer;
    List<Integer> nums = new ArrayList<Integer> ();



//    public Double add(double num1, double num2) {
//        answer = num1 + num2;
//        System.out.println(num1 + " plus " + num2 + " equals " + answer);
//        return answer;
//    }

    public int add(int... nums) {
//        nums.add(1);
//        nums.add(2);
//        nums.add(3);

        int sum = 0;
        for (int number:nums) {
            sum += number;
        }
        System.out.println("The sum is " + sum);
        return sum;

    }

    public double subtract(double num1, double num2) {
        answer = num1 - num2;
        System.out.println(num1 + " minus " + num2 + " equals " + answer);
        return answer;
    }

    public double multiply(double num1, double num2) {
        answer = num1 * num2;
        System.out.println(num1 + " times " + num2 + " equals " + answer);
        return answer;
    }

    public double divide(double num1, double num2) {
        answer = num1 / num2;
        System.out.println(num1 + " divided by " + num2 + " equals " + answer);
        return answer;
    }

    public double squareRt(double num1) {
        answer = sqrt(num1);
        System.out.println("The square root of " + num1 + " is " + answer);
        return answer;
    }
}


/*    double answer;


    public double calculator(double num1, char operator, double num2) {

        switch(operator) {

            case '+':
                answer = num1 + num2;
                System.out.println("\n" + num1 + " " + operator + " " + num2 + " equals " + answer);
                break;


            case '-':
                answer = num1 - num2;
                System.out.println("\n" + num1 + " " + operator + " " + num2 + " equals " + answer);
                break;

            case '*':
                answer= num1 * num2;
                System.out.println("\n" + num1 + " " + operator + " " + num2 + " equals " + answer);
                break;

            case '/' :
                answer = num1 / num2;
                System.out.println("\n" + num1 + " " + operator + " " + num2 + " equals " + answer);
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }

        return answer;
    }
}*/
