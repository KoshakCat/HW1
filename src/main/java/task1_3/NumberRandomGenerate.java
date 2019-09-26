package task1_3;

public class NumberRandomGenerate {
    private int randomIntegerNumber;
    private byte randomByteNumber;
    private short randomShortNumber;
    private long randomLongNumber;

    public NumberRandomGenerate() {
        this.randomIntegerNumber = (int) ((Math.random()* 100500 + 1)*-1);
        this.randomByteNumber = (byte) (Math.random()* 100500 + 1);
        this.randomShortNumber = (short) (Math.random()* 100500 + 1);
        this.randomLongNumber = (long) (Math.random()* 100500 + 1);
    }

    public int getRandomIntegerNumber() {
        return randomIntegerNumber;
    }

    public byte getRandomByteNumber() {
        return randomByteNumber;
    }

    public short getRandomShortNumber() {
        return randomShortNumber;
    }

    public long getRandomLongNumber() {
        return randomLongNumber;
    }
}
