package task1_3;

public class ShortClass {
    private NumberRandomGenerate shortNumberRandomGenerate = new NumberRandomGenerate();
    private short shortNumber = shortNumberRandomGenerate.getRandomShortNumber();

    public int calculateBitsShort () {
        int counterShort = 1;
        shortNumber = (short) (shortNumber / shortNumber);
        while (shortNumber > 0) {
            shortNumber = (short) (shortNumber << 1);
            counterShort ++;
        }
        return counterShort;
    }
}
