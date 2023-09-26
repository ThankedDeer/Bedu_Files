package r2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class MathApplicationTest {

    @ExtendWith(MockitoExtension.class)

    @Mock
    CalculadoraService calcService;
    @InjectMocks
    MathApplication mathApplication;



    @Test
    public void testAdd() {

        when(calcService.add(10.0, 20.0)).thenReturn(30.00);

        assertEquals(mathApplication.add(10.0, 20.0), 30.0, 0);

        verify(calcService).add(10.0, 20.0);
    }


}