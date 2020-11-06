package curso.es;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void prueba1Suma() {
        int resultado=App.suma(4,7);
        int esperado=11;
        assertTrue( resultado == esperado );
    }

    @Test
    public void prueba4Suma() {
        int resultado=App.suma(-4,7);
        int esperado=3;
        assertTrue( resultado == esperado );
    }
    
    @Test
    public void pruebaApp() {
        new App();
    }
}
