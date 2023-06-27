package IU;

import Componentes.Mensajes;
import Componentes.Software;
import Componentes.traerIP;
import Controladores.ControlLogeo;
import Controladores.controlPerfil;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.UnsupportedLookAndFeelException;

public final class frmAcceso extends javax.swing.JFrame {

    public frmAcceso() {
        initComponents();
        titulo();
        cargarIcono();
        try {
            lblIP.setText("HOST IP : " + traerIP.getIP());
            lblHost.setText("HOST: " + traerIP.getHostname());
        } catch (Exception e) {
        }

        txtUsuario.requestFocus();

    }

    void titulo() {
        if (Software.getSoftware().equals("null")) {
            this.setTitle("Bienvenido");
        } else {
            this.setTitle("Bienvendo a " + Software.getSoftware());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        psPasword = new RSMaterialComponent.RSPasswordMaterial();
        txtUsuario = new RSMaterialComponent.RSTextFieldMaterial();
        btnEntrar = new RSMaterialComponent.RSButtonIconTwo();
        lblHost = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnSalir = new RSMaterialComponent.RSButtonIconUno();
        lblIP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ACCESO.png"))); // NOI18N
        panelImage1.setPreferredSize(new java.awt.Dimension(690, 418));
        panelImage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icon.png"))); // NOI18N
        panelImage1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 260, 90));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("USUARIO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 14, -1, 30));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CONTRASEÑA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 53, -1, 30));

        lblMensaje.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(255, 255, 255));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 90, 236, 16));

        psPasword.setForeground(new java.awt.Color(0, 0, 0));
        psPasword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        psPasword.setColorMaterial(new java.awt.Color(0, 102, 102));
        psPasword.setPlaceholder("");
        psPasword.setSelectionColor(new java.awt.Color(0, 102, 102));
        psPasword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psPaswordActionPerformed(evt);
            }
        });
        psPasword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                psPaswordKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                psPaswordKeyTyped(evt);
            }
        });
        jPanel1.add(psPasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 52, 170, 31));

        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setColorMaterial(new java.awt.Color(0, 102, 102));
        txtUsuario.setPhColor(new java.awt.Color(153, 153, 153));
        txtUsuario.setPlaceholder("");
        txtUsuario.setSelectionColor(new java.awt.Color(0, 102, 102));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 14, 170, 31));

        btnEntrar.setBackground(new java.awt.Color(255, 255, 255));
        btnEntrar.setBackgroundHover(new java.awt.Color(0, 102, 102));
        btnEntrar.setForegroundText(new java.awt.Color(0, 102, 102));
        btnEntrar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CHECK);
        btnEntrar.setTypeBorder(RSMaterialComponent.RSButtonIconTwo.TYPEBORDER.CIRCLE);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 90, 59, 60));

        panelImage1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 254, 330, 160));

        lblHost.setFont(new java.awt.Font("HelveticaCondensed", 1, 20)); // NOI18N
        lblHost.setForeground(new java.awt.Color(255, 255, 255));
        lblHost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHost.setText("NOMBRE HOST");
        lblHost.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblHost.setVerifyInputWhenFocusTarget(false);
        panelImage1.add(lblHost, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 310, 40));

        jLabel19.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Software de gestión de Articulos, Compras & Ventas");
        panelImage1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        btnSalir.setBackground(new java.awt.Color(0, 102, 102));
        btnSalir.setBackgroundHover(new java.awt.Color(205, 0, 0));
        btnSalir.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        btnSalir.setTypeBorder(RSMaterialComponent.RSButtonIconUno.TYPEBORDER.CIRCLE);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panelImage1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 0, 20, 20));

        lblIP.setBackground(new java.awt.Color(255, 255, 255));
        lblIP.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        lblIP.setForeground(new java.awt.Color(0, 102, 102));
        lblIP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIP.setText("IP : ");
        panelImage1.add(lblIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 430, 200, 18));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
        psPasword.requestFocus();
        psPasword.selectAll();
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        int limite = 10;
        if (txtUsuario.getText().length() == limite) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void psPaswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_psPaswordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnEntrar.doClick();
        }
    }//GEN-LAST:event_psPaswordKeyPressed

    private void psPaswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_psPaswordKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        int limite = 15;
        if (psPasword.getText().length() == limite) {
            evt.consume();
        }
    }//GEN-LAST:event_psPaswordKeyTyped


    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
        try {
            ControlLogeo.logear();
            controlPerfil.perfil();
            this.dispose();
        } catch (Exception e) {
            txtUsuario.requestFocus();
            txtUsuario.selectAll();
            System.out.println("Error al cargar Principal: " + e.toString());
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void psPaswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psPaswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psPaswordActionPerformed


    void cargarIcono() {
        try {
            java.awt.Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Iconos/logo1.png"));
            setIconImage(icon);
            setVisible(true);
            this.setLocationRelativeTo(null);
        } catch (Exception e) {
            Mensajes.error("No se pudo cargo icono");
        }
    }

    /*void LookAndFeel() {
        //Look And Feel
        System.setProperty(
                "Quaqua.tabLayoutPolicy", "wrap"
        );
        try {
            //UIManager.setLookAndFeel(tema);
            UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
            //UIManager.setLookAndFeel(new SyntheticaBlackMoonLookAndFeel());
            //UIManager.setLookAndFeel(new SyntheticaBlueIceLookAndFeel());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ParseException | UnsupportedLookAndFeelException erro) {
            //Mensajes.informacion("Error al cargar el tema");
            System.out.println("Error al cargar el tema");
        }
    }*/
 /*public void LookAndFeel2() {
        //Look And Feel
        System.setProperty(
                "Quaqua.tabLayoutPolicy", "wrap"
        );
        try {
            SubstanceLookAndFeel.setSkin(tema);
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception erro) {
            Mensajes.informacion("Error al cargar el tema");
        }
    }*/

    /**
     * @param args the command line arguments
     * @throws javax.swing.UnsupportedLookAndFeelException
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAcceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmAcceso().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonIconTwo btnEntrar;
    private RSMaterialComponent.RSButtonIconUno btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lblHost;
    public static javax.swing.JLabel lblIP;
    public static javax.swing.JLabel lblMensaje;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    public static RSMaterialComponent.RSPasswordMaterial psPasword;
    public static RSMaterialComponent.RSTextFieldMaterial txtUsuario;
    // End of variables declaration//GEN-END:variables

}
