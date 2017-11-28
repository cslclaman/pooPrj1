package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoVendedor;
import fatec.poo.model.Pessoa;
import fatec.poo.model.Vendedor;
import java.text.DecimalFormat;
import java.text.ParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author Airton Brasil 0030481611002
 * @author Allan Flores 0030481611001
 * @author Caique Siqueira 0030481611009
 */
public class FrmVendedor extends javax.swing.JFrame {

    /**
     * Creates new form FrmVendedor
     */
    public FrmVendedor() {
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

        jLabel3 = new javax.swing.JLabel();
        ftxCPF = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbUF = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtCEP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDDD = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtComissao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSalarioBase = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Vendedor");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel3.setText("CPF");

        try {
            ftxCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setText("Nome");

        txtNome.setEnabled(false);

        jLabel5.setText("Endereço");

        txtEndereco.setEnabled(false);

        jLabel6.setText("Cidade");

        txtCidade.setEnabled(false);

        jLabel8.setText("UF");

        cmbUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        cmbUF.setEnabled(false);

        jLabel7.setText("CEP");

        txtCEP.setEnabled(false);

        jLabel9.setText("Telefone");

        txtDDD.setEnabled(false);

        txtTelefone.setEnabled(false);

        jLabel1.setText("Taxa de Comissão");

        txtComissao.setText("0,0");
        txtComissao.setEnabled(false);

        jLabel2.setText("Salário base:");

        txtSalarioBase.setText("0,00");
        txtSalarioBase.setEnabled(false);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setMnemonic('C');
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnIncluir.setMnemonic('C');
        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setMnemonic('A');
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setMnemonic('E');
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setMnemonic('S');
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)
                        .addGap(12, 12, 12)
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbUF, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ftxCPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSalarioBase, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtComissao, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnIncluir, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ftxCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(cmbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSalarioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtComissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String cpf = ftxCPF.getText().replace(".", "").replace("-", "");
        if (Pessoa.cpfValido(cpf)) {
            vendedor = daoVendedor.consultar(cpf);
            ftxCPF.setEnabled(false);
            
            txtNome.setEnabled(true);
            txtEndereco.setEnabled(true);
            txtCidade.setEnabled(true);
            txtDDD.setEnabled(true);
            txtTelefone.setEnabled(true);
            txtSalarioBase.setEnabled(true);
            txtComissao.setEnabled(true);
            txtCEP.setEnabled(true);
            cmbUF.setEnabled(true);

            btnConsultar.setEnabled(false);
            if (vendedor == null) {
                btnIncluir.setEnabled(true);
            } else {
                txtNome.setText(vendedor.getNome());
                txtEndereco.setText(vendedor.getEndereco());
                txtCidade.setText(vendedor.getCidade());
                txtDDD.setText(vendedor.getDdd());
                txtTelefone.setText(vendedor.getTelefone());
                txtSalarioBase.setText(df.format(vendedor.getSalarioBase()));
                txtComissao.setText(df.format(vendedor.getComissao()));
                txtCEP.setText(vendedor.getCep());
                cmbUF.setSelectedItem(vendedor.getUf());
                
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
            }
            txtNome.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "CPF Inválido", "Aviso", JOptionPane.WARNING_MESSAGE);
            ftxCPF.requestFocus();
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("BD1611009","dont100nha");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@apolo:1521:xe");
        daoVendedor = new DaoVendedor(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        try {
            String cpf = ftxCPF.getText().replace(".", "").replace("-", "");
            double salarioBase = df.parse(txtSalarioBase.getText()).doubleValue();
            
            vendedor = new Vendedor(cpf, txtNome.getText(), salarioBase);
            vendedor.setCep(txtCEP.getText());
            vendedor.setCidade(txtCidade.getText());
            vendedor.setComissao(Double.parseDouble(txtComissao.getText()));
            vendedor.setDdd(txtDDD.getText());
            vendedor.setEndereco(txtEndereco.getText());
            vendedor.setTelefone(txtTelefone.getText());
            vendedor.setUf(String.valueOf(cmbUF.getSelectedItem()));

            daoVendedor.inserir(vendedor);

            txtNome.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtCidade.setEnabled(false);
            txtDDD.setEnabled(false);
            txtTelefone.setEnabled(false);
            txtSalarioBase.setEnabled(false);
            txtComissao.setEnabled(false);
            txtCEP.setEnabled(false);
            cmbUF.setEnabled(false);
            
            txtNome.setText("");
            txtEndereco.setText("");
            txtCidade.setText("");
            txtDDD.setText("");
            txtTelefone.setText("");
            txtSalarioBase.setText("0,00");
            txtComissao.setText("0,0");
            txtCEP.setText("");
            cmbUF.setSelectedItem("");
            
            btnConsultar.setEnabled(true);
            btnIncluir.setEnabled(false);
            
            ftxCPF.setEnabled(true);
            ftxCPF.setText("");
            ftxCPF.setValue("");
        } catch (ParseException ex){
            JOptionPane.showMessageDialog(this, ex.toString(), "Aviso - valor inválido digitado", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.toString(), "Erro na operação", JOptionPane.ERROR_MESSAGE);
        }
        ftxCPF.requestFocus();
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(this, "Confirma Exclusão?") == JOptionPane.OK_OPTION) {
                daoVendedor.excluir(vendedor);
            }
            
            txtNome.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtCidade.setEnabled(false);
            txtDDD.setEnabled(false);
            txtTelefone.setEnabled(false);
            txtSalarioBase.setEnabled(false);
            txtComissao.setEnabled(false);
            txtCEP.setEnabled(false);
            cmbUF.setEnabled(false);
            
            txtNome.setText("");
            txtEndereco.setText("");
            txtCidade.setText("");
            txtDDD.setText("");
            txtTelefone.setText("");
            txtSalarioBase.setText("0,00");
            txtComissao.setText("0,0");
            txtCEP.setText("");
            cmbUF.setSelectedItem("");

            btnConsultar.setEnabled(true);
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            
            ftxCPF.setEnabled(true);
            ftxCPF.setText("");
            ftxCPF.setValue("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.toString(), "Erro na operação", JOptionPane.ERROR_MESSAGE);
        }
        ftxCPF.requestFocus();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(this, "Confirma Alteração?") == JOptionPane.OK_OPTION){
                vendedor.setSalarioBase(df.parse(txtSalarioBase.getText()).doubleValue());
                vendedor.setCep(txtCEP.getText());
                vendedor.setCidade(txtCidade.getText());
                vendedor.setComissao(df.parse(txtComissao.getText()).doubleValue());
                vendedor.setDdd(txtDDD.getText());
                vendedor.setEndereco(txtEndereco.getText());
                vendedor.setTelefone(txtTelefone.getText());
                vendedor.setUf(String.valueOf(cmbUF.getSelectedItem()));

                daoVendedor.alterar(vendedor);
            }

            txtNome.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtCidade.setEnabled(false);
            txtDDD.setEnabled(false);
            txtTelefone.setEnabled(false);
            txtSalarioBase.setEnabled(false);
            txtComissao.setEnabled(false);
            txtCEP.setEnabled(false);
            cmbUF.setEnabled(false);
            
            txtNome.setText("");
            txtEndereco.setText("");
            txtCidade.setText("");
            txtDDD.setText("");
            txtTelefone.setText("");
            txtSalarioBase.setText("");
            txtComissao.setText("");
            txtCEP.setText("");
            cmbUF.setSelectedItem("");
            
            btnConsultar.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            
            ftxCPF.setEnabled(true);
            ftxCPF.setText("");
            ftxCPF.setValue("");
        } catch (ParseException ex){
            JOptionPane.showMessageDialog(this, ex.toString(), "Aviso - valor inválido digitado", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.toString(), "Erro na operação", JOptionPane.ERROR_MESSAGE);
        }
        ftxCPF.requestFocus();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(FrmVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cmbUF;
    private javax.swing.JFormattedTextField ftxCPF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComissao;
    private javax.swing.JTextField txtDDD;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalarioBase;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
    private DaoVendedor daoVendedor = null;
    private Vendedor vendedor = null;
    private Conexao conexao = null;
    private DecimalFormat df = new DecimalFormat("0.00");
}
