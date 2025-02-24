
package maquinaderefrescos;

import java.util.Scanner;

public class MaquinaDeRefrescos {

   /* Con el uso de netBeans, programar los siguiente: "una maquina
    dispensadora de bebidas entre ellas (la que usted imagine), vende bebidas
    de diferentes marcas y precios, también cada cierto tiempo el de soporte
    llega a retirar el dinero y el de abastecimientos llega a llenar la
    dispensadora de más productos", se pide programar el proceso mencionado
    creando clases y atributos (hacer uso del metodo void main), programar la
    venta de las bebidas, el abastecimiento de bebidas y el retiro del dinero
    ganado, también se pide programar un venta :) */
    
    public static void main(String[] args) {
               
        Precios P = new Precios();
        AlmacenDeRefrescos A = new AlmacenDeRefrescos();
        RetiroDeBillete RDB = new RetiroDeBillete();
        
        Lobby();
               
        Scanner eleccion = new Scanner(System.in);
        int Eleccion = eleccion. nextInt(); 
        
        switch(Eleccion){
            
            case 1: 
                Menu();
                Scanner opcion = new Scanner (System.in);
                String Opcion = opcion.next();
                
                if("1".equals(Opcion)){
                    System.out.println("*********************************");
                    System.out.println("¿Cuantas Pepsi desea comprar?");
                    Scanner cifra = new Scanner(System.in);
                    int cantidad = cifra.nextInt();
                    double Total =P.VentaPepsi(cantidad);
                    System.out.println("el precio a pagar es S/." + Total);
                    System.out.println("*********************************");
                    
                }else if("2".equals(Opcion)){ 
                    System.out.println("*********************************");
                    System.out.println("¿Cuantas Coca-Cola desea comprar?");
                    Scanner cifra = new Scanner(System.in);
                    int cantidad = cifra.nextInt();
                    double Total =P.VentaCocaCola(cantidad);
                    System.out.println("el precio a pagar es S/." + Total);
                    System.out.println("*********************************");
                    
                }else if("3".equals(Opcion)){ 
                    System.out.println("*********************************");
                    System.out.println("¿Cuantas Inka Kola desea comprar?");
                    Scanner cifra = new Scanner(System.in);
                    int cantidad = cifra.nextInt();
                    double Total =P.VentaInka(cantidad);
                    System.out.println("el precio a pagar es S/." + Total);
                    System.out.println("*********************************");
                    
                }else if("4".equals(Opcion)){ 
                    System.out.println("*********************************");
                    System.out.println("¿Cuantas Fanta desea comprar?");
                    Scanner cifra = new Scanner(System.in);
                    int cantidad = cifra.nextInt();
                    double Total =P.VentaFanta(cantidad);
                    System.out.println("el precio a pagar es S/." + Total);
                    System.out.println("*********************************");
                    
                }else if("5".equals(Opcion)){ 
                    System.out.println("*********************************");
                    System.out.println("¿Cuantas Crusch desea comprar?");
                    Scanner cifra = new Scanner(System.in);
                    int cantidad = cifra.nextInt();
                    double Total =P.VentaCrusch(cantidad);
                    System.out.println("el precio a pagar es S/." + Total);
                    System.out.println("*********************************");
                    
                }else if("6".equals(Opcion)){ 
                    System.out.println("*********************************");
                    System.out.println("¿Cuantas Sprite desea comprar?");
                    Scanner cifra = new Scanner(System.in);
                    int cantidad = cifra.nextInt();
                    double Total =P.VentaSprite(cantidad);
                    System.out.println("el precio a pagar es S/." + Total);
                    System.out.println("*********************************");
                    
                }else if("7".equals(Opcion)){ 
                    System.out.println("*********************************");                    
                    System.out.println("¿Cuantas BigCola desea comprar?");
                    Scanner cifra = new Scanner(System.in);
                    int cantidad = cifra.nextInt();
                    double Total =P.VentaBigcola(cantidad);
                    System.out.println("el precio a pagar es S/." + Total);
                   System.out.println("*********************************");
                    
                }else if("8".equals(Opcion)){ 
                    System.out.println("*********************************");
                    System.out.println("¿Cuantas Agua San Luis desea comprar?");
                    Scanner cifra = new Scanner(System.in);
                    int cantidad = cifra.nextInt();
                    double Total =P.VentaAgua(cantidad);
                    System.out.println("el precio a pagar es S/." + Total);
                    System.out.println("*********************************");
                }
                 else{
                    System.out.println("Error en el sistema");
                }
                
                break;
                
            case 2:
                System.out.println("**************************************************");
                System.out.println("Cantidad de bebidas en la maquina: "+ A.Productos);
                System.out.println("¿Cuantas bebidas va a abastecer?");
                System.out.println("**************************************************");
                Scanner Cant = new Scanner(System.in);
                int CantAlmacenada = Cant. nextInt();
                
                int Rellenar = A.Aumentar(CantAlmacenada);
                System.out.println("**************************************************");
                System.out.println("En total hay "+Rellenar+" bebidas");
                break;
                
            case 3:
                System.out.println("**************************************************");
                System.out.println("Cantidad de dinero guardado: S/."+RDB.DineroAlmacenado);
                System.out.println("¿Cuanto dinero va a retirar?");
                System.out.println("**************************************************");
                Scanner Cant1 = new Scanner(System.in);
                int CantRetirada = Cant1. nextInt();
                
                int Retirar = RDB.Retirar(CantRetirada);
                System.out.println("**************************************************");
                System.out.println("Cantidad de dinero retirado: S/."+CantRetirada);
                System.out.println("Cantidad de dinero restante: S/."+Retirar);
                break;
                
                default:
                    System.out.println("****************");
                System.out.println("Error en el sistema");
                break;
                
    }                       
    }
    
    public static void Lobby(){
        
        System.out.println("*******************************");
        System.out.println("¿Qué acción desea realizar?");
        System.out.println("1. Comprar bebida.");
        System.out.println("2. Suministrar refrescos.");
        System.out.println("3. Retiro de dinero.");
        System.out.println("*******************************");
        
    }
    
    public static void Menu(){
        
         System.out.println("*******************************");
         System.out.println("*** Maquina de refrescos :D ***");
         System.out.println("1. Pepsi S/. 2.00");
         System.out.println("2. Coca-Cola S/. 2.50");
         System.out.println("3. Inka Kola S/. 2.50");
         System.out.println("4. Fanta S/. 2.00");
         System.out.println("5. Crusch S/. 1.50");
         System.out.println("6. Sprite S/. 2.00");
         System.out.println("7. Bigcola S/. 1.00");
         System.out.println("8. Agua sanluis S/. 1.50");
         System.out.println("*******************************");
        
    }
    
}
