/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presintationmohamadghaneem;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.JOptionPane;
import static org.omg.IOP.CodecPackage.InvalidTypeForEncodingHelper.id;

/**
 *
 * @author Asus
 */
public class enterCar extends javax.swing.JPanel {
   Connection con;
    /**
     * Creates new form enterCar
     */
    public enterCar() {
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

        name = new javax.swing.JTextField();
        comp = new javax.swing.JTextField();
        fax = new javax.swing.JTextField();
        type = new javax.swing.JTextField();
        lic = new javax.swing.JTextField();
        color = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dis = new javax.swing.JTextArea();
        pri = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        year = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        ens = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        stat = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        name.setForeground(new java.awt.Color(102, 0, 0));
        add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 190, 50));

        comp.setBackground(new java.awt.Color(255, 255, 255));
        comp.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        comp.setForeground(new java.awt.Color(102, 0, 0));
        add(comp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 190, 50));

        fax.setBackground(new java.awt.Color(255, 255, 255));
        fax.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        fax.setForeground(new java.awt.Color(102, 0, 0));
        fax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                faxKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                faxKeyPressed(evt);
            }
        });
        add(fax, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 190, 50));

        type.setBackground(new java.awt.Color(255, 255, 255));
        type.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        type.setForeground(new java.awt.Color(102, 0, 0));
        add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 190, 50));

        lic.setBackground(new java.awt.Color(255, 255, 255));
        lic.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lic.setForeground(new java.awt.Color(102, 0, 0));
        lic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                licKeyTyped(evt);
            }
        });
        add(lic, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 190, 50));

        color.setBackground(new java.awt.Color(255, 255, 255));
        color.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        color.setForeground(new java.awt.Color(102, 0, 0));
        add(color, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 190, 50));

        dis.setBackground(new java.awt.Color(255, 255, 255));
        dis.setColumns(20);
        dis.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dis.setForeground(new java.awt.Color(102, 0, 0));
        dis.setRows(5);
        jScrollPane1.setViewportView(dis);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 33, 190, 110));

        pri.setBackground(new java.awt.Color(255, 255, 255));
        pri.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        pri.setForeground(new java.awt.Color(102, 0, 0));
        pri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                priMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                priMouseEntered(evt);
            }
        });
        pri.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                priKeyPressed(evt);
            }
        });
        add(pri, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 190, 50));

        jLabel2.setFont(new java.awt.Font("Elephant", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 18, 6));
        jLabel2.setText("Royal Cars");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 300, 60));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 672, 310, 10));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 410, 60));

        year.setBackground(new java.awt.Color(255, 255, 255));
        year.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        year.setForeground(new java.awt.Color(102, 0, 0));
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        year.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                yearKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                yearKeyTyped(evt);
            }
        });
        add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 90, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ens.setBackground(new java.awt.Color(255, 255, 255));
        ens.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ens.setForeground(new java.awt.Color(102, 0, 0));
        ens.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ens, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ens, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 210, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        stat.setBackground(new java.awt.Color(255, 255, 255));
        stat.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        stat.setForeground(new java.awt.Color(102, 0, 0));
        stat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Effective", "rented", "In repairs" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(stat, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stat, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 210, 60));

        jLabel3.setText("   ");
        jLabel3.setToolTipText("The price of rent in shekels per day only");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 160, 50));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Eras Demi ITC", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presintationmohamadghaneem/clears.jpg"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presintationmohamadghaneem/add.png"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 330, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presintationmohamadghaneem/27640edit05-Recoveredsdsdsd-Recovered.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
    
    
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void yearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearKeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_yearKeyPressed

    private void priKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priKeyPressed

      
       // TODO add your handling code here:
    }//GEN-LAST:event_priKeyPressed

    private void faxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_faxKeyPressed
   // TODO add your handling code here:
    }//GEN-LAST:event_faxKeyPressed

    private void priKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priKeyTyped
         char c = evt.getKeyChar();
      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
         evt.consume();  // ignore event
      
   }
               // TODO add your handling code here:
    }//GEN-LAST:event_priKeyTyped

    private void yearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearKeyTyped
     char c = evt.getKeyChar();
      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
         evt.consume();  // ignore event
      
   }           // TODO add your handling code here:
    }//GEN-LAST:event_yearKeyTyped

    private void faxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_faxKeyTyped
       char c = evt.getKeyChar();
      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
         evt.consume();  // ignore event
      
   }   // TODO add your handling code here:
    }//GEN-LAST:event_faxKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add r handling code here:
            try {
                if(lic.getText().length()==7){
                if(exist(lic.getText())){
                if(empty()&&yearCorr()&&Integer.parseInt(pri.getText())>=100){
              Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/com_car?zeroDateTimeBehavior=convertToNull", "root", "");
            String s = "INSERT INTO car(name,company,fax_num,type,lic_plate,ensurance,status,color,description,price,year_manu) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(s);
            stmt.setString(1,name.getText());
            stmt.setString(2, comp.getText());
            stmt.setString(3, fax.getText());
            stmt.setString(4, type.getText());
            stmt.setString(5, lic.getText());
            stmt.setString(6, ens.getSelectedItem().toString());
            stmt.setString(7, stat.getSelectedItem().toString());
            stmt.setString(8, color.getText());
            stmt.setString(9, dis.getText());
            stmt.setString(10, pri.getText());
            stmt.setString(11, year.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Saved");
                }else
             JOptionPane.showMessageDialog(this, "The data is incomplete or wrong with the data");       
                    
                    }else 
                    JOptionPane.showMessageDialog(this, "The car's licence plate is already there");
            
                }else
                    JOptionPane.showMessageDialog(this, "The length of car's licence plate = 7");
                    }
            
            catch (Exception e) {
        } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    color.setText("");
    comp.setText("");
    dis.setText("");
    fax.setText("");
    lic.setText("");
    name.setText("");
    pri.setText("");
    type.setText("");
    year.setText("");
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        String s="The price of rent in shekels per day only";
        setToolTipText(s);  
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        setToolTipText("");  
    }//GEN-LAST:event_jLabel3MouseExited

    private void priMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priMouseEntered
     setToolTipText("The price of rent in shekels per day only");     // TODO add your handling code here:
    }//GEN-LAST:event_priMouseEntered

    private void priMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priMouseExited
       setToolTipText("");    // TODO add your handling code here:
    }//GEN-LAST:event_priMouseExited

    private void licKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_licKeyTyped
   if(lic.getText().length()>=7)
       evt.consume();
// TODO add your handling code here:
    }//GEN-LAST:event_licKeyTyped
public boolean empty(){
    if(color.getText().equals("")||comp.getText().equals("")||dis.getText().equals("")||fax.getText().equals("")||lic.getText().equals("")||name.getText().equals("")||pri.getText().equals("")||type.getText().equals("")||year.getText().equals(""))
        return false;
    return true;
}
public boolean yearCorr(){

    int y = Calendar.getInstance().get(Calendar.YEAR);
    if(!year.getText().equals("")&&Integer.parseInt(year.getText())>=2010&&Integer.parseInt(year.getText())<=y)
        return true;
    return false;
}
public boolean exist(String s){
    try{ 
        Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/com_car?zeroDateTimeBehavior=convertToNull", "root", "");
    String sql = "SELECT * FROM car WHERE lic_plate=?";        
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
    private javax.swing.JTextField color;
    private javax.swing.JTextField comp;
    private javax.swing.JTextArea dis;
    private javax.swing.JComboBox<String> ens;
    private javax.swing.JTextField fax;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lic;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pri;
    private javax.swing.JComboBox<String> stat;
    private javax.swing.JTextField type;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
