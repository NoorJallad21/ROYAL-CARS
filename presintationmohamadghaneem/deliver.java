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
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class deliver extends javax.swing.JPanel {
public static Connection con;

    /**
     * Creates new form deliver
     */
    public deliver() {
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

        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lic = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Elephant", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 18, 6));
        jLabel2.setText("Royal Cars");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 300, 60));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, 300, 10));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 0));
        jButton1.setText("Deliverd");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setDoubleBuffered(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presintationmohamadghaneem/clears.jpg"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 620, 150));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lic.setBackground(new java.awt.Color(255, 255, 255));
        lic.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lic.setForeground(new java.awt.Color(102, 0, 0));
        lic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                licKeyTyped(evt);
            }
        });

        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        id.setForeground(new java.awt.Color(102, 0, 0));
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(lic))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lic, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 260, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presintationmohamadghaneem/27640edit05-Recovered-Rejhgjhgjhcovered_1 (1).png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if(existPlate(lic.getText())&&existID(id.getText())){
        try{
            String[]arr=new String[11];
             Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/com_car?zeroDateTimeBehavior=convertToNull", "root", "");
    String sql = "SELECT * FROM car WHERE lic_plate= ?";        
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1,lic.getText());
    ResultSet rs = ps.executeQuery();
    while (rs.next())
    {
    arr[0]=rs.getString("name");
    arr[1]=rs.getString("company");
    arr[2]=rs.getString("fax_num");
    arr[3]=rs.getString("type");
    arr[4]=rs.getString("lic_plate");
    arr[5]=rs.getString("ensurance");
    arr[6]="Effective";
    arr[7]=rs.getString("color");
    arr[8]=rs.getString("description");
    arr[9]=rs.getString("price");
    arr[10]=rs.getString("year_manu");
    }
           //?????? ??????????
           String string="delete from car where lic_plate=?";
           PreparedStatement s=con.prepareStatement(string);
           s.setString(1,lic.getText());
           s.execute();
           //?????????? ??????????
           String sl = "INSERT INTO car(name,company,fax_num,type,lic_plate,ensurance,status,color,description,price,year_manu) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sl);
            stmt.setString(1,arr[0]);
            stmt.setString(2,arr[1]);
            stmt.setString(3,arr[2]);
            stmt.setString(4,arr[3]);
            stmt.setString(5,arr[4]);
            stmt.setString(6,arr[5]);
            stmt.setString(7,arr[6]);
            stmt.setString(8,arr[7]);
            stmt.setString(9,arr[8]);
            stmt.setString(10,arr[9]);
            stmt.setString(11,arr[10]);
            stmt.executeUpdate();
            ///////////user
                String[]use=new String[14];
    String sq = "SELECT * FROM user WHERE user_id=?";        
    PreparedStatement ps1 = con.prepareStatement(sq);
    ps1.setString(1,id.getText());
    ResultSet rs1 = ps1.executeQuery();
    while (rs1.next())
    {
        String li=rs1.getString("licence");
       if(li.equals(lic.getText())&&rs1.getString("stat").equals("no")){
    use[0]=rs1.getString("name");
    use[1]=rs1.getString("age");
    use[2]=rs1.getString("user_id");
    use[3]=rs1.getString("phone");
    use[4]=rs1.getString("licence");
    use[5]=rs1.getString("address");
    use[6]=rs1.getString("received_data");
    use[7]=rs1.getString("lease");
    use[8]=rs1.getString("discount");
    use[9]=rs1.getString("pay_method");
    use[10]=rs1.getString("chek_num");
    use[11]=rs1.getString("receive_chek");
    use[12]=rs1.getString("amount");
    use[13]="yes";
    }}
    //?????? ????????????
    String stringu="delete from user where user_id=? AND licence=? AND stat=?";
           PreparedStatement su=con.prepareStatement(stringu);
           su.setString(1,id.getText());
           su.setString(2, lic.getText());
           su.setString(3, "no");
           su.execute();
    
    // ?????????? ????????????     
    String sul = "INSERT INTO user(name,age,user_id,phone,licence,address,received_data,lease,discount,pay_method,chek_num,receive_chek,amount,stat) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmtu = con.prepareStatement(sul);
            stmtu.setString(1,use[0]);
            stmtu.setString(2,use[1]);
            stmtu.setString(3,use[2]);
            stmtu.setString(4,use[3]);
            stmtu.setString(5,use[4]);
            stmtu.setString(6,use[5]);
            stmtu.setString(7,use[6]);
            stmtu.setString(8,use[7]);
            stmtu.setString(9,use[8]);
            stmtu.setString(10,use[9]);
            stmtu.setString(11,use[10]);
            stmtu.setString(12,use[11]);
            stmtu.setString(13,use[12]);
            stmtu.setString(14,use[13]);
            stmtu.executeUpdate();
            JOptionPane.showMessageDialog(null, "Done *_* ");
        }catch(Exception e){
            System.out.println(e);
        }
        
    }else
        JOptionPane.showMessageDialog(null, "There is an error in the input");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
 if(id.getText().length()<9){
        char c = evt.getKeyChar();
      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
         evt.consume();  // ignore event
      
   } }else 
      evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_idKeyTyped

    private void licKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_licKeyTyped
     if(lic.getText().length()>=7)
       evt.consume();
        // TODO add your handling code here:
    }//GEN-LAST:event_licKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
id.setText("");  
lic.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
public boolean existPlate(String s){
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
    if(c!=0)
        return true;
    return false;
    }catch(Exception e){
        
    }
    return false;
}
public boolean existID(String s){
    try{ 
        Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/com_car?zeroDateTimeBehavior=convertToNull", "root", "");
    String sql = "SELECT * FROM user WHERE user_id=?";        
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1,s);

    ResultSet rs = ps.executeQuery();
    while (rs.next())
    {
    if(rs.getString("licence").equals(lic.getText())&&rs.getString("stat").equals("no"))
        return true;
    }
    return false;
    }catch(Exception e){
        
    }
    return false;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lic;
    // End of variables declaration//GEN-END:variables
}
