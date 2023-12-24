package basic.dev;

import java.util.Scanner;

public class MainApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap diem trung binh cua sinh vien: ");
		float dtb = sc.nextFloat();
		if (dtb >= 8) {
			System.out.println("sinh vien loai gioi");
		} else if (6.5 <= dtb && dtb < 8) {
			System.out.println("sinh vien loai kha");
		} else if (dtb < 6.5) {
			System.out.println("sinh vien loai trung binh");
		}
	}
}
