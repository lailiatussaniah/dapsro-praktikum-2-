package praktikum2;
//Lailiatus Saniah ( 15650057 )
public class cobs {
	//Math.pow = untuk pangkat misal Math.pow(2,4)=16
	//Math.sqrt = untuk akar misal Math.sqrt(16)=4
	//jika 11 pangkat 2 akar 3, gunakan saja Math.pow menjadi 11 pangkat 2/3
	public static void main(String[] args) {
		double a=2;
		double apangkat=Math.pow(a,2);
		double b=4;
		double bpangkat=Math.pow(b, 2);
		double c=1,d=5;
		double x=1;
		double xpangkat=Math.pow(x, 2);
		double y=3,p=2;
		double q=3;
		double qpangkat=Math.pow(q, 2);
		double nilai1=((apangkat+bpangkat)/(xpangkat*y));
		double nilai2=(((a*d)-(b*c)/2)/(x*y));
		double nilai3=((p*qpangkat)-(x*y))/(apangkat*b);
		double nilai4=(((a+b)/(a-b))-(p*q));
		double nilai5=((a+(b/p))/(a*b)-q);
		double nilai6=((a+(b/p))/a)*(b-q);
		
		System.out.println("((a+b)/(a-b)-p*q) adalah "+nilai4);
		System.out.println("(((a+(b/p)/a*b)-q)adalah "+nilai5); // untuk memanggil nilai gunakan +
		System.out.println("((a+(b/p))/a)*(b-q)adalah "+nilai6);
		System.out.println("\n");
		System.out.println("Nilai dari ((a^2+b^2)/(x^2*y)) adalah "+nilai1);
		System.out.println("Nilai dari (((a*d)-((b*c)/2))/(x*y)) adalah "+nilai2);
		System.out.println("Nilai dari ((p*(q^2))-(x*y))/((a^2)*b) adalah "+nilai3);
	}
}