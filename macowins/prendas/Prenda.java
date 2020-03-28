package domain;

public class Prenda {
	private int precioBase;
	private EstadoPrenda estado;
	
	public Prenda(int precio, EstadoPrenda estado) {
		this.precioBase = precio;
		this.estado = estado;
	}
	
	public int getPrecioBase() {
		return precioBase;
	}
	
	public double precio(){
		return estado.precio(this);
	}
}
