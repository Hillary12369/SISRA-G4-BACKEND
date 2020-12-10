package pe.edu.upeu.SISRA.serviceImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.SISRA.dao.AsociacionDao;
import pe.edu.upeu.SISRA.service.AsociacionService;

@Service
public class AsociacionServiceImpl implements AsociacionService{
	@Autowired
	private AsociacionDao ascDao;

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return ascDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return ascDao.readAll();
	}
	
}
