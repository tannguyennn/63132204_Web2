package thiGK.ntu63132204.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import thiGK.ntu63132204.models.NhanVien;
@Service
public class NhanVienService {
	static List<NhanVien> dsNV=  new ArrayList<NhanVien>();
	static {
			dsNV.add(new NhanVien("0001", "Nguyễn Tấn Lập",8000));
			dsNV.add(new NhanVien("0002", "Trần Văn Long",5000));
			dsNV.add(new NhanVien("0003", "Trần Văn Nhân",5000));
			dsNV.add(new NhanVien("0004", "Trần Văn Quân",5000));
			dsNV.add(new NhanVien("0005", "Trần Văn Quang",5000));
		 }
	
	public List<NhanVien> getAllNV() {
        return dsNV;
    }

    public NhanVien findNhanVienById(String maNV) {
        for (NhanVien nv : dsNV) {
            if (nv.getMaSoNV().equals(maNV)) {
                return nv;
            }
        }
        return null;
    }

    public void themNV(NhanVien nv) {
    	dsNV.add(nv);
    }
}
