package lapnt.DuAn.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import lapnt.DuAn.Models.KhachHang;

@Service
public interface KhachHangService {

	public List<KhachHang> getAllKhachHang();
	public KhachHang getKhachHangById(String maKH);
}
