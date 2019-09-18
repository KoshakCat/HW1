import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number");
        // here should be data validation

        int number = in.nextInt();
        int resultNumber = ~number+1;
        System.out.println("Invert number " + resultNumber);

    }
}