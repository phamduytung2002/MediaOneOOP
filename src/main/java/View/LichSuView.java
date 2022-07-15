/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DoanhThu.QuanLySuKien;
import DoanhThu.SuKienMotLan;
import IO.IO;
import NhanVien.NhanVien;
import java.awt.BorderLayout;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author XPS
 */
public class LichSuView extends javax.swing.JFrame {

    private QuanLySuKien qlsk;
    private ArrayList<SuKienMotLan> dsSuKien;
    private DefaultTableModel model;
    private IO io = new IO();

    public LichSuView() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.qlsk = new QuanLySuKien();

        this.dsSuKien = new ArrayList<>();
        model = (DefaultTableModel) jTable3.getModel();
        this.dsSuKien = io.docSKMotLan();

        showResultCPNV(this.dsSuKien);
    }

    private void showResultCPNV(ArrayList<SuKienMotLan> dssk) {
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        for (int i = 0; i < dssk.size(); i++) {
            SuKienMotLan sk = dssk.get(i);
            model.addRow(new Object[]{
                sk.getDate().format(DateTimeFormatter.ISO_DATE), sk.getLoaiSuKien(), sk.getGiatri()
            });
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        thongKeButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ngayBatDau = new javax.swing.JTextField();
        ngayKetThuc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        thangBatDau = new javax.swing.JTextField();
        thangKetThuc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        namBatDau = new javax.swing.JTextField();
        namKetThuc = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SanPham", "Ngay", "HanhDong", "SoLuong"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Danh sách các sự kiện");

        thongKeButton.setText("Thống kê");
        thongKeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thongKeButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Từ ngày");

        jButton2.setText("Trở về");

        jLabel3.setText("Đến ngày");

        ngayBatDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngayBatDauActionPerformed(evt);
            }
        });

        ngayKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngayKetThucActionPerformed(evt);
            }
        });

        jLabel4.setText("tháng");

        jLabel5.setText("tháng");

        thangBatDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thangBatDauActionPerformed(evt);
            }
        });

        jLabel6.setText("năm");

        jLabel7.setText("năm");

        namBatDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namBatDauActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ngày", "Loại", "Giá trị"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ngayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(thangBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jButton2)
                            .addComponent(thongKeButton))
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ngayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thangKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(350, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1)
                        .addGap(79, 79, 79)
                        .addComponent(thongKeButton))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ngayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(thangBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(namBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ngayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(thangKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(namKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void thongKeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thongKeButtonActionPerformed
        // TODO add your handling code here:
        int startDay = Integer.parseInt(ngayBatDau.getText());
        int startMonth = Integer.parseInt(thangBatDau.getText());
        int startYear = Integer.parseInt(namBatDau.getText());
        int endDay = Integer.parseInt(ngayKetThuc.getText());
        int endMonth = Integer.parseInt(thangKetThuc.getText());
        int endYear = Integer.parseInt(namKetThuc.getText());
        
        LocalDateTime start = LocalDateTime.of(startYear, startMonth, startDay, 0, 0, 0);
        LocalDateTime end = LocalDateTime.of(endYear, endMonth, endDay, 23, 59, 59);
        
//        System.out.println(start);
//        System.out.println(end);
        
        ArrayList<SuKienMotLan> dssk = this.qlsk.getThongKeSuKien(start, end);
//        System.out.println(dssk.size());
        showResultCPNV(dssk);
    }//GEN-LAST:event_thongKeButtonActionPerformed

    private void ngayBatDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngayBatDauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ngayBatDauActionPerformed

    private void ngayKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngayKetThucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ngayKetThucActionPerformed

    private void thangBatDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thangBatDauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thangBatDauActionPerformed

    private void namBatDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namBatDauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namBatDauActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField namBatDau;
    private javax.swing.JTextField namKetThuc;
    private javax.swing.JTextField ngayBatDau;
    private javax.swing.JTextField ngayKetThuc;
    private javax.swing.JTextField thangBatDau;
    private javax.swing.JTextField thangKetThuc;
    private javax.swing.JButton thongKeButton;
    // End of variables declaration//GEN-END:variables
}
