import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Lapiz","Papeleria",50,10,0.90);
        Producto p2 = new Producto("Leche","Supermercado",30,10,1.00);
        Producto p3 = new Producto("Paracetamol","Farmacia",20,10,0.30);
        Producto p4 = new Producto("Mermelada","Supermercado",50,10,1.20);
        Producto p5 = null;
        int opc;
        String nombreproducto,tipo;
        double precio;
            int cantidadproducto,cantidadminima;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("1.- Visualizar la información de los productos");
            System.out.println("2.- Vender un producto.");
            System.out.println("3.- Abastecer la tienda con un producto");
            System.out.println("4.- Cambiar un producto.");
            System.out.println("5.- Calcular estadísticas de ventas.");
            System.out.println("6.- Salir");
            System.out.print("\nIngrese una opción: ");
            opc = Integer.parseInt(sc.next());
            switch (opc) {
                case 1: {

                        System.out.println("1.- Productos de Papeleria");
                        System.out.println("2.- Productos de Farmacia");
                        System.out.println("3.- Productos de Supermercado");
                        System.out.print("\nIngrese una opción: ");
                        opc = Integer.parseInt(sc.next());
                        switch (opc) {
                            case 1: {
                                System.out.println("1.- Productos de Papeleria");
                                System.out.println(p1.toString());

                            }
                            break;
                            case 2: {
                                System.out.println("2.- Productos de Farmacia");
                                System.out.println(p3.toString());
                            }
                            break;
                            case 3: {

                                System.out.println("3.- Productos de Supermercado");
                                System.out.println(p2.toString());
                                System.out.println(p4.toString());
                            }
                            break;

                            default:
                                System.out.println("opción no válida");


                        }


                }
                break;
                case 2: {


                }
                break;
                case 3: {
                    System.out.println("ABASTECIMIENTO DE PRODUCTOS");
                    System.out.println("1.- Agregar cantidad de productos");
                    System.out.println("2.- Agregar un nuevo producto");
                    System.out.print("\nIngrese una opción: ");
                    opc = Integer.parseInt(sc.next());
                    switch (opc) {
                        case 1: {
                            System.out.println("1.- Productos de Papeleria");
                            System.out.println("2.- Productos de Farmacia");
                            System.out.println("3.- Productos de Supermercado");
                            System.out.print("\nIngrese una opción: ");
                            opc = Integer.parseInt(sc.next());
                            switch (opc) {
                                case 1: {
                                    System.out.println("Productos de Papeleria");
                                    System.out.println(" 1._" + p1.nombreproducto);
                                    System.out.print("\nIngrese una opción: ");
                                    opc = Integer.parseInt(sc.next());

                                    switch (opc) {
                                        case 1: {

                                            System.out.print("Ingrese la cantidad de nuevos productos que agregara: ");
                                            cantidadproducto = Integer.parseInt(sc.next());

                                            p1.abastecerProducto(cantidadproducto);


                                        }break;
                                    }
                                }break;
                                case 2: {
                                    System.out.println("Productos de Farmacia");
                                    System.out.println("1.- " + p3.nombreproducto);
                                    System.out.print("Ingrese una opción: ");
                                    opc = Integer.parseInt(sc.next());

                                    switch (opc) {
                                        case 1: {
                                            System.out.print("Ingrese la cantidad de nuevos productos que agregara: ");
                                            cantidadproducto = Integer.parseInt(sc.next());

                                            p3.abastecerProducto(cantidadproducto);


                                        }break;
                                    }
                                }break;

                                case 3: {

                                    System.out.println("\nProductos de Supermercado");
                                    System.out.println("1._"+p2.nombreproducto);
                                    System.out.println("2._"+p4.nombreproducto);
                                    System.out.print("Ingrese una opción: ");
                                    opc = Integer.parseInt(sc.next());

                                    switch (opc) {
                                        case 1: {

                                            System.out.print("Ingrese la cantidad de nuevos productos que agregara: ");
                                            cantidadproducto = Integer.parseInt(sc.next());

                                            p2.abastecerProducto(cantidadproducto);


                                        }break;
                                        case 2: {

                                            System.out.print("Ingrese la cantidad de nuevos productos que agregara: ");
                                            cantidadproducto = Integer.parseInt(sc.next());

                                            p4.abastecerProducto(cantidadproducto);


                                        }break;


                                    }



                                }break;
                            }

                        }break;
                        case 2: {
                            System.out.print("Ingrese el nombre del producto: ");
                            nombreproducto = String.valueOf(sc.next());

                            System.out.print("Ingrese el tipo del producto: ");
                            tipo = String.valueOf(sc.next());

                            System.out.print("Ingrese la cantidad del producto: ");
                            cantidadproducto = Integer.parseInt(sc.next());

                            System.out.print("Ingrese la cantidad minima del producto para el abastecimiento: ");
                            cantidadminima = Integer.parseInt(sc.next());

                            System.out.print("Ingrese el precio del producto: ");
                            precio = Double.parseDouble(sc.next());


                            p5 = new Producto(nombreproducto, tipo, cantidadproducto, cantidadminima, precio);


                        }break;


                    }


                }
                break;
                case 4: {

                    System.out.println("1.- Productos de Papeleria");
                    System.out.println("2.- Productos de Farmacia");
                    System.out.println("3.- Productos de Supermercado");
                    System.out.print("\nIngrese una opción: ");
                    opc = Integer.parseInt(sc.next());
                    switch (opc) {
                        case 1: {
                            System.out.println("Productos de Papeleria");
                            System.out.println(" 1._" + p1.nombreproducto);
                            System.out.print("\nIngrese una opción: ");
                            opc = Integer.parseInt(sc.next());

                            switch (opc) {
                                case 1: {
                                    System.out.print("Ingrese el nombre del producto: ");
                                    nombreproducto = String.valueOf(sc.next());

                                    System.out.print("Ingrese el tipo del producto: ");
                                    tipo = String.valueOf(sc.next());

                                    System.out.print("Ingrese la cantidad del producto: ");
                                    cantidadproducto = Integer.parseInt(sc.next());

                                    System.out.print("Ingrese la cantidad minima del producto para el abastecimiento: ");
                                    cantidadminima = Integer.parseInt(sc.next());

                                    System.out.print("Ingrese el precio del producto: ");
                                    precio = Double.parseDouble(sc.next());


                                    p1.cambiarProducto(nombreproducto, tipo, cantidadproducto, cantidadminima, precio);


                                }break;
                            }
                        }break;
                        case 2: {
                            System.out.println("Productos de Farmacia");
                            System.out.println("1.- " + p3.nombreproducto);
                            System.out.print("Ingrese una opción: ");
                            opc = Integer.parseInt(sc.next());

                            switch (opc) {
                                case 1: {
                                    System.out.print("Ingrese el nombre del producto: ");
                                    nombreproducto = String.valueOf(sc.next());

                                    System.out.print("Ingrese el tipo del producto: ");
                                    tipo = String.valueOf(sc.next());

                                    System.out.print("Ingrese la cantidad del producto: ");
                                    cantidadproducto = Integer.parseInt(sc.next());

                                    System.out.print("Ingrese la cantidad minima del producto para el abastecimiento: ");
                                    cantidadminima = Integer.parseInt(sc.next());

                                    System.out.print("Ingrese el precio del producto: ");
                                    precio = Double.parseDouble(sc.next());


                                    p3.cambiarProducto(nombreproducto, tipo, cantidadproducto, cantidadminima, precio);


                                }break;
                            }
                        }break;

                            case 3: {

                                System.out.println("\nProductos de Supermercado");
                                System.out.println("1._"+p2.nombreproducto);
                                System.out.println("2._"+p4.nombreproducto);
                                System.out.print("Ingrese una opción: ");
                                opc = Integer.parseInt(sc.next());

                                switch (opc) {
                                    case 1: {
                                        System.out.print("Ingrese el nombre del producto: ");
                                        nombreproducto = String.valueOf(sc.next());

                                        System.out.print("Ingrese el tipo del producto: ");
                                        tipo = String.valueOf(sc.next());

                                        System.out.print("Ingrese la cantidad del producto: ");
                                        cantidadproducto = Integer.parseInt(sc.next());

                                        System.out.print("Ingrese la cantidad minima del producto para el abastecimiento: ");
                                        cantidadminima = Integer.parseInt(sc.next());

                                        System.out.print("Ingrese el precio del producto: ");
                                        precio = Double.parseDouble(sc.next());


                                        p2.cambiarProducto(nombreproducto, tipo, cantidadproducto, cantidadminima, precio);


                                    }break;
                                    case 2: {
                                        System.out.print("Ingrese el nombre del producto: ");
                                        nombreproducto = String.valueOf(sc.next());

                                        System.out.print("Ingrese el tipo del producto: ");
                                        tipo = String.valueOf(sc.next());

                                        System.out.print("Ingrese la cantidad del producto: ");
                                        cantidadproducto = Integer.parseInt(sc.next());

                                        System.out.print("Ingrese la cantidad minima del producto para el abastecimiento: ");
                                        cantidadminima = Integer.parseInt(sc.next());

                                        System.out.print("Ingrese el precio del producto: ");
                                        precio = Double.parseDouble(sc.next());


                                        p4.cambiarProducto(nombreproducto, tipo, cantidadproducto, cantidadminima, precio);


                                    }break;


                                }



                            }break;
                    }
                }break;

                case 5:{

                        System.out.println("1.- El producto más vendido.");
                        System.out.println("2.- El producto menos vendido.");
                        System.out.println("3.- La cantidad total de dinero obtenido por las ventas de la tienda.");
                        System.out.println("4.- La cantidad de dinero promedio obtenido por unidad de producto vendido");
                        System.out.print("\nIngrese una opción: ");
                        opc = Integer.parseInt(sc.next());
                        switch (opc) {
                            case 1: {


                            }
                            break;
                            case 2: {

                            }
                            break;
                            case 3: {


                            }
                            break;
                            case 4: {

                            }
                            break;

                            default:
                                System.out.println("opción no válida");

                        }


                }break;

                case 6:{
                    System.out.println("Gracias!");
                }break;
                default:
                    System.out.println("opción no válida");

            }


        }while(opc!=10);

    }

}
