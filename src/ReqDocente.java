

public interface ReqDocente
{
     public void importarDatos();
     public Grupo seleccionarGrupo(Grupo nombGrup);
     public void añadirGrupo(Grupo g);
     public void eliminarGrupo(Grupo g);
     public void modificarGrupo();
     public void subirArchivo();
     public void eliminarArchivo();
     public void imprimirTodo();
     public void imprimirGrupo(Grupo g,Fecha f);
     public void guardarGrupos();
}
