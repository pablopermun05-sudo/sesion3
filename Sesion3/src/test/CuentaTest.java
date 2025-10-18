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
}
