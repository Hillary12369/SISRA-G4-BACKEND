package pe.edu.upeu.SISRA;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.SISRA.dao.AsociacionDao;
import pe.edu.upeu.SISRA.dao.DocumentoDao;

@SpringBootTest
class SisraApplicationTests {
	@Autowired
	AsociacionDao asc;
	@Autowired
	DocumentoDao d;
	@Test
	void contextLoads() {
		
		/*System.out.println(asc.readAll());*/
		
		System.out.println(d.read(1));
		
	}

}
