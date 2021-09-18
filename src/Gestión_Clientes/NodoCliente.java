package Gestión_Clientes;

public class NodoCliente extends Cliente {

    //Atributo
    private NodoCliente siguiente; //Puntero o referencia hacia el siguiente nodo

    //Constructor
    public NodoCliente(String documento, String nombre, int tipo_documento) {
        super(documento, nombre, tipo_documento);
        this.siguiente = siguiente;
    }

    //Métodos accesores

    public NodoCliente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCliente siguiente) {
        this.siguiente = siguiente;
    }

}
