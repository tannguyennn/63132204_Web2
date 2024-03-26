package thiGK.ntu63132204.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import thiGK.ntu63132204.models.NhanVien;
import thiGK.ntu63132204.services.NhanVienService;

@Controller
public class HomeControllers {
	@GetMapping("/")
	public String Index() {
		return "index";
	}
	
	@Autowired
	private NhanVienService nvs;
	
	@GetMapping("/danhsachNV")
    public String danhSachNV(ModelMap model) {

        List<NhanVien> dsNV = nvs.getAllNV();
        
        model.addAttribute("dsNV", dsNV);
        return "nhanvien_getAll";
    }
	
	@GetMapping("/themMoiNV")
    public String themNhanVien() {
        return "nhanvien_add";
    }
	@PostMapping("/luu")
    public String luuMoiNV(@RequestParam String maSoNV, @RequestParam String hoVaTen, @RequestParam int luong) {
        NhanVien nv = new NhanVien(maSoNV, hoVaTen,luong);
        nvs.themNV(nv);
        return "redirect:/themMoiNV?success=true";
    }
	
	@GetMapping("/timkiemNV")
    public String showSearchForm() {
        return "nhanvien_search";
    }
	
	@GetMapping("/ketquasearch")
	public String searchNhanVien(@RequestParam String maSoNV, ModelMap model) {
	    NhanVien nv = nvs.findNhanVienById(maSoNV);
	    if (nv != null) {
	        model.addAttribute("nhanvien", nv);
	    } else {
	        model.addAttribute("errorMessage", "Không tìm thấy nhanvien");
	    }
	    return "ketquasearch";
	}
}