
package Rent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CarMoto extends javax.swing.JFrame {
    
    Connection con;
    Statement stmt;
    ResultSet rs;
    int curRow = 0;
    String pass1 = "admin";
    String pass2 = "employee";
    
    public CarMoto() {
        initComponents();
        DoConnect();
    }
    
    public void DoConnect() {
        try 
        {
            //Connect to the database
            String host = "jdbc:derby://localhost:1527/Rent";
            String uName = "hello";
            String uPass = "world";
            con = DriverManager.getConnection(host, uName, uPass);
            
            //load records into the resultset
            stmt = con.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE );
            String sql = "SELECT * FROM CarMoto";
            rs = stmt.executeQuery(sql);
            
            //move the cursor to the first record and get the data
            rs.next();
            int id_col = rs.getInt("ID");
            String id = Integer.toString(id_col);
            String manuf = rs.getString("Manufacturer");
            String mod = rs.getString("Model");
            String avail = rs.getString("Availability");
            String typ = rs.getString("Type");
                       
            //dislpay the first record in the text fields
            textID.setText(id);
            textManufacturer.setText(manuf);
            textModel.setText(mod);
            textAvailability.setText(avail);
            textType.setText(typ);
        }
        catch (SQLException err)
        {
            JOptionPane.showMessageDialog(CarMoto.this, err.getMessage());
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textID = new javax.swing.JTextField();
        textManufacturer = new javax.swing.JTextField();
        textModel = new javax.swing.JTextField();
        textAvailability = new javax.swing.JTextField();
        textType = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnFirst = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rent MotoCar");

        textAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAvailabilityActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Διαθεσιμότητα:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Τύπος:");

        jLabel3.setText("Μηχ.Λογ. 2013");

        btnFirst.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFirst.setText("First");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLast.setText("Last");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUpdate.setText("Ενημέρωση");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.setText("Διαγραφή");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnNew.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNew.setText("Δημιουργία");
        btnNew.setEnabled(false);
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPrint.setText("Επικύρωση Ενοικίασης");
        btnPrint.setEnabled(false);
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExit.setText("'Εξοδος Προσωπικού");
        btnExit.setEnabled(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel4.setText("~Rent MotoCar~");

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSave.setText("Αποθήκευση Νέας Εγγραφής");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancel.setText("Ακύρωση Νέας Εγγραφής");
        btnCancel.setEnabled(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLogin.setText("Είσοδος Προσωπικού");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rent/carmoto.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLogin)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUpdate)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnNext)
                                        .addComponent(btnSave))
                                    .addComponent(btnFirst)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(196, 196, 196)
                                        .addComponent(btnDelete)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnNew, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(159, 159, 159))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnPrevious)
                                        .addGap(25, 25, 25)
                                        .addComponent(btnLast))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnPrint)
                                        .addGap(167, 167, 167))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(textManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(101, 101, 101)
                                        .addComponent(textModel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(textAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(85, 85, 85)
                                                .addComponent(jLabel2)
                                                .addGap(25, 25, 25)
                                                .addComponent(textType)))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirst)
                    .addComponent(btnNext)
                    .addComponent(btnPrevious)
                    .addComponent(btnLast))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnNew))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrint)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnLogin)
                    .addComponent(jLabel3)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
            String manuf1 = textManufacturer.getText();
            String mod1 = textModel.getText();
            String avail1 = textAvailability.getText();
            String typ1 = textType.getText();
            int answer=JOptionPane.showConfirmDialog(null,"Πρόκεται να διαγράψετε το όχημα \n\n-Κατασκευαστής: "+manuf1+"\n-Μοντέλο: "+mod1+"\n-Διαθέσιμο: "+avail1+"\n-Τύπος:"+typ1+"\n\nΕίστε βέβαιοι;", "Διαγραφή οχήματος;",JOptionPane.YES_NO_CANCEL_OPTION);            
            if (answer==0)
            {           
                try
                {   
                    rs.deleteRow();
                    stmt.close();
                    rs.close();
                    stmt = con.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE );

                    String sql = "SELECT * FROM CarMoto";
                    rs = stmt.executeQuery(sql);

                    rs.next();
                    int id_col = rs.getByte("ID");
                    String id = Integer.toString(id_col);
                    String manuf = rs.getString("Manufacturer");
                    String mod = rs.getString("Model");
                    String typ = rs.getString("Type");
                    String avail = rs.getString("Availability");

                    textID.setText(id);
                    textManufacturer.setText(manuf);
                    textModel.setText(mod);
                    textType.setText(typ);
                    textAvailability.setText(avail);
                    JOptionPane.showMessageDialog(null, "Η διαγραφή ολοκληρώθηκε");
                }
                catch (SQLException err)
                {
                System.out.println(err.getMessage());
                }
            }     
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void textAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAvailabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAvailabilityActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        try 
         {
                if ( rs.next( ) ) 
                {
                        int id_col = rs.getInt("ID");
                        String id = Integer.toString(id_col);
                        String manuf = rs.getString("Manufacturer");
                        String mod = rs.getString("Model");
                        String avail = rs.getString("Availability");
                        String typ = rs.getString("Type");

                        textID.setText(id);
                        textManufacturer.setText(manuf);
                        textModel.setText(mod);
                        textAvailability.setText(avail);
                        textType.setText(typ);
                }
                else 
                {
                        rs.previous( );
                        JOptionPane.showMessageDialog(CarMoto.this, "End of File");
                }
          }
          catch (SQLException err) 
          {
                    JOptionPane.showMessageDialog(CarMoto.this, err.getMessage());
          }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        try 
         {
                if ( rs.previous( ) ) 
                {
                        int id_col = rs.getInt("ID");
                        String id = Integer.toString(id_col);
                        String manuf = rs.getString("Manufacturer");
                        String mod = rs.getString("Model");
                        String avail = rs.getString("Availability");
                        String typ = rs.getString("Type");

                        textID.setText(id);
                        textManufacturer.setText(manuf);
                        textModel.setText(mod);
                        textAvailability.setText(avail);
                        textType.setText(typ);
                }
                else 
                {
                        rs.next( );
                        JOptionPane.showMessageDialog(CarMoto.this, "Start of File");
                }
          }
          catch (SQLException err) 
          {
                    JOptionPane.showMessageDialog(CarMoto.this, err.getMessage());
          }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
       try 
         {
               rs.first(); 
               int id_col = rs.getInt("ID");
               String id = Integer.toString(id_col);
               String manuf = rs.getString("Manufacturer");
               String mod = rs.getString("Model");
               String avail = rs.getString("Availability");
               String typ = rs.getString("Type");
               
               textID.setText(id);
               textManufacturer.setText(manuf);
               textModel.setText(mod);
               textAvailability.setText(avail);
               textType.setText(typ);
          }
          catch (SQLException err) 
          {
                    JOptionPane.showMessageDialog(CarMoto.this, err.getMessage());
          }
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        try 
         {
               rs.last(); 
               int id_col = rs.getInt("ID");
               String id = Integer.toString(id_col);
               String manuf = rs.getString("Manufacturer");
               String mod = rs.getString("Model");
               String avail = rs.getString("Availability");
               String typ = rs.getString("Type");
               
               textID.setText(id);
               textManufacturer.setText(manuf);
               textModel.setText(mod);
               textAvailability.setText(avail);
               textType.setText(typ);
          }
          catch (SQLException err) 
          {
                    JOptionPane.showMessageDialog(CarMoto.this, err.getMessage());
          }
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
               String id = textID.getText();
               String manuf = textManufacturer.getText();
               String mod = textModel.getText();
               String avail = textAvailability.getText();
               String typ = textType.getText();
               
               int newID = Integer.parseInt(id);
               
               try 
               {
                    rs.updateInt( "ID", newID );
                    rs.updateString( "Manufacturer", manuf );
                    rs.updateString( "Model", mod );
                    rs.updateString( "Type", typ );
                    rs.updateString("Availability", avail);
                    rs.updateRow( );
                    JOptionPane.showMessageDialog(CarMoto.this, "Updated");
                }
                catch (SQLException err) 
                {
                    System.out.println(err.getMessage() );
                }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        try
        {   
            curRow = rs.getRow();
            
            textManufacturer.setText("");
            textModel.setText("");
            textAvailability.setText("");
            textType.setText("");
            textID.setText("");
            
            btnFirst.setEnabled( false );
            btnPrevious.setEnabled( false ) ;
            btnNext.setEnabled( false );
            btnLast.setEnabled( false );
            btnUpdate.setEnabled( false );
            btnDelete.setEnabled( false );
            btnNew.setEnabled( false );
            btnPrint.setEnabled( false );

            btnSave.setEnabled( true );
            btnCancel.setEnabled( true );
        }
        catch (SQLException err)
        {
            System.out.println(err.getMessage());
        }
                                       

    
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String id = textID.getText();
        String manuf = textManufacturer.getText();
        String mod = textModel.getText();
        String avail = textAvailability.getText();
        String typ = textType.getText();
        int newID = Integer.parseInt(id);
        try
        {   
            rs.moveToInsertRow();
            
            rs.updateInt( "ID", newID );
            rs.updateString( "Manufacturer", manuf );
            rs.updateString( "Model", mod );
            rs.updateString( "Type", typ );
            rs.updateString("Availability", avail);

            rs.insertRow();
            
            stmt.close();
            rs.close();
            
            stmt = con.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE );
            String sql = "SELECT * FROM CarMoto";
            rs = stmt.executeQuery(sql);
            
            rs.next();
            int id_col = rs.getInt("ID");
            String id2 = Integer.toString(id_col);
            String manuf2 = rs.getString("Manufacturer");
            String mod2 = rs.getString("Model");
            String avail2 = rs.getString("Availability");
            String typ2 = rs.getString("Type");
                       
            //dislpay the first record in the text fields
            textID.setText(id2);
            textManufacturer.setText(manuf2);
            textModel.setText(mod2);
            textAvailability.setText(avail2);
            textType.setText(typ2);
            
            btnFirst.setEnabled( true );
            btnPrevious.setEnabled( true ) ;
            btnNext.setEnabled( true );
            btnLast.setEnabled( true );
            btnUpdate.setEnabled( true );
            btnDelete.setEnabled( true );
            btnNew.setEnabled( true );
            btnPrint.setEnabled( true );
            
            btnSave.setEnabled( false );
            btnCancel.setEnabled( false );
        }
        catch  (SQLException err) 
        {
            System.out.println(err.getMessage() );       
        }        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        try
        {   
            rs.absolute(curRow);
            textManufacturer.setText(rs.getString("Manufacturer"));
            textModel.setText(rs.getString("Model"));
            textType.setText(rs.getString("Type"));
            textAvailability.setText(rs.getString("Availability"));
            textID.setText( Integer.toString(rs.getInt("ID")));
            
            btnFirst.setEnabled( true );
            btnPrevious.setEnabled( true ) ;
            btnNext.setEnabled( true );
            btnLast.setEnabled( true );
            btnUpdate.setEnabled( true );
            btnDelete.setEnabled( true );
            btnNew.setEnabled( true );
            btnPrint.setEnabled( true );

            btnSave.setEnabled( false );
            btnCancel.setEnabled( false );
        }
        catch (SQLException err)
        {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        ImageIcon image = new ImageIcon("C:\\images.gif");
        String names[]={"Διαχειριστής", "Υπάλληλος"};
        String name=(String) JOptionPane.showInputDialog(null, "Παρακαλώ, επιλέξτε χρήστη:" , "Χρήστες", JOptionPane.PLAIN_MESSAGE,image,names,names[1]);
        if (name=="Διαχειριστής")
        {
            String pass=JOptionPane.showInputDialog(null, "Παρακαλώ, εισάγετε τον κωδικό:", "Εισαγωγή Κωδικού", JOptionPane.PLAIN_MESSAGE);
                if (pass.equals(pass1))
                {
                    btnFirst.setEnabled( true );
                    btnPrevious.setEnabled( true ) ;
                    btnNext.setEnabled( true );
                    btnLast.setEnabled( true );
                    btnUpdate.setEnabled( true );
                    btnDelete.setEnabled( true );
                    btnNew.setEnabled( true );
                    btnPrint.setEnabled( true );
                    btnExit.setEnabled( true );

                    btnSave.setEnabled( false );
                    btnCancel.setEnabled( false );
                }
                else if (pass!=null)//Αν πατηθεί cancel κλείνει το παράθυρο χωρίς να τυπώνει κάτι. Αν εισαχθεί λάθος κωδικός βγάζει μήνυμα  λάθους
                {
                    JOptionPane.showMessageDialog(null, "Λάθος Κωδικός");
                }                
        }
        else if (name=="Υπάλληλος")
        {
            String pass=JOptionPane.showInputDialog(null, "Παρακαλώ εισάγετε τον κωδικό:", "Εισαγωγή Κωδικού", JOptionPane.PLAIN_MESSAGE);
            if (pass.equals(pass2))
                {
                    btnFirst.setEnabled( true );
                    btnPrevious.setEnabled( true );
                    btnNext.setEnabled( true );
                    btnLast.setEnabled( true );
                    btnUpdate.setEnabled( true );
                    btnDelete.setEnabled( false );
                    btnNew.setEnabled( false );
                    btnPrint.setEnabled( true );
                    btnExit.setEnabled( true );

                    btnSave.setEnabled( false );
                    btnCancel.setEnabled( false );
                }
            else if (pass2!=null)//Αν πατηθεί cancel κλείνει το παράθυρο χωρίς να τυπώνει κάτι. Αν εισαχθεί λάθος κωδικός βγάζει μήνυμα  λάθους
                {
                    JOptionPane.showMessageDialog(null, "Λάθος Κωδικός");
                }                
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int answer=JOptionPane.showConfirmDialog(null, "Πρόκειται να επιστρέψετε σε απλά δικαιώματα χρήστη. Είστε βέβαιοι;", "Έλεγχος Εξόδου", JOptionPane.YES_NO_CANCEL_OPTION);
            if (answer==0)
            {           
            btnFirst.setEnabled( true );
            btnPrevious.setEnabled( true ) ;
            btnNext.setEnabled( true );
            btnLast.setEnabled( true );
            btnUpdate.setEnabled( false );
            btnDelete.setEnabled( false );
            btnNew.setEnabled( false );
            btnPrint.setEnabled( false );
            btnExit.setEnabled( false );
            
            btnSave.setEnabled( false );
            btnCancel.setEnabled( false );
            }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
            ImageIcon image_yes = new ImageIcon("C:\\check.gif");
            ImageIcon image_no = new ImageIcon("C:\\error.gif");    
            String yes = "Ναι";
            String manuf = textManufacturer.getText();
            String mod = textModel.getText();
            String avail = textAvailability.getText();
            String typ = textType.getText();
            int answer=JOptionPane.showConfirmDialog(null,"Επίκυρωση ενοικίασης του οχήματος:\n\n-Κατασκευαστής: "+manuf+"\n-Μοντέλο: "+mod+"\n-Διαθέσιμο: "+avail, "Επικύρωση Ενοικίασης",JOptionPane.YES_NO_CANCEL_OPTION);
            if (answer==0)
            {   
                if (avail.equals("Ναι"))
                    
                {
                JOptionPane.showMessageDialog(null, "H εγγραφή έγινε επιτυχώς!\n\n\nΥπενθύμιση: Η διαθεσιμότητα του οχήματος άλλαξε!","Επιτυχία",JOptionPane.PLAIN_MESSAGE,image_yes);
                
                textAvailability.setText("Όχι");
               
                
                }
                else
                {
                JOptionPane.showMessageDialog(null, "Το όχημα δεν είναι διαθέσιμο","Μη διαθέσιμο",JOptionPane.PLAIN_MESSAGE,image_no);
                }
            }
    }//GEN-LAST:event_btnPrintActionPerformed

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
            java.util.logging.Logger.getLogger(CarMoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarMoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarMoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarMoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarMoto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textAvailability;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textManufacturer;
    private javax.swing.JTextField textModel;
    private javax.swing.JTextField textType;
    // End of variables declaration//GEN-END:variables
}
