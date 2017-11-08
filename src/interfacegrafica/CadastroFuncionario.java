package telasNovas;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import negocios.NFuncionario;
import projeto_hotel.Funcionario;

public class CadastroFuncionario extends javax.swing.JFrame {

    public CadastroFuncionario() {

        initComponents();

      //  this.setExtendedState(MAXIMIZED_BOTH);

    }
     JDesktopPane func = null;
    
    CadastroFuncionario(JButton jButtonCadastroHosp) {
        this();
        JDesktopPane jDesktopPane2 = null;
        func = jDesktopPane2;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jDesktopPaneCadasFunc = new javax.swing.JDesktopPane();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextFieldNomeFunc = new javax.swing.JTextField();
        jTextFieldNascGunc = new javax.swing.JTextField();
        jTextFieldCpfFunc = new javax.swing.JTextField();
        jTextFieldTelFunc = new javax.swing.JTextField();
        jTextFieldEmailFunc = new javax.swing.JTextField();
        jTextFieldPaisFunc = new javax.swing.JTextField();
        jTextFieldEsCiFunc = new javax.swing.JTextField();
        jTextFieldCepFunc = new javax.swing.JTextField();
        jTextFieldLogFunc = new javax.swing.JTextField();
        jTextFieldNumFunc = new javax.swing.JTextField();
        jTextFieldComplFunc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCargoFunc = new javax.swing.JTextField();
        jButtonSlavarFunc = new javax.swing.JButton();
        jButtonAlterarFunc = new javax.swing.JButton();
        jButtonConsultarFunc = new javax.swing.JButton();
        jButtonExcluirFunc = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPaneCadasFunc.setBackground(new java.awt.Color(255, 51, 51));
        jDesktopPaneCadasFunc.setForeground(new java.awt.Color(240, 240, 240));

        jLabel14.setBackground(new java.awt.Color(255, 51, 51));
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("Logradouro:");

        jLabel15.setBackground(new java.awt.Color(255, 51, 51));
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("Estado/Cidade:");

        jLabel16.setBackground(new java.awt.Color(255, 51, 51));
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("País:");

        jLabel17.setBackground(new java.awt.Color(255, 51, 51));
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("Número:");

        jLabel18.setBackground(new java.awt.Color(255, 51, 51));
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setText("Complemento:");

        jLabel19.setBackground(new java.awt.Color(255, 51, 51));
        jLabel19.setForeground(new java.awt.Color(240, 240, 240));
        jLabel19.setText("Nome Completo:");

        jLabel20.setBackground(new java.awt.Color(255, 51, 51));
        jLabel20.setForeground(new java.awt.Color(240, 240, 240));
        jLabel20.setText("Data/Nascimento:");

        jLabel21.setBackground(new java.awt.Color(255, 51, 51));
        jLabel21.setForeground(new java.awt.Color(240, 240, 240));
        jLabel21.setText("Telefone:");

        jLabel22.setBackground(new java.awt.Color(255, 51, 51));
        jLabel22.setForeground(new java.awt.Color(240, 240, 240));
        jLabel22.setText("CPF:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(240, 240, 240));
        jLabel23.setText("Cadastro de Funcionário:");

        jLabel24.setBackground(new java.awt.Color(255, 51, 51));
        jLabel24.setForeground(new java.awt.Color(240, 240, 240));
        jLabel24.setText("E-mail:");

        jLabel25.setBackground(new java.awt.Color(255, 51, 51));
        jLabel25.setForeground(new java.awt.Color(240, 240, 240));
        jLabel25.setText("CEP:");

        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Cargo:");

        jButtonSlavarFunc.setText("Salvar");
        jButtonSlavarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSlavarFuncActionPerformed(evt);
            }
        });

        jButtonAlterarFunc.setText("Alterar");

        jButtonConsultarFunc.setText("Consultar");

        jButtonExcluirFunc.setText("Excluir");

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Sexo:");

        jDesktopPaneCadasFunc.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jLabel23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jLabel24, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jLabel25, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jTextFieldNomeFunc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jTextFieldNascGunc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jTextFieldCpfFunc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jTextFieldTelFunc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jTextFieldEmailFunc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jTextFieldPaisFunc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jTextFieldEsCiFunc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jTextFieldCepFunc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jTextFieldLogFunc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jTextFieldNumFunc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jTextFieldComplFunc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jTextFieldCargoFunc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jButtonSlavarFunc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jButtonAlterarFunc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jButtonConsultarFunc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jButtonExcluirFunc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jButtonVoltar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCadasFunc.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPaneCadasFuncLayout = new javax.swing.GroupLayout(jDesktopPaneCadasFunc);
        jDesktopPaneCadasFunc.setLayout(jDesktopPaneCadasFuncLayout);
        jDesktopPaneCadasFuncLayout.setHorizontalGroup(
            jDesktopPaneCadasFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneCadasFuncLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jDesktopPaneCadasFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPaneCadasFuncLayout.createSequentialGroup()
                        .addGroup(jDesktopPaneCadasFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPaneCadasFuncLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(95, 95, 95)
                                .addComponent(jLabel22)
                                .addGap(121, 121, 121)
                                .addComponent(jLabel1))
                            .addGroup(jDesktopPaneCadasFuncLayout.createSequentialGroup()
                                .addGroup(jDesktopPaneCadasFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPaneCadasFuncLayout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(189, 189, 189))
                                    .addGroup(jDesktopPaneCadasFuncLayout.createSequentialGroup()
                                        .addComponent(jTextFieldNomeFunc)
                                        .addGap(33, 33, 33)))
                                .addGroup(jDesktopPaneCadasFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNascGunc, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))))
                        .addGap(55, 55, 55)
                        .addGroup(jDesktopPaneCadasFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPaneCadasFuncLayout.createSequentialGroup()
                        .addComponent(jTextFieldTelFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCpfFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jTextFieldCargoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPaneCadasFuncLayout.createSequentialGroup()
                        .addGroup(jDesktopPaneCadasFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPaneCadasFuncLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(118, 118, 118)
                                .addComponent(jLabel15)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel24))
                            .addGroup(jDesktopPaneCadasFuncLayout.createSequentialGroup()
                                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(jLabel23))
                            .addGroup(jDesktopPaneCadasFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPaneCadasFuncLayout.createSequentialGroup()
                                    .addGroup(jDesktopPaneCadasFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPaneCadasFuncLayout.createSequentialGroup()
                                            .addComponent(jButtonSlavarFunc)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonConsultarFunc)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonAlterarFunc)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonExcluirFunc))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPaneCadasFuncLayout.createSequentialGroup()
                                            .addComponent(jTextFieldLogFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextFieldComplFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(41, 41, 41)
                                            .addComponent(jTextFieldCepFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldNumFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jDesktopPaneCadasFuncLayout.createSequentialGroup()
                                    .addComponent(jTextFieldPaisFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldEsCiFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldEmailFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jDesktopPaneCadasFuncLayout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(82, 82, 82)
                                    .addComponent(jLabel18)
                                    .addGap(75, 75, 75)
                                    .addComponent(jLabel25)
                                    .addGap(106, 106, 106)
                                    .addComponent(jLabel17))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(37, 37, 37))
        );
        jDesktopPaneCadasFuncLayout.setVerticalGroup(
            jDesktopPaneCadasFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneCadasFuncLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jDesktopPaneCadasFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jButtonVoltar))
                .addGap(20, 20, 20)
                .addGroup(jDesktopPaneCadasFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel2))
                .addGap(6, 6, 6)
                .addGroup(jDesktopPaneCadasFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNascGunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jDesktopPaneCadasFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel1))
                .addGap(6, 6, 6)
                .addGroup(jDesktopPaneCadasFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldTelFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCpfFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCargoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jDesktopPaneCadasFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(4, 4, 4)
                .addGroup(jDesktopPaneCadasFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPaisFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPaneCadasFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldEsCiFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldEmailFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jDesktopPaneCadasFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18)
                    .addGroup(jDesktopPaneCadasFuncLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel25))
                    .addComponent(jLabel17))
                .addGap(4, 4, 4)
                .addGroup(jDesktopPaneCadasFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldLogFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldComplFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPaneCadasFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldCepFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldNumFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jDesktopPaneCadasFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluirFunc)
                    .addComponent(jButtonConsultarFunc)
                    .addComponent(jButtonAlterarFunc)
                    .addComponent(jButtonSlavarFunc))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneCadasFunc)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneCadasFunc)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        try {
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonSlavarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSlavarFuncActionPerformed
        try {
            Funcionario novo = new Funcionario();
            novo.setNome((jTextFieldNomeFunc.getText()));
            novo.setCPF(jTextFieldCpfFunc.getText());
            novo.setSexo(jTextField1.getText());
            novo.setdNacimento(jTextFieldNascGunc.getText());
            novo.setTelefone(jTextFieldTelFunc.getText());
            novo.setEmail(jTextFieldEmailFunc.getText());
            novo.setCargo(jTextFieldCargoFunc.getText());
            
            
            //if(!txtIdentificador.getText().isEmpty())
                //novo.setCodigo(Integer.parseInt(txtIdentificador.geText()));
                
                NFuncionario negocio = new NFuncionario();
                negocio.salvar(novo);
                
                JOptionPane.showMessageDialog(null, "Operação efetuada com sucesso!");
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage()+ " - " + e.getCause());
        }
    }//GEN-LAST:event_jButtonSlavarFuncActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterarFunc;
    private javax.swing.JButton jButtonConsultarFunc;
    private javax.swing.JButton jButtonExcluirFunc;
    private javax.swing.JButton jButtonSlavarFunc;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JDesktopPane jDesktopPaneCadasFunc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldCargoFunc;
    private javax.swing.JTextField jTextFieldCepFunc;
    private javax.swing.JTextField jTextFieldComplFunc;
    private javax.swing.JTextField jTextFieldCpfFunc;
    private javax.swing.JTextField jTextFieldEmailFunc;
    private javax.swing.JTextField jTextFieldEsCiFunc;
    private javax.swing.JTextField jTextFieldLogFunc;
    private javax.swing.JTextField jTextFieldNascGunc;
    private javax.swing.JTextField jTextFieldNomeFunc;
    private javax.swing.JTextField jTextFieldNumFunc;
    private javax.swing.JTextField jTextFieldPaisFunc;
    private javax.swing.JTextField jTextFieldTelFunc;
    // End of variables declaration//GEN-END:variables
}
