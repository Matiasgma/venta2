package venta;

import java.util.ArrayList;

public class Factura {
    private Cliente c;
    private Cajon m1;
    private Base m2;
    private Pata m3;

    private ArrayList<Mueble> arr;

    public Factura() {

        arr = new ArrayList<Mueble>();

    }
     public void Agregarcomp(String c1,String c2,int c3,String c4,int a1,int a2, int a3){     
       c  = new Cliente();
       m1 = new Cajon(a1);  
       m2 = new Base(a2);
       m3 = new Pata(a3);
       arr.add(new Mueble(m1,m2,m3));
     }
     
    
      public void mostrarFactura(int i) {
          System.out.println("Nombre cliente: "+c.getNombre());
          System.out.println("Apellido: "+c.getApellido());
          System.out.println("Rut: "+c.getRut());
          System.out.println("Dirección: "+c.getDireccion());
          System.out.println("Valor total cajones: $"+arr.get(i).getCaj().getPrecio());
          System.out.println("Valor total Base: $"+arr.get(i).getBas().getCosto());
          System.out.println("Valor total Patas: $"+arr.get(i).getPat().getValor());
          
          

    }
}
