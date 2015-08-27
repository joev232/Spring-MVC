package curso.microforum.jee.spring;

import javax.servlet.http.HttpServletRequest;

import modelo.dto.Persona;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WSController {

	@RequestMapping(path="/personaJSON",produces="application/json")
	@ResponseBody
	public ResponseEntity<Persona> personaJSON(HttpServletRequest request){
		Persona p = null;
		String name = (String) request.getParameter("name");
		int edad = Integer.parseInt((String) request.getParameter("edad"));
		String descripcion = (String) request.getParameter("desc");
		
		p = new Persona(name,edad,descripcion);
		return new ResponseEntity<Persona>(p,HttpStatus.OK);
	}
}
