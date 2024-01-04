/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author lenovo
 */
public class admin extends javax.swing.JFrame {
    private Statement st;
        private Connection Con;
        private ResultSet rs;
        private String sql="";
        private String IdWaliDipilih() {
        int selectedRow = jTable2.getSelectedRow();
        if (selectedRow != -1) {
            return jTable2.getModel().getValueAt(selectedRow, 0).toString();
        }
        return null;
    }

    /**
     * Creates new form admin
     */
    public admin() {
        initComponents();
        tampilDataSiswa();
        tampilDataWali();
        tampilDataTransaksi();
         jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    }
    
    
    
    
    private void tampilDataSiswa(){
        
        DefaultTableModel kolomkolom = new DefaultTableModel();
        kolomkolom.addColumn("No");
        kolomkolom.addColumn("NISN");
        kolomkolom.addColumn("Nama Siswa");
        kolomkolom.addColumn("Tanggal Lahir");
        kolomkolom.addColumn("Jenis Kelamin");
        kolomkolom.addColumn("Alamat");
        kolomkolom.addColumn("No HP");
        kolomkolom.addColumn("Asal Sekolah");
        kolomkolom.addColumn("Jurusan Pilihan");
        
         
        
        try{
            int nomorOtomatis = 1;
            // Mendapatkan koneksi dari Koneksi.koneksiDB()
            Connection connection = koneksi.koneksiDB();
            st=connection.createStatement();
            rs=st.executeQuery("SELECT*FROM siswa");
            while(rs.next()){
                kolomkolom.addRow(new Object[]{
                    (""+nomorOtomatis++),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9)
                });
                jTable1.setModel(kolomkolom);
                
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal menampilkan Database \n"+e);
        }
        
    }
    
    private void tampilDataWali(){
        
        DefaultTableModel kolomkolom = new DefaultTableModel();
        kolomkolom.addColumn("No");
        kolomkolom.addColumn("NISN");
        kolomkolom.addColumn("Nama Wali");
        kolomkolom.addColumn("Hubungan");
        kolomkolom.addColumn("Pekerjaan");
        kolomkolom.addColumn("Alamat");
        kolomkolom.addColumn("No HP");

        
         
        
        try{
            int nomorOtomatis = 1;
            // Mendapatkan koneksi dari Koneksi.koneksiDB()
            Connection connection = koneksi.koneksiDB();
            st=connection.createStatement();
            rs=st.executeQuery("SELECT*FROM wali");
            while(rs.next()){
                kolomkolom.addRow(new Object[]{
                    (""+nomorOtomatis++),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7)

                });
                jTable2.setModel(kolomkolom);
                
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal menampilkan Database \n"+e);
        }
        
    }
    
