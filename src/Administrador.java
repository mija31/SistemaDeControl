import java.util.ArrayList;

public class Administrador extends Usuario implements ReqDocente, ReqEstudiante
{
    private ArrayList<Grupo> grupos=new ArrayList<Grupo>();
    private ArrayList<Docente> docentes=new  ArrayList<Docente>();
    //private ArrayList<String> contrase�as= new ArrayList<String>();
    public Administrador(String nomb,String contr,String nombU)
    {
        super(nomb,contr,nombU);
    }
    public Administrador()
    {
    super();
    }
    /*public ArrayList<String> getListaContrase�as()
    {
        return contrase�as;
    }*/
   /* public boolean validarContr(String s)
    { boolean aux=false;
    if(contrase�as.contains(s))
    aux=true;
   return aux; 
   }*/
   public boolean validarDocente(String nombU,String contr)
   {
       boolean res=false;
       for(int i=0;i<=docentes.size()-1;i++){
          if(docentes.get(i).getNombU().equals(nombU))
          {
            if(docentes.get(i).getContrase�a().equals(contr))
              res= true;
           }     
            }
             return res;
        
       
    }
    public void cambiarContrase�adoc(String c,Docente doc)
    {
      if(docentes.contains(doc)){
        String ac=doc.getContrase�a();
        doc.setContrase�a(c);
       }
    }
   /* private void eliminarContrase�aLista(String ac)
    {
       int i=contrase�as.indexOf(ac);
       contrase�as.remove(i);
    }*/
    public void crearDocente(String n, String c,String nUs){
      Docente d=new Docente(n,c,nUs);
      docentes.add(d);
      d.setContrase�a(c);
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
    public void darContrase�aEstudiante(){
    
    }
    public void importarDatos()
    {
        
    }
    public void a�adirGrupo(Grupo g)
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
            System.out.println("Fecha de presentaci�n:"+g.getEvaluacion(f).getFechPresent().getDia()+
                             "/"+g.getEvaluacion(f).getFechPresent().getMes()+"/"+g.getEvaluacion(f).getFechPresent().getA�o()); 
            System.out.println("Calificaci�n: "+g.getEvaluacion(f).getCalificacion());
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
