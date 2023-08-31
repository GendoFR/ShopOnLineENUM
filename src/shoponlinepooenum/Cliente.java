package shoponlinepooenum;

public class Cliente {
    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected int DNI;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + " Direccion: " + this.direccion + " Telefono: " + this.telefono + " DNI: " + this.DNI; 
    }
    
}
