package learnjavaagain;

public class pr11Module13pt2 {
    
    float a = 10; 

    //ASSIGNMENT OPERATORS functions
    public int assignAddition(float a)
    {
        a += 5;
        return (int) a; //a = a + 5
    }

    public int assignSubtraction(float a)
    {
        a -= 3;
        return (int) a; //a = a - 3
    }

    public int assignMultiplication(float a)
    {
        a *= 2;
        return (int) a; //a = a * 2
    }

    public float assignDivision(float a)
    {
        return a /= 3; //a = a / 4
    }

    public int assignModulus(float a)
    {
        a %= 2;
        return (int) a; //a = a % 2
    }
    //ASSIGNMENT OPERATORS functions

    //MAIN METHOD
    public static void main(String[] args) {      
        //creating an object to access the functions
        pr11Module13pt2 assignOp = new pr11Module13pt2();

        System.out.println("Sum using assignment operator: " + assignOp.assignAddition(assignOp.a));
        System.out.println("Subtraction using assignment operator: " + assignOp.assignSubtraction(assignOp.a));
        System.out.println("Multiplication using assignment operator: " + assignOp.assignMultiplication(assignOp.a));
        System.out.println("Division using assignment operator: " + assignOp.assignDivision(assignOp.a));
        System.out.println("Modulus using assignment operator: " + assignOp.assignModulus(assignOp.a));

        
    }
    //MAIN METHOD
}
