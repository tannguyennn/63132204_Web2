package lapnt.DisplayList.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import lapnt.DisplayList.models.SinhVien;

@Controller
public class SinhVienController {
	static List<SinhVien> dsSinhVien=  new ArrayList<SinhVien>();
	static {
			dsSinhVien.add(new SinhVien("0001", "Mai Cường Thọ"));
			dsSinhVien.add(new SinhVien("0002", "Trần Văn Long"));
		 }
	//----------hết phần hard-code dữ liệu ---------------------	
	@GetMapping("/danhsachSV")
	public String listStudent(ModelMap mm) {
	    mm.addAttribute("dsSV", dsSinhVien);
	    return "sinhvien_getAll";
	}
}
