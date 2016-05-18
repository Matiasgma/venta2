package venta;

public class Mueble {
    
    private Cajon caj;
    private Base  bas;
    private Pata  pat;

	public Mueble(Cajon m1,Base m2,Pata m3) {
         caj = m1;
         bas = m2;
         pat = m3;

	}
   
    public Cajon getCaj (){
        return caj;
    }
    public void setCaj(Cajon caj) {
        this.caj = caj;

    }
    public Base getBas(){
        return bas;
    }
    public void setBas(Base bas){
        this.bas = bas;
    }
    public Pata getPat(){
        return pat;
    }
    public void setPat(Pata pat){
        this.pat = pat;
    }
}
