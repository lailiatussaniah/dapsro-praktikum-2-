package praktikum2;
//Lailiatus Saniah ( 15650057 )
public class tujuh {
	//Math.pow = untuk pangkat misal Math.pow(2,4)=16
	//Math.sqrt = untuk akar misal Math.sqrt(16)=4
	public static void main(String[] args) {
//input
		double akar=Math.sqrt(11);
		double a=(4+akar);
		double b=(4-akar);
//proses
		double nilai1=(2*a+2*b);
		double nilai2=(2*a-2*b);
//output
		System.out.println("nilai dari (2a+2b) adalah " +nilai1);
		System.out.println("nilai dari (2a-2b) adalah " +nilai2);
	}
}
