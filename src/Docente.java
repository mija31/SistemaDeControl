import java.util.ArrayList;
import java.io.*;
/**
 * Write a description of class Docente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Docente extends Usuario implements ReqDocente
{
    private ArrayList<Grupo> grupos;
    
    public Docente(String nomb,String contr, String nombU)
    {
        super(nomb,contr,nombU);
        grupos=new ArrayList<Grupo>();
    }

    public void importarDatos()
    {
    }
    public void setContraseña(String c){
    contraseña=c;
    }
    public String getNombre()
    {
        return nombre;
    }
    public String getContraseña()
    {
        return contraseña;
    }
    public String getNombU()
    {
        return nombreUsuario;
    }
    public Grupo seleccionarGrupo(Grupo nombGrup)
    {
        Grupo g=new Grupo();
       if(!grupos.isEmpty() && grupos.contains(nombGrup))
       {
          int i= grupos.indexOf(nombGrup);
          g=grupos.get(i);
        }
        return g;
    }
    public Evaluacion getEvaluacion(Grupo g,Fecha f)
    {
      Evaluacion ev= new Evaluacion();  
      if(grupos.contains(g))
         ev= g.getEvaluacion(f);
         return ev;
    }
    public void añadirGrupo(Grupo g)
    {
        if(!grupos.contains(g))
           grupos.add(g);
           else
           System.out.println("El grupo "+g.getNombre()+" ya existe en la lista");
    }
    public void añadirEstudiante(Estudiante e,Grupo g)
    {
        if(grupos.contains(g)){
         if(g.getIntegrantes().size()<=5)
          {
              g.setIntegrante(e);
              e.setGrupo(g);
              
            }
        }
    }
    public void eliminarGrupo(Grupo g)
    {
        if(grupos.contains(g))
        {
            int i=grupos.indexOf(g);
            grupos.remove(i);
        }
        else
            System.out.println("El grupo "+g.getNombre()+" no existe en la lista");
    }
    public void modificarGrupo()
    {
    }
    public void modificarNombreGrupo(Grupo g,String n)
    {
        if(grupos.contains(g))
           g.setNombre(n);
    }
    public void eliminarEstudiante(Grupo g,Estudiante e)
    {
        if(grupos.contains(g)&& g.getIntegrantes().contains(e))
        {
            int i=g.getIntegrantes().indexOf(e);
            g.getIntegrantes().remove(i);
        }
    }
    public void subirArchivo()
    {
    }
    public void eliminarArchivo()
    {
    }
    public void imprimirTodo()
    {
       
    }
    public void imprimirGrupo(Grupo g,Fecha f)
    {
        if(grupos.contains(g))
        {
            
            System.out.println("NOMBRE DE GRUPO: "+g.getNombre());
            System.out.println("Fecha de presentación:"+g.getEvaluacion(f).getFechPresent().getDia()+
                             "/"+g.getEvaluacion(f).getFechPresent().getMes()+"/"+g.getEvaluacion(f).getFechPresent().getAño()); 
            System.out.println("Calificación: "+g.getEvaluacion(f).getCalificacion());
            System.out.println("Observaciones: "+g.getEvaluacion(f).getObserv());
            System.out.println("Avances: "+g.getEvaluacion(f).getAvance());
            System.out.println("Integrantes :");
            
            for(Estudiante e: g.getIntegrantes())
            {
                System.out.println("             "+e.getNombre()+"                   "+e.getFaltas());
            }
        }  
    }
    public void ponerFaltas(Estudiante est,Grupo g)
    {
      if(grupos.contains(g)&&g.getIntegrantes().contains(est)){
        if(est.getFaltas()<3)
        est.setFaltas(1);
        if(est.getFaltas()==2)
        est.setAlerta();
        }  
    }
    public void setCalificacion(Grupo g,int nota,Fecha f)
    {
        if(grupos.contains(g))
           g.getEvaluacion(f).setCalificacion(nota);
    }
    public void cambiarCalificacion()
    {
    }
    public void setObservaciones(Grupo g,String obs,Fecha f)
    {
        if(grupos.contains(g))
            g.getEvaluacion(f).setObserv(obs);
    }
    public void setAvances(Grupo g,String avanc,Fecha f)
    {
        if(grupos.contains(g))
            g.getEvaluacion(f).setAvance(avanc);
    }
    public void setFechaPresentacion(Grupo grupo,Fecha f)
    {
        Evaluacion ev=new Evaluacion(f);
       if(!grupos.isEmpty()&& grupos.contains(grupo))
            grupo.setEvaluacion(ev);
            else
            System.out.println("El grupo "+grupo.getNombre()+" no se encuentra en la lista");
    }
    
    
    public void guardarGrupos(){
        
       
        try {
            FileOutputStream fileOut = new FileOutputStream("datos.dat");
        
            ObjectOutputStream salida = new ObjectOutputStream(fileOut);
        
            salida.writeObject(this.grupos);
            salida.close();
        }
        catch(IOException ioe) { System.out.println("Error al escribir"); }
        //catch(FileNotFoundException fnfe) { System.out.println("Archivo no encontrado"); }
    
    }
}
