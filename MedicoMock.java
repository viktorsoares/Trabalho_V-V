package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

import org.junit.*;
import org.mockito.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import DAO.MedicoDAO;
import main.java.funcionarios.Medico;

class MedicoMock {

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
	
	private List<Medico> listarMedicos() {
		List<Medico> lista = new ArrayList<>();
		
		Medico medico1 = new Medico();
		medico1.setCpf("14714714710");
		medico1.setDataNasc("051081");
		medico1.setDepartamento("2");
		medico1.setEspecialidade("Ortopedista");
		medico1.setNome("Eduardo");
		medico1.setRG("8874596320");
		medico1.setSenha("soares");
		medico1.setSexo("M");
		medico1.setSobrenome("Lima");
		medico1.setTelefone("89554874");
        
		Medico medico2 = new Medico();
		medico2.setCpf("2313232156");
		medico2.setDataNasc("124432");
		medico2.setDepartamento("2");
		medico2.setEspecialidade("Ortopedista");
		medico2.setNome("Mario");
		medico2.setRG("99685741321");
		medico2.setSenha("Senha");
		medico2.setSexo("M");
		medico2.setSobrenome("Sousa");
		medico2.setTelefone("98558741");

		lista.add(medico1);
		lista.add(medico2);
		
		return null;
	}

	@Test
	void listMedicos() {
		MedicoDAO medimock = Mockito.mock(MedicoDAO.class);		
		Mockito.when(medimock.gerarTabela()).thenReturn(listarMedicos());
		
		List<Medico> medics = medimock.gerarTabela();
		assertFalse(medics.isEmpty());
	}
	
	@Test
	void pegaMedico() {
		MedicoDAO medimock = Mockito.mock(MedicoDAO.class);
		Medico medi = new Medico();
		medi = medimock.getMedico("2313232156");
		
		assertEquals("2313232156",medi.getCpf());
				
	}
	
	@Test
	void editaMedico() {
		MedicoDAO medimock = Mockito.mock(MedicoDAO.class);
		medimock.editarMedico("Matias", "Sousa", "Fortaleza", "998547147",
				"4444447145", "senha", "m", "987545871477", "Ortopedista", "2");
		Mockito.verify(stmt, Mockito.times(1).executeUpdate());
		
	}
	

}
