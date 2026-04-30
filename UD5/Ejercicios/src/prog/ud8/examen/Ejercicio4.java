package prog.ud8.examen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio4 {

	public static void main(String[] args) {
		List<Producto> productos = new ArrayList<>();
		productos.add(new Producto(1, 25));
		productos.add(new Producto(2, 10));
		productos.add(new Producto(3, 30));
		Collections.sort(productos, new ComparadorPorPrecio());
		System.out.println(productos);
	}

}
