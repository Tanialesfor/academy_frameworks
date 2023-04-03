package by.htp.webpr.command;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import by.htp.webpr.domain.LoginData;

@Controller
@RequestMapping("/login")
public class LoginationProcessCommand {
	
	
	@RequestMapping("/showLoginForm")
	public String showForm(Model theModel) {
		
		// create a student object
		LoginData loginData = new LoginData();
		
		// add student object to the model
		theModel.addAttribute("loginData", loginData);
		
		return "show-login-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("loginData") LoginData loginData) {
		
		// log the input data
		System.out.println("data: " + loginData.getLogin()
							+ " " + loginData.getPassword());
		
		return "main-page";
	}
	

}
