package venta;

public class Cliente {

	private String nombre;
        private String apellido;
	private int rut;
	private String direccion;
        
        public Cliente(){
            this.nombre = "Matías";
            this.apellido = "Molina";
            this.rut = 190857441;
            this.direccion = "General Lagos";
        
        }

	public String getNombre() {
		return this.nombre;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
        public String getApellido() {
		return this.apellido;
	}

	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getRut() {
		return this.rut;
	}

	
	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getDireccion() {
		return this.direccion;
	}

	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}