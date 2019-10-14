import java.util.ArrayList;
import java.io.*;
import javax.swing.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paredes
 */
public class ventanaEstudiantes extends javax.swing.JFrame {
 private Grupo s;
    /**
     * Creates new form ventanaEstudiante
     */
    public ventanaEstudiantes(Grupo g, Fecha f) {
        s=g;
        initComponents(g,f);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents(Grupo g,Fecha f) {

        jPanel1 = new javax.swing.JPanel();
        nombreGrupo = new javax.swing.JLabel();
        campoNombreG = new javax.swing.JTextField(g.getNombre());
        integrantes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaIntegrantes = new javax.swing.JList(darNombres(g.getIntegrantes()));
        observaciones = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textoObservaciones = new javax.swing.JTextArea(g.getEvaluacion(f).getObserv(),1,10);
        avances = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textoAvances = new javax.swing.JTextArea(g.getEvaluacion(f).getAvance(),0,1);
        jScrollPane4 = new javax.swing.JScrollPane();
        listaArchivos = new javax.swing.JList();
        archivosSubidos = new javax.swing.JLabel();
        botonSubirArch = new javax.swing.JButton();
        botonAbrir = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setTitle("Informe Estudiante");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informe:"));

        nombreGrupo.setText("Nombre Grupo:");

        campoNombreG.setEditable(false);

        integrantes.setText("Integrantes:");

        listaIntegrantes.setEnabled(false);
        jScrollPane1.setViewportView(listaIntegrantes);

        observaciones.setText("Observaciones:");

        textoObservaciones.setEditable(false);
        textoObservaciones.setColumns(20);
        textoObservaciones.setRows(5);
        jScrollPane2.setViewportView(textoObservaciones);

        avances.setText("Avances:");

        textoAvances.setEditable(false);
        textoAvances.setColumns(20);
        textoAvances.setRows(5);
        jScrollPane3.setViewportView(textoAvances);

        listaArchivos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(listaArchivos);

        archivosSubidos.setText("Archivos subidos:");

        botonSubirArch.setText("Subir Archivo");
        botonSubirArch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSubirArchActionPerformed(evt);
            }
        });

        botonAbrir.setText("Abrir");

        botonEliminar.setText("Eliminar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(integrantes)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(nombreGrupo)
                        .addGap(18, 18, 18)
                        .addComponent(campoNombreG, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(avances)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(observaciones))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(archivosSubidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonSubirArch)
                            .addComponent(botonAbrir)
                            .addComponent(botonEliminar))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreGrupo)
                    .addComponent(campoNombreG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(integrantes)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(observaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avances)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(archivosSubidos)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonSubirArch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonAbrir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonEliminar))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))))
        );

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Guardar PDF");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               jMenuItem1ActionPerformed(evt);
            }
        });
        
    }// </editor-fold>

    private void botonSubirArchActionPerformed(java.awt.event.ActionEvent evt) {                                               
        new ventanaArchivo().setVisible(true);
    }                                              

     public void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
               Javapdf pdf=new Javapdf();
               pdf.crear_PDF(campoNombreG.getText(),s.getIntegrantes(),textoObservaciones.getText(),textoAvances.getText(),listaArchivos.getName());
            }
    
    public DefaultListModel darNombres(ArrayList<Estudiante> i){
    DefaultListModel modelo = new DefaultListModel();
     for( int s=0 ; s < i.size() ; s++ ){
     modelo.addElement(i.get(s).getNombre());
     }
     return modelo;
    }         
            
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Grupo gr=new Grupo("losMachos");
        Estudiante es=new Estudiante("maria","78","2009024","7845562","maria78");
        Estudiante sa=new Estudiante("carlos","10","2009059","4875263","carlos10");
        Evaluacion see=new Evaluacion();
        Evaluacion sii=new Evaluacion();
        Fecha f=new Fecha(14,4,2013);
         Fecha w=new Fecha(20,4,2013);
        see.setCalificacion(51);
        see.setFechPresent(f);
        see.setObserv("estos chicos se pasaron el programa que acaban de hacer es muy bueno tanto que me lo voy a quedar muajajajajaja");
        see.setAvance("no mucho");
         sii.setCalificacion(100);
        sii.setFechPresent(w);
        sii.setObserv("excelente");
        sii.setAvance("muy bueno");
        gr.setIntegrante(es);
        gr.setIntegrante(sa);
        gr.setEvaluacion(see);
        gr.setEvaluacion(sii);
                new ventanaEstudiantes(gr,w).setVisible(true);
            
    }
    // Variables declaration - do not modify
    private javax.swing.JLabel archivosSubidos;
    private javax.swing.JLabel avances;
    private javax.swing.JButton botonAbrir;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonSubirArch;
    private javax.swing.JTextField campoNombreG;
    private javax.swing.JLabel integrantes;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList listaArchivos;
    private javax.swing.JList listaIntegrantes;
    private javax.swing.JLabel nombreGrupo;
    private javax.swing.JLabel observaciones;
    private javax.swing.JTextArea textoAvances;
    private javax.swing.JTextArea textoObservaciones;
    // End of variables declaration
}
