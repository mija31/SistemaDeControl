
/**
 * Write a description of class Fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fecha
{
    private int dia;
    private int mes;
    private int a�o;
    
    public Fecha(int d,int m,int a)
    {
       dia = d;
       mes = m;
       a�o = a;
    }

    public int getDia()
    {
       return dia;
    }
    public int getMes()
    {
        return mes;
    }
    public int getA�o()
    {
        return a�o;
    }
    public void setDia(int d)
    {
       if (d>0&&d<=31)
       dia=d;
       else
       dia=1;
       
    }
    public void setMes(int m)
    {
        if(m>0&&m<13)
        mes=m;
        else
        mes=1;
        
    }
    public void setA�o(int a)
    {
        if(a>1990)
        a�o=a;
        else
        a�o=1990;
    }
    public void impFecha()
    {
        System.out.println(getDia()+"/"+getMes()+"/"+getA�o());
    }
}
