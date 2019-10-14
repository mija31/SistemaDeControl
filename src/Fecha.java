
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
    private int año;
    
    public Fecha(int d,int m,int a)
    {
       dia = d;
       mes = m;
       año = a;
    }

    public int getDia()
    {
       return dia;
    }
    public int getMes()
    {
        return mes;
    }
    public int getAño()
    {
        return año;
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
    public void setAño(int a)
    {
        if(a>1990)
        año=a;
        else
        año=1990;
    }
    public void impFecha()
    {
        System.out.println(getDia()+"/"+getMes()+"/"+getAño());
    }
}
