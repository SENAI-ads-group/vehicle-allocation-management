package ui.panels;

import java.util.Map;
import java.util.Set;
import model.entidades.PessoaJuridica;
import model.exceptions.ValidationException;
import util.Utilities;

/**
 *
 * @author Patrick-Ribeiro
 */
public class PanelFormPessoaJuridica extends javax.swing.JPanel {
    
    private PessoaJuridica pessoa;
    
    public PanelFormPessoaJuridica(PessoaJuridica pessoa) {
        initComponents();
        this.pessoa = pessoa;
    }
    
    public void setPessoa(PessoaJuridica pessoa) {
        this.pessoa = pessoa;
    }
    
    public void updateFormData() {
        if (pessoa != null) {
            textFieldNome.setText(pessoa.getNome());
            textFieldEmail.setText(pessoa.getEmail());
            textFieldCNPJ.setText(pessoa.getCnpj());
            textFieldTelefone.setText(pessoa.getTelefone());
            textFieldInscricaoEstadual.setText(pessoa.getInscricaoEstadual());
            textFieldRazaoSocial.setText(pessoa.getTelefone());
        }
    }
    
    public PessoaJuridica getFormData() throws ValidationException {
        if (pessoa == null) {
            pessoa = new PessoaJuridica();
        }
        ValidationException exception = new ValidationException(getClass().getSimpleName());
        if (Utilities.textFieldIsEmpty(textFieldNome)) {
            exception.addError("nome", "Nome fantasia não informado");
        }
        if (Utilities.textFieldIsEmpty(textFieldCNPJ)) {
            exception.addError("CNPJ", "CNPJ não informado");
        }
        if (Utilities.textFieldIsEmpty(textFieldInscricaoEstadual)) {
            exception.addError("IE", "IE não informada");
        }
        if (Utilities.textFieldIsEmpty(textFieldTelefone)) {
            exception.addError("telefone", "Telefone não informado");
        }
        if (Utilities.textFieldIsEmpty(textFieldRazaoSocial)) {
            exception.addError("razaoSocial", "Razão social não informada");
        }
        pessoa.setNome(textFieldNome.getText());
        pessoa.setCnpj(textFieldCNPJ.getText());
        pessoa.setTelefone(textFieldTelefone.getText());
        pessoa.setInscricaoEstadual(textFieldInscricaoEstadual.getText());
        pessoa.setEmail(textFieldEmail.getText());
        pessoa.setRazaoSocial(textFieldRazaoSocial.getText());
        
        clearErrors();
        if (exception.getErrors().size() > 0) {
            throw exception;
        }
        return pessoa;
    }
    
    public void setErrorsMessages(Map<String, String> errors) {
        Set<String> fields = errors.keySet();
        
        if (fields.contains("nome")) {
            labelErroNome.setText(errors.get("nome"));
        }
        if (fields.contains("CNPJ")) {
            labelErroCNPJ.setText(errors.get("CNPJ"));
        }
        if (fields.contains("IE")) {
            labelErroInscricaoEstadual.setText(errors.get("IE"));
        }
        if (fields.contains("telefone")) {
            labelErroTelefone.setText(errors.get("telefone"));
        }
        if (fields.contains("razaoSocial")) {
            labelErroRazaoSocial.setText(errors.get("razaoSocial"));
        }
    }
    
