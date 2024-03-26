package thiGK.ntu63132204.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import thiGK.ntu63132204.models.NhanVien;


@Controller
public class NhanVienController {
	static List<NhanVien> dsNV=  new ArrayList<NhanVien>();
	static {
			dsNV.add(new NhanVien("0001", "Nguyễn Tấn Lập",8000));
			dsNV.add(new NhanVien("0002", "Trần Văn Long",5000));
			dsNV.add(new NhanVien("0003", "Trần Văn Nhân",5000));
			dsNV.add(new NhanVien("0004", "Trần Văn Quân",5000));
			dsNV.add(new NhanVien("0005", "Trần Văn Quang",5000));
		 }
	
	@GetMapping("/danhsachNV")
	public String listNhanVien(ModelMap mm) {
	    mm.addAttribute("dsSV", dsNV);
	    return "nhanvien_getAll";
	}
}
