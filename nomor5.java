package praktikum2;
//Lailiatus Saniah ( 15650057 )
public class nomor5 {

	public static void main(String[] args) {
	double gaji_kotor=(1000*9600); //gaji awal
	double pajak=(gaji_kotor*10/100); //pajak
	double gaji_bersih=(gaji_kotor-pajak); //gaji yang diterima
	
	System.out.println("Gaji Kotor = Rp. "+gaji_kotor);
	System.out.println("Potongan = Rp. "+pajak);
	System.out.println("Gaji Bersih = Rp. "+gaji_bersih);
	}

}
