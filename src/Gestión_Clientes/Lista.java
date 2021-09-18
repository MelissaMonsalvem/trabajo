package Gestión_Clientes;

public class Lista {

    //Atributos
    private NodoCliente puntaC;
    private NodoProducto puntaP;

    //Constructor
    public Lista() {
        this.puntaC = null;
        this.puntaP = null;
    }

    //Metodos
    //Modificador de acceso / valor de retorno / nombre del método /argumento
    public void InsertarCliente(String documento, String nombre, int tipo_documento){

        NodoCliente p= new NodoCliente(documento, nombre, tipo_documento);

        if (puntaC==null){
            puntaC=p;
        } else{
            NodoCliente aux=puntaC;
            while(aux.getSiguiente() != null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(p);
        }

    }

    public void InsetarProducto(String documento_cliente, String nombre_producto, String codigo_producto, int cantidad_producto){

        NodoProducto p= new NodoProducto(documento_cliente, nombre_producto, codigo_producto, cantidad_producto);

        if (puntaP==null){
            puntaP=p;
        } else{
            NodoProducto aux=puntaP;
            while(aux.getSiguiente() != null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(p);
        }
    }

    public Boolean BuscarDocumento(String documento) {
        Boolean b= false;

        if (puntaC == null) {
            return b;
        } else {
            NodoCliente aux = puntaC;
            while (aux != null) {
                if(documento.equals(aux.getDocumento())){
                    b= true;
                }
                aux = aux.getSiguiente();
            }
        }
        return b;
    }

    public String Nombre_cliente(String documento){
        String m="";
        if (puntaC == null) {
            m="La lista de clientes esta vacia";
        } else {
            NodoCliente aux = puntaC;
            while (aux != null) {
                if(documento.equals(aux.getDocumento())){
                    m= aux.toString1();
                }
                aux = aux.getSiguiente();
            }
        }
        return m;
    }

    public void MostrarCliente(String documento) {
        if (puntaC == null) {
            System.out.println("La lista de clientes esta vacia");
        } else {
            NodoCliente aux = puntaC;
            while (aux != null) {
                if(documento.equals(aux.getDocumento())) {
                    System.out.println(aux.toString());
                }
                aux = aux.getSiguiente();
            }
        }
    }

    public void MostrarProducto(String documento) {
        if (puntaP == null) {
            System.out.println("No");
        } else {
            NodoProducto aux = puntaP;
            while (aux != null) {
                if(documento.equals(aux.getDocumento_cliente())) {
                    System.out.print(aux.toString());
                }
                aux = aux.getSiguiente();
            }
        }
    }

    public void EditarNombre(String documento, String nombre){
        if (puntaC == null) {
            System.out.println("La lista de clientes esta vacia");
        } else {
            NodoCliente aux = puntaC;
            while (aux != null) {
                if (documento.equals(aux.getDocumento())) {
                    aux.setNombre(nombre);
                }
                aux = aux.getSiguiente();
            }
        }
    }

    public void EditarTipoDocumento(String documento, int tipo_documento){
        if (puntaC == null) {
            System.out.println("La lista de clientes esta vacia");
        } else {
            NodoCliente aux = puntaC;
            while (aux != null) {
                if (documento.equals(aux.getDocumento())) {
                    aux.setTipo_documento(tipo_documento);
                }
                aux = aux.getSiguiente();
            }
        }
    }

    public void EditarDocumento(String documento, String documento2){
        if (puntaC == null) {
            System.out.println("La lista de clientes esta vacia");
        } else {
            NodoCliente aux = puntaC;
            while (aux != null) {
                if (documento.equals(aux.getDocumento())) {
                    aux.setDocumento(documento2);
                }
                aux = aux.getSiguiente();
            }
            NodoProducto aux1 = puntaP;
            while (aux1 != null) {
                if (documento.equals(aux1.getDocumento_cliente())) {
                    aux1.setDocumento_cliente(documento2);
                }
                aux1 = aux1.getSiguiente();
            }
        }
    }

    public void EliminarCliente(String documento){

        if (puntaC == null) {
            System.out.println("No exite ningún cliente.");
        }
        if (documento.equals(puntaC.getDocumento())) {
            // El primer nodo apunta al siguiente.
            puntaC = puntaC.getSiguiente();
        } else{
            NodoCliente aux = puntaC;
            // Recorre la lista hasta llegar al nodo anterior de la referencia.
            while(aux != null){
                NodoCliente ant =aux;
                if (documento.equals(aux.getSiguiente().getDocumento())) {
                    aux = aux.getSiguiente();
                }
                ant.setSiguiente(aux.getSiguiente());
            }
        }
    }

    public void EliminarProduco(String documento){

        if (puntaP == null) {
            System.out.println("No exite ningún cliente.");
        }
        if (documento.equals(puntaP.getDocumento_cliente())) {
            // El primer nodo apunta al siguiente.
            puntaP = puntaP.getSiguiente();
        } else{
            NodoProducto aux = puntaP;
            // Recorre la lista hasta llegar al nodo anterior de la referencia.
            while(aux != null){
                NodoProducto ant =aux;
                if (documento.equals(aux.getSiguiente().getDocumento_cliente())) {
                    aux = aux.getSiguiente();
                }
                ant.setSiguiente(aux.getSiguiente());
            }
        }
    }

    public void BuscarCliente(String documento, int  tipo_documento) {
        if (puntaC == null) {
            System.out.println("No exite ningún cliente con ese documento.");
        } else {

            NodoCliente aux = puntaC;
            while (aux != null) {
                if (documento.equals(aux.getDocumento()) && tipo_documento == aux.getTipo_documento()) {
                    System.out.println(aux.toString());
                }
                aux = aux.getSiguiente();
            }
        }
    }

}
