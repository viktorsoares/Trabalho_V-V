package Test;

import static org.junit.jupiter.api.Assertions.*;

import main.java.pessoa.*;
import main.java.paciente.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.pessoa.Pessoa;

class Pessoa {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		Pessoa pessoMock = Mockito.mock(Pessoa.class);
		pessoMock.setCpf("1448554714");
		assertEquals("1448554714",pessoMock.getCpf());
	}

}
