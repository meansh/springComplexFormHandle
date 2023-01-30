package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
		
	@RequestMapping("/user/{userId}")
	public String getUserDetail(@PathVariable("userId") int userId) {
		System.out.println(userId);
		return "home";
	}
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Going to home view");
		String s = null;
		System.out.println(s.length());
		return "home";
	}
	
	
	//Handling exception in out Spring MVC
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({NullPointerException.class})
	public String exceptionHandlerNull() {
		return "null_page";
	}
	
	@ExceptionHandler(value = Exception.class)
	public String exceptionHandlerGeneric(Model m) {
		m.addAttribute("msg", "Exception ");
		return "null_page";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		
		String url = "https://www.google.com/search?q=" + query;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
	}
}