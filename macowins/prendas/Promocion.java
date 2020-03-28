package domain;

public class Promocion implements EstadoPrenda {
	private int descuento;
	
	public Promocion(int descuento) {
		this.descuento = descuento;
	}
	
	public double precio(Prenda prenda) {
		return Math.max(0, prenda.getPrecioBase()-descuento);
	}
}
