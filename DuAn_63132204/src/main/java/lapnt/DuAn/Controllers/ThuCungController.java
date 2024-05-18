package lapnt.DuAn.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import lapnt.DuAn.Models.KhachHang;
import lapnt.DuAn.Models.ThuCung;
import lapnt.DuAn.Services.KhachHangService;
import lapnt.DuAn.Services.ThuCungService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThuCungController {

    @Autowired
    private ThuCungService thuCungService;
    @Autowired
    private KhachHangService khachHangService;
    
    // Hiển thị danh sách thú cưng
    @GetMapping("/thucung")
    public String listThuCung(Model model) {
        List<ThuCung> listThuCung = thuCungService.getAllThuCung();
        model.addAttribute("listThuCung", listThuCung);
        return "list_thucung";
    }
 // Hiển thị danh sách thú cưng
    @GetMapping("/thucung/{id}")
    public String listThuCungByID(@PathVariable("id") int id,Model model) {
        List<ThuCung> listThuCung = thuCungService.getAllThuCung();
        List<ThuCung> lsTC = new ArrayList<ThuCung>();
        for( ThuCung tc: listThuCung)
        	if(tc.getKhachHang().getIdkh() == id)
        		lsTC.add(tc);
        model.addAttribute("listThuCung", lsTC);
        return "list_thucung_kh";
    }

    @GetMapping("/thucung/add/{id}")
    public String addThuCungForm(@PathVariable("id") int id,Model model) {
        ThuCung thucung = new ThuCung();
        model.addAttribute("thucung", thucung);
        
        KhachHang kh = khachHangService.getKhachHangById(id);
        model.addAttribute("khachhang", kh);
        
        return "add_thucung";
    }
    // Form thêm/sửa thú cưng
    @PostMapping("/thucung/save")
    public String saveThuCung(@ModelAttribute("thuCung") ThuCung thuCung) {
        thuCungService.saveThuCung(thuCung);
        return "redirect:/thucung";
    }

    // Form sửa thú cưng
    @GetMapping("/thucung/edit/{id}")
    public String editThuCungForm(@PathVariable("id") int id, Model model) {
        ThuCung thuCung = thuCungService.getThuCungById(id);
        model.addAttribute("thucung", thuCung);
        
        List<KhachHang> lsKH = khachHangService.getAllKhachHang();
        model.addAttribute("listkhachhang", lsKH);
        
        return "edit_thucung";
    }

    // Xóa thú cưng
    @GetMapping("/thucung/delete/{id}")
    public String deleteThuCung(@PathVariable("id") int id) {
        thuCungService.deleteThuCung(id);
        return "redirect:/thucung";
    }
}
