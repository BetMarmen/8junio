package catalogo;

public class Plancha extends Electrodomestico{
private int poder;


public Plancha(String nombre, String descripcion, double precio, int poder) {
	super(nombre, descripcion, precio);
	this.poder = poder;
}


public int getPoder() {
	return poder;
}


public void setPoder(int poder) {
	this.poder = poder;
}


public void planchar() {
	System.out.println("Plancha tu ropa con "+getNombre()+"con"+poder+"watts de poder");
}
}
