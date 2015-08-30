package pictures.spring.modelo.dao.interfaces;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import pictures.spring.modelo.dto.GenericDTO;

public interface GenericIDAO {
	
	@SuppressWarnings("rawtypes")
	public List<GenericDTO> getGenericDTOList(RowMapper mapper,Class klass);

}
