package agendaanimal;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Descricao extends javax.swing.JFrame
{
    int navega = 0;
    ConectarBanco con_Descricao;
   
    public Descricao() 
    {
        initComponents();
        con_Descricao=new ConectarBanco();
        con_Descricao.conectar();
        con_Descricao.executeSQL("select * from descricoes"); 
        
        try
        {
             con_Descricao.rs.first();
             mostrar();
             
             if(txbCodigo==null)
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

        jPanel2 = new javax.swing.JPanel();
        txbPesquisa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        vfbgh = new javax.swing.JLabel();
        tbx_Descricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txbCodigo = new javax.swing.JTextField();
        btnVoltar1 = new javax.swing.JButton();
        btnVoltarTudo1 = new javax.swing.JButton();
        btnAvancarTudo1 = new javax.swing.JButton();
        btnAvancar1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tbxValor = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        xcv = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txbPesquisa.setToolTipText("nome do serviço");
        txbPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbPesquisaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Pesquisar.:");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Cadastro de Serviços");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        vfbgh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        vfbgh.setText("Codigo.:");

        tbx_Descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbx_DescricaoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Serviço.:");

        txbCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbCodigoActionPerformed(evt);
            }
        });

        btnVoltar1.setText("<");
        btnVoltar1.setToolTipText("Vai para o registro Anterior");
        btnVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar1ActionPerformed(evt);
            }
        });

        btnVoltarTudo1.setText("<<");
        btnVoltarTudo1.setToolTipText("Vai para o primeiro registro");
        btnVoltarTudo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarTudo1ActionPerformed(evt);
            }
        });

        btnAvancarTudo1.setText(">>");
        btnAvancarTudo1.setToolTipText("Vai para o Ultimo Registro");
        btnAvancarTudo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarTudo1ActionPerformed(evt);
            }
        });

        btnAvancar1.setText(">");
        btnAvancar1.setToolTipText("Vai para o próximo Registro");
        btnAvancar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancar1ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addGap(38, 38, 38)
                .addComponent(jButton6)
                .addGap(28, 28, 28)
                .addComponent(jButton5)
                .addGap(61, 61, 61))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Valor.:");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        xcv.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout xcvLayout = new javax.swing.GroupLayout(xcv);
        xcv.setLayout(xcvLayout);
        xcvLayout.setHorizontalGroup(
            xcvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );
        xcvLayout.setVerticalGroup(
            xcvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnVoltarTudo1)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar1)
                .addGap(18, 18, 18)
                .addComponent(btnAvancar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAvancarTudo1))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tbxValor, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(vfbgh))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbx_Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(xcv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vfbgh)
                    .addComponent(txbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tbx_Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tbxValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltarTudo1)
                    .addComponent(btnVoltar1)
                    .addComponent(btnAvancar1)
                    .addComponent(btnAvancarTudo1))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(xcv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txbPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbPesquisaActionPerformed
        try
        {
            con_Descricao.rs.first();
            String igual = "n";
            int tamanho_pesquisa = txbPesquisa.getText().length();

            while(igual=="n")
            {
                String Pesquisado= con_Descricao.rs.getString("Descricao").substring(0,(tamanho_pesquisa));

                if(Pesquisado.equals(txbPesquisa.getText()))
                {
                    igual="s";
                }
                else
                con_Descricao.rs.next();
            }
            tbx_Descricao.setText(con_Descricao.rs.getString("Descricao"));
            mostrar();
        }
        catch(Exception erro)
        {
            JOptionPane.showMessageDialog(null,"Não foi possível localizar");
        }
    }//GEN-LAST:event_txbPesquisaActionPerformed

    private void tbx_DescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbx_DescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbx_DescricaoActionPerformed

    private void txbCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txbCodigoActionPerformed

    private void btnVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar1ActionPerformed
        try
        {
            navega = 1;
            con_Descricao.rs.previous();
            mostrar();

        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Voçê já está no primeiro registro");
        }
    }//GEN-LAST:event_btnVoltar1ActionPerformed

    private void btnVoltarTudo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarTudo1ActionPerformed
        try
        {
            con_Descricao.rs.first();
            mostrar();
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Voçê já está no primeiro registro ");
        }
    }//GEN-LAST:event_btnVoltarTudo1ActionPerformed

    private void btnAvancarTudo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarTudo1ActionPerformed
        try
        {
            con_Descricao.rs.last();
            mostrar();
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Voçê já está no ultimo registro");
        }
    }//GEN-LAST:event_btnAvancarTudo1ActionPerformed

    private void btnAvancar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancar1ActionPerformed
        try
        {
            navega = 2;
            con_Descricao.rs.next();
            mostrar();
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Voçê já está no ultimo registro");
        }
    }//GEN-LAST:event_btnAvancar1ActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        limpar_dados();
        txbCodigo.setEditable(false);
        limpar_dados();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if ((tbx_Descricao.getText().isEmpty()))
        {
            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
        }
        else{
            try
            {
                String sqlInsert = "INSERT INTO descricoes(Descricao,valor) VALUES('"+
                tbx_Descricao.getText()+"','"+tbxValor.getText()+"')";
               
            con_Descricao.stm.executeUpdate(sqlInsert);
            JOptionPane.showMessageDialog(null,"Gravação realizada com sucesso");
            
            con_Descricao.rs= con_Descricao.stm.executeQuery("Select * from descricoes");
            con_Descricao.rs.next();
            mostrar();

        } catch (SQLException u)
        {
            throw new RuntimeException(u);
        }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try
        {
            String sql= "UPDATE descricoes SET Descricao='"+tbx_Descricao.getText()+"',"+"valor='"+tbxValor.getText()+"' Where idDescricao =" +txbCodigo.getText();
           
            
            con_Descricao.stm.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Alteração realizada com sucesso");

            con_Descricao.executeSQL("Select * from descricoes");
            con_Descricao.rs.next();
            mostrar();
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro a tentar alterar registro...");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try
        {
            String sql= "Select * from descricoes where idDescricao = "+ txbCodigo.getText();
            con_Descricao.executeSQL(sql);
            con_Descricao.rs.first();

            String nome = "Deletar o Serviço: " +con_Descricao.rs.getString("Descricao");

            int opcao_escolhida = JOptionPane.showConfirmDialog(null, nome,"Exclusão",JOptionPane.YES_NO_OPTION);
            if(opcao_escolhida == JOptionPane.YES_OPTION)
            {
                sql = "Delete From descricoes Where idDescricao="+txbCodigo.getText();
                int conseguiu_excluir = con_Descricao.stm.executeUpdate(sql);
                if(conseguiu_excluir == 1)
                {
                    JOptionPane.showMessageDialog(null,"Exclusão realizada com sucesso");
                    con_Descricao.executeSQL("Select * from descricoes");
                    con_Descricao.rs.first();
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
            java.util.logging.Logger.getLogger(Descricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Descricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Descricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Descricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Descricao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvancar1;
    private javax.swing.JButton btnAvancarTudo1;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar1;
    private javax.swing.JButton btnVoltarTudo1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField tbxValor;
    private javax.swing.JTextField tbx_Descricao;
    private javax.swing.JTextField txbCodigo;
    private javax.swing.JTextField txbPesquisa;
    private javax.swing.JLabel vfbgh;
    private javax.swing.JPanel xcv;
    // End of variables declaration//GEN-END:variables
 
    public void limpar_dados()
        {
            tbx_Descricao.setText("");
            txbCodigo.setText("");
            tbxValor.setText("");
        }
       
    public void mostrar()
    {
        try
        {
        tbx_Descricao.setText(con_Descricao.rs.getString("Descricao"));
        txbCodigo.setText(con_Descricao.rs.getString("idDescricao"));
        tbxValor.setText(con_Descricao.rs.getString("valor"));
        txbCodigo.setEditable(false);
        }
        catch(SQLException erro)
        {
            if(navega == 1)
            {
              JOptionPane.showMessageDialog(null,"você já está no primeiro registro");
              navega = 0;
            }
            else{
                 if(navega == 2)
                 {
                     JOptionPane.showMessageDialog(null,"você já está no ultimo registro");
                     navega = 0;
                 }
                  
            }    
        }
}

}
