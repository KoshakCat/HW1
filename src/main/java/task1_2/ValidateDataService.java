package task1_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateDataService {
    private final Pattern codePattern = Pattern.compile("^-?\\d+$");

    private boolean isValidData (String data) {
        Matcher binaryCodeMatcher = codePattern.matcher(data);
        return binaryCodeMatcher.matches();
    }

    public String getValidData(String data) {
        if (!isValidData(data)) {
            throw new IllegalArgumentException("Input data is not valid !");
        }
        return data;
    }
}
