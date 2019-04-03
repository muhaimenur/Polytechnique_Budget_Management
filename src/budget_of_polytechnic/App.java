/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budget_of_polytechnic;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Muhaimenur
 */
public class App extends javax.swing.JFrame {

    public ResultSet rs;
    public Statement st;
    public Connection con;
    private PreparedStatement pst;
    int value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14,
            value15, value16, value17, value18, value19, value20, value21, value22, value23, value24, value25, value26, value27, value28, value29, value30,
            value31, value32, value33, value34, value35, value36, value37, value38, value39, value40, value41, value42, value43, value44, value45, value46, value47, value48, value49,
            value50, value51, value52, value53, value54, value55, value56, value57, DP = 0, RFQ = 0, OTM = 0, remaining_Others, DP_pur_bud, RFQ_pur_bud, OTM_pur_bud, Others_pur_bud,
            DP_total, RFQ_total,OTM_total,Others_total;
    int  code1, code2, code3, code4, code5, code6, code7, code8, code9, code10, code11, code12, code13, code14, code15, code16, code17, code18, code19, code20, code21, code22, code23, code24, code25, code26, code27, code28, code29, code30, code31, code32, code33, code34, code35, code36, code37, code38, code39, code40, code41, code42, code43, code44, code45, code46, code47, code48, code49, code50, code51, code52, code53, code54, code55, code56, code57;
    
    int i1 = 0, j1 = 0, k1 = 0, i2 = 0, j2 = 0, k2 = 0, i3 = 0, j3 = 0, k3 = 0, i4 = 0, j4 = 0, k4 = 0, i5 = 0, j5 = 0, k5 = 0, i6 = 0, j6 = 0, k6 = 0, i7 = 0, j7 = 0, k7 = 0, i8 = 0, j8 = 0, k8 = 0, i9 = 0, j9 = 0, k9 = 0, i10 = 0, j10 = 0, k10 = 0, i11 = 0, j11 = 0, k11 = 0, i12 = 0, j12 = 0, k12 = 0,
            i13 = 0, j13 = 0, k13 = 0, i14 = 0, j14 = 0, k14 = 0, i15 = 0, j15 = 0, k15 = 0, i16 = 0, j16 = 0, k16 = 0, i17 = 0, j17 = 0, k17 = 0, i18 = 0, j18 = 0, k18 = 0, i19 = 0, j19 = 0, k19 = 0, i20 = 0, j20 = 0, k20 = 0, i21 = 0, j21 = 0, k21 = 0, i22 = 0, j22 = 0, k22 = 0,
            i23 = 0, j23 = 0, k23 = 0, i24 = 0, j24 = 0, k24 = 0, i25 = 0, j25 = 0, k25 = 0, i26 = 0, j26 = 0, k26 = 0, i27 = 0, j27 = 0, k27 = 0, i28 = 0, j28 = 0, k28 = 0, i29 = 0, j29 = 0, k29 = 0, i30 = 0, j30 = 0, k30 = 0, i31 = 0, j31 = 0, k31 = 0, i32 = 0, j32 = 0, k32 = 0, i33 = 0, j33 = 0, k33 = 0,
            i34 = 0, j34 = 0, k34 = 0, i35 = 0, j35 = 0, k35 = 0, i36 = 0, j36 = 0, k36 = 0, i37 = 0, j37 = 0, k37 = 0, i38 = 0, j38 = 0, k38 = 0, i39 = 0, j39 = 0, k39 = 0, i40 = 0, j40 = 0, k40 = 0, i41 = 0, j41 = 0, k41 = 0, i42 = 0, j42 = 0, k42 = 0, i43 = 0, j43 = 0, k43 = 0,
            i44 = 0, j44 = 0, k44 = 0, i45 = 0, j45 = 0, k45 = 0, i46 = 0, j46 = 0, k46 = 0, i47 = 0, j47 = 0, k47 = 0, i48 = 0, j48 = 0, k48 = 0, i49 = 0, j49 = 0, k49 = 0, i50 = 0, j50 = 0, k50 = 0, i51 = 0, j51 = 0, k51 = 0, i52 = 0, j52 = 0, k52 = 0, i53 = 0, j53 = 0, k53 = 0,
            i54 = 0, j54 = 0, k54 = 0, i55 = 0, j55 = 0, k55 = 0, i56 = 0, j56 = 0, k56 = 0, i57 = 0, j57 = 0, k57 = 0;
    
