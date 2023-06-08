package piramide;

import java.util.Scanner;

public class main_piramide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int filas;
		try {
		do {
		System.out.println("Ingrese el numero de filas de su programa:");
		filas= scan.nextInt();
		}
		while(filas<1);
		 for (int i= 1; i<=filas; i++)
		    {
		        for (int j= 1; j<=filas-i; j++)
		        {
		          System.out.print(" ");
		        }
		        for (int k= 1; k<= 2 *i-1; k++)
		        {
		           System.out.print("*");
		        }
		     System.out.println();
		    }
		 }catch(Exception e) {
			 System.out.println("Ingrese algo valido");
		 }
	}

}
