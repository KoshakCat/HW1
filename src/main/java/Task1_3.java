import java.util.Random;

public class Task1_3 {
    public static void main(String[] args) {
        int integerNumber =  (int) ((Math.random()* 100500 + 1)*-1);
        byte byteNumber = (byte) (Math.random()* 100500 + 1);
        short shortNumber = (short) (Math.random()* 100500 + 1);
        long longNumber = (long) (Math.random()* 100500 + 1);

        System.out.println("========Random number=========");
        System.out.println("Integer number " + integerNumber);
        System.out.println("Byte number " + byteNumber);
        System.out.println("Short number " + shortNumber);
        System.out.println("Long number " + longNumber);


        while (integerNumber != -1) {
            integerNumber = integerNumber >> 1;
        }

        int counterByte = 1;
        byteNumber = (byte) (byteNumber / byteNumber);
        while (byteNumber > 0) {
            byteNumber = (byte) (byteNumber << 1);
            counterByte ++;
        }

        int counterShort = 1;
        shortNumber = (short) (shortNumber / shortNumber);
        while (shortNumber > 0) {
            shortNumber = (short) (shortNumber << 1);
            counterShort ++;
        }

        int counterLong = 1;
        longNumber = (long) (longNumber / longNumber);
        while (longNumber > 0) {
            longNumber = (long) (longNumber << 1);
            counterLong ++;
        }

        System.out.println("=============================");
        System.out.println("Integer - " + Integer.toBinaryString(integerNumber).length() + " bits");
        System.out.println("Byte - " + counterByte + " bits");
        System.out.println("Short - " + counterShort + " bits");
        System.out.println("Long - " + counterLong + " bits");
    }
}
