package curso.microforum.jee.spring;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

 
@Controller
public class MiController {
 
	@RequestMapping("/bienvenido")
	public ModelAndView holaMundo() {
 
		String mensaje = "Vamos a darle caña al Spring";
		return new ModelAndView("bienvenido", "mensaje", mensaje);
	}
	
}