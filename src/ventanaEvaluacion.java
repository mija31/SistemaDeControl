import java.util.ArrayList;
public class ventanaEvaluacion extends javax.swing.JFrame {

   private javax.swing.JMenu Archivo;
    private javax.swing.JLabel Calificacion;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JLabel anio;
    private javax.swing.JLabel avances;
    private javax.swing.JButton botonRegistro;
    private javax.swing.JTextPane campoAvances;
    private javax.swing.JTextField campoNombreG;
    private javax.swing.JTextPane campoObser;
    private javax.swing.JComboBox comboAnio;
    private javax.swing.JComboBox comboCalificacion;
    private javax.swing.JComboBox comboDia;
    private javax.swing.JComboBox comboMes;
    private javax.swing.JLabel dia;
    private javax.swing.JLabel fechas;
    private javax.swing.JMenuItem imprimirGrupo;
    private javax.swing.JCheckBox integrante1;
    private javax.swing.JCheckBox integrante2;
    private javax.swing.JCheckBox integrante3;
    private javax.swing.JCheckBox integrante4;
    private javax.swing.JCheckBox integrante5;
    private javax.swing.JLabel integrantes;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel mes;
    private javax.swing.JLabel nombreGrupo;
    private javax.swing.JLabel notificaciones;
    private javax.swing.JLabel observaciones;
    private javax.swing.JMenuItem salir;
    
    public ventanaEvaluacion(Grupo g, Fecha f) {
        initComponents(g,f);
        darNombres(g.getIntegrantes());
    }
    private void initComponents(Grupo g,Fecha f){

        jPanel1 = new javax.swing.JPanel();
        nombreGrupo = new javax.swing.JLabel();
        campoNombreG = new javax.swing.JTextField(g.getNombre());
        integrantes = new javax.swing.JLabel();
        observaciones = new javax.swing.JLabel();
        avances = new javax.swing.JLabel();
        fechas = new javax.swing.JLabel();
        comboDia = new javax.swing.JComboBox();
        comboMes = new javax.swing.JComboBox();
        comboAnio = new javax.swing.JComboBox();
        dia = new javax.swing.JLabel();
        mes = new javax.swing.JLabel();
        anio = new javax.swing.JLabel();
        botonRegistro = new javax.swing.JButton();
        integrante1 = new javax.swing.JCheckBox();
        integrante2 = new javax.swing.JCheckBox();
        integrante3 = new javax.swing.JCheckBox();
        integrante4 = new javax.swing.JCheckBox();
        integrante5 = new javax.swing.JCheckBox();
        Calificacion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoObser = new javax.swing.JTextPane();
       // campoObser.setText(g.getEvaluacion(f).getObserv());
       
        jScrollPane4 = new javax.swing.JScrollPane();
        campoAvances = new javax.swing.JTextPane();
        //campoAvances.setText(g.getEvaluacion(f).getAvance());
       
        comboCalificacion = new javax.swing.JComboBox();
        notificaciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        imprimirGrupo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Evaluacion");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Evaluación"));

        nombreGrupo.setFont(new java.awt.Font("Verdana", 1, 11));
        nombreGrupo.setText("Nombre Del Grupo:");

        campoNombreG.setEditable(false);

        integrantes.setFont(new java.awt.Font("Verdana", 1, 11)); 
        integrantes.setText("Integrantes:");

        observaciones.setFont(new java.awt.Font("Verdana", 1, 11)); 
        observaciones.setText("Observaciónes:");

        avances.setFont(new java.awt.Font("Verdana", 1, 11)); 
        avances.setText("Avances:");

        fechas.setFont(new java.awt.Font("Verdana", 1, 11)); 
        fechas.setText("Proxima Fecha:");

        comboDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04" }));
        comboDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDiaActionPerformed(evt);
            }
        });

        comboMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03" }));

        comboAnio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2011", "2012", "2013", "2014" }));

        dia.setText("Dia:");

        mes.setText("Mes:");

        anio.setText("Año:");

        botonRegistro.setText("Registar");

        integrante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                integrante1ActionPerformed(evt);
            }
        });

        integrante2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                integrante2ActionPerformed(evt);
            }
        });

        integrante3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                integrante3ActionPerformed(evt);
            }
        });

        integrante4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                integrante4ActionPerformed(evt);
            }
        });

        integrante5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                integrante5ActionPerformed(evt);
            }
        });

        Calificacion.setFont(new java.awt.Font("Verdana", 1, 11)); 
        Calificacion.setText("Calificaion:");

        jScrollPane2.setViewportView(campoObser);

        jScrollPane4.setViewportView(campoAvances);

        comboCalificacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Muy Buena ", "Buena ", "Regular", "Mala" }));

        notificaciones.setFont(new java.awt.Font("Verdana", 1, 11)); 
        notificaciones.setText("Notificaciones:");

        jScrollPane1.setViewportView(jTextPane1);

        jButton1.setText("Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane2)
                            .addComponent(notificaciones, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(botonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mes)
                            .addComponent(fechas))
                        .addGap(31, 31, 31)
                        .addComponent(anio)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dia)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Calificacion)
                            .addComponent(comboCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nombreGrupo)
                        .addGap(26, 26, 26)
                        .addComponent(campoNombreG, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(observaciones))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(avances)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(integrantes)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(integrante2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(integrante3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(integrante4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(integrante5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(integrante1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreGrupo)
                    .addComponent(campoNombreG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(integrantes)
                    .addComponent(integrante1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(integrante2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(integrante3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(integrante4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(integrante5)
                .addGap(6, 6, 6)
                .addComponent(observaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avances)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fechas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Calificacion)
                    .addComponent(dia)
                    .addComponent(mes)
                    .addComponent(anio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(notificaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonRegistro)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Archivo.setText("Archivo");

        imprimirGrupo.setText("Imprimir Grupo");
        Archivo.add(imprimirGrupo);
        Archivo.add(jSeparator1);

        salir.setText("Salir");
        Archivo.add(salir);

        Menu.add(Archivo);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
    }

    private void comboDiaActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void integrante4ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void integrante1ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void integrante2ActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void integrante3ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void integrante5ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
    private void darNombres(ArrayList<Estudiante> e){
        for(int i= 0; i<=e.size()-1;i++)
        {
            integrante1.setText(e.get(i).getNombre());
        }
    }
    public static void main(String[] args){
    Grupo gr=new Grupo("Jala Soft");
        Estudiante es=new Estudiante("maria delgadillo peres","78","2009024","7845562","maria78");
       // Estudiante sa=new Estudiante("carlos garcia ponce ","00","2009059","4875263");
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
       // gr.setIntegrante(sa);
        gr.setEvaluacion(see);
        gr.setEvaluacion(sii);
        new ventanaEvaluacion(gr,w).setVisible(true);
    }
        
}
