import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    int zahl1,zahl2;

    @org.junit.Before
    public void setUp() throws Exception {
        zahl1 = 12;
        zahl2 = 8;
    }

    /**
     * Test des Normalfalls
     * @throws Exception
     */
    @Test
    public void euklid() throws Exception {
        assertEquals("Erfolgreich", 4, Main.Euklid(zahl1,zahl2));
    }

    /**
     * Test des Normalfalls
     * @throws Exception
     */
    @Test
    public void euklidRekursiv() throws Exception {
        assertEquals("Erfolgreich", 4, Main.EuklidRekursiv(zahl1,zahl2));
    }

    /**
     * Test des Normalfalls
     * @throws Exception
     */
    @Test
    public void euklidMod() throws Exception {
        assertEquals("Erfolgreich", 4, Main.EuklidMod(zahl1,zahl2));
    }

    /**
     * Test des Normalfalls
     * @throws Exception
     */
    @Test
    public void euklidModRekursiv() throws Exception {
        assertEquals("Erfolgreich", 4, Main.EuklidModRekursiv(zahl1,zahl2));
    }

}