package telas;

import classes.Linha;
import classes.Paradas;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import operacoes.CadastroLinhaOperacao;


public class CadastroRotas extends javax.swing.JFrame {
    private ArrayList<Paradas> paradas = new ArrayList<Paradas>();
    private ArrayList<Linha> linhas;
    
    public CadastroRotas(ArrayList<Linha> linhas) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.linhas = linhas;
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
        lPontoIni = new javax.swing.JLabel();
        bCadastrar = new javax.swing.JButton();
        bFechar = new javax.swing.JButton();
        tPontoFim = new javax.swing.JTextField();
        lPontoFim = new javax.swing.JLabel();
        lHoraSaida = new javax.swing.JLabel();
        tPontoIni = new javax.swing.JTextField();
        tNum = new javax.swing.JFormattedTextField();
        bParadas = new javax.swing.JButton();
        tHoraSaida = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Transporte");
        setResizable(false);

        hLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        hLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/rota (1).png"))); // NOI18N
        hLabel.setText("Cadastro de Rotas");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados das Rotas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lEnd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lEnd.setText("Logradouro:");

        lNumero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lNumero.setText("Número:");

        lBarirro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lBarirro.setText("Bairro:");

        lPontoIni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lPontoIni.setText("Ponto de Inicial:");

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

        lPontoFim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lPontoFim.setText("Ponto Final:");

        lHoraSaida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lHoraSaida.setText("Horário de Saída:");

        tNum.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        bParadas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bParadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/parada.png"))); // NOI18N
        bParadas.setText("Paradas");
        bParadas.setToolTipText("");
        bParadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bParadasActionPerformed(evt);
            }
        });

        try {
            tHoraSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lPontoIni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tPontoIni, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lPontoFim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tPontoFim, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lHoraSaida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lEnd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tNum, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lBarirro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tBairro)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bParadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPontoIni)
                    .addComponent(tPontoFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lPontoFim)
                    .addComponent(lHoraSaida)
                    .addComponent(tPontoIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEnd)
                    .addComponent(tEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNumero)
                    .addComponent(tNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lBarirro)
                    .addComponent(tBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bParadas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
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
       try {
            CadastroLinhaOperacao.cadastroLinha(this.paradas, linhas, tPontoIni.getText(), tPontoFim.getText(), tEnd.getText(),Integer.parseInt(tNum.getText()),tBairro.getText(),tHoraSaida.getText());
        } catch (ParseException ex) {
            Logger.getLogger(CadastroRotas.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_bCadastrarActionPerformed

    private void bFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_bFecharActionPerformed

    private void bParadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bParadasActionPerformed
        new AddParadas(this.paradas);
    }//GEN-LAST:event_bParadasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadastrar;
    private javax.swing.JButton bFechar;
    private javax.swing.JButton bParadas;
    private javax.swing.JLabel hLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lBarirro;
    private javax.swing.JLabel lEnd;
    private javax.swing.JLabel lHoraSaida;
    private javax.swing.JLabel lNumero;
    private javax.swing.JLabel lPontoFim;
    private javax.swing.JLabel lPontoIni;
    private javax.swing.JTextField tBairro;
    private javax.swing.JTextField tEnd;
    private javax.swing.JFormattedTextField tHoraSaida;
    private javax.swing.JFormattedTextField tNum;
    private javax.swing.JTextField tPontoFim;
    private javax.swing.JTextField tPontoIni;
    // End of variables declaration//GEN-END:variables
}
