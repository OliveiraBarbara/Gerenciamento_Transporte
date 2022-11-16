package telas;

import classes.Funcionario;
import classes.Gerente;
import classes.Motorista;
import classes.Secretaria;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import operacoes.CadastroFuncionarioOperacao;
import operacoes.CarregarDados;

public class CadastroFuncionario extends javax.swing.JFrame {

    private ArrayList<Funcionario> funcionarios;
    private HashMap<String, TreeSet<String>> estadosCidades;
    private Funcionario funcionario;

    public CadastroFuncionario(ArrayList<Funcionario> funcionarios, HashMap<String, TreeSet<String>> estadosCidades, Funcionario funcionario) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        this.estadosCidades = estadosCidades;
        this.funcionarios = funcionarios;
        this.funcionario = funcionario;
        this.jTextField1.setEnabled(true);

        if (this.funcionario != null) {
            this.carregarDados();
        }

        CarregarDados.carregarEstados(this.cbUF, this.estadosCidades);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lEnd = new javax.swing.JLabel();
        tEnd = new javax.swing.JTextField();
        lNumero = new javax.swing.JLabel();
        lBarirro = new javax.swing.JLabel();
        lComplemento = new javax.swing.JLabel();
        lCep = new javax.swing.JLabel();
        lFone = new javax.swing.JLabel();
        lCPF = new javax.swing.JLabel();
        bCadastrar = new javax.swing.JButton();
        bFechar = new javax.swing.JButton();
        lUf = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        lNome = new javax.swing.JLabel();
        tCPF = new javax.swing.JFormattedTextField();
        tNumero = new javax.swing.JFormattedTextField();
        tCep = new javax.swing.JFormattedTextField();
        tFone = new javax.swing.JFormattedTextField();
        cbCidade = new javax.swing.JComboBox<>();
        cbUF = new javax.swing.JComboBox<>();
        lCargo = new javax.swing.JLabel();
        cbCargo = new javax.swing.JComboBox<>();
        lCnh = new javax.swing.JLabel();
        lBarirro2 = new javax.swing.JLabel();
        tCnh = new javax.swing.JTextField();
        tTurno = new javax.swing.JTextField();
        lBarirro3 = new javax.swing.JLabel();
        tEspecialidade = new javax.swing.JTextField();
        tLocal = new javax.swing.JFormattedTextField();
        lBarirro4 = new javax.swing.JLabel();
        lBarirro5 = new javax.swing.JLabel();
        tSetor = new javax.swing.JFormattedTextField();
        lSalario = new javax.swing.JLabel();
        tSalario = new javax.swing.JTextField();
        lBarirro6 = new javax.swing.JLabel();
        lBarirro7 = new javax.swing.JLabel();
        tpSenha = new javax.swing.JPasswordField();
        tBairro1 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Transporte");
        setResizable(false);

        hLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        hLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/customer (1).png"))); // NOI18N
        hLabel.setText("Cadastro de Funcionários");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Funcionários", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lEnd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lEnd.setText("Logradouro:");

        lNumero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lNumero.setText("Número:");

        lBarirro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lBarirro.setText("Bairro:");

        lComplemento.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lComplemento.setText("Cidade:");

        lCep.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lCep.setText("CEP:");

        lFone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lFone.setText("Telefone:");

        lCPF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lCPF.setText("CPF:");

        bCadastrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/NovoConfirmar.png"))); // NOI18N
        bCadastrar.setText("Cadastrar");
        bCadastrar.setToolTipText("");
        bCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarActionPerformed(evt);
            }
        });

        bFechar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/multiply (1).png"))); // NOI18N
        bFechar.setText("Fechar");
        bFechar.setToolTipText("");
        bFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFecharActionPerformed(evt);
            }
        });

        lUf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lUf.setText("UF:");

        lNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lNome.setText("Nome:");

        try {
            tCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        try {
            tCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            tFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cbUF.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbUFItemStateChanged(evt);
            }
        });

        lCargo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lCargo.setText("Cargo:");

        cbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Gerente", "Motorista", "Secretária" }));
        cbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCargoActionPerformed(evt);
            }
        });

        lCnh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lCnh.setText("CNH:");

        lBarirro2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lBarirro2.setText("Turno de Trabalho:");

        tCnh.setEnabled(false);

        tTurno.setEnabled(false);

        lBarirro3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lBarirro3.setText("Especialidade:");

        tEspecialidade.setEnabled(false);

        tLocal.setEnabled(false);

        lBarirro4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lBarirro4.setText("Local de Atendimento:");

        lBarirro5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lBarirro5.setText("Setor Responsável:");

        tSetor.setEnabled(false);

        lSalario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lSalario.setText("Salário:");

        lBarirro6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lBarirro6.setText("Usuario:");

        lBarirro7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lBarirro7.setText("Senha:");

        tpSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lBarirro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(lCep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tCep, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lUf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lFone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tFone))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lSalario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lBarirro3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lCnh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tCnh, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lBarirro5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lBarirro2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lBarirro4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lBarirro6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lBarirro7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lEnd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tNumero))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lCPF)
                        .addGap(8, 8, 8)
                        .addComponent(tCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNome)
                    .addComponent(lCargo)
                    .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCPF)
                    .addComponent(tCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEnd)
                    .addComponent(tEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNumero)
                    .addComponent(tNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lBarirro)
                    .addComponent(lCep)
                    .addComponent(tCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lComplemento)
                    .addComponent(cbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lUf)
                    .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lFone)
                    .addComponent(tFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCnh)
                    .addComponent(tCnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lBarirro5)
                    .addComponent(lSalario)
                    .addComponent(lBarirro3)
                    .addComponent(tSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lBarirro2)
                    .addComponent(tTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lBarirro4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 27, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lBarirro7))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lBarirro6)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hLabel)
                        .addGap(0, 349, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void bCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarActionPerformed
        String cidade = (String) this.cbCidade.getSelectedItem();
        String estado = (String) this.cbUF.getSelectedItem();
        String cargo = (String) this.cbCargo.getSelectedItem();
        int num = Integer.parseInt(this.tNumero.getText());
        double salario = Double.parseDouble(this.tSalario.getText());
        String cpf = this.tCPF.getText();
        String nome = this.tNome.getText();
        String telefone = this.tFone.getText();
        String setor = this.tSetor.getText();
        String cnh = this.tCnh.getText();
        String turno = this.tTurno.getText();
        String especialidade = this.tEspecialidade.getText();
        String local = this.tLocal.getText();
        String endereco = this.tEnd.getText();
        String bairro = this.jTextField1.getText();
        String cep = this.tCep.getText();
        String usuario = this.jTextField1.getText();
        String senha = String.valueOf(this.tpSenha.getPassword());

        if (funcionario == null) {
            try {
                CadastroFuncionarioOperacao.cadastroFuncionario(this.funcionarios, cpf, cargo, nome, salario, telefone, setor, cnh, turno, especialidade, local, endereco, num, bairro, cep, cidade, estado,usuario,senha);
            } catch (ParseException ex) {
                Logger.getLogger(CadastroFuncionario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            this.funcionario.setNome(nome);
            this.funcionario.setCpf(cpf);
            this.funcionario.setCargo(cargo);
            this.funcionario.setTelefone(telefone);
            this.funcionario.setSalario(salario);
            this.funcionario.setEndereco(endereco);
            this.funcionario.setNum(num);
            this.funcionario.setBairro(bairro);
            this.funcionario.setCep(cep);
            this.funcionario.setCidade(cidade);
            this.funcionario.setUf(estado);

            if (this.funcionario.getCargo().toLowerCase().equals("gerente")) {
                Gerente gerente = (Gerente) funcionario;
                gerente.setSetorResponsavel(setor);
            } else if (this.funcionario.getCargo().toLowerCase().equals("motorista")) {
                Motorista motorista = (Motorista) funcionario;
                motorista.setCnh(cnh);
                motorista.setTurnoTrabalho(turno);
            } else if (this.funcionario.getCargo().toLowerCase().equals("secretária")) {
                Secretaria secretaria = (Secretaria) funcionario;
                secretaria.setEspecialidade(especialidade);
                secretaria.setLocalAtendimento(local);
            }
            JOptionPane.showConfirmDialog(null, "Dados Atualizados com Sucesso!", "Sucesso!", JOptionPane.DEFAULT_OPTION);
        }

        this.dispose();
    }//GEN-LAST:event_bCadastrarActionPerformed

    private void bFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_bFecharActionPerformed

    private void cbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCargoActionPerformed
        if (cbCargo.getSelectedItem().toString().equals("Motorista")) {
            this.tCnh.setEnabled(true);
            this.tTurno.setEnabled(true);
            this.tEspecialidade.setEnabled(false);
            this.tLocal.setEnabled(false);
            this.tSetor.setEnabled(false);
        } else if (cbCargo.getSelectedItem().toString().equals("Secretária")) {
            this.tCnh.setEnabled(false);
            this.tTurno.setEnabled(false);
            this.tEspecialidade.setEnabled(true);
            this.tLocal.setEnabled(true);
            this.tSetor.setEnabled(false);
        } else {
            this.tCnh.setEnabled(false);
            this.tTurno.setEnabled(false);
            this.tEspecialidade.setEnabled(false);
            this.tLocal.setEnabled(false);
            this.tSetor.setEnabled(true);
        }
    }//GEN-LAST:event_cbCargoActionPerformed

    private void cbUFItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbUFItemStateChanged
        String estado = (String) evt.getItem();
        CarregarDados.carregarCidades(estado, this.cbCidade, this.estadosCidades);
    }//GEN-LAST:event_cbUFItemStateChanged

    private void tpSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpSenhaActionPerformed

    private void carregarDados() {
        cbCargo.setSelectedItem(this.funcionario.getCargo());
        tNome.setText(this.funcionario.getNome());
        tCPF.setText(this.funcionario.getCpf());
        tFone.setText(this.funcionario.getTelefone());

        tEnd.setText(this.funcionario.getEndereco());
        tNumero.setText("" + this.funcionario.getNum());
        jTextField1.setText(this.funcionario.getBairro());
        tCep.setText(this.funcionario.getCep());
        cbUF.getModel().setSelectedItem(this.funcionario.getUf());
        cbCidade.getModel().setSelectedItem(this.funcionario.getCidade());

        tSalario.setText("" + this.funcionario.getSalario());

        if (this.funcionario.getCargo().toLowerCase().equals("gerente")) {
            Gerente gerente = (Gerente) funcionario;
            tSetor.setText(gerente.getSetorResponsavel());
        } else if (this.funcionario.getCargo().toLowerCase().equals("motorista")) {
            Motorista motorista = (Motorista) funcionario;
            tCnh.setText(motorista.getCnh());
            tTurno.setText(motorista.getTurnoTrabalho());
        } else if (this.funcionario.getCargo().toLowerCase().equals("secretária")) {
            Secretaria secretaria = (Secretaria) funcionario;
            tEspecialidade.setText(secretaria.getEspecialidade());
            tLocal.setText(secretaria.getLocalAtendimento());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadastrar;
    private javax.swing.JButton bFechar;
    private javax.swing.JComboBox<String> cbCargo;
    private javax.swing.JComboBox<String> cbCidade;
    private javax.swing.JComboBox<String> cbUF;
    private javax.swing.JLabel hLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lBarirro;
    private javax.swing.JLabel lBarirro2;
    private javax.swing.JLabel lBarirro3;
    private javax.swing.JLabel lBarirro4;
    private javax.swing.JLabel lBarirro5;
    private javax.swing.JLabel lBarirro6;
    private javax.swing.JLabel lBarirro7;
    private javax.swing.JLabel lCPF;
    private javax.swing.JLabel lCargo;
    private javax.swing.JLabel lCep;
    private javax.swing.JLabel lCnh;
    private javax.swing.JLabel lComplemento;
    private javax.swing.JLabel lEnd;
    private javax.swing.JLabel lFone;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lNumero;
    private javax.swing.JLabel lSalario;
    private javax.swing.JLabel lUf;
    private javax.swing.JTextField tBairro1;
    private javax.swing.JFormattedTextField tCPF;
    private javax.swing.JFormattedTextField tCep;
    private javax.swing.JTextField tCnh;
    private javax.swing.JTextField tEnd;
    private javax.swing.JTextField tEspecialidade;
    private javax.swing.JFormattedTextField tFone;
    private javax.swing.JFormattedTextField tLocal;
    private javax.swing.JTextField tNome;
    private javax.swing.JFormattedTextField tNumero;
    private javax.swing.JTextField tSalario;
    private javax.swing.JFormattedTextField tSetor;
    private javax.swing.JTextField tTurno;
    private javax.swing.JPasswordField tpSenha;
    // End of variables declaration//GEN-END:variables
}
