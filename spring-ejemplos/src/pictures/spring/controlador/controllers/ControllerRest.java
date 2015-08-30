package pictures.spring.controlador.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pictures.spring.modelo.dto.Countries;
import pictures.spring.modelo.dto.Regions;
import pictures.spring.modelo.services.ServicesCountries;
import pictures.spring.modelo.services.ServicesRegions;

@Controller
@RequestMapping("/rest")
public class ControllerRest {

	@Autowired
	private ServicesCountries countrieServices;
	@Autowired
	private ServicesRegions regionServices;
	
	
	@RequestMapping(path="regions",produces="application/json")
	@ResponseBody
	public ResponseEntity<List<Regions>> getRegionsList(){
		
		List<Regions> lista_regiones = this.regionServices.getRegionList();
		return new ResponseEntity<List<Regions>>(lista_regiones, HttpStatus.OK);
	}
	
	@RequestMapping(path="countries",produces="application/json")
	@ResponseBody
	public ResponseEntity<List<Countries>> getCountriesList(){
		
		List<Countries> lista_paises = this.countrieServices.getCountriesList();
		return new ResponseEntity<List<Countries>>(lista_paises, HttpStatus.OK);
	}
	
	
}
