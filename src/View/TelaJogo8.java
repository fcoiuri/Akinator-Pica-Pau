/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;


/**
 *
 * @author franc
 */
public class TelaJogo8 extends javax.swing.JFrame {
    boolean verificacao = true;
    /**
     * Creates new form TelaJogo7
     */
    public TelaJogo8() {
        initComponents();
        painel.setVisible(false);
        painel1.setVisible(false);
        msg_txt.setText("<html>Seu personagem <strong>tem uma mansão</strong>?</html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaonao = new javax.swing.JButton();
        botaosim = new javax.swing.JButton();
        painel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_resposta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        painel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_resposta1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        msg_txt = new javax.swing.JLabel();
        balao = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icones/teste.png")).getImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaonao.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        botaonao.setForeground(new java.awt.Color(204, 0, 0));
        botaonao.setText("Não");
        botaonao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaonaoActionPerformed(evt);
            }
        });
        getContentPane().add(botaonao, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 70, 30));

        botaosim.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        botaosim.setForeground(new java.awt.Color(0, 0, 153));
        botaosim.setText("Sim");
        botaosim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaosimActionPerformed(evt);
            }
        });
        getContentPane().add(botaosim, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 70, 30));

        painel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Seu personagem é: ");
        painel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        txt_resposta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_resposta.setForeground(new java.awt.Color(0, 0, 0));
        txt_resposta.setText("<vazio>");
        painel.add(txt_resposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Professor Grossenfibber.jpg"))); // NOI18N
        painel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        getContentPane().add(painel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 440, 110));

        painel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Seu personagem é: ");
        painel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        txt_resposta1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_resposta1.setForeground(new java.awt.Color(0, 0, 0));
        txt_resposta1.setText("<vazio>");
        painel1.add(txt_resposta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Professor Dingle Dong.jpg"))); // NOI18N
        painel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        getContentPane().add(painel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 440, -1));
        getContentPane().add(msg_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 150, 70));

        balao.setForeground(new java.awt.Color(0, 0, 0));
        balao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        balao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Balao.png"))); // NOI18N
        getContentPane().add(balao, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 340, 160));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/teste.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaonaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaonaoActionPerformed
        
        if (verificacao) {
            Tocando mp3 = new Tocando();
            mp3.nao();

            txt_resposta1.setText("Professor Dingle Dong");
            painel1.setVisible(true);
            verificacao = false;
            
        } else {
            JOptionPane.showMessageDialog(null, "Jogue Novamente!");
            this.dispose();
        }


    }//GEN-LAST:event_botaonaoActionPerformed

    private void botaosimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaosimActionPerformed
        if (verificacao) {
            Tocando mp3 = new Tocando();
            mp3.sim();

            txt_resposta1.setText("Professor Grossenfibber");
            painel1.setVisible(true);
            verificacao = false;
            
        } else {
            JOptionPane.showMessageDialog(null, "Jogue Novamente!");
            this.dispose();
        }


    }//GEN-LAST:event_botaosimActionPerformed

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
            java.util.logging.Logger.getLogger(TelaJogo8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogo8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogo8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogo8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogo8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balao;
    private javax.swing.JButton botaonao;
    private javax.swing.JButton botaosim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel msg_txt;
    private javax.swing.JPanel painel;
    private javax.swing.JPanel painel1;
    private javax.swing.JLabel txt_resposta;
    private javax.swing.JLabel txt_resposta1;
    // End of variables declaration//GEN-END:variables
}
