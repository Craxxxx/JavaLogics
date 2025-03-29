package learnjavaagain;
import java.util.Scanner;

public class pr11Module13pt3 {


    private int a; //declaring the first number
    private int b; //declaring the second number
    private boolean result; //declaring the result variable

    //creating a setter methods to set the values of a and b THIS IS NOT A CONSTRUCTOR
    public pr11Module13pt3 setValues(int a, int b)
    {
        this.a = a; //setting the value of a
        this.b = b; //setting the value of b
        return this; //returning the object
    }
    //creating a setter methods to set the values of a and b

    
    //COMPARISON METHODS
    public pr11Module13pt3 isEqual(int a, int b)
    {
        this.result = a == b;
        return this; //returns true if both are equal
    }

    public pr11Module13pt3 isNotEqual(int a, int b)
    {
        this.result = a != b;
        return this; //returns true if both are not equal
    }

    public pr11Module13pt3 isGreater(int a,int b)
    {
        this.result = a > b;
        return this; //returns true if a is greater than b
    }

    public pr11Module13pt3 isGreaterthanEqual(int a,int b)
    {
        this.result = a >= b;
        return this; //returns true if a is greater than or equal to b
    }

    public pr11Module13pt3 isLess(int a,int b)
    {
        this.result = a < b;
        return this; //returns true if a is less than b
    }

    public pr11Module13pt3 isLessthanEqual(int a,int b)
    {
        this.result = a <= b;
        return this; //returns true if a is less than or equal to b
    }
    //COMPARISON METHODS




    //if statements to describe the comparison methods
    public String isEqualDescription(boolean results)
    {
        if(results == true)
        {
            return "a is equal to b";
        }
        else
        {
            return "a is not equal to b";
        }
    }

    public String isNotEqualDescription(boolean results)
    {
        if(results == true)
        {
            return "a is not equal to b";
        }
        else
        {
            return "a is equal to b";
        }
    }

    public String isGreaterDescription(boolean results)
    {
        if(results == true)
        {
            return "a is greater than b";
        }
        else
        {
            return "a is not greater than b";
        }
    }

    public String isGreaterthanEqualDescription(boolean results)
    {
        if(results == true)
        {
            return "a is greater than or equal to b";
        }
        else
        {
            return "a is not greater than or equal to b";
        }
    }

    public String isLessDescription(boolean results)
    {
        if(results == true)
        {
            return "a is less than b";
        }
        else
        {
            return "a is not less than b";
        }
    }

    public String isLessthanEqualDescription(boolean results)
    {
        if(results == true)
        {
            return "a is less than or equal to b";
        }
        else
        {
            return "a is not less than or equal to b";
        }
    }
    //if statements to describe the comparison methods



    //MAIN METHOD FOR THE PROGRAM
    public static void main(String[] args)
    {
        //creating the class object to access the methods above
        pr11Module13pt3 Comparison = new pr11Module13pt3();
        //creating the class object to access the methods above


        //creating scanner object to take input from user
        Scanner input = new Scanner(System.in);
        //creating scanner object to take input from user


        System.out.println("Input the first number a: ");
        int a = input.nextInt(); //taking input from user for first number
        System.out.println("Input the second number b: ");
        int b = input.nextInt(); //taking input from user for second number
        input.close(); //closing the scanner object


        //FUN FACT OBJECTS CAN BE METHOD CHAINED

         //setting the values of a and b using the setter method
        //System.out.println(Comparison.setValues(a, b).a);

        //USING METHOD CHAINING BY RETURNING THE OBJECT FROM THE SETTER METHOD
        //Analyzing and printing the results of the comparison methods
        System.out.println("is a equal to b: " + Comparison.setValues(a, b).isEqual(a, b).isEqualDescription(Comparison.result)); //using the setter method to set the values of a and b and then using the comparison methods to compare the values of a and b
        System.out.println("is a not equal to b: " + Comparison.setValues(a, b).isNotEqual(a, b).isNotEqualDescription(Comparison.result)); //using the setter method to set the values of a and b and then using the comparison methods to compare the values of a and b
        System.out.println("is a greater than b: " + Comparison.setValues(a, b).isGreater(a, b).isGreaterDescription(Comparison.result)); 
        System.out.println("is a greater than or equal to b: " + Comparison.setValues(a, b).isGreaterthanEqual(a, b).isGreaterthanEqualDescription(Comparison.result)); 
        System.out.println("is a less than b: " + Comparison.setValues(a, b).isLess(a, b).isLessDescription(Comparison.result)); 
        System.out.println("is a less than or equal to b: " + Comparison.setValues(a, b).isLessthanEqual(a, b).isLessthanEqualDescription(Comparison.result)); 
        //Analyzing and printing the results of the comparison methods
        //USING METHOD CHAINING BY RETURNING THE OBJECT FROM THE SETTER METHOD



    }
    //MAIN METHOD FOR THE PROGRAM
}
