package pictures.spring.modelo.dto.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pictures.spring.modelo.dto.Countries;
import pictures.spring.modelo.persistencia.tables.TableNames;

public class CountriesMapper implements RowMapper<Countries>{

	@Override
	public Countries mapRow(ResultSet rs, int nFila) throws SQLException {
		Countries countries = new Countries();
		countries.setCountry_id(rs.getString(TableNames.COUNTRY_ID));
		countries.setCountry_name(rs.getString(TableNames.COUNTRY_NAME));
		countries.setRegion_id(rs.getInt(TableNames.REGION_ID));
		return countries;
	}

}
