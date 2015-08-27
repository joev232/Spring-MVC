package curso.microforum.jee.spring;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

@Controller
public class RajoyController {

	
	@RequestMapping("/rajoy")
	public String rajao(){
		return "rajoy";
	}
	
	@RequestMapping("/rajoyi")
	public String rajaoDefecto(HttpServletRequest request,HttpServletResponse response){
		LocaleResolver locale = RequestContextUtils.getLocaleResolver(request);
		Locale loc = new Locale("IT");
		locale.setLocale(request, response, loc);
		return "rajoyi";
	}
}

