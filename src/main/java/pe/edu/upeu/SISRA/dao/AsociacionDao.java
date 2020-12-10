package pe.edu.upeu.SISRA.dao;

import java.util.Map;

public interface AsociacionDao {
	Map<String, Object> read(String name);
	Map<String, Object> read(int id);
	Map<String, Object> readAll();

}
