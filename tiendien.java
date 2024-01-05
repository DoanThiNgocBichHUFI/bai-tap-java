package chg1;

import java.util.Scanner;

public class tiendien
{
  public static void tienDien(int luongdienTT) {
		int ttien= 0;
		int bac1= 1806, bac2=1866, bac3=2167, bac4=2729, bac5=3050;
		if(luongdienTT <= 50)
		{
			ttien= bac1 *luongdienTT;
			System.out.println("\n Tiền điện:" + ttien);
		}
		else if(luongdienTT <= 100)
		{
			ttien= bac1 *50 + bac2*(luongdienTT -50);
			System.out.println("\n Tiền điện:" + ttien);
		}
		else if(luongdienTT <= 200)
		{
			ttien= bac1 *50 + bac2*50 + bac3*(luongdienTT-100);
			System.out.println("\n Tiền điện:" + ttien);
		}
		else if(luongdienTT <= 300)
		{
			ttien= bac1 *50 + bac2*50 + bac3*50 + bac4*(luongdienTT-200);
			System.out.println("\n Tiền điện:" + ttien);
		}
		else 
		{
			ttien= bac1 *50 + bac2*50 + bac3*50 + bac4* 50 + bac5*(luongdienTT-300);
			System.out.println("\n Tiền điện:" + ttien);
		}
	}

  // nhập vào chỉ số mới, chỉ số cũ,đảm bảo chỉ số cũ <= chỉ số mới , sau đó tính tiền điện phải trả trong tháng theo các bậc 
  // bậc 1: kWh từ 0 đến 50: 1480 vnd/kw;
  // bậc 2: kWh từ 51 đến 100: 1533 vnd/kw;
  // bậc 3: kWh từ 101 đến 200: 1786 vnd/kw;
  // bậc 4: kWh từ 201 đến 300: 2242 vnd/kw;
  // bậc 5: kWh từ 301 trở lên: 2503 vnd/kw;
  
  public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Nhập chỉ số điện cũ: ");
		int csCu= input.nextInt();
		System.out.print("\nchỉ số điện cũ: " + csCu);
		
		System.out.println("\nNhập chỉ số điện mới: ");
		int csMoi= input.nextInt();
		System.out.print("\nchỉ số điện mới: " + csMoi);
		int luongdientieuthu= 0;
		luongdientieuthu=  csMoi-csCu;
		System.out.print("\nTổng lượng điện tiêu thụ: " + luongdientieuthu);
		tienDien(luongdientieuthu);
	}
}
