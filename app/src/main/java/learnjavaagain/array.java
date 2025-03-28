package learnjavaagain;

public class array {


    //BASIC ARRAY 
    //declaring a basic array
    int [] basicArray = {1, 2, 3, 4, 5};


    //accessing the array using for loop
    public void printArray()
    {
        for(int i=0; i<basicArray.length; i++)
        {
            System.out.println(basicArray[i]);
        }
    }
    //BASIC ARRAY

    
    //MULTIDIMENSIONAL ARRAY
    //declaring a multidimensional array or in this case jagged array
    int [][] mult = { {1, 2, 3, 4}, {5, 6, 7} };
    //please visualize this array for me
    // 1 2 3 4
    // 5 6 7
    //MULTIDIMENSIONAL ARRAY

    //ACCESSING THE ARRAY MANUALLY
    public void accessArray()
    {
        System.out.println(mult[0][0]); //1
        System.out.println(mult[0][1]); //2
        System.out.println(mult[0][2]); //3
        System.out.println(mult[0][3]); //4
        System.out.println(mult[1][0]); //5
        System.out.println(mult[1][1]); //6
        System.out.println(mult[1][2]); //7
    }
    //ACCESSING THE ARRAY MANUALLY

    //ACCESSING THE ARRAY USING LOOPS
    public void accesArrayLoops()
    {
        for (int i=0; i<mult.length; i++)
        {
            System.out.println(i);
            //printing the 1st row
            //mult[i].length will give the length of the row
            for (int j=0; j<mult[i].length; j++)
            {
                System.out.println(mult[i][j]);
            }
        }
    }
    //ACCESSING THE ARRAY USING LOOPS


    //creating main method to access all functions
    // Main method to run the program
    public static void main(String[] args) {
        //explain the assignment below
        //creating an object of the class array
        array arr = new array();


        System.out.println("This is printing the multidimensional array");
        arr.accessArray(); // Call the accessArray function

        System.out.println("this is printing multidimensional array using loops");
        arr.accesArrayLoops();

        System.out.println("This is printing the basic array");
        arr.printArray(); // Call the printArray function

        System.out.println("MULTIDIMENSIONAL ARRAY LENGTH");
        System.out.println(arr.mult.length); //2
        
    }
    //accessing the array using a loop
    // public void printarrayLoops()
    // {
    //     for (int i=0; i<mult.length; i++)
    //     {
    //         for (int j=0; j<mult[i].length; j++)
    //         {
    //             System.out.println(mult[i][j]);
    //         }

    //     }
    // }



}
