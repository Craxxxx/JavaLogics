package learnjavaagain;

//SOAL
/*
Buat kelas Java sederhana untuk mendeklarasikan dan mencetak 
array yang terdiri dari beberapa merek mobil: Mitsubishi, Tesla, Honda, Nissan, Kia dan Hyundai.
*/
//SOAL
class CarsArray{

    //declaring cars array
    String [] cars = {"Mitsubishi", "Tesla", "Honda", "Nissan", "Kia", "Hyundai"};

    //PRINTING THE ARRAY
    public static void main (String[] args)
    {
        CarsArray c = new CarsArray();
        System.out.println("Printing the cars array");
        for(int i=0; i<c.cars.length; i++)
        {
            System.out.println(c.cars[i]);
        }
    }
    //PRINTING THE ARRAY

}