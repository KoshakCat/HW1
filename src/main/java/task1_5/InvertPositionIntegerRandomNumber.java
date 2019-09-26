package task1_5;

public class InvertPositionIntegerRandomNumber {
    private ValidateDataService validateDataService = new ValidateDataService();
    private String posStringNotCheck;
    private int integerNumber;

    public InvertPositionIntegerRandomNumber() {
    }

    public InvertPositionIntegerRandomNumber(String posStringNotCheck, int integerNumber) {
        this.posStringNotCheck = posStringNotCheck;
        this.integerNumber = integerNumber;
    }

    private String checkPosString () {
        return validateDataService.getValidData(posStringNotCheck);
    }

    public int doInvertIntegerNumber () {
        int posValid = Integer.parseInt(checkPosString()) - 1;
        int serviceInvertBite = 1 << posValid;
        int result = integerNumber ^ serviceInvertBite;
        return result;
    }
}
