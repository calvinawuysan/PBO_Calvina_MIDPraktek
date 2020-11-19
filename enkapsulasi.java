import java.util.Scanner;
public class enkapsulasi{
	Scanner masukan = new Scanner(System.in);
	private int pilihan1, pilihan2, pilihan3;
	private int jumunit;
	private String nama;
	private int tot, bayar, kembalian;
	private boolean loop = true;
	
public void merek() {
	System.out.print("Masukkan Nama = ");
	nama = masukan.nextLine();
	System.out.println("Merek: ");
	System.out.println("1. Merek G");
	System.out.println("2. Merek O");
}
	
public void tipe1(){
	System.out.println("Tipe: ");
	System.out.println("1. Meja : Rp.95.000");
	System.out.println("2. Kursi : Rp.125.000");
	System.out.println("3. Lemari : Rp.450.000");
	System.out.print("Tipe yang dipilih = ");
	pilihan1 = masukan.nextInt();
	switch(pilihan1) {
					case 1 :   System.out.print("Masukkan jumlah unit pembelian = ");
							   jumunit = masukan.nextInt();
							   tot = jumunit*95000;
							   System.out.println("Total Harga = "+tot);
							   System.out.print("Bayaran Anda = ");
							   bayar = masukan.nextInt();
							   kembalian = bayar - tot;
							   System.out.println();
							   System.out.println("Nama = " +nama); 
							   System.out.println("Total Harga = " +tot); 
							   System.out.println("Bayar = " +bayar); 
							   System.out.println("Kembalian = " +kembalian);
							   loop =  false; break;
					case 2 :   System.out.print("Masukkan jumlah unit pembelian = ");
							   jumunit = masukan.nextInt();
							   tot = jumunit*125000;
							   System.out.println("Total Harga = "+tot);
							   System.out.print("Bayaran Anda = ");
							   bayar = masukan.nextInt();
							   kembalian = bayar - tot; 
							   System.out.println();
							   System.out.println("Nama = " +nama); 
							   System.out.println("Total Harga = " +tot); 
							   System.out.println("Bayar = " +bayar);  
							   System.out.println("Kembalian = " +kembalian);
							   loop =  false; break; 
					case 3 :   System.out.print("Masukkan jumlah unit pembelian = ");
							   jumunit = masukan.nextInt();
							   tot = jumunit*450000;
							   System.out.println("Total Harga = "+tot);
							   System.out.print("Bayaran Anda = ");
							   bayar = masukan.nextInt();
					           kembalian = bayar - tot;
					           System.out.println(); 
							   System.out.println("Nama = " +nama); 
							   System.out.println("Total Harga = " +tot); 
							   System.out.println("Bayar = " +bayar); 
							   System.out.println("Kembalian = " +kembalian); 
							   loop =  false; break;
					default : System.out.println("Tipe yang Anda masukkkan Salah!! Silahkan pilih tipe 1-3");
	}
}

public void tipe2(){
		System.out.println("Tipe: ");
		System.out.println("1. Meja : Rp.115.000");
		System.out.println("2. Kursi : Rp.135.000");
		System.out.println("3. Lemari : Rp.550.000");
		System.out.print("Tipe yang dipilih = ");
		pilihan3 = masukan.nextInt();
		switch(pilihan3) {
					case 1 :   System.out.print("Masukkan jumlah unit pembelian = ");
							   jumunit = masukan.nextInt();
							   tot = jumunit*115000;
							   System.out.println("Total Harga = "+tot);
							   System.out.print("Bayaran Anda = ");
							   bayar = masukan.nextInt();
							   kembalian = bayar - tot;
							   System.out.println();
							   System.out.println("Nama = " +nama); 
							   System.out.println("Total Harga = " +tot); 
							   System.out.println("Bayar = " +bayar); 
							   System.out.println("Kembalian = " +kembalian);
							   loop =  false; break;
					case 2 :   System.out.print("Masukkan jumlah unit pembelian = ");
							   jumunit = masukan.nextInt();
							   tot = jumunit*135000;
							   System.out.println("Total Harga = "+tot);
							   System.out.print("Bayaran Anda = ");
							   bayar = masukan.nextInt();
							   kembalian = bayar - tot; 
							   System.out.println();
							   System.out.println("Nama = " +nama); 
							   System.out.println("Total Harga = " +tot); 
							   System.out.println("Bayar = " +bayar);  
							   System.out.println("Kembalian = " +kembalian); 
							   loop =  false; break;
					case 3 :   System.out.print("Masukkan jumlah unit pembelian = ");
							   jumunit = masukan.nextInt();
							   tot = jumunit*550000;
							   System.out.println("Total Harga = "+tot);
							   System.out.print("Bayaran Anda = ");
							   bayar = masukan.nextInt();
					           kembalian = bayar - tot;
					           System.out.println(); 
							   System.out.println("Nama = " +nama); 
							   System.out.println("Total Harga = " +tot); 
							   System.out.println("Bayar = " +bayar); 
							   System.out.println("Kembalian = " +kembalian); 
							   loop =  false; break;
							   
					default : System.out.println("Tipe yang Anda masukkkan Salah!! Silahkan pilih tipe 1-3"); break;
	}
}
	
public static void main (String[] args) throws Exception {
	enkapsulasi A = new enkapsulasi();
	Scanner masukan = new Scanner(System.in);
	boolean loop = true;
	A.merek();
	System.out.print("Merek yang dipilih = ");
	int pilihan2 = masukan.nextInt();
	while(loop) {
	if (pilihan2 == 1) {
		A.tipe1();
		}
	else
	if (pilihan2 == 2) {
		A.tipe2();
		}
	else {
		System.out.println("Merek yang anda masukan salah! Masukkan merek yang benar!");
	}
	break;	
	}
}	
}