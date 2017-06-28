import java.util.Scanner;
import java.util.Random;

public class Lab5 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int numOfSides, randNum, randNum2;
        int numOfRolls = 1;
        String yOrN = " ";

        do {
            while (numOfRolls >= 1) {
                System.out.println("Enter a number of sides for a pair of dice: ");
                numOfSides = keyboard.nextInt();

                randNum = r.nextInt(numOfSides) + 1;
                randNum2 = r.nextInt(numOfSides) + 1;

                System.out.println("Roll " + numOfRolls + ":");
                System.out.println(randNum);
                System.out.println(randNum2);

                yOrN = keyboard.nextLine();
                System.out.println("Continue? (y/n):");
                yOrN = keyboard.nextLine();

                if (yOrN.equalsIgnoreCase("y")) {
                    numOfRolls = numOfRolls + 1;
                } else {
                    break;
                }
            }
        } while (yOrN.equalsIgnoreCase("y"));
        System.out.println("Goodbye!");
    }
}