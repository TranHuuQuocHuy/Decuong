package basic.dev;

import java.util.Scanner;
import java.lang.*;

public class MainApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float a, b, c, p, s, v;
		System.out.println("nhap canh a: ");
		a = sc.nextFloat();
		System.out.println("nhap canh b: ");
		b = sc.nextFloat();
		System.out.println("nhap canh c: ");
		c = sc.nextFloat();
		v = a + b + c;
		System.out.println("chu vi cua tam giac la: " + v);
		p = (a + b + c) / 2;
		s = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println("dien tich cua tam giac la: " + s);
	}

}
