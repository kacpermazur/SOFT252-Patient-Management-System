/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiview;

/**
 *
 * @author kacper
 */
public class appointmentUI extends javax.swing.JFrame {

    /**
     * Creates new form appointmentUI
     */
    public appointmentUI() {
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

        pnlAppointmentPicker = new javax.swing.JPanel();
        lblAppointmentTitle = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnCancel = new javax.swing.JButton();
        btnMakeAppointment = new javax.swing.JButton();
        jCalendar1 = new com.toedter.calendar.JCalendar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlAppointmentPicker.setBackground(new java.awt.Color(143, 174, 177));

        lblAppointmentTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAppointmentTitle.setForeground(new java.awt.Color(204, 204, 204));
        lblAppointmentTitle.setText("Appointment:");

        lblUserName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setText("firstName lastName");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(102, 102, 102));
        btnCancel.setText("Cancel");

        btnMakeAppointment.setBackground(new java.awt.Color(255, 255, 255));
        btnMakeAppointment.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMakeAppointment.setForeground(new java.awt.Color(102, 102, 102));
        btnMakeAppointment.setText("Make Appointment");

        javax.swing.GroupLayout pnlAppointmentPickerLayout = new javax.swing.GroupLayout(pnlAppointmentPicker);
        pnlAppointmentPicker.setLayout(pnlAppointmentPickerLayout);
        pnlAppointmentPickerLayout.setHorizontalGroup(
            pnlAppointmentPickerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAppointmentPickerLayout.createSequentialGroup()
                .addGroup(pnlAppointmentPickerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAppointmentPickerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlAppointmentPickerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAppointmentPickerLayout.createSequentialGroup()
                                .addComponent(lblAppointmentTitle)
                                .addGap(18, 18, 18)
                                .addComponent(lblUserName))
                            .addGroup(pnlAppointmentPickerLayout.createSequentialGroup()
                                .addGap(0, 64, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlAppointmentPickerLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnlAppointmentPickerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlAppointmentPickerLayout.createSequentialGroup()
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMakeAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        pnlAppointmentPickerLayout.setVerticalGroup(
            pnlAppointmentPickerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAppointmentPickerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlAppointmentPickerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAppointmentTitle)
                    .addComponent(lblUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAppointmentPickerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnMakeAppointment))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlAppointmentPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlAppointmentPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(appointmentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appointmentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appointmentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appointmentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new appointmentUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnMakeAppointment;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAppointmentTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel pnlAppointmentPicker;
    // End of variables declaration//GEN-END:variables
}
