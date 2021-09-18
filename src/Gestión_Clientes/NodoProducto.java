package Gestión_Clientes;

public class NodoProducto extends Producto{

    //Atributos
    private NodoProducto siguiente; //Puntero o referencia hacia el siguiente nodo

    //Constructor

    public NodoProducto(String documento_cliente, String nombre_producto, String codigo_producto, int cantidad_producto) {
        super(documento_cliente, nombre_producto, codigo_producto, cantidad_producto);
        this.siguiente = siguiente;
    }

    //Metodos accesores

    public NodoProducto getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoProducto siguiente) {
        this.siguiente = siguiente;
    }

}
