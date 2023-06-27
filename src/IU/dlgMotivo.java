package IU;

import Componentes.Mensajes;
import Componentes.Software;
import Componentes.cargarComboBox;
import Componentes.validarCampos;
import Controladores.CabecerasTablas;
import Controladores.controlMotivo;
import Datos.GestionarMotivo;
import javax.swing.JOptionPane;

public class dlgMotivo extends javax.swing.JDialog {

    CabecerasTablas cabe = new CabecerasTablas();

    public dlgMotivo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        titulo();
        cabe.motivo(tbMotivo);
        controlMotivo.listMotivo(tbMotivo);
    }

    final void titulo() {
        if (Software.getSoftware().equals("null")) {
            this.setTitle("Gestionar Vendedores Móviles");
        } else {
            this.setTitle(Software.getSoftware() + " - Gestionar Vendedores Móviles");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtVendedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMotivo = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowInddex, int celIndex)
            {
                return false;
            }
        };
        txtci = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JTextField();
        barMenu = new javax.swing.JMenuBar();
        menuOpciones = new javax.swing.JMenu();
        itemNuevo = new javax.swing.JMenuItem();
        itemModificar = new javax.swing.JMenuItem();
        itemGuardar = new javax.swing.JMenuItem();
        itemCancelar = new javax.swing.JMenuItem();
        itemEliminar = new javax.swing.JMenuItem();
        itemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.GridLayout(1, 9));

        btnNuevo.setFont(new java.awt.Font("SansSerif", 0, 9)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/document30.png"))); // NOI18N
        btnNuevo.setText("Nuevo-F1");
        btnNuevo.setToolTipText("Nuevo - F3");
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo);

        btnModificar.setFont(new java.awt.Font("SansSerif", 0, 9)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edit30.png"))); // NOI18N
        btnModificar.setText("Modif-F5");
        btnModificar.setToolTipText("Modificar - F5");
        btnModificar.setEnabled(false);
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar);

        btnGuardar.setFont(new java.awt.Font("SansSerif", 0, 9)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save30.png"))); // NOI18N
        btnGuardar.setText("Guardar-F6");
        btnGuardar.setToolTipText("Guardar - F6");
        btnGuardar.setEnabled(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar);

        btnCancelar.setFont(new java.awt.Font("SansSerif", 0, 9)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancel30.png"))); // NOI18N
        btnCancelar.setText("Cancel-Esc");
        btnCancelar.setToolTipText("Cancelar - Esc");
        btnCancelar.setEnabled(false);
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar);

        btnEliminar.setFont(new java.awt.Font("SansSerif", 0, 9)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/garbage30.png"))); // NOI18N
        btnEliminar.setText("Elim-Supr");
        btnEliminar.setToolTipText("Eliminar - Supr");
        btnEliminar.setEnabled(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar);

        btnSalir.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 9)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/back30.png"))); // NOI18N
        btnSalir.setText("Salir-Alt+F4");
        btnSalir.setToolTipText("Salir");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        jLabel4.setText("C.I.");

        txtCod.setEditable(false);
        txtCod.setBackground(new java.awt.Color(255, 255, 255));
        txtCod.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        txtCod.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setText("Vendedor");

        txtVendedor.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        txtVendedor.setEnabled(false);
        txtVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVendedorActionPerformed(evt);
            }
        });
        txtVendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtVendedorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVendedorKeyTyped(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tbMotivo.setAutoCreateRowSorter(true);
        tbMotivo.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        tbMotivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbMotivo.setGridColor(new java.awt.Color(204, 204, 204));
        tbMotivo.setRowHeight(20);
        tbMotivo.setShowGrid(true);
        tbMotivo.setShowVerticalLines(false);
        tbMotivo.getTableHeader().setResizingAllowed(false);
        tbMotivo.getTableHeader().setReorderingAllowed(false);
        tbMotivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMotivoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbMotivo);

        txtci.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        txtci.setEnabled(false);
        txtci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtciActionPerformed(evt);
            }
        });
        txtci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtciKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtciKeyTyped(evt);
            }
        });

        jLabel3.setText("ID Vendedor");

        jLabel5.setText("Dirección");

        txtDireccion.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        txtDireccion.setEnabled(false);
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDireccionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        jLabel6.setText("Tel.");

        txtTel.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        txtTel.setEnabled(false);
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });
        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelKeyTyped(evt);
            }
        });

        jLabel7.setText("Usuario");

        txtUsuario.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        txtUsuario.setEnabled(false);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });

        jLabel8.setText("Contraseña");

        txtContrasena.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        txtContrasena.setEnabled(false);
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });
        txtContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtci, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        barMenu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        menuOpciones.setText("Opciones");
        menuOpciones.setFocusable(false);
        menuOpciones.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        menuOpciones.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        itemNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        itemNuevo.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        itemNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/document15.png"))); // NOI18N
        itemNuevo.setText("Nuevo");
        itemNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNuevoActionPerformed(evt);
            }
        });
        menuOpciones.add(itemNuevo);

        itemModificar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        itemModificar.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        itemModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edit15.png"))); // NOI18N
        itemModificar.setText("Guardar Modificación");
        itemModificar.setEnabled(false);
        itemModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemModificarActionPerformed(evt);
            }
        });
        menuOpciones.add(itemModificar);

        itemGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        itemGuardar.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        itemGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save15.png"))); // NOI18N
        itemGuardar.setText("Guardar Nuevo");
        itemGuardar.setEnabled(false);
        itemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGuardarActionPerformed(evt);
            }
        });
        menuOpciones.add(itemGuardar);

        itemCancelar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        itemCancelar.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        itemCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancel15.png"))); // NOI18N
        itemCancelar.setText("Cancelar");
        itemCancelar.setEnabled(false);
        itemCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCancelarActionPerformed(evt);
            }
        });
        menuOpciones.add(itemCancelar);

        itemEliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        itemEliminar.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        itemEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/garbage15.png"))); // NOI18N
        itemEliminar.setText("Eliminar");
        itemEliminar.setEnabled(false);
        itemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarActionPerformed(evt);
            }
        });
        menuOpciones.add(itemEliminar);

        itemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        itemSalir.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        itemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/back15.png"))); // NOI18N
        itemSalir.setText("Salir");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        menuOpciones.add(itemSalir);

        barMenu.add(menuOpciones);

        setJMenuBar(barMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        int rpta = Mensajes.confirmar("¿Seguro que desea salir del formulario?");
        if (rpta == 0) {
            try {
                cargarComboBox.cargar(dlgSalidaMercaderia.cbMotivo, "SELECT * FROM motivo WHERE mot_indicador='S'");

            } catch (Exception e) {
            }
            try {

                cargarComboBox.cargar(dlgCantStock.cbMotivo, "SELECT * FROM motivo WHERE mot_indicador='S'");
            } catch (Exception e) {
            }
            this.dispose();
        }

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        String cod = GestionarMotivo.getCodigo();
        txtCod.setText(cod);
        btnNuevo.setEnabled(false);
        itemNuevo.setEnabled(false);
        btnGuardar.setEnabled(true);
        itemGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        itemCancelar.setEnabled(true);
        txtVendedor.setEnabled(true);
        txtci.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtTel.setEnabled(true);
        txtUsuario.setEnabled(true);
        txtContrasena.setEnabled(true);
        txtVendedor.setText("");
        txtci.setText("");
        txtDireccion.setText("");
        txtTel.setText("");
        txtUsuario.setText("");
        txtContrasena.setText("");
        CabecerasTablas.limpiarTablas(tbMotivo);
        controlMotivo.listMotivo(tbMotivo);
        txtVendedor.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        try {
            int resp = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar el registro?", "Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (resp == JOptionPane.YES_OPTION) {
                controlMotivo.delMotivo();
                CabecerasTablas.limpiarTablas(tbMotivo);
                controlMotivo.listMotivo(tbMotivo);
                btnCancelarActionPerformed(null);
            }
        } catch (Exception ee) {
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:

        if (txtVendedor.getText().isEmpty()) {
            Mensajes.Sistema("Ingrese el nombre del vendedor");
        } else if (txtci.getText().isEmpty()) {
            Mensajes.Sistema("Ingrese el C.I. del vendedor");
        } else if (txtDireccion.getText().isEmpty()) {
            Mensajes.Sistema("Ingrese la direccion del vendedor");
        } else if (txtTel.getText().isEmpty()) {
            Mensajes.Sistema("Ingrese el nro telefonico del vendedor");
        } else if (txtUsuario.getText().isEmpty()) {
            Mensajes.Sistema("Ingrese el usuario del vendedor");
        } else if (txtContrasena.getText().isEmpty()) {
            Mensajes.Sistema("Ingrese la contraseña del vendedor");
        } else {
            try {
                int resp = JOptionPane.showConfirmDialog(this, "¿Seguro que desea modificar el registro?", "Modificar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (resp == JOptionPane.YES_OPTION) {
                    controlMotivo.actMotivo();
                    CabecerasTablas.limpiarTablas(tbMotivo);
                    controlMotivo.listMotivo(tbMotivo);
                    btnCancelarActionPerformed(null);
                }
            } catch (Exception ee) {
            }
        }


    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (txtVendedor.getText().isEmpty()) {
            Mensajes.Sistema("Ingrese el nombre del vendedor");
        } else if (txtci.getText().isEmpty()) {
            Mensajes.Sistema("Ingrese el C.I. del vendedor");
        } else if (txtDireccion.getText().isEmpty()) {
            Mensajes.Sistema("Ingrese la direccion del vendedor");
        } else if (txtTel.getText().isEmpty()) {
            Mensajes.Sistema("Ingrese el nro telefonico del vendedor");
        } else if (txtUsuario.getText().isEmpty()) {
            Mensajes.Sistema("Ingrese el usuario del vendedor");
        } else if (txtContrasena.getText().isEmpty()) {
            Mensajes.Sistema("Ingrese la contraseña del vendedor");
        } else {
            try {
                int resp = JOptionPane.showConfirmDialog(this, "¿Seguro que desea insertar el registro?", "Insertar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (resp == JOptionPane.YES_OPTION) {
                    String cod = GestionarMotivo.getCodigo();
                    txtCod.setText(cod);
                    controlMotivo.addMotivo();
                    CabecerasTablas.limpiarTablas(tbMotivo);
                    controlMotivo.listMotivo(tbMotivo);
                    btnCancelarActionPerformed(null);
                }
            } catch (Exception ee) {

            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tbMotivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMotivoMouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == 1) {
            if (evt.getClickCount() == 1) {
                btnNuevo.setEnabled(false);
                itemNuevo.setEnabled(false);
                btnModificar.setEnabled(false);
                itemModificar.setEnabled(false);
                btnEliminar.setEnabled(true);
                itemEliminar.setEnabled(true);
                txtVendedor.setEnabled(false);
                txtci.setEnabled(false);
                txtDireccion.setEnabled(false);
                txtTel.setEnabled(false);
                txtUsuario.setEnabled(false);
                txtContrasena.setEnabled(false);
                btnGuardar.setEnabled(false);
                itemGuardar.setEnabled(false);
                btnCancelar.setEnabled(true);
                itemCancelar.setEnabled(true);
                btnSalir.setEnabled(false);
                itemSalir.setEnabled(false);

                int fila = tbMotivo.getSelectedRow();
                String cod = tbMotivo.getValueAt(fila, 0).toString();
                String nom = tbMotivo.getValueAt(fila, 1).toString();
                String ci = tbMotivo.getValueAt(fila, 2).toString();
                String direc = tbMotivo.getValueAt(fila, 3).toString();
                String tele = tbMotivo.getValueAt(fila, 4).toString();
                String usu = tbMotivo.getValueAt(fila, 5).toString();
                String cont = tbMotivo.getValueAt(fila, 6).toString();

                txtCod.setText(cod);
                txtVendedor.setText(nom);
                txtVendedor.requestFocus();
                txtci.setText(ci);
                txtDireccion.setText(direc);
                txtTel.setText(tele);
                txtUsuario.setText(usu);
                txtContrasena.setText(cont);
            } else if (evt.getClickCount() == 2) {
                btnNuevo.setEnabled(false);
                itemNuevo.setEnabled(false);
                btnModificar.setEnabled(true);
                itemModificar.setEnabled(true);
                btnEliminar.setEnabled(false);
                itemEliminar.setEnabled(false);
                txtVendedor.setEnabled(true);
                txtci.setEnabled(true);
                txtDireccion.setEnabled(true);
                txtTel.setEnabled(true);
                txtUsuario.setEnabled(true);
                txtContrasena.setEnabled(true);
                btnGuardar.setEnabled(false);
                itemGuardar.setEnabled(false);
                btnCancelar.setEnabled(true);
                itemCancelar.setEnabled(true);
                btnSalir.setEnabled(false);
                itemSalir.setEnabled(false);

                int fila = tbMotivo.getSelectedRow();
                String cod = tbMotivo.getValueAt(fila, 0).toString();
                String nom = tbMotivo.getValueAt(fila, 1).toString();
                String ci = tbMotivo.getValueAt(fila, 2).toString();
                String direc = tbMotivo.getValueAt(fila, 3).toString();
                String tele = tbMotivo.getValueAt(fila, 4).toString();
                String usu = tbMotivo.getValueAt(fila, 5).toString();
                String cont = tbMotivo.getValueAt(fila, 6).toString();

                txtCod.setText(cod);
                txtVendedor.setText(nom);
                txtVendedor.requestFocus();
                txtci.setText(ci);
                txtDireccion.setText(direc);
                txtTel.setText(tele);
                txtUsuario.setText(usu);
                txtContrasena.setText(cont);
            }

        }


    }//GEN-LAST:event_tbMotivoMouseClicked

    private void itemNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNuevoActionPerformed
        // TODO add your handling code here:
        btnNuevoActionPerformed(null);
    }//GEN-LAST:event_itemNuevoActionPerformed

    private void itemModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemModificarActionPerformed
        // TODO add your handling code here:
        btnModificarActionPerformed(null);
    }//GEN-LAST:event_itemModificarActionPerformed

    private void itemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGuardarActionPerformed
        // TODO add your handling code here:
        btnGuardarActionPerformed(null);
    }//GEN-LAST:event_itemGuardarActionPerformed

    private void itemCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCancelarActionPerformed
        // TODO add your handling code here:
        btnCancelarActionPerformed(null);
    }//GEN-LAST:event_itemCancelarActionPerformed

    private void itemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarActionPerformed
        // TODO add your handling code here:
        btnEliminarActionPerformed(null);
    }//GEN-LAST:event_itemEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        btnNuevo.setEnabled(true);
        itemNuevo.setEnabled(true);
        btnModificar.setEnabled(false);
        itemModificar.setEnabled(false);
        btnGuardar.setEnabled(false);
        itemGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        itemCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);
        itemEliminar.setEnabled(false);
        btnSalir.setEnabled(true);
        itemSalir.setEnabled(true);
        txtVendedor.setEnabled(false);
        txtci.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtTel.setEnabled(false);
        txtUsuario.setEnabled(false);
        txtContrasena.setEnabled(false);
        limpiarCampos();
        tbMotivo.clearSelection();
        btnNuevo.requestFocus();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtVendedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVendedorKeyPressed
        // TODO add your handling code here:
        validarCampos.cantCaracteres(txtVendedor, 30);
    }//GEN-LAST:event_txtVendedorKeyPressed

    private void txtVendedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVendedorKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtVendedorKeyTyped

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        // TODO add your handling code here:
        btnSalir.doClick();
    }//GEN-LAST:event_itemSalirActionPerformed

    private void txtVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVendedorActionPerformed
        // TODO add your handling code here:
        txtci.requestFocus();
    }//GEN-LAST:event_txtVendedorActionPerformed

    private void txtciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtciActionPerformed
        // TODO add your handling code here:
        txtDireccion.requestFocus();
    }//GEN-LAST:event_txtciActionPerformed

    private void txtciKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciKeyPressed
        // TODO add your handling code here:
        validarCampos.soloNumeros(txtci);
        validarCampos.cantCaracteres(txtci, 10);
    }//GEN-LAST:event_txtciKeyPressed

    private void txtciKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtciKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciKeyTyped

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
        txtTel.requestFocus();
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyPressed
        // TODO add your handling code here:
        validarCampos.cantCaracteres(txtDireccion, 50);
    }//GEN-LAST:event_txtDireccionKeyPressed

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
        txtUsuario.requestFocus();
    }//GEN-LAST:event_txtTelActionPerformed

    private void txtTelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyPressed
        // TODO add your handling code here:
        validarCampos.soloNumeros(txtTel);
        validarCampos.cantCaracteres(txtTel, 10);
    }//GEN-LAST:event_txtTelKeyPressed

    private void txtTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelKeyTyped

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
        txtContrasena.requestFocus();
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        // TODO add your handling code here:
        validarCampos.cantCaracteres(txtUsuario, 15);
        
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
        if (btnGuardar.isEnabled()) {
            btnGuardar.doClick();
        } else {
            btnModificar.doClick();
        }
    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void txtContrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyPressed
        // TODO add your handling code here:
        validarCampos.soloNumeros(txtContrasena);
        validarCampos.cantCaracteres(txtContrasena, 6);
    }//GEN-LAST:event_txtContrasenaKeyPressed

    private void txtContrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaKeyTyped

    void limpiarCampos() {
        txtCod.setText("");
        txtVendedor.setText("");
        txtci.setText("");
        txtDireccion.setText("");
        txtTel.setText("");
        txtUsuario.setText("");
        txtContrasena.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgMotivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            dlgMotivo dialog = new dlgMotivo(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barMenu;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JMenuItem itemCancelar;
    private javax.swing.JMenuItem itemEliminar;
    private javax.swing.JMenuItem itemGuardar;
    private javax.swing.JMenuItem itemModificar;
    private javax.swing.JMenuItem itemNuevo;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuOpciones;
    private javax.swing.JTable tbMotivo;
    public static javax.swing.JTextField txtCod;
    public static javax.swing.JTextField txtContrasena;
    public static javax.swing.JTextField txtDireccion;
    public static javax.swing.JTextField txtTel;
    public static javax.swing.JTextField txtUsuario;
    public static javax.swing.JTextField txtVendedor;
    public static javax.swing.JTextField txtci;
    // End of variables declaration//GEN-END:variables
}
