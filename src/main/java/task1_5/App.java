package task1_5;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int integerNumber = new IntegerNumberRandomGenerate().getRandomIntegerNumber();
        System.out.println("Integer number " + Integer.toBinaryString(integerNumber));

        System.out.println("Input bite position to inverse");
        String position = new InputService().getUserInput();

        InvertPositionIntegerRandomNumber invertPositionIntegerRandomNumber = new InvertPositionIntegerRandomNumber(position,integerNumber);
        int result = invertPositionIntegerRandomNumber.doInvertIntegerNumber();

        System.out.println("Result number after inversion bite in position " + Integer.parseInt(position) + " is " + Integer.toBinaryString(result));

    }



}
