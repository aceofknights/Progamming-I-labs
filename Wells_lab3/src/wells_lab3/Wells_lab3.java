//Author: Chris wells
//Date: 2/15
//1311 P01
//Lab 3
//This program is looking for a file called "input.txt" and reading in a array of 5 doubles
//if something is wrong exceptions are caught and handled so the program doesnt crash
package wells_lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Wells_lab3 {

    public static final int SIZE = 5;

    public static void main(String[] args) throws Exception {

        double[] data = new double[SIZE];
        int index = 0;
        Scanner input = null;

        //creating a try block to catch io exceptions on the file "input.txt not being found
        try {
            input = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException fnfe) {
            System.out.println("File has not been created");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

        //try block for code reading data from the file "input.txt"
        try {
            //looping through array
            while (input.hasNext()) {
                data[index] = input.nextDouble();

                System.out.println(data[index]);
                index++;
            }
            //catching if array is too big
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("array is too long");
            System.exit(0);
            //catching if wrong data type was used
        } catch (InputMismatchException ime) {
            System.out.println("Wrong data type is used");
            System.exit(0);
            // catching all other errors
        } catch (Exception e) {
            System.out.println("something went wrong");
            System.exit(0);
            //closing the file
        } finally {
            input.close();
        }

    }
}
