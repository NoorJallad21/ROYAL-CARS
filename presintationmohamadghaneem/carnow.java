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
public class carnow extends javax.swing.JPanel {

    public static Connection con;

    /**
     * Creates new form carnow
     */
    public carnow() {
        initComponents();
        jTable1.setShowVerticalLines(true);
        jTable1.setShowHorizontalLines(true);
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(32, 136, 203));
        jTable1.setRowHeight(30);
        jTable1.setSelectionBackground(new Color(232, 57, 95));

    }

    void bild() {
        DefaultTableModel nt = (DefaultTableModel) jTable1.getModel();
        for (; nt.getRowCount() > 0;) {
            nt.removeRow(0);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/com_car?zeroDateTimeBehavior=convertToNull", "root", "");
            String sql = "SELECT * FROM car WHERE status= ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "Effective");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                nt.addRow(new Object[]{rs.getString("name"), rs.getString("company"), rs.getString("type"), rs.getString("lic_plate"), rs.getString("ensurance"), rs.getString("status"), rs.getString("color"), rs.getString("price"), rs.getString("year_manu"), rs.getString("description"), rs.getString("fax_num")});

            }
        } catch (Exception e) {

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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Valid cars for rent");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 460, 72));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 780, 590));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 72, 440, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presintationmohamadghaneem/ازرق_1.gif"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 790, 720));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
