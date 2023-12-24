package basic.dev;

import java.util.Scanner;

public class MainApp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, songuyenchan = 0, songuyenle = 0;
		System.out.println("nhap a: ");
		a = sc.nextInt();
		System.out.println("nhap b: ");
		b = sc.nextInt();
		System.out.println("nhap c: ");
		c = sc.nextInt();
		System.out.println("nhap d: ");
		d = sc.nextInt();
		if (a % 2 == 0) {
			songuyenchan++;
		} else {
			songuyenle++;
		}
		if (b % 2 == 0) {
			songuyenchan++;
		} else {
			songuyenle++;

		}
		if (c % 2 == 0) {
			songuyenchan++;
		} else {
			songuyenle++;

		}
		if (d % 2 == 0) {
			songuyenchan++;
		} else {
			songuyenle++;
		}
		System.out.println("co " + songuyenchan + " so nguyen chan");
		System.out.println("co " + songuyenle + " so nguyen le");
	}
}
