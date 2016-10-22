package praktikum2;
//Lailiatus Saniah ( 15650057 )
public class nomor4
{
	public static void main(String[] args)
	{
		int a=23;
		int b=45;
		int c=6;
		int d=-45;
		int e=-2;
		int rata1=(int) ((a+b+c+d+e)/5); 
		double rata2=(double) ((a+b+c+d+e)/5); // konfersi dari int ke double
		
		System.out.println("( interger ) Rata-rata dari bilangan 23 + 45 + 6 + (-45) + (-2) = "+rata1);
		System.out.println("( Double ) Rata-rata dari bilangan 23 + 45 + 6 + (-45) + (-2) = "+rata2);
	}
}
