    package shoponlinepooenum;

import java.util.HashSet;
import java.util.Set;

public class Accesorio extends Producto {
    protected double peso;
    private Metales m;

    public Accesorio(double peso, Metales m, String desc, double precio, double codigo) {
        super(desc, precio, codigo);
        this.peso = peso;
        this.m = m;
    }
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Metales getM() {
        return m;
    }

    public void setM(Metales metal) {
        this.m = m;
    }

    @Override
    public String toString(){
        return super.toString() + ( "Metal: (" + this.m + ") Peso: " + this.peso + "g");
    }
    
    @Override
    public double getPrecio() {
        switch(m){
            case ORO -> this.setPrecio(this.precio + (17629.64 * this.peso));
            
            case ACERO -> this.setPrecio(this.precio + (208.03 * this.peso));
            
            case PLATA -> this.setPrecio(this.precio + (50.6 * this.peso));
            
            case TEST -> this.precio = 999999;

            
        }
        return this.precio;
    }
}
