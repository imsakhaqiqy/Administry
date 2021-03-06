/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author asus x401
 */
public class Menu extends javax.swing.JDialog {
    Connection c = null;
    Statement s = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public int tipeMenuId,menuId;
    /**
     * Creates new form Menu
     */
    public Menu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        labelRoot.setVisible(false);
        cRoot.setVisible(false);
        setTipeMenu();
    }
    
    public void setTipeMenu(){
        cTipeMenu.addItem("Menu Utama");
        cTipeMenu.addItem("Sub Menu");
    }
    
    public void setMenu(){
        c = koneksi.koneksi.library();
        String sql = "SELECT id,name FROM menu";
        try{
            s = c.createStatement();
            rs = s.executeQuery(sql);
            cRoot.addItem("--Pilih Menu Utama--");
            while(rs.next()){
                cRoot.addItem(rs.getString(2));
            }
        }catch(Exception er){
            er.printStackTrace();
        }
        
    }
    
    public void getMenuId(String nama){
        c = koneksi.koneksi.library();
        String sql = "SELECT id FROM menu WHERE name='"+nama+"'";
        try{
            s = c.createStatement();
            rs = s.executeQuery(sql);
            rs.absolute(1);
            this.menuId = rs.getInt(1);
        }catch(Exception er){
            er.printStackTrace();
        }
    }
    
    Integer MenuId(){
        return menuId;
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
        jLabel1 = new javax.swing.JLabel();
        iNama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        iKeterangan = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        cTipeMenu = new javax.swing.JComboBox<>();
        labelRoot = new javax.swing.JLabel();
        cRoot = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tambah Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 11))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel1.setText("Nama");

        iNama.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel2.setText("Keterangan");

        iKeterangan.setColumns(20);
        iKeterangan.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        iKeterangan.setRows(5);
        jScrollPane1.setViewportView(iKeterangan);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel3.setText("Tipe Menu");

        cTipeMenu.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        cTipeMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Tipe Menu--" }));
        cTipeMenu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cTipeMenuItemStateChanged(evt);
            }
        });

        labelRoot.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelRoot.setText("Root");

        cRoot.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        cRoot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Menu Utama--" }));
        cRoot.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cRootItemStateChanged(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelRoot)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(iNama)
                            .addComponent(cTipeMenu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cRoot, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(iNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cTipeMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRoot)
                    .addComponent(cRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cTipeMenuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cTipeMenuItemStateChanged
        // TODO add your handling code here:
        String tipeMenu = String.valueOf(cTipeMenu.getSelectedItem().toString());
        switch(tipeMenu){
            case "--Pilih Tipe Menu--" :
                tipeMenuId = 0;
                labelRoot.setVisible(false);
                cRoot.setVisible(false);
                cRoot.removeAllItems();
            case "Menu Utama" :
                tipeMenuId = 1;
                labelRoot.setVisible(false);
                cRoot.setVisible(false);
                cRoot.removeAllItems();
            break;
            case "Sub Menu" :
                tipeMenuId = 2;
                labelRoot.setVisible(true);
                cRoot.setVisible(true);
                cRoot.removeAllItems();
                setMenu();
            break;
            default :
                tipeMenuId = 0;
        }
    }//GEN-LAST:event_cTipeMenuItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String tipeMenu = String.valueOf(cTipeMenu.getSelectedItem().toString());
        if(tipeMenu.equals("Menu Utama")){
            try{
                Connection c = null;
                PreparedStatement ps = null;
                ResultSet rs = null;
                c = koneksi.koneksi.library();
                String namaMenu = String.valueOf(iNama.getText());
                String keterangan = String.valueOf(iKeterangan.getText());
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = new Date();
                ps = c.prepareStatement("INSERT INTO menu (id,name,description,created_at,updated_at,deleted) values (?,?,?,?,?,?)");
                ps.setInt(1, 0);
                ps.setString(2, namaMenu);
                ps.setString(3, keterangan);
                ps.setString(4,dateFormat.format(date));
                ps.setString(5,dateFormat.format(date));
                ps.setInt(6,0);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Menu berhasil ditambahkan");
            }catch(Exception err){
                JOptionPane.showMessageDialog(null, err);
            }
        }else{
            try{
                Connection c = null;
                PreparedStatement ps = null;
                ResultSet rs = null;
                c = koneksi.koneksi.library();
                String namaMenu = String.valueOf(iNama.getText());
                String keterangan = String.valueOf(iKeterangan.getText());
                String menu = String.valueOf(cRoot.getSelectedItem().toString());
                getMenuId(menu);
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = new Date();
                ps = c.prepareStatement("INSERT INTO sub_menu (id,name,description,menu_id,created_at,updated_at,deleted) values (?,?,?,?,?,?,?)");
                ps.setInt(1, 0);
                ps.setString(2, namaMenu);
                ps.setString(3, keterangan);
                ps.setInt(4, MenuId());
                ps.setString(5,dateFormat.format(date));
                ps.setString(6,dateFormat.format(date));
                ps.setInt(7,0);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Menu berhasil ditambahkan");
            }catch(Exception err){
                JOptionPane.showMessageDialog(null, err);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cRootItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cRootItemStateChanged
        // TODO add your handling code here:
        //String menu = String.valueOf(cRoot.getSelectedItem().toString());
        //getMenuId("Keanggotaan");
    }//GEN-LAST:event_cRootItemStateChanged

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

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Menu dialog = new Menu(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cRoot;
    private javax.swing.JComboBox<String> cTipeMenu;
    private javax.swing.JTextArea iKeterangan;
    private javax.swing.JTextField iNama;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelRoot;
    // End of variables declaration//GEN-END:variables
}
