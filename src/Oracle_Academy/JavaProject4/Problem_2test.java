package Oracle_Academy.JavaProject4;

public class Problem_2test {

    public static void main(String[] args) {
        Problem_1FtoC cm = new Problem_1FtoC();

        double tempC = cm.fToC(100.0);
        double hypotenuse = cm.hypotenuse(9, 10);
        int diceSum = cm.roll();

        System.out.println("Temp in celsius is " + tempC);
        System.out.println("Hypotenuse is " + hypotenuse);
        System.out.println("The sum of the dice values is " + diceSum);
    }
}


