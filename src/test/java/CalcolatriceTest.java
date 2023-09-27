import org.example.Calcolatrice;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CalcolatriceTest {
    Calcolatrice calcolatrice;

    @Before
    public final void setUp(){
        calcolatrice = new Calcolatrice();
    }

    @Test
    public void testSomma(){
        assertTrue("SOMMA_CORRETTA",calcolatrice.somma(11,1) == 12);
    }

    public void testMoltiplicazione(){
        assertTrue("MOLTIPLICAZIONE_CORRETTA",calcolatrice.moltiplicazione(10,2) == 20);
    }
}
