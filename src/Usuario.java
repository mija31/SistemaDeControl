

public abstract class Usuario
{
    protected String nombre;
    protected String contrase�a;
    protected String nombreUsuario;
    
    public Usuario(String nomb,String contr, String nombU)
    {
        nombre=nomb;
        contrase�a=contr;
        nombreUsuario= nombU;
    }
    public Usuario()
    {
        nombre="";
        contrase�a="";
    }
}
