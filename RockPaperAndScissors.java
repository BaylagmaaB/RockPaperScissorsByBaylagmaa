import java.util.Random;
import java.util.Scanner;

public class RockPaperAndScissors {
    public static void main(String[] args) {
        int userNum;
        userNum = gettingInput();
        Random comp = new Random();
        int compNum = comp.nextInt();
        System.out.println("Welcome to the Rock Paper Scissors Game!");

        if((userNum == 0 && compNum == 1) || (userNum == 1 && compNum == 2) || (userNum == 2 && compNum == 0)) {
            System.out.println("Yon Lose ;(");
        } else if ((userNum == 0 && compNum == 2) || (userNum == 2 && compNum == 1) || (userNum == 1 && compNum == 0)) {
            System.out.println("You Win :)");
        } else if ((userNum == compNum)) {
            System.out.println("It's a tie! ");
        }
    }
    public static int gettingInput() {
        Scanner keyboard = new Scanner(System.in);
        int userNum = 0;
        System.out.println("Would you like to use Rock[0], Paper[1] or Scissors[2]: ");
        userNum = keyboard.nextInt();
        return userNum;
    }
}