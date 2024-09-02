
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KUMAR
 */
public class Ferti extends javax.swing.JFrame {
    
     
    /**
     * Creates new form UsMain
     */
    public Ferti() {
        initComponents();
        getemail();
        delete();
        disable();
    }
   
    public void dataHome(String em)
    {
        mail1=em;
     //   mail.setText(em);   
    }
    public int i=0,x=0;
     public void getemail(){
      try{
        String str="select email from data";   
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerdata","root","");
        Statement stmt= conn.prepareStatement(str);
        ResultSet rs = stmt.executeQuery(str); 
        while(rs.next())
     { String st=rs.getString("email");
       mail.setText(st);     
     }}
     catch(Exception e){}}
    public void total(){
        try{
        i=0;
        String str="select tprice from ferti";   
        String str1="select * from ferti";
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerdata","root","");
        Statement stmt= conn.prepareStatement(str);
        Statement stmt1= conn.prepareStatement(str1);
        ResultSet rs1 = stmt.executeQuery(str1);
        jTable1.setModel(DbUtils.resultSetToTableModel(rs1));
        ResultSet rs = stmt.executeQuery(str); 
        String st;
        while(rs.next())
        {   
            st=rs.getString("tprice");
            int st4=Integer.parseInt(st);
            i=st4+i;
        }
      total.setText(String.valueOf(i));
    }
      catch(Exception e)
            {
          JOptionPane.showMessageDialog(null,"Not total");
        } 
    }
    public void delete()
    {     try 
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerdata","root","");
            Statement stmt = con.createStatement();                 
            String q1 = "DELETE from ferti" ;
            stmt.executeUpdate(q1);
            disable();
            total();
                }
        catch(Exception e)
        {
         System.out.println(e);
        }}
    public void disable()
    {     
       try{
        String str="select id,name,price,image from p_data";   
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerdata","root","");
        Statement stmt= conn.prepareStatement(str);
        String st1,st2,st3;
        ResultSet rs = stmt.executeQuery(str); 
        String a1="101",a2="102",a3="103",a4="104",a5="105",a6="106",a7="107",a8="108",a9="109",a10="110";
        while(rs.next())
     { 
         if(a1.equals(rs.getString("id")))
         {  
         p1.setVisible(true);
         st3=rs.getString("image");
         String st4="photo/"+st3+".jpg";
         p1l.setIcon(new javax.swing.ImageIcon(getClass().getResource(st4)));
         st1=rs.getString("name");
         st2=rs.getString("price");
         p1n.setText(st1);
         p1p.setText(st2);
         }
         else if(a2.equals(rs.getString("id")))
         {
         st3=rs.getString("image");
         String st4="photo/"+st3+".jpg";
         p2l.setIcon(new javax.swing.ImageIcon(getClass().getResource(st4)));
         p2.setVisible(true);   
         st1=rs.getString("name");
         st2=rs.getString("price");
         p2n.setText(st1);
         p2p.setText(st2);
         }
         else if(a3.equals(rs.getString("id")))
         {
         p3.setVisible(true);
         st3=rs.getString("image");
         String st4="photo/"+st3+".jpg";
         p3l.setIcon(new javax.swing.ImageIcon(getClass().getResource(st4)));
         st1=rs.getString("name");
         st2=rs.getString("price");
         p3n.setText(st1);
         p3p.setText(st2);
         }
         else if(a4.equals(rs.getString("id")))
         {
         p4.setVisible(true);
         st3=rs.getString("image");
         String st4="photo/"+st3+".jpg";
         p4l.setIcon(new javax.swing.ImageIcon(getClass().getResource(st4)));
         st1=rs.getString("name");
         st2=rs.getString("price");
         p4n.setText(st1);
         p4p.setText(st2);
         }
         else if(a5.equals(rs.getString("id")))
         {   
         p5.setVisible(true);
         st3=rs.getString("image");
         String st4="photo/"+st3+".jpg";
         p5l.setIcon(new javax.swing.ImageIcon(getClass().getResource(st4)));
         st1=rs.getString("name");
         st2=rs.getString("price");
         p5n.setText(st1);
         p5p.setText(st2);
         }
         else if(a6.equals(rs.getString("id")))
         {   
         p6.setVisible(true);
         st3=rs.getString("image");
         String st4="photo/"+st3+".jpg";
         p6l.setIcon(new javax.swing.ImageIcon(getClass().getResource(st4)));
         st1=rs.getString("name");
         st2=rs.getString("price");
         p6n.setText(st1);
         p6p.setText(st2);
         }
         else if(a7.equals(rs.getString("id")))
         {
         st3=rs.getString("image");
         String st4="photo/"+st3+".jpg";
         p7l.setIcon(new javax.swing.ImageIcon(getClass().getResource(st4)));
         p7.setVisible(true);
         st1=rs.getString("name");
         st2=rs.getString("price");
         p7n.setText(st1);
         p7p.setText(st2);
         }
         else if(a8.equals(rs.getString("id")))
         {   
         p8.setVisible(true);
         st3=rs.getString("image");
         String st4="photo/"+st3+".jpg";
         p8l.setIcon(new javax.swing.ImageIcon(getClass().getResource(st4)));
         st1=rs.getString("name");
         st2=rs.getString("price");
         p8n.setText(st1);
         p8p.setText(st2);
         }
         else if(a9.equals(rs.getString("id")))
         {
         st3=rs.getString("image");
         String st4="photo/"+st3+".jpg";
         p9l.setIcon(new javax.swing.ImageIcon(getClass().getResource(st4)));
         p9.setVisible(true);
         st1=rs.getString("name");
         st2=rs.getString("price");
         p9n.setText(st1);
         p9p.setText(st2);
         }
         else if(a10.equals(rs.getString("id")))
         {   
         p10.setVisible(true);
         st3=rs.getString("image");
         String st4="photo/"+st3+".jpg";
         p10l.setIcon(new javax.swing.ImageIcon(getClass().getResource(st4)));
         st1=rs.getString("name");
         st2=rs.getString("price");
         p10n.setText(st1);
         p10p.setText(st2);
         }
     }
            }
            catch(Exception e)
            {
            {
          JOptionPane.showMessageDialog(null,"Not selected11");
        }
            }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        p2 = new javax.swing.JPanel();
        p2l = new javax.swing.JLabel();
        p2n = new javax.swing.JLabel();
        p2p = new javax.swing.JLabel();
        p2b = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        p2t = new javax.swing.JTextField();
        p2n1 = new javax.swing.JLabel();
        p2p1 = new javax.swing.JLabel();
        p3 = new javax.swing.JPanel();
        p3l = new javax.swing.JLabel();
        p3n = new javax.swing.JLabel();
        p3p = new javax.swing.JLabel();
        p3b = new javax.swing.JButton();
        p3q = new javax.swing.JLabel();
        p3t = new javax.swing.JTextField();
        p3n1 = new javax.swing.JLabel();
        p3p1 = new javax.swing.JLabel();
        p4 = new javax.swing.JPanel();
        p4l = new javax.swing.JLabel();
        p4n = new javax.swing.JLabel();
        p4p = new javax.swing.JLabel();
        p4b = new javax.swing.JButton();
        p4q = new javax.swing.JLabel();
        p4t = new javax.swing.JTextField();
        p4n1 = new javax.swing.JLabel();
        p4p1 = new javax.swing.JLabel();
        p5 = new javax.swing.JPanel();
        p5l = new javax.swing.JLabel();
        p5n = new javax.swing.JLabel();
        p5p = new javax.swing.JLabel();
        p5b = new javax.swing.JButton();
        p5q = new javax.swing.JLabel();
        p5t = new javax.swing.JTextField();
        p5n1 = new javax.swing.JLabel();
        p5p1 = new javax.swing.JLabel();
        p6 = new javax.swing.JPanel();
        p6l = new javax.swing.JLabel();
        p6n = new javax.swing.JLabel();
        p6p = new javax.swing.JLabel();
        p6b = new javax.swing.JButton();
        p6q = new javax.swing.JLabel();
        p6t = new javax.swing.JTextField();
        p6n1 = new javax.swing.JLabel();
        p6p1 = new javax.swing.JLabel();
        p7 = new javax.swing.JPanel();
        p7l = new javax.swing.JLabel();
        p7n = new javax.swing.JLabel();
        p7p = new javax.swing.JLabel();
        p7b = new javax.swing.JButton();
        p7q = new javax.swing.JLabel();
        p7t = new javax.swing.JTextField();
        p7n1 = new javax.swing.JLabel();
        p7p1 = new javax.swing.JLabel();
        p8 = new javax.swing.JPanel();
        p8l = new javax.swing.JLabel();
        p8n = new javax.swing.JLabel();
        p8p = new javax.swing.JLabel();
        p8b = new javax.swing.JButton();
        p8q = new javax.swing.JLabel();
        p8t = new javax.swing.JTextField();
        p8n1 = new javax.swing.JLabel();
        p8p1 = new javax.swing.JLabel();
        p9 = new javax.swing.JPanel();
        p9l = new javax.swing.JLabel();
        p9n = new javax.swing.JLabel();
        p9p = new javax.swing.JLabel();
        p9b = new javax.swing.JButton();
        p9q = new javax.swing.JLabel();
        p9t = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        p1p3 = new javax.swing.JLabel();
        p1 = new javax.swing.JPanel();
        p1l = new javax.swing.JLabel();
        p1n = new javax.swing.JLabel();
        p1p = new javax.swing.JLabel();
        p1b = new javax.swing.JButton();
        p1q = new javax.swing.JLabel();
        p1t = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        p1p1 = new javax.swing.JLabel();
        p10 = new javax.swing.JPanel();
        p10l = new javax.swing.JLabel();
        p10n = new javax.swing.JLabel();
        p10p = new javax.swing.JLabel();
        p10b = new javax.swing.JButton();
        p10q = new javax.swing.JLabel();
        p10t = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        p1p5 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel13.setText("FERTILISATION FORM");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 25, -1, -1));

        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 25, -1, -1));

        jButton7.setText("CONFIRM");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 580, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NAME", "PRICE", "QUANTITY", "TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 90, 310, -1));

        jButton5.setText("CLEAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 580, -1, -1));

        jPanel14.setBackground(new java.awt.Color(153, 153, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        p2.setVisible(false);
        p2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p2l.setBackground(new java.awt.Color(51, 102, 255));
        p2l.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p2.add(p2l, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, 110, 71));

        p2n.setText("name");
        p2.add(p2n, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        p2p.setText("price");
        p2.add(p2p, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 78, -1));

        p2b.setText("ADD");
        p2b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2bActionPerformed(evt);
            }
        });
        p2.add(p2b, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 20));

        jLabel16.setText("QUANTITY:");
        p2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        p2.add(p2t, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 50, -1));

        p2n1.setText("NAME:");
        p2.add(p2n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        p2p1.setText("PRICE:");
        p2.add(p2p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 78, -1));

        p3.setVisible(false);
        p3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p3l.setBackground(new java.awt.Color(51, 102, 255));
        p3l.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p3.add(p3l, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 71));

        p3n.setText("name");
        p3.add(p3n, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        p3p.setText("price");
        p3.add(p3p, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 78, -1));

        p3b.setText("ADD");
        p3b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3bActionPerformed(evt);
            }
        });
        p3.add(p3b, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, 20));

        p3q.setText("QUANTITY:");
        p3.add(p3q, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        p3.add(p3t, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 50, -1));

        p3n1.setText("NAME:");
        p3.add(p3n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        p3p1.setText("PRICE:");
        p3.add(p3p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 78, -1));

        p4.setVisible(false);
        p4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                p4ComponentHidden(evt);
            }
        });

        p4l.setBackground(new java.awt.Color(51, 102, 255));
        p4l.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        p4n.setText("NAME:");

        p4p.setText("price");

        p4b.setText("ADD");
        p4b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4bActionPerformed(evt);
            }
        });

        p4q.setText("QUANTITY:");

        p4n1.setText("name");

        p4p1.setText("PRICE:");

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(p4q)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p4t))
                    .addGroup(p4Layout.createSequentialGroup()
                        .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(p4l, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(p4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(p4Layout.createSequentialGroup()
                                        .addComponent(p4p1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)
                                        .addComponent(p4p, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(p4Layout.createSequentialGroup()
                                        .addComponent(p4n)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(p4n1)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(p4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(p4b)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(p4l, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p4n)
                    .addComponent(p4n1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p4p)
                    .addComponent(p4p1))
                .addGap(4, 4, 4)
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p4q)
                    .addComponent(p4t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p4b, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p5.setVisible(false);
        p5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p5l.setBackground(new java.awt.Color(51, 102, 255));
        p5l.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p5.add(p5l, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, 110, 71));

        p5n.setText("name");
        p5.add(p5n, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        p5p.setText("price");
        p5.add(p5p, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 30, -1));

        p5b.setText("ADD");
        p5b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5bActionPerformed(evt);
            }
        });
        p5.add(p5b, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 20));

        p5q.setText("QUANTITY:");
        p5.add(p5q, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        p5.add(p5t, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 50, -1));

        p5n1.setText("NAME:");
        p5.add(p5n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        p5p1.setText("PRICE:");
        p5.add(p5p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 40, -1));

        p6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p6.setVisible(false);
        p6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p6l.setBackground(new java.awt.Color(51, 102, 255));
        p6l.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p6.add(p6l, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, 110, 71));

        p6n.setText("name");
        p6.add(p6n, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        p6p.setText("price");
        p6.add(p6p, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 30, -1));

        p6b.setText("ADD");
        p6b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p6bActionPerformed(evt);
            }
        });
        p6.add(p6b, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 20));

        p6q.setText("QUANTITY:");
        p6.add(p6q, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        p6.add(p6t, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 50, -1));

        p6n1.setText("NAME:");
        p6.add(p6n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        p6p1.setText("PRICE:");
        p6.add(p6p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 50, -1));

        p7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p7.setVisible(false);
        p7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p7l.setBackground(new java.awt.Color(51, 102, 255));
        p7l.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p7.add(p7l, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, 110, 71));

        p7n.setText("name");
        p7.add(p7n, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        p7p.setText("price");
        p7.add(p7p, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 30, -1));

        p7b.setText("ADD");
        p7b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p7bActionPerformed(evt);
            }
        });
        p7.add(p7b, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 20));

        p7q.setText("QUANTITY:");
        p7.add(p7q, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        p7.add(p7t, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 50, -1));

        p7n1.setText("NAME:");
        p7.add(p7n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        p7p1.setText("PRICE:");
        p7.add(p7p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 50, -1));

        p8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p8.setVisible(false);
        p8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p8l.setBackground(new java.awt.Color(51, 102, 255));
        p8l.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p8.add(p8l, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, 110, 71));

        p8n.setText("name");
        p8.add(p8n, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        p8p.setText("price");
        p8.add(p8p, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 30, -1));

        p8b.setText("ADD");
        p8b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p8bActionPerformed(evt);
            }
        });
        p8.add(p8b, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 20));

        p8q.setText("QUANTITY:");
        p8.add(p8q, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        p8.add(p8t, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 50, -1));

        p8n1.setText("NAME:");
        p8.add(p8n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        p8p1.setText("PRICE:");
        p8.add(p8p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 40, -1));

        p9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p9.setVisible(false);
        p9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p9l.setBackground(new java.awt.Color(51, 102, 255));
        p9l.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p9.add(p9l, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, 110, 71));

        p9n.setText("name");
        p9.add(p9n, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        p9p.setText("price");
        p9.add(p9p, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 40, -1));

        p9b.setText("ADD");
        p9b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p9bActionPerformed(evt);
            }
        });
        p9.add(p9b, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 20));

        p9q.setText("QUANTITY:");
        p9.add(p9q, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        p9.add(p9t, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 50, -1));

        jLabel3.setText("NAME:");
        p9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        p1p3.setText("PRICE:");
        p9.add(p1p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 40, -1));

        p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p1.setVisible(false);
        p1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p1l.setBackground(new java.awt.Color(51, 102, 255));
        p1l.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p1.add(p1l, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, 110, 71));

        p1n.setText("name");
        p1.add(p1n, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        p1p.setText("price");
        p1.add(p1p, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 40, -1));

        p1b.setText("ADD");
        p1b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1bActionPerformed(evt);
            }
        });
        p1.add(p1b, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 20));

        p1q.setText("QUANTITY:");
        p1.add(p1q, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        p1.add(p1t, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 50, -1));

        jLabel1.setText("NAME:");
        p1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        p1p1.setText("PRICE:");
        p1.add(p1p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 40, -1));

        p10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p10.setVisible(false);
        p10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p10l.setBackground(new java.awt.Color(51, 102, 255));
        p10l.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p10.add(p10l, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, 110, 71));

        p10n.setText("name");
        p10.add(p10n, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        p10p.setText("price");
        p10.add(p10p, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 40, -1));

        p10b.setText("ADD");
        p10b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p10bActionPerformed(evt);
            }
        });
        p10.add(p10b, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 20));

        p10q.setText("QUANTITY:");
        p10.add(p10q, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        p10.add(p10t, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 50, -1));

        jLabel4.setText("NAME:");
        p10.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        p1p5.setText("PRICE:");
        p10.add(p1p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 40, -1));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(p10, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p10, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 85, 880, 480));
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(1204, 550, 40, 20));

        jLabel2.setText("TOTAL:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 550, -1, -1));

        jLabel5.setText("EMAIL:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        mail.setText(" ");
        getContentPane().add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 250, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        BuySelect l1=new BuySelect();
        this.setVisible(false);
        l1.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     delete();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void p1bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1bActionPerformed
        String st1=p1n.getText();
        String st2=p1p.getText();
        String st3=p1t.getText();
        int st4;
        st4=Integer.parseInt(st2)*Integer.parseInt(st3);
        String st5;
        st5 = String.valueOf(st4);
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerdata","root","");
            Statement stmt = con.createStatement();
            String q1 = "insert into ferti values('"+st1+"','"+st2+"','"+st3+"','"+st5+"')";
            stmt.executeUpdate(q1);
            total();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Not Inserted");
            System.out.println(e);
        }
    }//GEN-LAST:event_p1bActionPerformed

    private void p2bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2bActionPerformed
        String st1=p2n.getText();
        String st2=p2p.getText();
        String st3=p2t.getText();
        int st4;
        st4=Integer.parseInt(st2)*Integer.parseInt(st3);
        String st5;
        st5 = String.valueOf(st4);
        try
        {
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerdata","root","");
            Statement stmt = con.createStatement();
            String q1 = "insert into ferti values('"+st1+"','"+st2+"','"+st3+"','"+st5+"')";
            stmt.executeUpdate(q1);
            total();}
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Not Inserted");
            System.out.println(e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_p2bActionPerformed

    private void p3bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3bActionPerformed
        String st1=p3n.getText();
        String st2=p3p.getText();
        String st3=p3t.getText();
        
        int st4;
        st4=Integer.parseInt(st2)*Integer.parseInt(st3);
        String st5;
        st5 = String.valueOf(st4);
        try
        {
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerdata","root","");
            Statement stmt = con.createStatement();
            String q1 = "insert into ferti values('"+st1+"','"+st2+"','"+st3+"','"+st5+"')";
            stmt.executeUpdate(q1);
            total();}
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Not Inserted");
            System.out.println(e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_p3bActionPerformed

    private void p4bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4bActionPerformed
        String st1=p4n.getText();
        String st2=p4p.getText();
        String st3=p4t.getText();
        int st4;
        st4=Integer.parseInt(st2)*Integer.parseInt(st3);
        String st5;
        st5 = String.valueOf(st4);
        try
        {
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerdata","root","");
            Statement stmt = con.createStatement();
            String q1 = "insert into ferti values('"+st1+"','"+st2+"','"+st3+"','"+st5+"')";
            stmt.executeUpdate(q1);
            total();}
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Not Inserted");
            System.out.println(e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_p4bActionPerformed

    private void p4ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_p4ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_p4ComponentHidden

    private void p5bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5bActionPerformed
        String st1=p5n.getText();
        String st2=p5p.getText();
        String st3=p5t.getText();
        total();
        int st4;
        st4=Integer.parseInt(st2)*Integer.parseInt(st3);
        String st5;
        st5 = String.valueOf(st4);
        try
        {
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerdata","root","");
            Statement stmt = con.createStatement();
            String q1 = "insert into ferti values('"+st1+"','"+st2+"','"+st3+"','"+st5+"')";
            stmt.executeUpdate(q1);
            total();}
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Not Inserted");
            System.out.println(e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_p5bActionPerformed

    private void p6bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p6bActionPerformed
        String st1=p6n.getText();
        String st2=p6p.getText();
        String st3=p6t.getText();
        int st4;
        st4=Integer.parseInt(st2)*Integer.parseInt(st3);
        String st5;
        st5 = String.valueOf(st4);
        try
        {
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerdata","root","");
            Statement stmt = con.createStatement();
            String q1 = "insert into ferti values('"+st1+"','"+st2+"','"+st3+"','"+st5+"')";
            stmt.executeUpdate(q1);
            total();}
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Not Inserted");
            System.out.println(e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_p6bActionPerformed

    private void p7bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p7bActionPerformed
        String st1=p7n.getText();
        String st2=p7p.getText();
        String st3=p7t.getText();
        int st4;
        st4=Integer.parseInt(st2)*Integer.parseInt(st3);
        String st5;
        st5 = String.valueOf(st4);
        try
        {
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerdata","root","");
            Statement stmt = con.createStatement();
            String q1 = "insert into ferti values('"+st1+"','"+st2+"','"+st3+"','"+st5+"')";
            stmt.executeUpdate(q1);
            total();}
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Not Inserted");
            System.out.println(e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_p7bActionPerformed

    private void p8bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p8bActionPerformed
        String st1=p8n.getText();
        String st2=p8p.getText();
        String st3=p8t.getText();
        int st4;
        st4=Integer.parseInt(st2)*Integer.parseInt(st3);
        String st5;
        st5 = String.valueOf(st4);
        try
        {
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerdata","root","");
            Statement stmt = con.createStatement();
            String q1 = "insert into ferti values('"+st1+"','"+st2+"','"+st3+"','"+st5+"')";
            stmt.executeUpdate(q1);
            total();} 
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Not Inserted");
            System.out.println(e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_p8bActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    
    }//GEN-LAST:event_jTable1MouseClicked

    private void p9bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p9bActionPerformed
      String st1=p9n.getText();
        String st2=p9p.getText();
        String st3=p9t.getText();
        int st4;
        st4=Integer.parseInt(st2)*Integer.parseInt(st3);
        String st5;
        st5 = String.valueOf(st4);
        try
        {
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerdata","root","");
            Statement stmt = con.createStatement();
            String q1 = "insert into ferti values('"+st1+"','"+st2+"','"+st3+"','"+st5+"')";
            stmt.executeUpdate(q1);
            total();} 
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Not Inserted");
            System.out.println(e);
        }  
    }//GEN-LAST:event_p9bActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int t=0,st1;
        String to=total.getText();
        try{
        String str="select price from register where email='" + mail.getText() + "'"; 
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerdata","root","");
        Statement stmt= conn.prepareStatement(str);
        ResultSet rs = stmt.executeQuery(str); 
        while(rs.next()){
            t=rs.getInt("price"); 
        }
        st1=Integer.parseInt(to)+t;
        String q1 = "UPDATE `register` SET `price`='" +st1+"' WHERE email='" + mail.getText() + "'";
         stmt.executeUpdate(q1); 
    }
       
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,"Not Updated");
        }
     
        Bill s1=new Bill();
       setVisible(false);
       s1.setVisible(true);
        JOptionPane.showMessageDialog(null,"***BUYYED SUCCESSFULLY*** \n THANK YOU");
       
    }//GEN-LAST:event_jButton7ActionPerformed

    private void p10bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p10bActionPerformed
       String st1=p10n.getText();
        String st2=p10p.getText();
        String st3=p10t.getText();
        int st4;
        st4=Integer.parseInt(st2)*Integer.parseInt(st3);
        String st5;
        st5 = String.valueOf(st4);
        try
        {
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerdata","root","");
            Statement stmt = con.createStatement();
            String q1 = "insert into ferti values('"+st1+"','"+st2+"','"+st3+"','"+st5+"')";
            stmt.executeUpdate(q1);
            total();} 
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Not Inserted");
            System.out.println(e);
        }  
    }//GEN-LAST:event_p10bActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ferti().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel mail;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p10;
    private javax.swing.JButton p10b;
    private javax.swing.JLabel p10l;
    private javax.swing.JLabel p10n;
    private javax.swing.JLabel p10p;
    private javax.swing.JLabel p10q;
    private javax.swing.JTextField p10t;
    private javax.swing.JButton p1b;
    private javax.swing.JLabel p1l;
    private javax.swing.JLabel p1n;
    private javax.swing.JLabel p1p;
    private javax.swing.JLabel p1p1;
    private javax.swing.JLabel p1p3;
    private javax.swing.JLabel p1p5;
    private javax.swing.JLabel p1q;
    private javax.swing.JTextField p1t;
    private javax.swing.JPanel p2;
    private javax.swing.JButton p2b;
    private javax.swing.JLabel p2l;
    private javax.swing.JLabel p2n;
    private javax.swing.JLabel p2n1;
    private javax.swing.JLabel p2p;
    private javax.swing.JLabel p2p1;
    private javax.swing.JTextField p2t;
    private javax.swing.JPanel p3;
    private javax.swing.JButton p3b;
    private javax.swing.JLabel p3l;
    private javax.swing.JLabel p3n;
    private javax.swing.JLabel p3n1;
    private javax.swing.JLabel p3p;
    private javax.swing.JLabel p3p1;
    private javax.swing.JLabel p3q;
    private javax.swing.JTextField p3t;
    private javax.swing.JPanel p4;
    private javax.swing.JButton p4b;
    private javax.swing.JLabel p4l;
    private javax.swing.JLabel p4n;
    private javax.swing.JLabel p4n1;
    private javax.swing.JLabel p4p;
    private javax.swing.JLabel p4p1;
    private javax.swing.JLabel p4q;
    private javax.swing.JTextField p4t;
    private javax.swing.JPanel p5;
    private javax.swing.JButton p5b;
    private javax.swing.JLabel p5l;
    private javax.swing.JLabel p5n;
    private javax.swing.JLabel p5n1;
    private javax.swing.JLabel p5p;
    private javax.swing.JLabel p5p1;
    private javax.swing.JLabel p5q;
    private javax.swing.JTextField p5t;
    private javax.swing.JPanel p6;
    private javax.swing.JButton p6b;
    private javax.swing.JLabel p6l;
    private javax.swing.JLabel p6n;
    private javax.swing.JLabel p6n1;
    private javax.swing.JLabel p6p;
    private javax.swing.JLabel p6p1;
    private javax.swing.JLabel p6q;
    private javax.swing.JTextField p6t;
    private javax.swing.JPanel p7;
    private javax.swing.JButton p7b;
    private javax.swing.JLabel p7l;
    private javax.swing.JLabel p7n;
    private javax.swing.JLabel p7n1;
    private javax.swing.JLabel p7p;
    private javax.swing.JLabel p7p1;
    private javax.swing.JLabel p7q;
    private javax.swing.JTextField p7t;
    private javax.swing.JPanel p8;
    private javax.swing.JButton p8b;
    private javax.swing.JLabel p8l;
    private javax.swing.JLabel p8n;
    private javax.swing.JLabel p8n1;
    private javax.swing.JLabel p8p;
    private javax.swing.JLabel p8p1;
    private javax.swing.JLabel p8q;
    private javax.swing.JTextField p8t;
    private javax.swing.JPanel p9;
    private javax.swing.JButton p9b;
    private javax.swing.JLabel p9l;
    private javax.swing.JLabel p9n;
    private javax.swing.JLabel p9p;
    private javax.swing.JLabel p9q;
    private javax.swing.JTextField p9t;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
String mail1;    
}
