/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engsoft.view;

import dao.Alunodao;
import dao.Treinodao;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import model.Aluno;
import model.TreinoModel;

/**
 *
 * @author vinicius
 */
public class Treinooo extends javax.swing.JFrame {

    /**
     * Creates new form Treinooo
     */
    Aluno c;
    Alunodao dao1;
    TreinoModel Treino;
    Treinodao Treinodao;
    TreinoModel b;
    JButton b1;

    public Treinooo(Aluno a) {

        initComponents();
        c = a;

        PanelImagem.setVisible(true);
        PanelTodostreinos.setVisible(false);
        TelaResultadoPesquisa.setVisible(false);
        DESCRICAO.setBorder(null);
        DESCRICAO.setOpaque(false);

        jScrollPane2.setBorder(null);
        jScrollPane2.getViewport().setOpaque(false);
        jScrollPane1.setBorder(null);
        jScrollPane1.getViewport().setOpaque(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarradeEscolhaTreino = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();
        AdicionarTreino = new javax.swing.JLabel();
        ConsultarTreino = new javax.swing.JLabel();
        CabecalhoTreino = new javax.swing.JPanel();
        PesquisarTreino = new javax.swing.JLabel();
        Pesquisar = new javax.swing.JTextField();
        TituloTreinos = new javax.swing.JLabel();
        Sair = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        PanelImagem = new javax.swing.JPanel();
        nopain = new javax.swing.JLabel();
        TelaResultadoPesquisa = new javax.swing.JPanel();
        OBJETIVO = new javax.swing.JLabel();
        NOME = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DESCRICAO = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Cadastrar = new javax.swing.JButton();
        PanelTodostreinos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextTodosTreinos = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1600, 850));
        setResizable(false);
        setSize(new java.awt.Dimension(1600, 900));

        BarradeEscolhaTreino.setBackground(new java.awt.Color(242, 242, 242));

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

