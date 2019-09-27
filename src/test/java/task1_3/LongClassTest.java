package task1_3;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class LongClassTest {

    @Mock
    NumberRandomGenerate longNumberRandomGenerateMock;

    @InjectMocks
    LongClass instance;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        instance = new LongClass();
    }

    @Test
    public void shouldReturnCorrectBiteForLong () {
        when(longNumberRandomGenerateMock.getRandomLongNumber()).thenReturn(Long.MAX_VALUE);
        assertEquals(Long.SIZE, instance.calculateBitsLong());
    }

}