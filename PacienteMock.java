package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import DAO.PacienteDAO;
import main.java.paciente.*;
import main.java.paciente.Paciente;

class Paciente {

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
	void testPacientes() {
		PacienteDAO paciMock = Mockito.mock(PacienteDAO);
		List<Paciente> pacientes = paciMock.gerarTabela();
		assertTrue(pacientes.isEmpty());
	}
	
	
}
	
	