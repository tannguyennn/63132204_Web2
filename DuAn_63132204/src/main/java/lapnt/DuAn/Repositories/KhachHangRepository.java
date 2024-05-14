package lapnt.DuAn.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lapnt.DuAn.Models.KhachHang;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang, Integer> {
	List<KhachHang> findByHotenkhContaining(String hotenkh);
}

