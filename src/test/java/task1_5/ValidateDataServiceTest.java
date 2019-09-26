package task1_5;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import task1_5.ValidateDataService;

import static org.junit.Assert.*;

public class ValidateDataServiceTest {

    private ValidateDataService instance;
    private String testSuccess;
    private String testFailed1;
    private String testFailed2;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp () {
        instance = new ValidateDataService();
        testSuccess = "5";
        testFailed1 = "0";
        testFailed2 = "dfsvs";
    }

    @Test
    public void shouldReturnCorrectValue() {
        String result = instance.getValidData(testSuccess);
        assertEquals(testSuccess, result);
    }

    @Test
    public void shouldThrowExceptionWhenNotInRangeOnetoThirtyTwo() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Input data is not valid !");
        instance.getValidData(testFailed1);
    }

    @Test
    public void shouldThrowExceptionWhenNoneDigit() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Input data is not valid !");
        instance.getValidData(testFailed2);
    }



}