    private void tampilDataTransaksi(){
        
        DefaultTableModel kolomkolom = new DefaultTableModel();
        kolomkolom.addColumn("No");
        kolomkolom.addColumn("No Transaksi");
        kolomkolom.addColumn("NISN");
        kolomkolom.addColumn("Nama Siswa");
        kolomkolom.addColumn("Pembayaran");
        kolomkolom.addColumn("Biaya");

        
         
        
        try{
            int nomorOtomatis = 1;
            // Mendapatkan koneksi dari Koneksi.koneksiDB()
            Connection connection = koneksi.koneksiDB();
            st=connection.createStatement();
            rs=st.executeQuery("SELECT*FROM transaksi");
            while(rs.next()){
                kolomkolom.addRow(new Object[]{
                    (""+nomorOtomatis++),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6)

                });
                jTable3.setModel(kolomkolom);
                
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal menampilkan Database \n"+e);
        }
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btTambah = new javax.swing.JButton();
        btKembali = new javax.swing.JButton();
        btCetak = new javax.swing.JButton();
        btUbah = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        btRefresh = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        btnCetak = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        bTambah = new javax.swing.JButton();
        bUbah = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bKembali = new javax.swing.JButton();
        bCetak1 = new javax.swing.JButton();
        bRefresh = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FORM ADMIN");

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
        jScrollPane2.setViewportView(jTable1);

        btTambah.setText("Tambah");
        btTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTambahActionPerformed(evt);
            }
        });

        btKembali.setText("Kembali");
        btKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKembaliActionPerformed(evt);
            }
        });

        btCetak.setText("Cetak");
        btCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCetakActionPerformed(evt);
            }
        });

        btUbah.setText("Ubah");
        btUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUbahActionPerformed(evt);
            }
        });

        btHapus.setText("Hapus");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });

        btRefresh.setText("Refresh");
        btRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1275, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btTambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btUbah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btHapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCetak)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btKembali)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btKembali, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btTambah)
                        .addComponent(btCetak)
                        .addComponent(btUbah)
                        .addComponent(btHapus)
                        .addComponent(btRefresh)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Tabel Pendaftaraan", jPanel1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        btnCetak.setText("Cetak");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1275, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUbah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCetak)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKembali)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKembali, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUbah)
                        .addComponent(btnTambah)
                        .addComponent(btnHapus)
                        .addComponent(btnCetak)
                        .addComponent(btnRefresh)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Tabel Wali Siswa", jPanel2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable3);

        bTambah.setText("Tambah");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        bUbah.setText("Ubah");
        bUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUbahActionPerformed(evt);
            }
        });

        bHapus.setText("Hapus");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bKembali.setText("Kembali");
        bKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKembaliActionPerformed(evt);
            }
        });

        bCetak1.setText("Cetak");
        bCetak1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCetak1ActionPerformed(evt);
            }
        });

        bRefresh.setText("Refresh");
        bRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1275, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bTambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bUbah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bHapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCetak1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bKembali)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bKembali, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bUbah)
                        .addComponent(bTambah)
                        .addComponent(bHapus)
                        .addComponent(bCetak1)
                        .addComponent(bRefresh)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Tabel Transaksi", jPanel3);

        jMenu1.setText("File");

        jMenuItem3.setText("Keluar");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseClicked(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKembaliActionPerformed
        MenuUtama menuUtama = new MenuUtama();
        menuUtama.setVisible(true);

        // Menutup form saat membuka MenuUtama
        this.dispose();
    }//GEN-LAST:event_bKembaliActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
       MenuUtama menuUtama = new MenuUtama();
        menuUtama.setVisible(true);

        // Menutup form saat membuka MenuUtama
        this.dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKembaliActionPerformed
        MenuUtama menuUtama = new MenuUtama();
        menuUtama.setVisible(true);

        // Menutup form saat membuka MenuUtama
        this.dispose();
    }//GEN-LAST:event_btKembaliActionPerformed

    private void btTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTambahActionPerformed
        formTambah Formtambah = new formTambah();
        Formtambah.setVisible(true);
               
    }//GEN-LAST:event_btTambahActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
  
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
       formWaliadmin Formwaliadmin = new formWaliadmin();
        Formwaliadmin.setVisible(true);
    }//GEN-LAST:event_btnTambahActionPerformed

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
        formTransaksiadmin Formtransaksiadmin = new formTransaksiadmin();
        Formtransaksiadmin.setVisible(true);
    }//GEN-LAST:event_bTambahActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
         // Mendapatkan baris yang dipilih di jTable2
    int selectedRow = jTable2.getSelectedRow();
    
    // Memeriksa apakah ada baris yang dipilih
    if (selectedRow != -1) {
        // Mendapatkan data dari tabel yang dipilih di jTable2
        String nisn = jTable2.getModel().getValueAt(selectedRow, 1).toString();
        String namaWali = jTable2.getModel().getValueAt(selectedRow, 2).toString();
        String hubungan = jTable2.getModel().getValueAt(selectedRow, 3).toString();
        String pekerjaan = jTable2.getModel().getValueAt(selectedRow, 4).toString();
        String alamatWali = jTable2.getModel().getValueAt(selectedRow, 5).toString();
        String noTelpWali = jTable2.getModel().getValueAt(selectedRow, 6).toString();

        // Membuat objek formWaliUbah dan mengatur data
        formWaliUbah waliUbah = new formWaliUbah();
        waliUbah.setData(nisn, namaWali, hubungan, pekerjaan, alamatWali, noTelpWali);

        // Menampilkan formWaliUbah
        waliUbah.setVisible(true);
    }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void jMenuItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3MouseClicked

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        refreshJTable2();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
          // Mendapatkan baris yang dipilih di jTable2
    int selectedRow = jTable2.getSelectedRow();

    // Memeriksa apakah ada baris yang dipilih
    if (selectedRow != -1) {
        // Mendapatkan id_wali dari tabel yang dipilih di jTable2
        String idWaliDihapus = jTable2.getModel().getValueAt(selectedRow, 0).toString();

        // Konfirmasi penghapusan data
        int confirmResult = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        
        if (confirmResult == JOptionPane.YES_OPTION) {
            // Memanggil metode untuk menghapus data berdasarkan id_wali
            hapusDataWali(idWaliDihapus);

            // Menampilkan ulang data di jTable2 setelah berhasil menghapus data
            refreshJTable2();
        }
    } else {
        JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus.", "Peringatan", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed
          // Mendapatkan baris yang dipilih di jTable3
    int selectedRow = jTable3.getSelectedRow();

    // Memeriksa apakah ada baris yang dipilih
    if (selectedRow != -1) {
        // Mendapatkan data dari tabel yang dipilih di jTable3
        String notransaksi = jTable3.getModel().getValueAt(selectedRow, 0).toString();
        String nisn = jTable3.getModel().getValueAt(selectedRow, 1).toString();
        String namaSiswa = jTable3.getModel().getValueAt(selectedRow, 2).toString();
        String pembayaran = jTable3.getModel().getValueAt(selectedRow, 3).toString();
        String biaya = jTable3.getModel().getValueAt(selectedRow, 4).toString();

        // Membuat objek FormTransaksiUbah dan mengatur data
        formTransaksiUbah formTransaksiUbah = new formTransaksiUbah();
        formTransaksiUbah.setData(notransaksi, nisn, namaSiswa, pembayaran, biaya);

        // Menampilkan formTransaksiUbah
        formTransaksiUbah.setVisible(true);


    } else {
        JOptionPane.showMessageDialog(this, "Pilih baris yang ingin diubah.", "Peringatan", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_bUbahActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        // Mendapatkan baris yang dipilih di jTable3
    int selectedRow = jTable3.getSelectedRow();

    // Memeriksa apakah ada baris yang dipilih
    if (selectedRow != -1) {
        // Mendapatkan id_transaksi dari tabel yang dipilih di jTable3
        String idTransaksi = jTable3.getModel().getValueAt(selectedRow, 0).toString();

        // Melakukan konfirmasi penghapusan
        int confirmResult = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
        
        // Jika pengguna mengonfirmasi penghapusan (klik Yes)
        if (confirmResult == JOptionPane.YES_OPTION) {
            // Panggil metode untuk menghapus data transaksi
            hapusDataTransaksi(idTransaksi);

            // Refresh jTable3 setelah penghapusan
            refreshJTable3();
        }
    } else {
        JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus.", "Peringatan", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_bHapusActionPerformed

    private void btUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUbahActionPerformed
       // Mendapatkan baris yang dipilih di jTable1
    int selectedRow = jTable1.getSelectedRow();

    // Memeriksa apakah ada baris yang dipilih
    if (selectedRow != -1) {
        // Mendapatkan data dari tabel yang dipilih di jTable1
        String nisn = jTable1.getModel().getValueAt(selectedRow, 0).toString();
        String namaSiswa = jTable1.getModel().getValueAt(selectedRow, 1).toString();
        // Mendapatkan tanggal lahir (misalnya di simpan sebagai String)

        String jenisKelamin = jTable1.getModel().getValueAt(selectedRow, 3).toString();
        String alamat = jTable1.getModel().getValueAt(selectedRow, 4).toString();
        String noHp = jTable1.getModel().getValueAt(selectedRow, 5).toString();
        String asalSekolah = jTable1.getModel().getValueAt(selectedRow, 6).toString();
        String jurusanPilihan = jTable1.getModel().getValueAt(selectedRow, 7).toString();

        // Membuat objek formUbah dan mengatur data
        formUbah FormUbah = new formUbah();
        FormUbah.setData(nisn, namaSiswa, jenisKelamin, alamat, noHp, asalSekolah, jurusanPilihan);

        // Menampilkan formUbah
        FormUbah.setVisible(true);
    } else {
        JOptionPane.showMessageDialog(this, "Pilih baris yang ingin diubah.", "Peringatan", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btUbahActionPerformed

    private void bRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRefreshActionPerformed
       refreshJTable3();
    }//GEN-LAST:event_bRefreshActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
       // Mendapatkan baris yang dipilih di jTable1
int selectedRow = jTable1.getSelectedRow();

// Memeriksa apakah ada baris yang dipilih
if (selectedRow != -1) {
    // Mendapatkan id_siswa dari tabel yang dipilih di jTable1
    String idSiswa = jTable1.getModel().getValueAt(selectedRow, 0).toString();

    // Melakukan konfirmasi penghapusan
    int confirmResult = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);

    // Jika pengguna mengonfirmasi penghapusan (klik Yes)
    if (confirmResult == JOptionPane.YES_OPTION) {
        // Panggil metode untuk menghapus data siswa
        hapusDataSiswa(idSiswa);

        // Refresh jTable1 setelah penghapusan
        refreshJTable1();
    }
} else {
    JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus.", "Peringatan", JOptionPane.WARNING_MESSAGE);
}
    }//GEN-LAST:event_btHapusActionPerformed

    private void btRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefreshActionPerformed
        refreshJTable1();
    }//GEN-LAST:event_btRefreshActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        try {
            // Menggunakan koneksi yang Anda buat
            Connection connection = koneksi.koneksiDB();

            // Path ke file JasperReport
            String reportPath = "src/ppdb/reportWali.jasper";

            // Parameter untuk laporan
            HashMap<String, Object> parameters = new HashMap<>();

            // Mengisi laporan dengan data dari database
            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, connection);

            // Menampilkan JasperViewer untuk melihat laporan
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error generating or previewing report: " + e.getMessage(), "Report Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCetakActionPerformed

    private void bCetak1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCetak1ActionPerformed
        try {
            // Menggunakan koneksi yang Anda buat
            Connection connection = koneksi.koneksiDB();

            // Path ke file JasperReport
            String reportPath = "src/ppdb/reportTransaksi.jasper";

            // Parameter untuk laporan
            HashMap<String, Object> parameters = new HashMap<>();

            // Mengisi laporan dengan data dari database
            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, connection);

            // Menampilkan JasperViewer untuk melihat laporan
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error generating or previewing report: " + e.getMessage(), "Report Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bCetak1ActionPerformed

    private void btCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCetakActionPerformed
       try {
            // Menggunakan koneksi yang Anda buat
            Connection connection = koneksi.koneksiDB();

            // Path ke file JasperReport
            String reportPath = "src/ppdb/reportPendaftaraan.jasper";

            // Parameter untuk laporan
            HashMap<String, Object> parameters = new HashMap<>();

            // Mengisi laporan dengan data dari database
            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, connection);

            // Menampilkan JasperViewer untuk melihat laporan
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error generating or previewing report: " + e.getMessage(), "Report Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btCetakActionPerformed
   //Hapus siswa 
    private void hapusDataSiswa(String idSiswa) {
    Connection connection = null;

    try {
        // Membuka koneksi ke database
        connection = koneksi.koneksiDB();

        // Query untuk menghapus data berdasarkan id_siswa
        String query = "DELETE FROM siswa WHERE id_siswa=?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, idSiswa);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Data Siswa berhasil dihapus");
            } else {
                JOptionPane.showMessageDialog(null, "Gagal menghapus data siswa.");
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menghapus data: " + ex.getMessage());
    }
}

    
    //hapus wali
    private void hapusDataWali(String idWali) {
    Connection connection = null;

    try {
        // Membuka koneksi ke database
        connection = koneksi.koneksiDB();

        // Query untuk menghapus data berdasarkan id_wali
        String query = "DELETE FROM wali WHERE id_wali=?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, idWali);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Data Wali Siswa berhasil dihapus");
            } else {
                JOptionPane.showMessageDialog(null, "Gagal menghapus data wali siswa.");
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menghapus data: " + ex.getMessage());
    }
}
    
    //hapus transaksi
    // Metode untuk menghapus data transaksi berdasarkan id_transaksi
