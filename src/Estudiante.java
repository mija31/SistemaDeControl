
/**
 * Write a description of class Estudiante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estudiante extends Usuario implements ReqEstudiante
{
    private Grupo grupo;
    private String codSis;
    private String ci;
    private int faltas;
    private boolean alerta;
    
    public Estudiante(String nombre,String contraseña,String nombU,String codSis,String ci)
    {
       super(nombre,contraseña,nombU);
       this.codSis=codSis;
       this.ci=ci;
       alerta=false;
       faltas=0;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    public String getCodSis()
    {
        return codSis;
    }
    public Grupo getGrupo()
    {
        return grupo;
    }
    public int getFaltas()
    {
        return faltas;
    }
    
     public boolean alertaAplazo()
    {
        return alerta;
    }
    public void setGrupo(Grupo g)
    {
     grupo=g;
    }
    public void setFaltas(int i)
    {
        faltas=faltas+i;
    }
     public void setAlerta(
    )
    {
        alerta=true;
    }
    public void imprimirGrupo(Fecha f)
    {
       
    }
    public void subirArchivo()
    {
    }
}
