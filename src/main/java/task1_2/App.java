package task1_2;

import java.util.Scanner;

public class App {
    InputService inputService = new InputService();
    ValidateDataService validateDataService = new ValidateDataService();
    ParseToIntService parseToIntService = new ParseToIntService();
    CalculateApp calculateApp = new CalculateApp();


    public static void main( String[] args )
    {
        App app = new App();
        app.doTask1_2();
    }

    public void doTask1_2 () {
        System.out.println("Input number");
        String userData = inputService.getUserInput();
        String userValidData = validateDataService.getValidData(userData);
        int userNumberInteger = parseToIntService.parseToIntValidString(userValidData);
        int result = calculateApp.getResult(userNumberInteger);
        System.out.println("Invert number " + result);

    }





}