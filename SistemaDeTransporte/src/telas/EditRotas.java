package telas;

import classes.Linha;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class EditRotas extends javax.swing.JFrame {
    private ArrayList<Linha> linhas;
    public EditRotas(ArrayList<Linha> linhas) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.linhas = linhas;
        
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
        carregarDados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pTabela = new javax.swing.JPanel();
        pBotoes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRotas = new javax.swing.JTable();
        lTitulo = new javax.swing.JLabel();
        pCampo = new javax.swing.JPanel();
        lPontoIni = new javax.swing.JLabel();
        lPontoFim = new javax.swing.JLabel();
        tPontoFim = new javax.swing.JTextField();
        tPontoIni = new javax.swing.JTextField();
        bFechar = new javax.swing.JButton();
        bEditar = new javax.swing.JButton();
        bRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Transporte");
        setResizable(false);

        javax.swing.GroupLayout pTabelaLayout = new javax.swing.GroupLayout(pTabela);
        pTabela.setLayout(pTabelaLayout);
        pTabelaLayout.setHorizontalGroup(
            pTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pTabelaLayout.setVerticalGroup(
            pTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pBotoes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

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

        javax.swing.GroupLayout pBotoesLayout = new javax.swing.GroupLayout(pBotoes);
        pBotoes.setLayout(pBotoesLayout);
        pBotoesLayout.setHorizontalGroup(
            pBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pBotoesLayout.setVerticalGroup(
            pBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addContainerGap())
        );

        lTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/rota (1).png"))); // NOI18N
        lTitulo.setText("Rotas");

        pCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro"));

        lPontoIni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lPontoIni.setText("Ponto Inicial:");

        lPontoFim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lPontoFim.setText("Ponto Final:");

        tPontoFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPontoFimActionPerformed(evt);
            }
        });
        tPontoFim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tPontoFimKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tPontoFimKeyReleased(evt);
            }
        });

        tPontoIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPontoIniActionPerformed(evt);
            }
        });
        tPontoIni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tPontoIniKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tPontoIniKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pCampoLayout = new javax.swing.GroupLayout(pCampo);
        pCampo.setLayout(pCampoLayout);
        pCampoLayout.setHorizontalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lPontoIni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tPontoIni, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lPontoFim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tPontoFim, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        pCampoLayout.setVerticalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lPontoFim)
                        .addComponent(tPontoFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tPontoIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lPontoIni))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(pTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 570, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bRemover)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bFechar)
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(438, 438, 438))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void tPontoIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPontoIniActionPerformed
        carregarDados();
    }//GEN-LAST:event_tPontoIniActionPerformed

    private void tPontoFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPontoFimActionPerformed
        carregarDados();
    }//GEN-LAST:event_tPontoFimActionPerformed

    private void tPontoIniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPontoIniKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPontoIniKeyPressed

    private void tPontoFimKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPontoFimKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPontoFimKeyPressed

    private void tPontoIniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPontoIniKeyReleased
        // TODO add your handling code here:
        carregarDados();
    }//GEN-LAST:event_tPontoIniKeyReleased

    private void tPontoFimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPontoFimKeyReleased
        // TODO add your handling code here:
        carregarDados();
    }//GEN-LAST:event_tPontoFimKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEditar;
    private javax.swing.JButton bFechar;
    private javax.swing.JButton bRemover;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lPontoFim;
    private javax.swing.JLabel lPontoIni;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JPanel pBotoes;
    private javax.swing.JPanel pCampo;
    private javax.swing.JPanel pTabela;
    private javax.swing.JTextField tPontoFim;
    private javax.swing.JTextField tPontoIni;
    private javax.swing.JTable tabelaRotas;
    // End of variables declaration//GEN-END:variables

    private void carregarDados() {
        DefaultTableModel modelo = (DefaultTableModel) this.tabelaRotas.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        String pontoIni = this.tPontoIni.getText().toLowerCase();
        String pontoFim = this.tPontoFim.getText().toLowerCase();
        System.out.println(this.linhas.isEmpty());
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        for (Linha linha : this.linhas) {
            
            if ((pontoIni.isEmpty() || linha.getPontoInicial().toLowerCase().contains(pontoIni))
                    && (pontoFim.isEmpty()|| linha.getPontoFinal().toLowerCase().contains(pontoFim))) {
                Object[] row = {linha.getIdLinha(), linha.getPontoInicial(), linha.getPontoFinal(), formatter.format(linha.getHorario())};
                modelo.addRow(row);
            }
        }
    }

}
