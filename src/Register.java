/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KUMAR
 */
import java.sql.*;
import java.util.regex.Pattern;
import javax.swing.*;
public class Register extends javax.swing.JFrame{

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
             try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerdata","root","");        
        }
        catch(Exception e)
        {
          
        }
    

    }
     public boolean email(String mail)
    {
        final String emailreg = 
        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    Pattern pat=Pattern.compile(emailreg);
    if (mail == null)
            return false;
    return pat.matcher(mail).matches();
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        regform = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        p1t = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextField3 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setName("reg"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1366, 768));

        regform.setBackground(new java.awt.Color(255, 153, 153));
        regform.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("DATE OF BIRTH:");
        regform.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("NAME:");
        regform.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("PHONE NO:");
        regform.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("EMAIL ID:");
        regform.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 101, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("PASSWORD:");
        regform.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        regform.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 158, 200, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        regform.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 200, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        regform.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 609, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        regform.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 609, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("GENDER:");
        regform.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 198, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton1.setText("MALE");
        regform.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 196, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton2.setText("FEMALE");
        regform.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 196, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("ADDRESS:");
        regform.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 237, -1, 20));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("STATE");
        regform.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        p1t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1tActionPerformed(evt);
            }
        });
        regform.add(p1t, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 200, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText(" REGISTRATION FORM");
        regform.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 40, -1, -1));

        jCheckBox1.setText("SHOW");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        regform.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, -1, 20));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        regform.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 609, -1, -1));

        jCheckBox2.setText("ACCEPT ALL TERMS AND CONDITIONS");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        regform.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, 220, -1));

        jButton4.setText("view");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        regform.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 570, -1, -1));

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setVisible(false);
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("Terms And Conditions");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 11, -1, -1));

        jLabel15.setText("1.I have my orginal detail ,if i give any duplicte inforamation make legal process.");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 64, -1, -1));

        jLabel16.setText("2.In this application any information about me is leak the application not take any responsible ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 109, -1, -1));

        jLabel17.setText("3.I accept all the terms and condition ");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 153, -1, -1));

        jLabel9.setVisible(false);
        jLabel9.setText("*ENTER CORRECT EMAIL ID");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        regform.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 540, 300));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        regform.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 200, -1));

        mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailActionPerformed(evt);
            }
        });
        regform.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 200, 30));

        jLabel6.setVisible(false);
        jLabel6.setText("*INVALID NUMBER");
        regform.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, -1));
        regform.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 200, -1));

        jLabel18.setVisible(false);
        jLabel18.setText("*INVALID EMAIL ID");
        regform.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, -1, -1));

        jTextField3.setColumns(20);
        jTextField3.setRows(5);
        jScrollPane1.setViewportView(jTextField3);

        regform.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 200, 100));

        jLabel7.setText("YYYY/MM/DD");
        regform.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, -1));

        jLabel13.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regform, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(regform, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getAccessibleContext().setAccessibleName("form");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String s="";
        jTextField1.setText(s);
        jTextField2.setText(s);
        jTextField3.setText(s);
        jTextField4.setText(s);
        jTextField5.setText(s);
        mail.setText(s);
        p1t.setText(s);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int flag =0;
         String em="" +mail.getText()+"";
        if(!jCheckBox2.isSelected())
            JOptionPane.showMessageDialog(null, "To continue accept terms and conditions");
        else
        {flag=1;
            try
            {   String st1=jTextField5.getText();
                int st2=st1.length();
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerdata","root","");
                Statement stmt = con.createStatement();
                String str1 = null;
                if(jRadioButton1.isSelected())
                    str1 = jRadioButton1.getText();
                if(jRadioButton2.isSelected())
                    str1 =  jRadioButton2.getText();
                if(st2 == 10)
                    { jLabel6.setVisible(false);
                   int p1=0;
                    if(email(em)){
                      String q1 = "insert into register values('" +jTextField1.getText()+"','"+jTextField2.getText()+"','"+str1+"','"+jTextField3.getText()+"','" +jTextField4.getText()+"','"+jTextField5.getText()+"','"+mail.getText()+"','"+p1t.getText()+"','"+p1+"')";
                      stmt.executeUpdate(q1);
                      JOptionPane.showMessageDialog(null," Data has Added");    
                      jLabel18.setVisible(false);
                    }
                else{
                    jLabel18.setVisible(true);
                      }}
            else
                {
                    jLabel6.setVisible(true);
                }
                }
            catch(Exception e)
            {System.out.println(e);
            JOptionPane.showMessageDialog(null,"Enter Correct Data");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void p1tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1tActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
if(jCheckBox1.isSelected())
        {
           p1t.setEchoChar('\u0000');
        }
        else
        {
            p1t.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Login h3 = new Login();
        this.setVisible(false);
        h3.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed

    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     jPanel1.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed

    }//GEN-LAST:event_jPanel1KeyPressed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailActionPerformed

    }//GEN-LAST:event_mailActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextArea jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField mail;
    private javax.swing.JPasswordField p1t;
    private javax.swing.JPanel regform;
    // End of variables declaration//GEN-END:variables
}
