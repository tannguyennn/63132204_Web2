package lapnt.DuAn.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import lapnt.DuAn.Models.HoaDon;
import lapnt.DuAn.Services.HoaDonService;

import java.util.List;

@Controller
public class HoaDonController {

    @Autowired
    private HoaDonService hoaDonService;

    // Hiển thị danh sách hóa đơn
    @GetMapping("/hoadon")
    public String listHoaDon(Model model) {
        List<HoaDon> listHoaDon = hoaDonService.getAllHoaDon();
        model.addAttribute("listHoaDon", listHoaDon);
        return "list_hoadon";
    }

    // Form thêm/sửa hóa đơn
    @PostMapping("/hoadon/save")
    public String saveHoaDon(@ModelAttribute("hoaDon") HoaDon hoaDon) {
        hoaDonService.saveHoaDon(hoaDon);
        return "redirect:/hoadon";
    }

    // Form sửa hóa đơn
    @GetMapping("/hoadon/edit/{id}")
    public String editHoaDonForm(@PathVariable("id") int id, Model model) {
        HoaDon hoaDon = hoaDonService.getHoaDonById(id);
        model.addAttribute("hoaDon", hoaDon);
        return "edit_hoadon";
    }

    // Xóa hóa đơn
    @GetMapping("/hoadon/delete/{id}")
    public String deleteHoaDon(@PathVariable("id") int id) {
        hoaDonService.deleteHoaDon(id);
        return "redirect:/hoadon";
    }
}

