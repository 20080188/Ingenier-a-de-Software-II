
package com.mycompany.drturnosgui;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Interfaz grafica de obras sociales 
 * @author usuario
 */
public class ObrasSocialesGUI extends javax.swing.JFrame {
    
    private Set<ObraSocial> obrasSociales; //
    private DefaultTableModel tableModel; //Modelo de la tabla
    
    /**
     * Constructor de ObrasSocialesGUI
     * @param obrasSociales 
     */
    public ObrasSocialesGUI(Set<ObraSocial> obrasSociales) {
        this.obrasSociales = obrasSociales;
        if(!obraSocialExists("Particular")){
            this.obrasSociales.add(new ObraSocial("Particular"));
        }
        initComponents();
        loadTableData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_obra_social = new javax.swing.JTable();
        btn_eliminar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_obra_social.setBackground(new java.awt.Color(204, 255, 204));
        tbl_obra_social.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_obra_social.setGridColor(new java.awt.Color(0, 153, 153));
        tbl_obra_social.setSelectionBackground(new java.awt.Color(153, 255, 153));
        jScrollPane1.setViewportView(tbl_obra_social);
        if (tbl_obra_social.getColumnModel().getColumnCount() > 0) {
            tbl_obra_social.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 400));

        btn_eliminar.setBackground(new java.awt.Color(0, 204, 153));
        btn_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 130, -1));

        btn_agregar.setBackground(new java.awt.Color(0, 204, 153));
        btn_agregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 130, -1));

        btn_modificar.setBackground(new java.awt.Color(0, 204, 153));
        btn_modificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(255, 255, 255));
        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 150, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        eliminarObraSocialSeleccionada();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        GuardarHashSet();
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
        agregarObraSocial();
        
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
        ModificarObraSocial();
        loadTableData();
    }//GEN-LAST:event_btn_modificarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_obra_social;
    // End of variables declaration//GEN-END:variables

    
    //Metodos
    
    /**
     * Metodo para comprobar si una obra social existe
     * @param particular es el nombre de la obra social
     * @return 
     */
    private boolean obraSocialExists(String nombreObraSocial) {
        for(ObraSocial obraSocial : obrasSociales){
            if(obraSocial.getObraSocial().equals(nombreObraSocial)){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Metodo que permite agregar una obra social
     */
    private void agregarObraSocial(){
        String input = JOptionPane.showInputDialog(null, "Ingrese la obra social a agregar:");
        
        if (input != null && !input.isEmpty()){
            ObraSocial nuevaObraSocial = new ObraSocial(input);
            
            /**
             * Convertir la obra social a minúsculas (o mayúsculas) 
             * para hacer la comparación insensible a mayúsculas/minúsculas
             */
            
            String obraSocialLowercase = nuevaObraSocial.getObraSocial().toLowerCase();
            
            if(!obraSocialExists(obraSocialLowercase)){
                obrasSociales.add(new ObraSocial(obraSocialLowercase));
                loadTableData();
            }
        }else{
            showError("La obra social ya existe.");
        }
    }
    
    /**
     * Metodo para cargar la informacion a la tabla
     */
    void loadTableData(){
        DefaultTableModel model = (DefaultTableModel) tbl_obra_social.getModel();
        if(model.getRowCount() > 0){
            model.setRowCount(0);
        }
        
        for(ObraSocial obraSocial : obrasSociales){
            model.addRow(new Object[]{obraSocial.getObraSocial()});
        }
    }
    
    /**
     * Metodo que muestra el error en pantalla
     * @param message, mensaje que va a mostrar por pantalla 
     */
    private void showError(String message){
        JOptionPane.showMessageDialog(this, message, "Error" , JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     * Metodo que guarda las obras sociales en el archivo "obrasSociales.ser"
     */
    public void GuardarHashSet(){
        guardarHashSet(obrasSociales, "obrasSociales.ser");
    }
    
    /**
     * Metodo para guardar un HashSet en un archivo
     * @param set, que se va a guardar 
     * @param fileName , nombre del archivo y tambien indicando el formato
     */
    private void guardarHashSet(Set<? extends Serializable> set, String fileName){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(set);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    /**
     * Metodo que elimina una obra social
     * @param obraSocial, es el nombre de la obrasocial que vamos a eliminar
     */
    private void eliminarObraSocial(String obraSocial){
        Iterator<ObraSocial> iterator = obrasSociales.iterator();
        while (iterator.hasNext()){
            ObraSocial obra = iterator.next();
            if (obra.getObraSocial().equals(obraSocial)){
                iterator.remove();
                break;
            }
        }
        loadTableData();
    }
    
    /**
     * Metodo que elimina la obra social que nosotros seleccionemos
     * haciendo click en la fila
     */
    private void eliminarObraSocialSeleccionada(){
        DefaultTableModel model = (DefaultTableModel) tbl_obra_social.getModel();
        
        int selectedRow = tbl_obra_social.getSelectedRow();
        
        if(selectedRow != -1){
            String obraSocial = model.getValueAt(selectedRow, 0).toString();
            if (!obraSocial.equals("Particular")){
                model.setValueAt("", selectedRow, 0);
                eliminarObraSocial(obraSocial);
            }else{
                showError("No se puede eliminar la obra social 'Particular'");
            }
        }else{
            showError("Selecciona una obra social para eliminar.");
        }
    }
    
    /**
     * Metodo para modificar una obra social
     */
    private void ModificarObraSocial(){
        DefaultTableModel model = (DefaultTableModel) tbl_obra_social.getModel();
        int selectedRow = tbl_obra_social.getSelectedRow(); 
        
        if(selectedRow != -1){
            String obraSocial = model.getValueAt(selectedRow, 0).toString();
            if (!obraSocial.equals("Particular")){
                String input = JOptionPane.showInputDialog(null, "Ingrese la nueva obra social:", obraSocial);
                ObraSocial nuevaObraSocial = new ObraSocial(input);
                if (input != null && !input.isEmpty() && !obrasSociales.contains(nuevaObraSocial)){
                    eliminarObraSocial(obraSocial);
                    obrasSociales.add(nuevaObraSocial);
                }
            }else{
                showError("No se puede modificar la obra social 'Particular'");
            }
        }else{
            showError("Seleccione una obra social");
        }
    }
}