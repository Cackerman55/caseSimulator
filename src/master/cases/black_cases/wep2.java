/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package master.cases.black_cases;
import java.io.*;
import sun.audio.*;
/**
 *
 * @author cackerman
 */
public class wep2 extends javax.swing.JFrame {
    private final static int  COVERT = 1;
    private final static int CLASSIFIED = 2;
    private final static int RESTRICTED = 4; 
    private final static int MIL_SPEC = 5;
    public static boolean knife = false;
    public static boolean st = false;
    public static int openned = 0;
    public static int spot = 0;
    public static double costs = 0.0;
    public static double tValue = 0.0;
    public static double profits = 0.0;
    public static double caseV = 2.75;
    public static String choice = "";
    public static String path = "/guis/icons/black_cases/Wep2/";
    public static final String statement = "Value: $";
    public static double[] rValues = {24.37,3.59,5.68,5.06,.51,.95,.6,1.59,.36,.44,.5,1.8};
    public static double[] sValues = {145.22,14.01,17.85,36.05,2.54,4.11,2.82,10.78,1.62,2.02,2.58,7.86};
   public static int[] statT = {0,0,0,0,0};
    public static int[] reg = {0,0,0,0,0};
    public static int[] knifeLoadout = {19,13,13,19,19,13,19,19};
    /**
     * Creates new form wep2
     */
    public wep2() {
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

        statTrak = new javax.swing.JLabel();
        knifeBanner = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
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
        open = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CS:GO Weapon 2 case");
        setMinimumSize(new java.awt.Dimension(1095, 735));
        getContentPane().setLayout(null);

        statTrak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/background/stattrak.png"))); // NOI18N
        getContentPane().add(statTrak);
        statTrak.setBounds(510, 160, 120, 120);

        knifeBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/icons/black_cases/Wep2/covert1.png"))); // NOI18N
        getContentPane().add(knifeBanner);
        knifeBanner.setBounds(260, 180, 370, 300);

        price.setFont(new java.awt.Font("OCR A Std", 1, 20)); // NOI18N
        price.setForeground(new java.awt.Color(255, 255, 255));
        price.setText("Value:");
        getContentPane().add(price);
        price.setBounds(340, 600, 210, 60);
        getContentPane().add(selected);
        selected.setBounds(260, 180, 370, 300);

        rarest.setEditable(false);
        rarest.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        rarest.setForeground(new java.awt.Color(0, 0, 0));
        rarest.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rarest.setText("0");
        rarest.setBorder(null);
        rarest.setOpaque(false);
        getContentPane().add(rarest);
        rarest.setBounds(1040, 290, 30, 60);

        rare.setEditable(false);
        rare.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        rare.setForeground(new java.awt.Color(0, 0, 0));
        rare.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rare.setText("0");
        rare.setBorder(null);
        rare.setOpaque(false);
        getContentPane().add(rare);
        rare.setBounds(1000, 290, 30, 60);

        covert.setEditable(false);
        covert.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        covert.setForeground(new java.awt.Color(0, 0, 0));
        covert.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        covert.setText("0");
        covert.setBorder(null);
        covert.setOpaque(false);
        getContentPane().add(covert);
        covert.setBounds(1000, 270, 30, 40);

        covertst.setEditable(false);
        covertst.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        covertst.setForeground(new java.awt.Color(0, 0, 0));
        covertst.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        covertst.setText("0");
        covertst.setBorder(null);
        covertst.setOpaque(false);
        getContentPane().add(covertst);
        covertst.setBounds(1040, 270, 30, 40);

        classifiedst.setEditable(false);
        classifiedst.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        classifiedst.setForeground(new java.awt.Color(0, 0, 0));
        classifiedst.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        classifiedst.setText("0");
        classifiedst.setBorder(null);
        classifiedst.setOpaque(false);
        getContentPane().add(classifiedst);
        classifiedst.setBounds(1040, 250, 30, 30);

        classified.setEditable(false);
        classified.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        classified.setForeground(new java.awt.Color(0, 0, 0));
        classified.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        classified.setText("0");
        classified.setBorder(null);
        classified.setOpaque(false);
        getContentPane().add(classified);
        classified.setBounds(1000, 250, 30, 30);

        restrictedst.setEditable(false);
        restrictedst.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        restrictedst.setForeground(new java.awt.Color(0, 0, 0));
        restrictedst.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        restrictedst.setText("0");
        restrictedst.setBorder(null);
        restrictedst.setOpaque(false);
        getContentPane().add(restrictedst);
        restrictedst.setBounds(1040, 220, 30, 30);

        restricted.setEditable(false);
        restricted.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        restricted.setForeground(new java.awt.Color(0, 0, 0));
        restricted.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        restricted.setText("0");
        restricted.setBorder(null);
        restricted.setOpaque(false);
        getContentPane().add(restricted);
        restricted.setBounds(1000, 220, 30, 30);

        milspecst.setEditable(false);
        milspecst.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        milspecst.setForeground(new java.awt.Color(0, 0, 0));
        milspecst.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        milspecst.setText("0");
        milspecst.setBorder(null);
        milspecst.setOpaque(false);
        getContentPane().add(milspecst);
        milspecst.setBounds(1040, 190, 30, 30);

        milspec.setEditable(false);
        milspec.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        milspec.setForeground(new java.awt.Color(0, 0, 0));
        milspec.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        milspec.setText("0");
        milspec.setBorder(null);
        milspec.setOpaque(false);
        getContentPane().add(milspec);
        milspec.setBounds(1000, 190, 30, 30);

        profit.setEditable(false);
        profit.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        profit.setForeground(new java.awt.Color(0, 0, 0));
        profit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        profit.setText("0");
        profit.setBorder(null);
        profit.setOpaque(false);
        getContentPane().add(profit);
        profit.setBounds(1010, 130, 60, 30);

        value.setEditable(false);
        value.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        value.setForeground(new java.awt.Color(0, 0, 0));
        value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        value.setText("0");
        value.setBorder(null);
        value.setOpaque(false);
        getContentPane().add(value);
        value.setBounds(990, 100, 80, 30);

        cost.setEditable(false);
        cost.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        cost.setForeground(new java.awt.Color(0, 0, 0));
        cost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cost.setText("0");
        cost.setBorder(null);
        cost.setOpaque(false);
        getContentPane().add(cost);
        cost.setBounds(990, 70, 80, 30);

        number.setEditable(false);
        number.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        number.setForeground(new java.awt.Color(0, 0, 0));
        number.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        number.setText("0");
        number.setBorder(null);
        number.setOpaque(false);
        getContentPane().add(number);
        number.setBounds(1010, 20, 60, 30);

        open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/background/open.png"))); // NOI18N
        open.setContentAreaFilled(false);
        open.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openMouseClicked(evt);
            }
        });
        getContentPane().add(open);
        open.setBounds(290, 490, 310, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/background/wep2Head.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 10, 690, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/background/case.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1080, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openMouseClicked
        // TODO add your handling code here:
        System.out.println(rValues.length+"/n"+sValues.length);
         String temp = path;
        openned++;
        knifeBanner.setIcon(null);
        costs = caseV + costs;
        int prob = (int) ((Math.random()*200)+1);
        //calculates probabilities
       // int prob = 200;
        int stat = (int) ((Math.random()*25)+1);
        int num = 0;
        //looks if it is stattrak or not
        st = stat<3;
        //and sets icon accordingly
        if(st){
        statTrak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/background/stattrak.png")));
                }
        else{statTrak.setIcon(null);}
        
        //looks at probabilities
        //if it is a knife...
        if(prob==200){
            knife = true;
            //adds one to rare count
            if(st){statT[4]++;}
            else{reg[4]++;}
            //adds value to the total value and sets price text
            if(!st){
                tValue += 376.89;
                price.setText(statement+""+376.89);
            }
            else{ 
                tValue += 654.98;
                price.setText(statement+""+654.98);
            }
            //displays banner
            knifeBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/background/knifeBanner.png")));
            //finds a random knife and sets the path to the resource
            int choice = (int)(Math.random()*8+1);
            path = "/guis/icons/knives/2/ ";
            num = (int)(Math.random()*(knifeLoadout[1])+1);
            path+="("+num+").png";
            
        }
        
        
        //if it is mil-spec...
        else if(prob<=158){
            choice = "mil-spec";
            //finds a mil-spec in the case collection
            num = (int) ((Math.random()*MIL_SPEC)+1);
            spot = COVERT + CLASSIFIED + RESTRICTED + num -1;
            //adds one to the mil-spec count
            if(st){statT[0]++;}
            else{reg[0]++;}
        }
        //if it is restricted...
        else if(prob<=191){
            choice = "restricted";
            //finds a restricted in the case collection
            num = (int) ((Math.random()*RESTRICTED)+1);
            spot = COVERT + CLASSIFIED + num -1;
            //adds one to the restricted count
            if(st){statT[1]++;}
            else{reg[1]++;}
        }
        //if it is classified...
        else if(prob<=196){
            choice = "classified";
            //finds a classified within the case collection
            num = (int) ((Math.random()*CLASSIFIED)+1);
            spot = COVERT + num -1;
            //adds one to the classified count
            if(st){statT[2]++;}
            else{reg[2]++;}
        }
        //if it is covert...
        else if(prob<200){
            choice = "covert";
            //finds a covert skin in the case
            num = (int) ((Math.random()*COVERT)+1);
            spot = num -1;
            //adds one to the covert count
            if(st){statT[3]++;}
            else{reg[3]++;}
        }
        
        //IF IT IS NOT A KNIFE...
        if(!knife){
            //sets the path for a gun skin
            path += choice+num+".png";
        }
        
        
        
        //if it isnt a knife or stattrak...
        if(!st&&!knife){
            //sets the correct price and adds the value of the skin to the total value
            tValue += rValues[spot];
            price.setText(statement+""+rValues[spot]);
        }
        //if it isnt knife but is a stattrak...
        else if(st&&!knife){ 
            //sets the correct price and adds the value of the skin to the total value
            tValue += sValues[spot];
            price.setText(statement+""+sValues[spot]);
        }
        
        //finds the profit per case
        profits = (tValue-costs)/openned;
        profits *= 100;
        int temp1 = (int) profits;
        String temp2 = ""+temp1;
        //sets the profit field to display the current profit
        if(temp2.length()>6){
        temp2 = temp2.substring(0, temp2.length()-3)+"."+temp2.substring(temp2.length()-3);
        }
        profit.setText(temp2);
        //sets the number of oppened field to the correct value
        number.setText(""+openned);
        //sets the cost field to the correct value
        String stringyCost = ""+costs;
        if(stringyCost.length()>6){
        stringyCost = stringyCost.substring(0,(stringyCost.indexOf(".")+3));
        }
        cost.setText(stringyCost);
        //sets the value field to the correct total value
        String stringyValue = ""+tValue;
         if(stringyValue.length()>6){
        stringyValue = stringyValue.substring(0,(stringyValue.indexOf(".")+3));}
        value.setText(stringyValue);
        //sets the correct fields for the correct counts of all the rarity/quality and stattrak combinations 
        milspec.setText(""+reg[0]);
        milspecst.setText(""+statT[0]);
        restricted.setText(""+reg[1]);
        restrictedst.setText(""+statT[1]);
        classified.setText(""+reg[2]);
        classifiedst.setText(""+statT[2]);
        covert.setText(""+reg[3]);
        covertst.setText(""+statT[3]);
        rare.setText(""+reg[4]);
        rarest.setText(""+statT[4]);
        //sets the displayed skin(knife or gun) to the correct icon
        selected.setIcon(new javax.swing.ImageIcon(getClass().getResource(path)));
        //resets the path to the original
        path = temp;
        //sets the knife boolean to the original value(false)
        knife = false;
        //resets choice
        choice = "";
        //resets stattrak boolean to original value(false)
        st = false;
        //resets spot number
        spot = 0;
        //repaints/refreshes the display to show the new data
        repaint();
    }//GEN-LAST:event_openMouseClicked

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
            java.util.logging.Logger.getLogger(wep2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(wep2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(wep2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(wep2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wep2().setVisible(true);
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
    private javax.swing.JLabel knifeBanner;
    private javax.swing.JTextField milspec;
    private javax.swing.JTextField milspecst;
    private javax.swing.JTextField number;
    private javax.swing.JButton open;
    private javax.swing.JLabel price;
    private javax.swing.JTextField profit;
    private javax.swing.JTextField rare;
    private javax.swing.JTextField rarest;
    private javax.swing.JTextField restricted;
    private javax.swing.JTextField restrictedst;
    private javax.swing.JLabel selected;
    private javax.swing.JLabel statTrak;
    private javax.swing.JTextField value;
    // End of variables declaration//GEN-END:variables
    private javax.swing.Timer timer;
}
