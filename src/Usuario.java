

public abstract class Usuario
{
    protected String nombre;
    protected String contraseña;
    protected String nombreUsuario;
    
    public Usuario(String nomb,String contr, String nombU)
    {
        nombre=nomb;
        contraseña=contr;
        nombreUsuario= nombU;
    }
    public Usuario()
    {
        nombre="";
        contraseña="";
    }
}
