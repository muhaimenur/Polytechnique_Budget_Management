/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budget_of_polytechnic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Muhaimenur
 */
public class Non_govt extends javax.swing.JFrame {
    int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13,num14,num15,num16,num17,num18,num19,num20,num21,num22,num23,num24,num25,num_of_STD;
    int value1,value2,value3,value4,value5,value6,value7,value8,value9,value10,value11,value12,value13,value14,value15,value16,value17,value18,value19,value20,value21,value22,value23,value24,value25;
    String session, Entry_date, str1,str2,str3,str4,str5,str6,str7,str8,str9,str10,str11,str12,str13,str14,str15,str16,str17,str18,str19,str20,str21,str22,str23,str24,str25;
    public ResultSet rs;
   public Statement st;
   public Connection con;
    private PreparedStatement pst;
    /**
     * Creates new form Non_govt
     */
    public Non_govt() {
        initComponents();
        Connection();
        setLocationRelativeTo(null);
        this.setResizable(false);
    }

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
    
    public void non_govt_main_entry()
    {
         try{
                
                    String sql = "insert into non_govt_main values ('" + str1 + "','" + session + "','" + Entry_date + "','" + num_of_STD + "','" + num1 + "','" + (num_of_STD*num1) + "')";
                    pst = con.prepareStatement(sql);
                    pst.execute();
               
                    String sql1 = "insert into non_govt_main values ('" + str2 + "','" + session + "','" + Entry_date + "','" + num_of_STD + "','" + num2 + "','" + (num_of_STD*num2) + "')";
                    pst = con.prepareStatement(sql1);
                    pst.execute();
               
                    String sql2 = "insert into non_govt_main values ('" + str3 + "','" + session + "','" + Entry_date + "','" + num_of_STD + "','" + num3 + "','" + (num_of_STD*num3) + "')";
                    pst = con.prepareStatement(sql2);
                    pst.execute();

                    String sql3 = "insert into non_govt_main values ('" + str4 + "','" + session + "','" + Entry_date + "','" + num_of_STD + "','" + num4 + "','" + (num_of_STD*num4) + "')";
                    pst = con.prepareStatement(sql3);
                    pst.execute();

                    String sql4 = "insert into non_govt_main values ('" + str5 + "','" + session + "','" + Entry_date + "','" + num_of_STD + "','" + num5 + "','" + (num_of_STD*num5) + "')";
                    pst = con.prepareStatement(sql4);
                    pst.execute();

                    String sql5 = "insert into non_govt_main values ('" + str6 + "','" + session + "','" + Entry_date + "','" + num_of_STD + "','" + num6 + "','" + (num_of_STD*num6) + "')";
                    pst = con.prepareStatement(sql5);
                    pst.execute();

                    String sql6 = "insert into non_govt_main values ('" + str7 + "','" + session + "','" + Entry_date + "','" + num_of_STD + "','" + num7 + "','" + (num_of_STD*num7) + "')";
                    pst = con.prepareStatement(sql6);
                    pst.execute();

                    String sql7 = "insert into non_govt_main values ('" + str8 + "','" + session + "','" + Entry_date + "','" + num_of_STD + "','" + num8 + "','" + (num_of_STD*num8) + "')";
                    pst = con.prepareStatement(sql7);
                    pst.execute();

                    String sql8 = "insert into non_govt_main values ('" + str9 + "','" + session + "','" + Entry_date + "','" + num_of_STD + "','" + num9 + "','" + (num_of_STD*num9) + "')";
                    pst = con.prepareStatement(sql8);
                    pst.execute();
                    String sql9 = "insert into non_govt_main values ('" + str10 + "','" + session + "','" + Entry_date + "','" + num_of_STD + "','" + num10 + "','" + (num_of_STD*num10) + "')";
                    pst = con.prepareStatement(sql9);
                    pst.execute();

                    String sql10 = "insert into non_govt_main values ('" + str11 + "','" + session + "','" + Entry_date + "','" + num_of_STD + "','" + num11 + "','" + (num_of_STD*num11) + "')";
                    pst = con.prepareStatement(sql10);
                    pst.execute();

                    String sql11 = "insert into non_govt_main values ('" + str12 + "','" + session + "','" + Entry_date + "','" + num_of_STD + "','" + num12 + "','" + (num_of_STD*num12) + "')";
                    pst = con.prepareStatement(sql11);
                    pst.execute();
                    String sql12 = "insert into non_govt_main values ('" + str13 + "','" + session + "','" + Entry_date + "','" + num_of_STD + "','" + num13 + "','" + (num_of_STD*num13) + "')";
                    pst = con.prepareStatement(sql12);
                    pst.execute();

                    String sql13 = "insert into non_govt_main values ('" + str14 + "','" + session + "','" + Entry_date + "','" + num_of_STD + "','" + num14 + "','" + (num_of_STD*num14) + "')";
                    pst = con.prepareStatement(sql13);
                    pst.execute();

                    String sql14 = "insert into non_govt_main values ('" + str15 + "','" + session + "','" + Entry_date + "','" + num_of_STD + "','" + num15 + "','" + (num_of_STD*num15) + "')";
                    pst = con.prepareStatement(sql14);
                    pst.execute();

                    String sql15 = "insert into non_govt_main values ('" + str16 + "','" + session + "','" + Entry_date + "','" + num_of_STD + "','" + num16 + "','" + (num_of_STD*num16) + "')";
                    pst = con.prepareStatement(sql15);
                    pst.execute();

                    String sql16 = "insert into non_govt_main values ('" + str17 + "','" + session + "','" + Entry_date + "','" + num_of_STD + "','" + num17 + "','" + (num_of_STD*num17) + "')";
                    pst = con.prepareStatement(sql16);
                    pst.execute();

                    String sql17 = "insert into non_govt_main values ('" + str18 + "','" + session + "','" + Entry_date + "','" + num_of_STD + "','" + num18 + "','" + (num_of_STD*num18) + "')";
                    pst = con.prepareStatement(sql17);
                    pst.execute();

                    String sql18 = "insert into non_govt_main values ('" + str19 + "','" + session + "','" + Entry_date + "','" + num_of_STD + "','" + num19 + "','" + (num_of_STD*num19) + "')";
                    pst = con.prepareStatement(sql18);
                    pst.execute();
                    String sql19 = "insert into non_govt_main values ('" + str20 + "','" + session + "','" + Entry_date + "','" + num_of_STD + "','" + num20 + "','" + (num_of_STD*num20) + "')";
                    pst = con.prepareStatement(sql19);
                    pst.execute();

                    String sql20 = "insert into non_govt_main values ('" + str21 + "','" + session + "','" + Entry_date + "','" + num_of_STD + "','" + num21 + "','" + (num_of_STD*num21) + "')";
                    pst = con.prepareStatement(sql20);
                    pst.execute();

                    String sql21 = "insert into non_govt_main values ('" + str22 + "','" + session + "','" + Entry_date + "','" + num_of_STD + "','" + num22 + "','" + (num_of_STD*num22) + "')";
                    pst = con.prepareStatement(sql21);
                    pst.execute();

                    String sql22 = "insert into non_govt_main values ('" + str23 + "','" + session + "','" + Entry_date + "','" + num_of_STD + "','" + num23 + "','" + (num_of_STD*num23) + "')";
                    pst = con.prepareStatement(sql22);
                    pst.execute();

                    String sql23 = "insert into non_govt_main values ('" + str24 + "','" + session + "','" + Entry_date + "','" + num_of_STD + "','" + num24 + "','" + (num_of_STD*num24) + "')";
                    pst = con.prepareStatement(sql23);
                    pst.execute();

                    String sql24 = "insert into non_govt_main values ('" + str25 + "','" + session + "','" + Entry_date + "','" + num_of_STD + "','" + num25 + "','" + (num_of_STD*num25) + "')";
                    pst = con.prepareStatement(sql24);
                    pst.execute();

            }
    catch (Exception e) 
           {
            JOptionPane.showMessageDialog(rootPane, "Database Error");
           }
    
    
    }
    
