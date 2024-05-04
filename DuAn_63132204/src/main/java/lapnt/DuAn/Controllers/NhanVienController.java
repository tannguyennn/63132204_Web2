package lapnt.DuAn.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import lapnt.DuAn.Services.NhanVienService;
import lapnt.DuAn.Models.NhanVien;

import java.util.List;

@Controller
public class NhanVienController {

    @Autowired
    private NhanVienService nhanVienService;

    // Hiển thị danh sách nhân viên
    @GetMapping("/nhanvien")
    public String listNhanVien(Model model) {
        List<NhanVien> listNhanVien = nhanVienService.getAllNhanVien();
        model.addAttribute("listNhanVien", listNhanVien);
        return "list_nhanvien";
    }

    // Form thêm nhân viên
    @GetMapping("/nhanvien/add")
    public String addNhanVienForm(Model model) {
        NhanVien nhanVien = new NhanVien();
        model.addAttribute("nhanVien", nhanVien);
        return "add_nhanvien";
    }

    // Xử lý thêm nhân viên
    @PostMapping("/nhanvien/save")
    public String saveNhanVien(@ModelAttribute("nhanVien") NhanVien nhanVien) {
        nhanVienService.saveNhanVien(nhanVien);
        return "redirect:/nhanvien";
    }

    // Form sửa nhân viên
    @GetMapping("/nhanvien/edit/{id}")
    public String editNhanVienForm(@PathVariable("id") int id, Model model) {
        NhanVien nhanVien = nhanVienService.getNhanVienById(id);
        model.addAttribute("nhanVien", nhanVien);
        return "edit_nhanvien";
    }

    // Xử lý sửa nhân viên
    @PostMapping("/nhanvien/update/{id}")
    public String updateNhanVien(@PathVariable("id") int id, @ModelAttribute("nhanVien") NhanVien nhanVien) {
        nhanVienService.saveNhanVien(nhanVien);
        return "redirect:/nhanvien";
    }

    // Xóa nhân viên
    @GetMapping("/nhanvien/delete/{id}")
    public String deleteNhanVien(@PathVariable("id") int id) {
        nhanVienService.deleteNhanVien(id);
        return "redirect:/nhanvien";
    }
// // Tìm kiếm nhân viên
//    @GetMapping("/nhanvien/search")
//    public String searchNhanVien(@RequestParam("keyword") String keyword, Model model) {
//        List<NhanVien> listNhanVien = nhanVienService.searchNhanVien(keyword);
//        model.addAttribute("listNhanVien", listNhanVien);
//        return "nhanvien";
//    }
//   // Tìm kiếm nhân viên
//    @GetMapping("/nhanvien/searchid")
//    public String searchNhanVienByID( int id, Model model) {
//        NhanVien nhanVien = nhanVienService.getNhanVienById(id);
//        return "nhanvien";
//    }
}
