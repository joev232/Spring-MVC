package curso.microforum.jee.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dto.Persona;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/form")
public class EjemplosFormSpring {

	@RequestMapping(method = RequestMethod.POST)
	public String formGetPersona(@ModelAttribute(value = "persona") Persona pers,Model model,HttpServletRequest req,HttpServletResponse resp) {

		System.out.println(req);
		System.out.println(resp);
		model.addAttribute("pers",pers);
		
		return "mostrar";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String formGet(
			@RequestParam(value = "nombre", required = false, defaultValue = "Yolo!") String nombre,
			Model model) {
		model.addAttribute("nombre", nombre + " -> GET");
		System.out.println(nombre);
		return "mostrar";
	}

//	@RequestMapping(method = RequestMethod.POST)
//	public String formPost(
//			@RequestParam(value = "nombre", required = false, defaultValue = "Yolo!") String nombre,
//			Model model) {
//		model.addAttribute("nombre", nombre + " -> POST");
//		System.out.println(nombre);
//		return "mostrar";
//	}

}
