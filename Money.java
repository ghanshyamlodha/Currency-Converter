
import javax.swing.JOptionPane;

public class Money extends javax.swing.JFrame {

   
    
/**
     * Creates new form Money
     */
        String[] currencyunits ={"Unit","US Dollar","Nigerian Naira","Brazil Naira","Canada Dollar","Kenyan Shilling","Indonesia Rupiah","Indian Rupee","Philippine Pisco","Pakistan Rupee"};

    double us_dollar = 1.38;
    double nigerian_naira=524.88;
    double brazilian_real=7.39;
    double canadian_dollar=1.75;
    double kenyan_shilling=150.60;
    double indonesian_rupiah=19207.65;
    double indian_rupee=100.40;
    double philippine_pisco=66.17;
    double pakistani_rupee=220.20;


    public Money() {
       
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        firstcountry = new javax.swing.JComboBox<>();
        secondcountry = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        firstcurrencyunit = new javax.swing.JLabel();
        secondcurrencyunit = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/converter-512.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Currency Converter");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));

        firstcountry.setFont(new java.awt.Font("Lao UI", 0, 12)); // NOI18N
        firstcountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One...", "USA", "Nigeria", "Brazil", "Canada", "Kenyan", "Indonesia", "India", "Philippine", "pakistan" }));
        firstcountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                firstcountryItemStateChanged(evt);
            }
        });

        secondcountry.setFont(new java.awt.Font("Lao UI", 0, 12)); // NOI18N
        secondcountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One...", "USA", "Nigeria", "Brazil", "Canada", "Kenyan", "Indonesia", "India", "Philippine", "pakistan" }));
        secondcountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                secondcountryItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jLabel3.setText("from currency of :");

        jLabel4.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jLabel4.setText("to currency of :");

        firstcurrencyunit.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N
        firstcurrencyunit.setText("Unit");

        secondcurrencyunit.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N
        secondcurrencyunit.setText("Unit");

        jButton1.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images (1).png"))); // NOI18N
        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.png"))); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.jpeg"))); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        t1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        t2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jButton1)
                        .addGap(160, 160, 160)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(firstcountry, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(49, 49, 49))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(firstcurrencyunit, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(secondcountry, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secondcurrencyunit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(jButton3))))
                .addGap(84, 84, 84))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstcountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(secondcountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstcurrencyunit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secondcurrencyunit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jMenu1.setText("Help");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstcountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_firstcountryItemStateChanged
        int position = firstcountry.getSelectedIndex();
        firstcurrencyunit.setText(currencyunits[position]);
    }//GEN-LAST:event_firstcountryItemStateChanged

    private void secondcountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_secondcountryItemStateChanged
        
        int position = secondcountry.getSelectedIndex();
        secondcurrencyunit.setText(currencyunits[position]);
    }//GEN-LAST:event_secondcountryItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       double amount_changed = Double.parseDouble(t1.getText());
       double amount_pounds = 0.0;
       double amount_convert = 0.0;
       
       
       switch(firstcountry.getSelectedItem().toString())
       {
           case "USA":
           amount_pounds = amount_changed/us_dollar;
           break;
           
           case "Nigeria":
           amount_pounds = amount_changed/nigerian_naira;
           break;
           
           case "Brazil":
           amount_pounds = amount_changed/brazilian_real;
           break;
           
           case "Canada":
           amount_pounds = amount_changed/canadian_dollar;
           break;
           
           case "Kenya":
           amount_pounds = amount_changed/kenyan_shilling;
           break;
           
           case "Indonesia":
           amount_pounds = amount_changed/indonesian_rupiah;
           break;
           
           case "India":
           amount_pounds = amount_changed/indian_rupee;
           break;
           
           case "Philippine":
           amount_pounds = amount_changed/philippine_pisco;
           break;
           
           case "Pakistan":
           amount_pounds = amount_changed/pakistani_rupee;
           break;
           
           default :
           amount_pounds = 0.0;
       }
      
    
        
       
       switch(secondcountry.getSelectedItem().toString())
       {
           case "USA":
           amount_convert=amount_pounds*us_dollar;
           break;
           
           case "Nigeria":
            amount_convert=amount_pounds*nigerian_naira;
           break;
           
           case "Brazil":
            amount_convert=amount_pounds*brazilian_real;
           break;
           
           case "Canada":
            amount_convert=amount_pounds*canadian_dollar;
           break;
           
           case "Kenya":
            amount_convert=amount_pounds*kenyan_shilling;
           break;
           
           case "Indonesia":
           amount_convert=amount_pounds*indonesian_rupiah;
           break;
           
           case "India":
           amount_convert=amount_pounds*indian_rupee;
           break;
           
           case "Philippine":
            amount_convert=amount_pounds*philippine_pisco;
           break;
           
           case "Pakistan":
            amount_convert=amount_pounds*pakistani_rupee;
           break;
           
           default :
           amount_convert = 0.0;
       }
       
       String value =String.format("%.2f",amount_convert);
       t2.setText(value);
       
       if(firstcountry.getSelectedIndex()==0 || secondcountry.getSelectedIndex()==0 || t1.getText().equals(""))
       {
           JOptionPane.showMessageDialog(null,"you must select both the countries and must input the amount","error message",
           JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        firstcountry.setSelectedIndex(0);
        secondcountry.setSelectedIndex(0);
        t1.setText(null);
        t2.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Money().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> firstcountry;
    private javax.swing.JLabel firstcurrencyunit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> secondcountry;
    private javax.swing.JLabel secondcurrencyunit;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
