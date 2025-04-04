package learnjavaagain;
import java.util.Scanner;

public class pr14Module16 {


    //COMPARISON ANAGRAM METHODS
    public static boolean isAnagram(String str1, String str2)
    {  
         //temp variable to store character that needs to be checked

        //CHECKING IF THE STRING LENGTHS ARE EQUAL OR NOT
        if(str1.length() != str2.length())
        {
            System.out.println("Doesnt have the same length.");
            System.out.println("The two strings are not anagrams of each other.");
            return false; //if the string is not the same length then is is not anagram
            //so return false
        }
        //CHECKING IF THE STRING LENGTHS ARE EQUAL OR NOT


        //while the compared string is not empty loop through both
   


            //CHECKING ONE BY ONE THE CHARACTERS OF THE STRING
            for(char TempC : str1.toCharArray())
                {
                    //ignoring the uppercase and lowercase letters by converting every case to lower case
                    TempC = Character.toLowerCase(TempC); //converting the character to lower case
                    
                    //DEBUGGING LOOP
                    //System.out.println(TempC); //printing the character to be compared
                    //DEBUGGING LOOP

                    //checking if the character is present in the compared values
                    //to.charArray() method converts the string into an array of characters
            
                     for(char tempB : str2.toCharArray())
                     {
                        char remove = tempB;
                        tempB = Character.toLowerCase(tempB); //converting the character to lower case
                        
                        //DEBUGGING SECOND LOOP
                        //System.out.print("This is str2: ");
                        //System.out.println(tempB);

                        //System.out.print("this is str1: ");
                        //System.out.println(TempC);
                        //DEBUGGING SECOND LOOP

                         if (TempC == tempB)//if the character is present in the compared values
                             {
                    //             //removing the character from the second string
                                //removing the character from the second string    
                                str2 = str2.replaceFirst(String.valueOf(remove),"");
                                break; //exits the inner loop and continue the outer loop
                             }
                     }

                     //DEBUGGIING PURPOSES
                     //System.out.println(str2);
                     //System.out.println();
                     //DEBUGGIING PURPOSES

                    //break; 
                }
        //CHECKING ONE BY ONE THE CHARACTERS OF THE STRING

        //if the second string is empty it means it is an angram
        if(str2.isEmpty())
        {
            System.out.println("The two strings are anagrams of each other.");
            return true; //if the second string is empty it means it is an angram
        }
        //if not it is not anagram
        else
        {
            System.out.println("The two strings are not anagrams of each other.");
            return false; //if the second string is not empty it means it is not an angram
        }

    }
    //COMPARISON ANAGRAM METHODS


    //MAIN FUNCTION
    public static void main(String[] args) {
        String a;
        String b;

        //CREATING SCANNER OBJECT
        Scanner input = new Scanner(System.in);
        //CREATING SCANNER OBJECT

        System.out.println("Determining if the two strings are anagrams or not: ");
       
        System.out.println("Input the first string: ");
        a = input.nextLine(); //taking input from user for first string
        System.out.println("Input the second string: ");
        b = input.nextLine(); //taking input from user for second string
        input.close(); //closing the scanner object

        isAnagram(a, b);
        //System.out.println(isAnagram(a, b));
        
        
    }
    //MAIN FUNCTION

}
