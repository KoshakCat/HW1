package task1_3;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyByte;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ByteClassTest {

    @Mock
    NumberRandomGenerate byteNumberRandomGenerateMock;

    @InjectMocks
    ByteClass instance;

    @Before
    public void setUp() {
        //MockitoAnnotations.initMocks(this);
        instance = new ByteClass();

    }

    @Test
    public void shouldReturnCorrectBiteForByte () {
        when(byteNumberRandomGenerateMock.getRandomByteNumber()).thenReturn(Byte.MAX_VALUE);
        assertEquals(Byte.SIZE, instance.calculateBitsByte());
    }

}