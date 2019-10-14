import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
//archivos
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
//librerias ajenas a itext
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import sun.applet.Main;
import java.util.ArrayList;
/**
 * 
 * @author Lourdes
 */
public class Javapdf {
   
    private File ruta_destino=null;
    private String t="Evaluacion";
    private String a="Administrador";
    private String s="";
    
    public Javapdf(){    
    }
    
    /* metodo que hace uso de la clase itext para manipular archivos PDF*/
    public void crear_PDF(String n, ArrayList<Estudiante> integr, String obs, String av, String cal){
        //abre ventana de dialogo "guardar"
        Colocar_Destino();
        //si destino es diferente de null
        if(this.ruta_destino!=null){
            try {
                // se crea instancia del documento
                Document mipdf = new Document();
                // se establece una instancia a un documento pdf
                PdfWriter.getInstance(mipdf, new FileOutputStream(this.ruta_destino + ".pdf"));
                mipdf.open();// se abre el documento
                mipdf.addTitle(t); // se añade el titulo
                mipdf.addAuthor(a); // se añade el autor del documento
                mipdf.addSubject(s); //se añade el asunto del documento
                mipdf.add(new Paragraph("*******************INFORME*******************"));
                mipdf.add(new Paragraph(""));
                mipdf.add(new Paragraph("NOMBRE DE GRUPO:"));
                mipdf.add(new Paragraph("                         "+n));
                mipdf.add(new Paragraph("INTEGRANTES: "));
                for(int i=0;i<integr.size();i++){
                mipdf.add(new Paragraph(integr.get(i).getNombre()));}
                mipdf.add(new Paragraph("OBSERVACIONES: "));
                mipdf.add(new Paragraph(obs));
                mipdf.add(new Paragraph("AVANCES: "));
                mipdf.add(new Paragraph(av));
                mipdf.add(new Paragraph("CALIFICACION: "));
                mipdf.add(new Paragraph(cal));
                mipdf.close(); //se cierra el PDF&
                JOptionPane.showMessageDialog(null,"Documento PDF creado");
            } catch (DocumentException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }        
    }
    /* abre la ventana de dialogo GUARDAR*/
    public void Colocar_Destino(){
       FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo PDF","pdf","PDF");
       JFileChooser fileChooser = new JFileChooser();       
       fileChooser.setFileFilter(filter);
       int result = fileChooser.showSaveDialog(null);
       if ( result == JFileChooser.APPROVE_OPTION ){   
           this.ruta_destino = fileChooser.getSelectedFile().getAbsoluteFile();
        }
    }    
}

