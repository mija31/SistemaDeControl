

public abstract class Usuario
{
    protected String nombre;
    protected String contraseņa;
    protected String nombreUsuario;
    
    public Usuario(String nomb,String contr, String nombU)
    {
        nombre=nomb;
        contraseņa=contr;
        nombreUsuario= nombU;
    }
    public Usuario()
    {
        nombre="";
        contraseņa="";
    }
}
