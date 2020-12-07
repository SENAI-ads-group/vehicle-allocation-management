package ui.frames;

import java.awt.Component;
import ui.dialogs.DialogConfiguracoes;
import ui.listeners.MouseListenerPanelButtonMenu;
import ui.panels.PanelCategoriaList;
import ui.panels.PanelClientesList;
import ui.panels.PanelLocacoesList;
import ui.panels.PanelMarcasList;
import ui.panels.PanelModelosList;
import ui.panels.PanelMotoristasList;
import ui.panels.PanelVeiculosList;
import util.PanelUtilities;

/**
 *
 * @author Patrick-Ribeiro
 */
public class FrameMain extends javax.swing.JFrame {

    public FrameMain() {
        initComponents();

        for (Component component : panelMenu.getComponents()) {
            component.addMouseListener(new MouseListenerPanelButtonMenu(component));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLeft = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        panelMenuItemDashboard = new javax.swing.JPanel();
        labelIconDashboard = new javax.swing.JLabel();
        labelMenuDashboard = new javax.swing.JLabel();
        panelMenuItemLocacao = new javax.swing.JPanel();
        labelIconLocacao = new javax.swing.JLabel();
        labelMenuLocacao = new javax.swing.JLabel();
        panelMenuItemClientes = new javax.swing.JPanel();
        labelIconClientes = new javax.swing.JLabel();
        labelMenuClientes = new javax.swing.JLabel();
        panelMenuItemMotoristas = new javax.swing.JPanel();
        labelIconMotoristas = new javax.swing.JLabel();
        labelMenuMotoristas = new javax.swing.JLabel();
        panelMenuItemVeiculos = new javax.swing.JPanel();
        labelIconVeiculos = new javax.swing.JLabel();
        labelMenuVeiculos = new javax.swing.JLabel();
        panelMenuItemModelos = new javax.swing.JPanel();
        labelIconModelos = new javax.swing.JLabel();
        labelMenuModelos = new javax.swing.JLabel();
        panelMenuItemMarcas = new javax.swing.JPanel();
        labelIconMarcas = new javax.swing.JLabel();
        labelMenuMarcas = new javax.swing.JLabel();
        panelMenuItemCategorias = new javax.swing.JPanel();
        labelIconCategorias = new javax.swing.JLabel();
        labelMenuCategorias = new javax.swing.JLabel();
        panelMenuItemRelatorios = new javax.swing.JPanel();
        labelIconRelatorios = new javax.swing.JLabel();
        labelMenuRelatorios = new javax.swing.JLabel();
        panelMenuItemConfiguracoes = new javax.swing.JPanel();
        labelIconConfiguracoes = new javax.swing.JLabel();
        labelMenuConfiguracoes = new javax.swing.JLabel();
        scrollPaneCenter = new javax.swing.JScrollPane();
        panelCenter = new javax.swing.JPanel();
        panelLoader = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Locação de Veículos");
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(1366, 768));

        panelLeft.setMinimumSize(new java.awt.Dimension(300, 100));
        panelLeft.setPreferredSize(new java.awt.Dimension(150, 768));
        panelLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenu.setPreferredSize(new java.awt.Dimension(150, 350));
        panelMenu.setLayout(new javax.swing.BoxLayout(panelMenu, javax.swing.BoxLayout.Y_AXIS));

        panelMenuItemDashboard.setPreferredSize(new java.awt.Dimension(150, 35));
        panelMenuItemDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMenuItemDashboardMousePressed(evt);
            }
        });
        panelMenuItemDashboard.setLayout(new java.awt.BorderLayout());

        labelIconDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIconDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/media/icons/icon-dashboard2-28x28.png"))); // NOI18N
        labelIconDashboard.setPreferredSize(new java.awt.Dimension(50, 35));
        panelMenuItemDashboard.add(labelIconDashboard, java.awt.BorderLayout.LINE_START);

        labelMenuDashboard.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMenuDashboard.setText("Dashboard");
        panelMenuItemDashboard.add(labelMenuDashboard, java.awt.BorderLayout.CENTER);

        panelMenu.add(panelMenuItemDashboard);

        panelMenuItemLocacao.setPreferredSize(new java.awt.Dimension(150, 35));
        panelMenuItemLocacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMenuItemLocacaoMousePressed(evt);
            }
        });
        panelMenuItemLocacao.setLayout(new java.awt.BorderLayout());

        labelIconLocacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIconLocacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/media/icons/icon-locacao-28x28.png"))); // NOI18N
        labelIconLocacao.setPreferredSize(new java.awt.Dimension(50, 35));
        panelMenuItemLocacao.add(labelIconLocacao, java.awt.BorderLayout.LINE_START);

        labelMenuLocacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMenuLocacao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelMenuLocacao.setText("Locação");
        panelMenuItemLocacao.add(labelMenuLocacao, java.awt.BorderLayout.CENTER);

        panelMenu.add(panelMenuItemLocacao);

        panelMenuItemClientes.setPreferredSize(new java.awt.Dimension(150, 35));
        panelMenuItemClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMenuItemClientesMousePressed(evt);
            }
        });
        panelMenuItemClientes.setLayout(new java.awt.BorderLayout());

        labelIconClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIconClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/media/icons/icon-clientes-28x28.png"))); // NOI18N
        labelIconClientes.setPreferredSize(new java.awt.Dimension(50, 35));
        panelMenuItemClientes.add(labelIconClientes, java.awt.BorderLayout.LINE_START);

        labelMenuClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMenuClientes.setText("Clientes");
        panelMenuItemClientes.add(labelMenuClientes, java.awt.BorderLayout.CENTER);

        panelMenu.add(panelMenuItemClientes);

        panelMenuItemMotoristas.setPreferredSize(new java.awt.Dimension(150, 35));
        panelMenuItemMotoristas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMenuItemMotoristasMousePressed(evt);
            }
        });
        panelMenuItemMotoristas.setLayout(new java.awt.BorderLayout());

        labelIconMotoristas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIconMotoristas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/media/icons/icon-motorista-28x28.png"))); // NOI18N
        labelIconMotoristas.setPreferredSize(new java.awt.Dimension(50, 35));
        panelMenuItemMotoristas.add(labelIconMotoristas, java.awt.BorderLayout.LINE_START);

        labelMenuMotoristas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMenuMotoristas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelMenuMotoristas.setText("Motoristas");
        panelMenuItemMotoristas.add(labelMenuMotoristas, java.awt.BorderLayout.CENTER);

        panelMenu.add(panelMenuItemMotoristas);

        panelMenuItemVeiculos.setPreferredSize(new java.awt.Dimension(150, 35));
        panelMenuItemVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMenuItemVeiculosMousePressed(evt);
            }
        });
        panelMenuItemVeiculos.setLayout(new java.awt.BorderLayout());

        labelIconVeiculos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIconVeiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/media/icons/icon-veiculo-28x28.png"))); // NOI18N
        labelIconVeiculos.setPreferredSize(new java.awt.Dimension(50, 35));
        panelMenuItemVeiculos.add(labelIconVeiculos, java.awt.BorderLayout.LINE_START);

        labelMenuVeiculos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMenuVeiculos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelMenuVeiculos.setText("Veículos");
        panelMenuItemVeiculos.add(labelMenuVeiculos, java.awt.BorderLayout.CENTER);

        panelMenu.add(panelMenuItemVeiculos);

        panelMenuItemModelos.setPreferredSize(new java.awt.Dimension(150, 35));
        panelMenuItemModelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMenuItemModelosMousePressed(evt);
            }
        });
        panelMenuItemModelos.setLayout(new java.awt.BorderLayout());

        labelIconModelos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIconModelos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/media/icons/icon-modelos-28x28.png"))); // NOI18N
        labelIconModelos.setPreferredSize(new java.awt.Dimension(50, 35));
        panelMenuItemModelos.add(labelIconModelos, java.awt.BorderLayout.LINE_START);

        labelMenuModelos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMenuModelos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelMenuModelos.setText("Modelos");
        panelMenuItemModelos.add(labelMenuModelos, java.awt.BorderLayout.CENTER);

        panelMenu.add(panelMenuItemModelos);

        panelMenuItemMarcas.setPreferredSize(new java.awt.Dimension(150, 35));
        panelMenuItemMarcas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMenuItemMarcasMousePressed(evt);
            }
        });
        panelMenuItemMarcas.setLayout(new java.awt.BorderLayout());

        labelIconMarcas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIconMarcas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/media/icons/icon-marcas-28x28.png"))); // NOI18N
        labelIconMarcas.setPreferredSize(new java.awt.Dimension(50, 35));
        panelMenuItemMarcas.add(labelIconMarcas, java.awt.BorderLayout.LINE_START);

        labelMenuMarcas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMenuMarcas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelMenuMarcas.setText("Marcas");
        panelMenuItemMarcas.add(labelMenuMarcas, java.awt.BorderLayout.CENTER);

        panelMenu.add(panelMenuItemMarcas);

        panelMenuItemCategorias.setPreferredSize(new java.awt.Dimension(150, 35));
        panelMenuItemCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMenuItemCategoriasMousePressed(evt);
            }
        });
        panelMenuItemCategorias.setLayout(new java.awt.BorderLayout());

        labelIconCategorias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIconCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/media/icons/icon-categorias-28x28.png"))); // NOI18N
        labelIconCategorias.setPreferredSize(new java.awt.Dimension(50, 35));
        panelMenuItemCategorias.add(labelIconCategorias, java.awt.BorderLayout.LINE_START);

        labelMenuCategorias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMenuCategorias.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelMenuCategorias.setText("Categorias");
        panelMenuItemCategorias.add(labelMenuCategorias, java.awt.BorderLayout.CENTER);

        panelMenu.add(panelMenuItemCategorias);

        panelMenuItemRelatorios.setPreferredSize(new java.awt.Dimension(150, 35));
        panelMenuItemRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMenuItemRelatoriosMouseClicked(evt);
            }
        });
        panelMenuItemRelatorios.setLayout(new java.awt.BorderLayout());

        labelIconRelatorios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIconRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/media/icons/icon-relatorios2-28x28.png"))); // NOI18N
        labelIconRelatorios.setPreferredSize(new java.awt.Dimension(50, 35));
        panelMenuItemRelatorios.add(labelIconRelatorios, java.awt.BorderLayout.LINE_START);

        labelMenuRelatorios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMenuRelatorios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelMenuRelatorios.setText("Relatórios");
        panelMenuItemRelatorios.add(labelMenuRelatorios, java.awt.BorderLayout.CENTER);

        panelMenu.add(panelMenuItemRelatorios);

        panelMenuItemConfiguracoes.setPreferredSize(new java.awt.Dimension(150, 35));
        panelMenuItemConfiguracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMenuItemConfiguracoesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMenuItemConfiguracoesMousePressed(evt);
            }
        });
        panelMenuItemConfiguracoes.setLayout(new java.awt.BorderLayout());

        labelIconConfiguracoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIconConfiguracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/media/icons/icon-configuracoes-28x28.png"))); // NOI18N
        labelIconConfiguracoes.setPreferredSize(new java.awt.Dimension(50, 35));
        panelMenuItemConfiguracoes.add(labelIconConfiguracoes, java.awt.BorderLayout.LINE_START);

        labelMenuConfiguracoes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMenuConfiguracoes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelMenuConfiguracoes.setText("Configurações");
        panelMenuItemConfiguracoes.add(labelMenuConfiguracoes, java.awt.BorderLayout.CENTER);

        panelMenu.add(panelMenuItemConfiguracoes);

        panelLeft.add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        getContentPane().add(panelLeft, java.awt.BorderLayout.LINE_START);

        scrollPaneCenter.setBorder(null);
        scrollPaneCenter.setFocusable(false);
        scrollPaneCenter.setRequestFocusEnabled(false);

        panelCenter.setBackground(new java.awt.Color(255, 255, 255));
        panelCenter.setPreferredSize(new java.awt.Dimension(1200, 768));
        panelCenter.setLayout(new java.awt.BorderLayout());

        panelLoader.setBackground(new java.awt.Color(255, 255, 255));
        panelLoader.setPreferredSize(new java.awt.Dimension(1200, 768));
        panelLoader.setLayout(new javax.swing.BoxLayout(panelLoader, javax.swing.BoxLayout.LINE_AXIS));
        panelCenter.add(panelLoader, java.awt.BorderLayout.CENTER);

        scrollPaneCenter.setViewportView(panelCenter);

        getContentPane().add(scrollPaneCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelMenuItemRelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuItemRelatoriosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelMenuItemRelatoriosMouseClicked

    private void panelMenuItemConfiguracoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuItemConfiguracoesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelMenuItemConfiguracoesMouseClicked

    private void panelMenuItemDashboardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuItemDashboardMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelMenuItemDashboardMousePressed

    private void panelMenuItemMotoristasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuItemMotoristasMousePressed
        PanelMotoristasList listMotoristas = new PanelMotoristasList();
        PanelUtilities.loadPanelToPanel(listMotoristas, panelLoader);
        listMotoristas.updateTable();
    }//GEN-LAST:event_panelMenuItemMotoristasMousePressed

    private void panelMenuItemClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuItemClientesMousePressed
        PanelClientesList listClientes = new PanelClientesList();
        PanelUtilities.loadPanelToPanel(listClientes, panelLoader);
        listClientes.updateTable();
    }//GEN-LAST:event_panelMenuItemClientesMousePressed

    private void panelMenuItemVeiculosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuItemVeiculosMousePressed
        PanelVeiculosList listVeiculos = new PanelVeiculosList();
        PanelUtilities.loadPanelToPanel(listVeiculos, panelLoader);
        listVeiculos.updateTable();
    }//GEN-LAST:event_panelMenuItemVeiculosMousePressed

    private void panelMenuItemModelosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuItemModelosMousePressed
        PanelModelosList listModelos = new PanelModelosList();
        PanelUtilities.loadPanelToPanel(listModelos, panelLoader);
        listModelos.updateTable();
    }//GEN-LAST:event_panelMenuItemModelosMousePressed

    private void panelMenuItemMarcasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuItemMarcasMousePressed
        PanelMarcasList listMarcas = new PanelMarcasList();
        PanelUtilities.loadPanelToPanel(listMarcas, panelLoader);
        listMarcas.updateTable();
    }//GEN-LAST:event_panelMenuItemMarcasMousePressed

    private void panelMenuItemCategoriasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuItemCategoriasMousePressed
        PanelCategoriaList listCategorias = new PanelCategoriaList();
        PanelUtilities.loadPanelToPanel(listCategorias, panelLoader);
        listCategorias.updateTable();
    }//GEN-LAST:event_panelMenuItemCategoriasMousePressed

    private void panelMenuItemLocacaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuItemLocacaoMousePressed
        PanelLocacoesList listLocacoes = new PanelLocacoesList();
        PanelUtilities.loadPanelToPanel(listLocacoes, panelLoader);
        listLocacoes.updateTable();
    }//GEN-LAST:event_panelMenuItemLocacaoMousePressed

    private void panelMenuItemConfiguracoesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuItemConfiguracoesMousePressed
        DialogConfiguracoes dialog = new DialogConfiguracoes(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_panelMenuItemConfiguracoesMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelIconCategorias;
    private javax.swing.JLabel labelIconClientes;
    private javax.swing.JLabel labelIconConfiguracoes;
    private javax.swing.JLabel labelIconDashboard;
    private javax.swing.JLabel labelIconLocacao;
    private javax.swing.JLabel labelIconMarcas;
    private javax.swing.JLabel labelIconModelos;
    private javax.swing.JLabel labelIconMotoristas;
    private javax.swing.JLabel labelIconRelatorios;
    private javax.swing.JLabel labelIconVeiculos;
    private javax.swing.JLabel labelMenuCategorias;
    private javax.swing.JLabel labelMenuClientes;
    private javax.swing.JLabel labelMenuConfiguracoes;
    private javax.swing.JLabel labelMenuDashboard;
    private javax.swing.JLabel labelMenuLocacao;
    private javax.swing.JLabel labelMenuMarcas;
    private javax.swing.JLabel labelMenuModelos;
    private javax.swing.JLabel labelMenuMotoristas;
    private javax.swing.JLabel labelMenuRelatorios;
    private javax.swing.JLabel labelMenuVeiculos;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelLeft;
    private javax.swing.JPanel panelLoader;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelMenuItemCategorias;
    private javax.swing.JPanel panelMenuItemClientes;
    private javax.swing.JPanel panelMenuItemConfiguracoes;
    private javax.swing.JPanel panelMenuItemDashboard;
    private javax.swing.JPanel panelMenuItemLocacao;
    private javax.swing.JPanel panelMenuItemMarcas;
    private javax.swing.JPanel panelMenuItemModelos;
    private javax.swing.JPanel panelMenuItemMotoristas;
    private javax.swing.JPanel panelMenuItemRelatorios;
    private javax.swing.JPanel panelMenuItemVeiculos;
    private javax.swing.JScrollPane scrollPaneCenter;
    // End of variables declaration//GEN-END:variables
}
