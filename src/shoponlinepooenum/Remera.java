package shoponlinepooenum;

public class Remera extends Producto {
    protected String talle;

    public Remera(String talle, String desc, double precio, double codigo) {
        super(desc, precio, codigo);
        this.talle = talle;
    }

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }
    
    @Override
    public String toString(){
        return super.toString() + ( "Talle: (" + this.talle + ")");
    }
    
    @Override
    public double getPrecio() {
        if(this.talle.toUpperCase().equals("S")){
            this.setPrecio(this.precio);
        }
        if(this.talle.toUpperCase().equals("M")){
            this.setPrecio(this.precio + (this.precio * 0.05));
        }
        if(this.talle.toUpperCase().equals("L")){
            this.setPrecio(this.precio + (this.precio * 0.10));
        }
        if(this.talle.toUpperCase().equals("XL")){
            this.setPrecio(this.precio + (this.precio * 0.15));
        }
        
        return this.precio;
    }
}