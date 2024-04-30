package lapnt.DuAn_CuoiKy.Services;

import java.util.List;

import lapnt.DuAn_CuoiKy.Models.KhachHang;

public interface KhachHangService {
    List<KhachHang> getAllKhachHang();
    KhachHang getKhachHangById(int id);
    KhachHang saveOrUpdateKhachHang(KhachHang khachHang);
    void deleteKhachHang(int id);
}

