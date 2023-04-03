package by.htp.webpr.command;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import by.htp.webpr.domain.LoginData;

@Controller
@RequestMapping("/login")
public class LoginationProcessCommand {

	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;

	@RequestMapping("/showLoginForm")
	public String showForm(Model theModel) {

		LoginData loginData = new LoginData();

		theModel.addAttribute("loginData", loginData);

		theModel.addAttribute("theCountryOptions", countryOptions);

		return "show-login-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("loginData") LoginData loginData) {

		// log the input data
		System.out.println("data: " + loginData.getLogin() + " " + loginData.getPassword());

		return "main-page";
	}

}
