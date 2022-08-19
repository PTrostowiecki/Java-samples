package tutorial.pluralsight.CalcEngine;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        double val1;
        double val2;
        double result;
        String opCode ;

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Type First Value = ");
        val1 = Double.parseDouble(reader.readLine());

        System.out.print("Type Second Value = ");
        val2 = Double.parseDouble(reader.readLine());

        System.out.println("Chose from: + , - , * , / ");

        opCode = reader.readLine();


        switch (opCode){

            case "+":
                result = val1 + val2;
                break;
            case "-":
                result = val1 - val2;
                break;
            case "*":
                result = val1 * val2;
                break;
            case "/":
                result = val2 !=0 ? val1/val2 : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
                break;

        }

        System.out.println("Result = " + result);
    }
}
