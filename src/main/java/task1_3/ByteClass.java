package task1_3;

public class ByteClass {
    private NumberRandomGenerate byteNumberRandomGenerate = new NumberRandomGenerate();
    private byte byteNumber = byteNumberRandomGenerate.getRandomByteNumber();

    public int calculateBitsByte () {
        int counterByte = 1;
        byteNumber = (byte) (byteNumber / byteNumber);
        while (byteNumber > 0) {
            byteNumber = (byte) (byteNumber << 1);
            counterByte ++;
        }
        return counterByte;
    }
}
