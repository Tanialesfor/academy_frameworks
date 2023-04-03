package by.htp.webpr.command;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/loginPage")
public class LoginationProcessCommand {
	
	@RequestMapping("/loginForm")	
	public String execute(@RequestParam("login") String theName, Model model) {
		

		// convert the data to all caps
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Yo! " + theName;
		
		// add message to the model
		model.addAttribute("message", result);
				
		return "login-page";
	}
	
	@RequestMapping("/about")	
	public String goToAboutPage() {
		return "about";
	}
	

}
