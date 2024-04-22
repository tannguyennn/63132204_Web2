package lapnt.DuAn.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lapnt.DuAn.Models.KhachHang;
import lapnt.DuAn.Services.KhachHangService;

@RestController
public class KhachHangController {
	@Autowired KhachHangService kHService;
	@GetMapping("/dsKH")
	public List<KhachHang> getAllKhachHang()
	{
		return kHService.getAllKhachHang();
	}
}
