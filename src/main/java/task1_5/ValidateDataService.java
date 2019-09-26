package task1_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateDataService {
    private final Pattern binaryCodePattern = Pattern.compile("^([1-9]|[1-2][\\d]|3[0-2])$");

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
