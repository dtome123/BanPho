
import java.util.Date;

public class HoaDon {
	int id;
	int soBan;
	Date ngay;
	double thanhTien;
	int id_NV;

	public HoaDon() {

	}

	public HoaDon(int id, int soBan, Date ngay, double thanhTien, int id_NV) {
		this.id = id;
		this.soBan = soBan;
		this.ngay = ngay;
		this.thanhTien = thanhTien;
		this.id_NV = id_NV;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSoBan() {
		return soBan;
	}

	public void setSoBan(int soBan) {
		this.soBan = soBan;
	}

	public Date getNgay() {
		return ngay;
	}

	public void setNgay(Date ngay) {
		this.ngay = ngay;
	}

	public double getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}

	public int getId_NV() {
		return id_NV;
	}

	public void setId_NV(int id_NV) {
		this.id_NV = id_NV;
	}

}
