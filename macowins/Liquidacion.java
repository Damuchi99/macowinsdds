package domain;

public class Liquidacion implements EstadoPrenda {
	public double precio(Prenda prenda) {
		return (prenda.getPrecioBase()/2);
	}
}
