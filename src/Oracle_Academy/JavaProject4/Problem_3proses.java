package Oracle_Academy.JavaProject4;

import java.util.Random;

public class Problem_3proses {

    public int rollDice() {
        Random rand = new Random();
        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;
        return die1 + die2;
    }

    public static void main(String[] args) {
        Problem_3proses p = new Problem_3proses();
        int result = p.rollDice();
        System.out.println("Sum of two dice: " + result);
    }
}
