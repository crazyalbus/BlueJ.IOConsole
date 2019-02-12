 

/**
 * @author leon on 03/02/2019.
 */

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class IOConsole {
    private final Scanner scanner;
    private final PrintStream out;

    public IOConsole() {
        this(System.in, System.out);
    }

    public IOConsole(InputStream inputStream, OutputStream outputStream) {
        this(new Scanner(inputStream), new PrintStream(outputStream));
    }

    public IOConsole(Scanner scanner, PrintStream printStream) {
        this.scanner = scanner;
        this.out = printStream;
    }

    /**
     * @param val  : text to display on console
     * @param args : optional arguments to send for string formatting
     */
    public void print(String val, Object... args) {
        out.format(val, args);
   
    }

    /**
     * @param val  : text to display on console
     * @param args : optional arguments to send for string formatting
     */
    public void println(String val, Object... args) {
        //create new instance of console
        IOConsole lineIn = new IOConsole();
        //ask for input
        System.out.printf(val, args);
       
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as String
     */
    public String getStringInput(String prompt, Object... args) {
        //create new instance of console
        IOConsole string = new IOConsole();
        //ask for input
        System.out.printf(prompt, args);
        //take in input
        String input = scanner.nextLine();
        //return processed input
        return input;
        }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as integer
     */
    public Integer getIntegerInput(String prompt, Object... args) {
        //create new instance of console
        IOConsole intIn = new IOConsole();
        //ask for input
        System.out.printf(prompt, args);
        //take in input
        int input = scanner.nextInt();
        //return processed input
        return input;
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as double
     */
    public Double getDoubleInput(String prompt, Object... args) {
        //create new instance of console
        IOConsole doubleIn = new IOConsole();
        //ask for input
        System.out.printf(prompt, args);
        //take in input
        double input = scanner.nextDouble();
        //return processed input
        return input;
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as float
     */
    public Float getFloatInput(String prompt, Object... args) {
        //create new instance of console
        IOConsole doubleIn = new IOConsole();
        //ask for input
        System.out.printf(prompt, args);
        //take in input
        float input = scanner.nextFloat();
        //return processed input
        return input;
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as long
     */
    public Long getLongInput(String prompt, Object... args) {
        //create new instance of console
        IOConsole doubleIn = new IOConsole();
        //ask for input
        System.out.printf(prompt, args);
        //take in input
        long input = scanner.nextLong();
        //return processed input
        return input;
    }
}
