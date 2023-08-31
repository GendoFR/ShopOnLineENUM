package shoponlinepooenum;

public class Pantalon extends Producto {
    protected int talle;
    protected String modelo;

    public Pantalon(int talle, String modelo, String desc, double precio, double codigo) {
        super(desc, precio, codigo);
        this.talle = talle;
        this.modelo = modelo;
    }

    public int getTalle() {
        return talle;
    }

    public void setTalle(int talle) {
        this.talle = talle;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public String toString(){
        return super.toString() + ( "Talle: (" + this.talle + ")"); 
    }
    
    @Override
    public double getPrecio() {
        if(this.modelo.equals("Oxford")){
            this.setPrecio(this.precio + (this.precio * 0.15));
        }
        if(this.modelo.equalsIgnoreCase("skinny")){
            this.setPrecio(this.precio + (this.precio * 0.25));
        }
        if(this.modelo.equalsIgnoreCase("recto")){
            this.setPrecio(this.precio - (this.precio * 0.15));
        }
        return this.precio;
    }
}
