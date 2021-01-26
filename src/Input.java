
import java.util.ArrayList;

public class Input {

	private static ArrayList<MonAn> monAns = new ArrayList<MonAn>();
	private static ArrayList<ChiTietHD> cTHDs = new ArrayList<ChiTietHD>();
	
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

	public static void Input() {
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
		
		
	}
}