    public void update_non_govt()
    {
        try {
            String sql3 = "select * from non_govt";
            rs = st.executeQuery(sql3);
    
            int count = 0;
            while (rs.next()) {
                if (count == 0) {
                    value1 = Integer.parseInt(rs.getString("Total_Amount"));
                    String sql = "UPDATE non_govt SET Total_Amount='" + (value1+(num_of_STD*num1)) + "' WHERE Khat='" + str1 + "'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
        
                } else if (count == 1) {
                    
                    value2 = Integer.parseInt(rs.getString("Total_Amount"));
                    
                    String sql = "UPDATE non_govt SET Total_Amount='" + (value2+(num_of_STD*num2)) + "' WHERE Khat='" + str2 + "'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
                
                } else if (count == 2) {
                    
                    value3 = Integer.parseInt(rs.getString("Total_Amount"));
                   
                    String sql = "UPDATE non_govt SET Total_Amount='" + (value3+(num_of_STD*num3)) + "' WHERE Khat='" + str3 + "'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
                  
                } else if (count == 3) {
                    
                    value4 = Integer.parseInt(rs.getString("Total_Amount"));
                    
                    String sql = "UPDATE non_govt SET Total_Amount='" + (value4+(num_of_STD*num4)) + "' WHERE Khat='" + str4 + "'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
                  
                } else if (count == 4) {
                   
                    value5 = Integer.parseInt(rs.getString("Total_Amount"));
                   
                    String sql = "UPDATE non_govt SET Total_Amount='" + (value5+(num_of_STD*num5)) + "' WHERE Khat='" + str5 + "'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
                 
                } else if (count == 5) {
                    
                    value6 = Integer.parseInt(rs.getString("Total_Amount"));
                   
                    String sql = "UPDATE non_govt SET Total_Amount='" + (value6+(num_of_STD*num6)) + "' WHERE Khat='" + str6 + "'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
                
                } else if (count == 6) {
                    
                    value7 = Integer.parseInt(rs.getString("Total_Amount"));
                    
                    String sql = "UPDATE non_govt SET Total_Amount='" + (value7+(num_of_STD*num7)) + "' WHERE Khat='" + str7 + "'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
                
                } else if (count == 7) {
                   
                    value8 = Integer.parseInt(rs.getString("Total_Amount"));
                    
                    String sql = "UPDATE non_govt SET Total_Amount='" + (value8+(num_of_STD*num8)) + "' WHERE Khat='" + str8 + "'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
                
                } else if (count == 8) {
                   
                    value9 = Integer.parseInt(rs.getString("Total_Amount"));
                    
                    String sql = "UPDATE non_govt SET Total_Amount='" + (value9+(num_of_STD*num9)) + "' WHERE Khat='" + str9 + "'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
                
                } else if (count == 9) {
                    
                    value10 = Integer.parseInt(rs.getString("Total_Amount"));
                    
                    String sql = "UPDATE non_govt SET Total_Amount='" + (value10+(num_of_STD*num10)) + "' WHERE Khat='" + str10 + "'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
                
                } else if (count == 10) {
                    
                    value11 = Integer.parseInt(rs.getString("Total_Amount"));
                    
                    String sql = "UPDATE non_govt SET Total_Amount='" + (value11+(num_of_STD*num11)) + "' WHERE Khat='" + str11 + "'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
                 
                } else if (count == 11) {
                    
                    value12 = Integer.parseInt(rs.getString("Total_Amount"));
                    
                    String sql = "UPDATE non_govt SET Total_Amount='" + (value12+(num_of_STD*num12)) + "' WHERE Khat='" + str12 + "'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
                
                } else if (count == 12) {
                    
                    value13 = Integer.parseInt(rs.getString("Total_Amount"));
                    
                    String sql = "UPDATE non_govt SET Total_Amount='" + (value13+(num_of_STD*num13)) + "' WHERE Khat='" + str13 + "'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
                
                } else if (count == 13) {
                    
                    value14 = Integer.parseInt(rs.getString("Total_Amount"));
                    
                    String sql = "UPDATE non_govt SET Total_Amount='" + (value14+(num_of_STD*num14)) + "' WHERE Khat='" + str14 + "'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
              
                } else if (count == 14) {
                    
                    value15 = Integer.parseInt(rs.getString("Total_Amount"));
                    
                    String sql = "UPDATE non_govt SET Total_Amount='" + (value15+(num_of_STD*num15)) + "' WHERE Khat='" + str15 + "'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
            
                } else if (count == 15) {
                    
                    value16 = Integer.parseInt(rs.getString("Total_Amount"));
                    
                    String sql = "UPDATE non_govt SET Total_Amount='" + (value16+(num_of_STD*num16)) + "' WHERE Khat='" + str16 + "'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
               
                } else if (count == 16) {
                   
                    value17 = Integer.parseInt(rs.getString("Total_Amount"));
                    
                    String sql = "UPDATE non_govt SET Total_Amount='" + (value17+(num_of_STD*num17)) + "' WHERE Khat='" + str17 + "'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
               
                } else if (count == 17) {
                    
                    value18 = Integer.parseInt(rs.getString("Total_Amount"));
                    
                    String sql = "UPDATE non_govt SET Total_Amount='" + (value18+(num_of_STD*num18)) + "' WHERE Khat='" + str18 + "'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
                
                } else if (count == 18) {
                    
                    value19 = Integer.parseInt(rs.getString("Total_Amount"));
                    
                    String sql = "UPDATE non_govt SET Total_Amount='" + (value19+(num_of_STD*num19)) + "' WHERE Khat='" + str19 + "'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
                
                } else if (count == 19) {
                   
                    value20 = Integer.parseInt(rs.getString("Total_Amount"));
                    
                    String sql = "UPDATE non_govt SET Total_Amount='" + (value20+(num_of_STD*num20)) + "' WHERE Khat='" + str20 + "'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
               
                } else if (count == 20) {
                    
                    value21 = Integer.parseInt(rs.getString("Total_Amount"));
                    
                    String sql = "UPDATE non_govt SET Total_Amount='" + (value21+(num_of_STD*num21)) + "' WHERE Khat='" + str21 + "'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
                
                } else if (count == 21) {
                    
                    value22 = Integer.parseInt(rs.getString("Total_Amount"));
                    
                    String sql = "UPDATE non_govt SET Total_Amount='" + (value22+(num_of_STD*num22)) + "' WHERE Khat='" + str22 + "'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
                 
                } else if (count == 22) {
                    
                    value23 = Integer.parseInt(rs.getString("Total_Amount"));
                    
                    String sql = "UPDATE non_govt SET Total_Amount='" + (value23+(num_of_STD*num23)) + "' WHERE Khat='" + str23 + "'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
                    
               
                } else if (count == 23) {
                    
                    value24 = Integer.parseInt(rs.getString("Total_Amount"));
                   
                    String sql = "UPDATE non_govt SET Total_Amount='" + (value24+(num_of_STD*num24)) + "' WHERE Khat='" + str24 + "'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
                  
                } else if (count == 24) {
                    
                    value25 = Integer.parseInt(rs.getString("Total_Amount"));
                    
                    String sql = "UPDATE non_govt SET Total_Amount='" + (value25+(num_of_STD*num25)) + "' WHERE Khat='" + str25 + "'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
                 
                } 
                count++;
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Data Show Error");
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

        jLabel20 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        showTable = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        save = new javax.swing.JButton();
        govt_entry = new javax.swing.JButton();
        showdata = new javax.swing.JButton();
        date = new com.toedter.calendar.JDateChooser();
        logout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        remain = new javax.swing.JLabel();

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("Admission/ Re-admission Fee");

        jTextField25.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Non Govt. Entry");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Admission/ Re-admission Fee");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Number of Students");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Salary (Per semester)");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Security");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Internal Examination Fee");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Magazine (Yearly)");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Religious fund");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Mark sheet fee");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Rover Scout");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Registration Fee");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Health examination fee");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Identity card");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Red Crescent Fee");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Pay Out ");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Session ");

        showTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Khat", "Total_Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(showTable);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Date");

        save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        govt_entry.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        govt_entry.setText("Govt. Entry");
        govt_entry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                govt_entryActionPerformed(evt);
            }
        });

        showdata.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showdata.setText("Show data");
        showdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showdataActionPerformed(evt);
            }
        });

        date.setDateFormatString("yyyy-MM-dd");
        date.setFocusCycleRoot(true);
        date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(logout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showdata, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(save, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(govt_entry, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(save)
                .addGap(18, 18, 18)
                .addComponent(showdata)
                .addGap(18, 18, 18)
                .addComponent(govt_entry)
                .addGap(18, 18, 18)
                .addComponent(logout)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Admission application fee");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Mosque development fee");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Sports & Culture fee");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("Testimonial fee");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Regular student cirtificate fee");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("Transport fee");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Poor/Welfare fund");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("Security/guard/essential teacher/employee");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("ICT fee");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("Bicycle garage fee");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("Guardian's Day fee");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setText("Other/Miscellaneous");

        jTextField33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField33ActionPerformed(evt);
            }
        });

        jTextField27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField21)
                            .addComponent(jTextField22, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Total Remaining :");

        remain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        remain.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                                .addComponent(jTextField4))
                                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField18, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                        .addComponent(jTextField19))
                                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel30))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(remain, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel29)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(remain))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField27ActionPerformed

    private void jTextField33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField33ActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
         num1 = Integer.parseInt(jTextField1.getText());
        
         num2 = Integer.parseInt(jTextField3.getText());
         num3 = Integer.parseInt(jTextField5.getText());
         num4 = Integer.parseInt(jTextField7.getText());
         num5 = Integer.parseInt(jTextField9.getText());
         num6 = Integer.parseInt(jTextField11.getText());
         num7 = Integer.parseInt(jTextField13.getText());
         num8 = Integer.parseInt(jTextField15.getText());
         num9 = Integer.parseInt(jTextField16.getText());
         num10 = Integer.parseInt(jTextField17.getText());
         num11 = Integer.parseInt(jTextField18.getText());
         num12 = Integer.parseInt(jTextField19.getText());
         num13 = Integer.parseInt(jTextField20.getText());
         num14 = Integer.parseInt(jTextField21.getText());
         num15 = Integer.parseInt(jTextField22.getText());
         num16 = Integer.parseInt(jTextField23.getText());
         num17 = Integer.parseInt(jTextField24.getText());
         num18 = Integer.parseInt(jTextField26.getText());
         num19 = Integer.parseInt(jTextField27.getText());
         num20 = Integer.parseInt(jTextField28.getText());
         num21 = Integer.parseInt(jTextField29.getText());
         num22 = Integer.parseInt(jTextField30.getText());
         num23 = Integer.parseInt(jTextField31.getText());
         num24 = Integer.parseInt(jTextField32.getText());
         num25 = Integer.parseInt(jTextField33.getText());
        
         num_of_STD = Integer.parseInt(jTextField4.getText());
         session = jTextField2.getText();
         Entry_date = ((JTextField) date.getDateEditor().getUiComponent()).getText();
         
        str1 = "Admission/ Re-admission Fee";
        str2 = "Salary (Per semester)";
        str3 = "Security";
        str4 = "Internal Examination Fee";
        str5 = "Magazine (Yearly)";
        str6 = "Religious fund";
        str7 = "Mark sheet fee";
        str8 = "Rover Scout";
        str9 = "Registration Fee";
        str10 = "Health examination fee";
        str11 = "Identity card";
        str12 = "Red Crescent Fee";
        str13 = "Pay Out";
        str14 = "Admission application fee";
        str15 = "Mosque development fee";
        str16 = "Sports & Culture fee";
        str17 = "Testimonial fee";
        str18 = "Regular student cirtificate fee";
        str19 = "Transport fee";
        str20 = "Poor/Welfare fund";
        str21 = "Security/guard/essential teacher/employee";
        str22 = "ICT fee";
        str23 = "Bicycle garage fee";
        str24 = "Guardians Day fee";
        str25 = "Other/Miscellaneous";
         
         try{
           String sql50 = "select count(*) from non_govt";
           pst = con.prepareStatement(sql50);
           rs = pst.executeQuery();
            if(rs.next())
            {
                String cn = rs.getString("count(*)");
                int count = Integer.parseInt(cn);
                if(count==0)
                {
                    try{
                    System.out.println("yep");
                    String sql = "insert into non_govt values ('" + str1 + "','" + (num_of_STD*num1) + "')";
                    pst = con.prepareStatement(sql);
                    pst.execute();
               
                    String sql1 = "insert into non_govt values ('" + str2 + "','" + (num_of_STD*num2) + "')";
                    pst = con.prepareStatement(sql1);
                    pst.execute();
               
                    String sql2 = "insert into non_govt values ('" + str3 + "','" + (num_of_STD*num3) + "')";
                    pst = con.prepareStatement(sql2);
                    pst.execute();

                    String sql3 = "insert into non_govt values ('" + str4 + "','" + (num_of_STD*num4) + "')";
                    pst = con.prepareStatement(sql3);
                    pst.execute();

                    String sql4 = "insert into non_govt values ('" + str5 + "','" + (num_of_STD*num5) + "')";
                    pst = con.prepareStatement(sql4);
                    pst.execute();

                    String sql5 = "insert into non_govt values ('" + str6 + "','" + (num_of_STD*num6) + "')";
                    pst = con.prepareStatement(sql5);
                    pst.execute();

                    String sql6 = "insert into non_govt values ('" + str7 + "','" + (num_of_STD*num7) + "')";
                    pst = con.prepareStatement(sql6);
                    pst.execute();

                    String sql7 = "insert into non_govt values ('" + str8 + "','" + (num_of_STD*num8) + "')";
                    pst = con.prepareStatement(sql7);
                    pst.execute();

                    String sql8 = "insert into non_govt values ('" + str9 + "','" + (num_of_STD*num9) + "')";
                    pst = con.prepareStatement(sql8);
                    pst.execute();
                    String sql9 = "insert into non_govt values ('" + str10 + "','" + (num_of_STD*num10) + "')";
                    pst = con.prepareStatement(sql9);
                    pst.execute();

                    String sql10 = "insert into non_govt values ('" + str11 + "','" + (num_of_STD*num11) + "')";
                    pst = con.prepareStatement(sql10);
                    pst.execute();

                    String sql11 = "insert into non_govt values ('" + str12 + "','" + (num_of_STD*num12) + "')";
                    pst = con.prepareStatement(sql11);
                    pst.execute();
                    String sql12 = "insert into non_govt values ('" + str13 + "','" + (num_of_STD*num13) + "')";
                    pst = con.prepareStatement(sql12);
                    pst.execute();

                    String sql13 = "insert into non_govt values ('" + str14 + "','" + (num_of_STD*num14) + "')";
                    pst = con.prepareStatement(sql13);
                    pst.execute();

                    String sql14 = "insert into non_govt values ('" + str15 + "','" + (num_of_STD*num15) + "')";
                    pst = con.prepareStatement(sql14);
                    pst.execute();

                    String sql15 = "insert into non_govt values ('" + str16 + "','" + (num_of_STD*num16) + "')";
                    pst = con.prepareStatement(sql15);
                    pst.execute();

                    String sql16 = "insert into non_govt values ('" + str17 + "','" + (num_of_STD*num17) + "')";
                    pst = con.prepareStatement(sql16);
                    pst.execute();

                    String sql17 = "insert into non_govt values ('" + str18 + "','" + (num_of_STD*num18) + "')";
                    pst = con.prepareStatement(sql17);
                    pst.execute();

                    String sql18 = "insert into non_govt values ('" + str19 + "','" + (num_of_STD*num19) + "')";
                    pst = con.prepareStatement(sql18);
                    pst.execute();
                    String sql19 = "insert into non_govt values ('" + str20 + "','" + (num_of_STD*num20) + "')";
                    pst = con.prepareStatement(sql19);
                    pst.execute();

                    String sql20 = "insert into non_govt values ('" + str21 + "','" + (num_of_STD*num21) + "')";
                    pst = con.prepareStatement(sql20);
                    pst.execute();

                    String sql21 = "insert into non_govt values ('" + str22 + "','" + (num_of_STD*num22) + "')";
                    pst = con.prepareStatement(sql21);
                    pst.execute();

                    String sql22 = "insert into non_govt values ('" + str23 + "','" + (num_of_STD*num23) + "')";
                    pst = con.prepareStatement(sql22);
                    pst.execute();
                    
                    
                    String sql124 = "insert into non_govt values ('" + str25 + "','" + (num_of_STD*num25) + "')";
                    pst = con.prepareStatement(sql124);
                    pst.execute();
                    
                    
                    String sql123 = "insert into non_govt values ('" + str24 + "','" + (num_of_STD*num24) + "')";
                    pst = con.prepareStatement(sql123);
                    pst.execute();

                    non_govt_main_entry();
                    }
                    catch (Exception e) 
                    {
                     JOptionPane.showMessageDialog(rootPane, "Database Error");
                    }
                
                }
                else
                {
                    non_govt_main_entry();
                    update_non_govt();
                
                }
            }

    }
    catch (Exception e) 
           {
            JOptionPane.showMessageDialog(rootPane, "Database Error");
           }
    }//GEN-LAST:event_saveActionPerformed

    private void showdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showdataActionPerformed
        try {
            String ShowData = "Select * from non_govt";
            pst = con.prepareStatement(ShowData);
            rs = pst.executeQuery();

            showTable.setModel(DbUtils.resultSetToTableModel(rs));
            showTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            
            
            String rem = "Select sum(Total_Amount) from non_govt";
            pst = con.prepareStatement(rem);
            rs = pst.executeQuery();
            if(rs.next())
            {
                String sum = rs.getString("sum(Total_Amount)");
                remain.setText(String.valueOf(sum));
            }
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Data Show Error");
        }
        
        
    }//GEN-LAST:event_showdataActionPerformed

    private void govt_entryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_govt_entryActionPerformed
        AdminPanel ap = new AdminPanel();
        ap.show();
        this.dispose();
    }//GEN-LAST:event_govt_entryActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Login l = new Login();
        l.show();
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(Non_govt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Non_govt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Non_govt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Non_govt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Non_govt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton govt_entry;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField13;
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
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton logout;
    private javax.swing.JLabel remain;
    private javax.swing.JButton save;
    private javax.swing.JTable showTable;
    private javax.swing.JButton showdata;
    // End of variables declaration//GEN-END:variables
}
