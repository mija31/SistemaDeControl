

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
 
public class readText {
 

public static void main(String[] args) {
File f = new File( "C:/Users/baldelomar/Desktop/texto.txt" );
BufferedReader entrada= null;
try {
entrada = new BufferedReader( new FileReader( f ) );
String linea;
while(entrada.ready()){
linea = entrada.readLine();
System.out.println(linea);
}
}catch (IOException e) {
e.printStackTrace();
}
finally
{
try{
entrada.close();
}catch(IOException e1){}
}
}
}  