package com.dulcehogar.guis;

import com.dulcehogar.utils.Mensajes;
import com.dulcehogar.managers.RegistroSocioManager;
import com.dulcehogar.managers.SocioManager;
import com.dulcehogar.utils.Utils;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class PagarCuota extends javax.swing.JFrame {
    private Menu menuPrincipal;
    private RegistroSocioManager regSocioManager;
    
    public PagarCuota() {
        initComponents();
    }
    
    // Constructor para la ventana de pago de cuotas
    public PagarCuota(Menu menuPrincipal, RegistroSocioManager regSocioManager) {
        initComponents();
        this.regSocioManager = regSocioManager;
        this.menuPrincipal = menuPrincipal;
        
        // Agregar un WindowsListener para desmarcar el CheckBox al cerrar
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                menuPrincipal.desmarcarCheckbox();
                menuPrincipal.setVisible(true);
            }
        });
        
        // Configurar el boton VOLVER
        btnVolver.addActionListener(evt -> {
            menuPrincipal.setVisible(true);
            // Desmarcar todos los CheckBox del menu principal
            menuPrincipal.desmarcarCheckbox();
            // Cerrar la ventana actual de RegistroSocio
            this.dispose();
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

        lblRutSocio = new javax.swing.JLabel();
        txtRutSocio = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblMontoCuota = new javax.swing.JLabel();
        txtMontoCuota = new javax.swing.JTextField();
        lblNumeroCuota = new javax.swing.JLabel();
        txtNumeroCuota = new javax.swing.JTextField();
        btnPagar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DulceHogar - Pagar Cuota");

        lblRutSocio.setText("Rut del Socio");

        txtRutSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutSocioActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblMontoCuota.setText("Monto Cuota:");

        txtMontoCuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoCuotaActionPerformed(evt);
            }
        });

        lblNumeroCuota.setText("N�mero Cuota:");

        txtNumeroCuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroCuotaActionPerformed(evt);
            }
        });

        btnPagar.setText("PAGAR");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolver)
                    .addComponent(btnPagar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblNumeroCuota)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNumeroCuota))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblMontoCuota)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMontoCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnBuscar)
                        .addComponent(lblRutSocio)
                        .addComponent(txtRutSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblRutSocio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRutSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMontoCuota)
                    .addComponent(txtMontoCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroCuota)
                    .addComponent(txtNumeroCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPagar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolver)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRutSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutSocioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutSocioActionPerformed

    private void txtNumeroCuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCuotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroCuotaActionPerformed
    
    /**
     * Metodo para buscar a un socio mediante su RUT tambien
     * muestra un mensaje con los datos del socio si es encontrado
     */
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String rutIngresado = txtRutSocio.getText().trim();
        String rutFormateado = Utils.formatearRut(rutIngresado);

        if (rutFormateado == null) {
            Mensajes.mostrarError(this, Mensajes.ERROR_FORMATO_RUT);
            return;
        }

        SocioManager socio = regSocioManager.buscarSocioPorRut(rutFormateado);
        if (socio == null) {
            Mensajes.mostrarExito(this, Mensajes.SOCIO_NO_ENCONTRADO);
        } else {
            JOptionPane.showMessageDialog(this,
                "Datos del Socio:\n" +
                "N� de Socio: " + socio.getNumDeSocio() + "\n" +
                "Rut: " + socio.getRun() + "\n" +
                "Nombre: " + socio.getNombre() + "\n" +
                "Apellido Paterno: " + socio.getApPaterno() + "\n" +
                "Apellido Materno: " + socio.getApMaterno() + "\n" +
                "Correo: " + socio.getCorreo() + "\n" +
                "Domicilio: " + socio.getDomicilio() + "\n" +
                "Regi�n: " + socio.getRegion() + "\n" +
                "Ciudad: " + socio.getCiudad() + "\n" +
                "Comuna: " + socio.getComuna() + "\n" +
                "Tel�fono: " + socio.getTelefono() + "\n" +
                "Valor Cuota: " + Utils.formatearDinero(socio.getValorCuotaMensual()) + "\n" +
                "Cantidad Aportada: " + Utils.formatearDinero(socio.getCantidadAportada()),
                "Informaci�n",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    /**
     * Metodo para registrar un pago de cuota de un socio tambien
     * valida los datos ingresados y los registra si son v�lidos.
     */
    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        // Obtenemos el RUT ingresado y le damos formato
        String rutIngresado = txtRutSocio.getText().trim();
        String rutFormateado = Utils.formatearRut(rutIngresado);

        // Verifica si el RUT tiene un formato correcto
        if (rutFormateado == null) {
            Mensajes.mostrarError(this, Mensajes.ERROR_FORMATO_RUT);
            return;
        }

        // Busca al socio correspondiente al RUT ingresado
        SocioManager socio = regSocioManager.buscarSocioPorRut(rutFormateado);
        if (socio == null) {
            Mensajes.mostrarError(this, Mensajes.SOCIO_NO_ENCONTRADO);
            return;
        }

        // Verifica que la casilla de Monto Cuota no este vac�a
        if (txtMontoCuota.getText().trim().isEmpty()) {
            Mensajes.mostrarError(this, "Por favor, ingresa un monto v�lido en el campo 'Monto Cuota'.");
            return;
        }

        // Validamos el monto ingresado
        int montoIngresado;
        final int montoEsperado = socio.getValorCuotaMensual(); // Valor de la cuota fija mensual
        try {
            montoIngresado = Integer.parseInt(txtMontoCuota.getText().trim());
            if (montoIngresado != montoEsperado) {
                Mensajes.mostrarError(this, "El monto ingresado no es v�lido. La cuota mensual debe ser de " + Utils.formatearDinero(montoEsperado) + ".");
                return;
            }
        } catch (NumberFormatException e) {
            Mensajes.mostrarError(this, "Por favor, ingresa un monto num�rico v�lido en el campo 'Monto Cuota'.");
            return;
        }

        int numeroCuotas;
        try {
            numeroCuotas = Integer.parseInt(txtNumeroCuota.getText().trim());
            if (numeroCuotas <= 0) {
                Mensajes.mostrarError(this, "El n�mero de cuotas debe ser mayor que 0.");
                return;
            }
        } catch (NumberFormatException e) {
            Mensajes.mostrarError(this, "Por favor, ingresa un n�mero v�lido mayor que 0 en el campo 'N�mero Cuota'.");
            return;
        }

        // Calcula el monto total basado en el numero de cuotas
        int montoTotal = numeroCuotas * montoEsperado; // Multiplica por el numero de cuotas

        // Registrar el pago en el sistema
        if (regSocioManager.registrarPago(socio.getNumDeSocio(), montoTotal)) {
            // Actualizar la cantidad aportada del socio en memoria
            socio.aumentarCantidadAportada(montoTotal); // Incrementar el total aportado en memoria

            // Obtener valores necesarios para el c�lculo
            int valorCuotaMensual = socio.getValorDeCuota(); // Valor fijo de la cuota mensual
            int totalCuotas = 12; // Total de cuotas anuales
            int cantidadPagada = socio.getCantidadAportada(); // Total aportado por el socio hasta ahora

            // Calcular el saldo pendiente en base al total anual menos lo pagado
            int saldoPendiente = totalCuotas * valorCuotaMensual - cantidadPagada;

            // Calcular cuotas restantes basadas en el saldo pendiente
            int cuotasRestantes = saldoPendiente / valorCuotaMensual;

            // Asegurarse de que las cuotas restantes no sean negativas
            cuotasRestantes = Math.max(cuotasRestantes, 0);

            // Mostrar mensajes si el estado de las cuotas restantes es 0
            if (cuotasRestantes == 0) {
                // Mostrar mensaje si el socio ha pagado todas las cuotas anuales
                Mensajes.mostrarInfo(this, "Sus cuotas anuales han sido canceladas en su totalidad. �Much�simas gracias!");
            } else {
                Mensajes.mostrarInfo(this, String.format(
                        "El pago de %d cuotas se ha registrado exitosamente. Monto total: %s\nCuotas restantes por pagar: %d",
                        numeroCuotas, Utils.formatearDinero(montoTotal), cuotasRestantes));
            }
        } else {
            // Mostrar mensaje si ocurre un problema al registrar el pago
            Mensajes.mostrarError(this, "Hubo un problema al registrar el pago.");
        }

        // Limpiar las casillas para facilitar el pr�ximo uso
        txtMontoCuota.setText("");
        txtNumeroCuota.setText("");
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtMontoCuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoCuotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoCuotaActionPerformed

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
            java.util.logging.Logger.getLogger(PagarCuota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagarCuota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagarCuota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagarCuota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagarCuota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblMontoCuota;
    private javax.swing.JLabel lblNumeroCuota;
    private javax.swing.JLabel lblRutSocio;
    private javax.swing.JTextField txtMontoCuota;
    private javax.swing.JTextField txtNumeroCuota;
    private javax.swing.JTextField txtRutSocio;
    // End of variables declaration//GEN-END:variables
}
