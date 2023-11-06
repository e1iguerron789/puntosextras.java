public class Producto {

    public String nombreproducto;
    private String tipo;

    private int cantidadproducto;

    private int cantidadminima;
    private double precio;



    public Producto(String nombreproducto, String tipo, int cantidadproducto , int cantidadminima, double precio) {
        this.nombreproducto = nombreproducto;
        this.tipo= tipo;
        this.cantidadproducto = cantidadproducto;
        this.cantidadminima = cantidadminima;
        this.precio = precio;

    }

    public int abastecerProducto(int pcantidadproducto)
    {
        return cantidadproducto=cantidadproducto+pcantidadproducto;
    }
    public void cambiarProducto(String pnombreproducto, String ptipo, int pcantidadproducto , int pcantidadminima, double pprecio )
    {
       nombreproducto=pnombreproducto;
       tipo=ptipo;
       cantidadproducto=pcantidadproducto;
       cantidadminima=pcantidadminima;
       precio=pprecio;

    }


    @Override
    public String toString() {
        String p = "Nombre del Producto: " +
                nombreproducto+
                "\nTipo de Producto : Producto de "+ tipo +
                "\nCantidad actual del producto en la tienda: " + cantidadproducto +
                "\nCantidad mínima para abastecimiento del producto:" + cantidadminima +
                "\nPrecio base de venta por unidad.: " + precio +
                "\nPrecio final con IVA:";
        return p;
    }



}
