package BanPho;

import java.text.ParseException;
import java.util.ArrayList;

public class ThongKe {
	public static void tinhTrangBan() throws ParseException {
		Input.Input();
		Ban b = new Ban();
		ArrayList<Ban> l = Input.getBan();
		for (Ban i :  l) {
			System.out.println(i.id+":"+i.tinhTrang);
		}
	}
	
	public static void main(String[] args) throws ParseException {
		tinhTrangBan();
	}
}
