package task1_5;

public class IntegerNumberRandomGenerate {
    private int randomIntegerNumber;

    public IntegerNumberRandomGenerate() {
        this.randomIntegerNumber = (int) (Math.random()* 100500 + 1);

    }

    public int getRandomIntegerNumber() {
        return randomIntegerNumber;
    }

}
