package catalogo;

public class Lavadora extends Electrodomestico {
private int capacidad;

public Lavadora(String nombre, String descripcion, double precio, int capacidad) {
	super(nombre, descripcion, precio);
	this.capacidad = capacidad;
}

public int getCapacidad() {
	return capacidad;
}

public void setCapacidad(int capacidad) {
	this.capacidad = capacidad;
}
public void lavar() {
	System.out.println("Lava tu ropa con "+getNombre()+"con"+capacidad+"kg capacidad");
}
}
