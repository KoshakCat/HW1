package task1_1;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class ValidateDataServiceTest {
    private ValidateDataService instance;
    private String testSuccess;
    private String testFailed;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp () {
        instance = new ValidateDataService();
        testSuccess = "1010111";
        testFailed = "232f";
    }

    @Test
    public void shouldReturnCorrectValue() {
        String result = instance.getValidData(testSuccess);
        assertEquals(testSuccess, result);
    }

    @Test
    public void shouldThrowException() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Input data is not valid !");
        instance.getValidData(testFailed);
    }

}