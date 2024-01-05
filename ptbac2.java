package chg1;

import java.util.Scanner;

public class ptbac2{
  public static void bac2(int a,int b,int c) {
		int denta=0;
		denta= b*b-4*a*c;
		if(denta == 0)
		{
			System.out.println("\npt có nghiệm kép: x1=x2= " + (-b)/(2*a));
		}
		else if(denta < 0)
		{
			System.out.println("\npt vô nghiệm");
		}
		else {
			System.out.println("\npt có 2 nghiệm.");
			System.out.println("\nx1= "+ (-b+ Math.sqrt((double)denta))/(2*a) );
			System.out.println("\nx1= "+ (-b- Math.sqrt((double)denta))/(2*a) );
		}
	}
  public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Nhập a: ");
		int a= input.nextInt();
		System.out.print("\nsố a: " + a);
		
		System.out.print("\nNhập b: ");
		int b= input.nextInt();
		System.out.print("\nsố b: " + b);
		
		System.out.print("\nNhập c: ");
		int c= input.nextInt();
		System.out.print("\nsố c: " + c);
		bac2(a,b,c);
	}
}
