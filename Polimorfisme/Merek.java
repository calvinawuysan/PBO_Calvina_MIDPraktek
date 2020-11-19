import java.util.Scanner;
class Merek {

	Scanner masukan = new Scanner(System.in);
	int pilihan1, pilihan2, pilihan3;
	int jumunit;
	String nama;
	int tot, bayar, kembalian;
	boolean loop = true;
	
	void tampil() {
	System.out.print("Masukkan Nama = ");
	nama = masukan.nextLine();
	System.out.println("Merek: ");
	System.out.println("1. Merek G");
	System.out.println("2. Merek O");
	}
}