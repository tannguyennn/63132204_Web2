package thiGK.ntu63132204.models;

public class NhanVien {
	private String maSoNV;
	private String hoVaTen;
	private int luong;
	public String getMaSoNV() {
		return maSoNV;
	}
	public void setMaSoNV(String maSoNV) {
		this.maSoNV = maSoNV;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	}
	
	public NhanVien() {
		super();
	}
	public NhanVien(String maSoNV, String hoVaTen, int luong) {
		this.maSoNV = maSoNV;
		this.hoVaTen = hoVaTen;
		this.luong = luong;
	}
}
