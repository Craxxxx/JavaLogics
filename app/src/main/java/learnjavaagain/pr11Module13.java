package learnjavaagain;
import java.util.Scanner;

public class pr11Module13 {
    
    //ADDITION
    public int tambah(int a, int b)
    {
        return a+b;
    }
    //ADDITION

    //SUBTRACTION
    public int kurang(int a, int b)
    {
        return a-b;
    }
    //SUBTRACTION


    //MULTIPLICATION
    public int kali(int a, int b)
    {
        return a*b;
    }
    //MULTIPLICATION

    //DIVISION
    public int bagi(int a, int b)
    {
        return a/b;
    }
    //
    
    //MODULATION
    public int mod(int a, int b)
    {
        return a%b;
    }
    //MODULATION


    //MAIN METHOD FOR THE PROGRAM
    public static void main(String[] args)
    {
        //creating object of the class to access al the functions
        pr11Module13 value = new pr11Module13();
        //creating object of the class to access al the functions

        //creating object for scanner class
        Scanner input = new Scanner(System.in);
        //creating object for scanner class


        //INPUTING THE VARIABLES USING SCANNER
        System.out.println("Input the first number(a)");
        int a = input.nextInt();
        System.out.println("Input the second number(b)");
        int b = input.nextInt();
        input.close();
        //INPUTING THE VARIABLES USING SCANNER



        //PERFORMING CALCULATIONS AND ASIGNING THE RESULTS TO VARIABLES
        int sum = value.tambah(a, b);
        int difference = value.kurang(b, a);
        int product = value.kali(a, b);
        int quotient = value.bagi(a, b);
        int remainder = value.mod(a, b);
        //PERFORMING CALCULATIONS AND ASIGNING THE RESULTS TO VARIABLES


        //PRINTING THE RESULTS OF THE CALCULATIONS
        System.out.println("The sum of the two numbers is: " + sum);
        System.out.println("The difference of the two numbers is: " + difference);
        System.out.println("The product of the two numbers is: " + product);
        System.out.println("The quotient of the two numbers is: " + quotient);
        System.out.println("The remainder of the two numbers is: " + remainder);
        //PRINTING THE RESULTS OF THE CALCULATIONS
    } 
    //MAIN METHOD FOR THE PROGRAM
}
