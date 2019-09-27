package task1_5;

import java.util.Scanner;

public class InputService {

    Scanner scanner = new Scanner(System.in);

    public String getUserInput(){
            String userInput = scanner.nextLine();
            return userInput.trim();
        }
}
