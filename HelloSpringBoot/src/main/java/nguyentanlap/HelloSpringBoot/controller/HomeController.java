package nguyentanlap.HelloSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String trangChu(ModelMap model) {
		model.addAttribute("tb","Nguyễn Tấn Lập");
		return "index";
	}
}
