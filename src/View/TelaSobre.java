package View;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author franc
 */
public class TelaSobre extends javax.swing.JFrame {
    

    /**
     * Creates new form TelaSobre
     */
    public TelaSobre() {
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
        jLabel4 = new javax.swing.JLabel();
        linkfb = new javax.swing.JLabel();
        linkinsta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sobre");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icones/teste.png")).getImage());
        setResizable(false);

        jLabel1.setText("Desenvolvido por: ");

        jLabel2.setText("Iuri Mendes");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/facebook_1.png"))); // NOI18N
        jLabel3.setText("Facebook: ");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/insta_2.png"))); // NOI18N
        jLabel4.setText("Instagram: ");

        linkfb.setText(" Iuri Mendes");
        linkfb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkfbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linkfbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                linkfbMouseExited(evt);
            }
        });

        linkinsta.setText("@fcoiuri");
        linkinsta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkinstaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linkinstaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                linkinstaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(linkfb)
                            .addComponent(linkinsta))))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(linkfb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(linkinsta))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void linkfbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkfbMouseEntered
        linkfb.setForeground(Color.blue);
        linkfb.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_linkfbMouseEntered

    private void linkfbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkfbMouseExited
	linkfb.setForeground(Color.black);
    }//GEN-LAST:event_linkfbMouseExited

    private void linkfbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkfbMouseClicked
        
        try {
            URI link = new URI("www.fb.com/iurimendes");
            Desktop.getDesktop().browse(link);
        } catch (IOException ex) {
            Logger.getLogger(TelaSobre.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(TelaSobre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_linkfbMouseClicked

    private void linkinstaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkinstaMouseClicked
        try {
            URI link = new URI("www.instagram.com/fcoiuri");
            Desktop.getDesktop().browse(link);
        } catch (IOException ex) {
            Logger.getLogger(TelaSobre.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(TelaSobre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_linkinstaMouseClicked

    private void linkinstaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkinstaMouseEntered
        linkinsta.setForeground(Color.blue);
        linkinsta.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_linkinstaMouseEntered

    private void linkinstaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkinstaMouseExited
        linkinsta.setForeground(Color.black);
    }//GEN-LAST:event_linkinstaMouseExited
    

    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSobre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel linkfb;
    private javax.swing.JLabel linkinsta;
    // End of variables declaration//GEN-END:variables
}
