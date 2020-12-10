package pe.edu.upeu.SISRA.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.SISRA.service.AsociacionService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/asociaciones")
public class AsociacionController {

	@Autowired
	private AsociacionService ascService;

	@GetMapping("/all")
	public Map<String, Object> readAll() {
		return ascService.readAll();
	}

	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		try {
			return ascService.read(id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error" + e);
			return null;
		}
	}
}
