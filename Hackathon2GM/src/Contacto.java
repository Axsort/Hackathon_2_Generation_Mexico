
public class Contacto {

	private String nombre;
	private String telefono;
	
	public Contacto(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono=telefono;
	}// Constructor
	
	public Contacto(String nombre) {
		this.nombre=nombre;
		this.telefono="";
	}// Constructor

	public String getNombre() {
		return nombre;
	}// getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre

	public String getTelefono() {
		return telefono;
	}//getTelefono

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}//setTelefono
	
    public boolean esIgualA(Contacto otro) {
        if (this.nombre.equalsIgnoreCase(otro.getNombre())) {
            return true;
        } else {
            return false; 
        }//if Else
    }//esIgualA

    
    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Teléfono: " + telefono;
    }// Metodo toString 
}// Contacto
