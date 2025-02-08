package ui;

import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import model.User;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author samps
 */
public class Lab3AssignmentJFrame extends javax.swing.JFrame {

    /**
     * Creates new form Lab2AssignmentJFrame
     */
    public Lab3AssignmentJFrame() {
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

        createuserprofilePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        firstnameLabel = new javax.swing.JLabel();
        lastnameLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        phonenumberLabel = new javax.swing.JLabel();
        emailaddressLabel = new javax.swing.JLabel();
        firstnameTextField = new javax.swing.JTextField();
        lastnameTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        phonenumberTextField = new javax.swing.JTextField();
        emailaddressTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        PictureButton = new javax.swing.JButton();
        imgLabel = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox<>();
        hobbiesLabel = new javax.swing.JLabel();
        hobbisScrollPane = new javax.swing.JScrollPane();
        hobbiesTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 153));

        createuserprofilePanel.setBackground(new java.awt.Color(255, 0, 255));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Create User Profile");

        firstnameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        firstnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstnameLabel.setText("First Name");

        lastnameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lastnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastnameLabel.setText("Last Name");

        genderLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(255, 255, 255));
        genderLabel.setText("Gender");

        ageLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ageLabel.setForeground(new java.awt.Color(255, 255, 255));
        ageLabel.setText("Age");

        phonenumberLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        phonenumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        phonenumberLabel.setText("Phone Number");

        emailaddressLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        emailaddressLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailaddressLabel.setText("Email Address");

        submitButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        PictureButton.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        PictureButton.setText("Upload");
        PictureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PictureButtonActionPerformed(evt);
            }
        });

        imgLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        imgLabel.setForeground(new java.awt.Color(255, 255, 255));
        imgLabel.setText("Profile Photo");

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Unspecified" }));
        genderComboBox.setSelectedIndex(-1);

        hobbiesLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hobbiesLabel.setForeground(new java.awt.Color(255, 255, 255));
        hobbiesLabel.setText("Hobbies");

        hobbiesTextArea.setColumns(20);
        hobbiesTextArea.setRows(5);
        hobbisScrollPane.setViewportView(hobbiesTextArea);

        javax.swing.GroupLayout createuserprofilePanelLayout = new javax.swing.GroupLayout(createuserprofilePanel);
        createuserprofilePanel.setLayout(createuserprofilePanelLayout);
        createuserprofilePanelLayout.setHorizontalGroup(
            createuserprofilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createuserprofilePanelLayout.createSequentialGroup()
                .addGroup(createuserprofilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createuserprofilePanelLayout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(submitButton))
                    .addGroup(createuserprofilePanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(createuserprofilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(createuserprofilePanelLayout.createSequentialGroup()
                                .addGroup(createuserprofilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(createuserprofilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(firstnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(createuserprofilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lastnameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                            .addComponent(genderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(phonenumberLabel)
                                        .addComponent(emailaddressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                        .addComponent(hobbiesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(createuserprofilePanelLayout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(73, 73, 73)
                                .addGroup(createuserprofilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(createuserprofilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(genderComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phonenumberTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
                                    .addGroup(createuserprofilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(emailaddressTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(createuserprofilePanelLayout.createSequentialGroup()
                                            .addComponent(PictureButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(8, 8, 8)))
                                    .addComponent(hobbisScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        createuserprofilePanelLayout.setVerticalGroup(
            createuserprofilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createuserprofilePanelLayout.createSequentialGroup()
                .addGroup(createuserprofilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createuserprofilePanelLayout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(24, 24, 24)
                        .addGroup(createuserprofilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstnameLabel)
                            .addComponent(firstnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(createuserprofilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastnameLabel)
                            .addComponent(lastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(createuserprofilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderLabel)
                            .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(createuserprofilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageLabel)
                            .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(createuserprofilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phonenumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phonenumberLabel))
                        .addGap(18, 18, 18)
                        .addGroup(createuserprofilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailaddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailaddressLabel))
                        .addGap(34, 34, 34)
                        .addGroup(createuserprofilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hobbiesLabel)
                            .addComponent(hobbisScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addComponent(PictureButton)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createuserprofilePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addComponent(submitButton)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(createuserprofilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createuserprofilePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        //1. Declaring and Initializing Object Variable
        try{
        User userObject = new User();
                
        //2. Get data from the text field
        userObject.setFirstname(this.firstnameTextField.getText());
        userObject.setLastname(this.lastnameTextField.getText());
        userObject.setGender(this.genderComboBox.getSelectedItem().toString());
        userObject.setAge(Integer.parseInt(this.ageTextField.getText()));
        userObject.setEmailaddress(this.emailaddressTextField.getText());
        userObject.setPhonenumber(this.phonenumberTextField.getText());
        userObject.setHobbies(this.hobbiesTextArea.getText());
        userObject.setImg(this.imgLabel.getText());
                
        //3. Display information to the user (as a pop up)
        System.out.println(userObject.getFirstname());
        System.out.println(userObject.getLastname());
        System.out.println(userObject.getGender());
        System.out.println(userObject.getAge());
        System.out.println(userObject.getEmailaddress());
        System.out.println(userObject.getPhonenumber());
        System.out.println(userObject.getHobbies());
        System.out.println(userObject);
        
        //4. Creating pop up to screen
        if (userObject.getFirstname().isBlank())
            {JOptionPane.showMessageDialog(rootPane, "First name is required", "Oops", HEIGHT);
            }else if (userObject.getLastname().isBlank())
            {JOptionPane.showMessageDialog(rootPane, "Last name is required", "Oops", HEIGHT);
            }else if (userObject.getPhonenumber().isBlank())
            {JOptionPane.showMessageDialog(rootPane, "Please provide your phone number", "Oops", HEIGHT);
            }else if (userObject.getEmailaddress().isBlank())
            {JOptionPane.showMessageDialog(rootPane, "Please provide your email address", "Oops", HEIGHT);
            }else         
            {JOptionPane.showMessageDialog(rootPane, userObject, "Success!", HEIGHT);
        }
        
       //5. //NullPointerException when the user does not select any gender
        }catch (NullPointerException npe)
                {JOptionPane.showMessageDialog(rootPane, "Please select your gender", "Cannot Proceed!", HEIGHT);
        }catch (NumberFormatException nfe)
        {JOptionPane.showMessageDialog(rootPane, "Oops! Input a number for age. ", "Failed", HEIGHT);
        } catch (Exception e) 
        {JOptionPane.showMessageDialog(rootPane, "Oops! Something went wrong. Please try again ", "Failed", HEIGHT);}
               
    }//GEN-LAST:event_submitButtonActionPerformed

    private void PictureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PictureButtonActionPerformed
        // TODO add your handling code here:
        

JFileChooser file = new JFileChooser();
if (file.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
    try {
        BufferedImage img = ImageIO.read(file.getSelectedFile());
        if (img != null) {
            Image edited_image = img.getScaledInstance(60, 80, Image.SCALE_SMOOTH);
            imgLabel.setIcon(new ImageIcon(edited_image));
            imgLabel.setText(file.getSelectedFile().getAbsolutePath());
           // this.userInfo.setPic(new ImageIcon(edited_image)); 
        } else {
            JOptionPane.showMessageDialog(this, "Selected file is not an image.", "Error - Incorrect image", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Please upload image correctly.", "Error - Incorrect image", JOptionPane.ERROR_MESSAGE);
    }
}


    }//GEN-LAST:event_PictureButtonActionPerformed
    
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
            java.util.logging.Logger.getLogger(Lab3AssignmentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab3AssignmentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab3AssignmentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab3AssignmentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab3AssignmentJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PictureButton;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JPanel createuserprofilePanel;
    private javax.swing.JLabel emailaddressLabel;
    private javax.swing.JTextField emailaddressTextField;
    private javax.swing.JLabel firstnameLabel;
    private javax.swing.JTextField firstnameTextField;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel hobbiesLabel;
    private javax.swing.JTextArea hobbiesTextArea;
    private javax.swing.JScrollPane hobbisScrollPane;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JTextField lastnameTextField;
    private javax.swing.JLabel phonenumberLabel;
    private javax.swing.JTextField phonenumberTextField;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
