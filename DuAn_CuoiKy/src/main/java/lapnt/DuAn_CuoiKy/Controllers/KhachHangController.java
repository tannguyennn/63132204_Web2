package lapnt.DuAn_CuoiKy.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import lapnt.DuAn_CuoiKy.Models.KhachHang;
import lapnt.DuAn_CuoiKy.Services.KhachHangService;

@Controller
@RequestMapping("/khachhang")
public class KhachHangController {

    @Autowired
    private KhachHangService khachHangService;

    @GetMapping("/list")
    public String listKhachHang(Model model) {
        model.addAttribute("khachhangs", khachHangService.getAllKhachHang());
        return "list-khachhang";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("khachhang", new KhachHang());
        return "add-khachhang";
    }

    @PostMapping("/add")
    public String addKhachHang(@ModelAttribute("khachhang") KhachHang khachHang) {
        khachHangService.saveOrUpdateKhachHang(khachHang);
        return "redirect:/khachhang/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") int id, Model model) {
        KhachHang khachHang = khachHangService.getKhachHangById(id);
        model.addAttribute("khachhang", khachHang);
        return "edit-khachhang";
    }

    @PostMapping("/edit")
    public String editKhachHang(@ModelAttribute("khachhang") KhachHang khachHang) {
        khachHangService.saveOrUpdateKhachHang(khachHang);
        return "redirect:/khachhang/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteKhachHang(@PathVariable("id") int id) {
        khachHangService.deleteKhachHang(id);
        return "redirect:/khachhang/list";
    }
}

