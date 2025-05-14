package Oracle_Academy.JavaProject4;
import java.util.Random;

public class Problem_1FtoC {

        public double fToC(double degreesF) {
            return 5.0 / 9 * (degreesF - 32);
        }

        public double hypotenuse(int a, int b) {
            return Math.sqrt(a * a + b * b);
        }

        public int roll() {
            Random rand = new Random();
            int die1 = rand.nextInt(6) + 1;
            int die2 = rand.nextInt(6) + 1;
            return die1 + die2;
        }
    }


