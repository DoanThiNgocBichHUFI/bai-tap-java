package buoi2;

import java.util.Scanner;

public class bai1_22 {
	Scanner sc= new Scanner(System.in);
	public void process() {
		int[] arr= new int[500];
		bai1_22 a= new bai1_22();
		int so,n;
		do {
			System.out.println("____________menu___________");
			System.out.println("1.Nhap gia tri cho n phan tu (nhap tu ban phim).");
			System.out.println("2. Phat sinh gia tri ngau nhien tu 199 den -199.");
			System.out.println("3. Xuat mang ra man hinh");
			System.out.println("4. Liet ke cac pt am cua mang.");
			System.out.println("5. Liet ke cac pt la so nguyen to.");
			System.out.println("6. Tinh trung binh cong cac pt duong.");
			System.out.println("7. Kiem tra mang có là toàn là so nguyen to.");
			System.out.println("8. Kiem tra mang có tăng dần hay ko.");
			System.out.println("9. Tim pt lon nhat trong mang.");
			System.out.println("10. Tim pt nho nhat trong mang.");
			System.out.println("11. Tim so am lon nhat trong mang.");
			System.out.println("12. Dao nguoc mang.");
			
			System.out.println("Nhap so cua chuc nang ban can: ");
			so= sc.nextInt();
			System.out.println("Nhap so lg pt: ");
			 n= sc.nextInt();
			switch(so) {
				case 1:
					
					a.nhapMang(arr, n);
					System.out.println("Cac pt ma ban da nhap: ");
					a.xuatMang(arr, n);
					break;
				case 2: 
					a.mangNgauNhien(arr,n);
					System.out.println("Cac pt cua mang ngau nhien: \n");
					a.xuatMang(arr,n);
					break;
				case 3:
					System.out.println("Cac pt cua mang la: ");
					a.xuatMang_(arr);
					break;
				case 4:
					System.out.println("Xuat cac pt am");
					a.xuatPTAm(arr);
					break;
				case 5:
					System.out.println("Xuat cac pt la so nguyen to.");
					a.xuat_SNT(arr);
					break;
				case 6:
					a.tbc_PtDuong(arr);
					break;
				case 7:
					if(a.kt_toanSNT(arr)== true) {
						System.out.println("Mang toan la so nguyen to.");
					}
					else {
						System.out.println("Mang KHONG toan la so nguyen to.");
					}
					break;
				case 8:
					if(a.kt_tangDan(arr)== true) {
						System.out.println("Mang la mang tang dan.");
					}
					else {
						System.out.println("Mang KHONG la mang tang dan.");
					}
					break;
				case 9:
					System.out.println("Pt lon nhat trong mang " +a.timMax(arr));
					break;
				case 10:
					System.out.println("Pt nho nhat trong mang " +a.timMin(arr));
					break;
				case 11:
					System.out.println("Pt am lon nhat la: " + a.timAm_Max(arr));
					break;
				case 12:
					System.out.println("Mang truoc khi dao nguoc: ");
					a.xuatMang_(arr);
					
					a.daoNguocMang(arr, n);
					System.out.println("Mang sau khi dao nguoc");
					a.xuatMang_(arr);
					break;
			}
			
		}while(so !=0 );
		System.out.println("");
	}
	public void nhapMang(int[] a,int n) {
		System.out.println("Nhap so pt cua mang: ");
		n= sc.nextInt();
		for(int i= 0; i< n; i++) {
			System.out.println("Nhap pt a[+i+]=");
			a[i]= sc.nextInt();
		}
	}
	public void xuatMang_(int[]a) {
		System.out.println("so pt cua mang: "+a.length);
		for(int pt:a) {
			System.out.println(pt);
		}
	}
	public void xuatMang(int[] a,int n) {
		System.out.println("so pt cua mang: "+ n);
		for(int i=0; i< n; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
	}
	public void mangNgauNhien(int[]a,int n) {
		int min = -199; // giá trị nhỏ nhất của mảng
		int max = 199; // giá trị lớn nhất của mảng
//		int n = 10; // số lượng phần tử của mảng
//		if(n > a.length) n= a.length; //kiểm tra kích thước của mảng 
		int i=0;
		while(i < n) {
			int randInt = min + (int)(Math.random() * (max - min + 1)); // tính giá trị ngẫu nhiên
			a[i]= randInt;
			i++;
		}
	}
	public void xuatPTAm(int[]a) {
		for(int x: a) { // duyệt qua các pt trong manng a
			if( x< 0) {
				System.out.print(x+" ");
			}
		}
		System.out.println("");
	}
	public boolean kt_SNT(int n) {
		int i=2;
		while(i <= Math.sqrt(n)) {
			if(n %i ==0)
				return false;
		}
		return true;
	}
	public void xuat_SNT(int[]a) {
		for(int x: a) {
			if(kt_SNT(x)== true) {
				System.out.println(x+" ");
			}
		}
		System.out.println("");
	}
	public float tbc_PtDuong(int[] a) {
		int count=0;
		float kq= 0;
		for(int x: a) {
			if(x > 0) {
				kq += x;
				count++;
			}
		}
		return kq/count;
	}
	public boolean kt_toanSNT(int[] a) {
		for(int x: a) {
			if(kt_SNT(x) ==true)
				return false;
		}
		return true;
	}
	public boolean kt_tangDan(int[] a) {
		for(int i=0; i< a.length; i++) {
			for(int j=1; j <a.length; j++) {
				if(a[i] > a[j]) {
					return false;
				}
			}
		}
		return true;
	}
	public int timMax(int[]a ) {
		int max= a[0];
		for(int x: a) {
			if(x > max)
				max= x;
		}
		return max;
	}
	public int timMin(int[]a ) {
		int min= a[0];
		for(int x: a) {
			if(x < min)
				min= x;
		}
		return min;
	}
	public int timAm_Max(int[] a) {
		int max= a[0];
		for(int x: a) {
			if(x > max && x < 0)
				max= x;
		}
		return max;
	}
	public void daoNguocMang(int[] a,int n)
	{
		for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc= new Scanner(System.in);
//		int[] arr= new int[500];
		bai1_22 a= new bai1_22();
		// xuat mang ngau nhien
		a.process();
	}
}
