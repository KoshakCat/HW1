package task1_5;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Scanner;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class InvertPositionIntegerRandomNumberTest {

    @Mock
    ValidateDataService validateDataServiceMock;

    @InjectMocks
    InvertPositionIntegerRandomNumber instance;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        int integerNumber = 1;
        String position = "1";
        instance = new InvertPositionIntegerRandomNumber(position, integerNumber);
    }

    @Test
    public void shouldReturnCorrectValue () {
        when(validateDataServiceMock.getValidData(anyString())).thenReturn("1");
        assertEquals(0, instance.doInvertIntegerNumber());
        //verify(validateDataServiceMock).getValidData("5");
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldThrowException () {
        doThrow(IllegalArgumentException.class).when(validateDataServiceMock).getValidData(anyString());
        validateDataServiceMock.getValidData(anyString());

    }

}