package Gestión_Clientes;

import java.util.Scanner;
import static java.lang.System.exit;

public class Principal {

    public static void main(String[] args) {

        //Captar datos de entrada
        Scanner entradaI= new Scanner(System.in);
        Scanner entradaS = new Scanner(System.in);
        int opcion=-1;
        Lista lc= new Lista(); //intancia el objeto 'lc' de la clase lista, para los clientes
        Lista lp = new Lista(); //intancia el objeto 'lp' de la clase lista, para los productos
        String menu="\n0.Salir.\n1.Agregar Producto.\n2.Agregar cliente y producto." +
                    "\n3.Editar cliente.\n4.Eliminar cliente.\n5.Consultar cliente.\nIngrese una opción: ";
        //Atributos de los productos
        String documento_cliente, nombre_producto, codigo_producto;
        //Atributos de los clientes
        String nombre;
        int tipo_documento;
        System.out.print("________________________________GESTION DE CLIENTES________________________________");
        while(opcion != 0){
            System.out.print(menu); //Muestra el menú
            opcion= entradaI.nextInt(); //Pide al usuario que ingrese una opción del menú
            System.out.print("___________________________________________________________________________________");
            switch(opcion) {

                case 1: //Agregar producto
                    int cantidad_producto;
                    System.out.print("\nIngrese el documento del cliente: ");
                    documento_cliente=entradaS.nextLine();
                    if(lc.BuscarDocumento(documento_cliente)){ //Ingresa si existe un cliente con este documento
                        System.out.println("El cliente es: "+ lc.Nombre_cliente(documento_cliente)); //Muestra el nombre al que pertenece este documento
                        System.out.print("\nIngrese el nombre del producto: ");
                        nombre_producto=entradaS.nextLine();
                        System.out.print("\nIngrese el codigo del producto: ");
                        codigo_producto= entradaS.nextLine();
                        System.out.print("\nIngrese la cantidad: ");
                        cantidad_producto = entradaS.nextInt();
                        lp.InsetarProducto(documento_cliente,nombre_producto,codigo_producto,cantidad_producto);
                        System.out.print("___________________________________________________________________________________");
                        System.out.println("\nSe registro el producto con éxito...");
                        lc.MostrarCliente(documento_cliente);
                        lp.MostrarProducto(documento_cliente);
                        System.out.print("___________________________________________________________________________________");
                    } else{ //Ingresa si no existe un cliente con este documento
                        System.out.println("\nEl cliente no existe");
                        System.out.print("\nIngrese el nombre del cliente: ");
                        nombre=entradaS.nextLine();
                        System.out.print("\n1.Cédula de Ciudadanía.\n2.Cédula de extranjería.\n3.Tarjeta de identidad.\n4.Pasaporte.\nIngrese el tipo de documento: ");
                        tipo_documento= entradaI.nextInt();
                        lc.InsertarCliente(documento_cliente,nombre,tipo_documento);
                        System.out.print("\nIngrese el nombre del producto: ");
                        nombre_producto=entradaS.nextLine();
                        System.out.print("\nIngrese el codigo del producto: ");
                        codigo_producto= entradaS.nextLine();
                        System.out.print("\nIngrese la cantidad: ");
                        cantidad_producto = entradaS.nextInt();
                        System.out.print("___________________________________________________________________________________");
                        lp.InsetarProducto(documento_cliente,nombre_producto,codigo_producto,cantidad_producto);
                        System.out.println("\nLos datos han sido registrados con éxito...");
                        lc.MostrarCliente(documento_cliente);
                        lp.MostrarProducto(documento_cliente);
                        System.out.print("___________________________________________________________________________________");
                    }
                    entradaS.nextLine();
                    entradaI.nextLine();
                    break;
                case 2: //Agrega clientes y productos
                    System.out.print("\nIngrese el documento del cliente: ");
                    documento_cliente=entradaS.nextLine();
                    System.out.print("\nIngrese el nombre del cliente: ");
                    nombre=entradaS.nextLine();
                    System.out.print("\n1.Cédula de Ciudadanía.\n2.Cédula de extranjería.\n3.Tarjeta de identidad.\n4.Pasaporte.\nIngrese el tipo de documento: ");
                    tipo_documento= entradaI.nextInt();
                    lc.InsertarCliente(documento_cliente,nombre,tipo_documento);
                    System.out.print("\nIngrese el nombre del producto: ");
                    nombre_producto=entradaS.nextLine();
                    System.out.print("\nIngrese el codigo del producto: ");
                    codigo_producto= entradaS.nextLine();
                    System.out.print("\nIngrese la cantidad: ");
                    cantidad_producto = entradaS.nextInt();
                    System.out.print("___________________________________________________________________________________");
                    lp.InsetarProducto(documento_cliente,nombre_producto,codigo_producto,cantidad_producto);
                    System.out.println("\nLos datos han sido registrados con éxito...");
                    lc.MostrarCliente(documento_cliente);
                    lp.MostrarProducto(documento_cliente);
                    System.out.print("___________________________________________________________________________________");
                    entradaS.nextLine();
                    entradaI.nextLine();
                    break;
                case 3: //Editar cliente
                    System.out.print("\nIngrese el documento del cliente: ");
                    documento_cliente=entradaS.nextLine();
                    System.out.print("\n0.Salir.\n1.Editar Nombre.\n2.Editar Tipo de Documento.\n3.Editar Documento.\nIngrese una opción: ");
                    int opc = entradaI.nextInt();
                    System.out.print("___________________________________________________________________________________");
                    switch (opc){
                        case 1: //Editar nombre
                            System.out.print("\nIngresa el nombre: ");
                            nombre=entradaS.nextLine();
                            lc.EditarNombre(documento_cliente,nombre);
                            System.out.print("___________________________________________________________________________________");
                            System.out.println("\nEl cambio se realizo correctamente...");
                            lc.MostrarCliente(documento_cliente);
                            System.out.print("___________________________________________________________________________________");
                            entradaS.nextLine();
                            entradaI.nextLine();
                            break;
                        case 2: //Editar tipo de documento
                            System.out.print("\n1.Cédula de Ciudadanía.\n2.Cédula de extranjería.\n3.Tarjeta de identidad.\n4.Pasaporte.\nIngrese el tipo de documento: ");
                            tipo_documento=entradaI.nextInt();
                            lc.EditarTipoDocumento(documento_cliente,tipo_documento);
                            System.out.print("___________________________________________________________________________________");
                            System.out.println("\nEl cambio se realizo correctamente...");
                            lc.MostrarCliente(documento_cliente);
                            System.out.print("___________________________________________________________________________________");
                            entradaS.nextLine();
                            entradaI.nextLine();
                            break;
                        case 3: //Editar documento
                            System.out.print("\nIngrese el documento: ");
                            String Documento2= entradaS.nextLine();
                            lc.EditarDocumento(documento_cliente,Documento2);
                            System.out.println("___________________________________________________________________________________");
                            System.out.println("\nEl cambio se realizo correctamente...");
                            lc.MostrarCliente(Documento2);
                            lp.MostrarProducto(Documento2);
                            System.out.print("___________________________________________________________________________________");
                            entradaS.nextLine();
                            entradaI.nextLine();
                            break;
                    }
                    break;
                case 4: //Eliminar cliente
                    System.out.print("\nIngrese el documento del cliente: ");
                    documento_cliente=entradaS.nextLine();
                    lc.MostrarCliente(documento_cliente);
                    System.out.println("Eliminado...");
                    lc.EliminarCliente(documento_cliente);
                    //lp.EliminarProduco(documento_cliente);
                    System.out.println("___________________________________________________________________________________");
                    lc.MostrarCliente(documento_cliente);
                    break;
                case 5: //Consultar cliente por tipo de documento y documento
                    System.out.print("\nIngrese el documento del cliente: ");
                    documento_cliente=entradaS.nextLine();
                    System.out.print("\n1.Cédula de Ciudadanía.\n2.Cédula de extranjería.\n3.Tarjeta de identidad.\n4.Pasaporte.\nIngrese el tipo de documento del cliente: ");
                    tipo_documento=entradaI.nextInt();
                    lc.BuscarCliente(documento_cliente, tipo_documento);
                    entradaS.nextLine();
                    entradaI.nextLine();
                    break;
                default:
                    entradaI.close();
                    entradaS.close();
                    break;

            }
        }

    }
}
