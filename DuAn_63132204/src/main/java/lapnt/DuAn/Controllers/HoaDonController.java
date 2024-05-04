package lapnt.DuAn.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import lapnt.DuAn.Models.HoaDon;
import lapnt.DuAn.Services.HoaDonService;
import java.time.LocalDate;
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
    
    @GetMapping("/thongke")
    public String getInvoices(@RequestParam(name = "start-date", required = false)
                                  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
                              @RequestParam(name = "end-date", required = false)
                                  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate,
                              Model model) {
        List<HoaDon> hoadon;

        if (startDate != null && endDate != null) {
            hoadon = hoaDonService.getHoaDonByDateRange(startDate, endDate);
        } else {
            hoadon = hoaDonService.getAllHoaDon();
        }

        double tongTienHD=0;
        for (HoaDon hd : hoadon) {
        	tongTienHD = tongTienHD + hd.getTonghd();
        }
        int tongSLHD = hoaDonService.countTongHD(hoadon);

        model.addAttribute("hoaDons", hoadon);
        model.addAttribute("tongTien", tongTienHD);
        model.addAttribute("tongSL", tongSLHD);

        return "thongke";
    }
}

