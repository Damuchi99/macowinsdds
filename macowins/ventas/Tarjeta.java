package domain;

public abstract class Tarjeta {
	int cuotas;
	double coeficiente;
	
	public Tarjeta(int cuotas, double coeficiente) {
		this.cuotas = cuotas;
		this.coeficiente = coeficiente;
	}
	
	public double precioTotal(double precioTotal) {
		return precioTotal + (cuotas * coeficiente + (0.01 * precioTotal));
	}
}
