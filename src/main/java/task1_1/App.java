package task1_1;

public class App
{
    InputService inputService = new InputService();
    ValidateDataService validateDataService = new ValidateDataService();
    ParseToIntService parseToIntService = new ParseToIntService();
    CalculateApp calculateTask1_1 = new CalculateApp();


    public static void main( String[] args )
    {
        App app = new App();
        app.doTask1_1();
    }

    public void doTask1_1 () {
        System.out.println("Input binary code");
        String userData = inputService.getUserInput();
        String userValidData = validateDataService.getValidData(userData);
        int userNumberInteger = parseToIntService.parseToIntValidString(userValidData);
        int result = calculateTask1_1.getResult(userNumberInteger, userValidData.length());
        System.out.println("Binary code " + userData + " in decimal is "+ result);
    }
}