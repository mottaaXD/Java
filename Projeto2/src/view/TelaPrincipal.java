/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControleAlterarLogin;
import controller.ControleTrocarTela;
import controller.ControlePrincipal;
import controller.ControlePesquisar;

import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Usuario;
/**
 *
 * @author uniflualves
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal(Usuario usuario) {
        initComponents();
        lbl_usuarioLogado.setText((usuario.getNome()));
        this.getTxt_novoNome().setText(usuario.getNome());
        cp = new ControlePrincipal(this, usuario);
        cal = new ControleAlterarLogin(this, usuario);
        trocarTela = new ControleTrocarTela(this);
        cPes = new ControlePesquisar(this);
    }
    
    private ControlePrincipal cp;
    private ControleAlterarLogin cal;
    private ControleTrocarTela trocarTela;
    private ControlePesquisar cPes;

    public ControlePrincipal getCp() {
        return cp;
    }

    public ControleAlterarLogin getCal() {
        return cal;
    }

    public ControleTrocarTela getTrocarTela() {
        return trocarTela;
    }

    public JButton getBt_alterarLogin() {
        return bt_alterarTelaLogin;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getLbl_usuarioLogado() {
        return lbl_usuarioLogado;
    }

    public JPanel getPainelAlterarLogin() {
        return painelAlterarLogin;
    }

    public JPanel getPainelCardPrincipal() {
        return painelCardPrincipal;
    }

    public JPanel getPainelMenuPrincipal() {
        return painelMenuPrincipal;
    }

    public JTextField getTxt_novaSenha() {
        return txt_novaSenha;
    }

    public JTextField getTxt_novoNome() {
        return txt_novoNome;
    }

    public JTextField getTxt_pesquisa() {
        return txt_pesquisa;
    }

    public JLabel getLbl_nomeSerie1() {
        return lbl_nomeSerie1;
    }

    public JLabel getLbl_nomeSerie2() {
        return lbl_nomeSerie2;
    }

    public JLabel getLbl_nomeSerie3() {
        return lbl_nomeSerie2;
    }

    public JLabel getLbl_descSerie1() {
        return lbl_descSerie1;
    }

    public JLabel getLbl_descSerie2() {
        return lbl_descSerie2;
    }

    public JLabel getLbl_episodiosSerie1() {
        return lbl_episodiosSerie1;
    }

    public JLabel getLbl_episodiosSerie2() {
        return lbl_episodiosSerie2;
    }

    public JLabel getLbl_temporadasSerie1() {
        return lbl_temporadasSerie1;
    }

    public JLabel getLbl_temporadasSerie2() {
        return lbl_temporadasSerie2;
    }

    public JPanel getPainelSerieResultados() {
        return painelSerieResultados;
    }

    public JLabel getLbl_serieImagem() {
        return lbl_serieImagem;
    }

    public JLabel getLbl_serieNomeR() {
        return lbl_serieNomeR;
    }

    public JLabel getLbl_serieDescR() {
        return lbl_serieDescR;
    }

    public JLabel getLbl_textDesc1() {
        return lbl_textDesc1;
    }

    public JLabel getLbl_textDesc2() {
        return lbl_textDesc2;
    }

    public JLabel getLbl_textEp1() {
        return lbl_textEp1;
    }

    public JLabel getLbl_textEp2() {
        return lbl_textEp2;
    }

    public JLabel getLbl_textNome1() {
        return lbl_textNome1;
    }

    public JLabel getLbl_textNome2() {
        return lbl_textNome2;
    }

    public JLabel getLbl_textTemporada1() {
        return lbl_textTemporada1;
    }

    public JLabel getLbl_textTemporada2() {
        return lbl_textTemporada2;
    }

    public JLabel getLbl_descFilme1() {
        return lbl_descFilme1;
    }

    public JLabel getLbl_descFilme2() {
        return lbl_descFilme2;
    }

    public JLabel getLbl_duracaoFilme1() {
        return lbl_duracaoFilme1;
    }

    public JLabel getLbl_duracaoFilme2() {
        return lbl_duracaoFilme2;
    }

    public JLabel getLbl_nomeFilme1() {
        return lbl_nomeFilme1;
    }

    public JLabel getLbl_nomeFilme2() {
        return lbl_nomeFilme2;
    }

    public JLabel getLbl_textDesc3() {
        return lbl_textDesc3;
    }

    public JLabel getLbl_textDesc4() {
        return lbl_textDesc4;
    }

    public JLabel getLbl_textDuracao1() {
        return lbl_textDuracao1;
    }

    public JLabel getLbl_textDuracao2() {
        return lbl_textDuracao2;
    }

    public JLabel getLbl_textNome3() {
        return lbl_textNome3;
    }

    public JLabel getLbl_textNome4() {
        return lbl_textNome4;
    }

    public JLabel getLbl_filmeImagem() {
        return lbl_filmeImagem;
    }

    public JLabel getLbl_filmeNomeR() {
        return lbl_filmeNomeR;
    }

    public JLabel getLbl_serieTemporadaR() {
        return lbl_serieTemporadaR;
    }

    public JLabel getLbl_serieEpisodiosR() {
        return lbl_serieEpisodiosR;
    }

    public JLabel getLbl_filmeDescR() {
        return lbl_filmeDescR;
    }

    public JLabel getLbl_filmeDuracaoR() {
        return lbl_filmeDuracaoR;
    }
    
    
    
    

    public void setCp(ControlePrincipal cp) {
        this.cp = cp;
    }

    public void setCal(ControleAlterarLogin cal) {
        this.cal = cal;
    }

    public void setTrocarTela(ControleTrocarTela trocarTela) {
        this.trocarTela = trocarTela;
    }

    public void setBt_alterarLogin(JButton bt_alterarLogin) {
        this.bt_alterarTelaLogin = bt_alterarLogin;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public void setLbl_usuarioLogado(JLabel lbl_usuarioLogado) {
        this.lbl_usuarioLogado = lbl_usuarioLogado;
    }

    public void setPainelAlterarLogin(JPanel painelAlterarLogin) {
        this.painelAlterarLogin = painelAlterarLogin;
    }

    public void setPainelCardPrincipal(JPanel painelCardPrincipal) {
        this.painelCardPrincipal = painelCardPrincipal;
    }

    public void setPainelMenuPrincipal(JPanel painelMenuPrincipal) {
        this.painelMenuPrincipal = painelMenuPrincipal;
    }

    public void setTxt_novaSenha(JTextField txt_novaSenha) {
        this.txt_novaSenha = txt_novaSenha;
    }

    public void setTxt_novoNome(JTextField txt_novoNome) {
        this.txt_novoNome = txt_novoNome;
    }

    public void setLbl_nomeSerie1(JLabel lbl_nomeSerie1) {
        this.lbl_nomeSerie1 = lbl_nomeSerie1;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCardPrincipal = new javax.swing.JPanel();
        painelMenuPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_usuarioLogado = new javax.swing.JLabel();
        bt_alterarTelaLogin = new javax.swing.JButton();
        bt_pesquisar = new javax.swing.JButton();
        painelAlterarLogin = new javax.swing.JPanel();
        txt_novoNome = new javax.swing.JTextField();
        lbl_novoNome = new javax.swing.JLabel();
        lbl_novaSenha = new javax.swing.JLabel();
        txt_novaSenha = new javax.swing.JTextField();
        bt_alterar = new javax.swing.JButton();
        bt_voltarMenu = new javax.swing.JButton();
        painelPesquisar = new javax.swing.JPanel();
        txt_pesquisa = new javax.swing.JTextField();
        bt_voltarMenu2 = new javax.swing.JButton();
        lbl_filme = new javax.swing.JLabel();
        lbl_nomeSerie1 = new javax.swing.JLabel();
        lbl_descSerie1 = new javax.swing.JLabel();
        lbl_temporadasSerie1 = new javax.swing.JLabel();
        lbl_episodiosSerie1 = new javax.swing.JLabel();
        lbl_nomeSerie2 = new javax.swing.JLabel();
        lbl_descSerie2 = new javax.swing.JLabel();
        lbl_temporadasSerie2 = new javax.swing.JLabel();
        lbl_episodiosSerie2 = new javax.swing.JLabel();
        lbl_textNome1 = new javax.swing.JLabel();
        lbl_textDesc1 = new javax.swing.JLabel();
        lbl_textTemporada1 = new javax.swing.JLabel();
        lbl_textEp1 = new javax.swing.JLabel();
        lbl_textNome2 = new javax.swing.JLabel();
        lbl_textDesc2 = new javax.swing.JLabel();
        lbl_textTemporada2 = new javax.swing.JLabel();
        lbl_textEp2 = new javax.swing.JLabel();
        lbl_serie1 = new javax.swing.JLabel();
        lbl_textNome3 = new javax.swing.JLabel();
        lbl_nomeFilme1 = new javax.swing.JLabel();
        lbl_descFilme1 = new javax.swing.JLabel();
        lbl_textDesc3 = new javax.swing.JLabel();
        lbl_textDuracao1 = new javax.swing.JLabel();
        lbl_duracaoFilme1 = new javax.swing.JLabel();
        lbl_textNome4 = new javax.swing.JLabel();
        lbl_nomeFilme2 = new javax.swing.JLabel();
        lbl_descFilme2 = new javax.swing.JLabel();
        lbl_textDesc4 = new javax.swing.JLabel();
        lbl_duracaoFilme2 = new javax.swing.JLabel();
        lbl_textDuracao2 = new javax.swing.JLabel();
        painelSerieResultados = new javax.swing.JPanel();
        lbl_serieImagem = new javax.swing.JLabel();
        lbl_serieNomeR = new javax.swing.JLabel();
        bt_voltarPesquisar1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_serieDescR = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_serieTemporadaR = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbl_serieEpisodiosR = new javax.swing.JLabel();
        painelFilmeResultados = new javax.swing.JPanel();
        lbl_filmeImagem = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_filmeNomeR = new javax.swing.JLabel();
        bt_voltarPesquisar2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbl_filmeDescR = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_filmeDuracaoR = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelCardPrincipal.setLayout(new java.awt.CardLayout());

        painelMenuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 38)); // NOI18N
        jLabel1.setText("Bem Vindo");

        lbl_usuarioLogado.setFont(new java.awt.Font("Segoe UI", 0, 38)); // NOI18N

        bt_alterarTelaLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_alterarTelaLogin.setText("Alterar Login");
        bt_alterarTelaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_alterarTelaLoginActionPerformed(evt);
            }
        });

        bt_pesquisar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bt_pesquisar.setText("Pesquisar");
        bt_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelMenuPrincipalLayout = new javax.swing.GroupLayout(painelMenuPrincipal);
        painelMenuPrincipal.setLayout(painelMenuPrincipalLayout);
        painelMenuPrincipalLayout.setHorizontalGroup(
            painelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuPrincipalLayout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(lbl_usuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(bt_alterarTelaLogin)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMenuPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_pesquisar)
                .addGap(356, 356, 356))
        );
        painelMenuPrincipalLayout.setVerticalGroup(
            painelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuPrincipalLayout.createSequentialGroup()
                .addGroup(painelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMenuPrincipalLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(painelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lbl_usuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelMenuPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bt_alterarTelaLogin)))
                .addGap(119, 119, 119)
                .addComponent(bt_pesquisar)
                .addContainerGap(271, Short.MAX_VALUE))
        );

        painelCardPrincipal.add(painelMenuPrincipal, "menuPrincipal");

        txt_novoNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lbl_novoNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_novoNome.setText("Novo Nome:");

        lbl_novaSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_novaSenha.setText("Nova Senha");

        txt_novaSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        bt_alterar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bt_alterar.setText("Alterar Login");
        bt_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_alterarActionPerformed(evt);
            }
        });

        bt_voltarMenu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bt_voltarMenu.setText("Voltar");
        bt_voltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAlterarLoginLayout = new javax.swing.GroupLayout(painelAlterarLogin);
        painelAlterarLogin.setLayout(painelAlterarLoginLayout);
        painelAlterarLoginLayout.setHorizontalGroup(
            painelAlterarLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAlterarLoginLayout.createSequentialGroup()
                .addGroup(painelAlterarLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAlterarLoginLayout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(bt_alterar))
                    .addGroup(painelAlterarLoginLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(bt_voltarMenu))
                    .addGroup(painelAlterarLoginLayout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addGroup(painelAlterarLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_novaSenha)
                            .addComponent(lbl_novoNome))
                        .addGap(18, 18, 18)
                        .addGroup(painelAlterarLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_novoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_novaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(261, Short.MAX_VALUE))
        );
        painelAlterarLoginLayout.setVerticalGroup(
            painelAlterarLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAlterarLoginLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(painelAlterarLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_novoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_novoNome))
                .addGap(18, 18, 18)
                .addGroup(painelAlterarLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_novaSenha)
                    .addComponent(txt_novaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(bt_alterar)
                .addGap(62, 62, 62)
                .addComponent(bt_voltarMenu)
                .addGap(78, 78, 78))
        );

        painelCardPrincipal.add(painelAlterarLogin, "telaAlterar");

        txt_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pesquisaActionPerformed(evt);
            }
        });
        txt_pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pesquisaKeyReleased(evt);
            }
        });

        bt_voltarMenu2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_voltarMenu2.setText("Voltar");
        bt_voltarMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarMenu2ActionPerformed(evt);
            }
        });

        lbl_filme.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_filme.setText("Filmes:");

        lbl_nomeSerie1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_nomeSerie1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_nomeSerie1.setOpaque(true);
        lbl_nomeSerie1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_nomeSerie1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_nomeSerie1MouseEntered(evt);
            }
        });

        lbl_descSerie1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_descSerie1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_descSerie1.setOpaque(true);

        lbl_temporadasSerie1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_temporadasSerie1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_temporadasSerie1.setOpaque(true);

        lbl_episodiosSerie1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_episodiosSerie1.setOpaque(true);

        lbl_nomeSerie2.setBackground(new java.awt.Color(255, 255, 255));
        lbl_nomeSerie2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_nomeSerie2.setOpaque(true);
        lbl_nomeSerie2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_nomeSerie2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_nomeSerie2MouseEntered(evt);
            }
        });

        lbl_descSerie2.setBackground(new java.awt.Color(255, 255, 255));
        lbl_descSerie2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_descSerie2.setOpaque(true);

        lbl_temporadasSerie2.setBackground(new java.awt.Color(255, 255, 255));
        lbl_temporadasSerie2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_temporadasSerie2.setOpaque(true);

        lbl_episodiosSerie2.setBackground(new java.awt.Color(255, 255, 255));
        lbl_episodiosSerie2.setOpaque(true);

        lbl_textNome1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_textNome1.setText("Nome:");

        lbl_textDesc1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_textDesc1.setText("Descrição:");

        lbl_textTemporada1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_textTemporada1.setText("Temporadas:");

        lbl_textEp1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_textEp1.setText("Episódios:");

        lbl_textNome2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_textNome2.setText("Nome:");

        lbl_textDesc2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_textDesc2.setText("Descrição:");

        lbl_textTemporada2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_textTemporada2.setText("Temporadas:");

        lbl_textEp2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_textEp2.setText("Episódios:");

        lbl_serie1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_serie1.setText("Séries:");

        lbl_textNome3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_textNome3.setText("Nome:");

        lbl_nomeFilme1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_nomeFilme1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_nomeFilme1.setOpaque(true);
        lbl_nomeFilme1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_nomeFilme1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_nomeFilme1MouseEntered(evt);
            }
        });

        lbl_descFilme1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_descFilme1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_descFilme1.setOpaque(true);

        lbl_textDesc3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_textDesc3.setText("Descrição:");

        lbl_textDuracao1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_textDuracao1.setText("Duração:");

        lbl_duracaoFilme1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_duracaoFilme1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_duracaoFilme1.setOpaque(true);

        lbl_textNome4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_textNome4.setText("Nome:");

        lbl_nomeFilme2.setBackground(new java.awt.Color(255, 255, 255));
        lbl_nomeFilme2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_nomeFilme2.setOpaque(true);
        lbl_nomeFilme2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_nomeFilme2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_nomeFilme2MouseEntered(evt);
            }
        });

        lbl_descFilme2.setBackground(new java.awt.Color(255, 255, 255));
        lbl_descFilme2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_descFilme2.setOpaque(true);

        lbl_textDesc4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_textDesc4.setText("Descrição:");

        lbl_duracaoFilme2.setBackground(new java.awt.Color(255, 255, 255));
        lbl_duracaoFilme2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_duracaoFilme2.setOpaque(true);

        lbl_textDuracao2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_textDuracao2.setText("Duração:");

        javax.swing.GroupLayout painelPesquisarLayout = new javax.swing.GroupLayout(painelPesquisar);
        painelPesquisar.setLayout(painelPesquisarLayout);
        painelPesquisarLayout.setHorizontalGroup(
            painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisarLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(bt_voltarMenu2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPesquisarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPesquisarLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPesquisarLayout.createSequentialGroup()
                        .addComponent(lbl_serie1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_filme)
                        .addGap(274, 274, 274))
                    .addGroup(painelPesquisarLayout.createSequentialGroup()
                        .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_textNome1)
                            .addComponent(lbl_textDesc1)
                            .addComponent(lbl_textTemporada1)
                            .addComponent(lbl_textEp1)
                            .addComponent(lbl_textNome2)
                            .addComponent(lbl_textDesc2)
                            .addComponent(lbl_textTemporada2)
                            .addComponent(lbl_textEp2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_descSerie1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lbl_episodiosSerie1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_temporadasSerie1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_nomeSerie2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_descSerie2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lbl_episodiosSerie2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_temporadasSerie2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_nomeSerie1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_textNome3)
                            .addComponent(lbl_textDesc3)
                            .addComponent(lbl_textDuracao1)
                            .addComponent(lbl_textNome4)
                            .addComponent(lbl_textDesc4)
                            .addComponent(lbl_textDuracao2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_descFilme1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_duracaoFilme1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nomeFilme2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_descFilme2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_duracaoFilme2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nomeFilme1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))))
        );
        painelPesquisarLayout.setVerticalGroup(
            painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_serie1)
                    .addComponent(lbl_filme))
                .addGap(27, 27, 27)
                .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPesquisarLayout.createSequentialGroup()
                        .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelPesquisarLayout.createSequentialGroup()
                                .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_nomeSerie1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_textNome1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_descSerie1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_textDesc1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_temporadasSerie1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_textTemporada1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_episodiosSerie1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_textEp1))
                        .addGap(18, 18, 18)
                        .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelPesquisarLayout.createSequentialGroup()
                                .addComponent(lbl_nomeSerie2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_descSerie2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelPesquisarLayout.createSequentialGroup()
                                .addComponent(lbl_textNome2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_textDesc2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_textTemporada2)
                            .addComponent(lbl_temporadasSerie2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_episodiosSerie2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelPesquisarLayout.createSequentialGroup()
                                .addComponent(lbl_textEp2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(bt_voltarMenu2)
                        .addGap(31, 31, 31))
                    .addGroup(painelPesquisarLayout.createSequentialGroup()
                        .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_nomeFilme1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_textNome3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_descFilme1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_textDesc3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_duracaoFilme1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_textDuracao1))
                        .addGap(43, 43, 43)
                        .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelPesquisarLayout.createSequentialGroup()
                                .addComponent(lbl_nomeFilme2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_descFilme2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelPesquisarLayout.createSequentialGroup()
                                .addComponent(lbl_textNome4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_textDesc4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_textDuracao2)
                            .addComponent(lbl_duracaoFilme2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        painelCardPrincipal.add(painelPesquisar, "pesquisar");

        lbl_serieImagem.setPreferredSize(new java.awt.Dimension(256, 203));

        lbl_serieNomeR.setBackground(new java.awt.Color(255, 255, 255));
        lbl_serieNomeR.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_serieNomeR.setOpaque(true);

        bt_voltarPesquisar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_voltarPesquisar1.setText("Voltar");
        bt_voltarPesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarPesquisar1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Nome:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Descrição:");

        lbl_serieDescR.setBackground(new java.awt.Color(255, 255, 255));
        lbl_serieDescR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_serieDescR.setText("Sem Descrição");
        lbl_serieDescR.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbl_serieDescR.setOpaque(true);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Temporadas:");

        lbl_serieTemporadaR.setBackground(new java.awt.Color(255, 255, 255));
        lbl_serieTemporadaR.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_serieTemporadaR.setOpaque(true);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("Episodios:");

        lbl_serieEpisodiosR.setBackground(new java.awt.Color(255, 255, 255));
        lbl_serieEpisodiosR.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_serieEpisodiosR.setOpaque(true);

        javax.swing.GroupLayout painelSerieResultadosLayout = new javax.swing.GroupLayout(painelSerieResultados);
        painelSerieResultados.setLayout(painelSerieResultadosLayout);
        painelSerieResultadosLayout.setHorizontalGroup(
            painelSerieResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSerieResultadosLayout.createSequentialGroup()
                .addGroup(painelSerieResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSerieResultadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_serieImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelSerieResultadosLayout.createSequentialGroup()
                        .addGroup(painelSerieResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelSerieResultadosLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(painelSerieResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(painelSerieResultadosLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(painelSerieResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSerieResultadosLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)))))
                        .addGroup(painelSerieResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelSerieResultadosLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(lbl_serieNomeR, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelSerieResultadosLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(lbl_serieDescR, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelSerieResultadosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelSerieResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_serieEpisodiosR, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_serieTemporadaR, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(painelSerieResultadosLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(bt_voltarPesquisar1)))
                .addContainerGap(399, Short.MAX_VALUE))
        );
        painelSerieResultadosLayout.setVerticalGroup(
            painelSerieResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSerieResultadosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbl_serieImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSerieResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_serieNomeR, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSerieResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSerieResultadosLayout.createSequentialGroup()
                        .addComponent(lbl_serieDescR, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelSerieResultadosLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(painelSerieResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelSerieResultadosLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addGroup(painelSerieResultadosLayout.createSequentialGroup()
                                .addComponent(lbl_serieTemporadaR, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_serieEpisodiosR, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(bt_voltarPesquisar1)))
                .addContainerGap())
        );

        painelCardPrincipal.add(painelSerieResultados, "serieResultados");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Nome:");

        lbl_filmeNomeR.setBackground(new java.awt.Color(255, 255, 255));
        lbl_filmeNomeR.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_filmeNomeR.setOpaque(true);

        bt_voltarPesquisar2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_voltarPesquisar2.setText("Voltar");
        bt_voltarPesquisar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarPesquisar2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Descrição:");

        lbl_filmeDescR.setBackground(new java.awt.Color(255, 255, 255));
        lbl_filmeDescR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_filmeDescR.setToolTipText("");
        lbl_filmeDescR.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbl_filmeDescR.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Duração:");

        lbl_filmeDuracaoR.setBackground(new java.awt.Color(255, 255, 255));
        lbl_filmeDuracaoR.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_filmeDuracaoR.setOpaque(true);

        javax.swing.GroupLayout painelFilmeResultadosLayout = new javax.swing.GroupLayout(painelFilmeResultados);
        painelFilmeResultados.setLayout(painelFilmeResultadosLayout);
        painelFilmeResultadosLayout.setHorizontalGroup(
            painelFilmeResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFilmeResultadosLayout.createSequentialGroup()
                .addGroup(painelFilmeResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFilmeResultadosLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(painelFilmeResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelFilmeResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_filmeNomeR, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_filmeDescR, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelFilmeResultadosLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_filmeDuracaoR, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelFilmeResultadosLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(painelFilmeResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_filmeImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelFilmeResultadosLayout.createSequentialGroup()
                                .addComponent(bt_voltarPesquisar2)
                                .addGap(223, 223, 223)))))
                .addContainerGap(374, Short.MAX_VALUE))
        );
        painelFilmeResultadosLayout.setVerticalGroup(
            painelFilmeResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFilmeResultadosLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lbl_filmeImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFilmeResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_filmeNomeR, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFilmeResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lbl_filmeDescR, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFilmeResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_filmeDuracaoR, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(193, 193, 193)
                .addComponent(bt_voltarPesquisar2)
                .addGap(43, 43, 43))
        );

        painelCardPrincipal.add(painelFilmeResultados, "filmeResultados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCardPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCardPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_alterarTelaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_alterarTelaLoginActionPerformed
        trocarTela.trocarAlterarLogin();
    }//GEN-LAST:event_bt_alterarTelaLoginActionPerformed

    private void bt_voltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarMenuActionPerformed
        trocarTela.trocarMenu();
    }//GEN-LAST:event_bt_voltarMenuActionPerformed

    private void bt_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_alterarActionPerformed
        cal.atualizarDados();
        
    }//GEN-LAST:event_bt_alterarActionPerformed

    private void bt_voltarMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarMenu2ActionPerformed
        trocarTela.trocarMenu();
    }//GEN-LAST:event_bt_voltarMenu2ActionPerformed

    private void bt_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisarActionPerformed
        trocarTela.trocarPesquisar();
    }//GEN-LAST:event_bt_pesquisarActionPerformed

    private void txt_pesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pesquisaKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            cPes.pesquisar();
        }
    }//GEN-LAST:event_txt_pesquisaKeyReleased

    private void txt_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pesquisaActionPerformed

    private void lbl_nomeSerie1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_nomeSerie1MouseEntered
        lbl_nomeSerie1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
 
    }//GEN-LAST:event_lbl_nomeSerie1MouseEntered

    private void lbl_nomeSerie2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_nomeSerie2MouseEntered
        lbl_nomeSerie2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbl_nomeSerie2MouseEntered

    private void lbl_nomeSerie1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_nomeSerie1MouseClicked
        cPes.clicarSerie1();
    }//GEN-LAST:event_lbl_nomeSerie1MouseClicked

    private void bt_voltarPesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarPesquisar1ActionPerformed
        trocarTela.trocarPesquisar();
    }//GEN-LAST:event_bt_voltarPesquisar1ActionPerformed

    private void lbl_nomeSerie2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_nomeSerie2MouseClicked
        cPes.clicarSerie2();
    }//GEN-LAST:event_lbl_nomeSerie2MouseClicked

    private void lbl_nomeFilme1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_nomeFilme1MouseClicked
        cPes.clicarFilme1();
    }//GEN-LAST:event_lbl_nomeFilme1MouseClicked

    private void lbl_nomeFilme1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_nomeFilme1MouseEntered
        lbl_nomeFilme1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbl_nomeFilme1MouseEntered

    private void lbl_nomeFilme2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_nomeFilme2MouseClicked
        cPes.clicarFilme2();
    }//GEN-LAST:event_lbl_nomeFilme2MouseClicked

    private void lbl_nomeFilme2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_nomeFilme2MouseEntered
        lbl_nomeFilme2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbl_nomeFilme2MouseEntered

    private void bt_voltarPesquisar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarPesquisar2ActionPerformed
        trocarTela.trocarPesquisar();
    }//GEN-LAST:event_bt_voltarPesquisar2ActionPerformed

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
//            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TelaPrincipal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_alterar;
    private javax.swing.JButton bt_alterarTelaLogin;
    private javax.swing.JButton bt_pesquisar;
    private javax.swing.JButton bt_voltarMenu;
    private javax.swing.JButton bt_voltarMenu2;
    private javax.swing.JButton bt_voltarPesquisar1;
    private javax.swing.JButton bt_voltarPesquisar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_descFilme1;
    private javax.swing.JLabel lbl_descFilme2;
    private javax.swing.JLabel lbl_descSerie1;
    private javax.swing.JLabel lbl_descSerie2;
    private javax.swing.JLabel lbl_duracaoFilme1;
    private javax.swing.JLabel lbl_duracaoFilme2;
    private javax.swing.JLabel lbl_episodiosSerie1;
    private javax.swing.JLabel lbl_episodiosSerie2;
    private javax.swing.JLabel lbl_filme;
    private javax.swing.JLabel lbl_filmeDescR;
    private javax.swing.JLabel lbl_filmeDuracaoR;
    private javax.swing.JLabel lbl_filmeImagem;
    private javax.swing.JLabel lbl_filmeNomeR;
    private javax.swing.JLabel lbl_nomeFilme1;
    private javax.swing.JLabel lbl_nomeFilme2;
    private javax.swing.JLabel lbl_nomeSerie1;
    private javax.swing.JLabel lbl_nomeSerie2;
    private javax.swing.JLabel lbl_novaSenha;
    private javax.swing.JLabel lbl_novoNome;
    private javax.swing.JLabel lbl_serie1;
    private javax.swing.JLabel lbl_serieDescR;
    private javax.swing.JLabel lbl_serieEpisodiosR;
    private javax.swing.JLabel lbl_serieImagem;
    private javax.swing.JLabel lbl_serieNomeR;
    private javax.swing.JLabel lbl_serieTemporadaR;
    private javax.swing.JLabel lbl_temporadasSerie1;
    private javax.swing.JLabel lbl_temporadasSerie2;
    private javax.swing.JLabel lbl_textDesc1;
    private javax.swing.JLabel lbl_textDesc2;
    private javax.swing.JLabel lbl_textDesc3;
    private javax.swing.JLabel lbl_textDesc4;
    private javax.swing.JLabel lbl_textDuracao1;
    private javax.swing.JLabel lbl_textDuracao2;
    private javax.swing.JLabel lbl_textEp1;
    private javax.swing.JLabel lbl_textEp2;
    private javax.swing.JLabel lbl_textNome1;
    private javax.swing.JLabel lbl_textNome2;
    private javax.swing.JLabel lbl_textNome3;
    private javax.swing.JLabel lbl_textNome4;
    private javax.swing.JLabel lbl_textTemporada1;
    private javax.swing.JLabel lbl_textTemporada2;
    private javax.swing.JLabel lbl_usuarioLogado;
    private javax.swing.JPanel painelAlterarLogin;
    private javax.swing.JPanel painelCardPrincipal;
    private javax.swing.JPanel painelFilmeResultados;
    private javax.swing.JPanel painelMenuPrincipal;
    private javax.swing.JPanel painelPesquisar;
    private javax.swing.JPanel painelSerieResultados;
    private javax.swing.JTextField txt_novaSenha;
    private javax.swing.JTextField txt_novoNome;
    private javax.swing.JTextField txt_pesquisa;
    // End of variables declaration//GEN-END:variables
}
