package domain;

import java.time.LocalDate;
import java.util.List;
import domain.Prenda;

public class Venta {
	private List<Prenda> prendas;
	private LocalDate fechaVenta;
	private TipoPago tipoPago;
	
	public Venta(LocalDate fechaVenta, TipoPago tipoPago) {
		this.fechaVenta = fechaVenta;
		this.tipoPago = tipoPago;
	}
	
	public void agregarPrenda(Prenda prenda) {
		prendas.add(prenda);
	}
	
	public double precioTotal() {
		return tipoPago.precioTotal(prendas.stream().mapToDouble(p -> p.precio()).sum());
	}
	
	public LocalDate getFecha() {
		return fechaVenta;
	}
}
