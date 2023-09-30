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

    @Test
    public void TestSottrazione(){
        assertTrue("sottrazione corretta", calcolatrice.sottrazione(5,3)==2);
    }

    @Test
    public void TestDivisione(){
        assertTrue("divisione corretta",calcolatrice.divisone(10,2)==5);
    }

    @Test
    public void TestDivisionePerZero(){
        assertTrue("divisione corretta",calcolatrice.divisone(10,0)==0);
    }
}
