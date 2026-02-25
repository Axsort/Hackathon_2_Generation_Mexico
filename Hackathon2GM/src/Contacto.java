
public class Contacto {

	private String nombre;
	private String telefono;
	
	// Constructor
	public Contacto(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono=telefono;
	}// Constructor
	
	// Constructor solo nombre (para metodo buscarContacto)
	public Contacto(String nombre) {
		this.nombre=nombre;
		this.telefono="";
	}// Constructor solo nombre

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
	
	// Comparacion 
    public boolean esIgualA(Contacto otro) {
        // Compara los 2 nombres
        if (this.nombre.equalsIgnoreCase(otro.getNombre())) {
            return true;  // Los nombres coinciden
        } else {
            return false; // Los nombres son diferentes
        }
    }

    // Metodo toString 
    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Teléfono: " + telefono;
    }
}// Contacto
