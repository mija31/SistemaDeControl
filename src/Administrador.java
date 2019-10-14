import java.util.ArrayList;

public class Administrador extends Usuario implements ReqDocente, ReqEstudiante
{
    private ArrayList<Grupo> grupos=new ArrayList<Grupo>();
    private ArrayList<Docente> docentes=new  ArrayList<Docente>();
    //private ArrayList<String> contraseñas= new ArrayList<String>();
    public Administrador(String nomb,String contr,String nombU)
    {
        super(nomb,contr,nombU);
    }
    public Administrador()
    {
    super();
    }
    /*public ArrayList<String> getListaContraseñas()
    {
        return contraseñas;
    }*/
   /* public boolean validarContr(String s)
    { boolean aux=false;
    if(contraseñas.contains(s))
    aux=true;
   return aux; 
   }*/
   public boolean validarDocente(String nombU,String contr)
   {
       boolean res=false;
       for(int i=0;i<=docentes.size()-1;i++){
          if(docentes.get(i).getNombU().equals(nombU))
          {
            if(docentes.get(i).getContraseña().equals(contr))
              res= true;
           }     
            }
             return res;
        
       
    }
    public void cambiarContraseñadoc(String c,Docente doc)
    {
      if(docentes.contains(doc)){
        String ac=doc.getContraseña();
        doc.setContraseña(c);
       }
    }
   /* private void eliminarContraseñaLista(String ac)
    {
       int i=contraseñas.indexOf(ac);
       contraseñas.remove(i);
    }*/
    public void crearDocente(String n, String c,String nUs){
      Docente d=new Docente(n,c,nUs);
      docentes.add(d);
      d.setContraseña(c);
      nombreUsuario=nUs;
    }
    public void eliminarDocente(Docente d)
    {
        for(int i=0 ;i<=docentes.size()-1;i++)
        {
            if(docentes.get(i).equals(d))
            docentes.remove(i);
        }
           
    
    }
    public void darContraseñaEstudiante(){
    
    }
    public void importarDatos()
    {
        
    }
    public void añadirGrupo(Grupo g)
    {
      if(!grupos.contains(g))
           grupos.add(g);
           else
           System.out.println("El grupo "+g.getNombre()+" ya existe en la lista");  
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
    public void controlarFaltas()
    {
        
    }
    public void guardarGrupos(){
    
    }
}
