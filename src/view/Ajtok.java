/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author SasGyula(SZF_2023_20
 */
public class Ajtok extends javax.swing.JFrame {

    /**
     * Creates new form Ajtok
     */
    public Ajtok() {
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

        ajto2 = new javax.swing.JLabel();
        ajto3 = new javax.swing.JLabel();
        ajto1 = new javax.swing.JLabel();
        felfedesBtn = new javax.swing.JButton();
        header = new javax.swing.JLabel();
        statisztika = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cseresJatek = new javax.swing.JLabel();
        nemcseresJatek = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cseresJatekNyert = new javax.swing.JLabel();
        nemCseresJatekNyert = new javax.swing.JLabel();
        ujraBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ajto2.setIcon(new javax.swing.ImageIcon("C:\\Users\\SasGyula(SZF_2023_20\\Documents\\NetBeansProjects\\Ajto\\kepek\\letöltés.png")); // NOI18N

        ajto3.setIcon(new javax.swing.ImageIcon("C:\\Users\\SasGyula(SZF_2023_20\\Documents\\NetBeansProjects\\Ajto\\kepek\\letöltés.png")); // NOI18N

        ajto1.setIcon(new javax.swing.ImageIcon("C:\\Users\\SasGyula(SZF_2023_20\\Documents\\NetBeansProjects\\Ajto\\kepek\\letöltés.png")); // NOI18N

        felfedesBtn.setText("Felfedés");

        header.setFont(new java.awt.Font("Sitka Subheading", 1, 36)); // NOI18N
        header.setText("Három ajtó");

        statisztika.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Statisztika"));

        jLabel2.setText("Cserés játék");

        jLabel3.setText("Nem cserés");

        cseresJatek.setText("0");

        nemcseresJatek.setText("0");

        jLabel6.setText("Nyert");

        jLabel7.setText("Nyert");

        cseresJatekNyert.setText("0");

        nemCseresJatekNyert.setText("0");

        javax.swing.GroupLayout statisztikaLayout = new javax.swing.GroupLayout(statisztika);
        statisztika.setLayout(statisztikaLayout);
        statisztikaLayout.setHorizontalGroup(
            statisztikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisztikaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statisztikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(statisztikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statisztikaLayout.createSequentialGroup()
                        .addComponent(cseresJatek)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cseresJatekNyert)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(statisztikaLayout.createSequentialGroup()
                        .addComponent(nemcseresJatek)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nemCseresJatekNyert)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        statisztikaLayout.setVerticalGroup(
            statisztikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisztikaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statisztikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cseresJatek)
                    .addComponent(jLabel6)
                    .addComponent(cseresJatekNyert))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statisztikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nemcseresJatek)
                    .addComponent(jLabel7)
                    .addComponent(nemCseresJatekNyert))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ujraBtn.setText("Újra");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ajto1)
                            .addGap(120, 120, 120)
                            .addComponent(ajto2)
                            .addGap(119, 119, 119))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(header)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(felfedesBtn)
                        .addGap(150, 150, 150)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statisztika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajto3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ujraBtn)
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statisztika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(header)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ajto1)
                    .addComponent(ajto3)
                    .addComponent(ajto2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(felfedesBtn)
                    .addComponent(ujraBtn))
                .addGap(24, 24, 24))
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
            java.util.logging.Logger.getLogger(Ajtok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ajtok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ajtok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ajtok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ajtok().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ajto1;
    private javax.swing.JLabel ajto2;
    private javax.swing.JLabel ajto3;
    private javax.swing.JLabel cseresJatek;
    private javax.swing.JLabel cseresJatekNyert;
    private javax.swing.JButton felfedesBtn;
    private javax.swing.JLabel header;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel nemCseresJatekNyert;
    private javax.swing.JLabel nemcseresJatek;
    private javax.swing.JPanel statisztika;
    private javax.swing.JButton ujraBtn;
    // End of variables declaration//GEN-END:variables
}
