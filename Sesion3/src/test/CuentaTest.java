package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {
	
	    private Cuenta cuenta = new Cuenta(0.0);

	    @BeforeAll
	    static void setUpBeforeClass() throws Exception {

	    }

	    @AfterAll
	    static void tearDownAfterClass() throws Exception {
	    }

	    @BeforeEach
	    void setUp() throws Exception {
	        cuenta.setSaldo(0.0);
	    }

	    @AfterEach
	    void tearDown() throws Exception {
	    }

	    @Test
	    void testIngresar() {
	        cuenta.ingresar(500.0);
	        assertEquals(500.0, cuenta.getSaldo());
	    }

	    @Test
	    void testRetirar() {
	        cuenta.reintegrar(500.0);
	        assertEquals(-500.0, cuenta.getSaldo());
	    }
	    
	    @Test
	    void test0014() {
	        Cuenta cuenta12345 = new Cuenta(50.0);
	        assertEquals(50.0, cuenta12345.getSaldo());

	        Cuenta cuenta67890 = new Cuenta(0.0);
	        assertEquals(0.0, cuenta67890.getSaldo());

	        cuenta12345.reintegrar(200.0);
	        assertEquals(-150.0, cuenta12345.getSaldo());

	        cuenta67890.reintegrar(350.0);
	        assertEquals(-350.0, cuenta67890.getSaldo());

	        cuenta12345.ingresar(100.0);
	        assertEquals(-50.0, cuenta12345.getSaldo());

	        cuenta67890.reintegrar(150.0);
	        assertEquals(-500.0, cuenta67890.getSaldo());

	        cuenta67890.ingresar(50.0);
	        assertEquals(-450.0, cuenta67890.getSaldo());

	        cuenta12345.reintegrar(200.0);
	        assertEquals(-250.0, cuenta12345.getSaldo());
	    }
}
