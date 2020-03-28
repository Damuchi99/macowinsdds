package domain;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Sucursal {
	private List<Venta> ventas;
	
	public void agregarVenta(Venta venta) {
		this.ventas.add(venta);
	}
	
	public List<Venta> getVentasFecha(LocalDate fecha){
		return this.ventas.stream().filter(venta -> venta.getFecha() == fecha).collect(Collectors.toList());
	}
	
	public double getGanaciasFecha(LocalDate fecha) {
		return getVentasFecha(fecha).stream().mapToDouble(venta -> venta.precioTotal()).sum();
	}
}
