package lapnt.DuAn.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lapnt.DuAn.Models.KhachHang;
import lapnt.DuAn.Repositories.KhachHangRepository;

@Service
public class KhachHangServiceImpl implements KhachHangService {

	@Autowired KhachHangRepository kHRepo;
	@Override
	public List<KhachHang> getAllKhachHang() {
		return kHRepo.findAll();
	}

	@Override
	public KhachHang getKhachHangById(String maKH) {
		return kHRepo.getById(maKH);
	}

}
