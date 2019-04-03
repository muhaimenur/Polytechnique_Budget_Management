/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budget_of_polytechnic;

import java.awt.Dimension;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Muhaimenur
 * 
 */
public class AdminPanel extends javax.swing.JFrame {
    public ResultSet rs;
   public Statement st;
   public Connection con;
    private PreparedStatement pst;
    private String sql;
    int codenumber, num58, code1, code2, code3, code4, code5, code6, code7, code8, code9, code10, code11, code12, code13, code14, code15, code16, code17, code18, code19, code20, code21, code22, code23, code24, code25, code26, code27, code28, code29, code30, code31, code32, code33, code34, code35, code36, code37, code38, code39, code40, code41, code42, code43, code44, code45, code46, code47, code48, code49, code50, code51, code52, code53, code54, code55, code56, code57;
    String table_Click, table_Click1, table_Click2, table_Click3, table_Click4, table_Click5, table_Click6;
    int updateValue;
    /**
     * Creates new form Main
     */
    public AdminPanel() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        Connection();
        //Expenditure_of_DP_RFQ_OTM();
        remaining_budget();
    }
 
    public void remaining_budget()
{
    try{
           String sql3 = "select sum(BUDGET) from budgettable";
            rs = st.executeQuery(sql3);
            if(rs.next())
            {
                String sum = rs.getString("sum(BUDGET)");
                RemainingBudget.setText(String.valueOf(sum));
                System.out.println(" "+RemainingBudget);
            }

    }
    catch (Exception e) 
           {
            JOptionPane.showMessageDialog(rootPane, "Database Error");
           }

}
   /* public void Expenditure_of_DP_RFQ_OTM()
    {
        try{
            String DP = "DP";
            String RFQ = "RFQ";
            String OTM = "OTM";
           String sql2 = "select sum(Total) from expenditure_table where procurement_method = '" + DP + "' ";
           String sql3 = "select sum(Total) from expenditure_table where procurement_method = '" + RFQ + "' ";
           String sql4 = "select sum(Total) from expenditure_table where procurement_method = '" + OTM + "' ";
           rs = st.executeQuery(sql2);
            if(rs.next())
            {
                String sum = rs.getString("sum(Total)");
                DP_show.setText(sum);
            
            }
            rs = st.executeQuery(sql3);
            if(rs.next())
            {
                String sum = rs.getString("sum(Total)");
                RFQ_show.setText(sum);
            
            }
            rs = st.executeQuery(sql4);
            if(rs.next())
            {
                String sum = rs.getString("sum(Total)");
                OTM_show.setText(sum);
            
            }
           
           }
           catch (Exception e) 
           {
           // JOptionPane.showMessageDialog(rootPane, "Database Error");
           }
    
    }*/
     public void Connection()
        {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/budget_of_polytechnic","root","");
                
                st = con.createStatement();
                
               }
       catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        }
      public void clearTextfield()
     {
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
            jTextField9.setText("");
            jTextField10.setText("");
            jTextField11.setText("");
            jTextField12.setText("");
            jTextField13.setText("");
            jTextField14.setText("");
            jTextField15.setText("");
            jTextField16.setText("");
            jTextField17.setText("");
            jTextField18.setText("");
            jTextField19.setText("");
            jTextField20.setText("");
            jTextField21.setText("");
            jTextField22.setText("");
            jTextField23.setText("");
            jTextField24.setText("");
            jTextField25.setText("");
            jTextField26.setText("");
            jTextField27.setText("");
            jTextField28.setText("");
            jTextField29.setText("");
            jTextField30.setText("");
            jTextField31.setText("");
            jTextField32.setText("");
            jTextField33.setText("");
            jTextField34.setText("");
            jTextField35.setText("");
            jTextField36.setText("");
            jTextField37.setText("");
            jTextField38.setText("");
            jTextField39.setText("");
            jTextField40.setText("");
            jTextField41.setText("");
            jTextField42.setText("");
            jTextField43.setText("");
            jTextField44.setText("");
            jTextField45.setText("");
            jTextField46.setText("");
            jTextField47.setText("");
            jTextField48.setText("");
            jTextField49.setText("");
            jTextField50.setText("");
            jTextField51.setText("");
            jTextField52.setText("");
            jTextField53.setText("");
            jTextField54.setText("");
            jTextField55.setText("");
            jTextField56.setText("");
            jTextField57.setText("");
     
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jTextField52 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jTextField56 = new javax.swing.JTextField();
        jTextField57 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        Date = new com.toedter.calendar.JDateChooser();
        jLabel71 = new javax.swing.JLabel();
        SaveButton = new javax.swing.JButton();
        ShowData = new javax.swing.JButton();
        UpdateData = new javax.swing.JButton();
        DeleteData = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        APP = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        startNewBudget = new javax.swing.JButton();
        showbudget = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel73 = new javax.swing.JLabel();
        RemainingBudget = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Govt Budget Entry");

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel55.setText("Office equipment (3258104)  :");

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel56.setText("Other parts & equipments (3258105) :");

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel57.setText("Other building & structure (3258108) :");

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel58.setText("Health provision & water supply (3258115) :");

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel1.setText("Fitting & fixing  (3258127) :");

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel60.setText("Recurring transfers that are not classified elsewhere");

        jLabel61.setText("Land development tax (3821102)   :");

        jLabel62.setText("Municipality (3821103) :");

        jLabel63.setText("Scholarship (3821117) :");

        jLabel64.setText("Computer & Accessories  (4112202) :");

        jLabel65.setText("Engineering & other equipment (4112304)  :");

        jLabel66.setText("Office equipment  (4112310) :");

        jLabel67.setText("Education & teaching equipments (4112312) : ");

        jLabel68.setText("Furniture (4112314) :");

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel69.setText("Equipments & tools");

        jTextField48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField48ActionPerformed(evt);
            }
        });

        jLabel70.setText("Electrical installation (3258119) :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel66)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel68)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField56, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField57)
                            .addComponent(jTextField55, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField46))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField53, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(jTextField54, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel59)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel70))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField49, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(jTextField48)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel56)
                            .addComponent(jLabel55))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField44)
                            .addComponent(jTextField45)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel60)
                            .addComponent(jLabel69))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel61)
                            .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField52)
                            .addComponent(jTextField51)
                            .addComponent(jTextField50))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Cash wage & salary");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Office salary (3111101) :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Employee salary (3111201) :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Responsibility duty allowance (3111301) :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Transportation allowance (3111302) :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Education allowance (3111306) :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Hill allowance (3111309) :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("House rent allowance (3111310) :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Medical allowance (3111311) :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Tiffin allowance (3111314) :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Bleaching allowance (3111316) :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Festival allowance  (3111325) :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Overtime allowance (3111327) :");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Wax entertainment allowance (3111328):");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Honorarium (3111332) :");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Bengali new year allowance (3111335)  :");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Other allowance (3111338) :");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Administrative expenditure");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("Clear appetite (3211102) :");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Reception expenditure (3211106) :");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("Hiring charge (3211107) :");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("The cost of the law (3211110) :");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("Electricity (3211113) :");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("Water (3211115) :");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("Internet/Fax/Telex (3211117) :");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("Postal (3211119) :");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)
                            .addComponent(jTextField5)
                            .addComponent(jTextField6)
                            .addComponent(jTextField7)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField13, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField15))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel25)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField23, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField22)
                            .addComponent(jTextField24)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField18)
                            .addComponent(jTextField17)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField8)
                            .addComponent(jTextField9)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField11))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField12))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField14))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField16))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField19))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField20))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField21)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setText("Telephone (3211120) :");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setText("Promotion & advertising exp. (3211125):");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setText("Books & magazine (3211127) :");

        jTextField26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField26ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("Fee, Charge & Commission");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setText("Registration fee (3221104) :");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setText("Training");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel34.setText("Training (3231301) :");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setText("Petrol, oil & lubricant");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel36.setText("Petrol, oil & lubricant (3243101) :");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel37.setText("Gas & Fuel (3243102) :");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setText("Travel & Transfer");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel39.setText("Travel expense (3244101) :");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setText("Printing & Monihari");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel41.setText("Computer accessories (3255101) :");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel42.setText("Other Monihari (3255105) :");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel43.setText("General supplies and raw materials");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel44.setText("Chemicals (3256102) :");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel45.setText("Raw materials & Spare parts (3256105) :");

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel46.setText("Clothing (3256106) :");

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel47.setText("Sports accessories (3256107) :");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel48.setText("Professional service, honor and special expenditure");

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel49.setText("Honorariam W/O govt. emp. (3257206) :");

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel50.setText("Festival (3257301) :");

        jTextField30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField30ActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel51.setText("Repair and store");

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel52.setText("Motor vehicles (3258101) :");

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel53.setText("Furniture (3258102) :");

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel54.setText("Computer (3258103) :");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(1, 1, 1)
                                .addComponent(jTextField26))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField27))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel31)
                                .addComponent(jLabel33)
                                .addComponent(jLabel35)
                                .addComponent(jLabel38)
                                .addComponent(jLabel40)
                                .addComponent(jLabel43)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel45)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField36))
                                .addComponent(jLabel48)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel32)
                                        .addComponent(jLabel34))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField29)
                                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel36)
                                        .addComponent(jLabel37)
                                        .addComponent(jLabel39))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField32)
                                        .addComponent(jTextField31)
                                        .addComponent(jTextField30)))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel41)
                                        .addComponent(jLabel42))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField34)
                                        .addComponent(jTextField33)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel44)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel47)
                                        .addComponent(jLabel46))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField38)
                                        .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel49)
                                        .addComponent(jLabel50))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField40)
                                        .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel51))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel52)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel53)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        Date.setDateFormatString("yyyy-MM-dd");
        Date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel71.setText("Date");

        SaveButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SaveButton.setText("Save");
        SaveButton.setPreferredSize(new java.awt.Dimension(35, 30));
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        ShowData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ShowData.setText("Show Data");
        ShowData.setPreferredSize(new java.awt.Dimension(35, 30));
        ShowData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDataActionPerformed(evt);
            }
        });

        UpdateData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UpdateData.setText("Update");
        UpdateData.setPreferredSize(new java.awt.Dimension(35, 30));
        UpdateData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateDataActionPerformed(evt);
            }
        });

        DeleteData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DeleteData.setText("Delete");
        DeleteData.setPreferredSize(new java.awt.Dimension(35, 30));
        DeleteData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteDataActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout.setText("Log Out");
        logout.setPreferredSize(new java.awt.Dimension(35, 30));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        APP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        APP.setText("APP");
        APP.setPreferredSize(new java.awt.Dimension(35, 30));
        APP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                APPActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));

        startNewBudget.setBackground(new java.awt.Color(255, 51, 51));
        startNewBudget.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        startNewBudget.setText("Start New Budget");
        startNewBudget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startNewBudgetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(startNewBudget)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(startNewBudget)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        showbudget.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showbudget.setText("Show Budget");
        showbudget.setPreferredSize(new java.awt.Dimension(30, 10));
        showbudget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showbudgetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(APP, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(showbudget, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DeleteData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                        .addComponent(UpdateData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ShowData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel71)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ShowData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(showbudget, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(UpdateData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DeleteData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(APP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Code", "Procurement package", "Procurment method (Type)", "Group", "Group code", "Date", "Budget", "Revised budgets"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel73.setText("Remaining Budget :");

        RemainingBudget.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RemainingBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RemainingBudget, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField48ActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        String str1 = jTextField1.getText();
        String str2 = jTextField2.getText();
        String str3 = jTextField3.getText();
        String str4 = jTextField4.getText();
        String str5 = jTextField5.getText();
        String str6 = jTextField6.getText();
        String str7 = jTextField7.getText();
        String str8 = jTextField8.getText();
        String str9 = jTextField9.getText();
        String str10 = jTextField10.getText();
        String str11 = jTextField11.getText();
        String str12 = jTextField12.getText();
        String str13 = jTextField13.getText();
        String str14 = jTextField14.getText();
        String str15 = jTextField15.getText();
        String str16 = jTextField16.getText();
        String str17 = jTextField17.getText();
        String str18 = jTextField18.getText();
        String str19 = jTextField19.getText();
        String str20 = jTextField20.getText();
        String str21 = jTextField21.getText();
        String str22 = jTextField22.getText();
        String str23 = jTextField23.getText();
        String str24 = jTextField24.getText();
        String str25 = jTextField25.getText();
        String str26 = jTextField26.getText();
        String str27 = jTextField27.getText();
        String str28 = jTextField28.getText();
        String str29 = jTextField29.getText();
        String str30 = jTextField30.getText();
        String str31 = jTextField31.getText();
        String str32 = jTextField32.getText();
        String str33 = jTextField33.getText();
        String str34 = jTextField34.getText();
        String str35 = jTextField35.getText();
        String str36 = jTextField36.getText();
        String str37 = jTextField37.getText();
        String str38 = jTextField38.getText();
        String str39 = jTextField39.getText();
        String str40 = jTextField40.getText();
        String str41 = jTextField41.getText();
        String str42 = jTextField42.getText();
        String str43 = jTextField43.getText();
        String str44 = jTextField44.getText();
        String str45 = jTextField45.getText();
        String str46 = jTextField46.getText();
        String str47 = jTextField47.getText();
        String str48 = jTextField48.getText();
        String str49 = jTextField49.getText();
        String str50 = jTextField50.getText();
        String str51 = jTextField51.getText();
        String str52 = jTextField52.getText();
        String str53 = jTextField53.getText();
        String str54 = jTextField54.getText();
        String str55 = jTextField55.getText();
        String str56 = jTextField56.getText();
        String str57 = jTextField57.getText();
        
        
        
         
        int num1 = Integer.parseInt(str1);
        
        int num2 = Integer.parseInt(str2);
        int num3 = Integer.parseInt(str3);
        int num4 = Integer.parseInt(str4);
        int num5 = Integer.parseInt(str5);
        int num6 = Integer.parseInt(str6);
        int num7 = Integer.parseInt(str7);
        int num8 = Integer.parseInt(str8);
        int num9 = Integer.parseInt(str9);
        int num10 = Integer.parseInt(str10);
        int num11 = Integer.parseInt(str11);
        int num12 = Integer.parseInt(str12);
        int num13 = Integer.parseInt(str13);
        int num14 = Integer.parseInt(str14);
        int num15 = Integer.parseInt(str15);
        int num16 = Integer.parseInt(str16);
        int num17 = Integer.parseInt(str17);
        int num18 = Integer.parseInt(str18);
        int num19 = Integer.parseInt(str19);
        int num20 = Integer.parseInt(str20);
        int num21 = Integer.parseInt(str21);
        int num22 = Integer.parseInt(str22);
        int num23 = Integer.parseInt(str23);
        int num24 = Integer.parseInt(str24);
        int num25 = Integer.parseInt(str25);
        int num26 = Integer.parseInt(str26);
        int num27 = Integer.parseInt(str27);
        int num28 = Integer.parseInt(str28);
        int num29 = Integer.parseInt(str29);
        int num30 = Integer.parseInt(str30);
        int num31 = Integer.parseInt(str31);
        int num32 = Integer.parseInt(str32);
        int num33 = Integer.parseInt(str33);
        int num34 = Integer.parseInt(str34);
        int num35 = Integer.parseInt(str35);
        int num36 = Integer.parseInt(str36);
        int num37 = Integer.parseInt(str37);
        int num38 = Integer.parseInt(str38);
        int num39 = Integer.parseInt(str39);
        int num40 = Integer.parseInt(str40);
        int num41 = Integer.parseInt(str41);
        int num42 = Integer.parseInt(str42);
        int num43 = Integer.parseInt(str43);
        int num44 = Integer.parseInt(str44);
        int num45 = Integer.parseInt(str45);
        int num46 = Integer.parseInt(str46);
        int num47 = Integer.parseInt(str47);
        int num48 = Integer.parseInt(str48);
        int num49 = Integer.parseInt(str49);
        int num50 = Integer.parseInt(str50);
        int num51 = Integer.parseInt(str51);
        int num52 = Integer.parseInt(str52);
        int num53 = Integer.parseInt(str53);
        int num54 = Integer.parseInt(str54);
        int num55 = Integer.parseInt(str55);
        int num56 = Integer.parseInt(str56);
        int num57 = Integer.parseInt(str57);
        
       
     
        String Entry_date = ((JTextField) Date.getDateEditor().getUiComponent()).getText();
        String NORMAL_procurment_method = "Others";
        int revised_bud = 0;
        /*String OTM_procurment_method = "OTM";
        String RFQ_procurment_method = "RFQ"; 
        String DP_procurment_method = "DP";*/
        
        int group_code1= 3111;
         code1 = 3111101;
         code2 = 3111201;
         code3 = 3111301;
         code4 = 3111302;
         code5 = 3111306;
         code6 = 3111309;
         code7 = 3111310;
         code8 = 3111311;
         code9 = 3111314;
         code10 = 3111316;
         code11 = 3111325;
         code12 = 3111327;
         code13 = 3111328;
         code14 = 3111332;
         code15 = 3111335;
         code16 = 3111338;
        
        int group_code2= 3211;
         code17 = 3211102;
         code18 = 3211106;
         code19 = 3211107;
         code20 = 3211110;
         code21 = 3211113;
         code22 = 3211115;
         code23 = 3211117;
         code24 = 3211119;
         code25 = 3211120;
         code26 = 3211125;
         code27 = 3211127;
        
        int group_code3= 3221;
         code28 = 3221104;
        
        int group_code4= 3231;
         code29 = 3231301;
        
        int group_code5= 3243;
         code30 = 3243101;
         code31 = 3243102;
        
        int group_code6= 3244;
         code32 = 3244101;
        
        int group_code7= 3255;
         code33 = 3255101;
         code34 = 3255105;
        
        int group_code8= 3256;
         code35 = 3256102;
         code36 = 3256105;
         code37 = 3256106;
         code38 = 3256107;
        
        int group_code9= 3257;
         code39 = 3257206;
         code40 = 3257301;

        int group_code10= 3258;
         code41 = 3258101;
         code42 = 3258102;
         code43 = 3258103;
         code44 = 3258104;
         code45 = 3258105;
         code46 = 3258108;
         code47 = 3258115;
         code48 = 3258119;
         code49 = 3258127;
        
        int group_code11= 3821;
         code50 = 3821102;
         code51 = 3821103;
         code52 = 3821117;
        
        int group_code12= 4112;
         code53 = 4112202;
         code54 = 4112304;
         code55 = 4112310;
         code56 = 4112312;
         code57 = 4112314;
        
       
        String cash_wage_and_salary = "Cash wage & salary";
        String procurment_package1 = "Office salary";
        String procurment_package2 = "Employee salary";
        String procurment_package3 = "Responsibility duty allowance";
        String procurment_package4 = "Transportation allowance";
        String procurment_package5 = "Educational allowance";
        String procurment_package6 = "Hill allowance";
        String procurment_package7 = "House rent allowance";
        String procurment_package8 = "Medical allowance";
        String procurment_package9 = "Tiffin allowance";
        String procurment_package10 = "Bleaching allowance";
        String procurment_package11 = "Festival allowance";
        String procurment_package12 = "Overtime allowance";
        String procurment_package13 = "Wax entertainment allowance";
        String procurment_package14 = "Honorarium";
        String procurment_package15 = "Bengali new year allowance";
        String procurment_package16 = "Other allowance";
        
        String administrative_expenditure = "Administrative expenditure";
        String procurment_package17 = "Clear appetite";
        String procurment_package18 = "Reception expenditure";
        String procurment_package19 = "Hiring charge";
        String procurment_package20 = "The cost of the law";
        String procurment_package21 = "Electricity";
        String procurment_package22 = "Water";
        String procurment_package23 = "Internet/Fax/Telex";
        String procurment_package24 = "Postal";
        String procurment_package25 = "Telephone";
        String procurment_package26 = "Promotion and advertising expences";
        String procurment_package27 = "Books and magazine";
        
        String fee_charge_and_commission = "Fee charge and commission";
        String procurment_package28 = "Registration fee";
        
        String Training = "Training";
        String procurment_package29 = "Training";
        
        String Petrol_oil_and_lubricant = "Petrol oil and lubricant";
        String procurment_package30 = "petrol oil and lubricant";
        String procurment_package31 = "Gas and fuel";
        
        String Travel_and_Transfer = "Travel and transfer";
        String procurment_package32 = "Travel expense";
        
        String Printing_and_monihari = "Printing and monihari";
        String procurment_package33 = "Computer accessories";
        String procurment_package34 = "Other monihari";
        
        String General_supplies_and_raw_materials = "General supplies and raw materials";
        String procurment_package35 = "Chemicals";
        String procurment_package36 = "raw materials and spare parts";
        String procurment_package37 = "Clothing";
        String procurment_package38 = "Sports accessories";
        
        String Professional_service_honor_and_spacial_expenditure = "Professional service honor and spacial expenditure";
        String procurment_package39 = "Honorariam without govt. employee";
        String procurment_package40 = "Festival";
        
        String Repair_and_store = "Repair and store";
        String procurment_package41 = "Motor vehicles";
        String procurment_package42 = "Furniture";
        String procurment_package43 = "Computer";
        String procurment_package44 = "office equipment";
        String procurment_package45 = "Other parts and equipments";
        String procurment_package46 = "Other building and structure";
        String procurment_package47 = "Health provision and water supply";
        String procurment_package48 = "Electrical installation";
        String procurment_package49 = "Fitting and fixing";
        
        String Recuring_tranfers_that_are_not_classified_elsewhere = "Recuring tranfers that are not classified elsewhere";
        String procurment_package50 = "Land development tax";
        String procurment_package51 = "Municipality";
        String procurment_package52 = "Scholarship";
        
        String Equipments_and_tools = "Equipments and tools";
        String procurment_package53 = "Computer and accessories";
        String procurment_package54 = "Engineering and other equipment";
        String procurment_package55 = "Office equipment";
        String procurment_package56 = "Educational and teaching equipments";
        String procurment_package57 = "Furniture";
        
        
        
      
        try {
            
            /// Cash-wage-and-salary
            /// 1-16
            String sql = "insert into budgettable values ('" + code1 + "','" + procurment_package1 + "','" + NORMAL_procurment_method + "','" + cash_wage_and_salary + "','" + group_code1 + "','" + Entry_date + "','" + num1 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql);
            pst.execute();
               
            String sql1 = "insert into budgettable values ('" + code2 + "','" + procurment_package2 + "','" + NORMAL_procurment_method + "','" + cash_wage_and_salary + "','" + group_code1 + "','" + Entry_date + "','" + num2 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql1);
            pst.execute();
               
            String sql2 = "insert into budgettable values ('" + code3 + "','" + procurment_package3 + "','" + NORMAL_procurment_method + "','" + cash_wage_and_salary + "','" + group_code1 + "','" + Entry_date + "','" + num3 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql2);
            pst.execute();
            
            String sql3 = "insert into budgettable values ('" + code4 + "','" + procurment_package4 + "','" + NORMAL_procurment_method + "','" + cash_wage_and_salary + "','" + group_code1 + "','" + Entry_date + "','" + num4 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql3);
            pst.execute();
               
            String sql4 = "insert into budgettable values ('" + code5 + "','" + procurment_package5 + "','" + NORMAL_procurment_method + "','" + cash_wage_and_salary + "','" + group_code1 + "','" + Entry_date + "','" + num5 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql4);
            pst.execute();
               
            String sql5 = "insert into budgettable values ('" + code6 + "','" + procurment_package6 + "','" + NORMAL_procurment_method + "','" + cash_wage_and_salary + "','" + group_code1 + "','" + Entry_date + "','" + num6 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql5);
            pst.execute();
            
            String sql6 = "insert into budgettable values ('" + code7 + "','" + procurment_package7 + "','" + NORMAL_procurment_method + "','" + cash_wage_and_salary + "','" + group_code1 + "','" + Entry_date + "','" + num7 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql6);
            pst.execute();
               
            String sql7 = "insert into budgettable values ('" + code8 + "','" + procurment_package8 + "','" + NORMAL_procurment_method + "','" + cash_wage_and_salary + "','" + group_code1 + "','" + Entry_date + "','" + num8 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql7);
            pst.execute();
               
            String sql8 = "insert into budgettable values ('" + code9 + "','" + procurment_package9 + "','" + NORMAL_procurment_method + "','" + cash_wage_and_salary + "','" + group_code1 + "','" + Entry_date + "','" + num9 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql8);
            pst.execute();
            String sql9 = "insert into budgettable values ('" + code10 + "','" + procurment_package10 + "','" + NORMAL_procurment_method + "','" + cash_wage_and_salary + "','" + group_code1 + "','" + Entry_date + "','" + num10 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql9);
            pst.execute();
               
            String sql10 = "insert into budgettable values ('" + code11 + "','" + procurment_package11 + "','" + NORMAL_procurment_method + "','" + cash_wage_and_salary + "','" + group_code1 + "','" + Entry_date + "','" + num11 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql10);
            pst.execute();
               
            String sql11 = "insert into budgettable values ('" + code12 + "','" + procurment_package12 + "','" + NORMAL_procurment_method + "','" + cash_wage_and_salary + "','" + group_code1 + "','" + Entry_date + "','" + num12 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql11);
            pst.execute();
            String sql12 = "insert into budgettable values ('" + code13 + "','" + procurment_package13 + "','" + NORMAL_procurment_method + "','" + cash_wage_and_salary + "','" + group_code1 + "','" + Entry_date + "','" + num13 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql12);
            pst.execute();
               
            String sql13 = "insert into budgettable values ('" + code14 + "','" + procurment_package14 + "','" + NORMAL_procurment_method + "','" + cash_wage_and_salary + "','" + group_code1 + "','" + Entry_date + "','" + num14 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql13);
            pst.execute();
               
            String sql14 = "insert into budgettable values ('" + code15 + "','" + procurment_package15 + "','" + NORMAL_procurment_method + "','" + cash_wage_and_salary + "','" + group_code1 + "','" + Entry_date + "','" + num15 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql14);
            pst.execute();
            
            String sql15 = "insert into budgettable values ('" + code16 + "','" + procurment_package16 + "','" + NORMAL_procurment_method + "','" + cash_wage_and_salary + "','" + group_code1 + "','" + Entry_date + "','" + num16 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql15);
            pst.execute();
               
            /// Administrative expenditure
            /// 17-27
            
            
            String sql16 = "insert into budgettable values ('" + code17 + "','" + procurment_package17 + "','" + NORMAL_procurment_method + "','" + administrative_expenditure + "','" + group_code2 + "','" + Entry_date + "','" + num17 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql16);
            pst.execute();
               
            String sql17 = "insert into budgettable values ('" + code18 + "','" + procurment_package18 + "','" + NORMAL_procurment_method + "','" + administrative_expenditure + "','" + group_code2 + "','" + Entry_date + "','" + num18 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql17);
            pst.execute();
               
            String sql18 = "insert into budgettable values ('" + code19 + "','" + procurment_package19 + "','" + NORMAL_procurment_method + "','" + administrative_expenditure + "','" + group_code2 + "','" + Entry_date + "','" + num19 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql18);
            pst.execute();
            String sql19 = "insert into budgettable values ('" + code20 + "','" + procurment_package20 + "','" + NORMAL_procurment_method + "','" + administrative_expenditure + "','" + group_code2 + "','" + Entry_date + "','" + num20 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql19);
            pst.execute();
               
            String sql20 = "insert into budgettable values ('" + code21 + "','" + procurment_package21 + "','" + NORMAL_procurment_method + "','" + administrative_expenditure + "','" + group_code2 + "','" + Entry_date + "','" + num21 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql20);
            pst.execute();
               
            String sql21 = "insert into budgettable values ('" + code22 + "','" + procurment_package22 + "','" + NORMAL_procurment_method + "','" + administrative_expenditure + "','" + group_code2 + "','" + Entry_date + "','" + num22 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql21);
            pst.execute();
            
            String sql22 = "insert into budgettable values ('" + code23 + "','" + procurment_package23 + "','" + NORMAL_procurment_method + "','" + administrative_expenditure + "','" + group_code2 + "','" + Entry_date + "','" + num23 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql22);
            pst.execute();
            
            String sql23 = "insert into budgettable values ('" + code24 + "','" + procurment_package24 + "','" + NORMAL_procurment_method + "','" + administrative_expenditure + "','" + group_code2 + "','" + Entry_date + "','" + num24 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql23);
            pst.execute();
               
            String sql24 = "insert into budgettable values ('" + code25 + "','" + procurment_package25 + "','" + NORMAL_procurment_method + "','" + administrative_expenditure + "','" + group_code2 + "','" + Entry_date + "','" + num25 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql24);
            pst.execute();
            String sql25 = "insert into budgettable values ('" + code26 + "','" + procurment_package26 + "','" + NORMAL_procurment_method + "','" + administrative_expenditure + "','" + group_code2 + "','" + Entry_date + "','" + num26 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql25);
            pst.execute();
               
            String sql26 = "insert into budgettable values ('" + code27 + "','" + procurment_package27 + "','" + NORMAL_procurment_method + "','" + administrative_expenditure + "','" + group_code2 + "','" + Entry_date + "','" + num27 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql26);
            pst.execute();
               
            /// fee_charge_and_commission
            /// 28
            
            String sql27 = "insert into budgettable values ('" + code28 + "','" + procurment_package28 + "','" + NORMAL_procurment_method + "','" + fee_charge_and_commission + "','" + group_code3 + "','" + Entry_date + "','" + num28 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql27);
            pst.execute();
            
            /// Training
            /// 29
            
            String sql28 = "insert into budgettable values ('" + code29 + "','" + procurment_package29 + "','" + NORMAL_procurment_method + "','" + Training + "','" + group_code4 + "','" + Entry_date + "','" + num29 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql28);
            pst.execute();
            
            /// Petrol, Oil and Lubricant
            /// 30-31
            
            String sql29 = "insert into budgettable values ('" + code30 + "','" + procurment_package30 + "','" + NORMAL_procurment_method + "','" + Petrol_oil_and_lubricant + "','" + group_code5 + "','" + Entry_date + "','" + num30 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql29);
            pst.execute();
            
            
            String sql30 = "insert into budgettable values ('" + code31 + "','" + procurment_package31 + "','" + NORMAL_procurment_method + "','" + Petrol_oil_and_lubricant + "','" + group_code5 + "','" + Entry_date + "','" + num31 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql30);
            pst.execute();
            
            /// Travel and Transfer
            /// 32
            
            String sql31 = "insert into budgettable values ('" + code32 + "','" + procurment_package32 + "','" + NORMAL_procurment_method + "','" + Travel_and_Transfer + "','" + group_code6 + "','" + Entry_date + "','" + num32 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql31);
            pst.execute();
            
            /// Printing and monihari
            /// 33-34
            
            String sql32 = "insert into budgettable values ('" + code33 + "','" + procurment_package33 + "','" + NORMAL_procurment_method + "','" + Printing_and_monihari + "','" + group_code7 + "','" + Entry_date + "','" + num33 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql32);
            pst.execute();
           
            String sql33 = "insert into budgettable values ('" + code34 + "','" + procurment_package34 + "','" + NORMAL_procurment_method + "','" + Printing_and_monihari + "','" + group_code7 + "','" + Entry_date + "','" + num34 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql33);
            pst.execute();
            
            /// General supplies and raw materials
            /// 35-38
            
            String sql34 = "insert into budgettable values ('" + code35 + "','" + procurment_package35 + "','" + NORMAL_procurment_method + "','" + General_supplies_and_raw_materials + "','" + group_code8 + "','" + Entry_date + "','" + num35 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql34);
            pst.execute();
            
            String sql35 = "insert into budgettable values ('" + code36 + "','" + procurment_package36 + "','" + NORMAL_procurment_method + "','" + General_supplies_and_raw_materials + "','" + group_code8 + "','" + Entry_date + "','" + num36 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql35);
            pst.execute();
            
            String sql36 = "insert into budgettable values ('" + code37 + "','" + procurment_package37 + "','" + NORMAL_procurment_method + "','" + General_supplies_and_raw_materials + "','" + group_code8 + "','" + Entry_date + "','" + num37 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql36);
            pst.execute();
            
            String sql37 = "insert into budgettable values ('" + code38 + "','" + procurment_package38 + "','" + NORMAL_procurment_method + "','" + General_supplies_and_raw_materials + "','" + group_code8 + "','" + Entry_date + "','" + num38 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql37);
            pst.execute();
            
            ///  Professional service honor and spacial expenditure
            /// 39-40
            String sql38 = "insert into budgettable values ('" + code39 + "','" + procurment_package39 + "','" + NORMAL_procurment_method + "','" + Professional_service_honor_and_spacial_expenditure + "','" + group_code9 + "','" + Entry_date + "','" + num39 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql38);
            pst.execute();
            
            String sql39 = "insert into budgettable values ('" + code40 + "','" + procurment_package40 + "','" + NORMAL_procurment_method + "','" + Professional_service_honor_and_spacial_expenditure + "','" + group_code9 + "','" + Entry_date + "','" + num40 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql39);
            pst.execute();
            
            /// Repair and store
            /// 41-49
            
            String sql40 = "insert into budgettable values ('" + code41 + "','" + procurment_package41 + "','" + NORMAL_procurment_method + "','" + Repair_and_store + "','" + group_code10 + "','" + Entry_date + "','" + num41 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql40);
            pst.execute();
            
            String sql41 = "insert into budgettable values ('" + code42 + "','" + procurment_package42 + "','" + NORMAL_procurment_method + "','" + Repair_and_store + "','" + group_code10 + "','" + Entry_date + "','" + num42 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql41);
            pst.execute();
            
            String sql42 = "insert into budgettable values ('" + code43 + "','" + procurment_package43 + "','" + NORMAL_procurment_method + "','" + Repair_and_store + "','" + group_code10 + "','" + Entry_date + "','" + num43 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql42);
            pst.execute();
            
            String sql43 = "insert into budgettable values ('" + code44 + "','" + procurment_package44 + "','" + NORMAL_procurment_method + "','" + Repair_and_store + "','" + group_code10 + "','" + Entry_date + "','" + num44 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql43);
            pst.execute();
            
            String sql44 = "insert into budgettable values ('" + code45 + "','" + procurment_package45 + "','" + NORMAL_procurment_method + "','" + Repair_and_store + "','" + group_code10 + "','" + Entry_date + "','" + num45 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql44);
            pst.execute();
            
            String sql45 = "insert into budgettable values ('" + code46 + "','" + procurment_package46 + "','" + NORMAL_procurment_method + "','" + Repair_and_store + "','" + group_code10 + "','" + Entry_date + "','" + num46 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql45);
            pst.execute();
            
            String sql46 = "insert into budgettable values ('" + code47 + "','" + procurment_package47 + "','" + NORMAL_procurment_method + "','" + Repair_and_store + "','" + group_code10 + "','" + Entry_date + "','" + num47 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql46);
            pst.execute();
            
            String sql47 = "insert into budgettable values ('" + code48 + "','" + procurment_package48 + "','" + NORMAL_procurment_method + "','" + Repair_and_store + "','" + group_code10 + "','" + Entry_date + "','" + num48 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql47);
            pst.execute();
            
            String sql48 = "insert into budgettable values ('" + code49 + "','" + procurment_package49 + "','" + NORMAL_procurment_method + "','" + Repair_and_store + "','" + group_code10 + "','" + Entry_date + "','" + num49 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql48);
            pst.execute();
            
            /// Recuring tranfers that are not classified elsewhere
            /// 50-52
            
            String sql49 = "insert into budgettable values ('" + code50 + "','" + procurment_package50 + "','" + NORMAL_procurment_method + "','" + Recuring_tranfers_that_are_not_classified_elsewhere + "','" + group_code11 + "','" + Entry_date + "','" + num50 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql49);
            pst.execute();
            
            String sql50 = "insert into budgettable values ('" + code51 + "','" + procurment_package51 + "','" + NORMAL_procurment_method + "','" + Recuring_tranfers_that_are_not_classified_elsewhere + "','" + group_code11 + "','" + Entry_date + "','" + num51 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql50);
            pst.execute();
            
           
            String sql51 = "insert into budgettable values ('" + code52 + "','" + procurment_package52 + "','" + NORMAL_procurment_method + "','" + Recuring_tranfers_that_are_not_classified_elsewhere + "','" + group_code11 + "','" + Entry_date + "','" + num52 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql51);
            pst.execute();
            
            ///Equipments and tools
            /// 53-57
            
            
            String sql52 = "insert into budgettable values ('" + code53 + "','" + procurment_package53 + "','" + NORMAL_procurment_method + "','" + Equipments_and_tools + "','" + group_code12 + "','" + Entry_date + "','" + num53 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql52);
            pst.execute();
            
            String sql53 = "insert into budgettable values ('" + code54 + "','" + procurment_package54 + "','" + NORMAL_procurment_method + "','" + Equipments_and_tools + "','" + group_code12 + "','" + Entry_date + "','" + num54 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql53);
            pst.execute();
            
            String sql54 = "insert into budgettable values ('" + code55 + "','" + procurment_package55 + "','" + NORMAL_procurment_method + "','" + Equipments_and_tools + "','" + group_code12 + "','" + Entry_date + "','" + num55 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql54);
            pst.execute();
            
            String sql55 = "insert into budgettable values ('" + code56 + "','" + procurment_package56 + "','" + NORMAL_procurment_method + "','" + Equipments_and_tools + "','" + group_code12 + "','" + Entry_date + "','" + num56 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql55);
            pst.execute();
            
            String sql56 = "insert into budgettable values ('" + code57 + "','" + procurment_package57 + "','" + NORMAL_procurment_method + "','" + Equipments_and_tools + "','" + group_code12 + "','" + Entry_date + "','" + num57 + "','" + revised_bud + "')";
            pst = con.prepareStatement(sql56);
            pst.execute();

            }
        
        
        catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Database Error");
        }
        remaining_budget();
        
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void jTextField26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField26ActionPerformed

    private void jTextField30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField30ActionPerformed

    private void ShowDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowDataActionPerformed
        try {
            String ShowData = "Select * from budgettable";
            pst = con.prepareStatement(ShowData);
            //pst.setString(1, (String) Combo_2.getSelectedItem());
            rs = pst.executeQuery();

            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(80);
            /*int RowCount = jTable1.getRowCount();
            int sum = 0;
            for (int i = 0; i < RowCount; i++) {
                sum = sum + Integer.parseInt(jTable1.getValueAt(i, 6).toString());

            }*/
            //TotalBudget.setText(String.valueOf(sum));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Data Show Error");
        }
        remaining_budget();
    }//GEN-LAST:event_ShowDataActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Login login = new Login();
        login.show();
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void DeleteDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteDataActionPerformed
        int r = JOptionPane.showConfirmDialog(null, "Do you really want to delete", "Delete", JOptionPane.YES_NO_OPTION);
        if (r == 0) {
            try {
                String sql = "delete from budgettable Where CODE='" + num58 + "'";
                pst = con.prepareStatement(sql);
                pst.execute();
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.removeRow(jTable1.getSelectedRow());

            } catch (Exception ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        remaining_budget();
    }//GEN-LAST:event_DeleteDataActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            int row = jTable1.getSelectedRow();
            table_Click = (jTable1.getModel().getValueAt(row, 0).toString());
            table_Click1 = (jTable1.getModel().getValueAt(row, 1).toString());
            table_Click2 = (jTable1.getModel().getValueAt(row, 2).toString());
            table_Click3 = (jTable1.getModel().getValueAt(row, 3).toString());
            table_Click4 = (jTable1.getModel().getValueAt(row, 4).toString());
            table_Click5 = (jTable1.getModel().getValueAt(row, 5).toString());
            table_Click6 = (jTable1.getModel().getValueAt(row, 6).toString());
            
            
            num58 = Integer.parseInt(table_Click);
            ((JTextField) Date.getDateEditor().getUiComponent()).setText(table_Click5);
            codenumber= num58;
            clearTextfield();
            if( codenumber == 3111101)
               jTextField1.setText(table_Click6);
                
            else if(codenumber == 3111201)
                jTextField2.setText(table_Click6);
            else if(codenumber == 3111301)
                jTextField3.setText(table_Click6);
            else if(codenumber == 3111302)
                jTextField4.setText(table_Click6);
            else if(codenumber == 3111306)
                jTextField5.setText(table_Click6);
            else if(codenumber == 3111309)
                jTextField6.setText(table_Click6);
            else if(codenumber == 3111310)
                jTextField7.setText(table_Click6);
            else if(codenumber == 3111311)
                jTextField8.setText(table_Click6);
            else if(codenumber == 3111314)
                jTextField9.setText(table_Click6);
            else if(codenumber == 3111316)
                jTextField10.setText(table_Click6);
            else if(codenumber == 3111325)
                jTextField11.setText(table_Click6);
            else if(codenumber == 3111327)
                jTextField12.setText(table_Click6);
            else if(codenumber == 3111328)
                jTextField13.setText(table_Click6);
            else if(codenumber == 3111332)
                jTextField14.setText(table_Click6);
            else if(codenumber == 3111335)
                jTextField15.setText(table_Click6);
            else if(codenumber == 3111338)
                jTextField16.setText(table_Click6);
            else if(codenumber == 3211102)
                jTextField17.setText(table_Click6);
            else if(codenumber == 3211106)
                jTextField18.setText(table_Click6);
            else if(codenumber == 3211107)
                jTextField19.setText(table_Click6);
            else if(codenumber == 3211110)
                jTextField20.setText(table_Click6);
            else if(codenumber == 3211113)
                jTextField21.setText(table_Click6);
            else if(codenumber == 3211115)
                jTextField22.setText(table_Click6);
            else if(codenumber == 3211117)
                jTextField23.setText(table_Click6);
            else if(codenumber == 3211119)
                jTextField24.setText(table_Click6);
            else if(codenumber == 3211120)
                jTextField25.setText(table_Click6);
            else if(codenumber == 3211125)
                jTextField26.setText(table_Click6);
            else if(codenumber == 3211127)
                jTextField27.setText(table_Click6);
            else if(codenumber == 3221104)
                jTextField28.setText(table_Click6);
            else if(codenumber == 3231301)
                jTextField29.setText(table_Click6);
            else if(codenumber == 3243101)
                jTextField30.setText(table_Click6);
            else if(codenumber == 3243102)
                jTextField31.setText(table_Click6);
            else if(codenumber == 3244101)
                jTextField32.setText(table_Click6);
            else if(codenumber == 3255101)
                jTextField33.setText(table_Click6);
            else if(codenumber == 3255105)
                jTextField34.setText(table_Click6);
            else if(codenumber == 3256102)
                jTextField35.setText(table_Click6);
            else if(codenumber == 3256105)
                jTextField36.setText(table_Click6);
            else if(codenumber == 3256106)
                jTextField37.setText(table_Click6);
            else if(codenumber == 3256107)
                jTextField38.setText(table_Click6);
            else if(codenumber == 3257206)
                jTextField39.setText(table_Click6);
            else if(codenumber == 3257301)
                jTextField40.setText(table_Click6);
            else if(codenumber == 3258101)
                jTextField41.setText(table_Click6);
            else if(codenumber == 3258102)
                jTextField42.setText(table_Click6);
            else if(codenumber == 3258103)
                jTextField43.setText(table_Click6);
            else if(codenumber == 3258104)
                jTextField44.setText(table_Click6);
            else if(codenumber == 3258105)
                jTextField45.setText(table_Click6);
            else if(codenumber == 3258108)
                jTextField46.setText(table_Click6);
            else if(codenumber == 3258115)
                jTextField47.setText(table_Click6);
            else if(codenumber == 3258119)
                jTextField48.setText(table_Click6);
            else if(codenumber == 3258127)
                jTextField49.setText(table_Click6);
            else if(codenumber == 3821102)
                jTextField50.setText(table_Click6);
            else if(codenumber == 3821103)
                jTextField51.setText(table_Click6);
            else if(codenumber == 3821117)
                jTextField52.setText(table_Click6);
            else if(codenumber == 4112202)
                jTextField53.setText(table_Click6);
            else if(codenumber == 4112304)
                jTextField54.setText(table_Click6);
            else if(codenumber == 4112310)
                jTextField55.setText(table_Click6);
            else if(codenumber == 4112312)
                jTextField56.setText(table_Click6);
            else if(codenumber == 4112314)
                jTextField57.setText(table_Click6);
            
            

        } catch (Exception e) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void UpdateDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateDataActionPerformed
        int q = JOptionPane.showConfirmDialog(null, "Do you really want to update", "Update", JOptionPane.YES_NO_OPTION);
        
            if( codenumber == 3111101)
              updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField1.getText());    
            else if(codenumber == 3111201)
               updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField2.getText()); 
            else if(codenumber == 3111301)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField3.getText()); 
            else if(codenumber == 3111302)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField4.getText()); 
            else if(codenumber == 3111306)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField5.getText()); 
            else if(codenumber == 3111309)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField6.getText()); 
            else if(codenumber == 3111310)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField7.getText()); 
            else if(codenumber == 3111311)
               updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField8.getText()); 
            else if(codenumber == 3111314)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField9.getText()); 
            else if(codenumber == 3111316)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField10.getText()); 
            else if(codenumber == 3111325)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField11.getText()); 
            else if(codenumber == 3111327)
               updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField12.getText()); 
            else if(codenumber == 3111328)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField13.getText()); 
            else if(codenumber == 3111332)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField14.getText()); 
            else if(codenumber == 3111335)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField15.getText()); 
            else if(codenumber == 3111338)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField16.getText()); 
            else if(codenumber == 3211102)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField17.getText()); 
            else if(codenumber == 3211106)
               updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField18.getText()); 
            else if(codenumber == 3211107)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField19.getText()); 
            else if(codenumber == 3211110)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField20.getText()); 
            else if(codenumber == 3211113)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField21.getText()); 
            else if(codenumber == 3211115)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField22.getText()); 
            else if(codenumber == 3211117)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField23.getText()); 
            else if(codenumber == 3211119)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField24.getText()); 
            else if(codenumber == 3211120)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField25.getText()); 
            else if(codenumber == 3211125)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField26.getText()); 
            else if(codenumber == 3211127)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField27.getText()); 
            else if(codenumber == 3221104)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField28.getText()); 
            else if(codenumber == 3231301)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField29.getText()); 
            else if(codenumber == 3243101)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField30.getText()); 
            else if(codenumber == 3243102)
               updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField31.getText()); 
            else if(codenumber == 3244101)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField32.getText()); 
            else if(codenumber == 3255101)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField33.getText()); 
            else if(codenumber == 3255105)
               updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField34.getText()); 
            else if(codenumber == 3256102)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField35.getText()); 
            else if(codenumber == 3256105)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField36.getText()); 
            else if(codenumber == 3256106)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField37.getText()); 
            else if(codenumber == 3256107)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField38.getText()); 
            else if(codenumber == 3257206)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField39.getText()); 
            else if(codenumber == 3257301)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField40.getText()); 
            else if(codenumber == 3258101)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField41.getText()); 
            else if(codenumber == 3258102)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField42.getText()); 
            else if(codenumber == 3258103)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField43.getText()); 
            else if(codenumber == 3258104)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField44.getText()); 
            else if(codenumber == 3258105)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField45.getText()); 
            else if(codenumber == 3258108)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField46.getText()); 
            else if(codenumber == 3258115)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField47.getText()); 
            else if(codenumber == 3258119)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField48.getText()); 
            else if(codenumber == 3258127)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField49.getText()); 
            else if(codenumber == 3821102)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField50.getText()); 
            else if(codenumber == 3821103)
               updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField51.getText()); 
            else if(codenumber == 3821117)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField52.getText()); 
            else if(codenumber == 4112202)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField53.getText()); 
            else if(codenumber == 4112304)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField54.getText()); 
            else if(codenumber == 4112310)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField55.getText()); 
            else if(codenumber == 4112312)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField56.getText()); 
            else if(codenumber == 4112314)
                updateValue= Integer.parseInt(table_Click6) + Integer.parseInt(jTextField57.getText()); 
            
            
       /*     if( codenumber == 3111101)
              updateValue= new BigInteger(jTextField1.getText());    
            else if(codenumber == 3111201)
               updateValue= new BigInteger(jTextField2.getText()); 
            else if(codenumber == 3111301)
                updateValue= new BigInteger(jTextField3.getText()); 
            else if(codenumber == 3111302)
                updateValue= new BigInteger(jTextField4.getText()); 
            else if(codenumber == 3111306)
                updateValue= new BigInteger(jTextField5.getText()); 
            else if(codenumber == 3111309)
                updateValue= new BigInteger(jTextField6.getText()); 
            else if(codenumber == 3111310)
                updateValue= new BigInteger(jTextField7.getText()); 
            else if(codenumber == 3111311)
               updateValue= new BigInteger(jTextField8.getText()); 
            else if(codenumber == 3111314)
                updateValue= new BigInteger(jTextField9.getText()); 
            else if(codenumber == 3111316)
                updateValue= new BigInteger(jTextField10.getText()); 
            else if(codenumber == 3111325)
                updateValue= new BigInteger(jTextField11.getText()); 
            else if(codenumber == 3111327)
               updateValue= new BigInteger(jTextField12.getText()); 
            else if(codenumber == 3111328)
                updateValue= new BigInteger(jTextField13.getText()); 
            else if(codenumber == 3111332)
                updateValue= new BigInteger(jTextField14.getText()); 
            else if(codenumber == 3111335)
                updateValue= new BigInteger(jTextField15.getText()); 
            else if(codenumber == 3111338)
                updateValue= new BigInteger(jTextField16.getText()); 
            else if(codenumber == 3211102)
                updateValue= new BigInteger(jTextField17.getText()); 
            else if(codenumber == 3211106)
               updateValue= new BigInteger(jTextField18.getText()); 
            else if(codenumber == 3211107)
                updateValue= new BigInteger(jTextField19.getText()); 
            else if(codenumber == 3211110)
                updateValue= new BigInteger(jTextField20.getText()); 
            else if(codenumber == 3211113)
                updateValue= new BigInteger(jTextField21.getText()); 
            else if(codenumber == 3211115)
                updateValue= new BigInteger(jTextField22.getText()); 
            else if(codenumber == 3211117)
                updateValue= new BigInteger(jTextField23.getText()); 
            else if(codenumber == 3211119)
                updateValue= new BigInteger(jTextField24.getText()); 
            else if(codenumber == 3211120)
                updateValue= new BigInteger(jTextField25.getText()); 
            else if(codenumber == 3211125)
                updateValue= new BigInteger(jTextField26.getText()); 
            else if(codenumber == 3211127)
                updateValue= new BigInteger(jTextField27.getText()); 
            else if(codenumber == 3221104)
                updateValue= new BigInteger(jTextField28.getText()); 
            else if(codenumber == 3231301)
                updateValue= new BigInteger(jTextField29.getText()); 
            else if(codenumber == 3243101)
                updateValue= new BigInteger(jTextField30.getText()); 
            else if(codenumber == 3243102)
               updateValue= new BigInteger(jTextField31.getText()); 
            else if(codenumber == 3244101)
                updateValue= new BigInteger(jTextField32.getText()); 
            else if(codenumber == 3255101)
                updateValue= new BigInteger(jTextField33.getText()); 
            else if(codenumber == 3255105)
               updateValue= new BigInteger(jTextField34.getText()); 
            else if(codenumber == 3256102)
                updateValue= new BigInteger(jTextField35.getText()); 
            else if(codenumber == 3256105)
                updateValue= new BigInteger(jTextField36.getText()); 
            else if(codenumber == 3256106)
                updateValue= new BigInteger(jTextField37.getText()); 
            else if(codenumber == 3256107)
                updateValue= new BigInteger(jTextField38.getText()); 
            else if(codenumber == 3257206)
                updateValue= new BigInteger(jTextField39.getText()); 
            else if(codenumber == 3257301)
                updateValue= new BigInteger(jTextField40.getText()); 
            else if(codenumber == 3258101)
                updateValue= new BigInteger(jTextField41.getText()); 
            else if(codenumber == 3258102)
                updateValue= new BigInteger(jTextField42.getText()); 
            else if(codenumber == 3258103)
                updateValue= new BigInteger(jTextField43.getText()); 
            else if(codenumber == 3258104)
                updateValue= new BigInteger(jTextField44.getText()); 
            else if(codenumber == 3258105)
                updateValue= new BigInteger(jTextField45.getText()); 
            else if(codenumber == 3258108)
                updateValue= new BigInteger(jTextField46.getText()); 
            else if(codenumber == 3258115)
                updateValue= new BigInteger(jTextField47.getText()); 
            else if(codenumber == 3258119)
                updateValue= new BigInteger(jTextField48.getText()); 
            else if(codenumber == 3258127)
                updateValue= new BigInteger(jTextField49.getText()); 
            else if(codenumber == 3821102)
                updateValue= new BigInteger(jTextField50.getText()); 
            else if(codenumber == 3821103)
               updateValue= new BigInteger(jTextField51.getText()); 
            else if(codenumber == 3821117)
                updateValue= new BigInteger(jTextField52.getText()); 
            else if(codenumber == 4112202)
                updateValue= new BigInteger(jTextField53.getText()); 
            else if(codenumber == 4112304)
                updateValue= new BigInteger(jTextField54.getText()); 
            else if(codenumber == 4112310)
                updateValue= new BigInteger(jTextField55.getText()); 
            else if(codenumber == 4112312)
                updateValue= new BigInteger(jTextField56.getText()); 
            else if(codenumber == 4112314)
                updateValue= new BigInteger(jTextField57.getText());
            */
            clearTextfield();
          
            
            String updateDate = ((JTextField) Date.getDateEditor().getUiComponent()).getText();
    
        System.out.println("  "+ updateValue);
        
        if (q == 0) {
            try {
                String sql6 = "UPDATE budgettable SET BUDGET='" + updateValue + "', Revised_budgets='"+ (updateValue - Integer.parseInt(table_Click6)) +"'  ,DATE='" + updateDate + "'  WHERE CODE='" + codenumber + "'";
                pst = con.prepareStatement(sql6);
                pst.execute();
                
                String sql7 = "UPDATE main_db_table SET Revised_budgets='"+ (updateValue - Integer.parseInt(table_Click6)) +"'  ,DATE='" + updateDate + "'  WHERE CODE='" + codenumber + "'";
                pst = con.prepareStatement(sql7);
                pst.execute();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Database Error");
            }
        }
        remaining_budget();
    }//GEN-LAST:event_UpdateDataActionPerformed

    private void APPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_APPActionPerformed
       App a = new App();
       a.show();
       this.dispose();
    }//GEN-LAST:event_APPActionPerformed

    private void startNewBudgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startNewBudgetActionPerformed
        int r = JOptionPane.showConfirmDialog(null, "Do you really want to Start new Budget", "Delete", JOptionPane.YES_NO_OPTION);
        if (r == 0) {
            NewBudgetVarify NBV = new NewBudgetVarify();
            NBV.show();
        }
    }//GEN-LAST:event_startNewBudgetActionPerformed

    private void showbudgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showbudgetActionPerformed
        try {
            String ShowData = "Select * from main_db_table";
            pst = con.prepareStatement(ShowData);
            //pst.setString(1, (String) Combo_2.getSelectedItem());
            rs = pst.executeQuery();

            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(80);
            /*int RowCount = jTable1.getRowCount();
            int sum = 0;
            for (int i = 0; i < RowCount; i++) {
                sum = sum + Integer.parseInt(jTable1.getValueAt(i, 6).toString());

            }*/
            //TotalBudget.setText(String.valueOf(sum));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Data Show Error");
        }
        remaining_budget();
    }//GEN-LAST:event_showbudgetActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton APP;
    private com.toedter.calendar.JDateChooser Date;
    private javax.swing.JButton DeleteData;
    private javax.swing.JLabel RemainingBudget;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton ShowData;
    private javax.swing.JButton UpdateData;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton logout;
    private javax.swing.JButton showbudget;
    private javax.swing.JButton startNewBudget;
    // End of variables declaration//GEN-END:variables
}
