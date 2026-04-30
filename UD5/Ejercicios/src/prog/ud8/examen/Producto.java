// Clase con orden natural
package prog.ud8.examen;

public class Producto implements Comparable<Producto> {
    int id;
    double precio;
    
    public Producto(int id, double precio) {
		super();
		this.id = id;
		this.precio = precio;
	}

	@Override
    public int compareTo(Producto otro) {
        return Integer.compare(this.id, otro.id);
    }

	@Override
	public String toString() {
		return "Producto [id=" + id + ", precio=" + precio + "]";
	}
}