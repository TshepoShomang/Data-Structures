import java.util.Scanner;

public class Array {
    public static void array(){
        int[] age = new int[5];
        age[0] = 10;
        age[1] = 13;
        age[2] = 7;
        age[3] = 2;
        age[4] = 1;

        String[] name = {"Tshepo" , "Mpho" , "Tebza"};

        System.out.println(age.length);
        System.out.println(name.length);
    }

    // Sum of array
    public static void arraySum(){
        int total = 0;
        int people[] = {10, 15, 4};
        for (int i = 0; i < people.length; i++){
            total += people[i];
        }
        System.out.println("Sum of people is " + total);
    }

    // Entering Values in an array
    public static void inputArray(){
        int[] mark = new int[2];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter " + mark.length + " marks");
        for (int i = 0; i < mark.length; i++){
            mark[i] = scan.nextInt();
        }
        System.out.println("First = " + mark[0] + " Second = " + mark[1]);
    }

    // Initializing arrays with random values
    public static void randomArray(){
        double[] money = new double[3];
        for (int i = 0; i < money.length; i++){
            money[i] = Math.random() * 10;
        }
        System.out.println("You have R" + money[0]);
        System.out.println("You have R" + money[1]);
    }
}
