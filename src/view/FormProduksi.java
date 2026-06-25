/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import dao.ProduksiDAO;
import model.Produksi;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author catur
 */
public class FormProduksi extends javax.swing.JFrame {
    
    private DefaultTableModel model;
        public FormProduksi() {
        initComponents();
        model = new DefaultTableModel();

        model.addColumn("ID");
        model.addColumn("Kode Produk");
        model.addColumn("Jumlah");
        model.addColumn("Tanggal Produksi");
        model.addColumn("Status");

        jTable1.setModel(model);

        tampilData();
    }
 
    private void tampilData() {

        model.setRowCount(0);

        ProduksiDAO dao = new ProduksiDAO();

        List<Produksi> list = dao.getAll();

        for (Produksi p : list) {

            model.addRow(new Object[]{

                p.getIdProduksi(),
                p.getKodeProduk(),
                p.getJumlah(),
                p.getTanggalProduksi(),
                p.getStatus()

            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdProduksi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtKodeProduk = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTanggalProduksi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox<>();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        tblProduksi = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("DATA PRODUKSI");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("ID Produksi                       :");

        txtIdProduksi.setBackground(new java.awt.Color(51, 255, 204));
        txtIdProduksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProduksiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Kode Produk                     :");

        txtKodeProduk.setBackground(new java.awt.Color(51, 255, 204));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Jumlah                               :");

        txtJumlah.setBackground(new java.awt.Color(51, 255, 204));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Tanggal Produksi              :");

        txtTanggalProduksi.setBackground(new java.awt.Color(51, 255, 204));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Status                                 :");

        cmbStatus.setBackground(new java.awt.Color(51, 255, 204));
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Diproses", "Selesai" }));
        cmbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStatusActionPerformed(evt);
            }
        });

        btnSimpan.setBackground(new java.awt.Color(51, 255, 204));
        btnSimpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUbah.setBackground(new java.awt.Color(51, 255, 204));
        btnUbah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(51, 255, 204));
        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(51, 255, 204));
        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnKembali.setBackground(new java.awt.Color(51, 255, 204));
        btnKembali.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(51, 255, 204));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Cari");

        txtCari.setBackground(new java.awt.Color(51, 255, 204));

        btnCari.setBackground(new java.awt.Color(51, 255, 204));
        btnCari.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(51, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        tblProduksi.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtKodeProduk)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdProduksi, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtJumlah)
                            .addComponent(txtTanggalProduksi)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnKembali)
                                .addGap(18, 18, 18)
                                .addComponent(btnSimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUbah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnHapus))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCari)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCari)
                            .addComponent(btnReset))))
                .addGap(164, 164, 164))
            .addComponent(tblProduksi)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdProduksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKodeProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTanggalProduksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus)
                    .addComponent(btnReset)
                    .addComponent(btnKembali))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addGap(18, 18, 18)
                .addComponent(tblProduksi, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdProduksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProduksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProduksiActionPerformed

    private void cmbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbStatusActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        Produksi p = new Produksi();

        p.setKodeProduk(
                txtKodeProduk.getText());

        p.setJumlah(
                Integer.parseInt(
                        txtJumlah.getText()));

        p.setTanggalProduksi(
                txtTanggalProduksi.getText());

        p.setStatus(
                cmbStatus.getSelectedItem().toString());

        ProduksiDAO dao =
                new ProduksiDAO();

        boolean sukses =
                dao.insert(p);

        if(sukses){

            JOptionPane.showMessageDialog(
                    this,
                    "Data Produksi Berhasil Disimpan");

            tampilData();

        }else{

            JOptionPane.showMessageDialog(
                    this,
                    "Data Produksi Gagal Disimpan");

        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtIdProduksi.setText("");
        txtKodeProduk.setText("");
        txtJumlah.setText("");
        txtTanggalProduksi.setText("");

        cmbStatus.setSelectedIndex(0);

        txtKodeProduk.requestFocus();
    }//GEN-LAST:event_btnResetActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int baris = jTable1.getSelectedRow();

        txtIdProduksi.setText(
                model.getValueAt(baris, 0).toString());

        txtKodeProduk.setText(
                model.getValueAt(baris, 1).toString());

        txtJumlah.setText(
                model.getValueAt(baris, 2).toString());

        txtTanggalProduksi.setText(
                model.getValueAt(baris, 3).toString());

        cmbStatus.setSelectedItem(
                model.getValueAt(baris, 4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        Produksi p = new Produksi();

        p.setIdProduksi(
                Integer.parseInt(
                        txtIdProduksi.getText()));

        p.setKodeProduk(
                txtKodeProduk.getText());

        p.setJumlah(
                Integer.parseInt(
                        txtJumlah.getText()));

        p.setTanggalProduksi(
                txtTanggalProduksi.getText());

        p.setStatus(
                cmbStatus.getSelectedItem().toString());

        ProduksiDAO dao =
                new ProduksiDAO();

        boolean sukses =
                dao.update(p);

        if(sukses){

            JOptionPane.showMessageDialog(
                    this,
                    "Data Berhasil Diubah");

            tampilData();

        }else{

            JOptionPane.showMessageDialog(
                    this,
                    "Data Gagal Diubah");

        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int idProduksi =
            Integer.parseInt(
                txtIdProduksi.getText());

        ProduksiDAO dao =
                new ProduksiDAO();

        boolean sukses =
                dao.delete(idProduksi);

        if(sukses){

            JOptionPane.showMessageDialog(
                    this,
                    "Data Berhasil Dihapus");

            tampilData();

            txtIdProduksi.setText("");
            txtKodeProduk.setText("");
            txtJumlah.setText("");
            txtTanggalProduksi.setText("");

            cmbStatus.setSelectedIndex(0);

        }else{

            JOptionPane.showMessageDialog(
                    this,
                    "Data Gagal Dihapus");

        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        String keyword =
            txtCari.getText();

        model.setRowCount(0);

        ProduksiDAO dao =
                new ProduksiDAO();

        List<Produksi> list =
                dao.cari(keyword);

        for(Produksi p : list){

            model.addRow(new Object[]{

                p.getIdProduksi(),
                p.getKodeProduk(),
                p.getJumlah(),
                p.getTanggalProduksi(),
                p.getStatus()

            });
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        new MenuUtama().setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

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
            java.util.logging.Logger.getLogger(FormProduksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProduksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProduksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProduksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProduksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane tblProduksi;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtIdProduksi;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtKodeProduk;
    private javax.swing.JTextField txtTanggalProduksi;
    // End of variables declaration//GEN-END:variables
}
