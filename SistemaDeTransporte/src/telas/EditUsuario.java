package telas;

import classes.Usuario;
import io.Gravador;
import io.LeitorGravadorObj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import operacoes.EditarUsuario;

public class EditUsuario extends javax.swing.JFrame {

    private ArrayList<Usuario> usuarios;
    private HashMap<String, TreeSet<String>> estadosCidades;

    public EditUsuario(ArrayList<Usuario> usuarios, HashMap<String, TreeSet<String>> estadosCidades) {
        this.usuarios = usuarios;
        this.estadosCidades = estadosCidades;

        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        this.tabelaUsuario.getColumnModel().getColumn(0).setMinWidth(0);
        this.tabelaUsuario.getColumnModel().getColumn(0).setMaxWidth(0);

        this.tabelaUsuario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.tabelaUsuario.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                bRemover.setEnabled(tabelaUsuario.getSelectedRow() >= 0);
                bEditar.setEnabled(tabelaUsuario.getSelectedRow() >= 0);
            }
        });

        this.carregarDados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        pBotoes = new javax.swing.JPanel();
        bFechar = new javax.swing.JButton();
        bEditar = new javax.swing.JButton();
        bRemover = new javax.swing.JButton();
        lTitulo = new javax.swing.JLabel();
        pCampo = new javax.swing.JPanel();
        lCPF = new javax.swing.JLabel();
        lCPF1 = new javax.swing.JLabel();
        tCPF = new javax.swing.JFormattedTextField();
        lTipo = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        tNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Transporte");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pTabela.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tabelaUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "CPF", "Nome", "Tipo", "Telefone", "UF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaUsuario);

        javax.swing.GroupLayout pTabelaLayout = new javax.swing.GroupLayout(pTabela);
        pTabela.setLayout(pTabelaLayout);
        pTabelaLayout.setHorizontalGroup(
            pTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                .addContainerGap())
        );
        pTabelaLayout.setVerticalGroup(
            pTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
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
        bEditar.setEnabled(false);
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
                .addGap(66, 66, 66))
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
        lTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente.png"))); // NOI18N
        lTitulo.setText("Usuários");

        pCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro"));

        lCPF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lCPF.setText("CPF:");

        lCPF1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lCPF1.setText("Nome:");

        try {
            tCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tCPFKeyReleased(evt);
            }
        });

        lTipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lTipo.setText("Tipo:");

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Comum", "Estudante", "Idoso" }));
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });

        tNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tNomeKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pCampoLayout = new javax.swing.GroupLayout(pCampo);
        pCampo.setLayout(pCampoLayout);
        pCampoLayout.setHorizontalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lCPF1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pCampoLayout.setVerticalGroup(
            pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCampoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCPF)
                    .addComponent(lCPF1)
                    .addComponent(lTipo)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lTitulo)
                            .addComponent(pTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        int linha = this.tabelaUsuario.getSelectedRow();
        if (linha >= 0) {
            String id = this.tabelaUsuario.getValueAt(linha, 0).toString();
            EditarUsuario.editarUsuario(usuarios, id, estadosCidades);
        }
    }//GEN-LAST:event_bEditarActionPerformed

    private void bFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFecharActionPerformed
        Gravador.gravarUsuario(new LeitorGravadorObj(), usuarios);
        this.dispose();
    }//GEN-LAST:event_bFecharActionPerformed

    private void bRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoverActionPerformed
        int linha = this.tabelaUsuario.getSelectedRow();
        int resposta = JOptionPane.showConfirmDialog(null, "Confirma a exclusão", "Exclusão", JOptionPane.YES_NO_OPTION);
        if (linha >= 0 && resposta == 0) {
            String idUser = this.tabelaUsuario.getValueAt(linha, 0).toString();
            for (Usuario usuario : this.usuarios) {
                if (usuario.getIdUser().equals(idUser)) {
                    this.usuarios.remove(usuario);
                    this.carregarDados();
                    break;
                }
            }
        }
    }//GEN-LAST:event_bRemoverActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Gravador.gravarUsuario(new LeitorGravadorObj(), usuarios);
    }//GEN-LAST:event_formWindowClosing

    private void tCPFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tCPFKeyReleased
        this.carregarDados();
    }//GEN-LAST:event_tCPFKeyReleased

    private void tNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tNomeKeyReleased
        this.carregarDados();
    }//GEN-LAST:event_tNomeKeyReleased

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        this.carregarDados();
    }//GEN-LAST:event_cbTipoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEditar;
    private javax.swing.JButton bFechar;
    private javax.swing.JButton bRemover;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lCPF;
    private javax.swing.JLabel lCPF1;
    private javax.swing.JLabel lTipo;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JPanel pBotoes;
    private javax.swing.JPanel pCampo;
    private javax.swing.JPanel pTabela;
    private javax.swing.JFormattedTextField tCPF;
    private javax.swing.JTextField tNome;
    private javax.swing.JTable tabelaUsuario;
    // End of variables declaration//GEN-END:variables

    private void carregarDados() {
        DefaultTableModel modelo = (DefaultTableModel) this.tabelaUsuario.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        /*String cpf = this.tCPF.getText().toLowerCase();
        String nome = this.tNome.getText().toLowerCase();
        String tipo = (String) this.cbTipo.getSelectedItem();*/
        for (Usuario usuario : this.usuarios) {
            //if ((nome.isBlank() || usuario.getNome().toLowerCase().contains(nome)) && (cpf.isBlank() || usuario.getCpf().contains(cpf)) && (tipo == null || tipo.equals("Selecione") || usuario.getTipo().contains(tipo))) {
            Object[] row = {usuario.getIdUser(), usuario.getCpf(), usuario.getNome(), usuario.getTipo(), usuario.getTelefone(), usuario.getEstado()};
            modelo.addRow(row);
            //}
        }
    }
}
