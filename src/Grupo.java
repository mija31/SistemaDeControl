import java.util.ArrayList;

public class Grupo 
{
    private String nombre;
    private ArrayList<Estudiante> integrantes;
    private ArrayList<Evaluacion> evaluaciones;
    
    public Grupo(String nombre)
    {
       this.nombre=nombre;
       integrantes=new ArrayList<Estudiante>();
       evaluaciones=new ArrayList<Evaluacion>();
    }
    
    public Grupo()
    {
        nombre="";
        integrantes=new ArrayList<Estudiante>();
        evaluaciones=new ArrayList<Evaluacion>();
    }

    public String getNombre()
    {
        return nombre;
    }
    public ArrayList<Estudiante> getIntegrantes()
    {
        return integrantes;
    }
    public Evaluacion getEvaluacion(Fecha f)
    {  Evaluacion aux= new Evaluacion();
      
      for(Evaluacion res : evaluaciones)
       if(res.getFechPresent()==f)
       aux=res;
         return aux;
    }
    public void setIntegrante(Estudiante e)
    {
        if(!integrantes.contains(e))
            integrantes.add(e);
          else
            System.out.println("El estudiante "+e.getNombre()+" ya existe en el grupo");
          
    }
    public void setNombre(String n)
    {
        nombre=n;
    }
    
    
    public void setEvaluacion(Evaluacion e){
    
        evaluaciones.add(e);
    }
}
