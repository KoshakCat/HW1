package task1_3;

public class IntegerClass {

    private NumberRandomGenerate integerNumberRandomGenerate = new NumberRandomGenerate();
    private int integerNumber = integerNumberRandomGenerate.getRandomIntegerNumber();

    public int calculateBitsInteger () {
        while (integerNumber != -1) {
            integerNumber = integerNumber >> 1;
        }
        return Integer.toBinaryString(integerNumber).length();
    }
}
