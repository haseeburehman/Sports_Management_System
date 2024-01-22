/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sportsmanagementsystem;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author hp
 */
public class AdminPlayerPanel extends javax.swing.JFrame {

    /**
     * Creates new form AdminPlayerPanel
     */
    public AdminPlayerPanel() {
        initComponents();
        connect();
        table_load();
        eventtable_load();
    }

    Connection con;
    PreparedStatement pst;
    DefaultTableModel df;

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sportmanagementsystem?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void table_load() {
        try {
            pst = con.prepareStatement("SELECT * FROM player");
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rd = rs.getMetaData();
            int c;
            c = rd.getColumnCount();
            df = (DefaultTableModel) jTable2.getModel();
            df.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();
                for (int i = 1; i <= c; i++) {
                    v2.add(rs.getString("playerID"));
                    v2.add(rs.getString("eventID"));
                    v2.add(rs.getString("name"));
                    v2.add(rs.getString("age"));
                    v2.add(rs.getString("gmail"));
                    v2.add(rs.getString("PassWord"));
                    v2.add(rs.getString("event"));
                    v2.add(rs.getString("dateofjoining"));
                }
                df.addRow(v2);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void eventtable_load() {
        try {
            
            pst = con.prepareStatement("SELECT * FROM event");
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rd = rs.getMetaData();
            int c;
            c = rd.getColumnCount();
            df = (DefaultTableModel) jTable3.getModel();
            df.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();
                for (int i = 1; i <= c; i++) {
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("name"));
                    v2.add(rs.getString("date"));

                }
                df.addRow(v2);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
 
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        edescription3 = new javax.swing.JTextField();
        ename3 = new javax.swing.JTextField();
        elocation3 = new javax.swing.JTextField();
        edate3 = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        eid3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        editevent = new javax.swing.JButton();
        deleteevent = new javax.swing.JButton();
        addevent2 = new javax.swing.JButton();
        cancelevent = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        pgmail = new javax.swing.JTextField();
        pname = new javax.swing.JTextField();
        pevent = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        page = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        pdoj = new com.toedter.calendar.JDateChooser();
        eventid = new javax.swing.JTextField();
        pid = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        pedit = new javax.swing.JButton();
        pdelete = new javax.swing.JButton();
        padd = new javax.swing.JButton();
        cancelplayer = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.cyan, java.awt.Color.cyan, java.awt.Color.cyan, java.awt.Color.cyan));

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(204, 153, 0), new java.awt.Color(153, 153, 0)));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel22.setText("Location");

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel23.setText("Id");

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel24.setText("Date");

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel25.setText("Description");

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel26.setText("Name");

        eid3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eid3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel25)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel26))
                .addGap(30, 30, 30)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ename3)
                    .addComponent(edescription3)
                    .addComponent(elocation3)
                    .addComponent(edate3, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(eid3))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23)
                    .addComponent(eid3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(ename3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(edate3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(edescription3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(elocation3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Event ID", "Name", "Event Date", "Description", "Location"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        editevent.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        editevent.setText("Edit");
        editevent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editeventActionPerformed(evt);
            }
        });

        deleteevent.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        deleteevent.setText("Delete");
        deleteevent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteeventActionPerformed(evt);
            }
        });

        addevent2.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        addevent2.setText("Add ");
        addevent2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addevent2ActionPerformed(evt);
            }
        });

        cancelevent.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        cancelevent.setText("Cancel");
        cancelevent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canceleventActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(addevent2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(editevent, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(deleteevent, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(cancelevent, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editevent, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteevent, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelevent, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addevent2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                                Sports Management System");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 2, 5, 1, new java.awt.Color(0, 153, 153)));
        jLabel1.setMaximumSize(new java.awt.Dimension(179, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel10.setBackground(new java.awt.Color(153, 153, 153));
        jPanel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.cyan, java.awt.Color.cyan, java.awt.Color.cyan, java.awt.Color.cyan));

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(204, 153, 0), new java.awt.Color(153, 153, 0)));

        jLabel27.setBackground(new java.awt.Color(0, 0, 0));
        jLabel27.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel27.setText("Event");

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel29.setText("Age");

        jLabel30.setBackground(new java.awt.Color(0, 0, 0));
        jLabel30.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel30.setText("Email");

        jLabel31.setBackground(new java.awt.Color(0, 0, 0));
        jLabel31.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel31.setText("Name");

        jLabel32.setBackground(new java.awt.Color(0, 0, 0));
        jLabel32.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel32.setText("Date of Joining");

        jLabel33.setBackground(new java.awt.Color(0, 0, 0));
        jLabel33.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel33.setText("EventID");

        jLabel34.setBackground(new java.awt.Color(0, 0, 0));
        jLabel34.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel34.setText("id");

        jLabel35.setBackground(new java.awt.Color(0, 0, 0));
        jLabel35.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel35.setText("Password");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel33))
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel35)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addGap(9, 9, 9)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pid, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(eventid)
                            .addComponent(pname)
                            .addComponent(pgmail)
                            .addComponent(pevent)
                            .addComponent(page)
                            .addComponent(password)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(18, 18, 18)
                        .addComponent(pdoj, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eventid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(pgmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pevent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pdoj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(25, 25, 25))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Player ID", "Event ID", "Player Name", "Age", "Gmail", "PassWord", "Event", "Date of Joining"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        pedit.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        pedit.setText("Edit");
        pedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peditActionPerformed(evt);
            }
        });

        pdelete.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        pdelete.setText("Delete");
        pdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdeleteActionPerformed(evt);
            }
        });

        padd.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        padd.setText("Add ");
        padd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paddActionPerformed(evt);
            }
        });

        cancelplayer.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        cancelplayer.setText("Cancel");
        cancelplayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelplayerActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "EventID", "EventName", "EventDate"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(padd, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(pedit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(pdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(cancelplayer, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pedit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelplayer, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(padd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(70, Short.MAX_VALUE))))
        );

        jPanel12.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("                                Sports Management System");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 2, 5, 1, new java.awt.Color(0, 153, 153)));
        jLabel2.setMaximumSize(new java.awt.Dimension(179, 50));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 380, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(208, 208, 208))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eid3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eid3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eid3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked


    }//GEN-LAST:event_jTable1MouseClicked

    private void editeventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editeventActionPerformed


    }//GEN-LAST:event_editeventActionPerformed

    private void deleteeventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteeventActionPerformed

    }//GEN-LAST:event_deleteeventActionPerformed

    private void addevent2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addevent2ActionPerformed

    }//GEN-LAST:event_addevent2ActionPerformed

    private void canceleventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canceleventActionPerformed

    }//GEN-LAST:event_canceleventActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        df = (DefaultTableModel) jTable2.getModel();

        int selected = jTable2.getSelectedRow();
        int id = Integer.parseInt(df.getValueAt(selected, 0).toString());

        pid.setText(df.getValueAt(selected, 0).toString());
        eventid.setText(df.getValueAt(selected, 1).toString());
        pname.setText(df.getValueAt(selected, 2).toString());
        page.setText(df.getValueAt(selected, 3).toString());
        pgmail.setText(df.getValueAt(selected, 4).toString());
        password.setText(df.getValueAt(selected, 5).toString());
        pevent.setText(df.getValueAt(selected, 6).toString());

        try {
            Date date = (Date) new SimpleDateFormat("yyyy-MM-dd").parse((String) df.getValueAt(selected, 7));
            pdoj.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(AdminEventPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        padd.setEnabled(false);
    }//GEN-LAST:event_jTable2MouseClicked

    private void peditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peditActionPerformed
        df = (DefaultTableModel) jTable2.getModel();
        int selected = jTable2.getSelectedRow();
        if (selected >= 0) {
            int id = Integer.parseInt(df.getValueAt(selected, 0).toString());

//      String Id = pid.getText();
            String eid = eventid.getText();
            String name = pname.getText();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String dateofjoining = df.format(pdoj.getDate());
            String event = pevent.getText();
            String age = page.getText();
            String gmail = pgmail.getText();
            String Password = password.getText();

            
             // Validate the username
        if (!isValidUsername(name)) {
            JOptionPane.showMessageDialog(this, "Invalid username. Please use only letters and numbers.");
            return;
        }

        // Validate the email
        if (!isValidEmail(gmail)) {
            JOptionPane.showMessageDialog(this, "Invalid email. Please enter a valid email address.");
            return;
        }

        // Validate the password
        if (!isValidPassword(Password)) {
            JOptionPane.showMessageDialog(this, "Invalid password. Please use at least 6 characters including numbers and special characters.");
            return;
        }

        // Check if the age is greater than 18
        int ageValue = 0;
        try {
            ageValue = Integer.parseInt(age);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid age. Please enter a valid number.");
            return;
        }

        if (ageValue <= 18) {
            JOptionPane.showMessageDialog(this, "Age must be greater than 18.");
            return;
        }

        SimpleDateFormat dd = new SimpleDateFormat("yyyy-MM-dd");
        Date selectedDate = pdoj.getDate();
        String date = dd.format(selectedDate);

        // Check if the date adheres to the specified pattern
        if (!isValidDatePattern(date)) {
            JOptionPane.showMessageDialog(this, "Invalid date. Please enter a valid date pattern.");
            return;
        }

            
            
            try {

                pst = this.con.prepareStatement("UPDATE player SET eventID=?,name=?,age=?,gmail=?,PassWord=?,event=?,dateOfJoining=? WHERE playerID=?");
//            pst.setInt(1, id);
//System.out.println("SQL Query: " + pst.toString());
                pst.setString(1, eid);
                pst.setString(2, name);
                pst.setString(3, age);
                pst.setString(4, gmail);
                pst.setString(5, Password);
                pst.setString(6, event);
                pst.setString(7, dateofjoining);
                pst.setInt(8, id);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "player Updated");

                pid.setText("");
                eventid.setText("");
                pname.setText("");
                page.setText("");
                pgmail.setText("");
                password.setText("");
                pevent.setText("");
                pname.requestFocus();

            } catch (SQLException ex) {
                Logger.getLogger(AdminEventPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

            padd.setEnabled(true);
            table_load();
        }
    }
    private boolean isValidUsername(String username) {
        // Allow only letters and numbers
        return username.matches("[a-zA-Z0-9]+");
    }

    private boolean isValidEmail(String email) {
        // A simple email validation pattern
        return email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }

    private boolean isValidPassword(String password) {
        // Allow at least 6 characters including numbers and special characters
        return password.matches("^(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{1,9}$");

    }

    private boolean isValidDatePattern(String input) {
String datePattern = "2024-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|30)";
        Pattern pattern = Pattern.compile(datePattern);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }//GEN-LAST:event_peditActionPerformed

    
    
    private void pdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdeleteActionPerformed
        df = (DefaultTableModel) jTable2.getModel();
        int selected = jTable2.getSelectedRow();
        int id = Integer.parseInt(df.getValueAt(selected, 0).toString());

        try {

            pst = this.con.prepareStatement("DELETE FROM player WHERE playerID=?");
            pst.setInt(1, id);
            pst.executeUpdate();

            pid.setText("");
            eventid.setText("");
            pname.setText("");
            page.setText("");
            pgmail.setText("");
            password.setText("");
            pevent.setText("");
            pname.requestFocus();
            JOptionPane.showMessageDialog(this, "Player Deleted");
        } catch (SQLException ex) {
            Logger.getLogger(AdminEventPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        padd.setEnabled(true);
        table_load();
    }//GEN-LAST:event_pdeleteActionPerformed

    private void paddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paddActionPerformed
        String id = pid.getText();
        String eid = eventid.getText();
        String name = pname.getText();
        String gmail = pgmail.getText();
        String Password = password.getText();
        String age = page.getText();
        String event = pevent.getText();

         if (!isValidEvent(eid,event)) {
        JOptionPane.showMessageDialog(this, "this event's players team is full");
        return;
    }
        
        // Validate the username
        if (!ValidUsername(name)) {
            JOptionPane.showMessageDialog(this, "Invalid username. Please use only letters and numbers.");
            return;
        }

        // Validate the email
        if (!ValidEmail(gmail)) {
            JOptionPane.showMessageDialog(this, "Invalid email. Please enter a valid email address.");
            return;
        }

        // Validate the password
        if (!ValidPassword(Password)) {
            JOptionPane.showMessageDialog(this, "Invalid password. Please use at least 6 characters including numbers and special characters.");
            return;
        }

        // Check if the age is greater than 18
        int ageValue = 0;
        try {
            ageValue = Integer.parseInt(age);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid age. Please enter a valid number.");
            return;
        }

        if (ageValue <= 18) {
            JOptionPane.showMessageDialog(this, "Age must be greater than 18.");
            return;
        }

        SimpleDateFormat dd = new SimpleDateFormat("yyyy-MM-dd");
        Date selectedDate = pdoj.getDate();
        String date = dd.format(selectedDate);

        // Check if the date adheres to the specified pattern
        if (!ValidDatePattern(date)) {
            JOptionPane.showMessageDialog(this, "Invalid date. Please enter a valid date pattern.");
            return;
        }

        try {
            pst = this.con.prepareStatement("INSERT INTO player(playerID,eventID,name,age,gmail,PassWord,event,dateOfJoining) VALUES (?,?,?,?,?,?,?,?)");
            pst.setString(1, id);
            pst.setString(2, eid);
            pst.setString(3, name);
            pst.setString(4, age);
            pst.setString(5, gmail);
            pst.setString(6, Password);
            pst.setString(7, event);
            pst.setString(8, date);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Player Added");

            // Clear input fields
            pid.setText("");
            eventid.setText("");
            pname.setText("");
            page.setText("");
            pgmail.setText("");
            password.setText("");
            pevent.setText("");
            pdoj.setDate(null);  // Clear the date chooser
            pname.requestFocus();

            table_load();
        } catch (SQLException ex) {
            Logger.getLogger(AdminEventPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private boolean isValidEvent(String eventId, String eventName) {
    try {
        // Use a PreparedStatement to avoid SQL injection
        String query = "SELECT COUNT(*) FROM player WHERE eventID = ?";
        PreparedStatement countStatement = con.prepareStatement(query);
        countStatement.setString(1, eventId);

        ResultSet resultSet = countStatement.executeQuery();
        if (resultSet.next()) {
            int eventCount = resultSet.getInt(1);

            // Set the maximum limit based on the event type
            int maxLimit = getMaxPlayersForEvent(eventName);

            return eventCount < maxLimit;
        }
    } catch (SQLException ex) {
        Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
    }

    // Return false by default (in case of an error or if the event ID is not found)
    return false;
}

private int getMaxPlayersForEvent(String eventName) {
    // Set the maximum limit based on the event type
    // Adjust this method based on your requirements
    switch (eventName.toLowerCase()) {
        case "cricket":
        case "football":
            return 11;
        case "badminton":
        case "squash":
            return 4;
            case "basketball":
                 return 5;
        default:
            return -1; 
    }
}


    private boolean ValidUsername(String username) {
        // Allow only letters and numbers
        return username.matches("[a-zA-Z0-9]+");
    }

    private boolean ValidEmail(String email) {
        // A simple email validation pattern
        return email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }

    private boolean ValidPassword(String password) {
        // Allow at least 6 characters including numbers and special characters
        return password.matches("^(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{1,9}$");

    }

    private boolean ValidDatePattern(String input) {
        String datePattern = "2024-(0[1-9]|1[0-2])-(1[0-9]|2[0-9]|3[0-1])";
        Pattern pattern = Pattern.compile(datePattern);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();

    }//GEN-LAST:event_paddActionPerformed

    private void cancelplayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelplayerActionPerformed
        this.hide();
        Adminpanel frm = new Adminpanel();
        frm.setVisible(true);
    }//GEN-LAST:event_cancelplayerActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.hide();
        firstpage frm = new firstpage();
        frm.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3MouseClicked

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
            java.util.logging.Logger.getLogger(AdminPlayerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPlayerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPlayerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPlayerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPlayerPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addevent2;
    private javax.swing.JButton cancelevent;
    private javax.swing.JButton cancelplayer;
    private javax.swing.JButton deleteevent;
    private com.toedter.calendar.JDateChooser edate3;
    private javax.swing.JTextField edescription3;
    private javax.swing.JButton editevent;
    private javax.swing.JTextField eid3;
    private javax.swing.JTextField elocation3;
    private javax.swing.JTextField ename3;
    private javax.swing.JTextField eventid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton padd;
    private javax.swing.JTextField page;
    private javax.swing.JTextField password;
    private javax.swing.JButton pdelete;
    private com.toedter.calendar.JDateChooser pdoj;
    private javax.swing.JButton pedit;
    private javax.swing.JTextField pevent;
    private javax.swing.JTextField pgmail;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pname;
    // End of variables declaration//GEN-END:variables
}
