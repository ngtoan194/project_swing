/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan;

import Model.NhaCC;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nguyen Toan
 */
public class QLNhaCC extends javax.swing.JDialog {

    /**
     * Creates new form QLnhacc
     */
    private Connection cnt = new connectDB.connectDB().getConnection();
    DefaultTableModel tblModel;
    Vector<String> tieude;
    Vector<String> row;
    Vector<Object> data;

    public QLNhaCC(JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tieude = new Vector<>();
        tieude.add("Mã nhà cung cấp");
        tieude.add("Địa chỉ");
        tieude.add("Số điện thoại");
        row = new Vector<>();
        data = new Vector<>();
        tblModel = new DefaultTableModel(data, tieude) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        tblNhacc.setModel(tblModel);
        loaddata();
        hidejbtLH(false);
        hidejbtSX(false);
        setLocationRelativeTo(null);
        setResizable(false);
        getInfo01();
    }

    private void hidejbtLH(boolean status) {
        jbtLuu.setEnabled(status);
        jbtHuy.setEnabled(status);
    }

    private void hidejbtSX(boolean status) {
        jbtSua.setEnabled(status);
        jbtXoa.setEnabled(status);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaNhacc = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        jbtThem = new javax.swing.JButton();
        jbtSua = new javax.swing.JButton();
        jbtXoa = new javax.swing.JButton();
        jbtLuu = new javax.swing.JButton();
        jbtThoat = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNhacc = new javax.swing.JTable();
        jbtHuy = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Quản lý nhà cung cấp");

        jLabel2.setText("Mã nhà cc");

        jLabel4.setText("Địa chỉ");

        jLabel5.setText("Số điện thoại");

        txtMaNhacc.setEditable(false);

        jbtThem.setText("Thêm");
        jbtThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThemActionPerformed(evt);
            }
        });

        jbtSua.setText("Sửa");
        jbtSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSuaActionPerformed(evt);
            }
        });

        jbtXoa.setText("Xóa");
        jbtXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXoaActionPerformed(evt);
            }
        });

        jbtLuu.setText("Lưu");
        jbtLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLuuActionPerformed(evt);
            }
        });

        jbtThoat.setText("Thoát");
        jbtThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThoatActionPerformed(evt);
            }
        });

        tblNhacc.setAutoCreateRowSorter(true);
        tblNhacc.setModel(new javax.swing.table.DefaultTableModel(
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
        tblNhacc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhaccMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblNhacc);

        jbtHuy.setText("Hủy");
        jbtHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtHuyActionPerformed(evt);
            }
        });

        jLabel3.setText("Tìm kiếm");

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaNhacc, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtThem, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtSua, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaNhacc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtThem)
                            .addComponent(jbtLuu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtXoa)
                            .addComponent(jbtSua))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtHuy)
                            .addComponent(jbtThoat))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void loaddata() {
        try {
            String sql = "Select * from nhacc where status = 1";
            Statement stm = cnt.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                Vector<String> v = new Vector<>();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                data.add(v);
                tblNhacc.updateUI();
            }
        } catch (SQLException ex) {
            Logger.getLogger(QLNhaCC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void getInfo01() {
        txtMaNhacc.setText(tblNhacc.getValueAt(0, 0).toString());
        txtDiaChi.setText(tblNhacc.getValueAt(0, 1).toString());
        txtSDT.setText(tblNhacc.getValueAt(0, 2).toString());
    }

    private void jbtThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThoatActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbtThoatActionPerformed

    private void tblNhaccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhaccMouseClicked
        // TODO add your handling code here:
        txtMaNhacc.setText(tblNhacc.getValueAt(tblNhacc.getSelectedRow(), 0).toString());
        txtDiaChi.setText(tblNhacc.getValueAt(tblNhacc.getSelectedRow(), 1).toString());
        txtSDT.setText(tblNhacc.getValueAt(tblNhacc.getSelectedRow(), 2).toString());
        hidejbtSX(true);
    }//GEN-LAST:event_tblNhaccMouseClicked

    private void jbtThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThemActionPerformed
        // TODO add your handling code here:
        hidejbtLH(true);
        hidejbtSX(false);
        txtMaNhacc.setEditable(true);
        txtMaNhacc.setText("");
        txtDiaChi.setText("");
        txtSDT.setText("");
    }//GEN-LAST:event_jbtThemActionPerformed

    private void jbtLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLuuActionPerformed
        // TODO add your handling code here:
        Boolean Status = new NhaCC().themNhaCC(txtMaNhacc.getText(), txtDiaChi.getText(), txtSDT.getText());
        if (Status == true) {
            Vector<String> v = new Vector<>();
            v.add(txtMaNhacc.getText());
            v.add(txtDiaChi.getText());
            v.add(txtSDT.getText());
            data.add(v);
            tblNhacc.updateUI();
            txtMaNhacc.setEditable(false);
            hidejbtLH(false);
            hidejbtSX(true);
        } else if (Status == false) {

        }
    }//GEN-LAST:event_jbtLuuActionPerformed

    private void jbtXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXoaActionPerformed
        // TODO add your handling code here:
        int rowselected = tblNhacc.getSelectedRow();
        String id = tblNhacc.getValueAt(rowselected, 0).toString();
        if (JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa nhà cung cấp không?",
                "Lựa chọn", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            boolean Status = new NhaCC().xoaNhacc(id);
            JOptionPane.showMessageDialog(this, "Xóa nhà cung cấp " + txtMaNhacc.getText() + " thành công");
            Vector<String> v = new Vector<>();
            v.add(txtMaNhacc.getText());
            v.add(txtDiaChi.getText());
            v.add(txtSDT.getText());
            data.remove(v);
            tblNhacc.updateUI();
        } else {
            JOptionPane.showMessageDialog(this, "Không xóa được nhà cung cấp");
        }
    }//GEN-LAST:event_jbtXoaActionPerformed

    private void jbtSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSuaActionPerformed
        // TODO add your handling code here:
        int row = tblNhacc.getSelectedRow();
        String id = tblNhacc.getValueAt(row, 0).toString();
        boolean Status = new NhaCC().suaLoaiHang(id, txtDiaChi.getText(), txtSDT.getText());
        if (Status == true) {
            Vector<String> v = new Vector<>();
            v.add(txtMaNhacc.getText());
            v.add(txtDiaChi.getText());
            v.add(txtSDT.getText());
            data.remove(row);
            data.add(v);
            tblNhacc.updateUI();
        }
    }//GEN-LAST:event_jbtSuaActionPerformed

    private void jbtHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtHuyActionPerformed
        // TODO add your handling code here:
        getInfo01();
        hidejbtLH(false);
    }//GEN-LAST:event_jbtHuyActionPerformed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        // TODO add your handling code here:
        if (!txtTimKiem.getText().isEmpty()) {
            data.removeAllElements();
            try {
                String sql = "select * from NhaCC where "
                        + "maNhaCC like '%" + txtTimKiem.getText() + "%' and status = 1 "
                        + "or DiaChi like '%" + txtTimKiem.getText() + "%' and status = 1 "
                        + "or SDT like '%" + txtTimKiem.getText() + "%' and status = 1";
                Statement stm = cnt.createStatement();
                ResultSet rs = stm.executeQuery(sql);
                while (rs.next()) {
                    Vector<String> v = new Vector<>();
                    v.add(rs.getString(1));
                    v.add(rs.getString(2));
                    v.add(rs.getString(3));
                    data.add(v);
                    tblNhacc.updateUI();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Lỗi...");
                System.out.println(ex);
            }
        } else if (txtTimKiem.getText().isEmpty()) {
            data.removeAllElements();
            loaddata();
        }
    }//GEN-LAST:event_txtTimKiemKeyReleased

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(QLNhaCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(QLNhaCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(QLNhaCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(QLNhaCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new QLNhaCC().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtHuy;
    private javax.swing.JButton jbtLuu;
    private javax.swing.JButton jbtSua;
    private javax.swing.JButton jbtThem;
    private javax.swing.JButton jbtThoat;
    private javax.swing.JButton jbtXoa;
    private javax.swing.JTable tblNhacc;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaNhacc;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}