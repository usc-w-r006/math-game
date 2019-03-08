import java.util.Random;
import java.util.Scanner;

/**
 * ths is a simple math game for grades 3-5.
 *
 * @author Ash Benson
 */

public class MathGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 10; i++) {
            int y = rand.nextInt(12 - 1);
            int x = rand.nextInt(12 - 1);
            int response;

            int correct = (x+y);
            System.out.println("what is " + x + " + " + y + " ?");
            response = input.nextInt();
            if (response == correct) {
                count++;
                System.out.println("Correct Count ="+" "+count);

            }
            else System.out.println("Wrong");

            if (count == 8) {
                System.out.println("Congraulations on making it this far!");
            }
        }
    }
}