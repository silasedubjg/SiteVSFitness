/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engsoft.view;

import dao.Alunodao;
import java.awt.Color;
import model.Aluno;
import model.Professor;

/**
 *
 * @author Usuario
 */
public class DietaViewProf extends javax.swing.JFrame {

    /**
     * Creates new form DietaView
     */
    Professor b;
    public DietaViewProf(Professor a) {
        initComponents();
      b= a;
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
        PanelOpcoes = new javax.swing.JPanel();
        ConsultarDieta = new javax.swing.JLabel();
        adicionardieta = new javax.swing.JLabel();
        Menu1 = new javax.swing.JLabel();
        Deletardieta1 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        PanelCabecalho = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        CampoBusca = new javax.swing.JTextField();
        Lupa = new javax.swing.JLabel();
        Sair = new javax.swing.JLabel();
        PanelImagem = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1600, 900));

        PanelOpcoes.setBackground(new java.awt.Color(242, 242, 242));

        ConsultarDieta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ConsultarDieta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-lista-27.png"))); // NOI18N
        ConsultarDieta.setText("Listar Dietas");
        ConsultarDieta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ConsultarDieta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultarDietaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConsultarDietaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConsultarDietaMouseExited(evt);
            }
        });

        adicionardieta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        adicionardieta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addition-sign.png"))); // NOI18N
        adicionardieta.setText("Adicionar Dieta");
        adicionardieta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        adicionardieta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adicionardietaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adicionardietaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adicionardietaMouseExited(evt);
            }
        });

        Menu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Menu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-pessoa-em-casa-24.png"))); // NOI18N
        Menu1.setText("Inicio");
        Menu1.setAlignmentX(0.5F);
        Menu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Menu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Menu1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Menu1MouseExited(evt);
            }
        });

        Deletardieta1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Deletardieta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rubbish-bin.png"))); // NOI18N
        Deletardieta1.setText("Deletar Dieta");
        Deletardieta1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Deletardieta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Deletardieta1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Deletardieta1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Deletardieta1MouseExited(evt);
            }
        });

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MEKmZWL.png"))); // NOI18N
        Logo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LogoMouseMoved(evt);
            }
        });
        Logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelOpcoesLayout = new javax.swing.GroupLayout(PanelOpcoes);
        PanelOpcoes.setLayout(PanelOpcoesLayout);
        PanelOpcoesLayout.setHorizontalGroup(
            PanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcoesLayout.createSequentialGroup()
                .addGroup(PanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcoesLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(Logo))
                    .addGroup(PanelOpcoesLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(PanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ConsultarDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Menu1)
                            .addComponent(adicionardieta, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Deletardieta1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        PanelOpcoesLayout.setVerticalGroup(
            PanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcoesLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(Logo)
                .addGap(61, 61, 61)
                .addComponent(Menu1)
                .addGap(52, 52, 52)
                .addComponent(ConsultarDieta)
                .addGap(51, 51, 51)
                .addComponent(adicionardieta)
                .addGap(56, 56, 56)
                .addComponent(Deletardieta1)
                .addContainerGap(433, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(PanelOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        PanelCabecalho.setBackground(new java.awt.Color(255, 255, 255));

        Titulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Titulo.setText("Dietas");

        CampoBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoBuscaActionPerformed(evt);
            }
        });

        Lupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/magnifier.png"))); // NOI18N

        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door-exit.png"))); // NOI18N
        Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelCabecalhoLayout = new javax.swing.GroupLayout(PanelCabecalho);
        PanelCabecalho.setLayout(PanelCabecalhoLayout);
        PanelCabecalhoLayout.setHorizontalGroup(
            PanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCabecalhoLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(CampoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Lupa)
                .addGap(236, 236, 236)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 492, Short.MAX_VALUE)
                .addComponent(Sair)
                .addGap(91, 91, 91))
        );
        PanelCabecalhoLayout.setVerticalGroup(
            PanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCabecalhoLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(PanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCabecalhoLayout.createSequentialGroup()
                        .addGroup(PanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CampoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lupa))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCabecalhoLayout.createSequentialGroup()
                        .addGroup(PanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Sair)
                            .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))))
        );

        PanelImagem.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelImagemLayout = new javax.swing.GroupLayout(PanelImagem);
        PanelImagem.setLayout(PanelImagemLayout);
        PanelImagemLayout.setHorizontalGroup(
            PanelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelImagemLayout.setVerticalGroup(
            PanelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLayeredPane1.setLayer(PanelCabecalho, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(PanelImagem, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(PanelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoMouseExited
        // TODO add your handling code here:
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MEKmZWl.png"))); // NOI18N);
    }//GEN-LAST:event_LogoMouseExited

    private void LogoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoMouseMoved
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pXzLOUi.png"))); // NOI18N);
    }//GEN-LAST:event_LogoMouseMoved

    private void Deletardieta1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Deletardieta1MouseExited
        // TODO add your handling code here:
        Deletardieta1.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_Deletardieta1MouseExited

    private void Deletardieta1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Deletardieta1MouseEntered
        // TODO add your handling code here:
        Deletardieta1.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Deletardieta1MouseEntered

    private void Deletardieta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Deletardieta1MouseClicked
        // TODO add your handling code here:
        DeletarDieta1Prof del = new DeletarDieta1Prof(b);
        //.setVisible(false);
        del.setVisible(true);

    }//GEN-LAST:event_Deletardieta1MouseClicked

    private void Menu1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu1MouseExited
        Menu1.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_Menu1MouseExited

    private void Menu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu1MouseEntered
        Menu1.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Menu1MouseEntered

    private void Menu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu1MouseClicked
        InicialProf I = new InicialProf(b);
        setVisible(false);
        I.setVisible(true);

    }//GEN-LAST:event_Menu1MouseClicked

    private void adicionardietaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionardietaMouseExited
        adicionardieta.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_adicionardietaMouseExited

    private void adicionardietaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionardietaMouseEntered
        adicionardieta.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_adicionardietaMouseEntered

    private void adicionardietaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionardietaMouseClicked
        // TODO add your handling code here:
        AdicionarDieta1Prof adc = new AdicionarDieta1Prof(b);
        //setVisible(false);
        adc.setVisible(true);
    }//GEN-LAST:event_adicionardietaMouseClicked

    private void ConsultarDietaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultarDietaMouseExited
        ConsultarDieta.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_ConsultarDietaMouseExited

    private void ConsultarDietaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultarDietaMouseEntered
        ConsultarDieta.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_ConsultarDietaMouseEntered

    private void ConsultarDietaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultarDietaMouseClicked
        //        JOptionPane.showMessageDialog(null, "Usuario nao encontrado");
    }//GEN-LAST:event_ConsultarDietaMouseClicked

    private void CampoBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoBuscaActionPerformed

    private void SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseClicked
        setVisible(false);
        Comecar f= new Comecar();
        f.setVisible(true);
                           
    }//GEN-LAST:event_SairMouseClicked

                                          

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DietaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DietaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DietaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DietaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DietaView().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoBusca;
    private javax.swing.JLabel ConsultarDieta;
    private javax.swing.JLabel Deletardieta1;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Lupa;
    private javax.swing.JLabel Menu1;
    private javax.swing.JPanel PanelCabecalho;
    private javax.swing.JPanel PanelImagem;
    private javax.swing.JPanel PanelOpcoes;
    private javax.swing.JLabel Sair;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel adicionardieta;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
