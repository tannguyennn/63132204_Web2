package thiGK.ntu63132204.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thiGK.ntu63132204.models.NhanVien;
@Service
public class NhanVienSearch {
	@Autowired
	private NhanVienService nvs;

    public NhanVien findNhanVienById(String maNV) {
    	return nvs.findNhanVienById(maNV);
    }
}
