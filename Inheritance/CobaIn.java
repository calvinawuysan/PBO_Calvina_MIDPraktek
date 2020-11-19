public class CobaIn{
public static void main (String[] args) {
	A supobj = new A();
	B subobj = new B();

	supobj.tampil();
	subobj.tampil1();
	System.out.println();
	System.out.println("Nama = " +supobj.nama); 
	System.out.println("Total harga = " +subobj.tot);
	System.out.println("Bayar = " +subobj.bayar); 
	System.out.println("Kembalian = " +subobj.kembalian);
	
}
}