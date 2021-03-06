/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engsoft.view;

import dao.Alunodao;
import dao.Professordao;
import java.awt.Color;
import javax.swing.JOptionPane;
import model.Aluno;
import model.Professor;

/**
 *
 * @author vinicius
 */
public class Comecar extends javax.swing.JFrame {

    /**
     * Creates new form Comecar
     */
    public Comecar() {
        initComponents();

        LoginGeral.setVisible(true);
        TelaCasdatrarUsuario.setVisible(false);
        MensagemErro.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        TelaCasdatrarUsuario = new javax.swing.JPanel();
        CabecalhoCadastro = new javax.swing.JPanel();
        TituloCadastrousu = new javax.swing.JLabel();
        imagem2cabecalho = new javax.swing.JLabel();
        Imagem2cabecalho = new javax.swing.JLabel();
        CorpoCadastro = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Login = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Confirmar = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        Senha = new javax.swing.JPasswordField();
        Confirmsenha = new javax.swing.JPasswordField();
        campsenhaGe = new javax.swing.JPasswordField();
        SenhaGerencia = new javax.swing.JLabel();
        LoginGeral = new javax.swing.JPanel();
        LoginCabecalho = new javax.swing.JPanel();
        CabecalhoLogin = new javax.swing.JLabel();
        LoginCorpo = new javax.swing.JPanel();
        Entrar = new javax.swing.JButton();
        Cadastrar = new javax.swing.JButton();
        txtlogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtsenha = new javax.swing.JPasswordField();
        MensagemErro = new javax.swing.JLabel();
        Tipo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(502, 501));

        CabecalhoCadastro.setBackground(new java.awt.Color(27, 187, 125));

        TituloCadastrousu.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        TituloCadastrousu.setForeground(new java.awt.Color(255, 255, 255));
        TituloCadastrousu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloCadastrousu.setText("Cadastro");

        imagem2cabecalho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-ciclismo-mountain-bike-48.png"))); // NOI18N

        Imagem2cabecalho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-sumo-de-laranja-48.png"))); // NOI18N

