package lapnt.DuAn.Services;

import java.util.List;
import java.util.Optional;

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
		Optional<KhachHang> opt = kHRepo.findById(maKH);
		if (opt.isPresent()) return opt.get();
		else return null;
	}

	@Override
	public void addKhachHang(KhachHang kh) {
		kHRepo.save(kh);
		
	}

	@Override
	public void deleteKhachHang(String maKH) {
		kHRepo.deleteById(maKH);
		
	}

}
