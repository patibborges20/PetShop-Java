package agendaanimal;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FrontEndCadastroAnimal extends javax.swing.JFrame
{
    ConectarBanco con_pets; // conexão referindo ao cadastro de pets
    int navega = 0; // apenas ter controle de quando chegar ao limite para passar
    public FrontEndCadastroAnimal() 
    {
        initComponents();
        con_pets=new ConectarBanco();
        con_pets.conectar();
        con_pets.executeSQL("select * from Animal"); 
       
        try
        {
             con_pets.rs.first();
             mostrar();
             
             if(tbxCodigo==null)
             {
                  btnCadastrarActionPerformed(null);
             }
        }
        catch(SQLException erro)
        {
           
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tbxDonoPet = new javax.swing.JTextField();
        tbxNomePet = new javax.swing.JTextField();
        txbRacaPet = new javax.swing.JTextField();
        btnVoltarTudo = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnAvancar = new javax.swing.JButton();
        btnAvancarTudo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txbPesquisa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        zxcv = new javax.swing.JLabel();
        tbxCodigo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Nome Do seu Pet");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nome Do seu Pet.:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Raça do seu Pet.:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Dono do Pet.:");

        tbxDonoPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbxDonoPetActionPerformed(evt);
            }
        });

        txbRacaPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbRacaPetActionPerformed(evt);
            }
        });

        btnVoltarTudo.setText("<<");
        btnVoltarTudo.setToolTipText("Vai para o primeiro registro");
        btnVoltarTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarTudoActionPerformed(evt);
            }
        });

        btnVoltar.setText("<");
        btnVoltar.setToolTipText("Vai para o registro Anterior");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnAvancar.setText(">");
        btnAvancar.setToolTipText("Vai para o próximo Registro");
        btnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarActionPerformed(evt);
            }
        });

        btnAvancarTudo.setText(">>");
        btnAvancarTudo.setToolTipText("Vai para o Ultimo Registro");
        btnAvancarTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarTudoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Cadastro de Pets");

        txbPesquisa.setToolTipText("Procure pelo nome do pet");
        txbPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbPesquisaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Pesquisar.:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setToolTipText("clique aqui para cadastrar um novo bichinho");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("Alterar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("Excluir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnCadastrar)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addGap(40, 40, 40)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnSalvar)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        zxcv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        zxcv.setText("Código.:");

        tbxCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbxCodigoActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(tbxDonoPet, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(txbRacaPet, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(zxcv)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbxNomePet, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnVoltarTudo)
                        .addGap(18, 18, 18)
                        .addComponent(btnVoltar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAvancar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAvancarTudo)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zxcv)
                    .addComponent(tbxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tbxNomePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbRacaPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbxDonoPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltarTudo)
                    .addComponent(btnVoltar)
                    .addComponent(btnAvancar)
                    .addComponent(btnAvancarTudo))
                .addGap(24, 24, 24)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txbRacaPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbRacaPetActionPerformed

    }//GEN-LAST:event_txbRacaPetActionPerformed

    private void tbxDonoPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxDonoPetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbxDonoPetActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        
        limpar_dados();
        tbxCodigo.setEditable(false);
        limpar_dados();
        
       
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
        try
        {
        navega = 2;
        con_pets.rs.next();
        mostrar();
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Voçê já está no ultimo registro"); // ok
        }
    }//GEN-LAST:event_btnAvancarActionPerformed

    private void btnVoltarTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarTudoActionPerformed
        try
        {
        con_pets.rs.first();
        mostrar();
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Voçê já está no primeiro registro "); //ok
        }
    }//GEN-LAST:event_btnVoltarTudoActionPerformed

    private void btnAvancarTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarTudoActionPerformed
        try
        {
        con_pets.rs.last();
        mostrar();
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Voçê já está no ultimo registro"); //ok
        }
    }//GEN-LAST:event_btnAvancarTudoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        try
        {
         navega = 1;
        con_pets.rs.previous();
        mostrar();
       
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Voçê já está no primeiro registro"); //ok
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
            
        if ((tbxNomePet.getText().isEmpty()) || (tbxDonoPet.getText().isEmpty()) || (txbRacaPet.getText().isEmpty()))
        {
             JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
        }
        else{
        try 
        {
             String sqlInsert = "INSERT INTO Animal(Nome,Dono,Raca) VALUES('"+
                     tbxNomePet.getText()+"','"+
                     tbxDonoPet.getText()+"','"+
                     txbRacaPet.getText()+"')";  
           
             con_pets.stm.executeUpdate(sqlInsert);
             JOptionPane.showMessageDialog(null,"Gravação realizada com sucesso");
             
             con_pets.rs= con_pets.stm.executeQuery("Select * from Animal");
             con_pets.rs.next();
             mostrar();

        } catch (SQLException u)
        {
            throw new RuntimeException(u);
        }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
    try 
    {
        String sql= "Select * from Animal where idAnimal = "+ tbxCodigo.getText();
        con_pets.executeSQL(sql);
        con_pets.rs.first();
    
        String nome = "Deletar o Pet: " +con_pets.rs.getString("Nome");
        
        int opcao_escolhida = JOptionPane.showConfirmDialog(null, nome,"Exclusão",JOptionPane.YES_NO_OPTION);
            if(opcao_escolhida == JOptionPane.YES_OPTION)
            {
                sql = "Delete From Animal Where idAnimal="+tbxCodigo.getText();
                int conseguiu_excluir = con_pets.stm.executeUpdate(sql);
                if(conseguiu_excluir == 1)
                {
                    JOptionPane.showMessageDialog(null,"Exclusão realizada com sucesso");
                    con_pets.executeSQL("Select * from Animal");
                    con_pets.rs.first();
                    mostrar();        
                }
            }
            else
                return;
    }
    catch (SQLException ex) 
    {
       JOptionPane.showMessageDialog(null,"Erro ao tentar excluir");
    }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txbPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbPesquisaActionPerformed
         try
       {
        con_pets.rs.first();
        String igual = "n";
        int tamanho_pesquisa = txbPesquisa.getText().length();
        
        while(igual=="n")
        {
            String Pesquisado= con_pets.rs.getString("Nome").substring(0,(tamanho_pesquisa));
            
            if(Pesquisado.equals(txbPesquisa.getText()))
            {
                igual="s";
            }
            else
                con_pets.rs.next();
        }
        tbxNomePet.setText(con_pets.rs.getString("Nome"));
        mostrar();
       }
       catch(Exception erro)
       {
           JOptionPane.showMessageDialog(null,"Não foi possível localizar");
       }
    }//GEN-LAST:event_txbPesquisaActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       try
       {
           String sql= "UPDATE Animal SET Nome='"+tbxNomePet.getText()+"',"+"Dono='"+tbxDonoPet.getText()+"',"+"Raca='"+txbRacaPet.getText()+"' Where idAnimal ="+tbxCodigo.getText();
           con_pets.stm.executeUpdate(sql);
           JOptionPane.showMessageDialog(null,"Alteração realizada com sucesso");
           
           con_pets.executeSQL("Select * from Animal");
           con_pets.rs.next();
           mostrar();
       }
       catch(SQLException erro)
       {
           JOptionPane.showMessageDialog(null, "Erro a tentar alterar registro...");
       }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tbxCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbxCodigoActionPerformed

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
            java.util.logging.Logger.getLogger(FrontEndCadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrontEndCadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrontEndCadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrontEndCadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrontEndCadastroAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvancar;
    private javax.swing.JButton btnAvancarTudo;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btnVoltarTudo;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField tbxCodigo;
    private javax.swing.JTextField tbxDonoPet;
    private javax.swing.JTextField tbxNomePet;
    private javax.swing.JTextField txbPesquisa;
    private javax.swing.JTextField txbRacaPet;
    private javax.swing.JLabel zxcv;
    // End of variables declaration//GEN-END:variables
        
    public void mostrar()
    {
        try
        {
        tbxNomePet.setText(con_pets.rs.getString("Nome"));
        tbxDonoPet.setText(con_pets.rs.getString("Dono"));
        txbRacaPet.setText(con_pets.rs.getString("Raca"));
        tbxCodigo.setText(con_pets.rs.getString("idAnimal"));
        tbxCodigo.setEditable(false);
        }
        catch(SQLException erro)
        {
            if(navega == 1)
            {
              JOptionPane.showMessageDialog(null,"você já está no primeiro registro"); //ok
              navega= 0;
            }
            else{
                 if(navega == 2)
                 {
                     JOptionPane.showMessageDialog(null,"você já está no ultimo registro"); //ok
                     navega = 0;
                 }
                  
            }    
        }
}
    
      public void limpar_dados()
        {
            tbxNomePet.setText("");
            txbRacaPet.setText("");
            tbxDonoPet.setText("");
            tbxCodigo.setText("");
        }
        

}
