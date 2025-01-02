
import javax.swing.JOptionPane;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASAR
 */
public class CurrencyConverter extends javax.swing.JFrame {
  
    public static void storeToDataBase(String q) {

        String url = "jdbc:mysql://localhost:3306/converter";
        String username = "root";
        String password = "mysql123";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection(url, username, password);
            Statement stmnt = connect.createStatement();
            stmnt.executeUpdate(q);
       
        }catch(Exception e){
            e.getMessage();
        }
    }
    /**
     * Creates new form CurrencyConverter
     */
    public CurrencyConverter() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtamount = new javax.swing.JTextField();
        txtfrom = new javax.swing.JComboBox<>();
        txtto = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Enter a amount");

        jLabel2.setText("from");

        jLabel3.setText("To");

        txtfrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", " " }));

        txtto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Srilankan Rupees", "Indian Rupees", "Germany Rupees", "England Rupees", "Malaysia Rupees", "Pakistani Rupees", "South African Rupees" }));
        txtto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttoActionPerformed(evt);
            }
        });

        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Currency Converter");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(144, 144, 144)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtfrom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtto, 0, 124, Short.MAX_VALUE)
                    .addComponent(txtamount))
                .addContainerGap(242, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
        Double tot;
        Double amount = Double.parseDouble(txtamount.getText());
        String currencyFrom = "USD";
        String currencyTo;
        
        if("USD".equals(txtfrom.getSelectedItem().toString()) && "Srilankan Rupees".equals(txtto.getSelectedItem().toString()))
        {
            tot = amount*310.64;
            currencyTo = txtto.getSelectedItem().toString();
            String query = String.format("INSERT INTO currency(currencyfrom, currencyto, converted) VALUES ('%s', '%s', %f)", currencyFrom, currencyTo, tot);
            storeToDataBase(query);
            JOptionPane.showMessageDialog(this,"Your amount will be "+ tot.toString()+" LKR");
        }
        if("USD".equals(txtfrom.getSelectedItem().toString()) && "Indian Rupees".equals(txtto.getSelectedItem().toString()))
        {
            tot = amount*82.88 ;
            currencyTo = txtto.getSelectedItem().toString();
            String query = String.format("INSERT INTO currency(currencyfrom, currencyto, converted) VALUES ('%s', '%s', %f)", currencyFrom, currencyTo, tot);
            storeToDataBase(query);
            JOptionPane.showMessageDialog(this,"Your amount will be "+ tot.toString()+" INR");
        }
        
        if("USD".equals(txtfrom.getSelectedItem().toString()) && "Germany Rupees".equals(txtto.getSelectedItem().toString()))
        {
            tot = amount*0.92 ;
            currencyTo = txtto.getSelectedItem().toString();
            String query = String.format("INSERT INTO currency(currencyfrom, currencyto, converted) VALUES ('%s', '%s', %f)", currencyFrom, currencyTo, tot);
            storeToDataBase(query);
            JOptionPane.showMessageDialog(this,"Your amount will be "+ tot.toString()+" euro");
        }
        if("USD".equals(txtfrom.getSelectedItem().toString()) && "England Rupees".equals(txtto.getSelectedItem().toString()))
        {
            tot = amount*0.78 ;
            currencyTo = txtto.getSelectedItem().toString();
            String query = String.format("INSERT INTO currency(currencyfrom, currencyto, converted) VALUES ('%s', '%s', %f)", currencyFrom, currencyTo, tot);
            storeToDataBase(query);
            JOptionPane.showMessageDialog(this,"Your amount will be "+ tot.toString()+" pound");
        }
        if("USD".equals(txtfrom.getSelectedItem().toString()) && "Malaysia Rupees".equals(txtto.getSelectedItem().toString()))
        {
            tot = amount*4.68 ;
            currencyTo = txtto.getSelectedItem().toString();
            String query = String.format("INSERT INTO currency(currencyfrom, currencyto, converted) VALUES ('%s', '%s', %f)", currencyFrom, currencyTo, tot);
            storeToDataBase(query);
            JOptionPane.showMessageDialog(this,"Your amount will be "+ tot.toString()+" Malaysian Ringgit");
        }
        if("USD".equals(txtfrom.getSelectedItem().toString()) && "Pakistani Rupees".equals(txtto.getSelectedItem().toString()))
        {
            tot = amount*278.92  ;
            currencyTo = txtto.getSelectedItem().toString();
            String query = String.format("INSERT INTO currency(currencyfrom, currencyto, converted) VALUES ('%s', '%s', %f)", currencyFrom, currencyTo, tot);
            storeToDataBase(query);
            JOptionPane.showMessageDialog(this,"Your amount will be "+ tot.toString()+" Pakistani Rupees");
        }
        if("USD".equals(txtfrom.getSelectedItem().toString()) && "South African Rupees".equals(txtto.getSelectedItem().toString()))
        {
            tot = amount*18.68  ;
            currencyTo = txtto.getSelectedItem().toString();
            String query = String.format("INSERT INTO currency(currencyfrom, currencyto, converted) VALUES ('%s', '%s', %f)", currencyFrom, currencyTo, tot);
            storeToDataBase(query);
            JOptionPane.showMessageDialog(this,"Your amount will be "+ tot.toString()+" Rand");
        }
          
            
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txttoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttoActionPerformed

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
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtamount;
    private javax.swing.JComboBox<String> txtfrom;
    private javax.swing.JComboBox<String> txtto;
    // End of variables declaration//GEN-END:variables
}
