package pictures.spring.modelo.services;

import java.util.List;

import pictures.spring.modelo.dao.interfaces.GenericIDAO;
import pictures.spring.modelo.dto.Countries;
import pictures.spring.modelo.dto.GenericDTO;
import pictures.spring.modelo.dto.mappers.CountriesMapper;

public class ServicesCountries {


	private GenericIDAO genericIDAO;
	
	public ServicesCountries(GenericIDAO genericIDAO){
		this.genericIDAO = genericIDAO;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Countries> getCountriesList(){
		List<GenericDTO> genDTO = this.genericIDAO.getGenericDTOList(new CountriesMapper(),Countries.class);
		List<Countries> countries = ((List)genDTO);
		return countries;
	}
	
	
}
