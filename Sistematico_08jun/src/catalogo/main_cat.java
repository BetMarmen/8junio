package catalogo;

import java.util.Scanner;

public class main_cat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int option;
		System.out.println("Ingrese su nombre:");
		
		String nombre= scan.next();
		System.out.println("Ingrese su numero de telefono:");
		String tel=scan.next();
		 
        
        do {
            System.out.println("Bienvenido al programa");
            System.out.println("1. Lavadora");
            System.out.println("2. Plancha");
            System.out.println("3. Licuadora");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            
            option=scan.nextInt();
            
            switch (option) {
                case 1:
                	Lavadora ob = new Lavadora(tel, tel, option, option);
                	ob.lavar();
                    break;
                case 2:
                    Licuadora b= new Licuadora;
                    break;
                case 3:
                    System.out.println("Ha seleccionado la opción 3");
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo");
                    break;
            }
        } while (option != 4);
	}

}
