package pictures.spring.modelo.services;

import pictures.spring.modelo.dao.interfaces.GenericIDAO;
import pictures.spring.modelo.dto.GenericDTO;
import pictures.spring.modelo.dto.Regions;
import pictures.spring.modelo.dto.mappers.RegionsMapper;

import java.util.List;

public class ServicesRegions {

	private GenericIDAO genericIDAO;
	
	public ServicesRegions(GenericIDAO genericIDAO){
		this.genericIDAO = genericIDAO;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Regions> getRegionList(){
		List<GenericDTO> genDTO = this.genericIDAO.getGenericDTOList(new RegionsMapper(),Regions.class);
		List<Regions> reg = ((List)genDTO);
		return reg;
	}
	
	
	
	
}
