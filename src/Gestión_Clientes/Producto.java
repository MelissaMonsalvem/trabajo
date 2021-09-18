package Gestión_Clientes;

public class Producto {

    //Atributos: atributos del producto y el documento del cliente
    private String documento_cliente, nombre_producto, codigo_producto;
    private int cantidad_producto;

    //Constructor

    public Producto(String documento_cliente, String nombre_producto, String codigo_producto, int cantidad_producto) {
        this.documento_cliente = documento_cliente;
        this.nombre_producto = nombre_producto;
        this.codigo_producto = codigo_producto;
        this.cantidad_producto = cantidad_producto;
    }

    public Producto(){

    }

    //Metodos accesores
    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(String codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getDocumento_cliente() {
        return documento_cliente;
    }

    public void setDocumento_cliente(String documento_cliente) {
        this.documento_cliente = documento_cliente;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    //sobreescribe el método toString de la clase String
    @Override
    public String toString() {
        return "Nombre del producto: " + nombre_producto +
                "\nCodigo del producto: " + codigo_producto + "\nCantidad del producto: " + cantidad_producto + "\n";
    }

}
