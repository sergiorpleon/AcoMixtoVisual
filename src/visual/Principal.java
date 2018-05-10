/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Principal.java
 *
 * Created on 27-may-2013, 8:08:33
 */

package visual;
import ecuacion.*;
import aco_max_min.*;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author pc
 */
public class Principal extends javax.swing.JFrame {
    private Ecuacion e;

private int cantidad_variable;
private int grado_presicion;
private int cantidad_iteraciones;
private int cantidad_hormigas;

private int contador;

private String[] nombre;
private String[] descripcion;
private String[] tipo;
private boolean[] es_dominio;
private String[][] max_min;
private String[] dominio;

    /** Creates new form Principal */
    public Principal() {
        initComponents();
        this.pack();
        jDialog1.pack();
        jDialog2.pack();
        this.setLocationRelativeTo(null);
        jDialog1.setLocationRelativeTo(null);
        jDialog2.setLocationRelativeTo(null);
        jSpinner1.setModel(new SpinnerNumberModel(100, 1, 10000, 1));
        jSpinner2.setModel(new SpinnerNumberModel(20, 1, 1000, 1));
        jSpinner3.setModel(new SpinnerNumberModel(5, 1, 100, 1));
        jSpinner4.setModel(new SpinnerNumberModel(2, 1, 20, 1));
        
        

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        jDialog2 = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();

        jDialog1.setTitle("CREACION DE LAS VARIABLES");
        jDialog1.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jDialog1WindowClosing(evt);
            }
        });
        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");
        jDialog1.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 32, -1, -1));
        jDialog1.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 74, 14));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tipo");
        jDialog1.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "continua", "discreta" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 57, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Descripción");
        jDialog1.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 94, -1, -1));
        jDialog1.getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 88, 293, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Dominio");
        jDialog1.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        jDialog1.getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 369, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Rango");
        jDialog1.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Máximo:");
        jDialog1.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));
        jDialog1.getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 60, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Mínimo:");
        jDialog1.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));
        jDialog1.getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 60, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/right.gif"))); // NOI18N
        jButton2.setText("Siguiente");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/left.GIF"))); // NOI18N
        jButton3.setText("Anterior");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1.setText("Insertar dominio");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Insertar rango");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));
        jDialog1.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 40, 10));

        jDialog2.setTitle("EVALUACION DE LA FUNCION");
        jDialog2.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jDialog2WindowClosing(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Función  =");

        jTextArea1.setColumns(5);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jTextArea1.setAutoscrolls(false);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setEditable(false);
        jTextArea2.setRows(5);
        jTextArea2.setAutoscrolls(false);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Variable");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Descripción");

        jTextArea3.setColumns(10);
        jTextArea3.setEditable(false);
        jTextArea3.setRows(5);
        jTextArea3.setAutoscrolls(false);
        jScrollPane3.setViewportView(jTextArea3);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Valor");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Mínimo");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/about.png"))); // NOI18N
        jButton4.setText("Inicio");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextArea4.setColumns(20);
        jTextArea4.setRows(1);
        jScrollPane4.setViewportView(jTextArea4);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play.png"))); // NOI18N
        jButton5.setText("Evaluar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDialog2Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                        .addGap(20, 20, 20))
                                    .addGroup(jDialog2Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                            .addGroup(jDialog2Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                .addGap(52, 52, 52)))
                        .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog2Layout.createSequentialGroup()
                                .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                .addGap(196, 196, 196))
                            .addGroup(jDialog2Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                                .addGap(15, 15, 15)))
                        .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDialog2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))))
                .addGap(28, 28, 28))
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(520, 520, 520))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(7, 7, 7))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 2, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addGap(23, 23, 23))
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ACO MIXTO");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cantidad de variables");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Grado de presición");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/package_settings.png"))); // NOI18N
        jButton1.setText("Crear variables");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Cantidad de hormigas");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Cantidad de iteraciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(47, 47, 47)
                                .addComponent(jSpinner4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(19, 19, 19)
                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(27, 27, 27)
                                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(31, 31, 31)
                                        .addComponent(jSpinner3)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        cantidad_iteraciones = (Integer)jSpinner1.getValue();
        cantidad_hormigas = (Integer)jSpinner2.getValue();
        cantidad_variable = (Integer)jSpinner3.getValue();
        grado_presicion = (Integer)jSpinner4.getValue();
        contador = 0;

        nombre = new String[cantidad_variable];
        tipo = new String[cantidad_variable];
        descripcion = new String[cantidad_variable];
        dominio = new String[cantidad_variable];
        max_min = new String[cantidad_variable][2];
        es_dominio = new boolean[cantidad_variable];

        jLabel4.setText("X" + (contador + 1) );
        jButton3.setVisible(false);

        jLabel7.setVisible(false);
        jTextField4.setVisible(false);
        jRadioButton1.setVisible(false);
        jRadioButton2.setVisible(false);


        this.setVisible(false);
        jDialog1.setVisible(true);
        jDialog1.setEnabled(true);


                
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Asegurese de inbtroducir correctamente los valores", "Error", WIDTH);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton2.setVisible(true);
        contador --;
        jLabel4.setText(nombre[contador]);
        jTextField3.setText(descripcion[contador]);

        if(tipo[contador].compareToIgnoreCase("continua") == 0){
            jComboBox1.setSelectedIndex(0);
            jTextField5.setText(max_min[contador][0]);
            jTextField6.setText(max_min[contador][1]);

        }else{
            if(es_dominio[contador] ){
                jTextField4.setText(dominio[contador]);
                jRadioButton1.setSelected(true);
            }else{
                jTextField5.setText(max_min[contador][0]);
                jTextField6.setText(max_min[contador][1]);
                jRadioButton2.setSelected(true);
            }
        }

        if(contador == 0){
            jButton3.setVisible(false);
        }else{
            jButton3.setVisible(true);
        }
        
        




    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
        jButton3.setVisible(true);
        nombre[contador] = jLabel4.getText();
        descripcion[contador] = jTextField3.getText();
        es_dominio[contador] = false;

        if(jComboBox1.getSelectedIndex()== 0){
            tipo[contador] = "continua";
            max_min[contador][0] = jTextField5.getText();
            max_min[contador][1] = jTextField6.getText();
            

        }else{
            tipo[contador] = "discreta";
            if(jRadioButton1.isSelected()){
                dominio[contador] = jTextField4.getText();
                es_dominio[contador] = true;
            }else{
                max_min[contador][0] = jTextField5.getText();
                max_min[contador][1] = jTextField6.getText();
                
            }
        }
        contador ++;
        jLabel4.setText("X" + (contador + 1) );

        
        



        if(contador == (cantidad_variable)){
            
            jDialog1.setVisible(false);
            jDialog2.setVisible(true);
            jDialog2.setEnabled(true);

            String s1 = "";
            for(int i = 0; i < nombre.length; i++){
                s1 += nombre[i] + "\n";
            }
            jTextArea1.setText(s1);
            this.crearEcuacion();

            String s2 = "";
            for(int i = 0; i < nombre.length; i++){
                s2 += descripcion[i] + "\n";
            }
            jTextArea2.setText(s2);

        }


        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Asegurese de introducir correctamente los valores", "Error", WIDTH);
            jDialog2.setVisible(false);
            jDialog1.setVisible(true);
            jDialog1.setEnabled(true);
            jButton3ActionPerformed(evt);
        }

        




    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
        String[] cadena;
        e.setExp(jTextArea4.getText());
        cantidad_iteraciones = (Integer)jSpinner1.getValue();
        cantidad_hormigas = (Integer)jSpinner2.getValue();

        ACO_MAX_MIN asMIXTO = new ACO_MAX_MIN( 0.7, cantidad_hormigas, cantidad_iteraciones, e);
            Date d = new Date();
            long b = d.getTime();
            asMIXTO.executeAsTSP();
            Date d1 = new Date();
            long c = d1.getTime();
            cadena = asMIXTO.PrintGlobalSolution();

            

            

            String s3 = "";
            for(int i = 1; i < (nombre.length + 1); i++){
                s3 += cadena[i] + "\n";
            }
             jTextArea3.setText(s3);

             jTextField8.setText(cadena[0]);

        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Se ha cometido un error durante el proceso", "Error", WIDTH);
        }


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        if(jComboBox1.getSelectedIndex() == 0){
            jLabel7.setVisible(false);
        jTextField4.setVisible(false);
        jRadioButton1.setVisible(false);
        jRadioButton2.setVisible(false);

        jLabel8.setVisible(true);
        jLabel9.setVisible(true);
        jLabel10.setVisible(true);
        jTextField5.setVisible(true);
        jTextField6.setVisible(true);

        jLabel7.setVisible(false);
        jTextField4.setVisible(false);

        }else{
          jRadioButton1.setVisible(true);
        jRadioButton2.setVisible(true);

        if(jRadioButton1.isSelected()){
            jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);

        jLabel7.setVisible(true);
        jTextField4.setVisible(true);
        }else{
            jLabel8.setVisible(true);
        jLabel9.setVisible(true);
        jLabel10.setVisible(true);
        jTextField5.setVisible(true);
        jTextField6.setVisible(true);

        jLabel7.setVisible(false);
        jTextField4.setVisible(false);
        }





        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);

        jLabel7.setVisible(true);
        jTextField4.setVisible(true);


    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        jLabel8.setVisible(true);
        jLabel9.setVisible(true);
        jLabel10.setVisible(true);
        jTextField5.setVisible(true);
        jTextField6.setVisible(true);

        jLabel7.setVisible(false);
        jTextField4.setVisible(false);

    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jDialog2.setVisible(false);
        setVisible(true);
        setEnabled(true);

        jTextArea1.setText("");
        jTextArea1.setText("");
        jTextArea1.setText("");
        jTextField8.setText("");

        
        
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        
        jTextField8.setText("");
        
        
        jSpinner1.setModel(new SpinnerNumberModel(100, 1, 10000, 1));
        jSpinner2.setModel(new SpinnerNumberModel(20, 1, 1000, 1));
        jSpinner3.setModel(new SpinnerNumberModel(5, 1, 100, 1));
        jSpinner4.setModel(new SpinnerNumberModel(2, 1, 20, 1));



        




    }//GEN-LAST:event_jButton4ActionPerformed

    private void jDialog1WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jDialog1WindowClosing
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jDialog1WindowClosing

    private void jDialog2WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jDialog2WindowClosing
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jDialog2WindowClosing

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

    public void crearEcuacion() {
        e = new Ecuacion(cantidad_variable, grado_presicion);

        for(int i = 0; i < cantidad_variable; i++){
            if(es_dominio[i]){

                e.add_variable(nombre[i], descripcion[i], tipo[i], dominio[i].split(",") );
            }else{
                e.add_variable(nombre[i], descripcion[i], tipo[i], (double)Double.parseDouble(max_min[i][0]), (double)Double.parseDouble(max_min[i][1]));
            }
        }
        





    }

}
