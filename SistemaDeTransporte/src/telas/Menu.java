package telas;

import classes.Funcionario;
import classes.Usuario;
import io.Gravador;
import io.LeitorGravadorObj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class Menu extends javax.swing.JFrame {

    private ArrayList<Usuario> usuarios;
    private ArrayList<Funcionario> funcionarios;
    private HashMap<String, TreeSet<String>> estadosCidades;

    public Menu(ArrayList<Usuario> usuarios, ArrayList<Funcionario> funcionarios, HashMap<String, TreeSet<String>> estadosCidades) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.usuarios = usuarios;
        this.estadosCidades = estadosCidades;
        this.funcionarios = funcionarios;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        painelUsuario = new javax.swing.JPanel();
        bCadUsuario = new javax.swing.JButton();
        bEdUsuario = new javax.swing.JButton();
        bSair = new javax.swing.JButton();
        painelRotas = new javax.swing.JPanel();
        bEdRotas = new javax.swing.JButton();
        bCadRotas = new javax.swing.JButton();
        painelRelatorio = new javax.swing.JPanel();
        bRelatorioFunc = new javax.swing.JButton();
        bRelatorioUsuario = new javax.swing.JButton();
        bRelatorioRotas = new javax.swing.JButton();
        bRelatorioVeiculo = new javax.swing.JButton();
        lSistema = new javax.swing.JLabel();
        painelFuncionarios = new javax.swing.JPanel();
        bEdFunc = new javax.swing.JButton();
        bCadFunc = new javax.swing.JButton();
        painelVeiculo = new javax.swing.JPanel();
        bEdVeiculo = new javax.swing.JButton();
        bCadVeiculo = new javax.swing.JButton();

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 159, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        painelUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Usuários", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        bCadUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bCadUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/target (1).png"))); // NOI18N
        bCadUsuario.setText("Cadastrar ");
        bCadUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadUsuarioActionPerformed(evt);
            }
        });

        bEdUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bEdUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pencil.png"))); // NOI18N
        bEdUsuario.setText("Editar ");
        bEdUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bEdUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEdUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelUsuarioLayout = new javax.swing.GroupLayout(painelUsuario);
        painelUsuario.setLayout(painelUsuarioLayout);
        painelUsuarioLayout.setHorizontalGroup(
            painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bEdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        painelUsuarioLayout.setVerticalGroup(
            painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bEdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bSair.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        bSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/multiply (1).png"))); // NOI18N
        bSair.setText("Sair");
        bSair.setToolTipText("");
        bSair.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        painelRotas.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Rotas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        bEdRotas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bEdRotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pencil.png"))); // NOI18N
        bEdRotas.setText("Editar");
        bEdRotas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bEdRotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEdRotasActionPerformed(evt);
            }
        });

        bCadRotas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bCadRotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar-arquivo.png"))); // NOI18N
        bCadRotas.setText("Lançar");
        bCadRotas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bCadRotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadRotasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelRotasLayout = new javax.swing.GroupLayout(painelRotas);
        painelRotas.setLayout(painelRotasLayout);
        painelRotasLayout.setHorizontalGroup(
            painelRotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRotasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bCadRotas, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bEdRotas, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelRotasLayout.setVerticalGroup(
            painelRotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRotasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelRotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCadRotas, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bEdRotas, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelRelatorio.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Relatórios", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        bRelatorioFunc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bRelatorioFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/carteira-de-identidade.png"))); // NOI18N
        bRelatorioFunc.setText("Funcionários");
        bRelatorioFunc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bRelatorioFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRelatorioFuncActionPerformed(evt);
            }
        });

        bRelatorioUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bRelatorioUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pessoas.png"))); // NOI18N
        bRelatorioUsuario.setText("Usuários");
        bRelatorioUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bRelatorioUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRelatorioUsuarioActionPerformed(evt);
            }
        });

        bRelatorioRotas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bRelatorioRotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/rota.png"))); // NOI18N
        bRelatorioRotas.setText("Rotas");
        bRelatorioRotas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bRelatorioRotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRelatorioRotasActionPerformed(evt);
            }
        });

        bRelatorioVeiculo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bRelatorioVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/veiculos.png"))); // NOI18N
        bRelatorioVeiculo.setText("Veículos");
        bRelatorioVeiculo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bRelatorioVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRelatorioVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelRelatorioLayout = new javax.swing.GroupLayout(painelRelatorio);
        painelRelatorio.setLayout(painelRelatorioLayout);
        painelRelatorioLayout.setHorizontalGroup(
            painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRelatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bRelatorioUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bRelatorioFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bRelatorioVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bRelatorioRotas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelRelatorioLayout.setVerticalGroup(
            painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRelatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bRelatorioFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRelatorioUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRelatorioRotas, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRelatorioVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lSistema.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        lSistema.setText("Sistema de Transporte");
        lSistema.setToolTipText("");

        painelFuncionarios.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Funcionários", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        bEdFunc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bEdFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pencil.png"))); // NOI18N
        bEdFunc.setText("Editar");
        bEdFunc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bEdFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEdFuncActionPerformed(evt);
            }
        });

        bCadFunc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bCadFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionarios.png"))); // NOI18N
        bCadFunc.setText("Cadastrar");
        bCadFunc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bCadFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadFuncActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelFuncionariosLayout = new javax.swing.GroupLayout(painelFuncionarios);
        painelFuncionarios.setLayout(painelFuncionariosLayout);
        painelFuncionariosLayout.setHorizontalGroup(
            painelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFuncionariosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCadFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bEdFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelFuncionariosLayout.setVerticalGroup(
            painelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFuncionariosLayout.createSequentialGroup()
                .addGroup(painelFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEdFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCadFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        painelVeiculo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Veículos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        bEdVeiculo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bEdVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pencil.png"))); // NOI18N
        bEdVeiculo.setText("Editar");
        bEdVeiculo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bEdVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEdVeiculoActionPerformed(evt);
            }
        });

        bCadVeiculo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bCadVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/assinando.png"))); // NOI18N
        bCadVeiculo.setText("Cadastrar");
        bCadVeiculo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bCadVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelVeiculoLayout = new javax.swing.GroupLayout(painelVeiculo);
        painelVeiculo.setLayout(painelVeiculoLayout);
        painelVeiculoLayout.setHorizontalGroup(
            painelVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bCadVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bEdVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelVeiculoLayout.setVerticalGroup(
            painelVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVeiculoLayout.createSequentialGroup()
                .addGroup(painelVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCadVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bEdVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(painelFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(painelRotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(bSair, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(lSistema)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lSistema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelRotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bSair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        Gravador.gravarUsuario(new LeitorGravadorObj(), this.usuarios);
        Gravador.gravarFuncionario(new LeitorGravadorObj(), this.funcionarios);
        System.exit(0);
    }//GEN-LAST:event_bSairActionPerformed

    private void bCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadUsuarioActionPerformed
       new CadastroUsuario(this.usuarios, this.estadosCidades);
    }//GEN-LAST:event_bCadUsuarioActionPerformed

    private void bCadFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadFuncActionPerformed
        new CadastroFuncionario(this.funcionarios, this.estadosCidades);
    }//GEN-LAST:event_bCadFuncActionPerformed

    private void bCadRotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadRotasActionPerformed
        new CadastroRotas();
    }//GEN-LAST:event_bCadRotasActionPerformed

    private void bEdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEdUsuarioActionPerformed
        new EditUsuario();
    }//GEN-LAST:event_bEdUsuarioActionPerformed

    private void bEdFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEdFuncActionPerformed
        new EditFuncionario();
    }//GEN-LAST:event_bEdFuncActionPerformed

    private void bEdRotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEdRotasActionPerformed
        new EditRotas();
    }//GEN-LAST:event_bEdRotasActionPerformed

    private void bRelatorioFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRelatorioFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bRelatorioFuncActionPerformed

    private void bRelatorioUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRelatorioUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bRelatorioUsuarioActionPerformed

    private void bRelatorioRotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRelatorioRotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bRelatorioRotasActionPerformed

    private void bEdVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEdVeiculoActionPerformed
        new EditVeiculo();
    }//GEN-LAST:event_bEdVeiculoActionPerformed

    private void bCadVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadVeiculoActionPerformed
        new CadastroVeiculo();
    }//GEN-LAST:event_bCadVeiculoActionPerformed

    private void bRelatorioVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRelatorioVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bRelatorioVeiculoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadFunc;
    private javax.swing.JButton bCadRotas;
    private javax.swing.JButton bCadUsuario;
    private javax.swing.JButton bCadVeiculo;
    private javax.swing.JButton bEdFunc;
    private javax.swing.JButton bEdRotas;
    private javax.swing.JButton bEdUsuario;
    private javax.swing.JButton bEdVeiculo;
    private javax.swing.JButton bRelatorioFunc;
    private javax.swing.JButton bRelatorioRotas;
    private javax.swing.JButton bRelatorioUsuario;
    private javax.swing.JButton bRelatorioVeiculo;
    private javax.swing.JButton bSair;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lSistema;
    private javax.swing.JPanel painelFuncionarios;
    private javax.swing.JPanel painelRelatorio;
    private javax.swing.JPanel painelRotas;
    private javax.swing.JPanel painelUsuario;
    private javax.swing.JPanel painelVeiculo;
    // End of variables declaration//GEN-END:variables
}
