package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	
	@RequestMapping("/complex")
	public String showForm() {
		return "complex_form";
	}
	
	@RequestMapping(path = "/handleform", method = RequestMethod.POST)
	public String formHandler(@RequestParam("email") String email, 
			@RequestParam("password") Long password) {
		System.out.println(email);
		System.out.println(password);
		return "success";
	}
}
