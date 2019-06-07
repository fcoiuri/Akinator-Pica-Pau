/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;



/**
 *
 * @author franc
 */
public class AnimalTela10 extends javax.swing.JFrame {

    /**
     * Creates new form TelaJogo
     */
    public AnimalTela10() {
        initComponents();
        painel.setVisible(false);
        msg_txt.setText("<html>Seu personagem é um <strong>praticante de bruxaria</strong>?</html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botao_sim = new javax.swing.JButton();
        botao_nao = new javax.swing.JButton();
        painel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_resposta = new javax.swing.JLabel();
        msg_txt = new javax.swing.JLabel();
        balao = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icones/teste.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botao_sim.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        botao_sim.setForeground(new java.awt.Color(0, 0, 153));
        botao_sim.setText("Sim");
        botao_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_simActionPerformed(evt);
            }
        });
        getContentPane().add(botao_sim, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 136, 70, 30));

        botao_nao.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        botao_nao.setForeground(new java.awt.Color(204, 0, 0));
        botao_nao.setText("Não");
        botao_nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_naoActionPerformed(evt);
            }
        });
        getContentPane().add(botao_nao, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 136, 70, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Seu personagem é: ");

        txt_resposta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_resposta.setForeground(new java.awt.Color(0, 0, 0));
        txt_resposta.setText("<vazio>");

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(txt_resposta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_resposta))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(painel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 231, 412, 100));
        getContentPane().add(msg_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 150, 70));

        balao.setForeground(new java.awt.Color(0, 0, 0));
        balao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        balao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Balao.png"))); // NOI18N
        getContentPane().add(balao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 340, 160));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/teste.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botao_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_simActionPerformed
        new TelaZeJacare().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botao_simActionPerformed

    private void botao_naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_naoActionPerformed
        Tocando mp3 = new Tocando();
        mp3.nao();
        new AnimalTela11().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botao_naoActionPerformed

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
            java.util.logging.Logger.getLogger(AnimalTela10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnimalTela10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnimalTela10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnimalTela10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnimalTela10().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balao;
    private javax.swing.JButton botao_nao;
    private javax.swing.JButton botao_sim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel msg_txt;
    private javax.swing.JPanel painel;
    private javax.swing.JLabel txt_resposta;
    // End of variables declaration//GEN-END:variables
}
