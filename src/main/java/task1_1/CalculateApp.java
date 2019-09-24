package task1_1;

public class CalculateApp {

    public int getResult(int number, int grade) {
        int result = 0;
        int i = 0;

        while (i < grade ) {
            int temp = number % 10;
            result = result + (1 << i) * temp;
            number = number / 10;
            i++;
        }
        return result;
    }
}



