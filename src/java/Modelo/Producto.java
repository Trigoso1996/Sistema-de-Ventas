package Modelo;
// Generated 06/06/2020 08:19:41 PM by Hibernate Tools 3.6.0



/**
 * Producto generated by hbm2java
 */
public class Producto  implements java.io.Serializable {


     private Integer idProducto;
     private String producto;
     private int precio;

    public Producto() {
    }

    public Producto(String producto, int precio) {
       this.producto = producto;
       this.precio = precio;
    }
   
    public Integer getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
    public String getProducto() {
        return this.producto;
    }
    
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public int getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }




}


