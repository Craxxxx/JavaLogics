package learnjavaagain;

public class Hellow {

    //HELLO WORLD FUNCTION
    private String getGreeting() {
        return "Hello World!";
    }

    //PRINTING THE GREETING
    public void printgreeting()
    {
        String greeting = getGreeting();
        System.out.println(greeting);
    }



    //TESTING BY DEFINING AN ARRAY
    //testing by declaring an printing an array
    int [] arrray = {1, 2, 3, 4, 5};

    //NON-STATIC FUNCTIONS TO ACCESS THE ARRAY
    public void printingArray()
    {
        for(int i=0; i<arrray.length; i++)
        {
            System.out.println(arrray[i]);
        }
    }
    //NON-STATIC FUNCTIONS TO ACCESS THE ARRAY


    //STATIC FUNCTIONS TO ACCESS THE ARRAY
    public static void printArray()
    {
        int [] arr = {1, 2, 3, 4, 5};
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    //STATIC FUNCTIONS TO ACCESS THE ARRAY



    //MAIN METHOD
    //MAIN METHOD TO ACCESS ALL FUNCTIONS
    //creating main method to access all functions
    // Main method to run the program
    public static void main(String[] args) {
        //creating an object of the class Hellow TO ACCESS ALL THE NON STATIC METHOD
        Hellow h = new Hellow();

        //printing the greeting
        h.printgreeting();

        //ACCESSING THE ARRAY IN A NON-STATIC WAY
        //printing the array
        //h.printArray();
        //ACCESSING THE ARRAY IN A NON-STATIC WAY

        //ACCESSING THE ARRAY IN STATIC WAY
        System.out.println("ACCESSING THE ARRAY IN A STATIC WAY");
        printArray();

        System.out.println("ACCESSING THE ARRAY IN A NON-STATIC WAY");
        //use the object of the class where the function belongs to the array
        h.printingArray();
        //ACCESSING THE ARRAY IN STATIC WAY

        
    }
    //MAIN METHOD
}

