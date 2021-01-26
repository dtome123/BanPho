public class Ban {
	int id;
	int soCho;
	boolean tinhTrang;

	public Ban() {

	}

	public Ban(int id, int soCho, boolean tinhTrang) {
		this.id = id;
		this.soCho = soCho;
		this.tinhTrang = tinhTrang;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSoCho() {
		return soCho;
	}

	public void setSoCho(int soCho) {
		this.soCho = soCho;
	}

	public boolean isTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

}