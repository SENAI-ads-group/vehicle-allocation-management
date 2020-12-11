package ui.paineis;

import java.awt.event.KeyEvent;
import model.servicos.persistencia.DAOFactory;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.entidades.Marca;
import model.exceptions.DBException;
import model.servicos.persistencia.interfaces.MarcaDAO;
import ui.listeners.DataChangeListener;
import util.Utilities;

/**
 *
 * @author patrick-ribeiro
 */
public final class ListagemMarcas extends javax.swing.JPanel implements DataChangeListener {

    private final MarcaDAO DAO = DAOFactory.createMarcaDAO();

    public ListagemMarcas() {
        initComponents();
    }

    public void atualizarListagem() {
        atualizarListagem(DAO.buscarTodos());
    }

    public void atualizarListagem(List<Marca> marcas) {
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        tableModel.setNumRows(0);
        for (Marca marca : marcas) {
            Object[] row = {
                marca.getId(),
                marca.getDescricao()
            };
            tableModel.addRow(row);
        }
        table.setModel(tableModel);

        if (tableModel.getRowCount() > 0) {
            table.getSelectionModel().setSelectionInterval(0, 0);
            buttonExcluir.setEnabled(true);
            buttonEditar.setEnabled(true);
        } else {
            buttonExcluir.setEnabled(false);
            buttonEditar.setEnabled(false);
        }
    }

    private void persistirEntidade(Marca marca) throws DBException {
        if (marca.getId() == null) {
            DAO.inserir(marca);
        } else {
            DAO.atualizar(marca);
        }
    }

    public void exibirFormulario(Marca marca) throws DBException {
        String descricao = String.valueOf(JOptionPane.showInputDialog(this, "Descrição", "Formulário de marcas", JOptionPane.QUESTION_MESSAGE, null, null, marca.getDescricao()));
        if (descricao != null && descricao.trim().length() > 0 && !descricao.equals("null")) {
            marca.setDescricao(descricao);
            persistirEntidade(marca);
        }
    }

    @Override
    public void onDataChanged() {
        atualizarListagem(DAO.buscarTodos());
    }

    private void pesquisar(String filtro) {
        if (filtro != null && filtro.trim().length() > 0) {
            atualizarListagem(DAO.buscar(textFieldPesquisa.getText()));
        } else {
            textFieldPesquisa.setText("");
            atualizarListagem(DAO.buscarTodos());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        buttonNovo = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        labelTitleList = new javax.swing.JLabel();
        panelPesquisa = new javax.swing.JPanel();
        buttonPesquisar = new javax.swing.JButton();
        textFieldPesquisa = new javax.swing.JTextField();
        scrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(1200, 768));
        setLayout(new java.awt.BorderLayout());

        panelHeader.setBackground(new java.awt.Color(255, 255, 255));
        panelHeader.setPreferredSize(new java.awt.Dimension(1216, 80));

        buttonNovo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        buttonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/media/icons/icon-novo-24x24.png"))); // NOI18N
        buttonNovo.setText("Novo");
        buttonNovo.setBorderPainted(false);
        buttonNovo.setFocusPainted(false);
        buttonNovo.setFocusable(false);
        buttonNovo.setPreferredSize(new java.awt.Dimension(95, 35));
        buttonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoActionPerformed(evt);
            }
        });

        buttonEditar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/media/icons/icon-editar-24x24.png"))); // NOI18N
        buttonEditar.setText("Editar");
        buttonEditar.setBorderPainted(false);
        buttonEditar.setFocusPainted(false);
        buttonEditar.setFocusable(false);
        buttonEditar.setPreferredSize(new java.awt.Dimension(95, 35));
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        buttonExcluir.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/media/icons/icon-excluir-24x24.png"))); // NOI18N
        buttonExcluir.setText("Excluir");
        buttonExcluir.setBorderPainted(false);
        buttonExcluir.setFocusPainted(false);
        buttonExcluir.setFocusable(false);
        buttonExcluir.setPreferredSize(new java.awt.Dimension(95, 35));
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });

        labelTitleList.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelTitleList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/media/icons/icon-marcas-28x28.png"))); // NOI18N
        labelTitleList.setText("Marcas de veículos");

        panelPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        panelPesquisa.setPreferredSize(new java.awt.Dimension(100, 25));
        panelPesquisa.setLayout(new java.awt.BorderLayout());

        buttonPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        buttonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/media/icons/icon-pesquisa-24x24.png"))); // NOI18N
        buttonPesquisar.setBorderPainted(false);
        buttonPesquisar.setFocusPainted(false);
        buttonPesquisar.setFocusable(false);
        buttonPesquisar.setMaximumSize(new java.awt.Dimension(40, 30));
        buttonPesquisar.setMinimumSize(new java.awt.Dimension(40, 30));
        buttonPesquisar.setPreferredSize(new java.awt.Dimension(40, 30));
        buttonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarActionPerformed(evt);
            }
        });
        panelPesquisa.add(buttonPesquisar, java.awt.BorderLayout.EAST);

        textFieldPesquisa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textFieldPesquisa.setPreferredSize(new java.awt.Dimension(200, 25));
        textFieldPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldPesquisaKeyReleased(evt);
            }
        });
        panelPesquisa.add(textFieldPesquisa, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitleList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 379, Short.MAX_VALUE)
                .addComponent(buttonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTitleList))
                    .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        add(panelHeader, java.awt.BorderLayout.PAGE_START);

        scrollPane.setFocusable(false);

        table.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        table.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 13));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setFocusable(false);
        table.setRowHeight(25);
        table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollPane.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(50);
            table.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        add(scrollPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoActionPerformed
        try {
            exibirFormulario(new Marca());
            atualizarListagem(DAO.buscarTodos());
        } catch (DBException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro ao persistir marca", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonNovoActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        Integer idSelecionado = Utilities.tryParseToInteger(table.getValueAt(table.getSelectedRow(), 0).toString());
        try {
            exibirFormulario(DAO.buscarById(idSelecionado));
            atualizarListagem(DAO.buscarTodos());
        } catch (DBException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro ao persistir marca", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        Integer idSelecionado = Utilities.tryParseToInteger(table.getValueAt(table.getSelectedRow(), 0).toString());
        try {
            int option = JOptionPane.showConfirmDialog(this, "Confirma a exclusão da marca selecionada?", "Exclusão de marca", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                DAO.excluir(idSelecionado);
                atualizarListagem(DAO.buscarTodos());
            }
        } catch (DBException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro ao excluir a marca", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void buttonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarActionPerformed
        pesquisar(textFieldPesquisa.getText());
    }//GEN-LAST:event_buttonPesquisarActionPerformed

    private void textFieldPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldPesquisaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pesquisar(textFieldPesquisa.getText());
        }
    }//GEN-LAST:event_textFieldPesquisaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonNovo;
    private javax.swing.JButton buttonPesquisar;
    private javax.swing.JLabel labelTitleList;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelPesquisa;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable table;
    private javax.swing.JTextField textFieldPesquisa;
    // End of variables declaration//GEN-END:variables
}
