package task1_3;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class IntegerClassTest {

    @Mock
    NumberRandomGenerate integerNumberRandomGenerateMock;

    @InjectMocks
    IntegerClass instance;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        instance = new IntegerClass();

    }

    @Test
    public void shouldReturnCorrectBiteForInteger () {
        when(integerNumberRandomGenerateMock.getRandomIntegerNumber()).thenReturn(Integer.MIN_VALUE);
        assertEquals(Integer.SIZE, instance.calculateBitsInteger());
    }

}