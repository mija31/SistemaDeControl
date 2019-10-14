
/**
 * Write a description of class Ecaluacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Evaluacion
{
    
    private int calificacion;
    private Fecha fechaPresentacion;
    private String observaciones;
    private String avances;
    private int faltas;
    private boolean alertaAplazo;
    
    public Evaluacion(Fecha f)
    {
        calificacion =0;
        fechaPresentacion=f;
        observaciones="";
        avances="";
        faltas=0;
        alertaAplazo=false;
    }
  public Evaluacion()
  {
     calificacion =0;
        fechaPresentacion=new Fecha(01,01,2000);
        observaciones="";
        avances="";
        faltas=0;
        alertaAplazo=false;
    }
    public int getCalificacion()
    {
        return calificacion;
    }
    public void setCalificacion(int nota)
    {
        calificacion = nota;
    }
    public Fecha getFechPresent()
    {
        return fechaPresentacion;
    }
    public void setFechPresent(Fecha f)
    {
        fechaPresentacion=f;
    }
    public String getObserv()
    {
        return observaciones;
    }
    public void setObserv(String obs)
    {
        observaciones=obs;
    }
    public String getAvance()
    {
        return avances;
    }
    public void setAvance(String avanc)
    {
        avances=avanc;
    }
    public int getFaltas()
    {
        return faltas;
    }
    public void setFaltas()
    {
        
    }
    public boolean getAlerta()
    {
        return alertaAplazo;
    }
}