    /**
     * Creates new form App
     */
    public App() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        Connection();
        showbudget();
        DP_purchase();
        RFQ_purchase();
        OTM_purchase();
        Others_purchase();
        //calculation();
    }

    public void Connection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/budget_of_polytechnic", "root", "");

            st = con.createStatement();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    
    public void DP_purchase()
    {
        try{
            String DP = "DP";
          String sql2 = "select sum(Total) from expenditure_table where procurement_method = '" + DP + "' ";
            rs = st.executeQuery(sql2);
            if(rs.next())
            {
                String sum = rs.getString("sum(Total)");
                DP_purchase.setText(sum);
                DP_pur_bud = Integer.parseInt(sum);
            
            }
           }
           catch (Exception e) 
           {
               //JOptionPane.showMessageDialog(rootPane, "Database Error");
           }
    
    }
    public void RFQ_purchase()
    {
        try{
            
            String RFQ = "RFQ";
           
           String sql3 = "select sum(Total) from expenditure_table where procurement_method = '" + RFQ + "' ";
            rs = st.executeQuery(sql3);
            if(rs.next())
            {
                String sum = rs.getString("sum(Total)");
                RFQ_purchase.setText(sum);
                RFQ_pur_bud = Integer.parseInt(sum);
            
            }

           }
           catch (Exception e) 
           {
               //JOptionPane.showMessageDialog(rootPane, "Database Error");
           }
    
    }
    public void OTM_purchase()
    {
        try{   
            String OTM = "OTM";
          
         
            String sql4 = "select sum(Total) from expenditure_table where procurement_method = '" + OTM + "' ";
            rs = st.executeQuery(sql4);
            if(rs.next())
            {
                String sum = rs.getString("sum(Total)");
                OTM_purchase.setText(sum);
                OTM_pur_bud = Integer.parseInt(sum);
            
            } 
           }
           catch (Exception e) 
           {
               //JOptionPane.showMessageDialog(rootPane, "Database Error");
           }
    
    }
    public void Others_purchase()
    {
        try{
            String Other = "Others";
           String sql5 = "select sum(Total) from expenditure_table where procurement_method = '" + Other + "' ";
            rs = st.executeQuery(sql5);
            if(rs.next())
            {
                String sum = rs.getString("sum(Total)");
                Others_purchase.setText(sum);
                Others_pur_bud = Integer.parseInt(sum);
            
            }
           
           }
           catch (Exception e) 
           {
               //JOptionPane.showMessageDialog(rootPane, "Database Error");
           }
    
    }
    
    

    public void showbudget() {
        try {
            String sql3 = "select sum(BUDGET) from budgettable";
            rs = st.executeQuery(sql3);
            if(rs.next())
            {
                String sum = rs.getString("sum(BUDGET)");
                Other_cal.setText(String.valueOf(remaining_Others));
            }

            
            String ShowData = "Select * from budgettable";
            rs = st.executeQuery(ShowData);
            
            int count = 0;
            while (rs.next()) {
                if (count == 0) {
                    jLabel2.setText(rs.getString("BUDGET"));
                    value1 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton1.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton2.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton3.setSelected(true);
                    }
                            
                } else if (count == 1) {
                    jLabel4.setText(rs.getString("BUDGET"));
                    value2 = Integer.parseInt(rs.getString("BUDGET"));
                     if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton4.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton5.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton6.setSelected(true);
                    }
                } else if (count == 2) {
                    jLabel6.setText(rs.getString("BUDGET"));
                    value3 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton7.setSelected(true);
                                
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton8.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton9.setSelected(true);
                    }
                } else if (count == 3) {
                    jLabel8.setText(rs.getString("BUDGET"));
                    value4 = Integer.parseInt(rs.getString("BUDGET"));
                     if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton10.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton11.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton12.setSelected(true);
                    }
                } else if (count == 4) {
                    jLabel10.setText(rs.getString("BUDGET"));
                    value5 = Integer.parseInt(rs.getString("BUDGET"));
                     if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton13.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton14.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton15.setSelected(true);
                    }
                } else if (count == 5) {
                    jLabel12.setText(rs.getString("BUDGET"));
                    value6 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton16.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton17.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton18.setSelected(true);
                    }
                } else if (count == 6) {
                    jLabel14.setText(rs.getString("BUDGET"));
                    value7 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton19.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton20.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton21.setSelected(true);
                    }
                } else if (count == 7) {
                    jLabel16.setText(rs.getString("BUDGET"));
                    value8 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton22.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton23.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton24.setSelected(true);
                    }
                } else if (count == 8) {
                    jLabel18.setText(rs.getString("BUDGET"));
                    value9 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton25.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton26.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton27.setSelected(true);
                    }
                } else if (count == 9) {
                    jLabel20.setText(rs.getString("BUDGET"));
                    value10 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton28.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton29.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton30.setSelected(true);
                    }
                } else if (count == 10) {
                    jLabel22.setText(rs.getString("BUDGET"));
                    value11 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton31.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton32.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton33.setSelected(true);
                    }
                } else if (count == 11) {
                    jLabel24.setText(rs.getString("BUDGET"));
                    value12 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton34.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton35.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton36.setSelected(true);
                    }
                } else if (count == 12) {
                    jLabel26.setText(rs.getString("BUDGET"));
                    value13 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton37.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton38.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton39.setSelected(true);
                    }
                } else if (count == 13) {
                    jLabel28.setText(rs.getString("BUDGET"));
                    value14 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton40.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton41.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton42.setSelected(true);
                    }
                } else if (count == 14) {
                    jLabel30.setText(rs.getString("BUDGET"));
                    value15 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton43.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton44.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton45.setSelected(true);
                    }
                } else if (count == 15) {
                    jLabel32.setText(rs.getString("BUDGET"));
                    value16 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton46.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton47.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton48.setSelected(true);
                    }
                } else if (count == 16) {
                    jLabel34.setText(rs.getString("BUDGET"));
                    value17 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton49.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton50.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton51.setSelected(true);
                    }
                } else if (count == 17) {
                    jLabel36.setText(rs.getString("BUDGET"));
                    value18 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton52.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton53.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton54.setSelected(true);
                    }
                } else if (count == 18) {
                    jLabel38.setText(rs.getString("BUDGET"));
                    value19 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton55.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton56.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton57.setSelected(true);
                    }
                } else if (count == 19) {
                    jLabel40.setText(rs.getString("BUDGET"));
                    value20 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton58.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton59.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton60.setSelected(true);
                    }
                } else if (count == 20) {
                    jLabel42.setText(rs.getString("BUDGET"));
                    value21 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton61.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton62.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton63.setSelected(true);
                    }
                } else if (count == 21) {
                    jLabel44.setText(rs.getString("BUDGET"));
                    value22 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton64.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton65.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton66.setSelected(true);
                    }
                } else if (count == 22) {
                    jLabel46.setText(rs.getString("BUDGET"));
                    value23 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton67.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton68.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton69.setSelected(true);
                    }
                } else if (count == 23) {
                    jLabel50.setText(rs.getString("BUDGET"));
                    value24 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton70.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton71.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton72.setSelected(true);
                    }
                } else if (count == 24) {
                    jLabel162.setText(rs.getString("BUDGET"));
                    value25 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton166.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton167.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton168.setSelected(true);
                    }
                } else if (count == 25) {
                    jLabel52.setText(rs.getString("BUDGET"));
                    value26 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton73.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton74.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton75.setSelected(true);
                    }
                } else if (count == 26) {
                    jLabel54.setText(rs.getString("BUDGET"));
                    value27 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton76.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton77.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton78.setSelected(true);
                    }
                } else if (count == 27) {
                    jLabel56.setText(rs.getString("BUDGET"));
                    value28 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton79.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton80.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton81.setSelected(true);
                    }
                } else if (count == 28) {
                    jLabel58.setText(rs.getString("BUDGET"));
                    value29 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton82.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton83.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton84.setSelected(true);
                    }
                } else if (count == 29) {
                    jLabel60.setText(rs.getString("BUDGET"));
                    value30 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton85.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton86.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton87.setSelected(true);
                    }
                } else if (count == 30) {
                    jLabel65.setText(rs.getString("BUDGET"));
                    value31 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton88.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton89.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton90.setSelected(true);
                    }
                } else if (count == 31) {
                    jLabel68.setText(rs.getString("BUDGET"));
                    value32 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton91.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton92.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton93.setSelected(true);
                    }
                } else if (count == 32) {
                    jLabel71.setText(rs.getString("BUDGET"));
                    value33 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton94.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton95.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton96.setSelected(true);
                    }
                } else if (count == 33) {
                    jLabel73.setText(rs.getString("BUDGET"));
                    value34 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton97.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton98.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton99.setSelected(true);
                    }
                } else if (count == 34) {
                    jLabel75.setText(rs.getString("BUDGET"));
                    value35 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton100.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton101.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton102.setSelected(true);
                    }
                } else if (count == 35) {
                    jLabel77.setText(rs.getString("BUDGET"));
                    value36 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton103.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton104.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton105.setSelected(true);
                    }
                } else if (count == 36) {
                    jLabel79.setText(rs.getString("BUDGET"));
                    value37 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton106.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton107.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton108.setSelected(true);
                    }
                } else if (count == 37) {
                    jLabel81.setText(rs.getString("BUDGET"));
                    value38 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton109.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton110.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton111.setSelected(true);
                    }
                } else if (count == 38) {
                    jLabel84.setText(rs.getString("BUDGET"));
                    value39 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton112.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton113.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton114.setSelected(true);
                    }
                } else if (count == 39) {
                    jLabel86.setText(rs.getString("BUDGET"));
                    value40 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton115.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton116.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton117.setSelected(true);
                    }
                } else if (count == 40) {
                    jLabel89.setText(rs.getString("BUDGET"));
                    value41 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton118.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton119.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton120.setSelected(true);
                    }
                } else if (count == 41) {
                    jLabel91.setText(rs.getString("BUDGET"));
                    value42 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton121.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton122.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton123.setSelected(true);
                    }
                } else if (count == 42) {
                    jLabel164.setText(rs.getString("BUDGET"));
                    value43 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton169.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton170.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton171.setSelected(true);
                    }
                } else if (count == 43) {
                    jLabel93.setText(rs.getString("BUDGET"));
                    value44 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton124.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton125.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton126.setSelected(true);
                    }
                } else if (count == 44) {
                    jLabel95.setText(rs.getString("BUDGET"));
                    value45 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton127.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton128.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton129.setSelected(true);
                    }
                } else if (count == 45) {
                    jLabel97.setText(rs.getString("BUDGET"));
                    value46 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton130.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton131.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton132.setSelected(true);
                    }
                } else if (count == 46) {
                    jLabel100.setText(rs.getString("BUDGET"));
                    value47 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton133.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton134.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton135.setSelected(true);
                    }
                } else if (count == 47) {
                    jLabel102.setText(rs.getString("BUDGET"));
                    value48 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton136.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton137.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton138.setSelected(true);
                    }
                } else if (count == 48) {
                    jLabel104.setText(rs.getString("BUDGET"));
                    value49 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton139.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton140.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton141.setSelected(true);
                    }
                } else if (count == 49) {
                    jLabel107.setText(rs.getString("BUDGET"));
                    value50 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton142.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton143.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton144.setSelected(true);
                    }
                } else if (count == 50) {
                    jLabel109.setText(rs.getString("BUDGET"));
                    value51 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton145.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton146.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton147.setSelected(true);
                    }
                } else if (count == 51) {
                    jLabel111.setText(rs.getString("BUDGET"));
                    value52 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton148.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton149.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton150.setSelected(true);
                    }
                } else if (count == 52) {
                    jLabel114.setText(rs.getString("BUDGET"));
                    value53 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton151.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton152.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton153.setSelected(true);
                    }
                } else if (count == 53) {
                    jLabel116.setText(rs.getString("BUDGET"));
                    value54 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton154.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton155.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton156.setSelected(true);
                    }
                } else if (count == 54) {
                    jLabel118.setText(rs.getString("BUDGET"));
                    value55 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton157.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton158.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton159.setSelected(true);
                    }
                } else if (count == 55) {
                    jLabel120.setText(rs.getString("BUDGET"));
                    value56 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton160.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton161.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton162.setSelected(true);
                    }
                } else if (count == 56) {
                    jLabel122.setText(rs.getString("BUDGET"));
                    value57 = Integer.parseInt(rs.getString("BUDGET"));
                    if(rs.getString("PROCUREMENT_METHOD").equals("DP"))
                    {
                        jRadioButton163.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("RFQ"))
                    {
                        jRadioButton164.setSelected(true);
                    }
                    else if(rs.getString("PROCUREMENT_METHOD").equals("OTM"))
                    {
                        jRadioButton165.setSelected(true);
                    }
                }

                count++;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Data Show Error");
        }

    }

    public void calculation() {
        System.out.println("DP " + DP + "RFQ " + RFQ + "OTM " + OTM);
        DP_cal.setText(String.valueOf(DP));
        RFQ_cal.setText(String.valueOf(RFQ));
        OTM_cal.setText(String.valueOf(OTM));
        String str1 = "others";
        try{
            String sql3 = "select sum(BUDGET) from budgettable where Procurement_method = '"+str1+"'";
            rs = st.executeQuery(sql3);
            if(rs.next())
            {
                String sum = rs.getString("sum(BUDGET)");
                remaining_Others = Integer.parseInt(sum) - (DP+RFQ+OTM);
                Other_cal.setText(String.valueOf(remaining_Others));
            }
            

    }
    catch (Exception e) 
           {
            JOptionPane.showMessageDialog(rootPane, "Database Error");
           }
    }
    
   /* public void update_app()
    {
         String str1="DP";
            String str2="RFQ";
            String str3="OTM";
            String str4="Others";
        try{
            String sql_app = "Update app set budget='" + DP + "' where procurement_methods = '" + str1 + "')";
            pst = con.prepareStatement(sql_app);
            pst.execute();
               
            String sql_app2 = "Update app set budget='" + RFQ + "' where procurement_methods = '" + str2 + "')";
            pst = con.prepareStatement(sql_app2);
            pst.execute();
             
            String sql_app3 = "Update app set budget='" + OTM + "' where procurement_methods = '" + str3 + "')";
            pst = con.prepareStatement(sql_app3);
            pst.execute();
            
            String sql_app4 = "Update app set budget='" + remaining_Others + "' where procurement_methods = '" + str4 + "')";
            pst = con.prepareStatement(sql_app4);
            pst.execute();
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Database Error");
        }
    
    }*/
    
    public void Update_and_save()
    {
            String str1="DP";
            String str2="RFQ";
            String str3="OTM";
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
       try
       {
          if(jRadioButton1.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code1 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
             
                
            }
            else if(jRadioButton2.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code1 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton3.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code1 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            
            if(jRadioButton4.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code2 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton5.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code2 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton6.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code2 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton7.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code3 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton8.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code3 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton9.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code3 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton10.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code4 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton11.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code4 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton12.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code4 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton13.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code5 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton14.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code5 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton15.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code5 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton16.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code6 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton17.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code6 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton18.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code6 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton19.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code7 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton20.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code7 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton21.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code7 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton22.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code8 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton23.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code8 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton24.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code8 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton25.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code9 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton26.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code9 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton27.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code9 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton28.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code10 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton29.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code10 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton30.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code10 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton31.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code11 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton32.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code11 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton33.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code11 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton34.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code12 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton35.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code12 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton36.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code12 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton37.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code13 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton38.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code13 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton39.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code13 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton40.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code14 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton41.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code14 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton42.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code14 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton43.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code15 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton44.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code15 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton45.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code15 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton46.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code16 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton47.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code16 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton48.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code16 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton49.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code17 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton50.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code17 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton51.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code17 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton52.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code18 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton53.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code18 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton54.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code18 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton55.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code19 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton56.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code19 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton57.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code19 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton58.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code20 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton59.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code20 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton60.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code20 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton61.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code21 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton62.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code21 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton63.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code21 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton64.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code22 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton65.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code22 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton66.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code22 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton67.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code23 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton68.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code23 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton69.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code23 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton70.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code24 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton71.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code24 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton72.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code24 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton166.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code25 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton167.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code25 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton168.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code25 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton73.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code26 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton74.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code26 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton75.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code26 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton76.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code27 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton77.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code27 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton78.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code27 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton79.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code28 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton80.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code28 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton81.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code28 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton82.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code29 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton83.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code29 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton84.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code29 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton85.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code30 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton86.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code30 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton87.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code30 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton88.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code31 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton89.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code31 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton90.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code31 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton91.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code32 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton92.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code32 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton93.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code32 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton94.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code33 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton95.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code33 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton96.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code33 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton97.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code34 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton98.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code34 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton99.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code34 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton100.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code35 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton101.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code35 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton102.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code35 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton103.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code36 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton104.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code36 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton105.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code36 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton106.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code37 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton107.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code37 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton108.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code37 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }if(jRadioButton109.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code38 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton110.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code38 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton111.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code38 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton112.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code39 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton113.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code39 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton114.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code39 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton115.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code40 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton116.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code40 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton117.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code40 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton118.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code41 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton119.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code41 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton120.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code41 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton121.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code42 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton122.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code42 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton123.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code42 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton169.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code43 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton170.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code43 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton171.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code43 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            
            if(jRadioButton124.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code44 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton125.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code44 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton126.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code44 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton127.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code45 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton128.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code45 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton129.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code45 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton130.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code46 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton131.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code46 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton132.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code46 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton133.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code47 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton134.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code47 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton135.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code47 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton136.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code48 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton137.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code48 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton138.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code48 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton139.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code49 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton140.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code49 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton141.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code49 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton142.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code50 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton143.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code50 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton144.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code50 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton145.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code51 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton146.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code51 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton147.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code51 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton148.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code52 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton149.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code52 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton150.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code52 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton151.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code53 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton152.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code53 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton153.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code53 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton154.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code54 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton155.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code54 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton156.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code54 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton157.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code55 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton158.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code55 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton159.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code55 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton160.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code56 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton161.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code56 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton162.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code56 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton163.isSelected())
            {
                String sql1 = "UPDATE budgettable SET Procurement_method='" + str1 + "' WHERE CODE='" + code57 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton164.isSelected())
            {
                String sql2 = "UPDATE budgettable SET Procurement_method='" + str2 + "' WHERE CODE='" + code57 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton165.isSelected())
            {
                String sql3 = "UPDATE budgettable SET Procurement_method='" + str3 + "' WHERE CODE='" + code57 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
       }
       catch (Exception e) 
           {
               //JOptionPane.showMessageDialog(rootPane, "Database Error");
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        buttonGroup17 = new javax.swing.ButtonGroup();
        buttonGroup18 = new javax.swing.ButtonGroup();
        buttonGroup19 = new javax.swing.ButtonGroup();
        buttonGroup20 = new javax.swing.ButtonGroup();
        buttonGroup21 = new javax.swing.ButtonGroup();
        buttonGroup22 = new javax.swing.ButtonGroup();
        buttonGroup23 = new javax.swing.ButtonGroup();
        buttonGroup24 = new javax.swing.ButtonGroup();
        buttonGroup25 = new javax.swing.ButtonGroup();
        buttonGroup26 = new javax.swing.ButtonGroup();
        buttonGroup27 = new javax.swing.ButtonGroup();
        buttonGroup28 = new javax.swing.ButtonGroup();
        buttonGroup29 = new javax.swing.ButtonGroup();
        buttonGroup30 = new javax.swing.ButtonGroup();
        buttonGroup31 = new javax.swing.ButtonGroup();
        buttonGroup32 = new javax.swing.ButtonGroup();
        buttonGroup33 = new javax.swing.ButtonGroup();
        buttonGroup34 = new javax.swing.ButtonGroup();
        buttonGroup35 = new javax.swing.ButtonGroup();
        buttonGroup36 = new javax.swing.ButtonGroup();
        buttonGroup37 = new javax.swing.ButtonGroup();
        buttonGroup38 = new javax.swing.ButtonGroup();
        buttonGroup39 = new javax.swing.ButtonGroup();
        buttonGroup40 = new javax.swing.ButtonGroup();
        buttonGroup41 = new javax.swing.ButtonGroup();
        buttonGroup42 = new javax.swing.ButtonGroup();
        buttonGroup43 = new javax.swing.ButtonGroup();
        buttonGroup44 = new javax.swing.ButtonGroup();
        buttonGroup45 = new javax.swing.ButtonGroup();
        buttonGroup46 = new javax.swing.ButtonGroup();
        buttonGroup47 = new javax.swing.ButtonGroup();
        buttonGroup48 = new javax.swing.ButtonGroup();
        buttonGroup49 = new javax.swing.ButtonGroup();
        buttonGroup50 = new javax.swing.ButtonGroup();
        buttonGroup51 = new javax.swing.ButtonGroup();
        buttonGroup52 = new javax.swing.ButtonGroup();
        buttonGroup53 = new javax.swing.ButtonGroup();
        buttonGroup54 = new javax.swing.ButtonGroup();
        buttonGroup55 = new javax.swing.ButtonGroup();
        buttonGroup56 = new javax.swing.ButtonGroup();
        buttonGroup57 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        jRadioButton33 = new javax.swing.JRadioButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jRadioButton34 = new javax.swing.JRadioButton();
        jRadioButton35 = new javax.swing.JRadioButton();
        jRadioButton36 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jRadioButton37 = new javax.swing.JRadioButton();
        jRadioButton38 = new javax.swing.JRadioButton();
        jRadioButton39 = new javax.swing.JRadioButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jRadioButton40 = new javax.swing.JRadioButton();
        jRadioButton41 = new javax.swing.JRadioButton();
        jRadioButton42 = new javax.swing.JRadioButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jRadioButton43 = new javax.swing.JRadioButton();
        jRadioButton44 = new javax.swing.JRadioButton();
        jRadioButton45 = new javax.swing.JRadioButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jRadioButton46 = new javax.swing.JRadioButton();
        jRadioButton47 = new javax.swing.JRadioButton();
        jRadioButton48 = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jRadioButton49 = new javax.swing.JRadioButton();
        jRadioButton50 = new javax.swing.JRadioButton();
        jRadioButton51 = new javax.swing.JRadioButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jRadioButton52 = new javax.swing.JRadioButton();
        jRadioButton53 = new javax.swing.JRadioButton();
        jRadioButton54 = new javax.swing.JRadioButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jRadioButton55 = new javax.swing.JRadioButton();
        jRadioButton56 = new javax.swing.JRadioButton();
        jRadioButton57 = new javax.swing.JRadioButton();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jRadioButton58 = new javax.swing.JRadioButton();
        jRadioButton59 = new javax.swing.JRadioButton();
        jRadioButton60 = new javax.swing.JRadioButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jRadioButton61 = new javax.swing.JRadioButton();
        jRadioButton62 = new javax.swing.JRadioButton();
        jRadioButton63 = new javax.swing.JRadioButton();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jRadioButton64 = new javax.swing.JRadioButton();
        jRadioButton65 = new javax.swing.JRadioButton();
        jRadioButton66 = new javax.swing.JRadioButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jRadioButton67 = new javax.swing.JRadioButton();
        jRadioButton68 = new javax.swing.JRadioButton();
        jRadioButton69 = new javax.swing.JRadioButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jRadioButton70 = new javax.swing.JRadioButton();
        jRadioButton71 = new javax.swing.JRadioButton();
        jRadioButton72 = new javax.swing.JRadioButton();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jRadioButton166 = new javax.swing.JRadioButton();
        jRadioButton167 = new javax.swing.JRadioButton();
        jRadioButton168 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton74 = new javax.swing.JRadioButton();
        jLabel51 = new javax.swing.JLabel();
        jRadioButton75 = new javax.swing.JRadioButton();
        jRadioButton73 = new javax.swing.JRadioButton();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jRadioButton76 = new javax.swing.JRadioButton();
        jRadioButton77 = new javax.swing.JRadioButton();
        jRadioButton78 = new javax.swing.JRadioButton();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jRadioButton79 = new javax.swing.JRadioButton();
        jRadioButton80 = new javax.swing.JRadioButton();
        jRadioButton81 = new javax.swing.JRadioButton();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jRadioButton82 = new javax.swing.JRadioButton();
        jRadioButton83 = new javax.swing.JRadioButton();
        jRadioButton84 = new javax.swing.JRadioButton();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jRadioButton85 = new javax.swing.JRadioButton();
        jRadioButton86 = new javax.swing.JRadioButton();
        jRadioButton87 = new javax.swing.JRadioButton();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jRadioButton88 = new javax.swing.JRadioButton();
        jRadioButton89 = new javax.swing.JRadioButton();
        jRadioButton90 = new javax.swing.JRadioButton();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jRadioButton91 = new javax.swing.JRadioButton();
        jRadioButton92 = new javax.swing.JRadioButton();
        jRadioButton93 = new javax.swing.JRadioButton();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jRadioButton94 = new javax.swing.JRadioButton();
        jRadioButton95 = new javax.swing.JRadioButton();
        jRadioButton96 = new javax.swing.JRadioButton();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jRadioButton97 = new javax.swing.JRadioButton();
        jRadioButton98 = new javax.swing.JRadioButton();
        jRadioButton99 = new javax.swing.JRadioButton();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jRadioButton100 = new javax.swing.JRadioButton();
        jRadioButton101 = new javax.swing.JRadioButton();
        jRadioButton102 = new javax.swing.JRadioButton();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jRadioButton103 = new javax.swing.JRadioButton();
        jRadioButton104 = new javax.swing.JRadioButton();
        jRadioButton105 = new javax.swing.JRadioButton();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jRadioButton106 = new javax.swing.JRadioButton();
        jRadioButton107 = new javax.swing.JRadioButton();
        jRadioButton108 = new javax.swing.JRadioButton();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jRadioButton109 = new javax.swing.JRadioButton();
        jRadioButton110 = new javax.swing.JRadioButton();
        jRadioButton111 = new javax.swing.JRadioButton();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jRadioButton112 = new javax.swing.JRadioButton();
        jRadioButton113 = new javax.swing.JRadioButton();
        jRadioButton114 = new javax.swing.JRadioButton();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jRadioButton115 = new javax.swing.JRadioButton();
        jRadioButton116 = new javax.swing.JRadioButton();
        jRadioButton117 = new javax.swing.JRadioButton();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jRadioButton118 = new javax.swing.JRadioButton();
        jRadioButton119 = new javax.swing.JRadioButton();
        jRadioButton120 = new javax.swing.JRadioButton();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jRadioButton121 = new javax.swing.JRadioButton();
        jRadioButton122 = new javax.swing.JRadioButton();
        jRadioButton123 = new javax.swing.JRadioButton();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jRadioButton124 = new javax.swing.JRadioButton();
        jRadioButton125 = new javax.swing.JRadioButton();
        jRadioButton126 = new javax.swing.JRadioButton();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jRadioButton127 = new javax.swing.JRadioButton();
        jRadioButton128 = new javax.swing.JRadioButton();
        jRadioButton129 = new javax.swing.JRadioButton();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jRadioButton130 = new javax.swing.JRadioButton();
        jRadioButton131 = new javax.swing.JRadioButton();
        jRadioButton132 = new javax.swing.JRadioButton();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jRadioButton169 = new javax.swing.JRadioButton();
        jRadioButton170 = new javax.swing.JRadioButton();
        jRadioButton171 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton135 = new javax.swing.JRadioButton();
        jRadioButton133 = new javax.swing.JRadioButton();
        jLabel100 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jRadioButton134 = new javax.swing.JRadioButton();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jRadioButton136 = new javax.swing.JRadioButton();
        jRadioButton137 = new javax.swing.JRadioButton();
        jRadioButton138 = new javax.swing.JRadioButton();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jRadioButton139 = new javax.swing.JRadioButton();
        jRadioButton140 = new javax.swing.JRadioButton();
        jRadioButton141 = new javax.swing.JRadioButton();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jRadioButton142 = new javax.swing.JRadioButton();
        jRadioButton143 = new javax.swing.JRadioButton();
        jRadioButton144 = new javax.swing.JRadioButton();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jRadioButton145 = new javax.swing.JRadioButton();
        jRadioButton146 = new javax.swing.JRadioButton();
        jRadioButton147 = new javax.swing.JRadioButton();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jRadioButton148 = new javax.swing.JRadioButton();
        jRadioButton149 = new javax.swing.JRadioButton();
        jRadioButton150 = new javax.swing.JRadioButton();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jRadioButton151 = new javax.swing.JRadioButton();
        jRadioButton152 = new javax.swing.JRadioButton();
        jRadioButton153 = new javax.swing.JRadioButton();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jRadioButton154 = new javax.swing.JRadioButton();
        jRadioButton155 = new javax.swing.JRadioButton();
        jRadioButton156 = new javax.swing.JRadioButton();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jRadioButton157 = new javax.swing.JRadioButton();
        jRadioButton158 = new javax.swing.JRadioButton();
        jRadioButton159 = new javax.swing.JRadioButton();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jRadioButton160 = new javax.swing.JRadioButton();
        jRadioButton161 = new javax.swing.JRadioButton();
        jRadioButton162 = new javax.swing.JRadioButton();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jRadioButton163 = new javax.swing.JRadioButton();
        jRadioButton164 = new javax.swing.JRadioButton();
        jRadioButton165 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel132 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        DP_app = new javax.swing.JLabel();
        RFQ_app = new javax.swing.JLabel();
        OTM_app = new javax.swing.JLabel();
        Others_app = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        Others_purchase = new javax.swing.JLabel();
        OTM_purchase = new javax.swing.JLabel();
        RFQ_purchase = new javax.swing.JLabel();
        DP_purchase = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        OTM_remain = new javax.swing.JLabel();
        RFQ_remain = new javax.swing.JLabel();
        Others_remain = new javax.swing.JLabel();
        Dp_ramain = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        total_gov_bud = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        total_remain_label = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        Total_purc = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        save = new javax.swing.JButton();
        show = new javax.swing.JButton();
        Deselect = new javax.swing.JButton();
        update = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        DP_cal = new javax.swing.JLabel();
        RFQ_cal = new javax.swing.JLabel();
        OTM_cal = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        Other_cal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APP Creation");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Office salary (3111101) :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("jLabel2");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1.setText("DP");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2.setText("RFQ");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton3.setText("OTM");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Employee salary (3111201) :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("jLabel2");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton4.setText("DP");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton5.setText("RFQ");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton6.setText("OTM");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Responsibility duty allowance (3111301) :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("jLabel2");

        buttonGroup3.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton7.setText("DP");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        buttonGroup3.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton8.setText("RFQ");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        buttonGroup3.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton9.setText("OTM");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Transportation allowance (3111302) :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("jLabel2");

        buttonGroup4.add(jRadioButton10);
        jRadioButton10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton10.setText("DP");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });

        buttonGroup4.add(jRadioButton11);
        jRadioButton11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton11.setText("RFQ");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });

        buttonGroup4.add(jRadioButton12);
        jRadioButton12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton12.setText("OTM");
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Education allowance (3111306) :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("jLabel2");

        buttonGroup5.add(jRadioButton13);
        jRadioButton13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton13.setText("DP");
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });

        buttonGroup5.add(jRadioButton14);
        jRadioButton14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton14.setText("RFQ");
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });

        buttonGroup5.add(jRadioButton15);
        jRadioButton15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton15.setText("OTM");
        jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton15ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Hill allowance (3111309) :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("jLabel2");

        buttonGroup6.add(jRadioButton16);
        jRadioButton16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton16.setText("DP");
        jRadioButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton16ActionPerformed(evt);
            }
        });

        buttonGroup6.add(jRadioButton17);
        jRadioButton17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton17.setText("RFQ");
        jRadioButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton17ActionPerformed(evt);
            }
        });

        buttonGroup6.add(jRadioButton18);
        jRadioButton18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton18.setText("OTM");
        jRadioButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton18ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("House rent allowance (3111310) :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("jLabel2");

        buttonGroup7.add(jRadioButton19);
        jRadioButton19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton19.setText("DP");
        jRadioButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton19ActionPerformed(evt);
            }
        });

        buttonGroup7.add(jRadioButton20);
        jRadioButton20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton20.setText("RFQ");
        jRadioButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton20ActionPerformed(evt);
            }
        });

        buttonGroup7.add(jRadioButton21);
        jRadioButton21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton21.setText("OTM");
        jRadioButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton21ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Medical allowance (3111311) :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("jLabel2");

        buttonGroup8.add(jRadioButton22);
        jRadioButton22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton22.setText("DP");
        jRadioButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton22ActionPerformed(evt);
            }
        });

        buttonGroup8.add(jRadioButton23);
        jRadioButton23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton23.setText("RFQ");
        jRadioButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton23ActionPerformed(evt);
            }
        });

        buttonGroup8.add(jRadioButton24);
        jRadioButton24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton24.setText("OTM");
        jRadioButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton24ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Tiffin allowance (3111314) :");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("jLabel2");

        buttonGroup9.add(jRadioButton25);
        jRadioButton25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton25.setText("DP");
        jRadioButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton25ActionPerformed(evt);
            }
        });

        buttonGroup9.add(jRadioButton26);
        jRadioButton26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton26.setText("RFQ");
        jRadioButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton26ActionPerformed(evt);
            }
        });

        buttonGroup9.add(jRadioButton27);
        jRadioButton27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton27.setText("OTM");
        jRadioButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton27ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Bleaching allowance (3111316) :");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("jLabel2");

        buttonGroup10.add(jRadioButton28);
        jRadioButton28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton28.setText("DP");
        jRadioButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton28ActionPerformed(evt);
            }
        });

        buttonGroup10.add(jRadioButton29);
        jRadioButton29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton29.setText("RFQ");
        jRadioButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton29ActionPerformed(evt);
            }
        });

        buttonGroup10.add(jRadioButton30);
        jRadioButton30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton30.setText("OTM");
        jRadioButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton30ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Festival allowance (3111325) :");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("jLabel2");

        buttonGroup11.add(jRadioButton31);
        jRadioButton31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton31.setText("DP");
        jRadioButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton31ActionPerformed(evt);
            }
        });

        buttonGroup11.add(jRadioButton32);
        jRadioButton32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton32.setText("RFQ");
        jRadioButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton32ActionPerformed(evt);
            }
        });

        buttonGroup11.add(jRadioButton33);
        jRadioButton33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton33.setText("OTM");
        jRadioButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton33ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Overtime allowance (3111327) :");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("jLabel2");

        buttonGroup12.add(jRadioButton34);
        jRadioButton34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton34.setText("DP");
        jRadioButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton34ActionPerformed(evt);
            }
        });

        buttonGroup12.add(jRadioButton35);
        jRadioButton35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton35.setText("RFQ");
        jRadioButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton35ActionPerformed(evt);
            }
        });

        buttonGroup12.add(jRadioButton36);
        jRadioButton36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton36.setText("OTM");
        jRadioButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton36ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Wax entertainment allowance (3111328) :");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("jLabel2");

        buttonGroup13.add(jRadioButton37);
        jRadioButton37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton37.setText("DP");
        jRadioButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton37ActionPerformed(evt);
            }
        });

        buttonGroup13.add(jRadioButton38);
        jRadioButton38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton38.setText("RFQ");
        jRadioButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton38ActionPerformed(evt);
            }
        });

        buttonGroup13.add(jRadioButton39);
        jRadioButton39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton39.setText("OTM");
        jRadioButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton39ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Honorarium (3111332) :");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("jLabel2");

        buttonGroup14.add(jRadioButton40);
        jRadioButton40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton40.setText("DP");
        jRadioButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton40ActionPerformed(evt);
            }
        });

        buttonGroup14.add(jRadioButton41);
        jRadioButton41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton41.setText("RFQ");
        jRadioButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton41ActionPerformed(evt);
            }
        });

        buttonGroup14.add(jRadioButton42);
        jRadioButton42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton42.setText("OTM");
        jRadioButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton42ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Bengali new year allowance (3111335) :");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("jLabel2");

        buttonGroup15.add(jRadioButton43);
        jRadioButton43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton43.setText("DP");
        jRadioButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton43ActionPerformed(evt);
            }
        });

        buttonGroup15.add(jRadioButton44);
        jRadioButton44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton44.setText("RFQ");
        jRadioButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton44ActionPerformed(evt);
            }
        });

        buttonGroup15.add(jRadioButton45);
        jRadioButton45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton45.setText("OTM");
        jRadioButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton45ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Other allowance (3111338) :");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("jLabel2");

        buttonGroup16.add(jRadioButton46);
        jRadioButton46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton46.setText("DP");
        jRadioButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton46ActionPerformed(evt);
            }
        });

        buttonGroup16.add(jRadioButton47);
        jRadioButton47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton47.setText("RFQ");
        jRadioButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton47ActionPerformed(evt);
            }
        });

        buttonGroup16.add(jRadioButton48);
        jRadioButton48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton48.setText("OTM");
        jRadioButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton48ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Clear appetite (3211102) :");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("jLabel2");

        buttonGroup17.add(jRadioButton49);
        jRadioButton49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton49.setText("DP");
        jRadioButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton49ActionPerformed(evt);
            }
        });

        buttonGroup17.add(jRadioButton50);
        jRadioButton50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton50.setText("RFQ");
        jRadioButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton50ActionPerformed(evt);
            }
        });

        buttonGroup17.add(jRadioButton51);
        jRadioButton51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton51.setText("OTM");
        jRadioButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton51ActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Reception expenditure (3211106) :");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("jLabel2");

        buttonGroup18.add(jRadioButton52);
        jRadioButton52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton52.setText("DP");
        jRadioButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton52ActionPerformed(evt);
            }
        });

        buttonGroup18.add(jRadioButton53);
        jRadioButton53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton53.setText("RFQ");
        jRadioButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton53ActionPerformed(evt);
            }
        });

        buttonGroup18.add(jRadioButton54);
        jRadioButton54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton54.setText("OTM");
        jRadioButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton54ActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Hiring charge (3211107) :");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("jLabel2");

        buttonGroup19.add(jRadioButton55);
        jRadioButton55.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton55.setText("DP");
        jRadioButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton55ActionPerformed(evt);
            }
        });

        buttonGroup19.add(jRadioButton56);
        jRadioButton56.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton56.setText("RFQ");
        jRadioButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton56ActionPerformed(evt);
            }
        });

        buttonGroup19.add(jRadioButton57);
        jRadioButton57.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton57.setText("OTM");
        jRadioButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton57ActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("The cost of the law (3211110) :");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("jLabel2");

        buttonGroup20.add(jRadioButton58);
        jRadioButton58.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton58.setText("DP");
        jRadioButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton58ActionPerformed(evt);
            }
        });

        buttonGroup20.add(jRadioButton59);
        jRadioButton59.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton59.setText("RFQ");
        jRadioButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton59ActionPerformed(evt);
            }
        });

        buttonGroup20.add(jRadioButton60);
        jRadioButton60.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton60.setText("OTM");
        jRadioButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton60ActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("Electricity (3211113) :");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("jLabel2");

        buttonGroup21.add(jRadioButton61);
        jRadioButton61.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton61.setText("DP");
        jRadioButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton61ActionPerformed(evt);
            }
        });

        buttonGroup21.add(jRadioButton62);
        jRadioButton62.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton62.setText("RFQ");
        jRadioButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton62ActionPerformed(evt);
            }
        });

        buttonGroup21.add(jRadioButton63);
        jRadioButton63.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton63.setText("OTM");
        jRadioButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton63ActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("Water (3211115) :");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("jLabel2");

        buttonGroup22.add(jRadioButton64);
        jRadioButton64.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton64.setText("DP");
        jRadioButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton64ActionPerformed(evt);
            }
        });

        buttonGroup22.add(jRadioButton65);
        jRadioButton65.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton65.setText("RFQ");
        jRadioButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton65ActionPerformed(evt);
            }
        });

        buttonGroup22.add(jRadioButton66);
        jRadioButton66.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton66.setText("OTM");
        jRadioButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton66ActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setText("Internet/Fax/Telex (3211117) :");

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setText("jLabel2");

        buttonGroup23.add(jRadioButton67);
        jRadioButton67.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton67.setText("DP");
        jRadioButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton67ActionPerformed(evt);
            }
        });

        buttonGroup23.add(jRadioButton68);
        jRadioButton68.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton68.setText("RFQ");
        jRadioButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton68ActionPerformed(evt);
            }
        });

        buttonGroup23.add(jRadioButton69);
        jRadioButton69.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton69.setText("OTM");
        jRadioButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton69ActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel47.setText("Administrative expenditure");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel48.setText("Cash wage & salary");

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel49.setText("Postal (3211119) :");

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel50.setText("jLabel2");

        buttonGroup24.add(jRadioButton70);
        jRadioButton70.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton70.setText("DP");
        jRadioButton70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton70ActionPerformed(evt);
            }
        });

        buttonGroup24.add(jRadioButton71);
        jRadioButton71.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton71.setText("RFQ");
        jRadioButton71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton71ActionPerformed(evt);
            }
        });

        buttonGroup24.add(jRadioButton72);
        jRadioButton72.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton72.setText("OTM");
        jRadioButton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton72ActionPerformed(evt);
            }
        });

        jLabel161.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel161.setText("Telephone (3211120) :");

        jLabel162.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel162.setText("jLabel2");

        buttonGroup25.add(jRadioButton166);
        jRadioButton166.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton166.setText("DP");
        jRadioButton166.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton166ActionPerformed(evt);
            }
        });

        buttonGroup25.add(jRadioButton167);
        jRadioButton167.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton167.setText("RFQ");
        jRadioButton167.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton167ActionPerformed(evt);
            }
        });

        buttonGroup25.add(jRadioButton168);
        jRadioButton168.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton168.setText("OTM");
        jRadioButton168.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton168ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel23)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton34)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton35)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton36))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton28)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton29)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton30))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton25)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton26)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton27))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton22)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton23)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton24))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton20)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton21))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton18))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton12))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton9))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton6))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton3))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel21)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton31)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton32)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton33))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton15)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton37))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton43))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(107, 107, 107)
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jRadioButton40)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton39))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton41)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton42))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel29)
                                        .addGap(106, 106, 106))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(jRadioButton44)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton45))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton46)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton47)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jRadioButton48))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel37)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(167, 167, 167))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(165, 165, 165))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(13, 13, 13)
                                                .addComponent(jRadioButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(108, 108, 108))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel45)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel49)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel161)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(169, 169, 169))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel33)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(jRadioButton49)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButton50)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButton51))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel35)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jRadioButton55)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jRadioButton56)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jRadioButton57))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jRadioButton52)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jRadioButton53)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jRadioButton54))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jRadioButton58)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jRadioButton62)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jRadioButton63))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jRadioButton59)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jRadioButton60))))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jRadioButton70)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jRadioButton71)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jRadioButton72))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jRadioButton64)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jRadioButton65))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jRadioButton67)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jRadioButton68)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jRadioButton66)
                                                            .addComponent(jRadioButton69)))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jRadioButton166)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jRadioButton167)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jRadioButton168)))
                                                .addGap(4, 4, 4)))
                                        .addGap(3, 3, 3)))))
                        .addContainerGap(10, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jRadioButton10)
                    .addComponent(jRadioButton11)
                    .addComponent(jRadioButton12))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jRadioButton13)
                    .addComponent(jRadioButton14)
                    .addComponent(jRadioButton15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jRadioButton16)
                    .addComponent(jRadioButton17)
                    .addComponent(jRadioButton18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jRadioButton19)
                    .addComponent(jRadioButton20)
                    .addComponent(jRadioButton21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jRadioButton22)
                    .addComponent(jRadioButton23)
                    .addComponent(jRadioButton24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jRadioButton25)
                    .addComponent(jRadioButton26)
                    .addComponent(jRadioButton27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jRadioButton28)
                    .addComponent(jRadioButton29)
                    .addComponent(jRadioButton30))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jRadioButton31)
                    .addComponent(jRadioButton32)
                    .addComponent(jRadioButton33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jRadioButton34)
                    .addComponent(jRadioButton35)
                    .addComponent(jRadioButton36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jRadioButton37)
                    .addComponent(jRadioButton38)
                    .addComponent(jRadioButton39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jRadioButton40)
                    .addComponent(jRadioButton41)
                    .addComponent(jRadioButton42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jRadioButton43)
                    .addComponent(jRadioButton44)
                    .addComponent(jRadioButton45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jRadioButton46)
                    .addComponent(jRadioButton47)
                    .addComponent(jRadioButton48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jRadioButton49)
                    .addComponent(jRadioButton50)
                    .addComponent(jRadioButton51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                    .addComponent(jRadioButton52)
                    .addComponent(jRadioButton53)
                    .addComponent(jRadioButton54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(jRadioButton55)
                    .addComponent(jRadioButton56)
                    .addComponent(jRadioButton57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40)
                    .addComponent(jRadioButton58)
                    .addComponent(jRadioButton59)
                    .addComponent(jRadioButton60))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jRadioButton61)
                    .addComponent(jRadioButton62)
                    .addComponent(jRadioButton63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44)
                    .addComponent(jRadioButton64)
                    .addComponent(jRadioButton65)
                    .addComponent(jRadioButton66))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46)
                    .addComponent(jRadioButton67)
                    .addComponent(jRadioButton68)
                    .addComponent(jRadioButton69))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50)
                    .addComponent(jRadioButton70)
                    .addComponent(jRadioButton71)
                    .addComponent(jRadioButton72))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel161)
                    .addComponent(jLabel162)
                    .addComponent(jRadioButton166)
                    .addComponent(jRadioButton167)
                    .addComponent(jRadioButton168)))
        );

        buttonGroup26.add(jRadioButton74);
        jRadioButton74.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton74.setText("RFQ");
        jRadioButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton74ActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel51.setText("Promotion & advertising (3211125) :");

        buttonGroup26.add(jRadioButton75);
        jRadioButton75.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton75.setText("OTM");
        jRadioButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton75ActionPerformed(evt);
            }
        });

        buttonGroup26.add(jRadioButton73);
        jRadioButton73.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton73.setText("DP");
        jRadioButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton73ActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel52.setText("jLabel2");

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel53.setText("Books & magazine (3211127) :");

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setText("jLabel2");

        buttonGroup27.add(jRadioButton76);
        jRadioButton76.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton76.setText("DP");
        jRadioButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton76ActionPerformed(evt);
            }
        });

        buttonGroup27.add(jRadioButton77);
        jRadioButton77.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton77.setText("RFQ");
        jRadioButton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton77ActionPerformed(evt);
            }
        });

        buttonGroup27.add(jRadioButton78);
        jRadioButton78.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton78.setText("OTM");
        jRadioButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton78ActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel55.setText("Registration fee (3221104) :");

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel56.setText("jLabel2");

        buttonGroup28.add(jRadioButton79);
        jRadioButton79.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton79.setText("DP");
        jRadioButton79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton79ActionPerformed(evt);
            }
        });

        buttonGroup28.add(jRadioButton80);
        jRadioButton80.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton80.setText("RFQ");
        jRadioButton80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton80ActionPerformed(evt);
            }
        });

        buttonGroup28.add(jRadioButton81);
        jRadioButton81.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton81.setText("OTM");
        jRadioButton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton81ActionPerformed(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel57.setText("Training (3231301) :");

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel58.setText("jLabel2");

        buttonGroup29.add(jRadioButton82);
        jRadioButton82.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton82.setText("DP");
        jRadioButton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton82ActionPerformed(evt);
            }
        });

        buttonGroup29.add(jRadioButton83);
        jRadioButton83.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton83.setText("RFQ");
        jRadioButton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton83ActionPerformed(evt);
            }
        });

        buttonGroup29.add(jRadioButton84);
        jRadioButton84.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton84.setText("OTM");
        jRadioButton84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton84ActionPerformed(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel59.setText("Petrol, oil & lubricant (3243101) :");

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel60.setText("jLabel2");

        buttonGroup30.add(jRadioButton85);
        jRadioButton85.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton85.setText("DP");
        jRadioButton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton85ActionPerformed(evt);
            }
        });

        buttonGroup30.add(jRadioButton86);
        jRadioButton86.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton86.setText("RFQ");
        jRadioButton86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton86ActionPerformed(evt);
            }
        });

        buttonGroup30.add(jRadioButton87);
        jRadioButton87.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton87.setText("OTM");
        jRadioButton87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton87ActionPerformed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel61.setText("Fee, Charge & Commission");

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel62.setText("Training");

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel63.setText("Petrol, oil & lubricant");

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel64.setText("Gas & fuel (3243102) :");

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel65.setText("jLabel2");

        buttonGroup31.add(jRadioButton88);
        jRadioButton88.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton88.setText("DP");
        jRadioButton88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton88ActionPerformed(evt);
            }
        });

        buttonGroup31.add(jRadioButton89);
        jRadioButton89.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton89.setText("RFQ");
        jRadioButton89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton89ActionPerformed(evt);
            }
        });

        buttonGroup31.add(jRadioButton90);
        jRadioButton90.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton90.setText("OTM");
        jRadioButton90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton90ActionPerformed(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel66.setText("Travel & Transfer");

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel67.setText("Travel expense (3244101) :");

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel68.setText("jLabel2");

        buttonGroup32.add(jRadioButton91);
        jRadioButton91.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton91.setText("DP");
        jRadioButton91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton91ActionPerformed(evt);
            }
        });

        buttonGroup32.add(jRadioButton92);
        jRadioButton92.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton92.setText("RFQ");
        jRadioButton92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton92ActionPerformed(evt);
            }
        });

        buttonGroup32.add(jRadioButton93);
        jRadioButton93.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton93.setText("OTM");
        jRadioButton93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton93ActionPerformed(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel69.setText("Printing & Monihari");

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel70.setText("Computer accessories (3255101) :");

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel71.setText("jLabel2");

        buttonGroup33.add(jRadioButton94);
        jRadioButton94.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton94.setText("DP");
        jRadioButton94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton94ActionPerformed(evt);
            }
        });

        buttonGroup33.add(jRadioButton95);
        jRadioButton95.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton95.setText("RFQ");
        jRadioButton95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton95ActionPerformed(evt);
            }
        });

        buttonGroup33.add(jRadioButton96);
        jRadioButton96.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton96.setText("OTM");
        jRadioButton96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton96ActionPerformed(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel72.setText("Other monihari (3255105) :");

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel73.setText("jLabel2");

        buttonGroup34.add(jRadioButton97);
        jRadioButton97.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton97.setText("DP");
        jRadioButton97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton97ActionPerformed(evt);
            }
        });

        buttonGroup34.add(jRadioButton98);
        jRadioButton98.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton98.setText("RFQ");
        jRadioButton98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton98ActionPerformed(evt);
            }
        });

        buttonGroup34.add(jRadioButton99);
        jRadioButton99.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton99.setText("OTM");
        jRadioButton99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton99ActionPerformed(evt);
            }
        });

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel74.setText("General supplies and raw materials");

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel75.setText("jLabel2");

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel76.setText("Chemicals (3256102) :");

        buttonGroup35.add(jRadioButton100);
        jRadioButton100.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton100.setText("DP");
        jRadioButton100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton100ActionPerformed(evt);
            }
        });

        buttonGroup35.add(jRadioButton101);
        jRadioButton101.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton101.setText("RFQ");
        jRadioButton101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton101ActionPerformed(evt);
            }
        });

        buttonGroup35.add(jRadioButton102);
        jRadioButton102.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton102.setText("OTM");
        jRadioButton102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton102ActionPerformed(evt);
            }
        });

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel77.setText("jLabel2");

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel78.setText("Raw materials & spare parts (3256105) :");

        buttonGroup36.add(jRadioButton103);
        jRadioButton103.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton103.setText("DP");
        jRadioButton103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton103ActionPerformed(evt);
            }
        });

        buttonGroup36.add(jRadioButton104);
        jRadioButton104.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton104.setText("RFQ");
        jRadioButton104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton104ActionPerformed(evt);
            }
        });

        buttonGroup36.add(jRadioButton105);
        jRadioButton105.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton105.setText("OTM");
        jRadioButton105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton105ActionPerformed(evt);
            }
        });

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel79.setText("jLabel2");

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel80.setText("Clothing (3256106) :");

        buttonGroup37.add(jRadioButton106);
        jRadioButton106.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton106.setText("DP");
        jRadioButton106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton106ActionPerformed(evt);
            }
        });

        buttonGroup37.add(jRadioButton107);
        jRadioButton107.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton107.setText("RFQ");
        jRadioButton107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton107ActionPerformed(evt);
            }
        });

        buttonGroup37.add(jRadioButton108);
        jRadioButton108.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton108.setText("OTM");
        jRadioButton108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton108ActionPerformed(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel81.setText("jLabel2");

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel82.setText("Sports accessories (3256107) :");

        buttonGroup38.add(jRadioButton109);
        jRadioButton109.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton109.setText("DP");
        jRadioButton109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton109ActionPerformed(evt);
            }
        });

        buttonGroup38.add(jRadioButton110);
        jRadioButton110.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton110.setText("RFQ");
        jRadioButton110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton110ActionPerformed(evt);
            }
        });

        buttonGroup38.add(jRadioButton111);
        jRadioButton111.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton111.setText("OTM");
        jRadioButton111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton111ActionPerformed(evt);
            }
        });

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel83.setText("Professional service, honor & special expenditure");

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel84.setText("jLabel2");

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel85.setText("Honorariam W/O govt. emp. (3257206) :");

        buttonGroup39.add(jRadioButton112);
        jRadioButton112.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton112.setText("DP");
        jRadioButton112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton112ActionPerformed(evt);
            }
        });

        buttonGroup39.add(jRadioButton113);
        jRadioButton113.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton113.setText("RFQ");
        jRadioButton113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton113ActionPerformed(evt);
            }
        });

        buttonGroup39.add(jRadioButton114);
        jRadioButton114.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton114.setText("OTM");
        jRadioButton114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton114ActionPerformed(evt);
            }
        });

        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel86.setText("jLabel2");

        jLabel87.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel87.setText("Festival (3257301) :");

        buttonGroup40.add(jRadioButton115);
        jRadioButton115.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton115.setText("DP");
        jRadioButton115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton115ActionPerformed(evt);
            }
        });

        buttonGroup40.add(jRadioButton116);
        jRadioButton116.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton116.setText("RFQ");
        jRadioButton116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton116ActionPerformed(evt);
            }
        });

        buttonGroup40.add(jRadioButton117);
        jRadioButton117.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton117.setText("OTM");
        jRadioButton117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton117ActionPerformed(evt);
            }
        });

        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel88.setText("Repair & Store");

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel89.setText("jLabel2");

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel90.setText("Motor vehicles (3258101) :");

        buttonGroup41.add(jRadioButton118);
        jRadioButton118.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton118.setText("DP");
        jRadioButton118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton118ActionPerformed(evt);
            }
        });

        buttonGroup41.add(jRadioButton119);
        jRadioButton119.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton119.setText("RFQ");
        jRadioButton119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton119ActionPerformed(evt);
            }
        });

        buttonGroup41.add(jRadioButton120);
        jRadioButton120.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton120.setText("OTM");
        jRadioButton120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton120ActionPerformed(evt);
            }
        });

        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel91.setText("jLabel2");

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel92.setText("Furniture (3258102) :");

        buttonGroup42.add(jRadioButton121);
        jRadioButton121.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton121.setText("DP");
        jRadioButton121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton121ActionPerformed(evt);
            }
        });

        buttonGroup42.add(jRadioButton122);
        jRadioButton122.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton122.setText("RFQ");
        jRadioButton122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton122ActionPerformed(evt);
            }
        });

        buttonGroup42.add(jRadioButton123);
        jRadioButton123.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton123.setText("OTM");
        jRadioButton123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton123ActionPerformed(evt);
            }
        });

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel93.setText("jLabel2");

        jLabel94.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel94.setText("Office equipment (3258104) :");

        buttonGroup44.add(jRadioButton124);
        jRadioButton124.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton124.setText("DP");
        jRadioButton124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton124ActionPerformed(evt);
            }
        });

        buttonGroup44.add(jRadioButton125);
        jRadioButton125.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton125.setText("RFQ");
        jRadioButton125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton125ActionPerformed(evt);
            }
        });

        buttonGroup44.add(jRadioButton126);
        jRadioButton126.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton126.setText("OTM");
        jRadioButton126.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton126ActionPerformed(evt);
            }
        });

        jLabel95.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel95.setText("jLabel2");

        jLabel96.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel96.setText("Other parts & equipments (3258105) :");

        buttonGroup45.add(jRadioButton127);
        jRadioButton127.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton127.setText("DP");
        jRadioButton127.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton127ActionPerformed(evt);
            }
        });

        buttonGroup45.add(jRadioButton128);
        jRadioButton128.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton128.setText("RFQ");
        jRadioButton128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton128ActionPerformed(evt);
            }
        });

        buttonGroup45.add(jRadioButton129);
        jRadioButton129.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton129.setText("OTM");
        jRadioButton129.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton129ActionPerformed(evt);
            }
        });

        jLabel97.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel97.setText("jLabel2");

        jLabel98.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel98.setText("Other building & structure (3258108) :");

        buttonGroup46.add(jRadioButton130);
        jRadioButton130.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton130.setText("DP");
        jRadioButton130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton130ActionPerformed(evt);
            }
        });

        buttonGroup46.add(jRadioButton131);
        jRadioButton131.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton131.setText("RFQ");
        jRadioButton131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton131ActionPerformed(evt);
            }
        });

        buttonGroup46.add(jRadioButton132);
        jRadioButton132.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton132.setText("OTM");
        jRadioButton132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton132ActionPerformed(evt);
            }
        });

        jLabel163.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel163.setText("Computer (3258103) :");

        jLabel164.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel164.setText("jLabel2");

        buttonGroup43.add(jRadioButton169);
        jRadioButton169.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton169.setText("DP");
        jRadioButton169.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton169ActionPerformed(evt);
            }
        });

        buttonGroup43.add(jRadioButton170);
        jRadioButton170.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton170.setText("RFQ");
        jRadioButton170.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton170ActionPerformed(evt);
            }
        });

        buttonGroup43.add(jRadioButton171);
        jRadioButton171.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton171.setText("OTM");
        jRadioButton171.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton171ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel83)
                    .addComponent(jLabel69)
                    .addComponent(jLabel66)
                    .addComponent(jLabel63)
                    .addComponent(jLabel61)
                    .addComponent(jLabel62)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel72)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel70)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButton97)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton98)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton99))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButton94)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton95)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton96))))
                    .addComponent(jLabel74)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel87)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel85)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButton115)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton116)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton117))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButton112)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton113)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton114))))
                    .addComponent(jLabel88)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel98)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton130)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton131)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton132))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel76)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton100)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton101)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton102))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel78)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton103)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton104)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton105))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel82)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton109)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton110)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton111))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel80)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton106)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton107)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton108)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel94)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton124)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton125)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton126))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel96)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton127)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton128)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton129))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel92)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton121)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton122))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel163)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel164, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton169)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton170)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jRadioButton171)
                                .addComponent(jRadioButton123)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel90)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton118)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton119)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton120)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel67)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton91)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton92)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton93))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel51)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton73)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton74)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton75))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel53)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton76)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton77)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton78))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel55)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton79)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton80)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton81))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel57)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton82)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton83)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton84))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel59)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton85)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton86)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton87))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel64)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton88)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton89)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton90)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(jLabel52)
                    .addComponent(jRadioButton73)
                    .addComponent(jRadioButton74)
                    .addComponent(jRadioButton75))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54)
                    .addComponent(jRadioButton76)
                    .addComponent(jRadioButton77)
                    .addComponent(jRadioButton78))
                .addGap(13, 13, 13)
                .addComponent(jLabel61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jLabel56)
                    .addComponent(jRadioButton79)
                    .addComponent(jRadioButton80)
                    .addComponent(jRadioButton81))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel62)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(jLabel58)
                    .addComponent(jRadioButton82)
                    .addComponent(jRadioButton83)
                    .addComponent(jRadioButton84))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jLabel60)
                    .addComponent(jRadioButton85)
                    .addComponent(jRadioButton86)
                    .addComponent(jRadioButton87))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(jLabel65)
                    .addComponent(jRadioButton88)
                    .addComponent(jRadioButton89)
                    .addComponent(jRadioButton90))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(jLabel68)
                    .addComponent(jRadioButton91)
                    .addComponent(jRadioButton92)
                    .addComponent(jRadioButton93))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(jLabel71)
                    .addComponent(jRadioButton94)
                    .addComponent(jRadioButton95)
                    .addComponent(jRadioButton96))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(jLabel73)
                    .addComponent(jRadioButton97)
                    .addComponent(jRadioButton98)
                    .addComponent(jRadioButton99))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(jLabel75)
                    .addComponent(jRadioButton100)
                    .addComponent(jRadioButton101)
                    .addComponent(jRadioButton102))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(jLabel77)
                    .addComponent(jRadioButton103)
                    .addComponent(jRadioButton104)
                    .addComponent(jRadioButton105))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(jLabel79)
                    .addComponent(jRadioButton106)
                    .addComponent(jRadioButton107)
                    .addComponent(jRadioButton108))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(jLabel81)
                    .addComponent(jRadioButton109)
                    .addComponent(jRadioButton110)
                    .addComponent(jRadioButton111))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(jLabel84)
                    .addComponent(jRadioButton112)
                    .addComponent(jRadioButton113)
                    .addComponent(jRadioButton114))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(jLabel86)
                    .addComponent(jRadioButton115)
                    .addComponent(jRadioButton116)
                    .addComponent(jRadioButton117))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel88)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(jLabel89)
                    .addComponent(jRadioButton118)
                    .addComponent(jRadioButton119)
                    .addComponent(jRadioButton120))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(jLabel91)
                    .addComponent(jRadioButton121)
                    .addComponent(jRadioButton122)
                    .addComponent(jRadioButton123))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel163)
                    .addComponent(jLabel164)
                    .addComponent(jRadioButton169)
                    .addComponent(jRadioButton170)
                    .addComponent(jRadioButton171))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(jLabel93)
                    .addComponent(jRadioButton124)
                    .addComponent(jRadioButton125)
                    .addComponent(jRadioButton126))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96)
                    .addComponent(jLabel95)
                    .addComponent(jRadioButton127)
                    .addComponent(jRadioButton128)
                    .addComponent(jRadioButton129))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel98)
                    .addComponent(jLabel97)
                    .addComponent(jRadioButton130)
                    .addComponent(jRadioButton131)
                    .addComponent(jRadioButton132))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonGroup47.add(jRadioButton135);
        jRadioButton135.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton135.setText("OTM");
        jRadioButton135.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton135ActionPerformed(evt);
            }
        });

        buttonGroup47.add(jRadioButton133);
        jRadioButton133.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton133.setText("DP");
        jRadioButton133.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton133ActionPerformed(evt);
            }
        });

        jLabel100.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel100.setText("jLabel2");

        jLabel99.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel99.setText("Health provision & water supply (3258115) :");

        buttonGroup47.add(jRadioButton134);
        jRadioButton134.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton134.setText("RFQ");
        jRadioButton134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton134ActionPerformed(evt);
            }
        });

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel101.setText("Electrical installation (3258119) :");

        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel102.setText("jLabel2");

        buttonGroup48.add(jRadioButton136);
        jRadioButton136.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton136.setText("DP");
        jRadioButton136.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton136ActionPerformed(evt);
            }
        });

        buttonGroup48.add(jRadioButton137);
        jRadioButton137.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton137.setText("RFQ");
        jRadioButton137.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton137ActionPerformed(evt);
            }
        });

        buttonGroup48.add(jRadioButton138);
        jRadioButton138.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton138.setText("OTM");
        jRadioButton138.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton138ActionPerformed(evt);
            }
        });

        jLabel103.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel103.setText("Fitting & fixing (3258127) :");

        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel104.setText("jLabel2");

        buttonGroup49.add(jRadioButton139);
        jRadioButton139.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton139.setText("DP");
        jRadioButton139.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton139ActionPerformed(evt);
            }
        });

        buttonGroup49.add(jRadioButton140);
        jRadioButton140.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton140.setText("RFQ");
        jRadioButton140.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton140ActionPerformed(evt);
            }
        });

        buttonGroup49.add(jRadioButton141);
        jRadioButton141.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton141.setText("OTM");
        jRadioButton141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton141ActionPerformed(evt);
            }
        });

        jLabel105.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel105.setText("Recurring tranfer that are not classified elsewhere");

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel106.setText("Land development tax (3821102) :");

        jLabel107.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel107.setText("jLabel2");

        buttonGroup50.add(jRadioButton142);
        jRadioButton142.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton142.setText("DP");
        jRadioButton142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton142ActionPerformed(evt);
            }
        });

        buttonGroup50.add(jRadioButton143);
        jRadioButton143.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton143.setText("RFQ");
        jRadioButton143.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton143ActionPerformed(evt);
            }
        });

        buttonGroup50.add(jRadioButton144);
        jRadioButton144.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton144.setText("OTM");
        jRadioButton144.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton144ActionPerformed(evt);
            }
        });

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel108.setText("Municipality (3821103) :");

        jLabel109.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel109.setText("jLabel2");

        buttonGroup51.add(jRadioButton145);
        jRadioButton145.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton145.setText("DP");
        jRadioButton145.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton145ActionPerformed(evt);
            }
        });

        buttonGroup51.add(jRadioButton146);
        jRadioButton146.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton146.setText("RFQ");
        jRadioButton146.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton146ActionPerformed(evt);
            }
        });

        buttonGroup51.add(jRadioButton147);
        jRadioButton147.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton147.setText("OTM");
        jRadioButton147.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton147ActionPerformed(evt);
            }
        });

        jLabel110.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel110.setText("Scholarship (3821117) :");

        jLabel111.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel111.setText("jLabel2");

        buttonGroup52.add(jRadioButton148);
        jRadioButton148.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton148.setText("DP");
        jRadioButton148.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton148ActionPerformed(evt);
            }
        });

        buttonGroup52.add(jRadioButton149);
        jRadioButton149.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton149.setText("RFQ");
        jRadioButton149.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton149ActionPerformed(evt);
            }
        });

        buttonGroup52.add(jRadioButton150);
        jRadioButton150.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton150.setText("OTM");
        jRadioButton150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton150ActionPerformed(evt);
            }
        });

        jLabel112.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel112.setText("Equipments & tools");

        jLabel113.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel113.setText("Computer & accessories (4112202) :");

        jLabel114.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel114.setText("jLabel2");

        buttonGroup53.add(jRadioButton151);
        jRadioButton151.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton151.setText("DP");
        jRadioButton151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton151ActionPerformed(evt);
            }
        });

        buttonGroup53.add(jRadioButton152);
        jRadioButton152.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton152.setText("RFQ");
        jRadioButton152.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton152ActionPerformed(evt);
            }
        });

        buttonGroup53.add(jRadioButton153);
        jRadioButton153.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton153.setText("OTM");
        jRadioButton153.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton153ActionPerformed(evt);
            }
        });

        jLabel115.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel115.setText("Engineering & other equipment (4112304) :");

        jLabel116.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel116.setText("jLabel2");

        buttonGroup54.add(jRadioButton154);
        jRadioButton154.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton154.setText("DP");
        jRadioButton154.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton154ActionPerformed(evt);
            }
        });

        buttonGroup54.add(jRadioButton155);
        jRadioButton155.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton155.setText("RFQ");
        jRadioButton155.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton155ActionPerformed(evt);
            }
        });

        buttonGroup54.add(jRadioButton156);
        jRadioButton156.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton156.setText("OTM");
        jRadioButton156.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton156ActionPerformed(evt);
            }
        });

        jLabel117.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel117.setText("Office equipment (4112310) :");

        jLabel118.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel118.setText("jLabel2");

        buttonGroup55.add(jRadioButton157);
        jRadioButton157.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton157.setText("DP");
        jRadioButton157.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton157ActionPerformed(evt);
            }
        });

        buttonGroup55.add(jRadioButton158);
        jRadioButton158.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton158.setText("RFQ");
        jRadioButton158.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton158ActionPerformed(evt);
            }
        });

        buttonGroup55.add(jRadioButton159);
        jRadioButton159.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton159.setText("OTM");
        jRadioButton159.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton159ActionPerformed(evt);
            }
        });

        jLabel119.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel119.setText("Education & teaching equipments (4112312) :");

        jLabel120.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel120.setText("jLabel2");

        buttonGroup56.add(jRadioButton160);
        jRadioButton160.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton160.setText("DP");
        jRadioButton160.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton160ActionPerformed(evt);
            }
        });

        buttonGroup56.add(jRadioButton161);
        jRadioButton161.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton161.setText("RFQ");
        jRadioButton161.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton161ActionPerformed(evt);
            }
        });

        buttonGroup56.add(jRadioButton162);
        jRadioButton162.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton162.setText("OTM");
        jRadioButton162.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton162ActionPerformed(evt);
            }
        });

        jLabel121.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel121.setText("Furniture (4112314) :");

        jLabel122.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel122.setText("jLabel2");

        buttonGroup57.add(jRadioButton163);
        jRadioButton163.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton163.setText("DP");
        jRadioButton163.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton163ActionPerformed(evt);
            }
        });

        buttonGroup57.add(jRadioButton164);
        jRadioButton164.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton164.setText("RFQ");
        jRadioButton164.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton164ActionPerformed(evt);
            }
        });

        buttonGroup57.add(jRadioButton165);
        jRadioButton165.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton165.setText("OTM");
        jRadioButton165.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton165ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel99)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton133)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton134)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton135))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel101)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton136)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton137)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton138))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel103)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton139)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton140)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton141))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel110)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton148)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton149)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton150))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel108)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton145)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton146)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton147))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel106)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton142)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton143)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton144))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel121)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jRadioButton163)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton164)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton165))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel119)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton160)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton161)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton162))
                        .addComponent(jLabel105)
                        .addComponent(jLabel112))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel117)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton157)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton158)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton159))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel115)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton154)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton155)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton156))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel113)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton151)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton152)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton153)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel99)
                    .addComponent(jLabel100)
                    .addComponent(jRadioButton133)
                    .addComponent(jRadioButton134)
                    .addComponent(jRadioButton135))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel101)
                    .addComponent(jLabel102)
                    .addComponent(jRadioButton136)
                    .addComponent(jRadioButton137)
                    .addComponent(jRadioButton138))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103)
                    .addComponent(jLabel104)
                    .addComponent(jRadioButton139)
                    .addComponent(jRadioButton140)
                    .addComponent(jRadioButton141))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel105)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106)
                    .addComponent(jLabel107)
                    .addComponent(jRadioButton142)
                    .addComponent(jRadioButton143)
                    .addComponent(jRadioButton144))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108)
                    .addComponent(jLabel109)
                    .addComponent(jRadioButton145)
                    .addComponent(jRadioButton146)
                    .addComponent(jRadioButton147))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel110)
                    .addComponent(jLabel111)
                    .addComponent(jRadioButton148)
                    .addComponent(jRadioButton149)
                    .addComponent(jRadioButton150))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel112)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel113)
                    .addComponent(jLabel114)
                    .addComponent(jRadioButton151)
                    .addComponent(jRadioButton152)
                    .addComponent(jRadioButton153))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel115)
                    .addComponent(jLabel116)
                    .addComponent(jRadioButton154)
                    .addComponent(jRadioButton155)
                    .addComponent(jRadioButton156))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel117)
                    .addComponent(jLabel118)
                    .addComponent(jRadioButton157)
                    .addComponent(jRadioButton158)
                    .addComponent(jRadioButton159))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel119)
                    .addComponent(jLabel120)
                    .addComponent(jRadioButton160)
                    .addComponent(jRadioButton161)
                    .addComponent(jRadioButton162))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel121)
                    .addComponent(jLabel122)
                    .addComponent(jRadioButton163)
                    .addComponent(jRadioButton164)
                    .addComponent(jRadioButton165))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));

        jLabel132.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel132.setText("APP");

        jLabel134.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel134.setText("DP       :");

        jLabel135.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel135.setText("RFQ     :");

        jLabel136.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel136.setText("OTM    :");

        jLabel137.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel137.setText("Others :");

        DP_app.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DP_app.setText("0");

        RFQ_app.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RFQ_app.setText("0");

        OTM_app.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        OTM_app.setText("0");

        Others_app.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Others_app.setText("0");

        jLabel142.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel142.setText("Purchased");

        jLabel143.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel143.setText("DP       :");

        jLabel144.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel144.setText("RFQ     :");

        jLabel145.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel145.setText("OTM    :");

        jLabel146.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel146.setText("Others :");

        Others_purchase.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Others_purchase.setText("0");

        OTM_purchase.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        OTM_purchase.setText("0");

        RFQ_purchase.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RFQ_purchase.setText("0");

        DP_purchase.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DP_purchase.setText("0");

        jLabel151.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel151.setText("RFQ     :");

        jLabel152.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel152.setText("OTM    :");

        OTM_remain.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        OTM_remain.setText("0");

        RFQ_remain.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RFQ_remain.setText("0");

        Others_remain.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Others_remain.setText("0");

        Dp_ramain.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Dp_ramain.setText("0");

        jLabel157.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel157.setText("Remaining");

        jLabel158.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel158.setText("DP       :");

        jLabel159.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel159.setText("Others :");

        jLabel133.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel133.setText("Total Bud :");

        total_gov_bud.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total_gov_bud.setText("0");

        jLabel138.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel138.setText("Total Remaining :");

        total_remain_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total_remain_label.setText("0");

        jLabel139.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel139.setText("Total Purchased :");

        Total_purc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Total_purc.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel135)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RFQ_app, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel136)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(OTM_app, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel137)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Others_app, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel134)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel132)
                                    .addComponent(DP_app, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel142))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel143)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(DP_purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel144)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(RFQ_purchase, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel145)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(OTM_purchase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel146)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Others_purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel158)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Dp_ramain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel151)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RFQ_remain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel157))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel152)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(OTM_remain, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel159)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Others_remain, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel133)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(total_gov_bud, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel139)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Total_purc, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel138)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total_remain_label, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel157)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel158)
                                .addComponent(Dp_ramain))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel151)
                                .addComponent(RFQ_remain))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel152)
                                .addComponent(OTM_remain))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel159)
                                .addComponent(Others_remain)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel132)
                                .addGap(132, 132, 132))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel134)
                                    .addComponent(DP_app))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel135)
                                    .addComponent(RFQ_app))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel136)
                                    .addComponent(OTM_app))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel137)
                                    .addComponent(Others_app)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel142)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel143)
                            .addComponent(DP_purchase))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel144)
                            .addComponent(RFQ_purchase))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel145)
                            .addComponent(OTM_purchase))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel146)
                            .addComponent(Others_purchase))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel133)
                    .addComponent(total_gov_bud)
                    .addComponent(jLabel139)
                    .addComponent(Total_purc)
                    .addComponent(jLabel138)
                    .addComponent(total_remain_label))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));

        save.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        show.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        show.setText("Show");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        Deselect.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Deselect.setText("Deselect");
        Deselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeselectActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Deselect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(show, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(save)
                .addGap(18, 18, 18)
                .addComponent(show)
                .addGap(18, 18, 18)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Deselect)
                .addGap(18, 18, 18)
                .addComponent(back)
                .addGap(25, 25, 25))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel123.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel123.setText("Calculation");

        jLabel124.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel124.setText("DP        :");

        jLabel125.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel125.setText("RFQ      :");

        jLabel126.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel126.setText("OTM     :");

        DP_cal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DP_cal.setText("0");

        RFQ_cal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RFQ_cal.setText("0");

        OTM_cal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        OTM_cal.setText("0");

        jLabel130.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel130.setText("Others :");

        Other_cal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Other_cal.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel123)
                        .addGap(251, 251, 251))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel130)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Other_cal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel126)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OTM_cal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel125, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DP_cal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RFQ_cal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(200, 200, 200))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel123)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DP_cal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel124, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(RFQ_cal, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel125)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OTM_cal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel126))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel130)
                    .addComponent(Other_cal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)))
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton47ActionPerformed
        if(j16==0)
        {
              if(i16==1)
            {
                DP = DP-value16;
                i16=0;
            }
            else if(k16==1)
            {
                OTM = OTM-value16;
                k16=0;
            }
            
                RFQ = RFQ + value16;
                j16=1;
                if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                          RFQ = RFQ - value16;
                          j16=0;
                         buttonGroup16.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton47ActionPerformed

    private void jRadioButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton55ActionPerformed
        if(i19==0)
        {
            if(j19==1)
            {
                RFQ = RFQ-value19;
                j19=0;
            }
            else if(k19==1)
            {
                OTM = OTM-value19;
                k19=0;
            }
           
                DP = DP + value19;
                i19=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                         DP = DP-value19;
                         i19=0;
                        buttonGroup19.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton55ActionPerformed

    private void jRadioButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton62ActionPerformed
        if(j21==0)
        {
              if(i21==1)
            {
                DP = DP-value21;
                i21=0;
            }
            else if(k21==1)
            {
                OTM = OTM-value21;
                k21=0;
            }
            
                RFQ = RFQ + value21;
                j21=1;
                if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                          RFQ = RFQ - value21;
                          j21=0;
                         buttonGroup21.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton62ActionPerformed

    private void jRadioButton136ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton136ActionPerformed
        if(i48==0)
        {
            if(j48==1)
            {
                RFQ = RFQ-value48;
                j48=0;
            }
            else if(k48==1)
            {
                OTM = OTM-value48;
                k48=0;
            }
           
                DP = DP + value48;
                i48=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                         DP = DP-value48;
                        i48=0;
                        buttonGroup48.clearSelection();
                        }
                   
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton136ActionPerformed

    private void jRadioButton145ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton145ActionPerformed
        if(i51==0)
        {
            if(j51==1)
            {
                RFQ = RFQ-value51;
                j51=0;
            }
            else if(k51==1)
            {
                OTM = OTM-value51;
                k51=0;
            }
           
                DP = DP + value51;
                i51=1;
                if(DP > 1000000)
                {
                     int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                         DP = DP-value51;
                        i51=0;
                        buttonGroup51.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton145ActionPerformed

    private void jRadioButton164ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton164ActionPerformed
        if(j57==0)
        {
              if(i57==1)
            {
                DP = DP-value57;
                i57=0;
            }
            else if(k57==1)
            {
                OTM = OTM-value57;
                k57=0;
            }
            
                RFQ = RFQ + value57;
                j57=1;
                if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                        RFQ = RFQ - value57;
                        j57=0;
                        buttonGroup57.clearSelection();
                        }
                  
                }
                
                calculation();
        }
    }//GEN-LAST:event_jRadioButton164ActionPerformed

    private void jRadioButton163ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton163ActionPerformed
       
	if(i57==0)
        {
            if(j57==1)
            {
                RFQ = RFQ-value57;
                j57=0;
            }
            else if(k57==1)
            {
                OTM = OTM-value57;
                k57=0;
            }
           
                DP = DP + value57;
                i57=1;
                if(DP > 1000000)
                {
                     int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                       DP = DP-value57;
                        i57=0;
                        buttonGroup57.clearSelection();
                        }
                    
                }
                
                calculation();
        }


    }//GEN-LAST:event_jRadioButton163ActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

        Update_and_save();
        try {
            String sql57 = "Insert into main_db_table select * from budgettable";
            pst = con.prepareStatement(sql57);
            pst.execute();
            }

        catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Database Error");
        }
        
        
        
    }//GEN-LAST:event_saveActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        String str1="DP";
        String str2="RFQ";
        String str3="OTM";
        String str4="Others";
        
        try
        {
            String ShowDatas = "Select SUM(BUDGET) from main_db_table where Procurement_method = '"+str1+"' ";
            rs = st.executeQuery(ShowDatas);
             if(rs.next())
            {   
                DP_app.setText(rs.getString("sum(BUDGET)"));
                DP_total = Integer.parseInt(rs.getString("sum(BUDGET)"));
                DP_cal.setText(rs.getString("sum(BUDGET)"));
                DP = DP_total;
            }
             String ShowDatas2 = "Select SUM(BUDGET) from main_db_table where Procurement_method = '"+str2+"' ";
             rs = st.executeQuery(ShowDatas2);
             if(rs.next())
            {
                RFQ_app.setText(rs.getString("sum(BUDGET)"));
                RFQ_total = Integer.parseInt(rs.getString("sum(BUDGET)"));
                RFQ_cal.setText(rs.getString("sum(BUDGET)"));
                RFQ = RFQ_total;
            }
             String ShowDatas3 = "Select SUM(BUDGET) from main_db_table where Procurement_method = '"+str3+"' ";
            rs = st.executeQuery(ShowDatas3);
             if(rs.next())
            {
                OTM_app.setText(rs.getString("sum(BUDGET)"));
                OTM_total = Integer.parseInt(rs.getString("sum(BUDGET)"));
                OTM_cal.setText(rs.getString("sum(BUDGET)"));
                OTM = OTM_total;
            }
             String ShowDatas4 = "Select SUM(BUDGET) from main_db_table where Procurement_method = '"+str4+"' ";
            rs = st.executeQuery(ShowDatas4);
             if(rs.next())
            {
                Others_app.setText(rs.getString("sum(BUDGET)"));
                Others_total = Integer.parseInt(rs.getString("sum(BUDGET)"));
                Other_cal.setText(rs.getString("sum(BUDGET)"));
            }
            String sql3 = "select sum(BUDGET) from main_db_table";
            rs = st.executeQuery(sql3);
            if(rs.next())
            {
                String sum = rs.getString("sum(BUDGET)");
                total_gov_bud.setText(sum);
            }
            
            /*while(rs.next()) {
                if(count==0)
                {
                DP_app.setText(rs.getString("budget"));
                DP_total = Integer.parseInt(rs.getString("budget"));
                }
                else if(count==1)
                {
                Others_app.setText(rs.getString("budget"));
                Others_total = Integer.parseInt(rs.getString("budget"));
                }
                else if(count==2)
                {
                OTM_app.setText(rs.getString("budget"));
                OTM_total = Integer.parseInt(rs.getString("budget"));
                }
                else if(count==3)
                {
                RFQ_app.setText(rs.getString("budget"));
                RFQ_total = Integer.parseInt(rs.getString("budget"));
                }
                count++;
            }*/

            Dp_ramain.setText(String.valueOf(DP_total-DP_pur_bud));
            RFQ_remain.setText(String.valueOf(RFQ_total-RFQ_pur_bud));
            OTM_remain.setText(String.valueOf(OTM_total-OTM_pur_bud));
            Others_remain.setText(String.valueOf(Others_total-Others_pur_bud));
            total_remain_label.setText(String.valueOf((DP_total-DP_pur_bud)+(RFQ_total-RFQ_pur_bud)+(OTM_total-OTM_pur_bud)+(Others_total-Others_pur_bud)));
            //purchase();
            Total_purc.setText(String.valueOf((DP_pur_bud+RFQ_pur_bud+ OTM_pur_bud+ Others_pur_bud)));
            
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Database Error");
        }
    }//GEN-LAST:event_showActionPerformed

    private void DeselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeselectActionPerformed
        if(i57==1)
        {
            DP = DP- value57;
             i57=0;
             buttonGroup57.clearSelection();
            jRadioButton163.setSelected(false);
            calculation();
        }
        else if(j57==1)
        {
            RFQ = RFQ - value57;
            j57=0;
            buttonGroup57.clearSelection();
            jRadioButton164.setSelected(false);
            calculation();
        }
         else if(k57==1)
        {
            OTM = OTM - value57;
           k57=0;
           buttonGroup57.clearSelection();
            jRadioButton165.setSelected(false);
            calculation();
        }
        else if(i56==1)
        {
            DP = DP- value56;
             i56=0;
             buttonGroup56.clearSelection();
            jRadioButton160.setSelected(false);
            calculation();
        }
        else if(j56==1)
        {
            RFQ = RFQ - value56;
            j56=0;
            buttonGroup56.clearSelection();
            jRadioButton161.setSelected(false);
            calculation();
        }
         else if(k56==1)
        {
            OTM = OTM - value56;
            k56=0;
            buttonGroup56.clearSelection();
            jRadioButton162.setSelected(false);
            calculation();
        }
        else if(i55==1)
        {
            DP = DP- value55;
             i55=0;
             buttonGroup55.clearSelection();
            jRadioButton157.setSelected(false);
            calculation();
        }
        else if(j55==1)
        {
            RFQ = RFQ - value55;
            j55=0;
            buttonGroup55.clearSelection();
            jRadioButton158.setSelected(false);
            calculation();
        }
         else if(k55==1)
        {
            OTM = OTM - value55;
            k55=0;
            buttonGroup55.clearSelection();
            jRadioButton159.setSelected(false);
            calculation();
        } 
        else if(i54==1)
        {
            DP = DP- value54;
             i54=0;
             buttonGroup54.clearSelection();
            jRadioButton154.setSelected(false);
            calculation();
        }
        else if(j54==1)
        {
            RFQ = RFQ - value54;
            j54=0;
            buttonGroup54.clearSelection();
            jRadioButton155.setSelected(false);
            calculation();
        }
         else if(k54==1)
        {
            OTM = OTM - value54;
            k54=0;
            buttonGroup54.clearSelection();
            jRadioButton156.setSelected(false);
            calculation();
        } 
         else if(i53==1)
        {
            DP = DP- value53;
             i53=0;
             buttonGroup53.clearSelection();
            jRadioButton151.setSelected(false);
            calculation();
        }
        else if(j53==1)
        {
            RFQ = RFQ - value53;
            j53=0;
            buttonGroup53.clearSelection();
            jRadioButton152.setSelected(false);
            calculation();
        }
         else if(k53==1)
        {
            OTM = OTM - value53;
            k53=0;
            buttonGroup53.clearSelection();
            jRadioButton153.setSelected(false);
            calculation();
        } 
         else if(i52==1)
        {
            DP = DP- value52;
             i52=0;
             buttonGroup52.clearSelection();
            jRadioButton148.setSelected(false);
            calculation();
        }
        else if(j52==1)
        {
            RFQ = RFQ - value52;
            j52=0;
            buttonGroup52.clearSelection();
            jRadioButton149.setSelected(false);
            calculation();
        }
         else if(k52==1)
        {
            OTM = OTM - value52;
            k52=0;
            buttonGroup52.clearSelection();
            jRadioButton150.setSelected(false);
            calculation();
        }
         else if(i51==1)
        {
            DP = DP- value51;
             i51=0;
             buttonGroup51.clearSelection();
            jRadioButton145.setSelected(false);
            calculation();
        }
        else if(j51==1)
        {
            RFQ = RFQ - value51;
            j51=0;
            buttonGroup51.clearSelection();
            jRadioButton146.setSelected(false);
            calculation();
        }
         else if(k51==1)
        {
            OTM = OTM - value51;
            k51=0;
            buttonGroup51.clearSelection();
            jRadioButton147.setSelected(false);
            calculation();
        } 
         else if(i50==1)
        {
            DP = DP- value50;
             i50=0;
             buttonGroup50.clearSelection();
            jRadioButton142.setSelected(false);
            calculation();
        }
        else if(j50==1)
        {
            RFQ = RFQ - value50;
            j50=0;
            buttonGroup50.clearSelection();
            jRadioButton143.setSelected(false);
            calculation();
        }
         else if(k50==1)
        {
            OTM = OTM - value50;
            k50=0;
            buttonGroup50.clearSelection();
            jRadioButton144.setSelected(false);
            calculation();
        } 
         else if(i49==1)
        {
            DP = DP- value49;
             i49=0;
             buttonGroup49.clearSelection();
            jRadioButton139.setSelected(false);
            calculation();
        }
        else if(j49==1)
        {
            RFQ = RFQ - value49;
            j49=0;
            buttonGroup49.clearSelection();
            jRadioButton140.setSelected(false);
            calculation();
        }
         else if(k49==1)
        {
            OTM = OTM - value49;
            k49=0;
            buttonGroup49.clearSelection();
            jRadioButton141.setSelected(false);
            calculation();
        } 
         else if(i48==1)
        {
            DP = DP- value48;
             i48=0;
             buttonGroup48.clearSelection();
            jRadioButton136.setSelected(false);
            calculation();
        }
        else if(j48==1)
        {
            RFQ = RFQ - value48;
            j48=0;
            buttonGroup48.clearSelection();
            jRadioButton137.setSelected(false);
            calculation();
        }
         else if(k48==1)
        {
            OTM = OTM - value48;
            k48=0;
            buttonGroup48.clearSelection();
            jRadioButton138.setSelected(false);
            calculation();
        }
         else if(i47==1)
        {
            DP = DP- value47;
             i47=0;
             buttonGroup47.clearSelection();
            jRadioButton133.setSelected(false);
            calculation();
        }
        else if(j47==1)
        {
            RFQ = RFQ - value47;
            j47=0;
            buttonGroup47.clearSelection();
            jRadioButton134.setSelected(false);
            calculation();
        }
         else if(k47==1)
        {
            OTM = OTM - value47;
            k47=0;
            buttonGroup47.clearSelection();
            jRadioButton135.setSelected(false);
            calculation();
        }
         else if(i46==1)
        {
            DP = DP- value46;
             i46=0;
             buttonGroup46.clearSelection();
            jRadioButton130.setSelected(false);
            calculation();
        }
        else if(j46==1)
        {
            RFQ = RFQ - value46;
            j46=0;
            buttonGroup46.clearSelection();
            jRadioButton131.setSelected(false);
            calculation();
        }
         else if(k46==1)
        {
            OTM = OTM - value46;
            k46=0;
            buttonGroup46.clearSelection();
            jRadioButton132.setSelected(false);
            calculation();
        }
         else if(i45==1)
        {
            DP = DP- value45;
             i45=0;
             buttonGroup45.clearSelection();
            jRadioButton127.setSelected(false);
            calculation();
        }
        else if(j45==1)
        {
            RFQ = RFQ - value45;
            j45=0;
            buttonGroup45.clearSelection();
            jRadioButton128.setSelected(false);
            calculation();
        }
         else if(k45==1)
        {
            OTM = OTM - value45;
            k45=0;
            buttonGroup45.clearSelection();
            jRadioButton129.setSelected(false);
            calculation();
        } 
         else if(i44==1)
        {
            DP = DP- value44;
             i44=0;
             buttonGroup44.clearSelection();
            jRadioButton124.setSelected(false);
            calculation();
        }
        else if(j44==1)
        {
            RFQ = RFQ - value44;
            j44=0;
            buttonGroup44.clearSelection();
            jRadioButton125.setSelected(false);
            calculation();
        }
         else if(k44==1)
        {
            OTM = OTM - value44;
            k44=0;
            buttonGroup44.clearSelection();
            jRadioButton126.setSelected(false);
            calculation();
        } 
         else if(i43==1)
        {
            DP = DP- value43;
             i43=0;
             buttonGroup43.clearSelection();
            jRadioButton169.setSelected(false);
            calculation();
        }
        else if(j43==1)
        {
            RFQ = RFQ - value43;
            j43=0;
            buttonGroup43.clearSelection();
            jRadioButton170.setSelected(false);
            calculation();
            
        }
         else if(k43==1)
        {
            OTM = OTM - value43;
            k43=0;
            buttonGroup43.clearSelection();
            jRadioButton171.setSelected(false);
            calculation();
        }
         else if(i42==1)
        {
            DP = DP- value42;
             i42=0;
             buttonGroup42.clearSelection();
            jRadioButton121.setSelected(false);
            calculation();
        }
        else if(j42==1)
        {
            RFQ = RFQ - value42;
            j42=0;
            buttonGroup42.clearSelection();
            jRadioButton122.setSelected(false);
            calculation();
        }
         else if(k42==1)
        {
            OTM = OTM - value42;
            k42=0;
            buttonGroup42.clearSelection();
            jRadioButton123.setSelected(false);
            calculation();
        } 
         else if(i41==1)
        {
            DP = DP- value41;
             i41=0;
             buttonGroup41.clearSelection();
            jRadioButton118.setSelected(false);
            calculation();
        }
        else if(j41==1)
        {
            RFQ = RFQ - value41;
            j41=0;
            buttonGroup41.clearSelection();
            jRadioButton119.setSelected(false);
            calculation();
        }
         else if(k41==1)
        {
            OTM = OTM - value41;
            k41=0;
            buttonGroup41.clearSelection();
            jRadioButton120.setSelected(false);
            calculation();
        }
          else if(i40==1)
        {
            DP = DP- value40;
             i40=0;
             buttonGroup40.clearSelection();
            jRadioButton115.setSelected(false);
            calculation();
        }
        else if(j40==1)
        {
            RFQ = RFQ - value40;
            j40=0;
            buttonGroup40.clearSelection();
            jRadioButton116.setSelected(false);
            calculation();
        }
         else if(k40==1)
        {
            OTM = OTM - value40;
            k40=0;
            buttonGroup40.clearSelection();
            jRadioButton117.setSelected(false);
            calculation();
        }
         else if(i39==1)
        {
            DP = DP- value39;
             i39=0;
             buttonGroup39.clearSelection();
            jRadioButton112.setSelected(false);
            calculation();
        }
        else if(j39==1)
        {
            RFQ = RFQ - value39;
            j39=0;
            buttonGroup39.clearSelection();
            jRadioButton113.setSelected(false);
            calculation();
        }
         else if(k39==1)
        {
            OTM = OTM - value39;
            k39=0;
            buttonGroup39.clearSelection();
            jRadioButton114.setSelected(false);
            calculation();
        }
         else if(i38==1)
        {
            DP = DP- value38;
             i38=0;
             buttonGroup38.clearSelection();
            jRadioButton109.setSelected(false);
            calculation();
        }
        else if(j38==1)
        {
            RFQ = RFQ - value38;
            j38=0;
            buttonGroup38.clearSelection();
            jRadioButton110.setSelected(false);
            calculation();
        }
         else if(k38==1)
        {
            OTM = OTM - value38;
            k38=0;
            buttonGroup38.clearSelection();
            jRadioButton111.setSelected(false);
            calculation();
        } 
         else if(i37==1)
        {
            DP = DP- value37;
             i37=0;
             buttonGroup37.clearSelection();
            jRadioButton106.setSelected(false);
            calculation();
        }
        else if(j37==1)
        {
            RFQ = RFQ - value37;
            j37=0;
            buttonGroup37.clearSelection();
            jRadioButton107.setSelected(false);
            calculation();
        }
         else if(k37==1)
        {
            OTM = OTM - value37;
            k37=0;
            buttonGroup37.clearSelection();
            jRadioButton108.setSelected(false);
            calculation();
        } 
         else if(i36==1)
        {
            DP = DP- value36;
             i36=0;
             buttonGroup36.clearSelection();
            jRadioButton103.setSelected(false);
            calculation();
        }
        else if(j36==1)
        {
            RFQ = RFQ - value36;
            j36=0;
            buttonGroup36.clearSelection();
            jRadioButton104.setSelected(false);
            calculation();
        }
         else if(k36==1)
        {
            OTM = OTM - value36;
            k36=0;
            buttonGroup36.clearSelection();
            jRadioButton105.setSelected(false);
            calculation();
        } 
         else if(i35==1)
        {
            DP = DP- value35;
             i35=0;
             buttonGroup35.clearSelection();
            jRadioButton100.setSelected(false);
            calculation();
        }
        else if(j35==1)
        {
            RFQ = RFQ - value35;
            j35=0;
            buttonGroup35.clearSelection();
            jRadioButton101.setSelected(false);
            calculation();
        }
         else if(k35==1)
        {
            OTM = OTM - value35;
            k35=0;
            buttonGroup35.clearSelection();
            jRadioButton102.setSelected(false);
            calculation();
        } 
        else if(i34==1)
        {
            DP = DP- value34;
             i34=0;
             buttonGroup34.clearSelection();
            jRadioButton97.setSelected(false);
            calculation();
        }
        else if(j34==1)
        {
            RFQ = RFQ - value34;
            j34=0;
            buttonGroup34.clearSelection();
            jRadioButton98.setSelected(false);
            calculation();
        }
         else if(k34==1)
        {
            OTM = OTM - value34;
            k34=0;
            buttonGroup34.clearSelection();
            jRadioButton99.setSelected(false);
            calculation();
        }
        else if(i33==1)
        {
            DP = DP- value33;
             i33=0;
             buttonGroup33.clearSelection();
            jRadioButton94.setSelected(false);
            calculation();
        }
        else if(j33==1)
        {
            RFQ = RFQ - value33;
            j33=0;
            buttonGroup33.clearSelection();
            jRadioButton95.setSelected(false);
            calculation();
        }
         else if(k33==1)
        {
            OTM = OTM - value33;
            k33=0;
            buttonGroup33.clearSelection();
            jRadioButton96.setSelected(false);
            calculation();
        } 
         else if(i32==1)
        {
            DP = DP- value32;
             i32=0;
             buttonGroup32.clearSelection();
            jRadioButton91.setSelected(false);
            calculation();
        }
        else if(j32==1)
        {
            RFQ = RFQ - value32;
            j32=0;
            buttonGroup32.clearSelection();
            jRadioButton92.setSelected(false);
            calculation();
        }
         else if(k32==1)
        {
            OTM = OTM - value32;
            k32=0;
            buttonGroup32.clearSelection();
            jRadioButton93.setSelected(false);
            calculation();
        } 
         else if(i31==1)
        {
            DP = DP- value31;
             i31=0;
             buttonGroup31.clearSelection();
            jRadioButton88.setSelected(false);
            calculation();
        }
        else if(j31==1)
        {
            RFQ = RFQ - value31;
            j31=0;
            buttonGroup31.clearSelection();
            jRadioButton89.setSelected(false);
            calculation();
        }
         else if(k31==1)
        {
            OTM = OTM - value31;
            k31=0;
            buttonGroup31.clearSelection();
            jRadioButton90.setSelected(false);
            calculation();
        } 
        else if(i30==1)
        {
            DP = DP- value30;
             i30=0;
             buttonGroup30.clearSelection();
            jRadioButton85.setSelected(false);
            calculation();
        }
        else if(j30==1)
        {
            RFQ = RFQ - value30;
            j30=0;
            buttonGroup30.clearSelection();
            jRadioButton86.setSelected(false);
            calculation();
        }
         else if(k30==1)
        {
            OTM = OTM - value30;
            k30=0;
            buttonGroup30.clearSelection();
            jRadioButton87.setSelected(false);
            calculation();
        } 
         else if(i29==1)
        {
            DP = DP- value29;
             i29=0;
             buttonGroup29.clearSelection();
            jRadioButton82.setSelected(false);
            calculation();
        }
        else if(j29==1)
        {
            RFQ = RFQ - value29;
            j29=0;
            buttonGroup29.clearSelection();
            jRadioButton83.setSelected(false);
            calculation();
        }
         else if(k29==1)
        {
            OTM = OTM - value29;
            k29=0;
            buttonGroup29.clearSelection();
            jRadioButton84.setSelected(false);
            calculation();
        }
         else if(i28==1)
        {
            DP = DP- value28;
             i28=0;
             buttonGroup28.clearSelection();
            jRadioButton79.setSelected(false);
            calculation();
        }
        else if(j28==1)
        {
            RFQ = RFQ - value28;
            j28=0;
            buttonGroup28.clearSelection();
            jRadioButton80.setSelected(false);
            calculation();
        }
         else if(k28==1)
        {
            OTM = OTM - value28;
            k28=0;
            buttonGroup28.clearSelection();
            jRadioButton81.setSelected(false);
            calculation();
        }
         else if(i27==1)
        {
            DP = DP- value27;
             i27=0;
             buttonGroup27.clearSelection();
            jRadioButton76.setSelected(false);
            calculation();
        }
        else if(j27==1)
        {
            RFQ = RFQ - value27;
            j27=0;
            buttonGroup27.clearSelection();
            jRadioButton77.setSelected(false);
            calculation();
        }
         else if(k27==1)
        {
            OTM = OTM - value27;
            k27=0;
            buttonGroup27.clearSelection();
            jRadioButton78.setSelected(false);
            calculation();
        } 
         else if(i26==1)
        {
            DP = DP- value26;
             i26=0;
             buttonGroup26.clearSelection();
            jRadioButton73.setSelected(false);
            calculation();
        }
        else if(j26==1)
        {
            RFQ = RFQ - value26;
            j26=0;
            buttonGroup26.clearSelection();
            jRadioButton74.setSelected(false);
            calculation();
        }
         else if(k26==1)
        {
            OTM = OTM - value26;
            k26=0;
            buttonGroup26.clearSelection();
            jRadioButton75.setSelected(false);
            calculation();
        } 
        else if(i25==1)
        {
            DP = DP- value25;
             i25=0;
             buttonGroup25.clearSelection();
            jRadioButton166.setSelected(false);
            calculation();
        }
        else if(j25==1)
        {
            RFQ = RFQ - value25;
            j25=0;
            buttonGroup25.clearSelection();
            jRadioButton167.setSelected(false);
            calculation();
        }
         else if(k25==1)
        {
            OTM = OTM - value25;
            k25=0;
            buttonGroup25.clearSelection();
            jRadioButton168.setSelected(false);
            calculation();
        } 
         else if(i24==1)
        {
            DP = DP- value24;
             i24=0;
             buttonGroup24.clearSelection();
            jRadioButton70.setSelected(false);
            calculation();
        }
        else if(j24==1)
        {
            RFQ = RFQ - value24;
            j24=0;
            buttonGroup24.clearSelection();
            jRadioButton71.setSelected(false);
            calculation();
        }
         else if(k24==1)
        {
            OTM = OTM - value24;
            k24=0;
            buttonGroup24.clearSelection();
            jRadioButton72.setSelected(false);
            calculation();
        } 
         else if(i23==1)
        {
            DP = DP- value23;
             i23=0;
             buttonGroup23.clearSelection();
            jRadioButton67.setSelected(false);
            calculation();
        }
        else if(j23==1)
        {
            RFQ = RFQ - value23;
            j23=0;
            buttonGroup23.clearSelection();
            jRadioButton68.setSelected(false);
            calculation();
        }
         else if(k23==1)
        {
            OTM = OTM - value23;
            k23=0;
            buttonGroup23.clearSelection();
            jRadioButton69.setSelected(false);
            calculation();
        }
          else if(i22==1)
        {
            DP = DP- value22;
             i22=0;
             buttonGroup22.clearSelection();
            jRadioButton64.setSelected(false);
            calculation();
        }
        else if(j22==1)
        {
            RFQ = RFQ - value22;
            j22=0;
            buttonGroup22.clearSelection();
            jRadioButton65.setSelected(false);
            calculation();
        }
         else if(k22==1)
        {
            OTM = OTM - value22;
            k22=0;
            buttonGroup22.clearSelection();
            jRadioButton66.setSelected(false);
            calculation();
        } 
         else if(i21==1)
        {
            DP = DP- value21;
             i21=0;
             buttonGroup21.clearSelection();
            jRadioButton61.setSelected(false);
            calculation();
        }
        else if(j21==1)
        {
            RFQ = RFQ - value21;
            j21=0;
            buttonGroup21.clearSelection();
            jRadioButton62.setSelected(false);
            calculation();
        }
         else if(k21==1)
        {
            OTM = OTM - value21;
            k21=0;
            buttonGroup21.clearSelection();
            jRadioButton63.setSelected(false);
            calculation();
        }
         else if(i20==1)
        {
             DP = DP- value20;
            i20=0;
            buttonGroup20.clearSelection();
            jRadioButton58.setSelected(false);
            calculation();
        }
        else if(j20==1)
        {
            RFQ = RFQ - value20;
            j20=0;
            buttonGroup20.clearSelection();
            jRadioButton59.setSelected(false);
            calculation();
        }
         else if(k20==1)
        {
            OTM = OTM - value20;
            k20=0;
            buttonGroup20.clearSelection();
            jRadioButton60.setSelected(false);
            calculation();
        }
         else if(i19==1)
        {
             DP = DP- value19;
            i19=0;
            buttonGroup19.clearSelection();
            jRadioButton55.setSelected(false);
            calculation();
        }
        else if(j19==1)
        {
            RFQ = RFQ - value19;
            j19=0;
            buttonGroup19.clearSelection();
            jRadioButton56.setSelected(false);
            calculation();
        }
         else if(k19==1)
        {
            OTM = OTM - value19;
            k19=0;
            buttonGroup19.clearSelection();
            jRadioButton57.setSelected(false);
            calculation();
        } 
         else if(i18==1)
        {
             DP = DP- value18;
            i18=0;
            buttonGroup18.clearSelection();
            jRadioButton52.setSelected(false);
            calculation();
        }
        else if(j18==1)
        {
            RFQ = RFQ - value18;
            j18=0;
            buttonGroup18.clearSelection();
            jRadioButton53.setSelected(false);
            calculation();
        }
         else if(k18==1)
        {
            OTM = OTM - value18;
            k18=0;
            buttonGroup18.clearSelection();
            jRadioButton54.setSelected(false);
            calculation();
        }
        else if(i17==1)
        {
             DP = DP- value17;
            i17=0;
            buttonGroup17.clearSelection();
            jRadioButton49.setSelected(false);
            calculation();
        }
        else if(j17==1)
        {
            RFQ = RFQ - value17;
            j17=0;
            buttonGroup17.clearSelection();
            jRadioButton50.setSelected(false);
            calculation();
        }
         else if(k17==1)
        {
            OTM = OTM - value17;
            k17=0;
            buttonGroup17.clearSelection();
            jRadioButton51.setSelected(false);
            calculation();
        } 
         else if(i16==1)
        {
             DP = DP- value16;
            i16=0;
            buttonGroup16.clearSelection();
            jRadioButton46.setSelected(false);
            calculation();
        }
        else if(j16==1)
        {
            RFQ = RFQ - value16;
            j16=0;
            buttonGroup16.clearSelection();
            jRadioButton47.setSelected(false);
            calculation();
        }
         else if(k16==1)
        {
            OTM = OTM - value16;
            k16=0;
            buttonGroup16.clearSelection();
            jRadioButton48.setSelected(false);
            calculation();
        } 
         else if(i15==1)
        {
             DP = DP- value15;
            i15=0;
            buttonGroup15.clearSelection();
            jRadioButton43.setSelected(false);
            calculation();
        }
        else if(j15==1)
        {
            RFQ = RFQ - value15;
            j15=0;
            buttonGroup15.clearSelection();
            jRadioButton44.setSelected(false);
            calculation();
        }
         else if(k15==1)
        {
            OTM = OTM - value15;
            k15=0;
            buttonGroup15.clearSelection();
            jRadioButton45.setSelected(false);
            calculation();
        } 
         else if(i14==1)
        {
             DP = DP- value14;
            i14=0;
            buttonGroup14.clearSelection();
            jRadioButton40.setSelected(false);
            calculation();
        }
        else if(j14==1)
        {
            RFQ = RFQ - value14;
            j14=0;
            buttonGroup14.clearSelection();
            jRadioButton41.setSelected(false);
            calculation();
        }
         else if(k14==1)
        {
            OTM = OTM - value14;
            k14=0;
            buttonGroup14.clearSelection();
            jRadioButton42.setSelected(false);
            calculation();
        } 
         else if(i13==1)
        {
             DP = DP- value13;
            i13=0;
            buttonGroup13.clearSelection();
            jRadioButton37.setSelected(false);
            calculation();
        }
        else if(j13==1)
        {
            RFQ = RFQ - value13;
            j13=0;
            buttonGroup13.clearSelection();
            jRadioButton38.setSelected(false);
            calculation();
        }
         else if(k13==1)
        {
            OTM = OTM - value13;
            k13=0;
            buttonGroup13.clearSelection();
            jRadioButton39.setSelected(false);
            calculation();
        } 
         else if(i12==1)
        {
             DP = DP- value12;
            i12=0;
            buttonGroup12.clearSelection();
            jRadioButton34.setSelected(false);
            calculation();
        }
        else if(j12==1)
        {
            RFQ = RFQ - value12;
            j12=0;
            buttonGroup12.clearSelection();
            jRadioButton35.setSelected(false);
            calculation();
        }
         else if(k12==1)
        {
            OTM = OTM - value12;
            k12=0;
            buttonGroup12.clearSelection();
            jRadioButton36.setSelected(false);
            calculation();
        } 
         else if(i11==1)
        {
             DP = DP- value11;
            i11=0;
            buttonGroup11.clearSelection();
            jRadioButton31.setSelected(false);
            calculation();
        }
        else if(j11==1)
        {
            RFQ = RFQ - value11;
            j11=0;
            buttonGroup11.clearSelection();
            jRadioButton32.setSelected(false);
            calculation();
        }
         else if(k11==1)
        {
            OTM = OTM - value11;
            k11=0;
            buttonGroup11.clearSelection();
            jRadioButton33.setSelected(false);
            calculation();
        } 
         else if(i10==1)
        {
             DP = DP- value10;
            i10=0;
            buttonGroup10.clearSelection();
            jRadioButton28.setSelected(false);
            calculation();
        }
        else if(j10==1)
        {
            RFQ = RFQ - value10;
            j10=0;
            buttonGroup10.clearSelection();
            jRadioButton29.setSelected(false);
            calculation();
        }
         else if(k10==1)
        {
            OTM = OTM - value10;
            k10=0;
            buttonGroup10.clearSelection();
            jRadioButton30.setSelected(false);
            calculation();
        } 
         else if(i9==1)
        {
             DP = DP- value9;
            i9=0;
            buttonGroup9.clearSelection();
            jRadioButton25.setSelected(false);
            calculation();
        }
        else if(j9==1)
        {
            RFQ = RFQ - value9;
            j9=0;
            buttonGroup9.clearSelection();
            jRadioButton26.setSelected(false);
            calculation();
        }
         else if(k9==1)
        {
            OTM = OTM - value9;
            k9=0;
            buttonGroup9.clearSelection();
            jRadioButton27.setSelected(false);
            calculation();
        }
        else if(i8==1)
        {
             DP = DP- value8;
            i8=0;
            buttonGroup8.clearSelection();
            jRadioButton22.setSelected(false);
            calculation();
        }
        else if(j8==1)
        {
            RFQ = RFQ - value8;
            j8=0;
            buttonGroup8.clearSelection();
            jRadioButton23.setSelected(false);
            calculation();
        }
         else if(k8==1)
        {
            OTM = OTM - value8;
            k8=0;
            buttonGroup8.clearSelection();
            jRadioButton24.setSelected(false);
            calculation();
        } 
          else if(i7==1)
        {
             DP = DP- value7;
            i7=0;
            buttonGroup7.clearSelection();
            jRadioButton19.setSelected(false);
            calculation();
        }
        else if(j7==1)
        {
            RFQ = RFQ - value7;
            j7=0;
            buttonGroup7.clearSelection();
            jRadioButton20.setSelected(false);
            calculation();
        }
         else if(k7==1)
        {
            OTM = OTM - value7;
            k7=0;
            buttonGroup7.clearSelection();
            jRadioButton21.setSelected(false);
            calculation();
        } 
         else if(i6==1)
        {
            DP = DP- value6;
            i6=0;
            buttonGroup6.clearSelection();
            jRadioButton16.setSelected(false);
            calculation();
        }
        else if(j6==1)
        {
            RFQ = RFQ - value6;
            j6=0;
            buttonGroup6.clearSelection();
            jRadioButton17.setSelected(false);
            calculation();
        }
         else if(k6==1)
        {
            OTM = OTM - value6;
            k6=0;
            buttonGroup6.clearSelection();
            jRadioButton18.setSelected(false);
            calculation();
        } 
         else if(i5==1)
        {
             DP = DP- value5;
            i5=0;
            buttonGroup5.clearSelection();
            jRadioButton13.setSelected(false);
            calculation();
        }
        else if(j5==1)
        {
            RFQ = RFQ - value5;
            j5=0;
            buttonGroup5.clearSelection();
            jRadioButton14.setSelected(false);
            calculation();
        }
         else if(k5==1)
        {
            OTM = OTM - value5;
            k5=0;
            buttonGroup5.clearSelection();
            jRadioButton15.setSelected(false);
            calculation();
        } 
        else if(i4==1)
        {
             DP = DP- value4;
            i4=0;
            buttonGroup4.clearSelection();
            jRadioButton10.setSelected(false);
            calculation();
        }
        else if(j4==1)
        {
            RFQ = RFQ - value4;
            j4=0;
            buttonGroup4.clearSelection();
            jRadioButton11.setSelected(false);
            calculation();
        }
         else if(k4==1)
        {
            OTM = OTM - value4;
            k4=0;
            buttonGroup4.clearSelection();
            jRadioButton12.setSelected(false);
            calculation();
        } 
        else if(i3==1)
        {
            DP = DP- value3;
            i3=0;
            buttonGroup3.clearSelection();
            jRadioButton7.setSelected(false);
            calculation();
        }
        else if(j3==1)
        {
            RFQ = RFQ - value3;
            j3=0;
            buttonGroup3.clearSelection();
            jRadioButton8.setSelected(false);
            calculation();
        }
         else if(k3==1)
        {
            OTM = OTM - value3;
            k3=0;
            buttonGroup3.clearSelection();
            jRadioButton9.setSelected(false);
            calculation();
        } 
        else if(i2==1)
        {
            DP = DP- value2;
            i2=0;
            buttonGroup2.clearSelection();
            jRadioButton4.setSelected(false);
            calculation();
        }
        else if(j2==1)
        {
            RFQ = RFQ - value2;
            j2=0;
            buttonGroup2.clearSelection();
            jRadioButton5.setSelected(false);
            calculation();
        }
         else if(k2==1)
        {
            OTM = OTM - value2;
            k2=0;
            buttonGroup2.clearSelection();
            jRadioButton6.setSelected(false);
            calculation();
        } 
        else if(i1==1)
        {
            DP = DP- value1;
            i1=0;
            buttonGroup1.clearSelection();
            jRadioButton1.setSelected(false);
            calculation();
        }
        else if(j1==1)
        {
            RFQ = RFQ - value1;
            j1=0;
            buttonGroup1.clearSelection();
            jRadioButton2.setSelected(false);
            calculation();
        }
        else if(k1==1)
        {
            OTM = OTM - value1;
            k1=0;
            buttonGroup1.clearSelection();
            jRadioButton3.setSelected(false);
            calculation();
        }
        
    }//GEN-LAST:event_DeselectActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if (i1 == 0) {
            if (j1 == 1) {
                RFQ = RFQ - value1;
                j1 = 0;
            } else if (k1 == 1) {
                OTM = OTM - value1;
                k1 = 0;
            }

            DP = DP + value1;
            i1 = 1;
            if(DP > 1000000)
            {
                int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                        DP = DP-value1;
                        i1 = 0;
                        buttonGroup1.clearSelection();
                        }
                
            }
            
            calculation();
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if (j1 == 0) {
            if (i1 == 1) {
                DP = DP - value1;
                i1 = 0;
            } else if (k1 == 1) {
                OTM = OTM - value1;
                k1 = 0;
            }

            RFQ = RFQ + value1;
            j1 = 1;
             if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                        RFQ = RFQ - value1;
                        j1=0;
                        buttonGroup1.clearSelection();
                        }
                    
                }
            
            calculation();
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        if (k1 == 0) {
            if (i1 == 1) {
                DP = DP - value1;
                i1 = 0;
            } else if (j1 == 1) {
                RFQ = RFQ - value1;
                j1 = 0;
            }
            OTM = OTM + value1;
            k1 = 1;
            calculation();
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        if (i2 == 0) {
            if (j2 == 1) {
                RFQ = RFQ - value2;
                j2 = 0;
            } else if (k2 == 1) {
                OTM = OTM - value2;
                k2 = 0;
            }

            DP = DP + value2;
            i2 = 1;
            if(DP > 1000000)
            {
                int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                        DP = DP-value2;
                        i2 = 1;
                        buttonGroup2.clearSelection();
                        }
                
            }
            
            calculation();
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        if (j2 == 0) {
            if (i2 == 1) {
                DP = DP - value2;
                i2 = 0;
            } else if (k2 == 1) {
                OTM = OTM - value2;
                k2 = 0;
            }

            RFQ = RFQ + value2;
            j2 = 1;
             if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                        RFQ = RFQ - value2;
                        j2=0;
                        buttonGroup2.clearSelection();
                        }
                 
                }
            
            calculation();
        }
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        if (k2 == 0) {
            if (i2 == 1) {
                DP = DP - value2;
                i2 = 0;
            } else if (j2 == 1) {
                RFQ = RFQ - value2;
                j2 = 0;
            }
            OTM = OTM + value2;
            k2 = 1;
            calculation();
        }
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        if (i3 == 0) {
            if (j3 == 1) {
                RFQ = RFQ - value3;
                j3 = 0;
            } else if (k3 == 1) {
                OTM = OTM - value3;
                k3 = 0;
            }

            DP = DP + value3;
            i3 = 1;
            if(DP > 1000000)
            {
                int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                        DP = DP-value3;
                        i3 = 0;
                        buttonGroup3.clearSelection();
                        }
               
            }
            
            calculation();
        }
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        if (j3 == 0) {
            if (i3 == 1) {
                DP = DP - value3;
                i3 = 0;
            } else if (k3 == 1) {
                OTM = OTM - value3;
                k3 = 0;
            }

            RFQ = RFQ + value3;
            j3 = 1;
             if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                         RFQ = RFQ - value3;
                         j3=0;
                         buttonGroup3.clearSelection();
                        }
                    
                }
            
            calculation();
        }
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        if (k3 == 0) {
            if (i3 == 1) {
                DP = DP - value3;
                i3 = 0;
            } else if (j3 == 1) {
                RFQ = RFQ - value3;
                j3 = 0;
            }
            OTM = OTM + value3;
            k3 = 1;
            calculation();
        }
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        if (i4 == 0) {
            if (j4 == 1) {
                RFQ = RFQ - value4;
                j4 = 0;
            } else if (k4 == 1) {
                OTM = OTM - value4;
                k4 = 0;
            }

            DP = DP + value4;
            i4 = 1;
            if(DP > 1000000)
            {
                int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                        DP = DP-value4;
                        i4 = 0;
                        buttonGroup4.clearSelection();
                        }
            }
            
            calculation();
        }

    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        if (j4 == 0) {
            if (i4 == 1) {
                DP = DP - value4;
                i4 = 0;
            } else if (k4 == 1) {
                OTM = OTM - value4;
                k4 = 0;
            }

            RFQ = RFQ + value4;
            j4 = 1;
             if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                          RFQ = RFQ - value4;
                          j4=0;
                         buttonGroup4.clearSelection();
                        }
                   
                }
            
            calculation();
        }

    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        if (k4 == 0) {
            if (i4 == 1) {
                DP = DP - value4;
                i4 = 0;
            } else if (j4 == 1) {
                RFQ = RFQ - value4;
                j4 = 0;
            }
            OTM = OTM + value4;
            k4 = 1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        if (i5 == 0) {
            if (j5 == 1) {
                RFQ = RFQ - value5;
                j5 = 0;
            } else if (k5 == 1) {
                OTM = OTM - value5;
                k5 = 0;
            }

            DP = DP + value5;
            i5 = 1;
            if(DP > 1000000)
            {
                int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                        DP = DP-value5;
                        i5 = 0;
                        buttonGroup5.clearSelection();
                        }
                
            }
            
            calculation();
        }

    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        if (j5 == 0) {
            if (i5 == 1) {
                DP = DP - value5;
                i5 = 0;
            } else if (k5 == 1) {
                OTM = OTM - value5;
                k5 = 0;
            }

            RFQ = RFQ + value5;
            j5 = 1;
             if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                           RFQ = RFQ - value5;
                           j5=0;
                         buttonGroup5.clearSelection();
                        }
                }
            
            calculation();
        }

    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton15ActionPerformed
        if (k5 == 0) {
            if (i5 == 1) {
                DP = DP - value5;
                i5 = 0;
            } else if (j5 == 1) {
                RFQ = RFQ - value5;
                j5 = 0;
            }
            OTM = OTM + value5;
            k5 = 1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton15ActionPerformed

    private void jRadioButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton16ActionPerformed
        if (i6 == 0) {
            if (j6 == 1) {
                RFQ = RFQ - value6;
                j6 = 0;
            } else if (k6 == 1) {
                OTM = OTM - value6;
                k6 = 0;
            }

            DP = DP + value6;
            i6 = 1;
            if(DP > 1000000)
            {
                int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                        DP = DP-value6;
                        i6 = 0;
                        buttonGroup6.clearSelection();
                        }
                
            }
            
            calculation();
        }

    }//GEN-LAST:event_jRadioButton16ActionPerformed

    private void jRadioButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton17ActionPerformed
        if (j6 == 0) {
            if (i6 == 1) {
                DP = DP - value6;
                i6 = 0;
            } else if (k6 == 1) {
                OTM = OTM - value6;
                k6 = 0;
            }

            RFQ = RFQ + value6;
            j6 = 1;
             if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                           RFQ = RFQ - value6;
                           j6=0;
                         buttonGroup6.clearSelection();
                        }
                }
            
            calculation();
        }

    }//GEN-LAST:event_jRadioButton17ActionPerformed

    private void jRadioButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton18ActionPerformed
        if (k6 == 0) {
            if (i6 == 1) {
                DP = DP - value6;
                i6 = 0;
            } else if (j6 == 1) {
                RFQ = RFQ - value6;
                j6 = 0;
            }
            OTM = OTM + value6;
            k6 = 1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton18ActionPerformed

    private void jRadioButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton19ActionPerformed
        if (i7 == 0) {
            if (j7 == 1) {
                RFQ = RFQ - value7;
                j7 = 0;
            } else if (k7 == 1) {
                OTM = OTM - value7;
                k7 = 0;
            }

            DP = DP + value7;
            i7 = 1;
            if(DP > 1000000)
            {
                int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                        DP = DP-value7;
                        i7 = 0;
                        buttonGroup7.clearSelection();
                        }
                
            }
            
            calculation();
        }

    }//GEN-LAST:event_jRadioButton19ActionPerformed

    private void jRadioButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton20ActionPerformed
        if (j7 == 0) {
            if (i7 == 1) {
                DP = DP - value7;
                i7 = 0;
            } else if (k7 == 1) {
                OTM = OTM - value7;
                k7 = 0;
            }

            RFQ = RFQ + value7;
            j7 = 1;
             if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                          RFQ = RFQ - value7;
                          j7=0;
                         buttonGroup7.clearSelection();
                        }
                }
            
            calculation();
        }

    }//GEN-LAST:event_jRadioButton20ActionPerformed

    private void jRadioButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton21ActionPerformed
        if (k7 == 0) {
            if (i7 == 1) {
                DP = DP - value7;
                i7 = 0;
            } else if (j7 == 1) {
                RFQ = RFQ - value7;
                j7 = 0;
            }
            OTM = OTM + value7;
            k7 = 1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton21ActionPerformed

    private void jRadioButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton22ActionPerformed
        if (i8 == 0) {
            if (j8 == 1) {
                RFQ = RFQ - value8;
                j8 = 0;
            } else if (k8 == 1) {
                OTM = OTM - value8;
                k8 = 0;
            }

            DP = DP + value8;
            i8 = 1;
            if(DP > 1000000)
            {
                int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                        DP = DP-value8;
                        i8 = 0;
                        buttonGroup8.clearSelection();
                        }
                
            }
            
            calculation();
        }

    }//GEN-LAST:event_jRadioButton22ActionPerformed

    private void jRadioButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton23ActionPerformed
        if (j8 == 0) {
            if (i8 == 1) {
                DP = DP - value8;
                i8 = 0;
            } else if (k8 == 1) {
                OTM = OTM - value8;
                k8 = 0;
            }

            RFQ = RFQ + value8;
            j8 = 1;
             if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                          RFQ = RFQ - value8;
                          j8=0;
                         buttonGroup8.clearSelection();
                        }
                    
                }
            
            calculation();
        }

    }//GEN-LAST:event_jRadioButton23ActionPerformed

    private void jRadioButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton24ActionPerformed
        if (k8 == 0) {
            if (i8 == 1) {
                DP = DP - value8;
                i8 = 0;
            } else if (j8 == 1) {
                RFQ = RFQ - value8;
                j8 = 0;
            }
            OTM = OTM + value8;
            k8 = 1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton24ActionPerformed

    private void jRadioButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton25ActionPerformed
        if(i9==0)
        {
            if(j9==1)
            {
                RFQ = RFQ-value9;
                j9=0;
            }
            else if(k9==1)
            {
                OTM = OTM-value9;
                k9=0;
            }
           
                DP = DP + value9;
                i9=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                        DP = DP-value9;
                        i9=0;
                        buttonGroup9.clearSelection();
                        }
                    
                }
                
                calculation();
        }
    }//GEN-LAST:event_jRadioButton25ActionPerformed

    private void jRadioButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton26ActionPerformed
        if(j9==0)
        {
              if(i9==1)
            {
                DP = DP-value9;
                i9=0;
            }
            else if(k9==1)
            {
                OTM = OTM-value9;
                k9=0;
            }
            
                RFQ = RFQ + value9;
                j9=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                           RFQ = RFQ - value9;
                            j9=0;
                         buttonGroup9.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton26ActionPerformed

    private void jRadioButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton27ActionPerformed
        if(k9==0)
        {
            if(i9==1)
            {
                DP = DP-value9;
                i9=0;
            }
            else if(j9==1)
            {
                RFQ = RFQ-value9;
                j9=0;
            }
            OTM = OTM + value9;
            k9=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton27ActionPerformed

    private void jRadioButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton28ActionPerformed
        if(i10==0)
        {
            if(j10==1)
            {
                RFQ = RFQ-value10;
                j10=0;
            }
            else if(k10==1)
            {
                OTM = OTM-value10;
                k10=0;
            }
           
                DP = DP + value10;
                i10=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                        DP = DP-value10;
                        i10=0;
                        buttonGroup10.clearSelection();
                        }
                   
                }
                
                calculation();
        }
    }//GEN-LAST:event_jRadioButton28ActionPerformed

    private void jRadioButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton29ActionPerformed
        if(j10==0)
        {
              if(i10==1)
            {
                DP = DP-value10;
                i10=0;
            }
            else if(k10==1)
            {
                OTM = OTM-value10;
                k10=0;
            }
            
                RFQ = RFQ + value10;
                j10=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                           RFQ = RFQ - value10;
                           j10=0;
                         buttonGroup10.clearSelection();
                        }
                   
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton29ActionPerformed

    private void jRadioButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton30ActionPerformed
        if(k10==0)
        {
            if(i10==1)
            {
                DP = DP-value10;
                i10=0;
            }
            else if(j10==1)
            {
                RFQ = RFQ-value10;
                j10=0;
            }
            OTM = OTM + value10;
            k10=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton30ActionPerformed

    private void jRadioButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton31ActionPerformed
        if(i11==0)
        {
            if(j11==1)
            {
                RFQ = RFQ-value11;
                j11=0;
            }
            else if(k11==1)
            {
                OTM = OTM-value11;
                k11=0;
            }
           
                DP = DP + value11;
                i11=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                        DP = DP-value11;
                        i11=0;
                        buttonGroup11.clearSelection();
                        }
                   
                }
                
                calculation();
        }
    }//GEN-LAST:event_jRadioButton31ActionPerformed

    private void jRadioButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton32ActionPerformed
        if(j11==0)
        {
              if(i11==1)
            {
                DP = DP-value11;
                i11=0;
            }
            else if(k11==1)
            {
                OTM = OTM-value11;
                k11=0;
            }
            
                RFQ = RFQ + value11;
                j11=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                           RFQ = RFQ - value11;
                           j11=0;
                         buttonGroup11.clearSelection();
                        }
                   
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton32ActionPerformed

    private void jRadioButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton33ActionPerformed
        if(k11==0)
        {
            if(i11==1)
            {
                DP = DP-value11;
                i11=0;
            }
            else if(j11==1)
            {
                RFQ = RFQ-value11;
                j11=0;
            }
            OTM = OTM + value11;
            k11=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton33ActionPerformed

    private void jRadioButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton34ActionPerformed
        if(i12==0)
        {
            if(j12==1)
            {
                RFQ = RFQ-value12;
                j12=0;
            }
            else if(k12==1)
            {
                OTM = OTM-value12;
                k12=0;
            }
           
                DP = DP + value12;
                i12=1;
                if(DP > 1000000)
                {
                     int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                        DP = DP-value12;
                        i12=0;
                        buttonGroup12.clearSelection();
                        }
                   
                }
                
                calculation();
        }
    }//GEN-LAST:event_jRadioButton34ActionPerformed

    private void jRadioButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton35ActionPerformed
        if(j12==0)
        {
              if(i12==1)
            {
                DP = DP-value12;
                i12=0;
            }
            else if(k12==1)
            {
                OTM = OTM-value12;
                k12=0;
            }
            
                RFQ = RFQ + value12;
                j12=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                            RFQ = RFQ - value12;
                            j12=0;
                         buttonGroup12.clearSelection();
                        }
                   
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton35ActionPerformed

    private void jRadioButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton36ActionPerformed
        if(k12==0)
        {
            if(i12==1)
            {
                DP = DP-value12;
                i12=0;
            }
            else if(j12==1)
            {
                RFQ = RFQ-value12;
                j12=0;
            }
            OTM = OTM + value12;
            k12=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton36ActionPerformed

    private void jRadioButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton37ActionPerformed
        if(i13==0)
        {
            if(j13==1)
            {
                RFQ = RFQ-value13;
                j13=0;
            }
            else if(k13==1)
            {
                OTM = OTM-value13;
                k13=0;
            }
           
                DP = DP + value13;
                i13=1;
                if(DP > 1000000)
                {
                     int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                        DP = DP-value13;
                        i13=0;
                        buttonGroup13.clearSelection();
                        }
                   
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton37ActionPerformed

    private void jRadioButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton38ActionPerformed
        if(j13==0)
        {
              if(i13==1)
            {
                DP = DP-value13;
                i13=0;
            }
            else if(k13==1)
            {
                OTM = OTM-value13;
                k13=0;
            }
            
                RFQ = RFQ + value13;
                j13=1;
                 if(RFQ > 1500000)
                {
                     int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                            RFQ = RFQ - value13;
                            j13=0;
                         buttonGroup13.clearSelection();
                        }
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton38ActionPerformed

    private void jRadioButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton39ActionPerformed
        if(k13==0)
        {
            if(i13==1)
            {
                DP = DP-value13;
                i13=0;
            }
            else if(j13==1)
            {
                RFQ = RFQ-value13;
                j13=0;
            }
            OTM = OTM + value13;
            k13=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton39ActionPerformed

    private void jRadioButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton40ActionPerformed
        if(i14==0)
        {
            if(j14==1)
            {
                RFQ = RFQ-value14;
                j14=0;
            }
            else if(k14==1)
            {
                OTM = OTM-value14;
                k14=0;
            }
           
                DP = DP + value14;
                i14=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                        DP = DP-value14;
                        i14=0;
                        buttonGroup14.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton40ActionPerformed

    private void jRadioButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton41ActionPerformed
        if(j14==0)
        {
              if(i14==1)
            {
                DP = DP-value14;
                i14=0;
            }
            else if(k14==1)
            {
                OTM = OTM-value14;
                k14=0;
            }
            
                RFQ = RFQ + value14;
                j14=1;
                 if(RFQ > 1500000)
                {
                     int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                           RFQ = RFQ - value14;
                           j14=0;
                         buttonGroup14.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton41ActionPerformed

    private void jRadioButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton42ActionPerformed
        if(k14==0)
        {
            if(i14==1)
            {
                DP = DP-value14;
                i14=0;
            }
            else if(j14==1)
            {
                RFQ = RFQ-value14;
                j14=0;
            }
            OTM = OTM + value14;
            k14=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton42ActionPerformed

    private void jRadioButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton43ActionPerformed
        if(i15==0)
        {
            if(j15==1)
            {
                RFQ = RFQ-value15;
                j15=0;
            }
            else if(k15==1)
            {
                OTM = OTM-value15;
                k15=0;
            }
           
                DP = DP + value15;
                i15=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                        DP = DP-value15;
                         i15=0;
                        buttonGroup15.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton43ActionPerformed

    private void jRadioButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton44ActionPerformed
        if(j15==0)
        {
              if(i15==1)
            {
                DP = DP-value15;
                i15=0;
            }
            else if(k15==1)
            {
                OTM = OTM-value15;
                k15=0;
            }
            
                RFQ = RFQ + value15;
                j15=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                          RFQ = RFQ - value15;
                          j15=0;
                         buttonGroup15.clearSelection();
                        }
                   
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton44ActionPerformed

    private void jRadioButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton45ActionPerformed
        if(k15==0)
        {
            if(i15==1)
            {
                DP = DP-value15;
                i15=0;
            }
            else if(j15==1)
            {
                RFQ = RFQ-value15;
                j15=0;
            }
            OTM = OTM + value15;
            k15=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton45ActionPerformed

    private void jRadioButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton46ActionPerformed
        if(i16==0)
        {
            if(j16==1)
            {
                RFQ = RFQ-value16;
                j16=0;
            }
            else if(k16==1)
            {
                OTM = OTM-value16;
                k16=0;
            }
           
                DP = DP + value16;
                i16=1;
                if(DP > 1000000)
               {
                   int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                        DP = DP-value16;
                        i16=0;
                        buttonGroup16.clearSelection();
                        }

               }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton46ActionPerformed

    private void jRadioButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton48ActionPerformed
        if(k16==0)
        {
            if(i16==1)
            {
                DP = DP-value16;
                i16=0;
            }
            else if(j16==1)
            {
                RFQ = RFQ-value16;
                j16=0;
            }
            OTM = OTM + value16;
            k16=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton48ActionPerformed

    private void jRadioButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton49ActionPerformed
        if(i17==0)
        {
            if(j17==1)
            {
                RFQ = RFQ-value17;
                j17=0;
            }
            else if(k17==1)
            {
                OTM = OTM-value17;
                k17=0;
            }
           
                DP = DP + value17;
                i17=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                        DP = DP-value17;
                        i17=0;
                        buttonGroup17.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton49ActionPerformed

    private void jRadioButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton50ActionPerformed
        if(j17==0)
        {
              if(i17==1)
            {
                DP = DP-value17;
                i17=0;
            }
            else if(k17==1)
            {
                OTM = OTM-value17;
                k17=0;
            }
            
                RFQ = RFQ + value17;
                j17=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                          RFQ = RFQ - value17;
                          j17=0;
                         buttonGroup17.clearSelection();
                        }
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton50ActionPerformed

    private void jRadioButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton51ActionPerformed
        if(k17==0)
        {
            if(i17==1)
            {
                DP = DP-value17;
                i17=0;
            }
            else if(j17==1)
            {
                RFQ = RFQ-value17;
                j17=0;
            }
            OTM = OTM + value17;
            k17=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton51ActionPerformed

    private void jRadioButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton52ActionPerformed
        if(i18==0)
        {
            if(j18==1)
            {
                RFQ = RFQ-value18;
                j18=0;
            }
            else if(k18==1)
            {
                OTM = OTM-value18;
                k18=0;
            }
           
                DP = DP + value18;
                i18=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                         DP = DP-value18;
                         i18=0;
                        buttonGroup18.clearSelection();
                        }
                    
                }

                calculation();
        }

    }//GEN-LAST:event_jRadioButton52ActionPerformed

    private void jRadioButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton53ActionPerformed
        if(j18==0)
        {
              if(i18==1)
            {
                DP = DP-value18;
                i18=0;
            }
            else if(k18==1)
            {
                OTM = OTM-value18;
                k18=0;
            }
            
                RFQ = RFQ + value18;
                j18=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                          RFQ = RFQ - value18;
                          j18=0;
                         buttonGroup18.clearSelection();
                        }
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton53ActionPerformed

    private void jRadioButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton54ActionPerformed
        if(k18==0)
        {
            if(i18==1)
            {
                DP = DP-value18;
                i18=0;
            }
            else if(j18==1)
            {
                RFQ = RFQ-value18;
                j18=0;
            }
            OTM = OTM + value18;
            k18=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton54ActionPerformed

    private void jRadioButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton56ActionPerformed
        if(j19==0)
        {
              if(i19==1)
            {
                DP = DP-value19;
                i19=0;
            }
            else if(k19==1)
            {
                OTM = OTM-value19;
                k19=0;
            }
            
                RFQ = RFQ + value19;
                j19=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                          RFQ = RFQ - value19;
                          j19=0;
                         buttonGroup19.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton56ActionPerformed

    private void jRadioButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton57ActionPerformed
        if(k19==0)
        {
            if(i19==1)
            {
                DP = DP-value19;
                i19=0;
            }
            else if(j19==1)
            {
                RFQ = RFQ-value19;
                j19=0;
            }
            OTM = OTM + value19;
            k19=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton57ActionPerformed

    private void jRadioButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton58ActionPerformed
        if(i20==0)
        {
            if(j20==1)
            {
                RFQ = RFQ-value20;
                j20=0;
            }
            else if(k20==1)
            {
                OTM = OTM-value20;
                k20=0;
            }
           
                DP = DP + value20;
                i20=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                         DP = DP-value20;
                         i20=0;
                        buttonGroup20.clearSelection();
                        }
                    JOptionPane.showMessageDialog(rootPane, "DP is over 10,00000");
                    
                }

                calculation();
        }

    }//GEN-LAST:event_jRadioButton58ActionPerformed

    private void jRadioButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton59ActionPerformed
        if(j20==0)
        {
              if(i20==1)
            {
                DP = DP-value20;
                i20=0;
            }
            else if(k20==1)
            {
                OTM = OTM-value20;
                k20=0;
            }
            
                RFQ = RFQ + value20;
                j20=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                          RFQ = RFQ - value20;
                          j20=0;
                         buttonGroup20.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton59ActionPerformed

    private void jRadioButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton60ActionPerformed
        if(k20==0)
        {
            if(i20==1)
            {
                DP = DP-value20;
                i20=0;
            }
            else if(j20==1)
            {
                RFQ = RFQ-value20;
                j20=0;
            }
            OTM = OTM + value20;
            k20=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton60ActionPerformed

    private void jRadioButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton61ActionPerformed
        if(i21==0)
        {
            if(j21==1)
            {
                RFQ = RFQ-value21;
                j21=0;
            }
            else if(k21==1)
            {
                OTM = OTM-value21;
                k21=0;
            }
           
                DP = DP + value21;
                i21=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                         DP = DP-value21;
                         i21=0;
                        buttonGroup21.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton61ActionPerformed

    private void jRadioButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton63ActionPerformed
        if(k21==0)
        {
            if(i21==1)
            {
                DP = DP-value21;
                i21=0;
            }
            else if(j21==1)
            {
                RFQ = RFQ-value21;
                j21=0;
            }
            OTM = OTM + value21;
            k21=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton63ActionPerformed

    private void jRadioButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton64ActionPerformed
        if(i22==0)
        {
            if(j22==1)
            {
                RFQ = RFQ-value22;
                j22=0;
            }
            else if(k22==1)
            {
                OTM = OTM-value22;
                k22=0;
            }
           
                DP = DP + value22;
                i22=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                         DP = DP-value22;
                         i22=0;
                        buttonGroup22.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton64ActionPerformed

    private void jRadioButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton65ActionPerformed
        if(j22==0)
        {
              if(i22==1)
            {
                DP = DP-value22;
                i22=0;
            }
            else if(k22==1)
            {
                OTM = OTM-value22;
                k22=0;
            }
            
                RFQ = RFQ + value22;
                j22=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                          RFQ = RFQ - value22;
                            j22=0;
                         buttonGroup22.clearSelection();
                        }
                   
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton65ActionPerformed

    private void jRadioButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton66ActionPerformed
        if(k22==0)
        {
            if(i22==1)
            {
                DP = DP-value22;
                i22=0;
            }
            else if(j22==1)
            {
                RFQ = RFQ-value22;
                j22=0;
            }
            OTM = OTM + value22;
            k22=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton66ActionPerformed

    private void jRadioButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton67ActionPerformed
        if(i23==0)
        {
            if(j23==1)
            {
                RFQ = RFQ-value23;
                j23=0;
            }
            else if(k23==1)
            {
                OTM = OTM-value23;
                k23=0;
            }
           
                DP = DP + value23;
                i23=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                         DP = DP-value23;
                         i23=0;
                        buttonGroup23.clearSelection();
                        }
                    
                }
                
                calculation();
        }


    }//GEN-LAST:event_jRadioButton67ActionPerformed

    private void jRadioButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton68ActionPerformed
        
        if(j23==0)
        {
              if(i23==1)
            {
                DP = DP-value23;
                i23=0;
            }
            else if(k23==1)
            {
                OTM = OTM-value23;
                k23=0;
            }
            
                RFQ = RFQ + value23;
                j23=1;
                 if(RFQ > 1500000)
                {
                     int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                          RFQ = RFQ - value23;
                          j23=0;
                         buttonGroup23.clearSelection();
                        }
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton68ActionPerformed

    private void jRadioButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton69ActionPerformed
        if(k23==0)
        {
            if(i23==1)
            {
                DP = DP-value23;
                i23=0;
            }
            else if(j23==1)
            {
                RFQ = RFQ-value23;
                j23=0;
            }
            OTM = OTM + value23;
            k23=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton69ActionPerformed

    private void jRadioButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton70ActionPerformed
        if(i24==0)
        {
            if(j24==1)
            {
                RFQ = RFQ-value24;
                j24=0;
            }
            else if(k24==1)
            {
                OTM = OTM-value24;
                k24=0;
            }
           
                DP = DP + value24;
                i24=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                         DP = DP-value24;
                         i24=0;
                        buttonGroup24.clearSelection();
                        }
                    
                }
                
                calculation();
        }


    }//GEN-LAST:event_jRadioButton70ActionPerformed

    private void jRadioButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton71ActionPerformed
        
        if(j24==0)
        {
              if(i24==1)
            {
                DP = DP-value24;
                i24=0;
            }
            else if(k24==1)
            {
                OTM = OTM-value24;
                k24=0;
            }
            
                RFQ = RFQ + value24;
                j24=1;
                 if(RFQ > 1500000)
                {
                     int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                          RFQ = RFQ - value24;
                          j24=0;
                         buttonGroup24.clearSelection();
                        }
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton71ActionPerformed

    private void jRadioButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton72ActionPerformed
        if(k24==0)
        {
            if(i24==1)
            {
                DP = DP-value24;
                i24=0;
            }
            else if(j24==1)
            {
                RFQ = RFQ-value24;
                j24=0;
            }
            OTM = OTM + value24;
            k24=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton72ActionPerformed

    private void jRadioButton166ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton166ActionPerformed
        if(i25==0)
        {
            if(j25==1)
            {
                RFQ = RFQ-value25;
                j25=0;
            }
            else if(k25==1)
            {
                OTM = OTM-value25;
                k25=0;
            }
           
                DP = DP + value25;
                i25=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                         DP = DP-value25;
                         i25=0;
                        buttonGroup25.clearSelection();
                        }
                   
                }
                
                calculation();
        }


    }//GEN-LAST:event_jRadioButton166ActionPerformed

    private void jRadioButton167ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton167ActionPerformed
        
        if(j25==0)
        {
              if(i25==1)
            {
                DP = DP-value25;
                i25=0;
            }
            else if(k25==1)
            {
                OTM = OTM-value25;
                k25=0;
            }
            
                RFQ = RFQ + value25;
                j25=1;
                 if(RFQ > 1500000)
                {
                     int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                          RFQ = RFQ - value25;
                          j25=0;
                         buttonGroup25.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton167ActionPerformed

    private void jRadioButton168ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton168ActionPerformed
        if(k25==0)
        {
            if(i25==1)
            {
                DP = DP-value25;
                i25=0;
            }
            else if(j25==1)
            {
                RFQ = RFQ-value25;
                j25=0;
            }
            OTM = OTM + value25;
            k25=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton168ActionPerformed

    private void jRadioButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton73ActionPerformed
        if(i26==0)
        {
            if(j26==1)
            {
                RFQ = RFQ-value26;
                j26=0;
            }
            else if(k26==1)
            {
                OTM = OTM-value26;
                k26=0;
            }
           
                DP = DP + value26;
                i26=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                         DP = DP-value26;
                         i26=0;
                        buttonGroup26.clearSelection();
                        }
                    
                }
                
                calculation();
        }


    }//GEN-LAST:event_jRadioButton73ActionPerformed

    private void jRadioButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton74ActionPerformed
        if(j26==0)
        {
              if(i26==1)
            {
                DP = DP-value26;
                i26=0;
            }
            else if(k26==1)
            {
                OTM = OTM-value26;
                k26=0;
            }
            
                RFQ = RFQ + value26;
                j26=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                         RFQ = RFQ - value26;
                         j26=0;
                         buttonGroup26.clearSelection();
                        }
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton74ActionPerformed

    private void jRadioButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton75ActionPerformed
        if(k26==0)
        {
            if(i26==1)
            {
                DP = DP-value26;
                i26=0;
            }
            else if(j26==1)
            {
                RFQ = RFQ-value26;
                j26=0;
            }
            OTM = OTM + value26;
            k26=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton75ActionPerformed

    private void jRadioButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton76ActionPerformed
        if(i27==0)
        {
            if(j27==1)
            {
                RFQ = RFQ-value27;
                j27=0;
            }
            else if(k27==1)
            {
                OTM = OTM-value27;
                k27=0;
            }
           
                DP = DP + value27;
                i27=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                         DP = DP-value27;
                         i27=0;
                        buttonGroup27.clearSelection();
                        }
                    
                }
                
                calculation();
        }


    }//GEN-LAST:event_jRadioButton76ActionPerformed

    private void jRadioButton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton77ActionPerformed
        if(j27==0)
        {
              if(i27==1)
            {
                DP = DP-value27;
                i27=0;
            }
            else if(k27==1)
            {
                OTM = OTM-value27;
                k27=0;
            }
            
                RFQ = RFQ + value27;
                j27=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                         RFQ = RFQ - value27;
                         j27=0;
                         buttonGroup27.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton77ActionPerformed

    private void jRadioButton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton78ActionPerformed
        if(k27==0)
        {
            if(i27==1)
            {
                DP = DP-value27;
                i27=0;
            }
            else if(j27==1)
            {
                RFQ = RFQ-value27;
                j27=0;
            }
            OTM = OTM + value27;
            k27=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton78ActionPerformed

    private void jRadioButton79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton79ActionPerformed
        if(i28==0)
        {
            if(j28==1)
            {
                RFQ = RFQ-value28;
                j28=0;
            }
            else if(k28==1)
            {
                OTM = OTM-value28;
                k28=0;
            }
           
                DP = DP + value28;
                i28=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                         DP = DP-value28;
                         i28=0;
                        buttonGroup28.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton79ActionPerformed

    private void jRadioButton80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton80ActionPerformed
        if(j28==0)
        {
              if(i28==1)
            {
                DP = DP-value28;
                i28=0;
            }
            else if(k28==1)
            {
                OTM = OTM-value28;
                k28=0;
            }
            
                RFQ = RFQ + value28;
                j28=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                         RFQ = RFQ - value28;
                         j28=0;
                         buttonGroup28.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton80ActionPerformed

    private void jRadioButton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton81ActionPerformed
        if(k28==0)
        {
            if(i28==1)
            {
                DP = DP-value28;
                i28=0;
            }
            else if(j28==1)
            {
                RFQ = RFQ-value28;
                j28=0;
            }
            OTM = OTM + value28;
            k28=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton81ActionPerformed

    private void jRadioButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton82ActionPerformed
        if(i29==0)
        {
            if(j29==1)
            {
                RFQ = RFQ-value29;
                j29=0;
            }
            else if(k29==1)
            {
                OTM = OTM-value29;
                k29=0;
            }
           
                DP = DP + value29;
                i29=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                         DP = DP-value29;
                         i29=0;
                        buttonGroup29.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton82ActionPerformed

    private void jRadioButton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton83ActionPerformed
        if(j29==0)
        {
              if(i29==1)
            {
                DP = DP-value29;
                i29=0;
            }
            else if(k29==1)
            {
                OTM = OTM-value29;
                k29=0;
            }
            
                RFQ = RFQ + value29;
                j29=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                         RFQ = RFQ - value29;
                         j29=0;
                         buttonGroup29.clearSelection();
                        }
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton83ActionPerformed

    private void jRadioButton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton84ActionPerformed
        if(k29==0)
        {
            if(i29==1)
            {
                DP = DP-value29;
                i29=0;
            }
            else if(j29==1)
            {
                RFQ = RFQ-value29;
                j29=0;
            }
            OTM = OTM + value29;
            k29=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton84ActionPerformed

    private void jRadioButton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton85ActionPerformed
        if(i30==0)
        {
            if(j30==1)
            {
                RFQ = RFQ-value30;
                j30=0;
            }
            else if(k30==1)
            {
                OTM = OTM-value30;
                k30=0;
            }
           
                DP = DP + value30;
                i30=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                         DP = DP-value30;
                         i30=0;
                        buttonGroup30.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton85ActionPerformed

    private void jRadioButton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton86ActionPerformed
        if(j30==0)
        {
              if(i30==1)
            {
                DP = DP-value30;
                i30=0;
            }
            else if(k30==1)
            {
                OTM = OTM-value3;
                k30=0;
            }
            
                RFQ = RFQ + value30;
                j30=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                         RFQ = RFQ - value30;
                         j30=0;
                         buttonGroup30.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton86ActionPerformed

    private void jRadioButton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton87ActionPerformed
        if(k30==0)
        {
            if(i30==1)
            {
                DP = DP-value30;
                i30=0;
            }
            else if(j30==1)
            {
                RFQ = RFQ-value30;
                j30=0;
            }
            OTM = OTM + value30;
            k30=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton87ActionPerformed

    private void jRadioButton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton88ActionPerformed
        if(i31==0)
        {
            if(j31==1)
            {
                RFQ = RFQ-value31;
                j31=0;
            }
            else if(k31==1)
            {
                OTM = OTM-value31;
                k31=0;
            }
           
                DP = DP + value31;
                i31=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                         DP = DP-value31;
                        i31=0;
                        buttonGroup31.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton88ActionPerformed

    private void jRadioButton89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton89ActionPerformed
        if(j31==0)
        {
              if(i31==1)
            {
                DP = DP-value31;
                i31=0;
            }
            else if(k31==1)
            {
                OTM = OTM-value31;
                k31=0;
            }
            
                RFQ = RFQ + value31;
                j31=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                         RFQ = RFQ - value31;
                         j31=0;
                         buttonGroup31.clearSelection();
                        }
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton89ActionPerformed

    private void jRadioButton90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton90ActionPerformed
        if(k31==0)
        {
            if(i31==1)
            {
                DP = DP-value31;
                i31=0;
            }
            else if(j31==1)
            {
                RFQ = RFQ-value31;
                j31=0;
            }
            OTM = OTM + value31;
            k31=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton90ActionPerformed

    private void jRadioButton91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton91ActionPerformed
        if(i32==0)
        {
            if(j32==1)
            {
                RFQ = RFQ-value32;
                j32=0;
            }
            else if(k32==1)
            {
                OTM = OTM-value32;
                k32=0;
            }
           
                DP = DP + value32;
                i32=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                         DP = DP-value32;
                         i32=0;
                        buttonGroup32.clearSelection();
                        }
                   
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton91ActionPerformed

    private void jRadioButton92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton92ActionPerformed
        if(j32==0)
        {
              if(i32==1)
            {
                DP = DP-value32;
                i32=0;
            }
            else if(k32==1)
            {
                OTM = OTM-value32;
                k32=0;
            }
            
                RFQ = RFQ + value32;
                j32=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                         RFQ = RFQ - value32;
                         j32=0;
                         buttonGroup32.clearSelection();
                        }
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton92ActionPerformed

    private void jRadioButton93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton93ActionPerformed
        if(k32==0)
        {
            if(i32==1)
            {
                DP = DP-value32;
                i32=0;
            }
            else if(j32==1)
            {
                RFQ = RFQ-value32;
                j32=0;
            }
            OTM = OTM + value32;
            k32=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton93ActionPerformed

    private void jRadioButton94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton94ActionPerformed
        if(i33==0)
        {
            if(j33==1)
            {
                RFQ = RFQ-value33;
                j33=0;
            }
            else if(k33==1)
            {
                OTM = OTM-value33;
                k33=0;
            }
           
                DP = DP + value33;
                i33=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                         DP = DP-value33;
                         i33=0;
                        buttonGroup33.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton94ActionPerformed

    private void jRadioButton95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton95ActionPerformed
        if(j33==0)
        {
              if(i33==1)
            {
                DP = DP-value33;
                i33=0;
            }
            else if(k33==1)
            {
                OTM = OTM-value33;
                k33=0;
            }
            
                RFQ = RFQ + value33;
                j33=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                         RFQ = RFQ - value33;
                         j33=0;
                         buttonGroup33.clearSelection();
                        }
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton95ActionPerformed

    private void jRadioButton96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton96ActionPerformed
        if(k33==0)
        {
            if(i33==1)
            {
                DP = DP-value33;
                i33=0;
            }
            else if(j33==1)
            {
                RFQ = RFQ-value33;
                j33=0;
            }
            OTM = OTM + value33;
            k33=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton96ActionPerformed

    private void jRadioButton97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton97ActionPerformed
        if(i34==0)
        {
            if(j34==1)
            {
                RFQ = RFQ-value34;
                j34=0;
            }
            else if(k34==1)
            {
                OTM = OTM-value34;
                k34=0;
            }
           
                DP = DP + value34;
                i34=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                         DP = DP-value34;
                         i34=0;
                        buttonGroup34.clearSelection();
                        }
                    
                }
                calculation();
        }

    }//GEN-LAST:event_jRadioButton97ActionPerformed

    private void jRadioButton98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton98ActionPerformed
        if(j34==0)
        {
              if(i34==1)
            {
                DP = DP-value34;
                i34=0;
            }
            else if(k34==1)
            {
                OTM = OTM-value34;
                k34=0;
            }
            
                RFQ = RFQ + value34;
                j34=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                         RFQ = RFQ - value34;
                         j34=0;
                         buttonGroup34.clearSelection();
                        }
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton98ActionPerformed

    private void jRadioButton99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton99ActionPerformed
        if(k34==0)
        {
            if(i34==1)
            {
                DP = DP-value34;
                i34=0;
            }
            else if(j34==1)
            {
                RFQ = RFQ-value34;
                j34=0;
            }
            OTM = OTM + value34;
            k34=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton99ActionPerformed

    private void jRadioButton100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton100ActionPerformed
        if(i35==0)
        {
            if(j35==1)
            {
                RFQ = RFQ-value35;
                j35=0;
            }
            else if(k35==1)
            {
                OTM = OTM-value35;
                k35=0;
            }
           
                DP = DP + value35;
                i35=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                         DP = DP-value35;
                         i35=0;
                        buttonGroup35.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton100ActionPerformed

    private void jRadioButton101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton101ActionPerformed
        if(j35==0)
        {
              if(i35==1)
            {
                DP = DP-value35;
                i35=0;
            }
            else if(k35==1)
            {
                OTM = OTM-value35;
                k35=0;
            }
            
                RFQ = RFQ + value35;
                j35=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                         RFQ = RFQ - value35;
                         j35=0;
                         buttonGroup35.clearSelection();
                        }
                   
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton101ActionPerformed

    private void jRadioButton102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton102ActionPerformed
        if(k35==0)
        {
            if(i35==1)
            {
                DP = DP-value35;
                i35=0;
            }
            else if(j35==1)
            {
                RFQ = RFQ-value35;
                j35=0;
            }
            OTM = OTM + value35;
            k35=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton102ActionPerformed

    private void jRadioButton103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton103ActionPerformed
        if(i36==0)
        {
            if(j36==1)
            {
                RFQ = RFQ-value36;
                j36=0;
            }
            else if(k36==1)
            {
                OTM = OTM-value36;
                k36=0;
            }
           
                DP = DP + value36;
                i36=1;
                if(DP > 1000000)
                {
                     int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                         DP = DP-value36;
                         i36=0;
                        buttonGroup36.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton103ActionPerformed

    private void jRadioButton104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton104ActionPerformed
        if(j36==0)
        {
              if(i36==1)
            {
                DP = DP-value36;
                i36=0;
            }
            else if(k36==1)
            {
                OTM = OTM-value36;
                k36=0;
            }
            
                RFQ = RFQ + value36;
                j36=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                         RFQ = RFQ - value36;
                         j36=0;
                         buttonGroup36.clearSelection();
                        }
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton104ActionPerformed

    private void jRadioButton105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton105ActionPerformed
        if(k36==0)
        {
            if(i36==1)
            {
                DP = DP-value36;
                i3=0;
            }
            else if(j36==1)
            {
                RFQ = RFQ-value36;
                j36=0;
            }
            OTM = OTM + value36;
            k36=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton105ActionPerformed

    private void jRadioButton106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton106ActionPerformed
        if(i37==0)
        {
            if(j37==1)
            {
                RFQ = RFQ-value37;
                j37=0;
            }
            else if(k37==1)
            {
                OTM = OTM-value37;
                k37=0;
            }
           
                DP = DP + value37;
                i37=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                        DP = DP-value37;
                        i37=0;
                        buttonGroup37.clearSelection();
                        }
                   
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton106ActionPerformed

    private void jRadioButton107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton107ActionPerformed
        if(j37==0)
        {
              if(i37==1)
            {
                DP = DP-value37;
                i37=0;
            }
            else if(k37==1)
            {
                OTM = OTM-value37;
                k37=0;
            }
            
                RFQ = RFQ + value37;
                j37=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                        RFQ = RFQ - value37;
                        j37=0;
                         buttonGroup37.clearSelection();
                        }
                   
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton107ActionPerformed

    private void jRadioButton108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton108ActionPerformed
        if(k37==0)
        {
            if(i37==1)
            {
                DP = DP-value37;
                i37=0;
            }
            else if(j37==1)
            {
                RFQ = RFQ-value37;
                j37=0;
            }
            OTM = OTM + value37;
            k37=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton108ActionPerformed

    private void jRadioButton109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton109ActionPerformed
        if(i38==0)
        {
            if(j38==1)
            {
                RFQ = RFQ-value38;
                j38=0;
            }
            else if(k38==1)
            {
                OTM = OTM-value38;
                k38=0;
            }
           
                DP = DP + value38;
                 i38=1;
                if(DP > 1000000)
                {
                     int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                         DP = DP-value38;
                         i38=0;
                        buttonGroup38.clearSelection();
                        }
                   
                }
               
                calculation();
        }

    }//GEN-LAST:event_jRadioButton109ActionPerformed

    private void jRadioButton110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton110ActionPerformed
        if(j38==0)
        {
              if(i38==1)
            {
                DP = DP-value38;
                i38=0;
            }
            else if(k38==1)
            {
                OTM = OTM-value38;
                k38=0;
            }
            
                RFQ = RFQ + value38;
                j38=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                         RFQ = RFQ - value38;
                         j38=0;
                         buttonGroup38.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton110ActionPerformed

    private void jRadioButton111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton111ActionPerformed
        if(k38==0)
        {
            if(i38==1)
            {
                DP = DP-value38;
                i38=0;
            }
            else if(j38==1)
            {
                RFQ = RFQ-value38;
                j38=0;
            }
            OTM = OTM + value38;
            k38=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton111ActionPerformed

    private void jRadioButton112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton112ActionPerformed
        if(i39==0)
        {
            if(j39==1)
            {
                RFQ = RFQ-value39;
                j39=0;
            }
            else if(k39==1)
            {
                OTM = OTM-value39;
                k39=0;
            }
           
                DP = DP + value39;
                i39=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                          DP = DP-value39;
                          i39=0;
                        buttonGroup39.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton112ActionPerformed

    private void jRadioButton113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton113ActionPerformed
        if(j39==0)
        {
              if(i39==1)
            {
                DP = DP-value39;
                i39=0;
            }
            else if(k39==1)
            {
                OTM = OTM-value39;
                k39=0;
            }
            
                RFQ = RFQ + value39;
                j39=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                         RFQ = RFQ - value39;
                         j39=0;
                         buttonGroup39.clearSelection();
                        }
                  
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton113ActionPerformed

    private void jRadioButton114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton114ActionPerformed
       if(k39==0)
        {
            if(i39==1)
            {
                DP = DP-value39;
                i39=0;
            }
            else if(j39==1)
            {
                RFQ = RFQ-value39;
                j39=0;
            }
            OTM = OTM + value39;
            k39=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton114ActionPerformed

    private void jRadioButton115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton115ActionPerformed
       if(i40==0)
        {
            if(j40==1)
            {
                RFQ = RFQ-value40;
                j40=0;
            }
            else if(k40==1)
            {
                OTM = OTM-value40;
                k40=0;
            }
           
                DP = DP + value40;
                i40=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                          DP = DP-value40;
                          i40=0;
                        buttonGroup40.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton115ActionPerformed

    private void jRadioButton116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton116ActionPerformed
        if(j40==0)
        {
              if(i40==1)
            {
                DP = DP-value40;
                i40=0;
            }
            else if(k40==1)
            {
                OTM = OTM-value40;
                k40=0;
            }
            
                RFQ = RFQ + value40;
                j40=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                         RFQ = RFQ - value40;
                         j40=0;
                         buttonGroup40.clearSelection();
                        }
                   
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton116ActionPerformed

    private void jRadioButton117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton117ActionPerformed
        if(k40==0)
        {
            if(i40==1)
            {
                DP = DP-value40;
                i40=0;
            }
            else if(j40==1)
            {
                RFQ = RFQ-value40;
                j40=0;
            }
            OTM = OTM + value40;
            k40=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton117ActionPerformed

    private void jRadioButton118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton118ActionPerformed
        if(i41==0)
        {
            if(j41==1)
            {
                RFQ = RFQ-value41;
                j41=0;
            }
            else if(k41==1)
            {
                OTM = OTM-value41;
                k41=0;
            }
           
                DP = DP + value41;
                i41=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                          DP = DP-value41;
                            i41=0;
                        buttonGroup41.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton118ActionPerformed

    private void jRadioButton119ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton119ActionPerformed
        if(j41==0)
        {
              if(i41==1)
            {
                DP = DP-value41;
                i41=0;
            }
            else if(k41==1)
            {
                OTM = OTM-value41;
                k41=0;
            }
            
                RFQ = RFQ + value41;
                j41=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                         RFQ = RFQ - value41;
                         j41=0;
                         buttonGroup41.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton119ActionPerformed

    private void jRadioButton120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton120ActionPerformed
        if(k41==0)
        {
            if(i41==1)
            {
                DP = DP-value41;
                i41=0;
            }
            else if(j41==1)
            {
                RFQ = RFQ-value41;
                j41=0;
            }
            OTM = OTM + value41;
            k41=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton120ActionPerformed

    private void jRadioButton121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton121ActionPerformed
        if(i42==0)
        {
            if(j42==1)
            {
                RFQ = RFQ-value42;
                j42=0;
            }
            else if(k42==1)
            {
                OTM = OTM-value42;
                k42=0;
            }
           
                DP = DP + value42;
                i42=1;
                if(DP > 1000000)
                {
                     int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                          DP = DP-value42;
                          i42=0;
                        buttonGroup42.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton121ActionPerformed

    private void jRadioButton122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton122ActionPerformed
        if(j42==0)
        {
              if(i42==1)
            {
                DP = DP-value42;
                i42=0;
            }
            else if(k42==1)
            {
                OTM = OTM-value42;
                k42=0;
            }
            
                RFQ = RFQ + value42;
                j42=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                         RFQ = RFQ - value42;
                         j42=0;
                         buttonGroup42.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton122ActionPerformed

    private void jRadioButton123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton123ActionPerformed
        if(k42==0)
        {
            if(i42==1)
            {
                DP = DP-value42;
                i42=0;
            }
            else if(j42==1)
            {
                RFQ = RFQ-value42;
                j42=0;
            }
            OTM = OTM + value42;
            k42=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton123ActionPerformed

    private void jRadioButton169ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton169ActionPerformed
        if(i43==0)
        {
            if(j43==1)
            {
                RFQ = RFQ-value43;
                j43=0;
            }
            else if(k43==1)
            {
                OTM = OTM-value43;
                k43=0;
            }
           
                DP = DP + value43;
                i43=1;
                if(DP > 1000000)
                {
                     int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                          DP = DP-value43;
                          i43=0;
                        buttonGroup43.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton169ActionPerformed

    private void jRadioButton170ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton170ActionPerformed
        if(j43==0)
        {
              if(i43==1)
            {
                DP = DP-value43;
                i43=0;
            }
            else if(k43==1)
            {
                OTM = OTM-value43;
                k43=0;
            }
            
                RFQ = RFQ + value43;
                j43=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                         RFQ = RFQ - value43;
                         j43=0;
                         buttonGroup43.clearSelection();
                        }
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton170ActionPerformed

    private void jRadioButton171ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton171ActionPerformed
        if(k43==0)
        {
            if(i43==1)
            {
                DP = DP-value43;
                i43=0;
            }
            else if(j43==1)
            {
                RFQ = RFQ-value43;
                j43=0;
            }
            OTM = OTM + value43;
            k43=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton171ActionPerformed

    private void jRadioButton124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton124ActionPerformed
        if(i44==0)
        {
            if(j44==1)
            {
                RFQ = RFQ-value44;
                j44=0;
            }
            else if(k44==1)
            {
                OTM = OTM-value44;
                k44=0;
            }
           
                DP = DP + value44;
                i44=1;
                if(DP > 1000000)
                {
                      int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                          DP = DP-value44;
                          i44=0;
                        buttonGroup44.clearSelection();
                        }
                  
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton124ActionPerformed

    private void jRadioButton125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton125ActionPerformed
        if(j44==0)
        {
              if(i44==1)
            {
                DP = DP-value44;
                i44=0;
            }
            else if(k44==1)
            {
                OTM = OTM-value44;
                k44=0;
            }
            
                RFQ = RFQ + value44;
                j44=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                         RFQ = RFQ - value44;
                         j44=0;
                         buttonGroup44.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton125ActionPerformed

    private void jRadioButton126ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton126ActionPerformed
        if(k44==0)
        {
            if(i44==1)
            {
                DP = DP-value44;
                i44=0;
            }
            else if(j44==1)
            {
                RFQ = RFQ-value44;
                j44=0;
            }
            OTM = OTM + value44;
            k44=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton126ActionPerformed

    private void jRadioButton127ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton127ActionPerformed
        if(i45==0)
        {
            if(j45==1)
            {
                RFQ = RFQ-value45;
                j45=0;
            }
            else if(k45==1)
            {
                OTM = OTM-value45;
                k45=0;
            }
           
                DP = DP + value45;
                i45=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                           DP = DP-value45;
                           i45=0;
                        buttonGroup45.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton127ActionPerformed

    private void jRadioButton128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton128ActionPerformed
        if(j45==0)
        {
              if(i45==1)
            {
                DP = DP-value45;
                i45=0;
            }
            else if(k45==1)
            {
                OTM = OTM-value45;
                k45=0;
            }
            
                RFQ = RFQ + value45;
                j45=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                         RFQ = RFQ - value45;
                         j45=0;
                         buttonGroup45.clearSelection();
                        }
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton128ActionPerformed

    private void jRadioButton129ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton129ActionPerformed
        if(k45==0)
        {
            if(i45==1)
            {
                DP = DP-value45;
                i45=0;
            }
            else if(j45==1)
            {
                RFQ = RFQ-value45;
                j45=0;
            }
            OTM = OTM + value45;
            k45=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton129ActionPerformed

    private void jRadioButton130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton130ActionPerformed
        if(i46==0)
        {
            if(j46==1)
            {
                RFQ = RFQ-value46;
                j46=0;
            }
            else if(k46==1)
            {
                OTM = OTM-value46;
                k46=0;
            }
           
                DP = DP + value46;
                i46=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                            DP = DP-value46;
                            i46=0;
                        buttonGroup46.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton130ActionPerformed

    private void jRadioButton131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton131ActionPerformed
        if(j46==0)
        {
              if(i46==1)
            {
                DP = DP-value46;
                i46=0;
            }
            else if(k46==1)
            {
                OTM = OTM-value46;
                k46=0;
            }
            
                RFQ = RFQ + value46;
                j46=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                         RFQ = RFQ - value46;
                         j46=0;
                         buttonGroup46.clearSelection();
                        }
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton131ActionPerformed

    private void jRadioButton132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton132ActionPerformed
        if(k46==0)
        {
            if(i46==1)
            {
                DP = DP-value46;
                i46=0;
            }
            else if(j46==1)
            {
                RFQ = RFQ-value46;
                j46=0;
            }
            OTM = OTM + value46;
            k46=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton132ActionPerformed

    private void jRadioButton133ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton133ActionPerformed
        if(i47==0)
        {
            if(j47==1)
            {
                RFQ = RFQ-value47;
                j47=0;
            }
            else if(k47==1)
            {
                OTM = OTM-value47;
                k47=0;
            }
           
                DP = DP + value47;
                i47=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                          DP = DP-value47;
                           i47=0;
                        buttonGroup47.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton133ActionPerformed

    private void jRadioButton134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton134ActionPerformed
        if(j47==0)
        {
              if(i47==1)
            {
                DP = DP-value47;
                i47=0;
            }
            else if(k47==1)
            {
                OTM = OTM-value47;
                k47=0;
            }
            
                RFQ = RFQ + value47;
                j47=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                         RFQ = RFQ - value47;
                         j47=0;
                         buttonGroup47.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton134ActionPerformed

    private void jRadioButton135ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton135ActionPerformed
        if(k47==0)
        {
            if(i47==1)
            {
                DP = DP-value47;
                i47=0;
            }
            else if(j47==1)
            {
                RFQ = RFQ-value47;
                j47=0;
            }
            OTM = OTM + value47;
            k47=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton135ActionPerformed

    private void jRadioButton137ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton137ActionPerformed
        if(j48==0)
        {
              if(i48==1)
            {
                DP = DP-value48;
                i48=0;
            }
            else if(k48==1)
            {
                OTM = OTM-value48;
                k48=0;
            }
            
                RFQ = RFQ + value48;
                j48=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                         RFQ = RFQ - value48;
                         j48=0;
                         buttonGroup48.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton137ActionPerformed

    private void jRadioButton138ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton138ActionPerformed
        if(k48==0)
        {
            if(i48==1)
            {
                DP = DP-value48;
                i48=0;
            }
            else if(j48==1)
            {
                RFQ = RFQ-value48;
                j48=0;
            }
            OTM = OTM + value48;
            k48=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton138ActionPerformed

    private void jRadioButton139ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton139ActionPerformed
        if(i49==0)
        {
            if(j49==1)
            {
                RFQ = RFQ-value49;
                j49=0;
            }
            else if(k49==1)
            {
                OTM = OTM-value49;
                k49=0;
            }
           
                DP = DP + value49;
                i49=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                          DP = DP-value49;
                          i49=0;
                        buttonGroup49.clearSelection();
                        }
                    JOptionPane.showMessageDialog(rootPane, "DP is over 10,00000");
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton139ActionPerformed

    private void jRadioButton140ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton140ActionPerformed
        if(j49==0)
        {
              if(i49==1)
            {
                DP = DP-value49;
                i49=0;
            }
            else if(k49==1)
            {
                OTM = OTM-value49;
                k49=0;
            }
            
                RFQ = RFQ + value49;
                j49=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                          RFQ = RFQ - value49;
                           j49=0;
                         buttonGroup49.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton140ActionPerformed

    private void jRadioButton141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton141ActionPerformed
        if(k49==0)
        {
            if(i49==1)
            {
                DP = DP-value49;
                i49=0;
            }
            else if(j49==1)
            {
                RFQ = RFQ-value49;
                j49=0;
            }
            OTM = OTM + value49;
            k49=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton141ActionPerformed

    private void jRadioButton142ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton142ActionPerformed
        if(i50==0)
        {
            if(j50==1)
            {
                RFQ = RFQ-value50;
                j50=0;
            }
            else if(k50==1)
            {
                OTM = OTM-value50;
                k50=0;
            }
           
                DP = DP + value50;
                i50=1;
                if(DP > 1000000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                         DP = DP-value50;
                        i50=0;
                        buttonGroup50.clearSelection();
                        }
                   
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton142ActionPerformed

    private void jRadioButton143ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton143ActionPerformed
        if(j50==0)
        {
              if(i50==1)
            {
                DP = DP-value50;
                i50=0;
            }
            else if(k50==1)
            {
                OTM = OTM-value50;
                k50=0;
            }
            
                RFQ = RFQ + value50;
                j50=1;
                 if(RFQ > 1500000)
                {
                     int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                          RFQ = RFQ - value50;
                          j50=0;
                         buttonGroup50.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton143ActionPerformed

    private void jRadioButton144ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton144ActionPerformed
        if(k50==0)
        {
            if(i50==1)
            {
                DP = DP-value50;
                i50=0;
            }
            else if(j50==1)
            {
                RFQ = RFQ-value50;
                j50=0;
            }
            OTM = OTM + value50;
            k50=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton144ActionPerformed

    private void jRadioButton146ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton146ActionPerformed
        if(j51==0)
        {
              if(i51==1)
            {
                DP = DP-value51;
                i51=0;
            }
            else if(k51==1)
            {
                OTM = OTM-value51;
                k51=0;
            }
            
                RFQ = RFQ + value51;
                j51=1;
                 if(RFQ > 1500000)
                {
                     int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                          RFQ = RFQ - value51;
                          j51=0;
                         buttonGroup51.clearSelection();
                        }
                   
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton146ActionPerformed

    private void jRadioButton147ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton147ActionPerformed
        if(k51==0)
        {
            if(i51==1)
            {
                DP = DP-value51;
                i51=0;
            }
            else if(j51==1)
            {
                RFQ = RFQ-value51;
                j51=0;
            }
            OTM = OTM + value51;
            k51=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton147ActionPerformed

    private void jRadioButton148ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton148ActionPerformed
        if(i52==0)
        {
            if(j52==1)
            {
                RFQ = RFQ-value52;
                j52=0;
            }
            else if(k52==1)
            {
                OTM = OTM-value52;
                k52=0;
            }
           
                DP = DP + value52;
                i52=1;
                if(DP > 1000000)
                {
                       int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                        DP = DP-value52;
                    i52=0;
                        buttonGroup52.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton148ActionPerformed

    private void jRadioButton149ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton149ActionPerformed
        if(j52==0)
        {
              if(i52==1)
            {
                DP = DP-value52;
                i52=0;
            }
            else if(k52==1)
            {
                OTM = OTM-value52;
                k52=0;
            }
            
                RFQ = RFQ + value52;
                j52=1;
                 if(RFQ > 1500000)
                {
                     int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                          RFQ = RFQ - value52;
                            j52=0;
                         buttonGroup52.clearSelection();
                        }
                   
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton149ActionPerformed

    private void jRadioButton150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton150ActionPerformed
        if(k52==0)
        {
            if(i52==1)
            {
                DP = DP-value52;
                i52=0;
            }
            else if(j52==1)
            {
                RFQ = RFQ-value52;
                j52=0;
            }
            OTM = OTM + value52;
            k52=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton150ActionPerformed

    private void jRadioButton151ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton151ActionPerformed
        if(i53==0)
        {
            if(j53==1)
            {
                RFQ = RFQ-value53;
                j53=0;
            }
            else if(k53==1)
            {
                OTM = OTM-value53;
                k53=0;
            }
           
                DP = DP + value53;
                i53=1;
                if(DP > 1000000)
                {
                       int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                       DP = DP-value53;
                        i53=0;
                        buttonGroup53.clearSelection();
                        }
                   
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton151ActionPerformed

    private void jRadioButton152ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton152ActionPerformed
        if(j53==0)
        {
              if(i53==1)
            {
                DP = DP-value53;
                i53=0;
            }
            else if(k53==1)
            {
                OTM = OTM-value53;
                k53=0;
            }
            
                RFQ = RFQ + value53;
                j53=1;
                 if(RFQ > 1500000)
                {
                     int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                          RFQ = RFQ - value53;
                             j53=0;
                         buttonGroup53.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton152ActionPerformed

    private void jRadioButton153ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton153ActionPerformed
        if(k53==0)
        {
            if(i53==1)
            {
                DP = DP-value53;
                i53=0;
            }
            else if(j53==1)
            {
                RFQ = RFQ-value53;
                j53=0;
            }
            OTM = OTM + value53;
            k53=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton153ActionPerformed

    private void jRadioButton154ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton154ActionPerformed
        if(i54==0)
        {
            if(j54==1)
            {
                RFQ = RFQ-value54;
                j54=0;
            }
            else if(k54==1)
            {
                OTM = OTM-value54;
                k54=0;
            }
           
                DP = DP + value54;
                i54=1;
                if(DP > 1000000)
                {
                       int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                       DP = DP-value54;
                        i54=0;
                        buttonGroup54.clearSelection();
                        }
                   
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton154ActionPerformed

    private void jRadioButton155ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton155ActionPerformed
       if(j54==0)
        {
              if(i54==1)
            {
                DP = DP-value54;
                i54=0;
            }
            else if(k54==1)
            {
                OTM = OTM-value54;
                k54=0;
            }
            
                RFQ = RFQ + value54;
                j54=1;
                 if(RFQ > 1500000)
                {
                     int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                          RFQ = RFQ - value54;
                          j54=0;
                         buttonGroup54.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton155ActionPerformed

    private void jRadioButton156ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton156ActionPerformed
        if(k54==0)
        {
            if(i54==1)
            {
                DP = DP-value54;
                i54=0;
            }
            else if(j54==1)
            {
                RFQ = RFQ-value54;
                j54=0;
            }
            OTM = OTM + value54;
            k54=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton156ActionPerformed

    private void jRadioButton157ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton157ActionPerformed
        if(i55==0)
        {
            if(j55==1)
            {
                RFQ = RFQ-value55;
                j55=0;
            }
            else if(k55==1)
            {
                OTM = OTM-value55;
                k55=0;
            }
           
                DP = DP + value55;
                i55=1;
                if(DP > 1000000)
                {
                      int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                       DP = DP-value55;
                        i55=0;
                        buttonGroup55.clearSelection();
                        }
                   
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton157ActionPerformed

    private void jRadioButton158ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton158ActionPerformed
        if(j55==0)
        {
              if(i55==1)
            {
                DP = DP-value55;
                i55=0;
            }
            else if(k55==1)
            {
                OTM = OTM-value55;
                k55=0;
            }
            
                RFQ = RFQ + value55;
                j55=1;
                 if(RFQ > 1500000)
                {
                     int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                          RFQ = RFQ - value55;
                    j55=0;
                         buttonGroup55.clearSelection();
                        }
                   
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton158ActionPerformed

    private void jRadioButton159ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton159ActionPerformed
        if(k55==0)
        {
            if(i55==1)
            {
                DP = DP-value55;
                i55=0;
            }
            else if(j55==1)
            {
                RFQ = RFQ-value55;
                j55=0;
            }
            OTM = OTM + value55;
            k55=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton159ActionPerformed

    private void jRadioButton160ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton160ActionPerformed
        if(i56==0)
        {
            if(j56==1)
            {
                RFQ = RFQ-value56;
                j56=0;
            }
            else if(k56==1)
            {
                OTM = OTM-value56;
                k56=0;
            }
           
                DP = DP + value56;
                i56=1;
                if(DP > 1000000)
                {
                      int r = JOptionPane.showConfirmDialog(null, "DP is over 10,00000. Please select RFQ or OTM", "OK", JOptionPane.OK_CANCEL_OPTION);
                    if (r == 0) {
                       DP = DP-value56;
                        i56=0;
                        buttonGroup56.clearSelection();
                        }
                    
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton160ActionPerformed

    private void jRadioButton161ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton161ActionPerformed
        if(j56==0)
        {
              if(i56==1)
            {
                DP = DP-value56;
                i56=0;
            }
            else if(k56==1)
            {
                OTM = OTM-value56;
                k56=0;
            }
            
                RFQ = RFQ + value56;
                j56=1;
                 if(RFQ > 1500000)
                {
                    int r = JOptionPane.showConfirmDialog(null, "RFQ is over 15,00000. Please select DP or OTM", "OK", JOptionPane.YES_NO_OPTION);
                    if (r == 0) {
                         RFQ = RFQ - value56;
                         j56=0;
                         buttonGroup56.clearSelection();
                        }
                   
                }
                
                calculation();
        }

    }//GEN-LAST:event_jRadioButton161ActionPerformed

    private void jRadioButton162ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton162ActionPerformed
        if(k56==0)
        {
            if(i56==1)
            {
                DP = DP-value56;
                i56=0;
            }
            else if(j56==1)
            {
                RFQ = RFQ-value56;
                j56=0;
            }
            OTM = OTM + value56;
            k56=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton162ActionPerformed

    private void jRadioButton165ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton165ActionPerformed
        if(k57==0)
        {
            if(i57==1)
            {
                DP = DP-value57;
                i57=0;
            }
            else if(j57==1)
            {
                RFQ = RFQ-value57;
                j57=0;
            }
            OTM = OTM + value57;
            k57=1;
            calculation();
        }

    }//GEN-LAST:event_jRadioButton165ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        Update_and_save();
        String str1="DP";
        String str2="RFQ";
        String str3="OTM";

         try
       {
          if(jRadioButton1.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code1 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
             
                
            }
            else if(jRadioButton2.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code1 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton3.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code1 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            
            if(jRadioButton4.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code2 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton5.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code2 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton6.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code2 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton7.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code3 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton8.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code3 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton9.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code3 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton10.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code4 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton11.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code4 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton12.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code4 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton13.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code5 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton14.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code5 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton15.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code5 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton16.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code6 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton17.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code6 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton18.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code6 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton19.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code7 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton20.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code7 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton21.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code7 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton22.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code8 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton23.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code8 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton24.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code8 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton25.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code9 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton26.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code9 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton27.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code9 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton28.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code10 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton29.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code10 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton30.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code10 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton31.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code11 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton32.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code11 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton33.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code11 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton34.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code12 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton35.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code12 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton36.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code12 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton37.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code13 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton38.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code13 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton39.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code13 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton40.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code14 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton41.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code14 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton42.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code14 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton43.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code15 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton44.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code15 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton45.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code15 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton46.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code16 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton47.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code16 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton48.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code16 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton49.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code17 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton50.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code17 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton51.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code17 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton52.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code18 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton53.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code18 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton54.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code18 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton55.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code19 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton56.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code19 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton57.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code19 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton58.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code20 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton59.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code20 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton60.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code20 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton61.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code21 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton62.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code21 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton63.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code21 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton64.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code22 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton65.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code22 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton66.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code22 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton67.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code23 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton68.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code23 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton69.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code23 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton70.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code24 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton71.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code24 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton72.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code24 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton166.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code25 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton167.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code25 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton168.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code25 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton73.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code26 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton74.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code26 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton75.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code26 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton76.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code27 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton77.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code27 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton78.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code27 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton79.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code28 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton80.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code28 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton81.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code28 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton82.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code29 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton83.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code29 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton84.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code29 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton85.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code30 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton86.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code30 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton87.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code30 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton88.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code31 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton89.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code31 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton90.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code31 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton91.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code32 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton92.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code32 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton93.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code32 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton94.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code33 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton95.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code33 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton96.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code33 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton97.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code34 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton98.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code34 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton99.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code34 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton100.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code35 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton101.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code35 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton102.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code35 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton103.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code36 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton104.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code36 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton105.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code36 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton106.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code37 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton107.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code37 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton108.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code37 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }if(jRadioButton109.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code38 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton110.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code38 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton111.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code38 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton112.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code39 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton113.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code39 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton114.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code39 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton115.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code40 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton116.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code40 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton117.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code40 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton118.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code41 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton119.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code41 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton120.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code41 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton121.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code42 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton122.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code42 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton123.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code42 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton169.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code43 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton170.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code43 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton171.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code43 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            
            if(jRadioButton124.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code44 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton125.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code44 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton126.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code44 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton127.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code45 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton128.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code45 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton129.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code45 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton130.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code46 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton131.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code46 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton132.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code46 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton133.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code47 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton134.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code47 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton135.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code47 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton136.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code48 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton137.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code48 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton138.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code48 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton139.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code49 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton140.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code49 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton141.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code49 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton142.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code50 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton143.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code50 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton144.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code50 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton145.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code51 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton146.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code51 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton147.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code51 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton148.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code52 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton149.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code52 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton150.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code52 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton151.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code53 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton152.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code53 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton153.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code53 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton154.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code54 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton155.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code54 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton156.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code54 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton157.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code55 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton158.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code55 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton159.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code55 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton160.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code56 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton161.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code56 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton162.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code56 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
            if(jRadioButton163.isSelected())
            {
                String sql1 = "UPDATE main_db_table SET Procurement_method='" + str1 + "' WHERE CODE='" + code57 + "'";
                pst = con.prepareStatement(sql1);
                pst.execute();
                
            }
            else if(jRadioButton164.isSelected())
            {
                String sql2 = "UPDATE main_db_table SET Procurement_method='" + str2 + "' WHERE CODE='" + code57 + "'";
                pst = con.prepareStatement(sql2);
                pst.execute();
            
            }
            else if(jRadioButton165.isSelected())
            {
                String sql3 = "UPDATE main_db_table SET Procurement_method='" + str3 + "' WHERE CODE='" + code57 + "'";
                pst = con.prepareStatement(sql3);
                pst.execute();
            }
       }
       catch (Exception e) 
           {
               //JOptionPane.showMessageDialog(rootPane, "Database Error");
           }
    
    }//GEN-LAST:event_updateActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        AdminPanel ap = new AdminPanel();
        ap.show();
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DP_app;
    private javax.swing.JLabel DP_cal;
    private javax.swing.JLabel DP_purchase;
    private javax.swing.JButton Deselect;
    private javax.swing.JLabel Dp_ramain;
    private javax.swing.JLabel OTM_app;
    private javax.swing.JLabel OTM_cal;
    private javax.swing.JLabel OTM_purchase;
    private javax.swing.JLabel OTM_remain;
    private javax.swing.JLabel Other_cal;
    private javax.swing.JLabel Others_app;
    private javax.swing.JLabel Others_purchase;
    private javax.swing.JLabel Others_remain;
    private javax.swing.JLabel RFQ_app;
    private javax.swing.JLabel RFQ_cal;
    private javax.swing.JLabel RFQ_purchase;
    private javax.swing.JLabel RFQ_remain;
    private javax.swing.JLabel Total_purc;
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
    private javax.swing.ButtonGroup buttonGroup17;
    private javax.swing.ButtonGroup buttonGroup18;
    private javax.swing.ButtonGroup buttonGroup19;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup20;
    private javax.swing.ButtonGroup buttonGroup21;
    private javax.swing.ButtonGroup buttonGroup22;
    private javax.swing.ButtonGroup buttonGroup23;
    private javax.swing.ButtonGroup buttonGroup24;
    private javax.swing.ButtonGroup buttonGroup25;
    private javax.swing.ButtonGroup buttonGroup26;
    private javax.swing.ButtonGroup buttonGroup27;
    private javax.swing.ButtonGroup buttonGroup28;
    private javax.swing.ButtonGroup buttonGroup29;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup30;
    private javax.swing.ButtonGroup buttonGroup31;
    private javax.swing.ButtonGroup buttonGroup32;
    private javax.swing.ButtonGroup buttonGroup33;
    private javax.swing.ButtonGroup buttonGroup34;
    private javax.swing.ButtonGroup buttonGroup35;
    private javax.swing.ButtonGroup buttonGroup36;
    private javax.swing.ButtonGroup buttonGroup37;
    private javax.swing.ButtonGroup buttonGroup38;
    private javax.swing.ButtonGroup buttonGroup39;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup40;
    private javax.swing.ButtonGroup buttonGroup41;
    private javax.swing.ButtonGroup buttonGroup42;
    private javax.swing.ButtonGroup buttonGroup43;
    private javax.swing.ButtonGroup buttonGroup44;
    private javax.swing.ButtonGroup buttonGroup45;
    private javax.swing.ButtonGroup buttonGroup46;
    private javax.swing.ButtonGroup buttonGroup47;
    private javax.swing.ButtonGroup buttonGroup48;
    private javax.swing.ButtonGroup buttonGroup49;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup50;
    private javax.swing.ButtonGroup buttonGroup51;
    private javax.swing.ButtonGroup buttonGroup52;
    private javax.swing.ButtonGroup buttonGroup53;
    private javax.swing.ButtonGroup buttonGroup54;
    private javax.swing.ButtonGroup buttonGroup55;
    private javax.swing.ButtonGroup buttonGroup56;
    private javax.swing.ButtonGroup buttonGroup57;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
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
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton100;
    private javax.swing.JRadioButton jRadioButton101;
    private javax.swing.JRadioButton jRadioButton102;
    private javax.swing.JRadioButton jRadioButton103;
    private javax.swing.JRadioButton jRadioButton104;
    private javax.swing.JRadioButton jRadioButton105;
    private javax.swing.JRadioButton jRadioButton106;
    private javax.swing.JRadioButton jRadioButton107;
    private javax.swing.JRadioButton jRadioButton108;
    private javax.swing.JRadioButton jRadioButton109;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton110;
    private javax.swing.JRadioButton jRadioButton111;
    private javax.swing.JRadioButton jRadioButton112;
    private javax.swing.JRadioButton jRadioButton113;
    private javax.swing.JRadioButton jRadioButton114;
    private javax.swing.JRadioButton jRadioButton115;
    private javax.swing.JRadioButton jRadioButton116;
    private javax.swing.JRadioButton jRadioButton117;
    private javax.swing.JRadioButton jRadioButton118;
    private javax.swing.JRadioButton jRadioButton119;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton120;
    private javax.swing.JRadioButton jRadioButton121;
    private javax.swing.JRadioButton jRadioButton122;
    private javax.swing.JRadioButton jRadioButton123;
    private javax.swing.JRadioButton jRadioButton124;
    private javax.swing.JRadioButton jRadioButton125;
    private javax.swing.JRadioButton jRadioButton126;
    private javax.swing.JRadioButton jRadioButton127;
    private javax.swing.JRadioButton jRadioButton128;
    private javax.swing.JRadioButton jRadioButton129;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton130;
    private javax.swing.JRadioButton jRadioButton131;
    private javax.swing.JRadioButton jRadioButton132;
    private javax.swing.JRadioButton jRadioButton133;
    private javax.swing.JRadioButton jRadioButton134;
    private javax.swing.JRadioButton jRadioButton135;
    private javax.swing.JRadioButton jRadioButton136;
    private javax.swing.JRadioButton jRadioButton137;
    private javax.swing.JRadioButton jRadioButton138;
    private javax.swing.JRadioButton jRadioButton139;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton140;
    private javax.swing.JRadioButton jRadioButton141;
    private javax.swing.JRadioButton jRadioButton142;
    private javax.swing.JRadioButton jRadioButton143;
    private javax.swing.JRadioButton jRadioButton144;
    private javax.swing.JRadioButton jRadioButton145;
    private javax.swing.JRadioButton jRadioButton146;
    private javax.swing.JRadioButton jRadioButton147;
    private javax.swing.JRadioButton jRadioButton148;
    private javax.swing.JRadioButton jRadioButton149;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton150;
    private javax.swing.JRadioButton jRadioButton151;
    private javax.swing.JRadioButton jRadioButton152;
    private javax.swing.JRadioButton jRadioButton153;
    private javax.swing.JRadioButton jRadioButton154;
    private javax.swing.JRadioButton jRadioButton155;
    private javax.swing.JRadioButton jRadioButton156;
    private javax.swing.JRadioButton jRadioButton157;
    private javax.swing.JRadioButton jRadioButton158;
    private javax.swing.JRadioButton jRadioButton159;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton160;
    private javax.swing.JRadioButton jRadioButton161;
    private javax.swing.JRadioButton jRadioButton162;
    private javax.swing.JRadioButton jRadioButton163;
    private javax.swing.JRadioButton jRadioButton164;
    private javax.swing.JRadioButton jRadioButton165;
    private javax.swing.JRadioButton jRadioButton166;
    private javax.swing.JRadioButton jRadioButton167;
    private javax.swing.JRadioButton jRadioButton168;
    private javax.swing.JRadioButton jRadioButton169;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton170;
    private javax.swing.JRadioButton jRadioButton171;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton38;
    private javax.swing.JRadioButton jRadioButton39;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton40;
    private javax.swing.JRadioButton jRadioButton41;
    private javax.swing.JRadioButton jRadioButton42;
    private javax.swing.JRadioButton jRadioButton43;
    private javax.swing.JRadioButton jRadioButton44;
    private javax.swing.JRadioButton jRadioButton45;
    private javax.swing.JRadioButton jRadioButton46;
    private javax.swing.JRadioButton jRadioButton47;
    private javax.swing.JRadioButton jRadioButton48;
    private javax.swing.JRadioButton jRadioButton49;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton50;
    private javax.swing.JRadioButton jRadioButton51;
    private javax.swing.JRadioButton jRadioButton52;
    private javax.swing.JRadioButton jRadioButton53;
    private javax.swing.JRadioButton jRadioButton54;
    private javax.swing.JRadioButton jRadioButton55;
    private javax.swing.JRadioButton jRadioButton56;
    private javax.swing.JRadioButton jRadioButton57;
    private javax.swing.JRadioButton jRadioButton58;
    private javax.swing.JRadioButton jRadioButton59;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton60;
    private javax.swing.JRadioButton jRadioButton61;
    private javax.swing.JRadioButton jRadioButton62;
    private javax.swing.JRadioButton jRadioButton63;
    private javax.swing.JRadioButton jRadioButton64;
    private javax.swing.JRadioButton jRadioButton65;
    private javax.swing.JRadioButton jRadioButton66;
    private javax.swing.JRadioButton jRadioButton67;
    private javax.swing.JRadioButton jRadioButton68;
    private javax.swing.JRadioButton jRadioButton69;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton70;
    private javax.swing.JRadioButton jRadioButton71;
    private javax.swing.JRadioButton jRadioButton72;
    private javax.swing.JRadioButton jRadioButton73;
    private javax.swing.JRadioButton jRadioButton74;
    private javax.swing.JRadioButton jRadioButton75;
    private javax.swing.JRadioButton jRadioButton76;
    private javax.swing.JRadioButton jRadioButton77;
    private javax.swing.JRadioButton jRadioButton78;
    private javax.swing.JRadioButton jRadioButton79;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton80;
    private javax.swing.JRadioButton jRadioButton81;
    private javax.swing.JRadioButton jRadioButton82;
    private javax.swing.JRadioButton jRadioButton83;
    private javax.swing.JRadioButton jRadioButton84;
    private javax.swing.JRadioButton jRadioButton85;
    private javax.swing.JRadioButton jRadioButton86;
    private javax.swing.JRadioButton jRadioButton87;
    private javax.swing.JRadioButton jRadioButton88;
    private javax.swing.JRadioButton jRadioButton89;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JRadioButton jRadioButton90;
    private javax.swing.JRadioButton jRadioButton91;
    private javax.swing.JRadioButton jRadioButton92;
    private javax.swing.JRadioButton jRadioButton93;
    private javax.swing.JRadioButton jRadioButton94;
    private javax.swing.JRadioButton jRadioButton95;
    private javax.swing.JRadioButton jRadioButton96;
    private javax.swing.JRadioButton jRadioButton97;
    private javax.swing.JRadioButton jRadioButton98;
    private javax.swing.JRadioButton jRadioButton99;
    private javax.swing.JButton save;
    private javax.swing.JButton show;
    private javax.swing.JLabel total_gov_bud;
    private javax.swing.JLabel total_remain_label;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
