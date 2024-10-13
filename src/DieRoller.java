import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int roll = 0;
        int dice1 = 0;
        int dice2 = 0;
        int dice3 = 0;
        int sum = 0;
        String gameOver = "";
        boolean rDone = false;
        boolean oDone = false;
        boolean gDone = false;

        do {
            roll = 0;
            gDone = false;
            System.out.println("Roll\tDice1\tDice2\tDice3\tSum");
            System.out.println("-------------------------------------");
            do {
                rDone = false;
                roll++;
                dice1 = rand.nextInt(6) + 1;
                dice2 = rand.nextInt(6) + 1;
                dice3 = rand.nextInt(6) + 1;
                sum = dice1 + dice2 + dice3;
                System.out.printf(roll + "\t\t" + dice1 + "\t\t" + dice2 + "\t\t" + dice3 + "\t\t" + sum + "\n");
                if (dice1 == dice2 && dice2 == dice3) {
                    rDone = true;
                }
            } while (!rDone);

            do {
                System.out.println("Do you want to play again? [Y/N]");
                gameOver = in.nextLine();
                if (gameOver.equalsIgnoreCase("Y")) {
                    gDone = false;
                    oDone = true;
                }
                else if (gameOver.equalsIgnoreCase("N")) {
                    gDone = true;
                    oDone = true;
                }
                else {
                    System.out.println(gameOver + " is not a valid input. please try again.");
                }
            } while (!oDone);
        } while (!gDone);

    }
}
