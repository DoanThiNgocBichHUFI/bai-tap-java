
public class bai1_6_bai1_7 {
	static boolean kt_namNhuan(int nam) {
		if(nam % 400 ==0 || (nam %4 ==0 && nam %100 !=0))
			return true;
		return false;
	}
	
	static void kt_ngayHopLe(int d,int m,int y) {
		if(d > 29 && m== 2 && kt_namNhuan(y)== true)
			System.out.println("Ngay ko hop le.");
		else if(d > 28 && m== 2 && kt_namNhuan(y)== false)
			System.out.println("Ngay ko hop le.");
		else if(d > 31 &&( m== 1 || m== 3 || m== 5 || m== 7 || m== 8 || m== 10 || m== 12))
			System.out.println("Ngay ko hop le.");
		else if(d > 30 && (m== 2 || m== 4 || m== 6 || m== 9 || m== 11))
			System.out.println("Ngay ko hop le.");
		else if(m < 1 || m > 12)
			System.out.println("Thang ko hop ly.");
		else if(y < 0)
			System.out.println("Nam ko hop ly.");
		else 
			System.out.println("Ngay hop le.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bai1_6_bai1_7 b= new bai1_6_bai1_7();
		int d,m,y;
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap vao lan luot ngay, thang, nam: ");
		d= sc.nextInt();
		m= sc.nextInt();
		y= sc.nextInt();
		b.kt_ngayHopLe(d, m, y);
	}

}