    private void clearErrors() {
        labelErroNome.setText("");
        labelErroCNPJ.setText("");
        labelErroInscricaoEstadual.setText("");
        labelErroRazaoSocial.setText("");
        labelErroTelefone.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textFieldNome = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        textFieldTelefone = new javax.swing.JTextField();
        textFieldRazaoSocial = new javax.swing.JTextField();
        labelRazaoSocial = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        textFieldCNPJ = new javax.swing.JTextField();
        labelCPF = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        textFieldInscricaoEstadual = new javax.swing.JTextField();
        labelInscricaoEstadual = new javax.swing.JLabel();
        labelErroTelefone = new javax.swing.JLabel();
        labelErroNome = new javax.swing.JLabel();
        labelErroCNPJ = new javax.swing.JLabel();
        labelErroRazaoSocial = new javax.swing.JLabel();
        labelErroInscricaoEstadual = new javax.swing.JLabel();
        labelErroEmail = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(360, 280));
        setMinimumSize(new java.awt.Dimension(360, 280));
        setPreferredSize(new java.awt.Dimension(360, 280));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textFieldNome.setMaximumSize(new java.awt.Dimension(170, 25));
        textFieldNome.setMinimumSize(new java.awt.Dimension(170, 25));
        textFieldNome.setPreferredSize(new java.awt.Dimension(170, 25));
        add(textFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        labelNome.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        labelNome.setText("Nome Fantasia");
        add(labelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        textFieldTelefone.setMaximumSize(new java.awt.Dimension(170, 25));
        textFieldTelefone.setMinimumSize(new java.awt.Dimension(170, 25));
        textFieldTelefone.setName(""); // NOI18N
        textFieldTelefone.setPreferredSize(new java.awt.Dimension(170, 25));
        add(textFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        textFieldRazaoSocial.setMaximumSize(new java.awt.Dimension(170, 25));
        textFieldRazaoSocial.setMinimumSize(new java.awt.Dimension(170, 25));
        textFieldRazaoSocial.setName(""); // NOI18N
        textFieldRazaoSocial.setPreferredSize(new java.awt.Dimension(170, 25));
        add(textFieldRazaoSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        labelRazaoSocial.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        labelRazaoSocial.setText("Razão Social");
        add(labelRazaoSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        textFieldEmail.setMaximumSize(new java.awt.Dimension(170, 25));
        textFieldEmail.setMinimumSize(new java.awt.Dimension(170, 25));
        textFieldEmail.setPreferredSize(new java.awt.Dimension(170, 25));
        add(textFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        labelEmail.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        labelEmail.setText("Email");
        add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        textFieldCNPJ.setMaximumSize(new java.awt.Dimension(170, 25));
        textFieldCNPJ.setMinimumSize(new java.awt.Dimension(170, 25));
        textFieldCNPJ.setPreferredSize(new java.awt.Dimension(170, 25));
        add(textFieldCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, -1, -1));

        labelCPF.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        labelCPF.setText("CNPJ");
        add(labelCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, -1, -1));

        labelTelefone.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        labelTelefone.setText("Telefone");
        add(labelTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        textFieldInscricaoEstadual.setMaximumSize(new java.awt.Dimension(170, 25));
        textFieldInscricaoEstadual.setMinimumSize(new java.awt.Dimension(170, 25));
        textFieldInscricaoEstadual.setName(""); // NOI18N
        textFieldInscricaoEstadual.setPreferredSize(new java.awt.Dimension(170, 25));
        add(textFieldInscricaoEstadual, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 85, -1, -1));

        labelInscricaoEstadual.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        labelInscricaoEstadual.setText("Inscrição Estadual");
        add(labelInscricaoEstadual, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 65, -1, -1));

        labelErroTelefone.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        labelErroTelefone.setForeground(java.awt.Color.red);
        labelErroTelefone.setMaximumSize(new java.awt.Dimension(150, 15));
        labelErroTelefone.setMinimumSize(new java.awt.Dimension(150, 15));
        labelErroTelefone.setPreferredSize(new java.awt.Dimension(170, 15));
        add(labelErroTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 175, -1, -1));

        labelErroNome.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        labelErroNome.setForeground(java.awt.Color.red);
        labelErroNome.setMaximumSize(new java.awt.Dimension(150, 15));
        labelErroNome.setMinimumSize(new java.awt.Dimension(150, 15));
        labelErroNome.setPreferredSize(new java.awt.Dimension(150, 15));
        add(labelErroNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, 170, -1));

        labelErroCNPJ.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        labelErroCNPJ.setForeground(java.awt.Color.red);
        labelErroCNPJ.setMaximumSize(new java.awt.Dimension(150, 15));
        labelErroCNPJ.setMinimumSize(new java.awt.Dimension(150, 15));
        labelErroCNPJ.setPreferredSize(new java.awt.Dimension(150, 15));
        add(labelErroCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 170, -1));

        labelErroRazaoSocial.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        labelErroRazaoSocial.setForeground(java.awt.Color.red);
        labelErroRazaoSocial.setMaximumSize(new java.awt.Dimension(150, 15));
        labelErroRazaoSocial.setMinimumSize(new java.awt.Dimension(150, 15));
        labelErroRazaoSocial.setPreferredSize(new java.awt.Dimension(150, 15));
        add(labelErroRazaoSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 45, 170, -1));

        labelErroInscricaoEstadual.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        labelErroInscricaoEstadual.setForeground(java.awt.Color.red);
        labelErroInscricaoEstadual.setMaximumSize(new java.awt.Dimension(150, 15));
        labelErroInscricaoEstadual.setMinimumSize(new java.awt.Dimension(150, 15));
        labelErroInscricaoEstadual.setPreferredSize(new java.awt.Dimension(150, 15));
        add(labelErroInscricaoEstadual, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 170, -1));

        labelErroEmail.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        labelErroEmail.setForeground(java.awt.Color.red);
        labelErroEmail.setMaximumSize(new java.awt.Dimension(150, 15));
        labelErroEmail.setMinimumSize(new java.awt.Dimension(150, 15));
        labelErroEmail.setPreferredSize(new java.awt.Dimension(150, 15));
        add(labelErroEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 175, 170, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelErroCNPJ;
    private javax.swing.JLabel labelErroEmail;
    private javax.swing.JLabel labelErroInscricaoEstadual;
    private javax.swing.JLabel labelErroNome;
    private javax.swing.JLabel labelErroRazaoSocial;
    private javax.swing.JLabel labelErroTelefone;
    private javax.swing.JLabel labelInscricaoEstadual;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelRazaoSocial;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JTextField textFieldCNPJ;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldInscricaoEstadual;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldRazaoSocial;
    private javax.swing.JTextField textFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
