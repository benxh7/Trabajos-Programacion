package com.dulcehogar.guis;

import com.dulcehogar.database.DBConnection;
import com.dulcehogar.database.SocioDatabase;
import com.dulcehogar.managers.RegistroSocioManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {
    RegistroSocioManager regSocioManager = new RegistroSocioManager(new SocioDatabase());
    DBConnection dbConnection = new DBConnection();

    public Menu() {
        initComponents();
        
        // Agregar un WindowListener para controlar el evento de cierre
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                // Mostrar un mensaje informando que la salida debe ser mediante el men�
                JOptionPane.showMessageDialog(
                    Menu.this,
                    "Por favor, utiliza la opci�n 'Salir del Programa' para cerrar la aplicaci�n.",
                    "Cierre no permitido",
                    JOptionPane.WARNING_MESSAGE
                );
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenuSocios = new javax.swing.JLabel();
        ckbRegistrarSocio = new javax.swing.JCheckBox();
        ckbVerDatosSocio = new javax.swing.JCheckBox();
        ckbPagarCuota = new javax.swing.JCheckBox();
        ckbConsultarPagoTotalCuotas = new javax.swing.JCheckBox();
        ckbConsultarNumCuotas = new javax.swing.JCheckBox();
        ckbSalir = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("DulceHogar - Menu de Socios");

        lblMenuSocios.setText("Opciones Cuentas de Socios");

        ckbRegistrarSocio.setText("Registrar Socio");
        ckbRegistrarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbRegistrarSocioActionPerformed(evt);
            }
        });

        ckbVerDatosSocio.setText("Ver Datos Socio");
        ckbVerDatosSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbVerDatosSocioActionPerformed(evt);
            }
        });

        ckbPagarCuota.setText("Pagar Cuota Mensual");
        ckbPagarCuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbPagarCuotaActionPerformed(evt);
            }
        });

        ckbConsultarPagoTotalCuotas.setText("Consultar Monto Total Cancelado");
        ckbConsultarPagoTotalCuotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbConsultarPagoTotalCuotasActionPerformed(evt);
            }
        });

        ckbConsultarNumCuotas.setText("Consultar N� Cuotas Por Cancelar");
        ckbConsultarNumCuotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbConsultarNumCuotasActionPerformed(evt);
            }
        });

        ckbSalir.setText("Salir del Programa");
        ckbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckbSalir)
                            .addComponent(ckbConsultarNumCuotas)
                            .addComponent(ckbConsultarPagoTotalCuotas)
                            .addComponent(ckbPagarCuota)
                            .addComponent(ckbVerDatosSocio)
                            .addComponent(ckbRegistrarSocio)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(lblMenuSocios)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblMenuSocios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbRegistrarSocio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckbVerDatosSocio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckbPagarCuota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckbConsultarPagoTotalCuotas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckbConsultarNumCuotas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckbSalir)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Accion del boton para registrar un socio
    private void ckbRegistrarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbRegistrarSocioActionPerformed
        // Crea la ventana de registro
        RegistroSocio regSocio = new RegistroSocio(this, regSocioManager);
        // Oculta el menu principal
        this.setVisible(false);
        // Muestra el menu de registro de socio
        regSocio.setVisible(true);
    }//GEN-LAST:event_ckbRegistrarSocioActionPerformed
    
    // Accion del boton para ver los datos de un socio
    private void ckbVerDatosSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbVerDatosSocioActionPerformed
        // Crea la ventana para ver los datos de un socio
        DatosSocio datosSocio = new DatosSocio(this, regSocioManager);
        // oculta el menu principal
        this.setVisible(false);
        // Muestra la ventana de datos
        datosSocio.setVisible(true);
    }//GEN-LAST:event_ckbVerDatosSocioActionPerformed
    
    // Accion del boton para ver los pagos de cuotas de un socio
    private void ckbPagarCuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbPagarCuotaActionPerformed
        // Crea la ventana para ver pagos de cuotas
        PagarCuota pagarCuota = new PagarCuota(this, regSocioManager);
        // Ocultar el menu principal
        this.setVisible(false);
        // Muestra la ventana de pagos de cuotas
        pagarCuota.setVisible(true);
    }//GEN-LAST:event_ckbPagarCuotaActionPerformed
    
    // Accion del boton salir, este nos permite salir del programa
    // Tambien, envia un coordialmensaje.
    private void ckbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbSalirActionPerformed
        // Desmarcamos todos las opciones seleccionadas
        this.desmarcarCheckbox();
        
        // Mostrar un mensaje de confirmaci�n antes de cerrar
        int confirmacion = JOptionPane.showConfirmDialog(
            this,
            "�Est�s seguro de que deseas salir del programa?",
            "Confirmar salida",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );
        if (confirmacion == JOptionPane.YES_OPTION) {
            // Cerramos la conexion hacia la base de datos
            dbConnection.closeConnection();
            
            // Muestra un mensaje al usuario indicando que saldra del programa
            JOptionPane.showMessageDialog(
                this,
                "Saliendo del Programa. �Muchas gracias! �Que tengas un buen d�a!", 
                "Salir del Programa", 
                JOptionPane.INFORMATION_MESSAGE
            );
            // Cerrar el programa completamente
            System.exit(0);
        }
    }//GEN-LAST:event_ckbSalirActionPerformed
    
    // Accion del boton para consultar el pago total de cuotas de un socio
    private void ckbConsultarPagoTotalCuotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbConsultarPagoTotalCuotasActionPerformed
        // Crea la ventana para ver pago total de cuotas
        ConsultaMontoTotal consultarMontoTotal = new ConsultaMontoTotal(this, regSocioManager);
        // Ocultar el menu principal
        this.setVisible(false);
        // Muestra la ventana de pago total de cuotas
        consultarMontoTotal.setVisible(true);
    }//GEN-LAST:event_ckbConsultarPagoTotalCuotasActionPerformed

    private void ckbConsultarNumCuotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbConsultarNumCuotasActionPerformed
        // Crea la ventana para ver las cuotas por pagar de un socio
        ConsultarCuotaPorPagar consultarCuotaPorPagar = new ConsultarCuotaPorPagar(this, regSocioManager);
        // Ocultar el menu principal
        this.setVisible(false);
        // Mostrar la ventana de ConsultarCuotaPorPagar
        consultarCuotaPorPagar.setVisible(true);
    }//GEN-LAST:event_ckbConsultarNumCuotasActionPerformed
    
    // Este metodo nos permite desmarcar el CheckBox de cada opcion en el menu
    public void desmarcarCheckbox() {
        ckbRegistrarSocio.setSelected(false);
        ckbVerDatosSocio.setSelected(false);
        ckbPagarCuota.setSelected(false);
        ckbConsultarPagoTotalCuotas.setSelected(false);
        ckbConsultarNumCuotas.setSelected(false);
        ckbSalir.setSelected(false);
    }
    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ckbConsultarNumCuotas;
    private javax.swing.JCheckBox ckbConsultarPagoTotalCuotas;
    private javax.swing.JCheckBox ckbPagarCuota;
    private javax.swing.JCheckBox ckbRegistrarSocio;
    private javax.swing.JCheckBox ckbSalir;
    private javax.swing.JCheckBox ckbVerDatosSocio;
    private javax.swing.JLabel lblMenuSocios;
    // End of variables declaration//GEN-END:variables
}
