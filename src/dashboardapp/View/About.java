/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboardapp.View;

import dashboardapp.View.DataPengembalian;
import dashboardapp.View.DataPeminjaman;
import dashboardapp.View.DataBarang;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author KeepToo
 */
public class About extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public About() {
        initComponents();
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
        Button1 = new javax.swing.JPanel();
        Indicator1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Button2 = new javax.swing.JPanel();
        Indicator2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Button3 = new javax.swing.JPanel();
        Indicator3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Button4 = new javax.swing.JPanel();
        Indicator4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Button5 = new javax.swing.JPanel();
        Indicator5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btn_close = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setLocation(new java.awt.Point(550, 200));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button1.setBackground(new java.awt.Color(255, 255, 255));
        Button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button1MouseExited(evt);
            }
        });

        Indicator1.setBackground(new java.awt.Color(204, 0, 204));
        Indicator1.setOpaque(false);

        javax.swing.GroupLayout Indicator1Layout = new javax.swing.GroupLayout(Indicator1);
        Indicator1.setLayout(Indicator1Layout);
        Indicator1Layout.setHorizontalGroup(
            Indicator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator1Layout.setVerticalGroup(
            Indicator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(96, 83, 150));
        jLabel1.setText("Home");

        javax.swing.GroupLayout Button1Layout = new javax.swing.GroupLayout(Button1);
        Button1.setLayout(Button1Layout);
        Button1Layout.setHorizontalGroup(
            Button1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button1Layout.createSequentialGroup()
                .addComponent(Indicator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Button1Layout.setVerticalGroup(
            Button1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 175, 232, -1));

        Button2.setBackground(new java.awt.Color(255, 255, 255));
        Button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button2MouseExited(evt);
            }
        });

        Indicator2.setBackground(new java.awt.Color(204, 0, 204));
        Indicator2.setOpaque(false);

        javax.swing.GroupLayout Indicator2Layout = new javax.swing.GroupLayout(Indicator2);
        Indicator2.setLayout(Indicator2Layout);
        Indicator2Layout.setHorizontalGroup(
            Indicator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator2Layout.setVerticalGroup(
            Indicator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(96, 83, 150));
        jLabel2.setText("Data Barang");

        javax.swing.GroupLayout Button2Layout = new javax.swing.GroupLayout(Button2);
        Button2.setLayout(Button2Layout);
        Button2Layout.setHorizontalGroup(
            Button2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button2Layout.createSequentialGroup()
                .addComponent(Indicator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Button2Layout.setVerticalGroup(
            Button2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(Button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 227, 232, -1));

        Button3.setBackground(new java.awt.Color(255, 255, 255));
        Button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button3MouseExited(evt);
            }
        });

        Indicator3.setBackground(new java.awt.Color(204, 0, 204));
        Indicator3.setOpaque(false);

        javax.swing.GroupLayout Indicator3Layout = new javax.swing.GroupLayout(Indicator3);
        Indicator3.setLayout(Indicator3Layout);
        Indicator3Layout.setHorizontalGroup(
            Indicator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator3Layout.setVerticalGroup(
            Indicator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(96, 83, 150));
        jLabel3.setText("Data Peminjaman");

        javax.swing.GroupLayout Button3Layout = new javax.swing.GroupLayout(Button3);
        Button3.setLayout(Button3Layout);
        Button3Layout.setHorizontalGroup(
            Button3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button3Layout.createSequentialGroup()
                .addComponent(Indicator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Button3Layout.setVerticalGroup(
            Button3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(Button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 279, 232, -1));

        Button4.setBackground(new java.awt.Color(255, 255, 255));
        Button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button4MouseExited(evt);
            }
        });

        Indicator4.setBackground(new java.awt.Color(204, 0, 204));
        Indicator4.setOpaque(false);

        javax.swing.GroupLayout Indicator4Layout = new javax.swing.GroupLayout(Indicator4);
        Indicator4.setLayout(Indicator4Layout);
        Indicator4Layout.setHorizontalGroup(
            Indicator4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator4Layout.setVerticalGroup(
            Indicator4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(96, 83, 150));
        jLabel4.setText("Data pengembalian");

        javax.swing.GroupLayout Button4Layout = new javax.swing.GroupLayout(Button4);
        Button4.setLayout(Button4Layout);
        Button4Layout.setHorizontalGroup(
            Button4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button4Layout.createSequentialGroup()
                .addComponent(Indicator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Button4Layout.setVerticalGroup(
            Button4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(Button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 331, 232, -1));
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 39, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboardapp/images/rsz_1login_1.png"))); // NOI18N
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 57, -1, -1));

        jPanel14.setBackground(new java.awt.Color(0, 215, 255));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, -1));

        jPanel13.setBackground(new java.awt.Color(31, 70, 144));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 100, 40));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(96, 83, 150));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboardapp/images/rsz_1logout.png"))); // NOI18N
        jLabel23.setText("Logout");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(31, 70, 144));
        jLabel25.setText("ADMIN");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, 40));

        Button5.setBackground(new java.awt.Color(255, 255, 255));
        Button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button5MouseExited(evt);
            }
        });

        Indicator5.setBackground(new java.awt.Color(204, 0, 204));
        Indicator5.setOpaque(false);

        javax.swing.GroupLayout Indicator5Layout = new javax.swing.GroupLayout(Indicator5);
        Indicator5.setLayout(Indicator5Layout);
        Indicator5Layout.setHorizontalGroup(
            Indicator5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator5Layout.setVerticalGroup(
            Indicator5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(181, 77, 180));
        jLabel5.setText("About Us");

        javax.swing.GroupLayout Button5Layout = new javax.swing.GroupLayout(Button5);
        Button5.setLayout(Button5Layout);
        Button5Layout.setHorizontalGroup(
            Button5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button5Layout.createSequentialGroup()
                .addComponent(Indicator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel5)
                .addGap(0, 122, Short.MAX_VALUE))
        );
        Button5Layout.setVerticalGroup(
            Button5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(Button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 232, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

        jPanel2.setBackground(new java.awt.Color(31, 70, 144));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(96, 83, 150));

        btn_close.setBackground(new java.awt.Color(96, 83, 150));
        btn_close.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_close.setText("X");
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 160, Short.MAX_VALUE)
                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 180, -1));

        jLabel22.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("OUR TEAM");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, 40));

        jLabel26.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("ABOUT US");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 780, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_closeMouseClicked

    private void Button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button1MouseClicked
        // TODO add your handling code here:
        onClick(Button1);
        onLeaveClick(Button2);
        onLeaveClick(Button3);
        onLeaveClick(Button4);
        
        //indicators
        Indicator1.setOpaque(true);
        Indicator2.setOpaque(false);
        Indicator3.setOpaque(false);
        Indicator4.setOpaque(false);
        
    }//GEN-LAST:event_Button1MouseClicked

    private void Button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button2MouseClicked
        // TODO add your handling code here:
        new DataBarang().setVisible(true);
        dispose();
        
        onClick(Button2);
         onLeaveClick(Button1);
        onLeaveClick(Button3);
        onLeaveClick(Button4);
        
         //indicators
        Indicator1.setOpaque(false);
        Indicator2.setOpaque(true);
        Indicator3.setOpaque(false);
        Indicator4.setOpaque(false);
        
        
    }//GEN-LAST:event_Button2MouseClicked

    private void Button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button3MouseClicked
        // TODO add your handling code here:
        new DataPeminjaman().setVisible(true);
        dispose();
        
        onClick(Button3);
         onLeaveClick(Button2);
        onLeaveClick(Button1);
        onLeaveClick(Button4);
        
         //indicators
        Indicator1.setOpaque(false);
        Indicator2.setOpaque(false);
        Indicator3.setOpaque(true);
        Indicator4.setOpaque(false);
    }//GEN-LAST:event_Button3MouseClicked

    private void Button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button4MouseClicked
        // TODO add your handling code here:
        new DataPengembalian().setVisible(true);
        dispose();
        
        onClick(Button4);
         onLeaveClick(Button2);
        onLeaveClick(Button3);
        onLeaveClick(Button1);
         //indicators
        Indicator1.setOpaque(false);
        Indicator2.setOpaque(false);
        Indicator3.setOpaque(false);
        Indicator4.setOpaque(true);
    }//GEN-LAST:event_Button4MouseClicked

    private void Button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button1MouseEntered
        // TODO add your handling code here:
 
    }//GEN-LAST:event_Button1MouseEntered

    private void Button2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button2MouseEntered
        // TODO add your handling code here:
         
    }//GEN-LAST:event_Button2MouseEntered

    private void Button3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button3MouseEntered
        // TODO add your handling code here:
     
    }//GEN-LAST:event_Button3MouseEntered

    private void Button4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button4MouseEntered
        // TODO add your handling code here:]
         
    }//GEN-LAST:event_Button4MouseEntered

    private void Button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button1MouseExited

    private void Button2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button2MouseExited

    private void Button3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button3MouseExited

    private void Button4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button4MouseExited

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
          xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
         int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void Button5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button5MouseClicked

    private void Button5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button5MouseEntered

    private void Button5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button5MouseExited

    int xx ,xy;
    
       
    //bad idea
    
    
    private void onClick(JPanel panel)
    {
        panel.setBackground(new Color(205, 136, 205));
    }
    
     private void onLeaveClick(JPanel panel)
    {
        panel.setBackground(Color.white);
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Button1;
    private javax.swing.JPanel Button2;
    private javax.swing.JPanel Button3;
    private javax.swing.JPanel Button4;
    private javax.swing.JPanel Button5;
    private javax.swing.JPanel Indicator1;
    private javax.swing.JPanel Indicator2;
    private javax.swing.JPanel Indicator3;
    private javax.swing.JPanel Indicator4;
    private javax.swing.JPanel Indicator5;
    private javax.swing.JLabel btn_close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
