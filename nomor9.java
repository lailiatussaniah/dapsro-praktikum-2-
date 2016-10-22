package praktikum2;
//Lailiatus Saniah ( 15650057 )
public class nomor9 {
public static void main(String[] args) {
//Deklarasi variabel (input)
		double a=2;double aa=2;
		double pangkata=Math.pow(a,aa);
		double b=4;double bb=2;
		double pangkatb=Math.pow(b, bb);
		double x=1;double xx=2;
		double pangkatx=Math.pow(x, xx);
		double y=3,d=5,c=1,p=2;
		double q=3,qq=2;
		double pangkatq=Math.pow(q, qq);
//proses
		double soal1= ((pangkata+pangkatb)/(pangkatx*y));
		double soal2= (((a*d)-((b*c)/2))/(x*y));
		double soal3= (((p*pangkatq)-(x*y))/(pangkata*b));
//output
		System.out.println("Hasil dari ((a^2+b^2)/(x^2*y)) adalah"+soal1);
		System.out.println("Hasil dari (((a*d)-((b*c)/2))/(x*y)) adalah"+soal2);
		System.out.println("Hasil dari ((p*(q^2))-(x*y))/((a^2)*b) adalah"+soal3);
	}
}