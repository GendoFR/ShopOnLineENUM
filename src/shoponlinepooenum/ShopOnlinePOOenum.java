package shoponlinepooenum;

import java.time.LocalDate;
import java.util.Scanner;

public class ShopOnlinePOOenum {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Bienvenido al sistema Gestor de Ventas");
        String elecUsu;
        System.out.println("¿Desea hacer una venta? (Y/N)");
        elecUsu = sc.next();
        while(elecUsu.equalsIgnoreCase("Y")){
            System.out.println("Ingrese el nombre del cliente");
            String n = sc.next();
            Cliente cliente = new Cliente(n);
            Venta venta = new Venta(cliente, LocalDate.now());
            cargarProductos(venta);
            venta.imprimirFactura();
            sc.nextLine();
            System.out.println("Desea seguir haciendo ventas? (Y/N)");
            elecUsu = sc.next();
        }
        
    }

    private static void cargarProductos(Venta venta) {
        
        String desc;
        double precio;
        int codigo;
        Producto producto;
        System.out.println("Desea ingresar un producto? (1/2)");
        int n;
        n= sc.nextInt();
        while(n == 1){
            System.out.println("Ingrese descripción de producto");
            desc = sc.next();
            System.out.println("Ingrese precio de producto");
            precio = sc.nextDouble();
            System.out.println("Ingrese el codigo del prodcuto");
            codigo = sc.nextInt();
            System.out.println("Ingrese el tipo de producto que quiere ingresar (1= Remera /2 = Pantalón /3= Accesorio)");
            n = sc.nextInt();
            switch(n){
                case 1 -> {
                    System.out.println("Usted esta ingresando una remera.");
                    String talleR;
                    System.out.println("Ingrese el talle de la Remera (S, M, L, XL)");
                    talleR = sc.next();
                    producto = new Remera(talleR, desc, precio, codigo);
                    venta.agregarProducto(producto);
                }
                case 2 -> {
                    System.out.println("Usted esta ingresando un pantalón");
                    int talleP;
                    String modelo;
                    System.out.println("Ingrese el talle del pantalón (Numero)");
                    talleP = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese el modelo del pantalón (Oxford, Skinny, Recto)");
                    modelo = sc.nextLine();
                    producto = new Pantalon(talleP, modelo, desc, precio, codigo);
                    venta.agregarProducto(producto);
                }
                case 3 -> {
                    System.out.println("Usted esta ingresando un accesorio");
                    double peso;
                    Metales m = Metales.PLATA;
                    System.out.println("Ingrese el peso del accesorio.");
                    peso = sc.nextDouble();
                    System.out.println("Ingrese el tipo de metal. (ORO, PLATA, ACERO (CON MAYUS))");
                    String TipoMetal = sc.next();
                    switch(TipoMetal){
                        case "ORO":
                            m = Metales.ORO;
                            break;
                        case "PLATA":
                            m = Metales.PLATA;
                            break;
                        case "ACERO":
                            m = Metales.ACERO;
                            break;
                        default:
                            m = Metales.TEST;
                            break;
                    }
                    producto = new Accesorio(peso, m, desc, precio, codigo);
                    venta.agregarProducto(producto);
                }
                }
            System.out.println("Desea seguir ingresando productos a esta venta? (1/2)");
            n = sc.nextInt();
            }
        }
    }


