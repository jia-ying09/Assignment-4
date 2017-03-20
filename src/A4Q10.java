/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linj4653
 */
public class A4Q10 extends javax.swing.JFrame {

    /**
     * Creates new form A4Q10
     */
    public A4Q10() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        fahrenheit = new javax.swing.JLabel();
        celsius = new javax.swing.JLabel();
        fahrenheitInput = new javax.swing.JTextField();
        celsiusInput = new javax.swing.JTextField();
        fahrenheitButton = new javax.swing.JButton();
        celsiusButton = new javax.swing.JButton();
        output = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fahrenheit.setText("Dregrees Fahrenheit");

        celsius.setText("Degrees Celsius");

        fahrenheitInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fahrenheitInputActionPerformed(evt);
            }
        });

        celsiusInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celsiusInputActionPerformed(evt);
            }
        });

        fahrenheitButton.setText("F -> C");
        fahrenheitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fahrenheitButtonActionPerformed(evt);
            }
        });

        celsiusButton.setText("C -> F");
        celsiusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celsiusButtonActionPerformed(evt);
            }
        });

        output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fahrenheitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(celsiusButton)
                .addGap(7, 7, 7))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fahrenheit)
                    .addComponent(celsius))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fahrenheitInput, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(celsiusInput)
                    .addComponent(output))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fahrenheit)
                    .addComponent(fahrenheitInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fahrenheitButton)
                    .addComponent(celsiusButton))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celsius)
                    .addComponent(celsiusInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fahrenheitInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fahrenheitInputActionPerformed
      
        
    }//GEN-LAST:event_fahrenheitInputActionPerformed

    private void fahrenheitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fahrenheitButtonActionPerformed
        // input degrees in fahrenheit
        String fahrenheit = fahrenheitInput.getText();
        
        // input degrees in celsius
        String celsius = celsiusInput.getText();
        
        //converting strings to integers
        double fahrenheitInput = Integer.parseInt(fahrenheit);
        double celsiusInput = Integer.parseInt(celsius);  
        
        double celsiusOutput = fahrenheitInput / 1.8 - 32;        
        // outputting the degrees in celsius
        output.setText ("" + celsiusOutput);
        
    }//GEN-LAST:event_fahrenheitButtonActionPerformed

    private void celsiusInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celsiusInputActionPerformed
       
    }//GEN-LAST:event_celsiusInputActionPerformed

    private void celsiusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celsiusButtonActionPerformed
         // input degrees in fahrenheit
        String fahrenheit = fahrenheitInput.getText();
        
        // input degrees in celsius
        String celsius = celsiusInput.getText();
        
        //converting strings to doubles
        double fahrenheitInput = Integer.parseInt(fahrenheit);
        double celsiusInput = Integer.parseInt(celsius);
        
        //converting fahrenheit to celsius
        double fahrenheitOutput = celsiusInput * 1.8 + 32;
        // outputting the degrees in celsius      
        output.setText("" + fahrenheitOutput);
        //converting fahrenheit to celsius
        
        
                                    
    }//GEN-LAST:event_celsiusButtonActionPerformed

    private void outputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputActionPerformed
      
    }//GEN-LAST:event_outputActionPerformed

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
            java.util.logging.Logger.getLogger(A4Q10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A4Q10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A4Q10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A4Q10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A4Q10().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel celsius;
    private javax.swing.JButton celsiusButton;
    private javax.swing.JTextField celsiusInput;
    private javax.swing.JLabel fahrenheit;
    private javax.swing.JButton fahrenheitButton;
    private javax.swing.JTextField fahrenheitInput;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField output;
    // End of variables declaration//GEN-END:variables
}
