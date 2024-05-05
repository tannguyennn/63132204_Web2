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

