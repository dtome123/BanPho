
public class MonAn {
	public int Id;
	public String Ten;
	public String Loai;
	public String ChuThich;
	public int Gia;
	public MonAn() {}
	public MonAn(int id, String ten, String loai, String chuThich, int gia) {
		Id = id;
		Ten = ten;
		Loai = loai;
		ChuThich = chuThich;
		Gia = gia;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public String getLoai() {
		return Loai;
	}
	public void setLoai(String loai) {
		Loai = loai;
	}
	public String getChuThich() {
		return ChuThich;
	}
	public void setChuThich(String chuThich) {
		ChuThich = chuThich;
	}
	public int getGia() {
		return Gia;
	}
	public void setGia(int gia) {
		Gia = gia;
	}
	
	

}
