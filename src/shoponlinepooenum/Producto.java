package shoponlinepooenum;

public abstract class Producto {
 protected String desc;
 protected double precio;
 protected double codigo;

    public Producto(String desc, double precio, double codigo) {
        this.desc = desc;
        this.precio = precio;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return this.desc + "........ $ " + this.precio;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract double getPrecio();

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

