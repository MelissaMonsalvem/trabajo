package Gestión_Clientes;

public class Cliente {

    //Atributos
    private String documento, nombre;
    private int tipo_documento;

    //Constructor

    public Cliente(String documento, String nombre, int tipo_documento) {
        this.documento = documento;
        this.nombre = nombre;
        this.tipo_documento = tipo_documento;
    }

    //Métodos accesores de las variables

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(int tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    @Override //sobreescribir el método toString
    public String toString() {
        return "\nDocumento: " + documento + "\nNombre: " + nombre + "\nTipo de documento: " +tipo_documento;
    }

    public String toString1(){
        return nombre;
    }
}