        AdicionarTreino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AdicionarTreino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addition-sign.png"))); // NOI18N
        AdicionarTreino.setText("Adicionar Treino");
        AdicionarTreino.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AdicionarTreino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdicionarTreinoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AdicionarTreinoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AdicionarTreinoMouseExited(evt);
            }
        });

        ConsultarTreino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ConsultarTreino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-lista-27.png"))); // NOI18N
        ConsultarTreino.setText("Listar treinos");
        ConsultarTreino.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ConsultarTreino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultarTreinoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConsultarTreinoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConsultarTreinoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BarradeEscolhaTreinoLayout = new javax.swing.GroupLayout(BarradeEscolhaTreino);
        BarradeEscolhaTreino.setLayout(BarradeEscolhaTreinoLayout);
        BarradeEscolhaTreinoLayout.setHorizontalGroup(
            BarradeEscolhaTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarradeEscolhaTreinoLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(Logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarradeEscolhaTreinoLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(BarradeEscolhaTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConsultarTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdicionarTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        BarradeEscolhaTreinoLayout.setVerticalGroup(
            BarradeEscolhaTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarradeEscolhaTreinoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Logo)
                .addGap(40, 40, 40)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(AdicionarTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ConsultarTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(514, Short.MAX_VALUE))
        );

        CabecalhoTreino.setBackground(new java.awt.Color(255, 255, 255));

        PesquisarTreino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PesquisarTreino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/magnifier.png"))); // NOI18N
        PesquisarTreino.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PesquisarTreino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PesquisarTreinoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PesquisarTreinoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PesquisarTreinoMouseExited(evt);
            }
        });

        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });

        TituloTreinos.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        TituloTreinos.setText("TREINOS");

        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door-exit.png"))); // NOI18N
        Sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CabecalhoTreinoLayout = new javax.swing.GroupLayout(CabecalhoTreino);
        CabecalhoTreino.setLayout(CabecalhoTreinoLayout);
        CabecalhoTreinoLayout.setHorizontalGroup(
            CabecalhoTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CabecalhoTreinoLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PesquisarTreino)
                .addGap(282, 282, 282)
                .addComponent(TituloTreinos)
                .addGap(547, 547, 547)
                .addComponent(Sair)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        CabecalhoTreinoLayout.setVerticalGroup(
            CabecalhoTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CabecalhoTreinoLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(CabecalhoTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PesquisarTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TituloTreinos)
                    .addComponent(Sair, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(30, 30, 30))
        );

        PanelImagem.setBackground(new java.awt.Color(255, 255, 255));

        nopain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NO-PAIN-NO-GAIN1.jpg"))); // NOI18N

        javax.swing.GroupLayout PanelImagemLayout = new javax.swing.GroupLayout(PanelImagem);
        PanelImagem.setLayout(PanelImagemLayout);
        PanelImagemLayout.setHorizontalGroup(
            PanelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelImagemLayout.createSequentialGroup()
                .addComponent(nopain, javax.swing.GroupLayout.PREFERRED_SIZE, 1326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );
        PanelImagemLayout.setVerticalGroup(
            PanelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelImagemLayout.createSequentialGroup()
                .addComponent(nopain)
                .addGap(0, 215, Short.MAX_VALUE))
        );

        TelaResultadoPesquisa.setBackground(new java.awt.Color(255, 255, 255));

        OBJETIVO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        OBJETIVO.setText("Birl");

        NOME.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NOME.setText("Birl");

        jScrollPane1.setOpaque(false);

        DESCRICAO.setColumns(20);
        DESCRICAO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DESCRICAO.setRows(5);
        DESCRICAO.setBorder(null);
        DESCRICAO.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(DESCRICAO);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/photo-1526506118085-60ce8714f8c5.jpg"))); // NOI18N

        Cadastrar.setBackground(new java.awt.Color(217, 81, 51));
        Cadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        Cadastrar.setText("Adicionar treino ao perfil");
        Cadastrar.setBorderPainted(false);
        Cadastrar.setFocusPainted(false);
        Cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CadastrarMouseExited(evt);
            }
        });
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaResultadoPesquisaLayout = new javax.swing.GroupLayout(TelaResultadoPesquisa);
        TelaResultadoPesquisa.setLayout(TelaResultadoPesquisaLayout);
        TelaResultadoPesquisaLayout.setHorizontalGroup(
            TelaResultadoPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaResultadoPesquisaLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(TelaResultadoPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NOME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OBJETIVO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                    .addComponent(Cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        TelaResultadoPesquisaLayout.setVerticalGroup(
            TelaResultadoPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaResultadoPesquisaLayout.createSequentialGroup()
                .addGroup(TelaResultadoPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaResultadoPesquisaLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(TelaResultadoPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OBJETIVO, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TelaResultadoPesquisaLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelTodostreinos.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setOpaque(false);

        TextTodosTreinos.setColumns(20);
        TextTodosTreinos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextTodosTreinos.setRows(5);
        TextTodosTreinos.setBorder(null);
        TextTodosTreinos.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(TextTodosTreinos);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/suplementos-personalizados.jpg"))); // NOI18N

        javax.swing.GroupLayout PanelTodostreinosLayout = new javax.swing.GroupLayout(PanelTodostreinos);
        PanelTodostreinos.setLayout(PanelTodostreinosLayout);
        PanelTodostreinosLayout.setHorizontalGroup(
            PanelTodostreinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTodostreinosLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        PanelTodostreinosLayout.setVerticalGroup(
            PanelTodostreinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTodostreinosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PanelTodostreinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jLayeredPane2.setLayer(PanelImagem, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(TelaResultadoPesquisa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(PanelTodostreinos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(PanelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(TelaResultadoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 373, Short.MAX_VALUE)))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(PanelTodostreinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 173, Short.MAX_VALUE)))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(TelaResultadoPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(PanelTodostreinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 185, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BarradeEscolhaTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CabecalhoTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 66, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(CabecalhoTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane2))
            .addComponent(BarradeEscolhaTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoMouseMoved
        //        jLabel1.setText("www");
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pXzLOUi.png"))); // NOI18N);
    }//GEN-LAST:event_LogoMouseMoved

    private void LogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoMouseExited
        //        jLabel1.setText("");
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MEKmZWl.png"))); // NOI18N);
    }//GEN-LAST:event_LogoMouseExited

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClicked
        // TODO add your handling code here:
        //        Nopain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NO-PAIN-NO-GAIN1.jpg"))); // NOI18N);
        Inicial I = new Inicial(c);
        setVisible(false);
        I.setVisible(true);
    }//GEN-LAST:event_MenuMouseClicked

    private void MenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseEntered
        Menu.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_MenuMouseEntered

    private void MenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseExited
        Menu.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_MenuMouseExited

    private void AdicionarTreinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdicionarTreinoMouseClicked
        // TODO add your handling code here:
        AdicionarTreino AT = new AdicionarTreino(c);

        AT.setVisible(true);
    }//GEN-LAST:event_AdicionarTreinoMouseClicked

    private void AdicionarTreinoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdicionarTreinoMouseEntered
        AdicionarTreino.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_AdicionarTreinoMouseEntered

    private void AdicionarTreinoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdicionarTreinoMouseExited
        AdicionarTreino.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_AdicionarTreinoMouseExited

    private void ConsultarTreinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultarTreinoMouseClicked
        TextTodosTreinos.setText("");
        PanelImagem.setVisible(false);
        TelaResultadoPesquisa.setVisible(false);
        DESCRICAO.setBorder(null);
        DESCRICAO.setOpaque(false);
        jScrollPane1.setBorder(null);
        jScrollPane1.getViewport().setOpaque(false);
         jScrollPane2.setBorder(null);
        jScrollPane2.getViewport().setOpaque(false);
        ArrayList<String> array2 = new ArrayList();
        
        Treinodao daooo = new Treinodao();
        array2.addAll(daooo.RetornarTodos());
        for (int i = 0; i < array2.size(); i++) {
            TextTodosTreinos.setText(TextTodosTreinos.getText() + "\n" + array2.get(i));

        }
        //
        
        //
        array2.clear();
        PanelTodostreinos.setVisible(true);

    }//GEN-LAST:event_ConsultarTreinoMouseClicked

    private void ConsultarTreinoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultarTreinoMouseEntered
        ConsultarTreino.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_ConsultarTreinoMouseEntered

    private void ConsultarTreinoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultarTreinoMouseExited
        ConsultarTreino.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_ConsultarTreinoMouseExited

    private void PesquisarTreinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesquisarTreinoMouseClicked
        if (Pesquisar.getText() != null) {

            TreinoModel a = new TreinoModel(Pesquisar.getText());

            Treinodao daoo = new Treinodao();
            if (daoo.Buscar(a) == true) {

                b = daoo.PesquisarnoBD(a);
                NOME.setText("Nome: " + b.getNome());

                OBJETIVO.setText("Objetivo: " + b.getObjetivo());
                DESCRICAO.setText("Descricao: " + b.getDescricao());
                DESCRICAO.setBorder(null);
                DESCRICAO.setOpaque(false);
                jScrollPane1.setBorder(null);
                PanelImagem.setVisible(false);
                TelaResultadoPesquisa.setVisible(true);
                if (Pesquisar.getText().equalsIgnoreCase(c.getNomeTreino())) {
                    Cadastrar.setVisible(false);
                } else {
                    Cadastrar.setVisible(true);
                }
                jScrollPane1.getViewport().setOpaque(false);
                Pesquisar.setText(null);
//                Nopain.setIcon(null);
                //              Nopain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MEKmZWl.png"))); // NOI18N);
                //           Nopain.setIcon(null); // NOI18N);
            } else {
                JOptionPane.showMessageDialog(null, "Treino nao encontrado");
            }

        }
    }//GEN-LAST:event_PesquisarTreinoMouseClicked

    private void PesquisarTreinoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesquisarTreinoMouseEntered

    }//GEN-LAST:event_PesquisarTreinoMouseEntered

    private void PesquisarTreinoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesquisarTreinoMouseExited
        PesquisarTreino.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_PesquisarTreinoMouseExited

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisarActionPerformed

    private void SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseClicked
        setVisible(false);
        Comecar f = new Comecar();
        f.setVisible(true);
    }//GEN-LAST:event_SairMouseClicked

    private void CadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrarMouseEntered
        Cadastrar.setBackground(new Color(235, 235, 235));
        Cadastrar.setForeground(new Color(217, 81, 51));
    }//GEN-LAST:event_CadastrarMouseEntered

    private void CadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrarMouseExited
        Cadastrar.setBackground(new Color(217, 81, 51));
        Cadastrar.setForeground(Color.WHITE);
    }//GEN-LAST:event_CadastrarMouseExited

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        c.setNomeTreino(b.getNome());
//         JOptionPane.showMessageDialog(null, c.getNome() );
        Alunodao dao2 = new Alunodao();
        dao2.AtualizarTreino(c);
        JOptionPane.showMessageDialog(null, "Treino adicionado com sucesso");
        Cadastrar.setVisible(false);

    }//GEN-LAST:event_CadastrarActionPerformed

    private void CadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CadastrarMouseClicked

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
//            java.util.logging.Logger.getLogger(Treinooo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Treinooo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Treinooo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Treinooo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Treinooo().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdicionarTreino;
    private javax.swing.JPanel BarradeEscolhaTreino;
    private javax.swing.JPanel CabecalhoTreino;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JLabel ConsultarTreino;
    private javax.swing.JTextArea DESCRICAO;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel NOME;
    private javax.swing.JLabel OBJETIVO;
    private javax.swing.JPanel PanelImagem;
    private javax.swing.JPanel PanelTodostreinos;
    private javax.swing.JTextField Pesquisar;
    private javax.swing.JLabel PesquisarTreino;
    private javax.swing.JLabel Sair;
    private javax.swing.JPanel TelaResultadoPesquisa;
    private javax.swing.JTextArea TextTodosTreinos;
    private javax.swing.JLabel TituloTreinos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nopain;
    // End of variables declaration//GEN-END:variables
}