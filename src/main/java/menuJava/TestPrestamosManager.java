package menuJava;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestPrestamosManager {
    @Test
    public void testPrestamosManager() {
        PrestamosManager prestamosManager = new PrestamosManager();

        assertNotNull(prestamosManager);
    }

    @Test
    public void testGetPrestamos() {
        PrestamosManager prestamosManager = new PrestamosManager();

        assertNotNull(prestamosManager.getPrestamos());
    }

    @Test
    public void testAddPrestamo() {
        PrestamosManager prestamosManager = new PrestamosManager();

        prestamosManager.addPrestamo("12345", "2023-10-01", "2023-10-15");
        assertEquals(1, prestamosManager.getPrestamos().size());
    }
}

