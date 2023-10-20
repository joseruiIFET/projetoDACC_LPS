/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifcoder.projetodacc_lps.view;

/**
 *
 * @author jose
 */
public class FrMenuPrincipal extends javax.swing.JFrame {

    public FrMenuPrincipal() {
        initComponents();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenuPrincipal = new javax.swing.JLabel();
        btnCadAluno = new javax.swing.JButton();
        btnCadProfessor = new javax.swing.JButton();
        btnCadFuncionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMenuPrincipal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblMenuPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuPrincipal.setText("Menu Principal");

        btnCadAluno.setText("Cadastro Aluno (BD sqlite)");
        btnCadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadAlunoActionPerformed(evt);
            }
        });

        btnCadProfessor.setText("Cadastro Professor (arquivo txt)");
        btnCadProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadProfessorActionPerformed(evt);
            }
        });

        btnCadFuncionario.setText("Cadastro Funcionario (JPA)");
        btnCadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
            .addComponent(btnCadAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCadProfessor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCadFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadProfessorActionPerformed
        FrProfessor dlgCadProfessor = new FrProfessor(this, true);
        
        // Configura o posicionamento relativo, faz o dialgo aparecer na mesma tela que o pai(qdo estamos mais de uma tela)
        dlgCadProfessor.setLocationRelativeTo(this);
        dlgCadProfessor.setVisible(true);
        
        /* Usando JFrame.
        Esta forma não é legal, dado que temos mais de uma aplicacao na barra de tarefas. 
        Dê preferencia por fazer a dinamica de telas usando JDialog como acima.
       
        FrProfessor telaProfessor = new FrProfessor(this);
        telaProfessor.setVisible(true);
        this.setVisible(false);
        */
    }//GEN-LAST:event_btnCadProfessorActionPerformed

    private void btnCadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadAlunoActionPerformed
        FrAluno dlgCadAluno = new FrAluno(this, true);
        
        // Configura o posicionamento relativo, faz o dialgo aparecer na mesma tela que o pai(qdo estamos mais de uma tela)
        dlgCadAluno.setLocationRelativeTo(this);
        dlgCadAluno.setVisible(true);
        
        
        /* Usando JFrame.
        Esta forma não é legal, dado que temos mais de uma aplicacao na barra de tarefas. 
        Dê preferencia por fazer a dinamica de telas usando JDialog como acima.
        
        FrAluno telaAluno = new FrAluno(this);
        telaAluno.setVisible(true);
        this.setVisible(false);
        */
        
    }//GEN-LAST:event_btnCadAlunoActionPerformed

    private void btnCadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadFuncionarioActionPerformed
        FrFuncionario dlgCadFuncionario = new FrFuncionario(this, true);
        
        // Configura o posicionamento relativo, faz o dialgo aparecer na mesma tela que o pai(qdo estamos mais de uma tela)
        dlgCadFuncionario.setLocationRelativeTo(this);
        dlgCadFuncionario.setVisible(true);
        
        /* Usando JFrame.
        Esta forma não é legal, dado que temos mais de uma aplicacao na barra de tarefas. 
        Dê preferencia por fazer a dinamica de telas usando JDialog como acima.
       
        FrFuncionario telaFuncionario = new FrFuncionario(this);
        telaFuncionario.setVisible(true);
        this.setVisible(false);
        */
    }//GEN-LAST:event_btnCadFuncionarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadAluno;
    private javax.swing.JButton btnCadFuncionario;
    private javax.swing.JButton btnCadProfessor;
    private javax.swing.JLabel lblMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}