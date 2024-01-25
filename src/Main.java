//// Gracie Hackworth, ALC Software Development, January 24th, 2024
public class Main {
    public static void main(String[] args) {

        // initalizes the arrays for weather and precipitation
        int[] weather = {45, 29, 10, 22, 41, 28, 33};
        //note precipitation is meant to be in percentages, but for
        // simplicity sake, we will use whole numbers from 0-100
        int[] precipitation = {95, 60, 25, 5, 0, 75, 90};

        int cold = 32;
        int precipitate = 50;

        for (int i = 0; i < weather.length; i++) {
            //specifies the day of the week
            if(i == 0)
                System.out.println("***** Monday *****");
            if(i == 1)
                System.out.println("***** Tuesday *****");
            if(i == 2)
                System.out.println("***** Wednesday *****");
            if(i == 3)
                System.out.println("***** Thursday *****");
            if(i == 4)
                System.out.println("***** Friday *****");
            if(i == 5)
                System.out.println("***** Saturday *****");
            if(i == 6)
                System.out.println("***** Sunday *****");

            // prints out the temperature and precipitation, mainly for testing & checking purposes
            // but it looks cool too, I guess!
            System.out.println("Temperature: " + weather[i] + " | " + "Precipitation chance: " + precipitation[i]);

            if (weather[i]<= cold ) {
                if (precipitation[i] <= precipitate)
                    System.out.println("It will be cold, but will not likely snow.");
                if (precipitation[i] >= precipitate)
                    System.out.println("It will be cold, and will likely snow.");
            }
            if(weather[i]>=cold){
                    if (precipitation[i] <= precipitate)
                        System.out.println("It will be warm, and will not likely rain.");
                    if (precipitation[i] >= precipitate)
                        System.out.println("It will be warm, and will likely rain.");}

        }

    }
}