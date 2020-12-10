package pe.edu.upeu.SISRA.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.SISRA.service.DocumentoService;

@RestController
@CrossOrigin(origins = "", maxAge = 3600)
@RequestMapping("/documento")
public class DocumentoController {

	@Autowired
	private DocumentoService docService;
	
	@GetMapping("/req/{id_req_asc}")
	public Map<String, Object> read(@PathVariable int id_req_asc){
		try {
			return docService.read(id_req_asc);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("error" + e);
			return null;
		}
	}
}
