package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import DAO.RecepcionistaDAO;
import main.java.funcionarios.Recepcionista;

class RecepMock {

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
	void pegarRecepcionista() {
		Recepcionista recepmock = Mockito.mock(Recepcionista.mock);
		recepmock.setCpf("3213213213");
		assertEquals("3213213213",recepmock.getCpf());
	}
	
	@Test
	private List<Recepcionista> listarRecepcionistas(){
		List<Recepcionista> lista1 = new ArrayList<>();
		Recepcionista recep1 = new Recepcionista();
		Recepcionista recep2 = new Recepcionista();
		
		recep1.setCpf("8498416468");
		recep1.setDataNasc("100498");
		recep1.setEndereco("Quixada");
		recep1.setNome("Igor");
		recep1.setRG("875487896525");
		recep1.setSenha("senha");
		recep1.setSexo("M");
		recep1.setSobrenome("Lima");
		recep1.setTelefone("98665874");
		
		recep2.setCpf("98641872578");
		recep2.setDataNasc("100589");
		recep2.setEndereco("Quixada");
		recep2.setNome("Arthur");
		recep2.setRG("587416396974");
		recep2.setSenha("senha");
		recep2.setSexo("M");
		recep2.setSobrenome("Santos");
		recep2.setTelefone("97858844");
		
		lista1.add(recep1);
		lista1.add(recep2);
		
		Recepcionista recepmock = Mockito.mock(Recepcionista.mock);
		assertEquals(recep1.getCpf(),recepmock.getCpf());
		
		return null;
	}
	
	@Test
	void editaRecep() {
		RecepcionistaDAO recepmock = Mockito.mock(RecepcionistaDAO.mock);
		recepmock.editarRecepcionista("Pedro", "88745874582", "322887549213", "40028922", "Ceara", "m", "senha");
	}
	
	

}
