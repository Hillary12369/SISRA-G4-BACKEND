package pe.edu.upeu.SISRA.serviceImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.SISRA.dao.DocumentoDao;
import pe.edu.upeu.SISRA.service.DocumentoService;

@Service
public class DocumentoServiceImpl implements DocumentoService {

	@Autowired
	private DocumentoDao docDao;

	@Override
	public Map<String, Object> read(int id_req_asc) {
		// TODO Auto-generated method stub
		return docDao.read(id_req_asc);
	}
}
