package learnjavaagain;
import java.util.Scanner;

public class pr12Module14 {
    
    //creating a method to check whether the number is odd or even
    public String checkOddOrEven(int number)
    {
        //check if the number is betweeen 1 or 10
        if(number <1 || number > 10)
        {
            return "angka di luar jangkauan";
        }
        if(number%2 == 0)
        {
            return "Even";
        }
        else
        {
            return "Odd";
        }
    }
    //creating a method to check whether the number is odd or even



    //MAIN METHOD
    public static void main(String[] args) {
        
        //declaring the number to be checked
        int number;
        String result;
        //declaring the number to be checked

        //CREATING SCANNER METHOD 
        Scanner Input = new Scanner(System.in);
        //CREATING SCANNER METHOD

        //CREATING OBJECT TO ACCESS THE METHODS
        pr12Module14 oddOrEven = new pr12Module14();
        //CREATING OBJECT TO ACCESS THE METHODS



        //INPUTING THE VARIABLES USING SCANNER
        System.out.println("Determining if the nember is odd or even ");

        int recalled = 0;
        //it will keep asking for the number until the user inputs a number between 1 and 10
        do{

            
            //System.out.println(recalled);
            if(recalled > 0)
            {
                System.out.println("angka di luar jangkauan");
                System.out.println("please ReInput the number between 1 and 10: ");
                number = Input.nextInt(); //taking input from user for first number
            }
            else
            {
                System.out.println("please Input the number between 1 and 10: ");
                number = Input.nextInt(); //taking input from user for first number
            }

            //analyzing the value if its odd or even
            result = oddOrEven.checkOddOrEven(number);
            recalled++;
        }
        while(oddOrEven.checkOddOrEven(number) == "angka di luar jangkauan");
        //INPUTING THE VARIABLES USING SCANNER
        Input.close();


        //accessing the methods to check if its odd or even

        System.out.println(result);

        //accessing the methods to check if its odd or even

    }
    //MAIN METHOD


};