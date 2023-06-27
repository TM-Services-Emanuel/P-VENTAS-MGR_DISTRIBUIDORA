package IU;

import Componentes.ConexionBD;
import Componentes.Mensajes;
import Componentes.cargarComboBoxMovil;
import Componentes.validarCampos;
import Controladores.CabecerasTablas;
import Controladores.controlCliente;
import Datos.GestionarCliente;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.MariaDbConnection;
import org.mariadb.jdbc.MariaDbStatement;

public final class dlgGestClientes extends javax.swing.JDialog {

    public static MariaDbConnection conMovil;
    public static MariaDbStatement stMovil;
    public static ResultSet rs;

    public dlgGestClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarComboBoxMovil.cargar(cbCiudad, "SELECT * FROM ciudad WHERE estado='S'");
        cargarIcono();
        lbCiudad.setVisible(false);
        //btnNuevo.doClick();
    }

    public static void Nuevo() {
        btnNuevo.doClick();
    }

    public static void prepararBD() {
        try {
            conMovil = (MariaDbConnection) new ConexionBD().getConexionMovil();
            if (conMovil == null) {
                System.out.println("No hay Conexion con la Base de Datos Movil");
            } else {
                stMovil = (MariaDbStatement) conMovil.createStatement();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void BuscarRUC() {
        prepararBD();
        String ruc = dlgClientes.txtBuscar.getText().trim();
        if (!ruc.isEmpty()) {
            try {
                rs = stMovil.executeQuery("SELECT * FROM clientesbd WHERE cedula Like '" + ruc + "%'");
                rs.last();
                dlgGestClientes.txtRazonS.setText(rs.getString("nombre"));
                dlgGestClientes.txtRuc.setText(rs.getString("cedula"));
                dlgGestClientes.txtDireccion.setText("SIN ESPECIFICAR");
                dlgGestClientes.txtTelefono.setText("0");
                dlgGestClientes.cbCiudad.setSelectedIndex(1);
                rs.close();
            } catch (SQLException ex) {
                Mensajes.informacion("OBSERVACIÓN:\nLamentablemete no se ha encontrado coincidencia en el registro externo de clientes.");
                dlgGestClientes.txtRuc.setText(ruc);
                dlgGestClientes.txtDireccion.setText("SIN ESPECIFICAR");
                dlgGestClientes.txtTelefono.setText("0");
                dlgGestClientes.cbCiudad.setSelectedIndex(1);
            }
        }
    }

    public static void BuscarRUC2() {
        prepararBD();
        String ruc = txtRuc.getText().trim();
        if (!ruc.isEmpty()) {
            try {
                rs = stMovil.executeQuery("SELECT * FROM clientesbd WHERE cedula Like '" + ruc + "%'");
                rs.last();
                txtRazonS.setText(rs.getString("nombre"));
                txtRuc.setText(rs.getString("cedula"));
                txtDireccion.setText("SIN ESPECIFICAR");
                txtTelefono.setText("0");
                cbCiudad.setSelectedIndex(3);
                rs.close();
                txtNF.requestFocus();
            } catch (SQLException ex) {
                Mensajes.informacion("OBSERVACIÓN:\nLamentablemete no se ha encontrado coincidencia en el registro externo de clientes.");
                txtRazonS.setText("");
                txtRuc.setText("");
                txtDireccion.setText("SIN ESPECIFICAR");
                txtTelefono.setText("0");
                cbCiudad.setSelectedIndex(1);
                txtNF.requestFocus();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Blanco = new org.edisoncor.gui.panel.PanelImage();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jPanel5 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lbCiudad = new javax.swing.JLabel();
        contenedor = new javax.swing.JTabbedPane();
        pnDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblCodC = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRazonS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbCiudad = new javax.swing.JComboBox();
        btnCiudad = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        cboIdentificacion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCodInt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtReferencia1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtReferencia2 = new javax.swing.JTextField();
        barMenu = new javax.swing.JMenuBar();
        menuOpciones = new javax.swing.JMenu();
        itemNuevo = new javax.swing.JMenuItem();
        itemModificar = new javax.swing.JMenuItem();
        itemGuardar = new javax.swing.JMenuItem();
        itemCancelar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        Blanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondoBlanco.jpg"))); // NOI18N
        Blanco.setPreferredSize(new java.awt.Dimension(690, 418));

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/0-102-102.png"))); // NOI18N
        panelImage1.setPreferredSize(new java.awt.Dimension(690, 418));
        panelImage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.GridLayout(1, 9));

        btnNuevo.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 9)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/document30.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.setToolTipText("Nuevo - F3");
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel5.add(btnNuevo);

        btnModificar.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 9)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edit30.png"))); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.setToolTipText("Modificar - F5");
        btnModificar.setEnabled(false);
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel5.add(btnModificar);

        btnGuardar.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 9)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save30.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setToolTipText("Guardar - F6");
        btnGuardar.setEnabled(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel5.add(btnGuardar);

        btnCancelar.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 9)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancel30.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setToolTipText("Cancelar - Esc");
        btnCancelar.setEnabled(false);
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel5.add(btnCancelar);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/back30.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setToolTipText("Salir");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel5.add(btnSalir);

        panelImage1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 61));
        panelImage1.add(lbCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 24, 22));

        contenedor.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        contenedor.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        contenedor.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N

        pnDatos.setBackground(new java.awt.Color(255, 255, 255));
        pnDatos.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        pnDatos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnDatosFocusGained(evt);
            }
        });

        jLabel1.setText("ID CLINTE:");

        lblCodC.setBackground(new java.awt.Color(255, 255, 255));
        lblCodC.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 11)); // NOI18N
        lblCodC.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblCodC.setOpaque(true);

        jLabel2.setText("RAZÓN SOCIAL:");

        txtRazonS.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        txtRazonS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazonSActionPerformed(evt);
            }
        });
        txtRazonS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRazonSKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRazonSKeyTyped(evt);
            }
        });

        jLabel4.setText("DIRECCIÓN:");

        txtDireccion.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
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

        jLabel5.setText("CIUDAD:");

        cbCiudad.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        cbCiudad.setForeground(new java.awt.Color(0, 102, 102));
        cbCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCiudadActionPerformed(evt);
            }
        });
        cbCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbCiudadKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbCiudadKeyReleased(evt);
            }
        });

        btnCiudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/document15.png"))); // NOI18N
        btnCiudad.setToolTipText("Gestionar Ciudad");
        btnCiudad.setBorderPainted(false);
        btnCiudad.setContentAreaFilled(false);
        btnCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCiudadActionPerformed(evt);
            }
        });

        jLabel7.setText("TELÉFONO/CELULAR:");

        jLabel11.setText("C.I N°/R.U.C.:");

        txtRuc.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        txtRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRucActionPerformed(evt);
            }
        });
        txtRuc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRucKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRucKeyTyped(evt);
            }
        });

        txtTelefono.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/magnifier.png"))); // NOI18N
        btnBuscar.setText("Buscar coincidencia");
        btnBuscar.setOpaque(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        cboIdentificacion.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        cboIdentificacion.setForeground(new java.awt.Color(0, 102, 102));
        cboIdentificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--TIPO DE IDENTIFICACIÓN--", "- RUC", "- CEDULA DE IDENTIDAD", "- PASAPORTE", "- CEDULA EXTRANJERA", "- SIN NOMBRE", "- DIPLOMATICO", "- IDENTIFICACION TRIBUTARIA" }));

        jLabel3.setText("NOMBRE DE FANTASÍA:");

        txtNF.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        txtNF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNFActionPerformed(evt);
            }
        });
        txtNF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNFKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNFKeyTyped(evt);
            }
        });

        jLabel12.setText("COD. INTERNO:");

        txtCodInt.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        txtCodInt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodIntActionPerformed(evt);
            }
        });
        txtCodInt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodIntKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodIntKeyTyped(evt);
            }
        });

        jLabel6.setText("REFERENCIA 1:");

        txtReferencia1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        txtReferencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReferencia1ActionPerformed(evt);
            }
        });
        txtReferencia1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtReferencia1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtReferencia1KeyTyped(evt);
            }
        });

        jLabel8.setText("REFERENCIA 2:");

        txtReferencia2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        txtReferencia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReferencia2ActionPerformed(evt);
            }
        });
        txtReferencia2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtReferencia2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtReferencia2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnDatosLayout = new javax.swing.GroupLayout(pnDatos);
        pnDatos.setLayout(pnDatosLayout);
        pnDatosLayout.setHorizontalGroup(
            pnDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDatosLayout.createSequentialGroup()
                        .addGroup(pnDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnDatosLayout.createSequentialGroup()
                                .addGroup(pnDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                                    .addComponent(cbCiudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnDatosLayout.createSequentialGroup()
                                        .addComponent(txtRuc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtReferencia1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRazonS, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnDatosLayout.createSequentialGroup()
                                        .addGroup(pnDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtCodInt)
                                            .addComponent(lblCodC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnDatosLayout.createSequentialGroup()
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNF, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnDatosLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtReferencia2)
                        .addGap(26, 26, 26)))
                .addContainerGap())
        );
        pnDatosLayout.setVerticalGroup(
            pnDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDatosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(lblCodC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCodInt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNF, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRazonS, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(cbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        btnCiudad.getAccessibleContext().setAccessibleDescription("");

        contenedor.addTab("DATOS", pnDatos);

        javax.swing.GroupLayout BlancoLayout = new javax.swing.GroupLayout(Blanco);
        Blanco.setLayout(BlancoLayout);
        BlancoLayout.setHorizontalGroup(
            BlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(BlancoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BlancoLayout.setVerticalGroup(
            BlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BlancoLayout.createSequentialGroup()
                .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        barMenu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        menuOpciones.setText("OPCIONES");
        menuOpciones.setFocusable(false);
        menuOpciones.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        menuOpciones.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        itemNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        itemNuevo.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        itemNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/document15.png"))); // NOI18N
        itemNuevo.setText("NUEVO");
        itemNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNuevoActionPerformed(evt);
            }
        });
        menuOpciones.add(itemNuevo);

        itemModificar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        itemModificar.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        itemModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edit15.png"))); // NOI18N
        itemModificar.setText("MODIFICAR INFORMACIÓN DEL REGISTRO");
        itemModificar.setEnabled(false);
        itemModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemModificarActionPerformed(evt);
            }
        });
        menuOpciones.add(itemModificar);

        itemGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        itemGuardar.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        itemGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save15.png"))); // NOI18N
        itemGuardar.setText("GUARDAR REGISTRO");
        itemGuardar.setEnabled(false);
        itemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGuardarActionPerformed(evt);
            }
        });
        menuOpciones.add(itemGuardar);

        itemCancelar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        itemCancelar.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        itemCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancel15.png"))); // NOI18N
        itemCancelar.setText("CANCELAR");
        itemCancelar.setEnabled(false);
        itemCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCancelarActionPerformed(evt);
            }
        });
        menuOpciones.add(itemCancelar);
        menuOpciones.add(jSeparator1);

        itemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        itemSalir.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        itemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/back15.png"))); // NOI18N
        itemSalir.setText("SALIR");
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
            .addComponent(Blanco, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Blanco, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        int rpta = Mensajes.confirmar("¿Seguro que desea salir del formulario?");
        if (rpta == 0) {
            actualizartablaClientes();
            this.dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

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

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
        cargarComboBoxMovil.cargar(cbCiudad, "SELECT * FROM ciudad WHERE estado='S'");
        String cod = GestionarCliente.getCodigo();
        lblCodC.setText(cod);
        txtCodInt.setText(cod);
        btnNuevo.setEnabled(false);
        itemNuevo.setEnabled(false);
        btnGuardar.setEnabled(true);
        itemGuardar.setEnabled(true);
        btnModificar.setEnabled(false);
        itemModificar.setEnabled(false);
        btnCancelar.setEnabled(true);
        itemCancelar.setEnabled(true);
        btnCiudad.setEnabled(true);
        txtRazonS.setEnabled(true);
        txtRuc.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtTelefono.setEnabled(true);
        cbCiudad.setEnabled(true);
        contenedor.setSelectedIndex(0);
        txtNF.requestFocus();
        BuscarRUC();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if (txtCodInt.getText().isEmpty()) {
            Mensajes.Sistema("Fije un codigo interno para este cliente.\nEsto ayudara a optimizar la busqueda al momento de vender.");
        } else if (cboIdentificacion.getSelectedIndex() == 0) {
            Mensajes.Sistema("Seleccione el Tipo de Identificación para este cliente.\nEsto ayudara al momento de generar exportaciones contables.");
        } else if (txtRazonS.getText().isEmpty()) {
            Mensajes.Sistema("DATO NECESARIO:\nIngrese el Nombre y Apellido o Razón Social del cliente.");
        } else if (txtRuc.getText().isEmpty()) {
            Mensajes.Sistema("DATO NECESARIO:\nIngrese el Nro de C.I. o R.U.C. del cliente.");
        } else if (txtDireccion.getText().isEmpty()) {
            Mensajes.Sistema("DATO NECESARIO:\nIngrese la dirección del cliente.\nEsto ayudara a optimizar la busqueda al momento de vender.");
        } else if (txtReferencia1.getText().isEmpty()) {
            Mensajes.Sistema("DATO NECESARIO:\nIngrese la primera referencia de ubicación del cliente.\nEsto ayudara a optimizar la busqueda al momento de vender.");
        } else if (txtReferencia2.getText().isEmpty()) {
            Mensajes.Sistema("DATO NECESARIO:\nIngrese la segunda referencia de ubicación del cliente.\nEsto ayudara a optimizar la busqueda al momento de vender.");
        } else if (txtTelefono.getText().isEmpty()) {
            Mensajes.Sistema("Fije un número telefonico para este cliente.");
        } else if (cbCiudad.getSelectedIndex() == 0) {
            Mensajes.Sistema("Seleccione la ciudad a la cual pertenece este cliente.");
        } else {
            try {
                int resp = JOptionPane.showConfirmDialog(this, "¿Seguro que desea modificar el registro?", "Modificar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (resp == JOptionPane.YES_OPTION) {
                    controlCliente.actCliente();
                    actualizartablaClientes();
                    btnCancelarActionPerformed(null);
                    this.dispose();
                }
            } catch (Exception ee) {
            }
        }
            
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (txtCodInt.getText().isEmpty()) {
            Mensajes.Sistema("Fije un codigo interno para este cliente.\nEsto ayudara a optimizar la busqueda al momento de vender.");
        } else if (cboIdentificacion.getSelectedIndex() == 0) {
            Mensajes.Sistema("Seleccione el Tipo de Identificación para este cliente.\nEsto ayudara al momento de generar exportaciones contables.");
        } else if (txtRazonS.getText().isEmpty()) {
            Mensajes.Sistema("DATO NECESARIO:\nIngrese el Nombre y Apellido o Razón Social del cliente.");
        } else if (txtRuc.getText().isEmpty()) {
            Mensajes.Sistema("DATO NECESARIO:\nIngrese el Nro de C.I. o R.U.C. del cliente.");
        } else if (txtDireccion.getText().isEmpty()) {
            Mensajes.Sistema("DATO NECESARIO:\nIngrese la dirección del cliente.\nEsto ayudara a optimizar la busqueda al momento de vender.");
        } else if (txtReferencia1.getText().isEmpty()) {
            Mensajes.Sistema("DATO NECESARIO:\nIngrese la primera referencia de ubicación del cliente.\nEsto ayudara a optimizar la busqueda al momento de vender.");
        } else if (txtReferencia2.getText().isEmpty()) {
            Mensajes.Sistema("DATO NECESARIO:\nIngrese la segunda referencia de ubicación del cliente.\nEsto ayudara a optimizar la busqueda al momento de vender.");
        } else if (txtTelefono.getText().isEmpty()) {
            Mensajes.Sistema("Fije un número telefonico para este cliente.");
        } else if (cbCiudad.getSelectedIndex() == 0) {
            Mensajes.Sistema("Seleccione la ciudad a la cual pertenece este cliente.");
        } else {
            try {
                int resp = JOptionPane.showConfirmDialog(this, "¿Seguro que desea insertar el registro?", "Insertar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (resp == JOptionPane.YES_OPTION) {
                    String cod = GestionarCliente.getCodigo();
                    lblCodC.setText(cod);
                    controlCliente.addCliente();
                    actualizartablaClientes();
                    btnCancelarActionPerformed(null);
                }

            } catch (HeadlessException ee) {
            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
        btnNuevo.setEnabled(true);
        itemNuevo.setEnabled(true);
        btnModificar.setEnabled(false);
        itemModificar.setEnabled(false);
        btnGuardar.setEnabled(false);
        itemGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        itemCancelar.setEnabled(false);
        btnCiudad.setEnabled(false);
        txtRazonS.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtTelefono.setEnabled(false);
        cbCiudad.setEnabled(false);
        txtRuc.setEnabled(false);
        dlgClientes.txtBuscar.setText("");
        dlgClientes.txtBuscar.requestFocus();
        dlgClientes.tablaClientes.clearSelection();
        CabecerasTablas.limpiarTablas(dlgClientes.tablaClientes);
        controlCliente.listClientes(dlgClientes.tablaClientes, "clientes.idcliente");

        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void itemCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCancelarActionPerformed
        // TODO add your handling code here:
        btnCancelarActionPerformed(null);
    }//GEN-LAST:event_itemCancelarActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        // TODO add your handling code here:
        btnSalirActionPerformed(null);
    }//GEN-LAST:event_itemSalirActionPerformed

    private void pnDatosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnDatosFocusGained
        // TODO add your handling code here:
        txtRazonS.requestFocus();
    }//GEN-LAST:event_pnDatosFocusGained

    private void txtReferencia2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReferencia2KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtReferencia2KeyTyped

    private void txtReferencia2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReferencia2KeyPressed
        // TODO add your handling code here:
        validarCampos.cantCaracteres(txtReferencia2, 49);
    }//GEN-LAST:event_txtReferencia2KeyPressed

    private void txtReferencia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReferencia2ActionPerformed
        // TODO add your handling code here:
        txtTelefono.requestFocus();
    }//GEN-LAST:event_txtReferencia2ActionPerformed

    private void txtReferencia1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReferencia1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtReferencia1KeyTyped

    private void txtReferencia1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReferencia1KeyPressed
        // TODO add your handling code here:
        validarCampos.cantCaracteres(txtReferencia1, 49);
    }//GEN-LAST:event_txtReferencia1KeyPressed

    private void txtReferencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReferencia1ActionPerformed
        // TODO add your handling code here:
        txtReferencia2.requestFocus();
    }//GEN-LAST:event_txtReferencia1ActionPerformed

    private void txtCodIntKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodIntKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodIntKeyTyped

    private void txtCodIntKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodIntKeyPressed
        // TODO add your handling code here:
        validarCampos.cantCaracteres(txtCodInt, 25);
    }//GEN-LAST:event_txtCodIntKeyPressed

    private void txtCodIntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodIntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodIntActionPerformed

    private void txtNFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNFKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtNFKeyTyped

    private void txtNFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNFKeyPressed
        // TODO add your handling code here:
        validarCampos.cantCaracteres(txtNF, 100);
    }//GEN-LAST:event_txtNFKeyPressed

    private void txtNFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNFActionPerformed
        // TODO add your handling code here:
        txtRazonS.requestFocus();
    }//GEN-LAST:event_txtNFActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        BuscarRUC2();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        int limite = 15;
        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();

            System.out.println("Ingresa Solo Numeros");
        }
        if (txtTelefono.getText().length() == limite) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoKeyPressed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
        cbCiudad.requestFocus();
        cbCiudad.setPopupVisible(true);
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtRucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        int limite = 11;
        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();

            System.out.println("Ingresa Solo Numeros");
        }
        if (txtRuc.getText().length() == limite) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRucKeyTyped

    private void txtRucKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRucKeyPressed

    private void txtRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRucActionPerformed
        // TODO add your handling code here:
        txtDireccion.requestFocus();
    }//GEN-LAST:event_txtRucActionPerformed

    private void btnCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCiudadActionPerformed
        // TODO add your handling code here:
        dlgCiudadMovil ciumov = new dlgCiudadMovil(null, true);
        ciumov.setLocationRelativeTo(null);
        ciumov.setVisible(true);
    }//GEN-LAST:event_btnCiudadActionPerformed

    private void cbCiudadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbCiudadKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCiudadKeyReleased

    private void cbCiudadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbCiudadKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!btnGuardar.isEnabled()) {
                btnModificar.doClick();
            } else {
                btnGuardar.doClick();
            }
        }
    }//GEN-LAST:event_cbCiudadKeyPressed

    private void cbCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCiudadActionPerformed
        // TODO add your handling code here:
        try {
            String id = cargarComboBoxMovil.getCodidgo(cbCiudad);
            lbCiudad.setText(id);
        } catch (Exception e) {
            lbCiudad.setText("");
        }
    }//GEN-LAST:event_cbCiudadActionPerformed

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyPressed
        // TODO add your handling code here:
        validarCampos.cantCaracteres(txtDireccion, 49);
    }//GEN-LAST:event_txtDireccionKeyPressed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
        txtReferencia1.requestFocus();
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtRazonSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazonSKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtRazonSKeyTyped

    private void txtRazonSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazonSKeyPressed
        // TODO add your handling code here:
        //validarCampos.soloLetras(txtRazonS);
        validarCampos.cantCaracteres(txtRazonS, 100);
    }//GEN-LAST:event_txtRazonSKeyPressed

    private void txtRazonSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazonSActionPerformed
        // TODO add your handling code here:
        txtRuc.requestFocus();
    }//GEN-LAST:event_txtRazonSActionPerformed

    void limpiarCampos() {
        lblCodC.setText("");
        txtCodInt.setText("");
        lbCiudad.setText("");
        txtNF.setText("");
        txtRazonS.setText("");
        txtRuc.setText("");
        txtDireccion.setText("");
        txtReferencia1.setText("");
        txtReferencia2.setText("");
        txtTelefono.setText("");
        cbCiudad.list();
    }

    void actualizartablaClientes() {
        CabecerasTablas cabe = new CabecerasTablas();
        cabe.cliente(dlgClientes.tablaClientes);
        CabecerasTablas.limpiarTablas(dlgClientes.tablaClientes);
        controlCliente.listClientes(dlgClientes.tablaClientes, "clientes.idcliente");
    }

    void cargarIcono() {
        try {
            java.awt.Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Iconos/logo1.png"));
            setIconImage(icon);
        } catch (Exception e) {
            Mensajes.error("No se pudo cargo icono");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgGestClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            dlgGestClientes dialog = new dlgGestClientes(new javax.swing.JFrame(), true);
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
    private org.edisoncor.gui.panel.PanelImage Blanco;
    private javax.swing.JMenuBar barMenu;
    private javax.swing.JButton btnBuscar;
    public static javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCiudad;
    public static javax.swing.JButton btnGuardar;
    public static javax.swing.JButton btnModificar;
    public static javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    public static javax.swing.JComboBox cbCiudad;
    public static javax.swing.JComboBox<String> cboIdentificacion;
    private javax.swing.JTabbedPane contenedor;
    public static javax.swing.JMenuItem itemCancelar;
    public static javax.swing.JMenuItem itemGuardar;
    public static javax.swing.JMenuItem itemModificar;
    public static javax.swing.JMenuItem itemNuevo;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    public static javax.swing.JLabel lbCiudad;
    public static javax.swing.JLabel lblCodC;
    private javax.swing.JMenu menuOpciones;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JPanel pnDatos;
    public static javax.swing.JTextField txtCodInt;
    public static javax.swing.JTextField txtDireccion;
    public static javax.swing.JTextField txtNF;
    public static javax.swing.JTextField txtRazonS;
    public static javax.swing.JTextField txtReferencia1;
    public static javax.swing.JTextField txtReferencia2;
    public static javax.swing.JTextField txtRuc;
    public static javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
