package pe.edu.upeu.SISRA.dao;

import java.util.Map;

public interface DocumentoDao {

	Map<String, Object> read(int id_req_asc);
}
