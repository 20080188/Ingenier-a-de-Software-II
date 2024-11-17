package com.mycompany.drturnosgui;

import java.util.Set;
import javax.swing.JOptionPane;

//Interfaz grafica para agregar un paciente:
public class AgregarClienteGUI extends javax.swing.JFrame {
    
    //Sets para guardar obras sociales y clientes
    private Set<ObraSocial> obrasSociales;
    private Set<Cliente> clientes;
    private ClientesGUI clientesGUI;
    
    public AgregarClienteGUI(Set<Cliente> clientes, Set<ObraSocial> obrasSociales, ClientesGUI clientesGUI) {
        this.obrasSociales = obrasSociales;
        this.clientes = clientes;
        this.clientesGUI = clientesGUI;
        
        initComponents();
        
        //Agregar las obras sociales cargadas al combo box
        for (ObraSocial obraSocial : obrasSociales) {
             boxObrasSociales.addItem(obraSocial.getObraSocial());
        } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblDni = new javax.swing.JLabel();
        fieldDni = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        fieldNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        fieldTelefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        boxObrasSociales = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        lblDni.setText("DNI:");

        fieldDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDniActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre:");

        jLabel1.setText("Teléfono:");

        jLabel2.setText("Obra social:");

        boxObrasSociales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxObrasSocialesActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(0, 204, 153));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldDni, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDni)
                    .addComponent(lblNombre)
                    .addComponent(fieldNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(fieldTelefono)
                    .addComponent(jLabel2)
                    .addComponent(boxObrasSociales, 0, 276, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxObrasSociales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDniActionPerformed

    private void boxObrasSocialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxObrasSocialesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxObrasSocialesActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        agregarCliente();
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxObrasSociales;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextField fieldDni;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
   
//Metodo para guardar al cliente en el Set clientes:
    private void agregarCliente() {  
    //Guarda la informacion del cliente ingresada por el usuario
    String nuevoDni = fieldDni.getText();
    String nuevoNombre = fieldNombre.getText();
    String nuevoTelefono = fieldTelefono.getText();
    String nuevaObraSocial = (String) boxObrasSociales.getSelectedItem();

    // Validación de DNI: Solo permite números
    if ((!nuevoDni.matches("\\d+"))&&(!fieldDni.getText().isEmpty())) {
        showError("El DNI debe contener solo números.");
        return;
    }

    // Validación de Nombre: No debe contener números
    if ((nuevoNombre.matches(".*\\d.*"))&&(!fieldNombre.getText().isEmpty())) {
        showError("El Nombre no debe contener números.");
        return;
        }

    // Validación de Teléfono: Solo permite números
    if ((!nuevoTelefono.matches("\\d+"))&&(!fieldTelefono.getText().isEmpty())) {
        showError("El Teléfono debe contener solo números.");
        return;
    }

    Cliente nuevoCliente = new Cliente(nuevoDni, nuevoNombre, nuevoTelefono, nuevaObraSocial);

    /*Agrega al cliente al Set y a la tabla solo en caso de que no se haya cargado anteriormente. 
    Caso contrario, muestra un mensaje de error.*/
    if (!clienteExists(nuevoCliente)) {
        System.out.println("Agregando...");
        clientes.add(nuevoCliente); 
        clientesGUI.actualizarTabla();  
        dispose();
    } else {
        showError("Ya existe un cliente registrado con el mismo DNI.");
    }
}
  
    /*Metodo que verifica si un cliente (con el mismo dni ingresado por el usuario) ya existe en el Set clientes,
    es decir, ya esta cargado en sistema:*/
    
    private boolean clienteExists(Cliente cliente) {
        for (Cliente clienteExistente : clientes) {
            if (clienteExistente.getDni().equals(cliente.getDni())) {
                return true;
            }
        }    
        return false;
        }
    
    //Metodo que muestra el error en pantalla:
    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }  
}
