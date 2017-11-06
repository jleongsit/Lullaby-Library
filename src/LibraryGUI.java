
import java.util.ArrayList;


public class LibraryGUI extends javax.swing.JFrame {

    public LibraryGUI() {
        initComponents();
        LoginErrorLabel.setVisible(false);
        //CustomerPage.setVisible(false);
        EmployeePage.setVisible(false);
        ManagerPage.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        LoginPage = new javax.swing.JPanel();
        LoginLabel = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        UsernameField = new javax.swing.JTextField();
        LoginErrorLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        EmployeePage = new javax.swing.JPanel();
        CustomerPage = new javax.swing.JPanel();
        CustomerList = new javax.swing.JComboBox<>();
        CustomerField = new javax.swing.JTextField();
        CustomerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CustomerArea = new javax.swing.JTextArea();
        ManagerPage = new javax.swing.JPanel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoginPage.setBackground(new java.awt.Color(0, 0, 153));
        LoginPage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LoginPageKeyPressed(evt);
            }
        });

        LoginLabel.setFont(new java.awt.Font("Trajan Pro", 1, 48)); // NOI18N
        LoginLabel.setForeground(new java.awt.Color(255, 204, 0));
        LoginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginLabel.setText("Lullaby Library");
        LoginLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        LoginButton.setText("Enter");
        LoginButton.setBorder(null);
        LoginButton.setBorderPainted(false);
        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        UsernameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UsernameField.setText("Username");
        UsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameFieldActionPerformed(evt);
            }
        });

        LoginErrorLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LoginErrorLabel.setForeground(new java.awt.Color(255, 255, 0));
        LoginErrorLabel.setText("Incorrect username or password.");

        PasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PasswordField.setText("jPasswordField1");
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPageLayout = new javax.swing.GroupLayout(LoginPage);
        LoginPage.setLayout(LoginPageLayout);
        LoginPageLayout.setHorizontalGroup(
            LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPageLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(LoginLabel)
                .addGap(54, 54, 54))
            .addGroup(LoginPageLayout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(LoginPageLayout.createSequentialGroup()
                .addGroup(LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPageLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(LoginErrorLabel))
                    .addGroup(LoginPageLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginPageLayout.setVerticalGroup(
            LoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPageLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(LoginLabel)
                .addGap(36, 36, 36)
                .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(LoginErrorLabel)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        EmployeePage.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout EmployeePageLayout = new javax.swing.GroupLayout(EmployeePage);
        EmployeePage.setLayout(EmployeePageLayout);
        EmployeePageLayout.setHorizontalGroup(
            EmployeePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );
        EmployeePageLayout.setVerticalGroup(
            EmployeePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );

        CustomerPage.setBackground(new java.awt.Color(0, 0, 153));

        CustomerList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Find Book Name" }));
        CustomerList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerListActionPerformed(evt);
            }
        });

        CustomerField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CustomerField.setText("Input Text Here");
        CustomerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerFieldActionPerformed(evt);
            }
        });

        CustomerButton.setText("Enter");
        CustomerButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Welcome, Customer!");

        CustomerArea.setEditable(false);
        CustomerArea.setColumns(20);
        CustomerArea.setRows(5);
        jScrollPane2.setViewportView(CustomerArea);

        javax.swing.GroupLayout CustomerPageLayout = new javax.swing.GroupLayout(CustomerPage);
        CustomerPage.setLayout(CustomerPageLayout);
        CustomerPageLayout.setHorizontalGroup(
            CustomerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerPageLayout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addGroup(CustomerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CustomerPageLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CustomerPageLayout.createSequentialGroup()
                        .addGroup(CustomerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2)
                            .addGroup(CustomerPageLayout.createSequentialGroup()
                                .addComponent(CustomerList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CustomerField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(240, 240, 240))))
        );
        CustomerPageLayout.setVerticalGroup(
            CustomerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerPageLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(CustomerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(247, Short.MAX_VALUE))
        );

        ManagerPage.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout ManagerPageLayout = new javax.swing.GroupLayout(ManagerPage);
        ManagerPage.setLayout(ManagerPageLayout);
        ManagerPageLayout.setHorizontalGroup(
            ManagerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ManagerPageLayout.setVerticalGroup(
            ManagerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EmployeePage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ManagerPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LoginPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(CustomerPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmployeePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ManagerPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameFieldActionPerformed

    private void LoginPageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoginPageKeyPressed
        //Accidentally added this piece of garbage method
    }//GEN-LAST:event_LoginPageKeyPressed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        
        if (LibraryGroupProject.Lullaby.login(UsernameField.getText(), PasswordField.getText()) == null){
            LoginErrorLabel.setVisible(true);
        } else if (LibraryGroupProject.Lullaby.login(UsernameField.getText(), PasswordField.getText()) instanceof Customer){
            LoginPage.setVisible(false);
            CustomerPage.setVisible(true);
        } else if (LibraryGroupProject.Lullaby.login(UsernameField.getText(), PasswordField.getText()) instanceof Employee){
            LoginPage.setVisible(false);
            EmployeePage.setVisible(true);
        } else if (LibraryGroupProject.Lullaby.login(UsernameField.getText(), PasswordField.getText()) instanceof Manager){
            LoginPage.setVisible(false);
            ManagerPage.setVisible(true);
        }//end if
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void CustomerListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerListActionPerformed
        //Useless Method yeeet
    }//GEN-LAST:event_CustomerListActionPerformed

    private void CustomerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerFieldActionPerformed

    private void CustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerButtonActionPerformed
        ArrayList<Book> temp;
        String tempString;
        if(CustomerList.getSelectedItem().equals("Find Book Name")){
            temp = LibraryGroupProject.Lullaby.findBookName((String)CustomerField.getText());
            for(int i=0; i<temp.size(); i++){
                CustomerArea.setText(temp.toString());
            }//end for
        } else if(CustomerList.getSelectedItem().equals("Find Book Genre")){
            temp = LibraryGroupProject.Lullaby.findBookGenre((String)CustomerField.getText());
           
        }
    }//GEN-LAST:event_CustomerButtonActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        
        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibraryGUI().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CustomerArea;
    private javax.swing.JButton CustomerButton;
    private javax.swing.JTextField CustomerField;
    private javax.swing.JComboBox<String> CustomerList;
    private javax.swing.JPanel CustomerPage;
    private javax.swing.JPanel EmployeePage;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginErrorLabel;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JPanel LoginPage;
    private javax.swing.JPanel ManagerPage;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
