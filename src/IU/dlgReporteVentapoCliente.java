package IU;

import Componentes.ConexionBD;
import Componentes.Fecha;
import Componentes.Mensajes;
import Componentes.Reporte;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import org.mariadb.jdbc.MariaDbConnection;
import org.mariadb.jdbc.MariaDbStatement;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.swing.JRViewer;

public class dlgReporteVentapoCliente extends javax.swing.JDialog {

    public Reporte jasper;
    public static ResultSet rs;
    public static MariaDbStatement sentencia;
    public static MariaDbConnection con;
    public static MariaDbStatement sentenciaM;
    public static MariaDbConnection conM;
    static String Fdesde;
    static String Fhasta;

    public dlgReporteVentapoCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jasper = new Reporte();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Iconos/logo1.png")));
        CargarFecha();
        invisible();
        lbNombreFantacia.setText("");

    }

    private void CargarFecha() {
        lbFechaActual.setText(Fecha.fechaFormulario());
        lbFechaActualR.setText(Fecha.fechaCorrecta());
    }

    private void invisible() {
        txtFDesdeR.setVisible(false);
        txtFHastaR.setVisible(false);
        lbFechaActualR.setVisible(false);
        txtCod.setVisible(false);
    }

    public static void prepararBD() {
        {
            try {
                con = (MariaDbConnection) new ConexionBD().getConexion();
                if (con == null) {
                    System.out.println("No hay Conexion con la Base de Datos");
                } else {
                    sentencia = (MariaDbStatement) con.createStatement();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

            try {
                conM = (MariaDbConnection) new ConexionBD().getConexionMovil();
                if (con == null) {
                    System.out.println("No hay Conexion con la Base de Datos Móvil");
                } else {
                    sentenciaM = (MariaDbStatement) conM.createStatement();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void LevantarReporte(String Dir, String Nombre1, Date Valor1, String Nombre2, Date Valor2, String Nombre3, int Valor3) {
        VisorReportes vr = new VisorReportes(null, true);
        try {
            //prepararBD();
            //archivo jasper
            //URL  jasperUrl = this.getClass().getResource("\\Reports\\repartos\\movimiento_reparto_E.jasper");
            String jasperUrl = System.getProperty("user.dir").concat(Dir);
            JasperReport report = (JasperReport) JRLoader.loadObjectFromFile(jasperUrl);
            //para los parametro
            Map parametros = new HashMap();
            parametros.clear();
            //Nuestro parametro se llama "pLastName"
            parametros.put(Nombre3, Valor3);
            parametros.put(Nombre1, Valor1);
            parametros.put(Nombre2, Valor2);

            //agregamos los parametros y la conexion a la base de datos
            JasperPrint jasperPrint = JasperFillManager.fillReport(report, parametros, conM);
            //se crea el visor con el reporte
            JRViewer jRViewer = new JRViewer(jasperPrint);
            //se elimina elementos del contenedor JPanel
            VisorReportes.jpContainer.removeAll();
            //para el tamaño del reporte se agrega un BorderLayout
            VisorReportes.jpContainer.setLayout(new BorderLayout());
            VisorReportes.jpContainer.add(jRViewer, BorderLayout.CENTER);
            jRViewer.setZoomRatio((float) 1.25);
            jRViewer.setVisible(true);
            VisorReportes.jpContainer.repaint();
            VisorReportes.jpContainer.revalidate();
        } catch (JRException ex) {
            System.err.println(ex.getMessage());
        }
        //vr.setSize(250, 50);
        vr.setResizable(false);
        vr.setLocationRelativeTo(this);
        vr.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoReporte = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        Blanco = new org.edisoncor.gui.panel.PanelImage();
        Oscuro = new org.edisoncor.gui.panel.PanelImage();
        jPanel2 = new javax.swing.JPanel();
        btnGenerar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lbFechaActualR = new javax.swing.JLabel();
        txtFHastaR = new javax.swing.JTextField();
        txtFDesdeR = new javax.swing.JTextField();
        txtCod = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        rbHoy = new javax.swing.JRadioButton();
        rbEntreFechas = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        lbFechaActual = new javax.swing.JLabel();
        dcFDesde = new datechooser.beans.DateChooserCombo();
        dcFHasta = new datechooser.beans.DateChooserCombo();
        txtFDesde = new javax.swing.JTextField();
        txtFHasta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        txtRuc = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        lbNombreFantacia = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cbCompleto = new javax.swing.JCheckBox();
        cbResumido = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemBuscarCliente = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        itemNuevoGenerar = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        itemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Generador de Reportes");
        setResizable(false);

        Blanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondoBlanco.jpg"))); // NOI18N
        Blanco.setPreferredSize(new java.awt.Dimension(690, 418));

        Oscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/0-102-102.png"))); // NOI18N
        Oscuro.setPreferredSize(new java.awt.Dimension(690, 418));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.GridLayout(1, 6));

        btnGenerar.setFont(new java.awt.Font("Roboto", 1, 9)); // NOI18N
        btnGenerar.setForeground(new java.awt.Color(0, 102, 102));
        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/reporte x 40.png"))); // NOI18N
        btnGenerar.setText("GENERAR REPORTE");
        btnGenerar.setToolTipText("Registrar Nuevo Artículo");
        btnGenerar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGenerar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGenerar);

        btnSalir.setFont(new java.awt.Font("Roboto", 1, 9)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 102, 102));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/back40.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setToolTipText("Salir");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setPreferredSize(new java.awt.Dimension(53, 47));
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir);

        lbFechaActualR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFechaActualR.setText("jLabel2");

        txtFHastaR.setEditable(false);
        txtFHastaR.setBackground(new java.awt.Color(255, 255, 204));
        txtFHastaR.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        txtFHastaR.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtFDesdeR.setEditable(false);
        txtFDesdeR.setBackground(new java.awt.Color(255, 255, 204));
        txtFDesdeR.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        txtFDesdeR.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout OscuroLayout = new javax.swing.GroupLayout(Oscuro);
        Oscuro.setLayout(OscuroLayout);
        OscuroLayout.setHorizontalGroup(
            OscuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OscuroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(OscuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OscuroLayout.createSequentialGroup()
                        .addGroup(OscuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFHastaR, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFDesdeR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbFechaActualR, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OscuroLayout.setVerticalGroup(
            OscuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OscuroLayout.createSequentialGroup()
                .addGroup(OscuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(OscuroLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(OscuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFDesdeR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFHastaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(lbFechaActualR))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, OscuroLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "PARAMETROS DE FECHAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Roboto", 1, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel1.setOpaque(false);

        GrupoReporte.add(rbHoy);
        rbHoy.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        rbHoy.setSelected(true);
        rbHoy.setText("Ventas total del día:");
        rbHoy.setOpaque(false);
        rbHoy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbHoyActionPerformed(evt);
            }
        });

        GrupoReporte.add(rbEntreFechas);
        rbEntreFechas.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        rbEntreFechas.setText("Venta total entre fechas:");
        rbEntreFechas.setOpaque(false);
        rbEntreFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEntreFechasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel1.setText("DESDE:");

        lbFechaActual.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        lbFechaActual.setText("jLabel2");

        dcFDesde.setEnabled(false);
        dcFDesde.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                dcFDesdeOnCommit(evt);
            }
        });

        dcFHasta.setEnabled(false);
        dcFHasta.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                dcFHastaOnCommit(evt);
            }
        });

        txtFDesde.setEditable(false);
        txtFDesde.setBackground(new java.awt.Color(255, 255, 255));
        txtFDesde.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        txtFDesde.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFDesde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtFDesde.setEnabled(false);
        txtFDesde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFDesdeActionPerformed(evt);
            }
        });

        txtFHasta.setEditable(false);
        txtFHasta.setBackground(new java.awt.Color(255, 255, 255));
        txtFHasta.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        txtFHasta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFHasta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtFHasta.setEnabled(false);
        txtFHasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFHastaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel2.setText("HASTA:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(rbHoy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(rbEntreFechas)
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(dcFDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(dcFHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbHoy)
                    .addComponent(lbFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbEntreFechas)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dcFDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcFHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(6, 6, 6))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "SELECCION DEL CLIENTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Roboto", 1, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel3.setOpaque(false);

        txtRuc.setEditable(false);
        txtRuc.setBackground(new java.awt.Color(255, 255, 255));
        txtRuc.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        txtRuc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRuc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        txtDescripcion.setEditable(false);
        txtDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        txtDescripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btnBuscarCliente.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        btnBuscarCliente.setForeground(new java.awt.Color(0, 102, 102));
        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/search15.png"))); // NOI18N
        btnBuscarCliente.setText("BUSCAR - F3");
        btnBuscarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnBuscarCliente.setOpaque(false);
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        lbNombreFantacia.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        lbNombreFantacia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRuc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescripcion))
                    .addComponent(lbNombreFantacia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnBuscarCliente)
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNombreFantacia, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "FORMATO DEL REPORTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Roboto", 1, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel4.setOpaque(false);

        buttonGroup1.add(cbCompleto);
        cbCompleto.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        cbCompleto.setSelected(true);
        cbCompleto.setText("Reporte Completo");
        cbCompleto.setOpaque(false);

        buttonGroup1.add(cbResumido);
        cbResumido.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        cbResumido.setText("Reporte Resumido (Solo Valores)");
        cbResumido.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cbResumido)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cbCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(285, 285, 285))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(cbCompleto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbResumido))
        );

        javax.swing.GroupLayout BlancoLayout = new javax.swing.GroupLayout(Blanco);
        Blanco.setLayout(BlancoLayout);
        BlancoLayout.setHorizontalGroup(
            BlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Oscuro, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
            .addGroup(BlancoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(BlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        BlancoLayout.setVerticalGroup(
            BlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BlancoLayout.createSequentialGroup()
                .addComponent(Oscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jMenu1.setText("OPCIONES");
        jMenu1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jMenu1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        itemBuscarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        itemBuscarCliente.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        itemBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/search20.png"))); // NOI18N
        itemBuscarCliente.setText("SELECCIONAR CLIENTE                          ");
        itemBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(itemBuscarCliente);
        jMenu1.add(jSeparator4);

        itemNuevoGenerar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        itemNuevoGenerar.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        itemNuevoGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/reports.png"))); // NOI18N
        itemNuevoGenerar.setText("GENERAR REPORTE");
        itemNuevoGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNuevoGenerarActionPerformed(evt);
            }
        });
        jMenu1.add(itemNuevoGenerar);
        jMenu1.add(jSeparator3);

        itemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        itemSalir.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        itemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/back15.png"))); // NOI18N
        itemSalir.setText("SALIR");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(itemSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Blanco, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Blanco, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemNuevoGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNuevoGenerarActionPerformed
        // TODO add your handling code here:
        btnGenerar.doClick();
    }//GEN-LAST:event_itemNuevoGenerarActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        // TODO add your handling code here:
        btnSalirActionPerformed(null);
    }//GEN-LAST:event_itemSalirActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        int rpta = Mensajes.confirmar("¿Seguro que desea salir del formulario?");
        if (rpta == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        // TODO add your handling code here:
        try {
            if (txtCod.getText().isEmpty()) {
                Mensajes.informacion("BUSQUE Y SELECCIONE UN CLIENTE PARA GENERAR EL REPORTE");
            } else {
                prepararBD();
                if (rbHoy.isSelected()) {
                    if (cbCompleto.isSelected()) {
                        LevantarReporte("\\Reports\\ventas\\VentasPorCliente2.jasper", "desde", Date.valueOf(lbFechaActualR.getText().trim()),
                                "hasta", Date.valueOf(lbFechaActualR.getText().trim()), "codcli", Integer.parseInt(txtCod.getText().trim()));
                    } else {
                        LevantarReporte("\\Reports\\ventas\\VentasPorCliente.jasper", "desde", Date.valueOf(lbFechaActualR.getText().trim()),
                                "hasta", Date.valueOf(lbFechaActualR.getText().trim()), "codcli", Integer.parseInt(txtCod.getText().trim()));
                    }
                } else if (rbEntreFechas.isSelected()) {
                    if (txtFDesde.getText().trim().isEmpty()) {
                        Mensajes.informacion("FIJE LA FECHA DESDE");
                    } else if (txtFHasta.getText().trim().isEmpty()) {
                        Mensajes.informacion("FIJE LA FECHA HASTA");
                    } else if (Date.valueOf(txtFDesdeR.getText().trim()).after(Date.valueOf(txtFHastaR.getText().trim()))) {
                        Mensajes.error("ERROR EN LOS PARAMETROS FIJADOS.\nVERIFIQUE LAS FECHAS DESDE Y HASTA.");
                    } else {
                        if (cbCompleto.isSelected()) {
                            LevantarReporte("\\Reports\\ventas\\VentasPorCliente2.jasper", "desde", Date.valueOf(txtFDesdeR.getText().trim()),
                                    "hasta", Date.valueOf(txtFHastaR.getText().trim()), "codcli", Integer.parseInt(txtCod.getText().trim()));
                        } else {
                            LevantarReporte("\\Reports\\ventas\\VentasPorCliente.jasper", "desde", Date.valueOf(txtFDesdeR.getText().trim()),
                                    "hasta", Date.valueOf(txtFHastaR.getText().trim()), "codcli", Integer.parseInt(txtCod.getText().trim()));
                        }
                    }
                }
                con.close();
                conM.close();
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void rbHoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbHoyActionPerformed
        // TODO add your handling code here:
        txtFDesde.setEnabled(false);
        txtFDesde.setText("");
        txtFDesdeR.setText("");
        dcFDesde.setEnabled(false);
        txtFHasta.setEnabled(false);
        txtFHasta.setText("");
        txtFHastaR.setText("");
        dcFHasta.setEnabled(false);
    }//GEN-LAST:event_rbHoyActionPerformed

    private void rbEntreFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEntreFechasActionPerformed
        // TODO add your handling code here:
        txtFDesde.setEnabled(true);
        dcFDesde.setEnabled(true);
        txtFHasta.setEnabled(true);
        dcFHasta.setEnabled(true);
    }//GEN-LAST:event_rbEntreFechasActionPerformed

    private void dcFDesdeOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_dcFDesdeOnCommit
        // TODO add your handling code here:
        txtFDesde.setText(Fecha.fechaCFormulario(dcFDesde.getText()));
        txtFDesdeR.setText(Fecha.formatoFecha(dcFDesde.getText()));
    }//GEN-LAST:event_dcFDesdeOnCommit

    private void dcFHastaOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_dcFHastaOnCommit
        // TODO add your handling code here:
        txtFHasta.setText(Fecha.fechaCFormulario(dcFHasta.getText()));
        txtFHastaR.setText(Fecha.formatoFecha(dcFHasta.getText()));
    }//GEN-LAST:event_dcFHastaOnCommit

    private void txtFHastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFHastaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFHastaActionPerformed

    private void txtFDesdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFDesdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFDesdeActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        // TODO add your handling code here:
        try {
            dlgBuscarCliente1 bcliente = new dlgBuscarCliente1(null, true);
            bcliente.setLocationRelativeTo(null);
            bcliente.setVisible(true);
        } catch (Exception e) {
            Mensajes.informacion("No hay conexión con el servidor");
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void itemBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarClienteActionPerformed
        // TODO add your handling code here:
        btnBuscarCliente.doClick();
    }//GEN-LAST:event_itemBuscarClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dlgReporteVentapoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgReporteVentapoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgReporteVentapoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgReporteVentapoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dlgReporteVentapoCliente dialog = new dlgReporteVentapoCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.panel.PanelImage Blanco;
    private javax.swing.ButtonGroup GrupoReporte;
    private org.edisoncor.gui.panel.PanelImage Oscuro;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbCompleto;
    private javax.swing.JCheckBox cbResumido;
    public static datechooser.beans.DateChooserCombo dcFDesde;
    public static datechooser.beans.DateChooserCombo dcFHasta;
    private javax.swing.JMenuItem itemBuscarCliente;
    private javax.swing.JMenuItem itemNuevoGenerar;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JLabel lbFechaActual;
    private javax.swing.JLabel lbFechaActualR;
    public static javax.swing.JLabel lbNombreFantacia;
    private javax.swing.JRadioButton rbEntreFechas;
    private javax.swing.JRadioButton rbHoy;
    public static javax.swing.JTextField txtCod;
    public static javax.swing.JTextField txtDescripcion;
    public static javax.swing.JTextField txtFDesde;
    public static javax.swing.JTextField txtFDesdeR;
    public static javax.swing.JTextField txtFHasta;
    public static javax.swing.JTextField txtFHastaR;
    public static javax.swing.JTextField txtRuc;
    // End of variables declaration//GEN-END:variables
}
