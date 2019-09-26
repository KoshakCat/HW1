package task1_3;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ShortClassTest {
    @Mock
    NumberRandomGenerate shortNumberRandomGenerateMock;

    @InjectMocks
    ShortClass instance;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        instance = new ShortClass();

    }

    @Test
    public void shouldReturnCorrectBiteForShort () {
        when(shortNumberRandomGenerateMock.getRandomShortNumber()).thenReturn(Short.MIN_VALUE);
        assertEquals(Short.SIZE, instance.calculateBitsShort());
    }

}