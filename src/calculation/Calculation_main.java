package calculation;

import java.util.Scanner;

public class Calculation_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("input Number m >");
		Object integer;
		int m = Integer.parseInt(scan.next());
		
		System.out.print("input number n >");
		int n = Integer.parseInt(scan.next());
		
		Calculation_lib clib = new Calculation_lib(m,n);
		System.out.println("m+n="+clib.getPlus());
		System.out.println("m-n="+clib.getMinus());
		System.out.println("m*n="+clib.getTime());
		System.out.println("m/n="+clib.getDivide());
		System.out.println("m%n="+clib.getMod());
	}

}