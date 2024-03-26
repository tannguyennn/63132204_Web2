package thiGK.ntu63132204.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thiGK.ntu63132204.models.NhanVien;

@Service
public class NhanVien_getAll {
	@Autowired
    private NhanVienService nvs;

    public List<NhanVien> getAllData() {
        return nvs.getAllNV();
    }
}
