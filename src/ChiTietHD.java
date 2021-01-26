
public class ChiTietHD {
	public int Id_HD;
	public int Id_MA;
	public int SoLuong;
	public int Gia;
	
	public ChiTietHD() {}
	public ChiTietHD(int id_HD, int id_MA, int soLuong, int gia) {
		Id_HD = id_HD;
		Id_MA = id_MA;
		SoLuong = soLuong;
		Gia = gia;
	}
	public int getId_HD() {
		return Id_HD;
	}
	public void setId_HD(int id_HD) {
		Id_HD = id_HD;
	}
	public int getId_MA() {
		return Id_MA;
	}
	public void setId_MA(int id_MA) {
		Id_MA = id_MA;
	}
	public int getSoLuong() {
		return SoLuong;
	}
	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}
	public int getGia() {
		return Gia;
	}
	public void setGia(int gia) {
		Gia = gia;
	}
	
	
}
