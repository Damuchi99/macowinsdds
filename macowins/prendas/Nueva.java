package domain;

public class Nueva implements EstadoPrenda {
	public double precio(Prenda prenda) {
		return prenda.getPrecioBase();
	}
}
