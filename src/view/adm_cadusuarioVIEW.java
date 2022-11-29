/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.admDAO;
import dto.adm_cadusuarioDTO;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nanabe
 */
public class adm_cadusuarioVIEW extends javax.swing.JFrame {

    /**
     * Creates new form adm_cadfornecedorVIEW
     */
    public adm_cadusuarioVIEW() {
        initComponents();
        setLocationRelativeTo(null);
        txtId.setVisible(false);
        dadosComboBox();
        listarUsuario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_cadusuario = new javax.swing.JLabel();
        jPanel_dados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        cbxCargo = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JTextField();
        jPanel_login = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnCadastrar = new javax.swing.JButton();
        btncarregarCampo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" ");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_cadusuario.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabel_cadusuario.setForeground(new java.awt.Color(244, 249, 252));
        jLabel_cadusuario.setText("Cadastro de Usuário");
        getContentPane().add(jLabel_cadusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, 40));

        jPanel_dados.setBackground(new java.awt.Color(255, 251, 251));
        jPanel_dados.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel_dados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nome");
        jPanel_dados.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Cpf");
        jPanel_dados.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Endereço");
        jPanel_dados.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Telefone");
        jPanel_dados.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Cargo");
        jPanel_dados.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        jPanel_dados.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 250, 25));
        jPanel_dados.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 250, 25));
        jPanel_dados.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 250, 25));
        jPanel_dados.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 250, 25));

        cbxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jPanel_dados.add(cbxCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 130, 25));

        txtId.setEditable(false);
        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_dados.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 40, -1));

        getContentPane().add(jPanel_dados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 300, 290));

        jPanel_login.setBackground(new java.awt.Color(255, 251, 251));
        jPanel_login.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Usuario");
        jPanel_login.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel_login.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 250, 25));

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Senha");
        jPanel_login.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        jPanel_login.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 250, 25));

        getContentPane().add(jPanel_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 300, 140));

        btnCadastrar.setText("Salvar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 90, 35));

        btncarregarCampo.setText("Carregar Campos");
        btncarregarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncarregarCampoActionPerformed(evt);
            }
        });
        getContentPane().add(btncarregarCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(805, 520, -1, 35));

        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "CPF", "ENDEREÇO", "TELEFONE", "CARGO", "USUARIO", "SENHA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaUsuario);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 580, 430));

        btnAlterar.setText("Editar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 520, 90, 35));

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 90, 35));

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 90, 35));

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 560, 90, 35));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        cadastrarUsuario();
        limparCampos();
        listarUsuario();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btncarregarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncarregarCampoActionPerformed
        carregarCampos();
    }//GEN-LAST:event_btncarregarCampoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alterarDados();
        limparCampos();
        listarUsuario();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        deletarDados();
        limparCampos();
        listarUsuario();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(adm_cadusuarioVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adm_cadusuarioVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adm_cadusuarioVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adm_cadusuarioVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adm_cadusuarioVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btncarregarCampo;
    private javax.swing.JComboBox<String> cbxCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_cadusuario;
    private javax.swing.JPanel jPanel_dados;
    private javax.swing.JPanel jPanel_login;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaUsuario;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void cadastrarUsuario() {
        
        String nome, cpf, endereco, telefone, usuario, senha;
        int fkcargo;
        
        nome = txtNome.getText();
        cpf = txtCpf.getText();
        endereco = txtEndereco.getText();
        telefone = txtTelefone.getText();
        fkcargo = id_cargo.get(cbxCargo.getSelectedIndex() - 1);
        usuario = txtUsuario.getText();
        senha = txtSenha.getText();
        
        adm_cadusuarioDTO objcadusuariodto = new adm_cadusuarioDTO();
        
        objcadusuariodto.setNome(nome);
        objcadusuariodto.setCpf(cpf);
        objcadusuariodto.setEndereco(endereco);
        objcadusuariodto.setTelefone(telefone);
        objcadusuariodto.setFkcargo(fkcargo);
        objcadusuariodto.setUsuario(usuario);
        objcadusuariodto.setSenha(senha);
        
        admDAO objadmdao = new admDAO();
        objadmdao.cadusuarioDAO(objcadusuariodto);
        
    }
    
    Vector<Integer> id_cargo = new Vector<Integer>();

    private void dadosComboBox() {
        
        try {
            
            admDAO objadmdao = new admDAO();
            ResultSet rs = objadmdao.listarCargo();
            
            while (rs.next()) {
                
                id_cargo.addElement(rs.getInt(1));
                cbxCargo.addItem(rs.getString(2));
                
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "adm_cadusuarioVIEW - dadosComboBox: " + erro);
        }
        
    }
    
    private void limparCampos() {
        txtId.setText("");
        txtNome.setText("");
        txtCpf.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        cbxCargo.setSelectedIndex(0);
        txtUsuario.setText("");
        txtSenha.setText("");
        txtNome.requestFocus();
    }
    
    private void listarUsuario() {
        
        try {
            
            admDAO objadmdao = new admDAO();
            
            DefaultTableModel model = (DefaultTableModel) tabelaUsuario.getModel();
            model.setNumRows(0);
            
            ArrayList<adm_cadusuarioDTO> lista = objadmdao.pesquisarUsuario();
            
            for (int num = 0; num < lista.size(); num++) {
                
                model.addRow(new Object[]{
                    lista.get(num).getId_usuario(),
                    lista.get(num).getNome(),
                    lista.get(num).getCpf(),
                    lista.get(num).getEndereco(),
                    lista.get(num).getTelefone(),
                    lista.get(num).getFkcargo(),
                    lista.get(num).getUsuario(),
                    lista.get(num).getSenha(),
                    lista.get(num).getFkcargo()
                });
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "adm_cadusuarioVIEW - listarUsuario: " + erro);
        }
    }
    
    private void alterarDados() {
        
        String nome_usuario, cpf_usuario, endereco_usuario, telefone_usuario, login_usuario, login_senha;
        int fk_cargo, id_usuario;
        
        id_usuario = Integer.parseInt(txtId.getText());
        nome_usuario = txtNome.getText();
        cpf_usuario = txtCpf.getText();
        endereco_usuario = txtEndereco.getText();
        telefone_usuario = txtTelefone.getText();
        login_usuario = txtUsuario.getText();
        login_senha = txtSenha.getText();
        fk_cargo = id_cargo.get(cbxCargo.getSelectedIndex() - 1);
        
        adm_cadusuarioDTO objcadusuariodto = new adm_cadusuarioDTO();
        objcadusuariodto.setId_usuario(id_usuario);
        objcadusuariodto.setNome(nome_usuario);
        objcadusuariodto.setCpf(cpf_usuario);
        objcadusuariodto.setEndereco(endereco_usuario);
        objcadusuariodto.setTelefone(telefone_usuario);
        objcadusuariodto.setUsuario(cpf_usuario);
        objcadusuariodto.setUsuario(login_usuario);
        objcadusuariodto.setSenha(login_senha);
        objcadusuariodto.setFkcargo(fk_cargo);
        
        admDAO objadmdao = new admDAO();
        objadmdao.alterarUsuario(objcadusuariodto);
    }
    
    private void carregarCampos() {
        
        int setar = tabelaUsuario.getSelectedRow();
        
        
        txtId.setText(tabelaUsuario.getModel().getValueAt(setar, 0).toString());
        txtNome.setText(tabelaUsuario.getModel().getValueAt(setar, 1).toString());
        txtCpf.setText(tabelaUsuario.getModel().getValueAt(setar, 2).toString());
        txtEndereco.setText(tabelaUsuario.getModel().getValueAt(setar, 3).toString());
        txtTelefone.setText(tabelaUsuario.getModel().getValueAt(setar, 4).toString());
        String cargo = (tabelaUsuario.getModel().getValueAt(setar, 5).toString());        
        cbxCargo.setSelectedIndex(Integer.parseInt(cargo));
        txtUsuario.setText(tabelaUsuario.getModel().getValueAt(setar, 6).toString());
        txtSenha.setText(tabelaUsuario.getModel().getValueAt(setar, 7).toString());
        
    }
    
    private void deletarDados() {
        
        int id_usuario;
        
        id_usuario = Integer.parseInt(txtId.getText());
        
        adm_cadusuarioDTO objcadusuariodto = new adm_cadusuarioDTO();
        objcadusuariodto.setId_usuario(id_usuario);
        
        admDAO objadmdao = new admDAO();
        objadmdao.deletarUsuario(objcadusuariodto);
        
    }
    
}