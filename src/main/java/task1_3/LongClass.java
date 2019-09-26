package task1_3;

public class LongClass {
    private NumberRandomGenerate longNumberRandomGenerate = new NumberRandomGenerate();
    private long longNumber = longNumberRandomGenerate.getRandomLongNumber();

    public int calculateBitsLong () {
        int counterLong = 1;
        longNumber = (long) (longNumber / longNumber);
        while (longNumber > 0) {
            longNumber = (long) (longNumber << 1);
            counterLong ++;
        }
        return counterLong;
    }
}
