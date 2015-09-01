package pictures.spring.controlador.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import pictures.spring.modelo.constants.Paths;
import pictures.spring.modelo.dto.Persona;
import pictures.spring.modelo.services.ServicesCountries;

@Controller
@RequestMapping(path = "/registrarPersona")
public class ControllerPersona {

	@Autowired
	private ServicesCountries scountries;

	@RequestMapping(method = RequestMethod.GET)
	public String nuevoRegistro(ModelMap model) {
		Persona persona = new Persona();
		model.addAttribute("persona", persona);
		return "formulario";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String saveRegistration(@Valid Persona persona, BindingResult result, ModelMap model,
			@RequestParam("foto") MultipartFile file) {
		String msj = "exito";

		if (result.hasErrors()) {
			msj = "formulario";
		} else {
			boolean guardado = this.guardarArchivo(file);
			if (guardado) {
				persona.setPhotoOriginalName(file.getOriginalFilename());
				model.addAttribute("persona", persona);
				msj = "mostrarpersona";
			}
		}

		return msj;
	}

	private boolean guardarArchivo(MultipartFile file) {
		boolean guardado = true;
		String savePath = Paths.absoluteSavePath + file.getOriginalFilename();
		try {
			byte[] bytes = file.getBytes(); // OBTENEMOS LOS BYTES DEL MULTIPART
			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(savePath)));
			stream.write(bytes);
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
			guardado = false;
		}
		return guardado;
	}

	@ModelAttribute("nacionalidad")
	public List<String> getCountriesNames() {
		List<String> nacionalidades = this.scountries.getCountriesNames();
		return nacionalidades;
	}
}
