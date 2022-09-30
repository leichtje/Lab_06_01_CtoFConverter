import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {

        double degreesFahrenheit;
        double degreesCelsius=0;
        String trash;

        Scanner in = new Scanner(System.in);

        System.out.println("What is the temperature in Celsius?");
            if(in.hasNextDouble()){
                degreesCelsius= in.nextDouble();
                degreesFahrenheit = degreesCelsius*1.8 +32;
                System.out.println("The temperature in fahrenheit is: " + degreesFahrenheit);
            }else{
                trash= in.nextLine();
                System.out.println("You have inputted an invalid temperature." + trash +  " Please try again");
                System.exit(0);
            }
    }
}
