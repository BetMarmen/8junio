package catalogo;

public class Licuadora extends Electrodomestico{
private int velocidad;

public Licuadora(String nombre, String descripcion, double precio, int velocidad) {
	super(nombre, descripcion, precio);
	this.velocidad = velocidad;
}

public int getVelocidad() {
	return velocidad;
}

public void setVelocidad(int velocidad) {
	this.velocidad = velocidad;
}
public void licuar() {
	System.out.println("Procesa y licua tus alimentos con "+getNombre()+"con"+velocidad+"velocidades");
}
}
