package by.htp.webpr.command;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginationProcessCommand {
	
	@RequestMapping("/loginForm")	
	public String execute(HttpServletRequest request, Model model) {
		
		String theName = request.getParameter("login");
		
		theName = theName.toUpperCase();
		
		String result = "Yo! " + theName;
		
		model.addAttribute("message", result);
				
		return "login-page";
	}
	

}
