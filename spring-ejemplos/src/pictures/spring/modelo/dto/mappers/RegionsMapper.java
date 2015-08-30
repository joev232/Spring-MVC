package pictures.spring.modelo.dto.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pictures.spring.modelo.dto.Regions;
import pictures.spring.modelo.persistencia.tables.TableNames;

public class RegionsMapper implements RowMapper<Regions>{

	@Override
	public Regions mapRow(ResultSet rs, int nFila) throws SQLException {
		Regions region = new Regions();
		region.setId(rs.getInt(TableNames.REGION_ID));
		region.setName(rs.getString(TableNames.REGION_NAME));
		return region;
	}

}
