package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import org.mockito.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import DAO.ConsultaDAO;
import DAO.MedicoDAO;
import main.java.consulta.*;

class ConsultaMock {

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

	private List<Consulta> listaConsut(){
		List<Consulta> consultas = new ArrayList<>();
		
		Consulta con1 = new Consulta();
		Consulta con2 = new Consulta();
		
		con1.setData("10042020");
		con1.setHorario("10:30");
		con1.setIdConsulta(2);
		con1.setMedNome("Igor");
		con1.setPacNome("Matheus");
		con1.setPacRG("44885471775");
		con1.setProntuario("ab");
		
		con2.setData("10042020");
		con2.setHorario("10:30");
		con2.setIdConsulta(2);
		con2.setMedNome("Igor");
		con2.setPacNome("Matheus");
		con2.setPacRG("44885471775");
		con2.setProntuario("ab");
		
		consultas.add(con1);
		consultas.add(con2);
		
		return null;
	}
	
	@Test
	void pegaConsult() {
		ConsultaDAO conmock = Mockito.mock(ConsultaDAO.class);
		Consulta con = new Consulta();
		
		con = conmock.getConsulta(1);
		assertEquals("44885471775",con.getPacRG());	
	}
	
	@Test
	void editaConsulta() {
		ConsultaDAO conmock = Mockito.mock(ConsultaDAO.class);
		conmock.editarConsulta("thiago", "Mathias", "47821697420", "10092020", "10:20", "ab", 1);
		Mockito.verify(stmt, Mockito.times(1).executeUpdate());
	}
	
	@Test
	void geraTabela() {
		ConsultaDAO conmuck = Mockito.mock(ConsultaDAO.class);
		Mockito.when(conmuck.gerarTabela()).thenReturn(listaConsut());
		
		List<Consulta> conlist = conmuck.gerarTabela();
		assertFalse(conlist.isEmpty());
	}
	
}
