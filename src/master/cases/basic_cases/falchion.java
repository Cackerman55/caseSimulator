/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package master.cases.basic_cases;
import guis.icons.basic_cases.Winter;
/**
 *
 * @author cackerman
 */
public class falchion extends javax.swing.JFrame {
    private final static int  COVERT = 2;
    private final static int CLASSIFIED = 3;
    private final static int RESTRICTED = 5; 
    private final static int MIL_SPEC = 6;
    /**
     * Creates new form falchion
     */
    public falchion() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        open = new javax.swing.JButton();
        selected = new javax.swing.JLabel();
        rarest = new javax.swing.JTextField();
        rare = new javax.swing.JTextField();
        covert = new javax.swing.JTextField();
        covertst = new javax.swing.JTextField();
        classifiedst = new javax.swing.JTextField();
        classified = new javax.swing.JTextField();
        restrictedst = new javax.swing.JTextField();
        restricted = new javax.swing.JTextField();
        milspecst = new javax.swing.JTextField();
        milspec = new javax.swing.JTextField();
        profit = new javax.swing.JTextField();
        value = new javax.swing.JTextField();
        cost = new javax.swing.JTextField();
        number = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1095, 735));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/background/falchionHead.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 10, 690, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/background/case.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1080, 700);

        open.setBorderPainted(false);
        getContentPane().add(open);
        open.setBounds(290, 490, 310, 70);
        getContentPane().add(selected);
        selected.setBounds(260, 180, 370, 300);

        rarest.setEditable(false);
        rarest.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        rarest.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rarest.setBorder(null);
        rarest.setOpaque(false);
        getContentPane().add(rarest);
        rarest.setBounds(1040, 290, 30, 60);

        rare.setEditable(false);
        rare.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        rare.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rare.setBorder(null);
        rare.setOpaque(false);
        getContentPane().add(rare);
        rare.setBounds(1000, 290, 30, 60);

        covert.setEditable(false);
        covert.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        covert.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        covert.setBorder(null);
        covert.setOpaque(false);
        getContentPane().add(covert);
        covert.setBounds(1000, 270, 30, 40);

        covertst.setEditable(false);
        covertst.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        covertst.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        covertst.setBorder(null);
        covertst.setOpaque(false);
        getContentPane().add(covertst);
        covertst.setBounds(1040, 270, 30, 40);

        classifiedst.setEditable(false);
        classifiedst.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        classifiedst.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        classifiedst.setBorder(null);
        classifiedst.setOpaque(false);
        getContentPane().add(classifiedst);
        classifiedst.setBounds(1040, 250, 30, 30);

        classified.setEditable(false);
        classified.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        classified.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        classified.setBorder(null);
        classified.setOpaque(false);
        getContentPane().add(classified);
        classified.setBounds(1000, 250, 30, 30);

        restrictedst.setEditable(false);
        restrictedst.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        restrictedst.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        restrictedst.setBorder(null);
        restrictedst.setOpaque(false);
        getContentPane().add(restrictedst);
        restrictedst.setBounds(1040, 220, 30, 30);

        restricted.setEditable(false);
        restricted.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        restricted.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        restricted.setBorder(null);
        restricted.setOpaque(false);
        getContentPane().add(restricted);
        restricted.setBounds(1000, 220, 30, 30);

        milspecst.setEditable(false);
        milspecst.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        milspecst.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        milspecst.setBorder(null);
        milspecst.setOpaque(false);
        getContentPane().add(milspecst);
        milspecst.setBounds(1040, 190, 30, 30);

        milspec.setEditable(false);
        milspec.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        milspec.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        milspec.setBorder(null);
        milspec.setOpaque(false);
        getContentPane().add(milspec);
        milspec.setBounds(1000, 190, 30, 30);

        profit.setEditable(false);
        profit.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        profit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        profit.setBorder(null);
        profit.setOpaque(false);
        getContentPane().add(profit);
        profit.setBounds(1010, 130, 60, 30);

        value.setEditable(false);
        value.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        value.setBorder(null);
        value.setOpaque(false);
        getContentPane().add(value);
        value.setBounds(990, 100, 80, 30);

        cost.setEditable(false);
        cost.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        cost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cost.setBorder(null);
        cost.setOpaque(false);
        getContentPane().add(cost);
        cost.setBounds(990, 70, 80, 30);

        number.setEditable(false);
        number.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        number.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        number.setBorder(null);
        number.setOpaque(false);
        getContentPane().add(number);
        number.setBounds(1010, 20, 60, 30);

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
            java.util.logging.Logger.getLogger(falchion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(falchion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(falchion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(falchion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new falchion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField classified;
    private javax.swing.JTextField classifiedst;
    private javax.swing.JTextField cost;
    private javax.swing.JTextField covert;
    private javax.swing.JTextField covertst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField milspec;
    private javax.swing.JTextField milspecst;
    private javax.swing.JTextField number;
    private javax.swing.JButton open;
    private javax.swing.JTextField profit;
    private javax.swing.JTextField rare;
    private javax.swing.JTextField rarest;
    private javax.swing.JTextField restricted;
    private javax.swing.JTextField restrictedst;
    private javax.swing.JLabel selected;
    private javax.swing.JTextField value;
    // End of variables declaration//GEN-END:variables
}
