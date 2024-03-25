package lapnt.FormSubmit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import lapnt.FormSubmit.models.DTOSinhVien;

@Controller
public class SinhVienController {
	
	@GetMapping("/themMoiSV")
	public String listStudent(ModelMap mm) {
		DTOSinhVien sinhvienNull = new DTOSinhVien();
	    mm.addAttribute("svDTO", sinhvienNull);
	    return "themSV_form";
	}
	@PostMapping("/themMoiSV")
	public String submitForm(@ModelAttribute("svDTO") DTOSinhVien sv) {
	    return "themSV_OK";
	}
}
