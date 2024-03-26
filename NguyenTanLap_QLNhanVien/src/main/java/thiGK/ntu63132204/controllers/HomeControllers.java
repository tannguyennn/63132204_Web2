package thiGK.ntu63132204.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControllers {
	@GetMapping("/")
	public String Index() {
		return "index";
	}
}