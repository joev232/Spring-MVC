package pictures.spring.modelo.persistencia.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import pictures.spring.modelo.dao.interfaces.GenericIDAO;
import pictures.spring.modelo.dto.GenericDTO;
import pictures.spring.modelo.persistencia.querys.SQLQuerys;

public class GenericDAO implements GenericIDAO {
	
	private JdbcTemplate jdbcTemplate;

	public GenericDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<GenericDTO> getGenericDTOList(RowMapper mapper, Class  klass) {
		List<GenericDTO> lista_dtos = (List<GenericDTO>) this.jdbcTemplate.query(SQLQuerys.getNeededQuery(klass.getSimpleName()),mapper);
		return lista_dtos;
	}






}
