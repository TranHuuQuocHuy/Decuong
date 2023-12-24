package basic.dev;

import java.util.Scanner;

public class MainApp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số chữ điện tiêu thụ của hộ gia đình trong 1 tháng:");
		int soChu = sc.nextInt();

		// Tính tiền điện
		double tienDien = 0;
		if (soChu <= 100) {
			tienDien = soChu * 1800;
		} else if (soChu <= 200) {
			tienDien = 100 * 1800 + (soChu - 100) * 2500;
		} else {
			tienDien = 100 * 1800 + 100 * 2500 + (soChu - 200) * 3000;
		}

		// Hiển thị số tiền điện
		System.out.println("Số tiền điện phải trả là: " + tienDien);
	}
}
