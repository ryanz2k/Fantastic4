package IMS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Personal
 */
public class POSLogin extends javax.swing.JFrame {
    
    public POSLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Right = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameLogin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordLogin = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Login ");
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Left.setBackground(new java.awt.Color(51, 51, 51));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));
        Left.setPreferredSize(new java.awt.Dimension(400, 500));
        Left.setLayout(null);
        Left.add(jLabel5);
        jLabel5.setBounds(105, 117, 0, 190);

        jLabel6.setFont(new java.awt.Font("Gadugi", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("WELCOME TO POS SYSTEM");
        Left.add(jLabel6);
        jLabel6.setBounds(30, 290, 338, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMS/FantasticFourLogo.png"))); // NOI18N
        Left.add(jLabel7);
        jLabel7.setBounds(100, 90, 200, 200);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMS/FantasticFourLogo.png"))); // NOI18N
        Left.add(jLabel8);
        jLabel8.setBounds(100, 90, 200, 200);

        jPanel1.add(Left);
        Left.setBounds(0, -10, 400, 500);

        Right.setBackground(new java.awt.Color(255, 255, 255));
        Right.setMinimumSize(new java.awt.Dimension(400, 500));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));
        Right.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("LOGIN");
        Right.add(jLabel1);
        jLabel1.setBounds(128, 33, 118, 43);

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Username");
        jLabel2.setPreferredSize(new java.awt.Dimension(60, 20));
        Right.add(jLabel2);
        jLabel2.setBounds(18, 102, 141, 20);

        usernameLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernameLogin.setForeground(new java.awt.Color(102, 102, 102));
        usernameLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameLoginActionPerformed(evt);
            }
        });
        Right.add(usernameLogin);
        usernameLogin.setBounds(18, 134, 324, 40);

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Password");
        Right.add(jLabel3);
        jLabel3.setBounds(18, 192, 129, 17);

        passwordLogin.setForeground(new java.awt.Color(102, 102, 102));
        passwordLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordLoginActionPerformed(evt);
            }
        });
        Right.add(passwordLogin);
        passwordLogin.setBounds(18, 221, 324, 40);

        LoginButton.setBackground(new java.awt.Color(102, 102, 102));
        LoginButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        Right.add(LoginButton);
        LoginButton.setBounds(18, 292, 93, 35);

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("I don't have an account?");
        Right.add(jLabel4);
        jLabel4.setBounds(10, 400, 144, 30);

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jButton2.setText("Sign Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Right.add(jButton2);
        jButton2.setBounds(160, 400, 80, 30);

        jButton4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Right.add(jButton4);
        jButton4.setBounds(270, 400, 70, 30);

        jPanel1.add(Right);
        Right.setBounds(410, 0, 360, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordLoginActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
       
      String loginUsername = usernameLogin.getText();
      String loginPassword = new String(passwordLogin.getPassword());
      String DIRECTORY_PATH = "NetbeansProject/Inventory Management and POS/ F4 Data";
        File directory = new File(DIRECTORY_PATH);

        if (!directory.exists() || !directory.isDirectory()) {
            JOptionPane.showMessageDialog(null, "Error: Account doesn't exist");
            return;
        }

        boolean accountExists = false;

        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        String storedUsername = null;
                        String storedPassword = null;
                        String line;

                        while ((line = reader.readLine()) != null) {
                            if (line.startsWith("Username:")) {
                                storedUsername = line.substring(line.indexOf(":") + 1).trim();
                            } else if (line.startsWith("Password:")) {
                                storedPassword = line.substring(line.indexOf(":") + 1).trim();
                            }
                        }

                        // Compare the stored credentials with the entered credentials
                        if (storedUsername != null && storedPassword != null &&
                            storedUsername.equals(loginUsername) && storedPassword.equals(loginPassword)) {
                            accountExists = true;
                            break;
                        }
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
                        return;
                    }
                }
            }
        }

        if (accountExists) {
            JOptionPane.showMessageDialog(null, "Successfully Login");
           
        } else {
            JOptionPane.showMessageDialog(null, "Error: Account doesn't exist");
        }
                
        
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
       POSSignUp POSSignUpFrame = new  POSSignUp();
       POSSignUpFrame.setVisible(true);
       POSSignUpFrame.pack();
       POSSignUpFrame.setLocationRelativeTo(null); 
       this.dispose();
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         
         userType userTypeFrame = new userType();
         userTypeFrame.setVisible(true);
         userTypeFrame.pack();
         userTypeFrame.setLocationRelativeTo(null); 
         this.dispose();
         
    }//GEN-LAST:event_jButton4ActionPerformed

    private void usernameLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel Right;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordLogin;
    private javax.swing.JTextField usernameLogin;
    // End of variables declaration//GEN-END:variables
}
