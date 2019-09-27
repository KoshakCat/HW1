package task1_3;

public class App {
    public static void main(String[] args) {

        IntegerClass integerClass = new IntegerClass();
        System.out.println("Integer - " + integerClass.calculateBitsInteger() + " bits");

        ByteClass byteClass = new ByteClass();
        System.out.println("Byte - " + byteClass.calculateBitsByte() + " bits");

        ShortClass shortClass = new ShortClass();
        System.out.println("Short - " + shortClass.calculateBitsShort() + " bits");

        LongClass longClass = new LongClass();
        System.out.println("Long - " + longClass.calculateBitsLong() + " bits");

    }

}
