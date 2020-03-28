# macowinsdds
Ejercicio de Macowins

Requerimientos funcionales:
-Saber el precio de venta de una prenda y sus tipos.
-El precio de la prenda varía dependiendo del estado de la prenda
  1. Nueva: El precio base no varia
  2. Promoción: Al precio base se le resta un valor fijo dependiendo del usuario
  3. Liquidación: Al precio se le hace unn descuento del 50%
-Registrar las ventas de estas prendas y saber las ganancias de un determinado día.
-Las ventas pueden ser en efectivo o con tarjeta:
  1. Efectivo: No se modifica el precio
  2. Tarjeta: Al precio se le aplica un recargo de la siguiente manera: cantidad de cuotas * un coeficiente fijo + 0.01 del valor de cada prenda.
  
Requerimientos no funcionales: 
-Los tipos de prenda son: sacos, pantalones, camisas.
-Cada venta tiene asociada las prendas que se vendieron, su cantidad y la fecha de venta.
