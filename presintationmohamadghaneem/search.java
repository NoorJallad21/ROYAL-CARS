/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presintationmohamadghaneem;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class search extends javax.swing.JPanel {
public static Connection con;

    /**
     * Creates new form search
     */
    public search() {
        initComponents();
        jTable1.setShowVerticalLines(true);
        jTable1.setShowHorizontalLines(true);
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable1.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,14));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(32,136,203));
        jTable1.setRowHeight(30);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        type = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        l = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        type.setBackground(new java.awt.Color(255, 255, 255));
        type.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        type.setForeground(new java.awt.Color(102, 0, 0));
        add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 440, 50));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presintationmohamadghaneem/search_1.jpg"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 110, 50));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presintationmohamadghaneem/clear_1.png"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 120, 50));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(102, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Company", "Type", "Licence Plate", "Ensurance", "Status", "Color", "Price", "Model", "Description", "fax number"
            }
        ));
        jTable1.setEnabled(false);
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(102, 0, 0));
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setRowHeight(30);
        jTable1.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 780, 510));

        l.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l.setForeground(new java.awt.Color(204, 0, 0));
        add(l, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 330, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Enter the company of car:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 250, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("Search of company car");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 580, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presintationmohamadghaneem/ازرق_1.gif"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          try{
             DefaultTableModel nt = (DefaultTableModel) jTable1.getModel();
           for(;nt.getRowCount()>0;){
           nt.removeRow(0);
           
        }
            if(!exist(type.getText())){  
        l.setText("");
        Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/com_car?zeroDateTimeBehavior=convertToNull", "root", "");
    String sql = "SELECT * FROM car WHERE company=?";        
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1,type.getText());
    ResultSet rs = ps.executeQuery();
       int c=0;
    while (rs.next())
    {c++;
           nt.addRow(new Object[]{rs.getString("name"),rs.getString("company"),rs.getString("type"),rs.getString("lic_plate"),rs.getString("ensurance"),rs.getString("status"),rs.getString("color"),rs.getString("price"),rs.getString("year_manu"),rs.getString("description"),rs.getString("fax_num")});
    } 
    }else
        l.setText("This company does not exist");
    }catch(Exception e){
        
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     type.setText("");
     l.setText("");
     DefaultTableModel nt = (DefaultTableModel) jTable1.getModel();
        for(;nt.getRowCount()>0;){
           nt.removeRow(0);
           
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
public boolean exist(String s){
    try{ 
        Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/com_car?zeroDateTimeBehavior=convertToNull", "root", "");
    String sql = "SELECT * FROM car WHERE company=?";        
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1,s);

    ResultSet rs = ps.executeQuery();
       int c=0;
    while (rs.next())
    {c++;
    } 
    if(c==0)
        return true;
    return false;
    }catch(Exception e){
        
    }
    return false;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel l;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
}
