/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cbr_malaria.admin;

import static cbr_malaria.admin.Edit_Penyakit.text;
import cbr_malaria.model.Admin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Fauzy Wahyudi
 */
public class Edit_Gejala extends javax.swing.JFrame {

      Statement st;
    Connection con;
    ResultSet rs,rs2,rsCek;
    String sql="";
    String sql2="";
    String newKodeGejala="";
    String kodeTerakhir="";
    String sqlCek="";
    
    String kodeGejala; 
    String idGejala;
    String namaGejala;
    String bobotGejala;
    Admin user;
    
    int indexTabbed;
    public Edit_Gejala(int index, String kode, Admin user) {
        initComponents();
        setTitle("Edit Gejala");
        indexTabbed = index;
        koneksiDB();
        kodeTerakhir=lastKode();
        kodeGejala = text;
        koneksiDB();
        getData();
        this.user=user;
    }
    
    public void koneksiDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/cbr_malaria","root","");
            st=con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal Terhubung");
        }
    }
    
    
    String lastKode(){
        koneksiDB();
        String kode="";
        try {
            sqlCek = "select * from tb_gejala order by kode_gejala desc limit 1";
            rsCek=st.executeQuery(sqlCek);
            if(rsCek.next()){
                kode=rsCek.getString(2);
            }else{
                kode="G00";
            }
        } catch (Exception e) {
        }
        return kode;
    }
    
    public void cleardata(){
        txtKode.setText("");
        txtBobot.setText("");
    }
    
     public void getData() {
        koneksiDB();
        String _kode = kodeGejala;
        try {
            rs = st.executeQuery("SELECT * FROM tb_gejala WHERE kode_gejala ='" + _kode + "'");
            while (rs.next()) {
                idGejala = rs.getString(1);
                namaGejala = rs.getString(3);
                bobotGejala = rs.getString(4);
                txtKode.setText(kodeGejala);
                txtGejala.setText(namaGejala);
                txtBobot.setText(bobotGejala);
            }
        } catch (Exception e) {
        }

    }
     
     boolean cekKode(String kode, String id) {
        koneksiDB();
        boolean kodeSama = false;

        System.out.println("id : " + id + " kode : " + kode);
        try {
            sqlCek = "SELECT * FROM tb_gejala WHERE kode_gejala='" + kode + "'";
            rsCek = st.executeQuery(sqlCek);
            if (rsCek.next()) {
                String _id = rsCek.getString(1);
                String _kode = rsCek.getString(2);
                System.out.println("id : " + _id + " kode : " + _kode);
                if (!id.equals(_id) && kode.equals(_kode)) {
                    kodeSama = true;
                }
            }
        } catch (Exception e) {
        }

        return kodeSama;
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
        jLabel2 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnTambah1 = new javax.swing.JButton();
        txtBobot = new javax.swing.JTextField();
        txtGejala = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tambah Gejala");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kode Gejala");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bobot");

        btnEdit.setBackground(new java.awt.Color(255, 255, 255));
        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(51, 153, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbr_malaria/assets/save.png"))); // NOI18N
        btnEdit.setText("Edit Gejala");
        btnEdit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnTambah1.setBackground(new java.awt.Color(255, 255, 255));
        btnTambah1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTambah1.setForeground(new java.awt.Color(51, 153, 255));
        btnTambah1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbr_malaria/assets/icon_prev_screen.gif"))); // NOI18N
        btnTambah1.setText("Kembali");
        btnTambah1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah1ActionPerformed(evt);
            }
        });

        txtBobot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBobotKeyTyped(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Gejala");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtKode)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtBobot)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtGejala))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGejala, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBobot, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String id = String.valueOf(idGejala);
        String _kode = String.valueOf(txtKode.getText());
        String _gejala = String.valueOf(txtGejala.getText());
        String _bobot = String.valueOf(txtBobot.getText());
        boolean kodeSama = cekKode(_kode, id);

        if (kodeSama) {
             JOptionPane.showMessageDialog(null, "Kode Gejala "+_kode+" sudah ada. Silahkan pilih kode lainnya!");
        } else {
            if (_gejala.equals("") || _bobot.equals("") || _kode.equals("")) {
                JOptionPane.showMessageDialog(null, "Kode, Nama dan Bobot Gejala tidak boleh kosong!");
            } else {

                int ok = JOptionPane.showConfirmDialog(null, "Anda Yakin Simpan Data", "Konfirmasi", JOptionPane.YES_NO_OPTION);

                System.out.println(String.valueOf(ok));
                if (ok == 0) {
                    koneksiDB();
                    try {
                        java.sql.Statement stm = con.createStatement();
                        sql = "UPDATE tb_gejala SET kode_gejala='" + _kode + "',"
                                + "nama_gejala='" + _gejala + "',bobot='" + _bobot + "'"
                                + "WHERE id_gejala='"+id+"'";
                        stm.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null, "Edit Berhasil!");
                        new Menu_Admin(user.getUsername(),user.getPassword(),3).show();
                        dispose();

                    } catch (Exception e) {
                        System.out.println(e);
                        System.out.println("Gagal Edit");
                    }

                } else {
                    System.out.println("cancel");
                }

            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnTambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah1ActionPerformed
          try {
              new Menu_Admin(user.getUsername(),user.getPassword(),indexTabbed).show();
          } catch (SQLException ex) {
              Logger.getLogger(Edit_Gejala.class.getName()).log(Level.SEVERE, null, ex);
          }
        dispose();
    }//GEN-LAST:event_btnTambah1ActionPerformed

    private void txtBobotKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBobotKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_txtBobotKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[],final Admin admin) {
        text = args[0];
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
            java.util.logging.Logger.getLogger(Edit_Gejala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_Gejala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_Gejala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_Gejala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_Gejala(3, text,admin).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnTambah1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBobot;
    private javax.swing.JTextField txtGejala;
    private javax.swing.JTextField txtKode;
    // End of variables declaration//GEN-END:variables
}