private void hapusDataTransaksi(String idTransaksi) {
    Connection connection = null;

    try {
        // Membuka koneksi ke database
        connection = koneksi.koneksiDB();

        // Query untuk menghapus data transaksi
        String query = "DELETE FROM transaksi WHERE id_transaksi = ?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, idTransaksi);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data transaksi berhasil dihapus.");
            } else {
                JOptionPane.showMessageDialog(this, "Gagal menghapus data transaksi.");
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
}
    
    
    private void refreshJTable1() {
    // Mendapatkan model dari JTable2
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    
    // Mengosongkan semua baris dalam model
    model.setRowCount(0);
    
    // TODO: Tambahkan data baru ke model (sesuai dengan kebutuhan Anda)
    tampilDataSiswa();
    // Memberitahu JTable2 bahwa data telah berubah
    model.fireTableDataChanged();
}
    
    private void refreshJTable2() {
    // Mendapatkan model dari JTable2
    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
    
    // Mengosongkan semua baris dalam model
    model.setRowCount(0);
    
    // TODO: Tambahkan data baru ke model (sesuai dengan kebutuhan Anda)
    tampilDataWali();
    // Memberitahu JTable2 bahwa data telah berubah
    model.fireTableDataChanged();
}
    
    private void refreshJTable3() {
    // Mendapatkan model dari JTable3
    DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
    
    // Mengosongkan semua baris dalam model
    model.setRowCount(0);
    
    // TODO: Tambahkan data baru ke model (sesuai dengan kebutuhan Anda)
    tampilDataTransaksi();
    // Memberitahu JTable2 bahwa data telah berubah
    model.fireTableDataChanged();
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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCetak1;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bKembali;
    private javax.swing.JButton bRefresh;
    private javax.swing.JButton bTambah;
    private javax.swing.JButton bUbah;
    private javax.swing.JButton btCetak;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btKembali;
    private javax.swing.JButton btRefresh;
    private javax.swing.JButton btTambah;
    private javax.swing.JButton btUbah;
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
