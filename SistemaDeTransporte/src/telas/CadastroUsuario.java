package telas;

import classes.Usuario;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import operacoes.CadastroUsuarioOperacao;

public class CadastroUsuario extends javax.swing.JFrame {

    private ArrayList<Usuario> usuarios;
    private HashMap<String, TreeSet<String>> estadosCidades;

    public CadastroUsuario(ArrayList<Usuario> usuarios, HashMap<String, TreeSet<String>> estadosCidades) {
        this.usuarios = usuarios;
        this.estadosCidades = estadosCidades;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
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
        lCidade = new javax.swing.JLabel();
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
        lTipo = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        lBarirro1 = new javax.swing.JLabel();
        tValeTransporte = new javax.swing.JTextField();
        lBarirro3 = new javax.swing.JLabel();
        tLocalEstudo = new javax.swing.JTextField();
        tDataDeNasc = new javax.swing.JFormattedTextField();
        lBarirro4 = new javax.swing.JLabel();
        tMatriculaEscolar = new javax.swing.JTextField();
        lBarirro2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Transporte");
        setResizable(false);

        hLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        hLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/customer (1).png"))); // NOI18N
        hLabel.setText("Cadastro de Usuários");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Usuários", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lEnd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lEnd.setText("Logradouro:");

        lNumero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lNumero.setText("Número:");

        lBarirro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lBarirro.setText("Bairro:");

        lCidade.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lCidade.setText("Cidade:");

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

        lTipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lTipo.setText("Tipo:");

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Estudante", "Idoso" }));
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });

        lBarirro1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lBarirro1.setText("Vale Transporte:");

        tValeTransporte.setEnabled(false);

        lBarirro3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lBarirro3.setText("Local de Estudo:");

        tLocalEstudo.setEnabled(false);

        try {
            tDataDeNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tDataDeNasc.setEnabled(false);

        lBarirro4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lBarirro4.setText("Data de Nascimento:");

        tMatriculaEscolar.setEnabled(false);

        lBarirro2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lBarirro2.setText("Matricula Escolar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lBarirro1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tValeTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lBarirro3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tLocalEstudo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lBarirro2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tMatriculaEscolar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lBarirro4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tDataDeNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lBarirro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lUf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lFone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tFone, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lEnd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lCep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tCep))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tCPF)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCPF)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNome)
                    .addComponent(tCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTipo)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEnd)
                    .addComponent(tEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNumero)
                    .addComponent(tNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCep)
                    .addComponent(tCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lBarirro)
                        .addComponent(tBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lCidade)
                        .addComponent(cbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lUf)
                        .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lFone)
                        .addComponent(tFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lBarirro1)
                    .addComponent(tValeTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lBarirro3)
                    .addComponent(tLocalEstudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lBarirro2)
                    .addComponent(tMatriculaEscolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lBarirro4)
                    .addComponent(tDataDeNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addContainerGap(20, Short.MAX_VALUE))
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
        //String estado = (String) this.cbUF.getSelectedItem();
        String tipo = (String) this.cbTipo.getSelectedItem();
        try {
            CadastroUsuarioOperacao.cadastroUsuario(this.usuarios, this.tCPF.getText(), this.tNome.getText(), this.tEnd.getText(), cidade,
                    this.tFone.getText(), tipo, this.tDataDeNasc.getText(), this.tLocalEstudo.getText(), this.tMatriculaEscolar.getText(), this.tValeTransporte.getText());
        } catch (ParseException ex) {
            Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_bCadastrarActionPerformed

    private void bFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_bFecharActionPerformed

    private void cbUFItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbUFItemStateChanged
        String estado = (String) evt.getItem();
        this.carregarCidades(estado);
    }//GEN-LAST:event_cbUFItemStateChanged

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        if (cbTipo.getSelectedItem().toString().equals("Estudante")) {
            this.tMatriculaEscolar.setEnabled(true);
            this.tLocalEstudo.setEnabled(true);
            this.tDataDeNasc.setEnabled(false);
            this.tValeTransporte.setEnabled(false);
        } else if (cbTipo.getSelectedItem().toString().equals("Idoso")) {
            this.tMatriculaEscolar.setEnabled(false);
            this.tLocalEstudo.setEnabled(false);
            this.tDataDeNasc.setEnabled(true);
            this.tValeTransporte.setEnabled(false);
        } else {
            this.tMatriculaEscolar.setEnabled(false);
            this.tLocalEstudo.setEnabled(false);
            this.tDataDeNasc.setEnabled(false);
            this.tValeTransporte.setEnabled(true);
        }
    }//GEN-LAST:event_cbTipoActionPerformed

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
    private javax.swing.JComboBox<String> cbCidade;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JComboBox<String> cbUF;
    private javax.swing.JLabel hLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lBarirro;
    private javax.swing.JLabel lBarirro1;
    private javax.swing.JLabel lBarirro2;
    private javax.swing.JLabel lBarirro3;
    private javax.swing.JLabel lBarirro4;
    private javax.swing.JLabel lCPF;
    private javax.swing.JLabel lCep;
    private javax.swing.JLabel lCidade;
    private javax.swing.JLabel lEnd;
    private javax.swing.JLabel lFone;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lNumero;
    private javax.swing.JLabel lTipo;
    private javax.swing.JLabel lUf;
    private javax.swing.JTextField tBairro;
    private javax.swing.JFormattedTextField tCPF;
    private javax.swing.JFormattedTextField tCep;
    private javax.swing.JFormattedTextField tDataDeNasc;
    private javax.swing.JTextField tEnd;
    private javax.swing.JFormattedTextField tFone;
    private javax.swing.JTextField tLocalEstudo;
    private javax.swing.JTextField tMatriculaEscolar;
    private javax.swing.JTextField tNome;
    private javax.swing.JFormattedTextField tNumero;
    private javax.swing.JTextField tValeTransporte;
    // End of variables declaration//GEN-END:variables
}
