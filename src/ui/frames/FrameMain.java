package ui.frames;

import java.awt.Dimension;
import ui.listeners.MouseListenerPanelButtonMenu;
import ui.panels.PanelClientesList;
import ui.panels.PanelMotoristasList;
import util.PanelUtilities;

/**
 *
 * @author Patrick-Ribeiro
 */
public class FrameMain extends javax.swing.JFrame {

    public FrameMain() {
        initComponents();

        panelMenuItemDashboard.addMouseListener(new MouseListenerPanelButtonMenu(panelMenuItemDashboard));
        panelMenuItemClientes.addMouseListener(new MouseListenerPanelButtonMenu(panelMenuItemClientes));
        panelMenuItemMotoristas.addMouseListener(new MouseListenerPanelButtonMenu(panelMenuItemMotoristas));
        panelMenuItemVeiculos.addMouseListener(new MouseListenerPanelButtonMenu(panelMenuItemVeiculos));
        panelMenuItemRelatorios.addMouseListener(new MouseListenerPanelButtonMenu(panelMenuItemRelatorios));
        panelMenuItemConfiguracoes.addMouseListener(new MouseListenerPanelButtonMenu(panelMenuItemConfiguracoes));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        panelMenuItemDashboard = new javax.swing.JPanel();
        labelIconDashboard = new javax.swing.JLabel();
        labelMenuDashboard = new javax.swing.JLabel();
        panelMenuItemClientes = new javax.swing.JPanel();
        labelIconClientes = new javax.swing.JLabel();
        labelMenuClientes = new javax.swing.JLabel();
        panelMenuItemMotoristas = new javax.swing.JPanel();
        labelIconMotoristas = new javax.swing.JLabel();
        labelMenuMotoristas = new javax.swing.JLabel();
        panelMenuItemVeiculos = new javax.swing.JPanel();
        labelIconVeiculos = new javax.swing.JLabel();
        labelMenuVeiculos = new javax.swing.JLabel();
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

        panelMenu.setMinimumSize(new java.awt.Dimension(300, 100));
        panelMenu.setPreferredSize(new java.awt.Dimension(150, 768));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenuItemDashboard.setPreferredSize(new java.awt.Dimension(150, 35));
        panelMenuItemDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMenuItemDashboardMouseClicked(evt);
            }
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

        panelMenu.add(panelMenuItemDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 99, -1, -1));

        panelMenuItemClientes.setPreferredSize(new java.awt.Dimension(150, 35));
        panelMenuItemClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMenuItemClientesMouseClicked(evt);
            }
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

        panelMenu.add(panelMenuItemClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 135, -1, -1));

        panelMenuItemMotoristas.setPreferredSize(new java.awt.Dimension(150, 35));
        panelMenuItemMotoristas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMenuItemMotoristasMouseClicked(evt);
            }
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

        panelMenu.add(panelMenuItemMotoristas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        panelMenuItemVeiculos.setPreferredSize(new java.awt.Dimension(150, 35));
        panelMenuItemVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMenuItemVeiculosMouseClicked(evt);
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

        panelMenu.add(panelMenuItemVeiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 205, -1, -1));

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

        panelMenu.add(panelMenuItemRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

        panelMenuItemConfiguracoes.setPreferredSize(new java.awt.Dimension(150, 35));
        panelMenuItemConfiguracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMenuItemConfiguracoesMouseClicked(evt);
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

        panelMenu.add(panelMenuItemConfiguracoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 275, -1, -1));

        getContentPane().add(panelMenu, java.awt.BorderLayout.LINE_START);

        scrollPaneCenter.setBorder(null);
        scrollPaneCenter.setFocusable(false);
        scrollPaneCenter.setRequestFocusEnabled(false);

        panelCenter.setBackground(new java.awt.Color(255, 255, 255));
        panelCenter.setPreferredSize(new java.awt.Dimension(1200, 768));
        panelCenter.setLayout(new java.awt.BorderLayout());

        panelLoader.setBackground(new java.awt.Color(255, 255, 255));
        panelLoader.setPreferredSize(new java.awt.Dimension(1200, 768));
        panelCenter.add(panelLoader, java.awt.BorderLayout.CENTER);

        scrollPaneCenter.setViewportView(panelCenter);

        getContentPane().add(scrollPaneCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelMenuItemDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuItemDashboardMouseClicked

    }//GEN-LAST:event_panelMenuItemDashboardMouseClicked

    private void panelMenuItemClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuItemClientesMouseClicked

    }//GEN-LAST:event_panelMenuItemClientesMouseClicked

    private void panelMenuItemMotoristasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuItemMotoristasMouseClicked

    }//GEN-LAST:event_panelMenuItemMotoristasMouseClicked

    private void panelMenuItemVeiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuItemVeiculosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelMenuItemVeiculosMouseClicked

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
        PanelMotoristasList panelLoaded = new PanelMotoristasList();
        panelLoader.removeAll();
        panelLoader.revalidate();
        panelLoader.repaint();
        panelLoader.add(panelLoaded);
        panelLoader.revalidate();
        panelLoader.repaint();
        panelLoaded.setPreferredSize(new Dimension(panelLoader.getWidth(), panelLoader.getHeight()));
        panelLoaded.updateTable();
    }//GEN-LAST:event_panelMenuItemMotoristasMousePressed

    private void panelMenuItemClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuItemClientesMousePressed
        PanelClientesList panelLoaded = new PanelClientesList();
        //PanelUtilities.loadPanelToPanel(panelLoaded, panelLoader);
        panelLoader.removeAll();
        panelLoader.revalidate();
        panelLoader.repaint();
        panelLoader.add(panelLoaded);
        panelLoader.revalidate();
        panelLoader.repaint();
        panelLoaded.setPreferredSize(new Dimension(panelLoader.getWidth(), panelLoader.getHeight()));
    }//GEN-LAST:event_panelMenuItemClientesMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelIconClientes;
    private javax.swing.JLabel labelIconConfiguracoes;
    private javax.swing.JLabel labelIconDashboard;
    private javax.swing.JLabel labelIconMotoristas;
    private javax.swing.JLabel labelIconRelatorios;
    private javax.swing.JLabel labelIconVeiculos;
    private javax.swing.JLabel labelMenuClientes;
    private javax.swing.JLabel labelMenuConfiguracoes;
    private javax.swing.JLabel labelMenuDashboard;
    private javax.swing.JLabel labelMenuMotoristas;
    private javax.swing.JLabel labelMenuRelatorios;
    private javax.swing.JLabel labelMenuVeiculos;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelLoader;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelMenuItemClientes;
    private javax.swing.JPanel panelMenuItemConfiguracoes;
    private javax.swing.JPanel panelMenuItemDashboard;
    private javax.swing.JPanel panelMenuItemMotoristas;
    private javax.swing.JPanel panelMenuItemRelatorios;
    private javax.swing.JPanel panelMenuItemVeiculos;
    private javax.swing.JScrollPane scrollPaneCenter;
    // End of variables declaration//GEN-END:variables
}
