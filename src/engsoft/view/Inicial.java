/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engsoft.view;

import java.awt.Color;

import java.awt.FlowLayout;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import model.Aluno;


/**
 *
 * @author vinicius
 */
public class Inicial extends javax.swing.JFrame {

       private Aluno al ;
    /**
     * Creates new form Inicial
     */
    public Inicial(Aluno a) {
        initComponents();
        Financeiro.setVisible(false);
       al=a;
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
        Treino = new javax.swing.JLabel();
        Ajuda = new javax.swing.JLabel();
        Financeiro = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Dieta = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Perfil = new javax.swing.JLabel();
        Sair = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1600, 1200));

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));

        Treino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Treino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-haltere-30.png"))); // NOI18N
        Treino.setText("Treino");
        Treino.setAlignmentX(0.5F);
        Treino.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Treino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TreinoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TreinoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TreinoMouseExited(evt);
            }
        });

        Ajuda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/question-sign.png"))); // NOI18N
        Ajuda.setText("Ajuda");
        Ajuda.setAlignmentX(0.5F);
        Ajuda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Ajuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AjudaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AjudaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AjudaMouseExited(evt);
            }
        });

        Financeiro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Financeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/money-bag-with-dollar-symbol.png"))); // NOI18N
        Financeiro.setText("Financeiro");
        Financeiro.setAlignmentX(0.5F);
        Financeiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Financeiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FinanceiroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FinanceiroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FinanceiroMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FinanceiroMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                FinanceiroMouseReleased(evt);
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

        Dieta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Dieta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-prato-de-sopa-30.png"))); // NOI18N
        Dieta.setText("Dieta");
        Dieta.setAlignmentX(0.5F);
        Dieta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Dieta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DietaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DietaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DietaMouseExited(evt);
            }
        });

        Menu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-pessoa-em-casa-24.png"))); // NOI18N
        Menu.setText("Inicio");
        Menu.setAlignmentX(0.5F);
        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(Logo)
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Treino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Dieta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ajuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Financeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Logo)
                .addGap(50, 50, 50)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Dieta)
                .addGap(26, 26, 26)
                .addComponent(Treino)
                .addGap(34, 34, 34)
                .addComponent(Ajuda)
                .addGap(36, 36, 36)
                .addComponent(Financeiro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        Perfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PerfilMouseClicked(evt);
            }
        });

        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door-exit.png"))); // NOI18N
        Sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SairMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fitness-lifestyle-destacada.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Perfil)
                .addGap(18, 18, 18)
                .addComponent(Sair)
                .addGap(101, 101, 101))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 39, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Perfil)
                    .addComponent(Sair))
                .addGap(58, 58, 58)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DietaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DietaMouseClicked
//        JOptionPane.showMessageDialog(null, "Usuario nao encontrado");
    DietaView D = new DietaView(al);
    setVisible(false);
        D.setVisible(true);
    
    }//GEN-LAST:event_DietaMouseClicked

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClicked
        // TODO add your handling code here:
        Inicial I=new Inicial(al);
        setVisible(false);
        I.setVisible(true);
        
    }//GEN-LAST:event_MenuMouseClicked

    private void TreinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TreinoMouseClicked
        // TODO add your handling code here:
        Treinooo T = new Treinooo (al);
        setVisible(false);
        T.setVisible(true);
        
    }//GEN-LAST:event_TreinoMouseClicked

    private void MenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseEntered
        Menu.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_MenuMouseEntered

    private void MenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseExited
        Menu.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_MenuMouseExited

    private void DietaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DietaMouseEntered
        Dieta.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_DietaMouseEntered

    private void DietaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DietaMouseExited
        Dieta.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_DietaMouseExited

    private void TreinoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TreinoMouseEntered
        Treino.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_TreinoMouseEntered

    private void TreinoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TreinoMouseExited
        Treino.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_TreinoMouseExited

    private void AjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjudaMouseClicked
       setVisible(false);
        Ajuda ajuda = new Ajuda(al);
       ajuda.setVisible(true);
    }//GEN-LAST:event_AjudaMouseClicked

    private void AjudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjudaMouseEntered
        Ajuda.setForeground(new Color(255, 255, 255));    }//GEN-LAST:event_AjudaMouseEntered

    private void AjudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjudaMouseExited
        Ajuda.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_AjudaMouseExited

    private void SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseClicked
        setVisible(false);
        Comecar f= new Comecar();
        f.setVisible(true);
    }//GEN-LAST:event_SairMouseClicked

    private void FinanceiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FinanceiroMouseClicked
        MenuFinanceiro MF = new MenuFinanceiro(al);
        setVisible(false);
        MF.setVisible(true);
		}//GEN-LAST:event_FinanceiroMouseClicked

    private void FinanceiroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FinanceiroMouseEntered
   Financeiro.setForeground(new Color(255, 255, 255)); 
    }//GEN-LAST:event_FinanceiroMouseEntered

    private void FinanceiroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FinanceiroMouseExited
        Financeiro.setForeground(new Color(0, 0, 0));
      
     
    }//GEN-LAST:event_FinanceiroMouseExited

    private void FinanceiroMousePressed2(java.awt.event.MouseEvent evt) {                                        
    
    } 
    
    
    private void FinanceiroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FinanceiroMousePressed
       
    }//GEN-LAST:event_FinanceiroMousePressed

    private void FinanceiroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FinanceiroMouseReleased
      
    }//GEN-LAST:event_FinanceiroMouseReleased

    private void PerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PerfilMouseClicked
        Perfil p = new Perfil(al);
       
        p.setVisible(true);
    }//GEN-LAST:event_PerfilMouseClicked

    private void LogoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoMouseMoved
//        jLabel1.setText("www");
           Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pXzLOUi.png"))); // NOI18N);
    }//GEN-LAST:event_LogoMouseMoved

    private void LogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoMouseExited
//        jLabel1.setText("");
Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MEKmZWl.png"))); // NOI18N);
    }//GEN-LAST:event_LogoMouseExited

    /**
     * @param args the command line arguments
     */
    
  

//        
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
//            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                
//                 setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ajuda;
    private javax.swing.JLabel Dieta;
    private javax.swing.JLabel Financeiro;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel Perfil;
    private javax.swing.JLabel Sair;
    private javax.swing.JLabel Treino;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
