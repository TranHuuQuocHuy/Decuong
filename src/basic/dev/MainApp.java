package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("nhap a = ");
		a = sc.nextInt();
		System.out.println("nhap b = ");
		b = sc.nextInt();
		System.out.println("nhap c =");
		c = sc.nextInt();
		if ((a + b > c) || (a + c > b) || (b + c > a)) {
			System.out.println("a, b, c là 3 canh cua tam giac");
		} else {
			System.out.println("a, b, c khong phai la 3 canh cua tam giac");
		}
	}

}