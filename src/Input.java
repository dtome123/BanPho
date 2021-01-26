
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;



public class Input {

	private static ArrayList<MonAn> monAns = new ArrayList<MonAn>();
	private static ArrayList<ChiTietHD> cTHDs = new ArrayList<ChiTietHD>();
	private static ArrayList<NhanVien> nv = new ArrayList<>();
	private static ArrayList<Ban> ban = new ArrayList<>();
	private static ArrayList<HoaDon> hd = new ArrayList<>();

	public static ArrayList<MonAn> getMonAns() {
		return monAns;
	}

	public static void setMonAns(ArrayList<MonAn> monAns) {
		Input.monAns = monAns;
	}

	public static ArrayList<ChiTietHD> getcTHDs() {
		return cTHDs;
	}

	public static void setcTHDs(ArrayList<ChiTietHD> cTHDs) {
		Input.cTHDs = cTHDs;
	}

	public static ArrayList<NhanVien> getNv() {
		return nv;
	}


	public static void setNv(ArrayList<NhanVien> nv) {
		Input.nv = nv;
	}


	public static ArrayList<Ban> getBan() {
		return ban;
	}


	public static void setBan(ArrayList<Ban> ban) {
		Input.ban = ban;
	}


	public static void Input() throws ParseException {
		monAns.add(new MonAn(1,"Phở tô nhỏ","Món chính","",50000));
		monAns.add(new MonAn(2,"Phở tô lớn","Món chính","",50000));
		monAns.add(new MonAn(3,"Phở đặc biệt","Món chính","",50000));
		monAns.add(new MonAn(4,"Quẩy","Món phụ","",5000));
		monAns.add(new MonAn(5,"Tiết","Món phụ","",5000));
		monAns.add(new MonAn(6,"Tiết hột gà","Món phụ","",15000));
		monAns.add(new MonAn(6,"Thịt thêm","Món phụ","",15000));	
		
		cTHDs.add(new ChiTietHD(1, 1, 1, 50000));
		cTHDs.add(new ChiTietHD(1, 2, 1, 50000));
		cTHDs.add(new ChiTietHD(2, 1, 1, 50000));
		
		nv.add(new NhanVien(1, "Nguyễn Văn A", new SimpleDateFormat("dd/MM/yyyy").parse("11/1/2021"), false,
				"Nhân viên bán hàng"));
		nv.add(new NhanVien(2, "Nguyễn Văn B", new SimpleDateFormat("dd/MM/yyyy").parse("10/1/2021"), true,
				"Nhân viên bán hàng"));

		for (int i = 1; i <= 5; i++) {
			ban.add(new Ban( i, 5, false));
		}
		for (int i = 6; i <= 10; i++) {
			ban.add(new Ban( i, 10, false));
		}
		
		hd.add(new HoaDon(1, 1, new SimpleDateFormat("dd/MM/yyyy").parse("5/1/2021"), 250000, 1));
		hd.add(new HoaDon(1, 6, new SimpleDateFormat("dd/MM/yyyy").parse("5/1/2021"), 350000, 2));
	}
}

