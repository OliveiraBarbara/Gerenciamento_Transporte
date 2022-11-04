package telas;

import classes.Funcionario;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import operacoes.CadastroFuncionarioOperacao;
import operacoes.CadastroUsuarioOperacao;

public class CadastroFuncionario extends javax.swing.JFrame {

    private ArrayList<Funcionario> funcionarios;
    private HashMap<String, TreeSet<String>> estadosCidades;

    public CadastroFuncionario(ArrayList<Funcionario> funcionarios, HashMap<String, TreeSet<String>> estadosCidades) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        this.estadosCidades = estadosCidades;
        this.funcionarios = funcionarios;
        
        carregarEstados();
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
        tBairro = new javax.swing.JTextField();
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
        lNome.setText("Nome Completo:");

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
        cbUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUFActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lCPF)
                        .addGap(8, 8, 8)
                        .addComponent(tCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lBarirro2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lBarirro4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lCnh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tCnh, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lBarirro3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lSalario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lEnd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tNumero))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lBarirro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lFone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tFone, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lBarirro5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCPF)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNome)
                    .addComponent(tCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCargo)
                    .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEnd)
                    .addComponent(tEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNumero)
                    .addComponent(tNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lBarirro)
                    .addComponent(tBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCep)
                    .addComponent(tCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lComplemento)
                    .addComponent(cbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lUf)
                    .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lFone)
                    .addComponent(tFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lCnh)
                            .addComponent(tCnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lBarirro3)
                                .addComponent(tEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lSalario)
                                    .addComponent(tSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lBarirro2)
                            .addComponent(tTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lBarirro4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lBarirro5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(hLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void bCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarActionPerformed
        String cidade = (String) this.cbCidade.getSelectedItem();
        String estado = (String) this.cbUF.getSelectedItem();
        String cargo = (String) this.cbCargo.getSelectedItem();
        try {
            CadastroFuncionarioOperacao.cadastroFuncionario(this.funcionarios, this.tCPF.getText(), cargo, this.tNome.getText(), Double.parseDouble(this.tSalario.getText()), 
                                this.tSetor.getText(), this.tCnh.getText(), this.tTurno.getText(), this.tEspecialidade.getText(), this.tLocal.getText());
        } catch (ParseException ex) {
            Logger.getLogger(CadastroFuncionario.class.getName()).log(Level.SEVERE, null, ex);
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
        this.carregarCidades(estado);
    }//GEN-LAST:event_cbUFItemStateChanged

    private void cbUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUFActionPerformed

    private void carregarCidades(String estado) {
        System.out.println(estado);
        this.cbCidade.removeAllItems();
        for (String cidade : this.estadosCidades.get(estado)) {
            this.cbCidade.addItem(cidade);
        }
    }

    private void carregarEstados() {
        this.cbUF.removeAllItems();
        TreeSet<String> estados = new TreeSet<String>(this.estadosCidades.keySet());
        for (String estado : estados) {
            this.cbUF.addItem(estado);
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
    private javax.swing.JLabel lBarirro;
    private javax.swing.JLabel lBarirro2;
    private javax.swing.JLabel lBarirro3;
    private javax.swing.JLabel lBarirro4;
    private javax.swing.JLabel lBarirro5;
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
    private javax.swing.JTextField tBairro;
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
    // End of variables declaration//GEN-END:variables
}
