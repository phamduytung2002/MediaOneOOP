/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.mavenproject1.Views;

import com.mycompany.mavenproject1.IOFile.IOSanPham;
import com.mycompany.mavenproject1.Object.SanPham;
import com.mycompany.mavenproject1.Object.SuKien;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class ChiPhiSanPham extends javax.swing.JPanel {

    IOSanPham io = new IOSanPham();
    private ArrayList<SanPham> list;
    private ArrayList<SuKien> list_SuKien;
    DefaultTableModel model;
    
    public ChiPhiSanPham() {
        initComponents();
        list = io.docSP();
        list_SuKien = io.docSK(list);
        model = (DefaultTableModel)jTable1.getModel();
//        System.out.print(list_SuKien.size());    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGrHD = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        SoLuong = new javax.swing.JButton();
        Mua = new javax.swing.JRadioButton();
        Ban = new javax.swing.JRadioButton();
        TFsoluong = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jButton1.setText("Full");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ngay");

        jButton3.setText("Hanh Dong");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        SoLuong.setText("SoLuong");
        SoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoLuongActionPerformed(evt);
            }
        });

        BtnGrHD.add(Mua);
        Mua.setText("Mua");

        BtnGrHD.add(Ban);
        Ban.setText("Ban");
        Ban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BanActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SanPham", "Ngay", "HanhDong", "SoLuong"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(Ban, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField1)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Mua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TFsoluong))
                .addContainerGap(136, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(SoLuong))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mua, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ban)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoLuongActionPerformed
        // TODO add your handling code here:
        model.setRowCount(0);
        for (int i =0; i< list_SuKien.size();i++ ){
            SuKien sk = list_SuKien.get(i);
            if(sk.getSoluong_hd()==Integer.parseInt(TFsoluong.getText())){
                model.addRow(new Object[]{
                    sk.getSp().getTensanpham(),sk.getNgay(),sk.getHanhdong(),sk.getSoluong_hd()
                });
            }                
        }   
    }//GEN-LAST:event_SoLuongActionPerformed

    private void BanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        model.setRowCount(0);
        for (int i =0; i< list_SuKien.size();i++ ){
            SuKien sk = list_SuKien.get(i);
            model.addRow(new Object[]{
                sk.getSp().getTensanpham(),sk.getNgay(),sk.getHanhdong(),sk.getSoluong_hd()
            });
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(Ban.isSelected()){
            model.setRowCount(0);
            for (int i =0; i< list_SuKien.size();i++ ){
                SuKien sk = list_SuKien.get(i);
                if(sk.getHanhdong().equals("ban")){
                    model.addRow(new Object[]{
                        sk.getSp().getTensanpham(),sk.getNgay(),sk.getHanhdong(),sk.getSoluong_hd()
                    });
                }                
            }
        }
        else if( Mua.isSelected()){
            model.setRowCount(0);
            for (int i =0; i< list_SuKien.size();i++ ){
                SuKien sk = list_SuKien.get(i);
                if(sk.getHanhdong().equals("mua")){
                    model.addRow(new Object[]{
                        sk.getSp().getTensanpham(),sk.getNgay(),sk.getHanhdong(),sk.getSoluong_hd()
                    });
                }                
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Ban;
    private javax.swing.ButtonGroup BtnGrHD;
    private javax.swing.JRadioButton Mua;
    private javax.swing.JButton SoLuong;
    private javax.swing.JTextField TFsoluong;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
