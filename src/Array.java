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
        int[] money = new int[3];
        for (int i = 0; i < money.length; i++){
            money[i] = (int)Math.random() * 10;
        }
        System.out.println("You have R" + money[0]);
        System.out.println("You have R" + money[1]);
    }

    // Finding the largest number in an array
    public static void largestNum(){
        int[] cars = {2, 1, 10, 15, 30, 3};
        int largestNum = cars[0];
        for (int i = 1; i < cars.length; i++){
            if (cars[i] > largestNum){
                largestNum = cars[i];
            }
        }
        System.out.println("Largest number of cars is " + largestNum);
    }

    // Random Shuffling
    public static void shuffling(){
        int[] cards = {1, 2, 3, 4, 6, 8, 9};
        System.out.println("Before ");
        for (int i = 0; i < cards.length; i++){
            System.out.println(cards[i]);
        }
        for (int i = 0; i < cards.length; i++){
            int j = (int) (Math.random() * cards.length);

            int temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }

        System.out.println("After ");
        for (int i = 0; i < cards.length; i++){
            System.out.println(cards[i]);
        }
    }

    // Shifting Elements
    public static void shiftArray(){
        String[] name = {"Tshepo", "Themba", "Shomang"};
        String temp = name[0];

        for (int i = 1; i < name.length; i++){
            name[i-1] = name[i];
        }
        name[name.length - 1] = temp;

        for (int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }
    }

    // Copying Arrays
    public static void copy(){
        String[] name = {"Tshepo", "Themba", "Shomang"};
        String[] copyName = new String[name.length];

        for (int i = 0; i < name.length; i++){
            copyName[i] = name[i];
        }
        for (int i = 0; i < name.length; i++){
            System.out.println(copyName[i]);
        }

    }



}
