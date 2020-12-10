package pe.edu.upeu.SISRA.daoImpl;

import java.sql.Types;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import pe.edu.upeu.SISRA.dao.DocumentoDao;

@Component
public class DocumentoDaoImpl implements DocumentoDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;

	@Override
	public Map<String, Object> read(int id_req_asc) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("pk_documento")
				.withProcedureName("sp_req_asc")
				.declareParameters(new SqlOutParameter("cursor_req_asc", Types.REF_CURSOR, new ColumnMapRowMapper()),
						new SqlParameter("id_asc", Types.NUMERIC));
		SqlParameterSource in = new MapSqlParameterSource().addValue("id_asc", id_req_asc);
		Map<String, Object> map = simpleJdbcCall.execute(in);
		return map;
	}

}
