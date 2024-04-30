package lapnt.DuAn.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import lapnt.DuAn.Models.KhachHang;
import lapnt.DuAn.Services.KhachHangService;

import java.util.List;

@Controller
public class KhachHangController {

    @Autowired
    private KhachHangService khachHangService;

    // Hiển thị danh sách khách hàng
    @GetMapping("/khachhang")
    public String listKhachHang(Model model) {
        List<KhachHang> listKhachHang = khachHangService.getAllKhachHang();
        model.addAttribute("listKhachHang", listKhachHang);
        return "list_khachhang";
    }

    // Form thêm khách hàng
    @GetMapping("/khachhang/add")
    public String addKhachHangForm(Model model) {
        KhachHang khachHang = new KhachHang();
        model.addAttribute("khachHang", khachHang);
        return "add_khachhang";
    }

    // Xử lý thêm khách hàng
    @PostMapping("/khachhang/save")
    public String saveKhachHang(@ModelAttribute("khachHang") KhachHang khachHang) {
        khachHangService.saveKhachHang(khachHang);
        return "redirect:/khachhang";
    }

    // Form sửa khách hàng
    @GetMapping("/khachhang/edit/{id}")
    public String editKhachHangForm(@PathVariable("id") int id, Model model) {
        KhachHang khachHang = khachHangService.getKhachHangById(id);
        model.addAttribute("khachHang", khachHang);
        return "edit_khachhang";
    }

    // Xử lý sửa khách hàng
    @PostMapping("/khachhang/update/{id}")
    public String updateKhachHang(@PathVariable("id") int id, @ModelAttribute("khachHang") KhachHang khachHang) {
        khachHangService.saveKhachHang(khachHang);
        return "redirect:/khachhang";
    }

    // Xóa khách hàng
    @GetMapping("/khachhang/delete/{id}")
    public String deleteKhachHang(@PathVariable("id") int id) {
        khachHangService.deleteKhachHang(id);
        return "redirect:/khachhang";
    }
}


