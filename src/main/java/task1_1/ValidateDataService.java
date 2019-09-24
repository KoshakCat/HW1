package task1_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateDataService {
    private final Pattern binaryCodePattern = Pattern.compile("[0-1]+");

    private boolean isValidData (String data) {
        Matcher binaryCodeMatcher = binaryCodePattern.matcher(data);
        return binaryCodeMatcher.matches();
    }

    public String getValidData(String data) {
        if (!isValidData(data)) {
            throw new IllegalArgumentException("Input data is not valid !");
        }
        return data;
    }
}
