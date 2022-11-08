package telas;

import classes.Funcionario;
import classes.Linha;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class EditRotas extends javax.swing.JFrame {

    public EditRotas() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        this.tabelaRotas.getColumnModel().getColumn(0).setMinWidth(0);
        this.tabelaRotas.getColumnModel().getColumn(0).setMaxWidth(0);

        this.tabelaRotas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.tabelaRotas.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                bRemover.setEnabled(tabelaRotas.getSelectedRow() >= 0);
                bEditar.setEnabled(tabelaRotas.getSelectedRow() >= 0);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRotas = new javax.swing.JTable();
        pBotoes = new javax.swing.JPanel();
        bFechar = new javax.swing.JButton();
        bEditar = new javax.swing.JButton();
        bRemover = new javax.swing.JButton();
        lTitulo = new javax.swing.JLabel();
        pCampo = new javax.swing.JPanel();
        lCPF = new javax.swing.JLabel();
        lCPF1 = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        tNome1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Transporte");
        setResizable(false);

        tabelaRotas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabelaRotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Ponto Inicial", "Ponto Final", "Horário de Saída"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaRotas);

        javax.swing.GroupLayout pTabelaLayout = new javax.swing.GroupLayout(pTabela);
        pTabela.setLayout(pTabelaLayout);
        pTabelaLayout.setHorizontalGroup(
            pTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pTabelaLayout.setVerticalGroup(
            pTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
        );

        bFechar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/multiply (1).png"))); // NOI18N
        bFechar.setText("Fechar");
        bFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFecharActionPerformed(evt);
            }
        });

        bEditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar-arquivo.png"))); // NOI18N
        bEditar.setText("Editar");
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });

        bRemover.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trash-bin.png"))); // NOI18N
        bRemover.setText("Remover");
        bRemover.setEnabled(false);
        bRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pBotoesLayout = new javax.swing.GroupLayout(pBotoes);
        pBotoes.setLayout(pBotoesLayout);
        pBotoesLayout.setHorizontalGroup(
            pBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bRemover)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bFechar)
                .addGap(93, 93, 93))
        );
        pBotoesLayout.setVerticalGroup(
            pBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/rota (1).png"))); // NOI18N
        lTitulo.setText("Rotas");

        lCPF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lCPF.setText("Ponto Inicial:");

        lCPF1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lCPF1.setText("Ponto Final:");

        javax.swing.GroupLayout pCampoLayout = new javax.swing.GroupLayout(pCampo);
        pCampo.setLayout(pCampoLayout);
        pCampoLayout.setHorizontalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lCPF1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        pCampoLayout.setVerticalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lCPF1)
                        .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lCPF))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pCampo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed

    }//GEN-LAST:event_bEditarActionPerformed

    private void bFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_bFecharActionPerformed

    private void bRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoverActionPerformed
        int linha = this.tabelaRotas.getSelectedRow();
        int resposta = JOptionPane.showConfirmDialog(null, "Confirma a exclusão", "Exclusão", JOptionPane.YES_NO_OPTION);
        if (linha >= 0 && resposta == 0) {
            String idRota = this.tabelaRotas.getValueAt(linha, 0).toString();
            /*for (Funcionario funcionario : this.funcionarios) {
                if (funcionario.getIdFunc().equals(idFunc)) {
                    this.funcionarios.remove(funcionario);
                    this.carregarDados();
                    break;
                }
            }*/
        }
    }//GEN-LAST:event_bRemoverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEditar;
    private javax.swing.JButton bFechar;
    private javax.swing.JButton bRemover;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lCPF;
    private javax.swing.JLabel lCPF1;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JPanel pBotoes;
    private javax.swing.JPanel pCampo;
    private javax.swing.JPanel pTabela;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextField tNome1;
    private javax.swing.JTable tabelaRotas;
    // End of variables declaration//GEN-END:variables

    /*private void carregarDados() {
        DefaultTableModel modelo = (DefaultTableModel) this.tabelaRotas.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        String cpf = this.tCPF.getText().toLowerCase();
        String nome = this.tNome.getText().toLowerCase();
        String cargo = (String) this.cbCargo.getSelectedItem();
        for (Linha linha : this.linhas) {
            if ((nome.isBlank() || funcionario.getNome().toLowerCase().contains(nome)) && (cpf.isBlank() || funcionario.getCpf().contains(cpf)) && (cargo == null || cargo.equals("Selecione") || funcionario.getCargo().contains(cargo))) {
                Object[] row = {funcionario.getIdFunc(), funcionario.getCpf(), funcionario.getNome(), funcionario.getCargo(), funcionario.getSalario(), funcionario.getUf()};
                modelo.addRow(row);
            }
        }
    }*/

}
