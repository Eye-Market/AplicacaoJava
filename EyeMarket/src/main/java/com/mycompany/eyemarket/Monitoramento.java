/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.eyemarket;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.util.Conversor;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author dmasc
 */
public class Monitoramento extends javax.swing.JFrame {

    Looca looca = new Looca();
    Conexao connect = new Conexao();
    JdbcTemplate banco = connect.getConnection();
    Integer identificador;

    /**
     * Creates new form Monitoramento
     */
    public Monitoramento() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel16 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtTemperatura = new javax.swing.JLabel();
        txtMemoria = new javax.swing.JLabel();
        txtProcessador = new javax.swing.JLabel();
        txtArmazenamento = new javax.swing.JLabel();
        txtSO = new javax.swing.JLabel();
        txtDisco = new javax.swing.JLabel();
        txtAtividade = new javax.swing.JLabel();
        txtProcesso = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel16.setBackground(new java.awt.Color(249, 249, 249));

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(82, 41, 82));
        jLabel37.setText("Totem");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Dados da m??quina:");

        jPanel18.setBackground(new java.awt.Color(82, 41, 82));

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(240, 240, 240));
        jLabel39.setText("Armazenamento");

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(240, 240, 240));
        jLabel40.setText("Qtd Discos");

        jLabel41.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(240, 240, 240));
        jLabel41.setText("Processador");

        jLabel42.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(240, 240, 240));
        jLabel42.setText("Mem??ria RAM");

        jLabel43.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(240, 240, 240));
        jLabel43.setText("Tempertura");

        jLabel44.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(240, 240, 240));
        jLabel44.setText("Atividade");

        jLabel45.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(240, 240, 240));
        jLabel45.setText("Sist Operacional");

        jLabel46.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(240, 240, 240));
        jLabel46.setText("Qtd Processos");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addComponent(jLabel44)
                    .addComponent(jLabel39)
                    .addComponent(jLabel43)
                    .addComponent(jLabel42)
                    .addComponent(jLabel41)
                    .addComponent(jLabel40)
                    .addComponent(jLabel45))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addGap(32, 32, 32)
                .addComponent(jLabel41)
                .addGap(29, 29, 29)
                .addComponent(jLabel39)
                .addGap(33, 33, 33)
                .addComponent(jLabel43)
                .addGap(32, 32, 32)
                .addComponent(jLabel40)
                .addGap(27, 27, 27)
                .addComponent(jLabel45)
                .addGap(30, 30, 30)
                .addComponent(jLabel44)
                .addGap(27, 27, 27)
                .addComponent(jLabel46)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        txtTemperatura.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtTemperatura.setForeground(new java.awt.Color(56, 56, 56));
        txtTemperatura.setText("--");

        txtMemoria.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtMemoria.setForeground(new java.awt.Color(56, 56, 56));
        txtMemoria.setText("--");

        txtProcessador.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtProcessador.setForeground(new java.awt.Color(56, 56, 56));
        txtProcessador.setText("--");

        txtArmazenamento.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtArmazenamento.setForeground(new java.awt.Color(56, 56, 56));
        txtArmazenamento.setText("--");

        txtSO.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtSO.setForeground(new java.awt.Color(56, 56, 56));
        txtSO.setText("--");

        txtDisco.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtDisco.setForeground(new java.awt.Color(56, 56, 56));
        txtDisco.setText("--");

        txtAtividade.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtAtividade.setForeground(new java.awt.Color(56, 56, 56));
        txtAtividade.setText("--");

        txtProcesso.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtProcesso.setForeground(new java.awt.Color(56, 56, 56));
        txtProcesso.setText("--");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTemperatura)
                    .addComponent(txtMemoria)
                    .addComponent(txtProcessador)
                    .addComponent(txtArmazenamento)
                    .addComponent(txtSO)
                    .addComponent(txtDisco)
                    .addComponent(txtAtividade)
                    .addComponent(txtProcesso))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMemoria)
                .addGap(28, 28, 28)
                .addComponent(txtProcessador)
                .addGap(34, 34, 34)
                .addComponent(txtArmazenamento)
                .addGap(29, 29, 29)
                .addComponent(txtTemperatura)
                .addGap(31, 31, 31)
                .addComponent(txtDisco)
                .addGap(31, 31, 31)
                .addComponent(txtSO)
                .addGap(26, 26, 26)
                .addComponent(txtAtividade)
                .addGap(28, 28, 28)
                .addComponent(txtProcesso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(81, 42, 81));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        txtMemoria.setText("Em uso: " + Conversor.formatarBytes(looca.getMemoria().getEmUso())
                + "     Dispon??vel: " + Conversor.formatarBytes(looca.getMemoria().getDisponivel()));
        txtProcessador.setText(looca.getProcessador().getNome());
        txtArmazenamento.setText(Conversor.formatarBytes(looca.getGrupoDeDiscos().getTamanhoTotal()));
        txtTemperatura.setText("35,2");
        txtDisco.setText(looca.getGrupoDeDiscos().getQuantidadeDeDiscos().toString());
        txtSO.setText(looca.getSistema().getSistemaOperacional());
        String tempoAtividade = "" + looca.getSistema().getTempoDeAtividade();
        txtAtividade.setText(tempoAtividade);
        txtProcesso.setText(looca.getGrupoDeProcessos().getTotalProcessos().toString());
        //NOTA: nosso  timer esta dentro do bot??o atualizar fazendo com que 
        //o insert e atualiza????o de 5 em 5 sec S?? seja fieta quando ativamos no bot??o
        // profs aconselharam a alocar ele em outro lugar para melhor usabilidade

        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override

            public void run() {
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date date = new Date();
                String dataAtual = dateFormat.format(date);

                long memorialong = looca.getMemoria().getEmUso();
                String memoria = Long.toString(memorialong);

                long memoriaDisponivellong = looca.getMemoria().getDisponivel();
                String memoriaDisponivel = Long.toString(memoriaDisponivellong);

                long grupprocessolong = looca.getGrupoDeProcessos().getTotalProcessos();
                String GrupoDeProcessos = Long.toString(grupprocessolong);

                int i = looca.getGrupoDeProcessos().getTotalProcessos();
                String processo = String.valueOf(i);

                Date ax = Date.from(looca.getSistema().getInicializado());
                String sistema = String.valueOf(ax);

                String tempoAtividade = "" + looca.getSistema().getTempoDeAtividade();

                banco.update(String.format("INSERT INTO DadosTotem VALUES('%s',%s,%s,%s,%s,%d);",
                        dataAtual, memoria, memoriaDisponivel, processo, tempoAtividade, identificador));

                
            }

        }, 0, 5000);

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Monitoramento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Monitoramento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Monitoramento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Monitoramento.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Monitoramento().setVisible(true);
            }
        });

    }

    public void setIdentificador(Integer ident) {
        identificador = ident;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JLabel txtArmazenamento;
    private javax.swing.JLabel txtAtividade;
    private javax.swing.JLabel txtDisco;
    private javax.swing.JLabel txtMemoria;
    private javax.swing.JLabel txtProcessador;
    private javax.swing.JLabel txtProcesso;
    private javax.swing.JLabel txtSO;
    private javax.swing.JLabel txtTemperatura;
    // End of variables declaration//GEN-END:variables

}