        javax.swing.GroupLayout CabecalhoCadastroLayout = new javax.swing.GroupLayout(CabecalhoCadastro);
        CabecalhoCadastro.setLayout(CabecalhoCadastroLayout);
        CabecalhoCadastroLayout.setHorizontalGroup(
            CabecalhoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CabecalhoCadastroLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(imagem2cabecalho)
                .addGap(74, 74, 74)
                .addComponent(TituloCadastrousu)
                .addGap(65, 65, 65)
                .addComponent(Imagem2cabecalho)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CabecalhoCadastroLayout.setVerticalGroup(
            CabecalhoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CabecalhoCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CabecalhoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CabecalhoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TituloCadastrousu)
                        .addComponent(Imagem2cabecalho))
                    .addGroup(CabecalhoCadastroLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(imagem2cabecalho)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CorpoCadastro.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-confer??ncia-24.png"))); // NOI18N
        jLabel9.setText("Nome:");

        Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-administrador-masculino-24.png"))); // NOI18N
        jLabel10.setText("Usu??rio:");

        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-senha-24.png"))); // NOI18N
        jLabel11.setText("Senha:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-senha-24.png"))); // NOI18N
        jLabel12.setText("Confirmar Senha:");

        Confirmar.setBackground(new java.awt.Color(58, 65, 84));
        Confirmar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Confirmar.setForeground(new java.awt.Color(255, 255, 255));
        Confirmar.setText("Confirmar");
        Confirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConfirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConfirmarMouseExited(evt);
            }
        });
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });

        Sair.setBackground(new java.awt.Color(217, 81, 51));
        Sair.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Sair.setForeground(new java.awt.Color(255, 255, 255));
        Sair.setText("Sair");
        Sair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SairMouseExited(evt);
            }
        });
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaActionPerformed(evt);
            }
        });

        Confirmsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmsenhaActionPerformed(evt);
            }
        });

        campsenhaGe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campsenhaGeActionPerformed(evt);
            }
        });

        SenhaGerencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SenhaGerencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-senha-24.png"))); // NOI18N
        SenhaGerencia.setText("Senha de Seguranca:");

        javax.swing.GroupLayout CorpoCadastroLayout = new javax.swing.GroupLayout(CorpoCadastro);
        CorpoCadastro.setLayout(CorpoCadastroLayout);
        CorpoCadastroLayout.setHorizontalGroup(
            CorpoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CorpoCadastroLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(CorpoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(Confirmsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campsenhaGe, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SenhaGerencia))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        CorpoCadastroLayout.setVerticalGroup(
            CorpoCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CorpoCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(1, 1, 1)
                .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Confirmsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SenhaGerencia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campsenhaGe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TelaCasdatrarUsuarioLayout = new javax.swing.GroupLayout(TelaCasdatrarUsuario);
        TelaCasdatrarUsuario.setLayout(TelaCasdatrarUsuarioLayout);
        TelaCasdatrarUsuarioLayout.setHorizontalGroup(
            TelaCasdatrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CabecalhoCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CorpoCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TelaCasdatrarUsuarioLayout.setVerticalGroup(
            TelaCasdatrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaCasdatrarUsuarioLayout.createSequentialGroup()
                .addComponent(CabecalhoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CorpoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        LoginCabecalho.setBackground(new java.awt.Color(27, 187, 125));

        CabecalhoLogin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        CabecalhoLogin.setForeground(new java.awt.Color(255, 255, 255));
        CabecalhoLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CabecalhoLogin.setText("Login de Acesso");

        javax.swing.GroupLayout LoginCabecalhoLayout = new javax.swing.GroupLayout(LoginCabecalho);
        LoginCabecalho.setLayout(LoginCabecalhoLayout);
        LoginCabecalhoLayout.setHorizontalGroup(
            LoginCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CabecalhoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        LoginCabecalhoLayout.setVerticalGroup(
            LoginCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginCabecalhoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(CabecalhoLogin)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        LoginCorpo.setBackground(new java.awt.Color(255, 255, 255));
        LoginCorpo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Entrar.setBackground(new java.awt.Color(58, 65, 84));
        Entrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Entrar.setForeground(new java.awt.Color(255, 255, 255));
        Entrar.setText("Entrar");
        Entrar.setBorderPainted(false);
        Entrar.setFocusPainted(false);
        Entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EntrarMouseExited(evt);
            }
        });
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });

        Cadastrar.setBackground(new java.awt.Color(217, 81, 51));
        Cadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        Cadastrar.setText("Cadastre-se");
        Cadastrar.setBorderPainted(false);
        Cadastrar.setFocusPainted(false);
        Cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
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

        txtlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtloginActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-administrador-masculino-24.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Usu??rio:");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-senha-24.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Senha:");

        MensagemErro.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        MensagemErro.setForeground(new java.awt.Color(255, 0, 0));
        MensagemErro.setText("Usu??rio ou senha incorretos");

        Tipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Tipo.setText("Professor");
        Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginCorpoLayout = new javax.swing.GroupLayout(LoginCorpo);
        LoginCorpo.setLayout(LoginCorpoLayout);
        LoginCorpoLayout.setHorizontalGroup(
            LoginCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginCorpoLayout.createSequentialGroup()
                .addGroup(LoginCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginCorpoLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel5))
                    .addGroup(LoginCorpoLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(LoginCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Tipo)
                            .addGroup(LoginCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(LoginCorpoLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel3))
                                .addComponent(jLabel4)
                                .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(MensagemErro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        LoginCorpoLayout.setVerticalGroup(
            LoginCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginCorpoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tipo)
                .addGap(8, 8, 8)
                .addGroup(LoginCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(LoginCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MensagemErro)
                .addGap(18, 18, 18)
                .addComponent(Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LoginGeralLayout = new javax.swing.GroupLayout(LoginGeral);
        LoginGeral.setLayout(LoginGeralLayout);
        LoginGeralLayout.setHorizontalGroup(
            LoginGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginCabecalho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LoginCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LoginGeralLayout.setVerticalGroup(
            LoginGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginGeralLayout.createSequentialGroup()
                .addComponent(LoginCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LoginCorpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(TelaCasdatrarUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(LoginGeral, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(TelaCasdatrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LoginGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(TelaCasdatrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LoginGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarMouseEntered
        Entrar.setBackground(new Color(235, 235, 235));
        Entrar.setForeground(new Color(58, 65, 84));
    }//GEN-LAST:event_EntrarMouseEntered

    private void EntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarMouseExited
        Entrar.setBackground(new Color(58, 65, 84));
        Entrar.setForeground(Color.WHITE);
    }//GEN-LAST:event_EntrarMouseExited

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
        if (Tipo.getText().equals("Professor") && txtlogin.getText().equals("") == false&&txtsenha.getText().equals("") == false) {
           
            Aluno a = new Aluno(txtlogin.getText(), txtsenha.getText());
            Aluno b;
            Alunodao dao = new Alunodao();
            if (dao.logar(a) == true) {
                b = dao.PesquisarnoBD(a);

                setVisible(false);
                Inicial f = new Inicial(b);
                f.setVisible(true);
            } else {
                MensagemErro.setVisible(true);
                txtlogin.setText("");
                txtsenha.setText("");
            }
    }//GEN-LAST:event_EntrarActionPerformed
        else if(Tipo.getText().equals("Aluno") && txtlogin.getText().equals("") == false&&txtsenha.getText().equals("") == false){
      Professor a = new Professor(txtlogin.getText(), txtsenha.getText());
            Professor b;
            Professordao dao = new Professordao();
            if (dao.logar(a) == true) {
                b = dao.PesquisarnoBD(a);

                setVisible(false);
                InicialProf f = new InicialProf(b);
                f.setVisible(true);
            } else {
                MensagemErro.setVisible(true);
                txtlogin.setText("");
                txtsenha.setText("");
            }
        }
        else {
            MensagemErro.setVisible(true);
        }
    }
    private void CadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrarMouseEntered
        Cadastrar.setBackground(new Color(235, 235, 235));
        Cadastrar.setForeground(new Color(217, 81, 51));
    }//GEN-LAST:event_CadastrarMouseEntered

    private void CadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrarMouseExited
        Cadastrar.setBackground(new Color(217, 81, 51));
        Cadastrar.setForeground(Color.WHITE);
    }//GEN-LAST:event_CadastrarMouseExited

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        LoginGeral.setVisible(false);
        TelaCasdatrarUsuario.setVisible(true);
        if(Tipo.getText().equals("Professor")){
            campsenhaGe.setVisible(false);
            SenhaGerencia.setVisible(false);
        }else{
             campsenhaGe.setVisible(true);
            SenhaGerencia.setVisible(true);
        }

    }//GEN-LAST:event_CadastrarActionPerformed

    private void txtloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtloginActionPerformed

    }//GEN-LAST:event_txtloginActionPerformed

    private void NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginActionPerformed

    private void ConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarMouseEntered
        Confirmar.setBackground(new Color(235, 235, 235));
        Confirmar.setForeground(new Color(58, 65, 84));
    }//GEN-LAST:event_ConfirmarMouseEntered

    private void ConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarMouseExited
        Confirmar.setBackground(new Color(58, 65, 84));
        Confirmar.setForeground(Color.WHITE);
    }//GEN-LAST:event_ConfirmarMouseExited

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
       if(Tipo.getText().equals("Professor")){
        if (Senha.getText().equals(Confirmsenha.getText())) {

            Aluno a = new Aluno(Nome.getText(), Login.getText(), Senha.getText(),"Ativo");
            
            Alunodao dao = new Alunodao();
            if (dao.inserir(a) == true) {
                JOptionPane.showMessageDialog(null, "Usuario cadastrado");
                TelaCasdatrarUsuario.setVisible(false);
                LoginGeral.setVisible(true);
            } else {
                TelaCasdatrarUsuario.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "As senhas nao sao iguais");
        }
       }else{
           if (Senha.getText().equals(Confirmsenha.getText())&&campsenhaGe.getText().equals("123")) {

            Professor a = new Professor(Nome.getText(), Login.getText(), Senha.getText());
            
            Professordao dao = new Professordao();
            if (dao.inserir(a) == true) {
                JOptionPane.showMessageDialog(null, "Professor cadastrado");
                TelaCasdatrarUsuario.setVisible(false);
                LoginGeral.setVisible(true);
            } else {
                TelaCasdatrarUsuario.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "As senhas nao sao iguais ou senha de seguranca incorreta");
        }
       }
    }//GEN-LAST:event_ConfirmarActionPerformed

    private void SairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseEntered

        Sair.setBackground(new Color(235, 235, 235));
        Sair.setForeground(new Color(217, 81, 51));
    }//GEN-LAST:event_SairMouseEntered

    private void SairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseExited
        Sair.setBackground(new Color(217, 81, 51));
        Sair.setForeground(Color.WHITE);
    }//GEN-LAST:event_SairMouseExited

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        TelaCasdatrarUsuario.setVisible(false);
        LoginGeral.setVisible(true);

    }//GEN-LAST:event_SairActionPerformed

    private void ConfirmsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmsenhaActionPerformed

    private void TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoActionPerformed
        if (Tipo.getText().equals("Professor")) {
            Tipo.setText("Aluno");
        } else {
            Tipo.setText("Professor");
        }
    }//GEN-LAST:event_TipoActionPerformed

    private void campsenhaGeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campsenhaGeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campsenhaGeActionPerformed

    private void SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhaActionPerformed

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
            java.util.logging.Logger.getLogger(Comecar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comecar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comecar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comecar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comecar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CabecalhoCadastro;
    private javax.swing.JLabel CabecalhoLogin;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JButton Confirmar;
    private javax.swing.JPasswordField Confirmsenha;
    private javax.swing.JPanel CorpoCadastro;
    private javax.swing.JButton Entrar;
    private javax.swing.JLabel Imagem2cabecalho;
    private javax.swing.JTextField Login;
    private javax.swing.JPanel LoginCabecalho;
    private javax.swing.JPanel LoginCorpo;
    private javax.swing.JPanel LoginGeral;
    private javax.swing.JLabel MensagemErro;
    private javax.swing.JTextField Nome;
    private javax.swing.JButton Sair;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JLabel SenhaGerencia;
    private javax.swing.JPanel TelaCasdatrarUsuario;
    private javax.swing.JButton Tipo;
    private javax.swing.JLabel TituloCadastrousu;
    private javax.swing.JPasswordField campsenhaGe;
    private javax.swing.JLabel imagem2cabecalho;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTextField txtlogin;
    private javax.swing.JPasswordField txtsenha;
    // End of variables declaration//GEN-END:variables
}
