package lapnt.DuAn.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lapnt.DuAn.Models.KhachHang;
import lapnt.DuAn.Repositories.KhachHangRepository;

import java.util.List;

@Service
public class KhachHangService {

    @Autowired
    private KhachHangRepository khachHangRepository;

    // Lấy danh sách khách hàng
    public List<KhachHang> getAllKhachHang() {
        return khachHangRepository.findAll();
    }

    // Lưu khách hàng mới
    public void saveKhachHang(KhachHang khachHang) {
        khachHangRepository.save(khachHang);
    }

    // Lấy khách hàng theo ID
    public KhachHang getKhachHangById(int id) {
        return khachHangRepository.findById(id).orElse(null);
    }

    // Xóa khách hàng
    public void deleteKhachHang(int id) {
        khachHangRepository.deleteById(id);
    }
}


