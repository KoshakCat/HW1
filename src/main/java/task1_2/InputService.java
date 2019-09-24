package task1_2;

import java.util.Scanner;

public class InputService {

    public Scanner scanner = new Scanner(System.in);

    public String getUserInput(){
            String userInput = scanner.nextLine();
            return userInput.trim();
        }
}
