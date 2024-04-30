package lapnt.DuAn_CuoiKy.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lapnt.DuAn_CuoiKy.Models.KhachHang;
import lapnt.DuAn_CuoiKy.Repositories.KhachHangRepository;

import java.util.List;

@Service
public class KhachHangServiceImpl implements KhachHangService {
    
    @Autowired
    private KhachHangRepository khachHangRepository;

    @Override
    public List<KhachHang> getAllKhachHang() {
        return khachHangRepository.findAll();
    }

    @Override
    public KhachHang getKhachHangById(int id) {
        return khachHangRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteKhachHang(int id) {
        khachHangRepository.deleteById(id);
    }

	@Override
	public KhachHang saveOrUpdateKhachHang(KhachHang khachHang) {
		return khachHangRepository.save(khachHang);
	}
}
