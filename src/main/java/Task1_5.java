import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
        int integerNumber =  (int) (Math.random()* 100500);

        System.out.println("Integer number " + Integer.toBinaryString(integerNumber));

        Scanner in = new Scanner(System.in);
        System.out.println("Input bite position to inverse");
        // here should be data validation

        int pos = in.nextInt() - 1;

        int serviceInvertBite = 1 << pos;
        //System.out.println(Integer.toBinaryString(serviceInvertBite));

        int result = integerNumber ^ serviceInvertBite;

        System.out.println("Result number after inversion bite in position " + (pos +1) + " is " + Integer.toBinaryString(result));

    }



}
