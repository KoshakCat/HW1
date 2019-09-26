package task1_5;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import task1_3.ByteClass;
import task1_3.NumberRandomGenerate;

import java.util.Scanner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class InputServiceTest {

    @Mock
    Scanner scannerMock;

    @InjectMocks
    InputService instance;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        instance = new InputService();
    }

    @Test
    public void shouldReturnCorrectInputString () {
        //when(scannerMock.nextLine()).thenReturn("   bla bla bla   ");
        //assertEquals("bla bla bla", instance.getUserInput());
        //verify(scannerMock).nextLine();
    }

}