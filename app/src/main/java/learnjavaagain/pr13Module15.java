package learnjavaagain;


public class pr13Module15 {

    //INITIATING COLOURS ARRAY
    String[] colours = {"hitam", "biru", "putih", "merah", "kuning"}; 
    //INITIATING COLOURS ARRAY

    //main method
    public static void main(String[] args) {

        //creating an object to acces the string? array
        pr13Module15 colours = new pr13Module15();


        //ACCESSING ALL COLOURS
        //using enhanced for loops to access colours array
        System.out.println("Warnanya Adalah: ");
        for(String color : colours.colours)
        {
            System.out.print(color + " ");
        }
        //using enhanced for loops to access colours array
        //ACCESSING ALL COLOURS
        System.out.println();
        System.out.println();

        //ACCESING ALL COLOUR EXCEPT "PUTIH"
        System.out.println("Warnanya Adalah: ");
        for(String color : colours.colours)
        {
            if(color.equals("putih"))
            {
                continue; //skip the iteration if the colour is "putih"
            }
            System.out.print(color + " ");
        }
        //ACCESING ALL COLOUR EXCEPT "PUTIH"
        
    }

}
    