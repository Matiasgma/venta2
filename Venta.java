/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package venta;

import java.util.Scanner;

/**
 *
 * @author Matías
 */
public class Venta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        Cliente c = new Cliente();
        Factura F = new Factura();
        System.out.println("Ingrese su nombre: ");
        String nc = lec.next();
        c.setNombre(nc);
        System.out.println("Ingrese su apellido: ");
        String ac = lec.next();
        c.setApellido(ac);
        System.out.println("Ingrese su rut(sin espacios ni guión) ");
        int rc = lec.nextInt();
        c.setRut(rc);
        System.out.println("Ingrese su dirección(todo junto) ");
        String dc = lec.next();
        c.setDireccion(dc);
        
        
        System.out.println("¿Cuántos muebles quiere comprar ?");
        int cuantos = lec.nextInt();
        
        for (int i = 0; i < cuantos; i++) {
            
            System.out.println("¿Cuántos cajones quiere que tenga su mueble ? (si no quiere cajones digite 0)");
            int cm = lec.nextInt();
            System.out.println("¿Quiere que su mueble tenga una base?(Digite 1 si la respuesta es si, digite 0 si es no)");
            int bm = lec.nextInt();
            System.out.println("¿Cuántas patas quiere que tenga su mueble? (si no quiere patas digite 0)");
            int pm = lec.nextInt();
            
            F.Agregarcomp(nc,ac,rc,dc,cm,bm,pm);
            F.mostrarFactura(0);
            
        }
    }
    
}
