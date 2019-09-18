import java.util.Scanner;

public class Task1_1
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input binary code (less than 32 figures)");

        // here should be data validation

        String number = in.next();
        int levelNumber = number.length();

        int result = 0;

        for (int i=0; i < levelNumber; i++) {
            String nextChar = Character.toString(number.charAt(levelNumber-1-i));
            int nextFigure = Integer.parseInt(nextChar);
            result = result + (1 << i) * nextFigure;
        }

        System.out.println("Binary code " + number + " in decimal is "+ result);

    }
}