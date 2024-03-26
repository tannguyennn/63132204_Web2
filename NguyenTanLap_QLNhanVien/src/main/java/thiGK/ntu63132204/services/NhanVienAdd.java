package thiGK.ntu63132204.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thiGK.ntu63132204.models.NhanVien;

@Service
public class NhanVienAdd {
	@Autowired
	private NhanVienService nvs;

    public void themNV(NhanVien nv) {
    	nvs.themNV(nv);
    }
}
