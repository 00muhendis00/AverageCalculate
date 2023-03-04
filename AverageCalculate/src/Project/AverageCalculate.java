package Project;
import java.util.Scanner;
public class AverageCalculate {
	public static void main(String[] args) {
		int Matematik,Fizik,Turkce,Kimya,Muzik;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik Notunu Giriniz ");
		Matematik = input.nextInt();
		
		System.out.print("Fizik notunu giriniz ");
		Fizik = input.nextInt();
		
		System.out.print("Türkçe notunu giriniz ");
		Turkce = input.nextInt();
		
		System.out.print("Kimya notunu giriniz ");
		Kimya = input.nextInt();
		
		System.out.print("Müzik notunu giriniz ");
		Muzik = input.nextInt();
		
		if((0<Matematik<<100) && (0<Turkce<<100) && (0<Fizik<<100) && (0<Kimya<<100) && (0<Muzik<<100))
		{
			double average = (Matematik + Fizik + Turkce + Kimya + Muzik)/5;
			System.out.print("Ortalama " + average);
			if(average > 55)
			{
				System.out.print("Geçtiniz.Tebrikler!!");
			}
			else {
				System.out.print("Daha çok çalışmalısınız!");
			}
		}
		else {
			System.out.print("Hatalı Giriş");
		}
	}
}
