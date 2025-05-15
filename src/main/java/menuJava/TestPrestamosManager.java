package menuJava;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestPrestamosManager {
    @Test
    public void testPrestamosManager() {
        // Create an instance of PrestamosManager
        PrestamosManager prestamosManager = new PrestamosManager();

        // Test the constructor
        assertNotNull(prestamosManager);
    }

    @Test
    public void testGetPrestamos() {
        // Create an instance of PrestamosManager
        PrestamosManager prestamosManager = new PrestamosManager();

        // Test the getPrestamos method
        assertNotNull(prestamosManager.getPrestamos());
    }

    @Test
    public void testAddPrestamo() {
        // Create an instance of PrestamosManager
        PrestamosManager prestamosManager = new PrestamosManager();

        // Test adding a new loan
        prestamosManager.addPrestamo("12345", "2023-10-01", "2023-10-15");
        assertEquals(1, prestamosManager.getPrestamos().size());
    }
}