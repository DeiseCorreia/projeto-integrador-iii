/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistcobr.telas;

import javax.swing.JOptionPane;

/**
 *
 * @author Emile
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        menIni = new javax.swing.JMenu();
        sair = new javax.swing.JMenuItem();
        menCli = new javax.swing.JMenu();
        cadCli = new javax.swing.JMenuItem();
        menDiv = new javax.swing.JMenu();
        cadDiv = new javax.swing.JMenuItem();
        conDiv = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menUser = new javax.swing.JMenu();
        cadUser = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SistCobr - Sistema de Cobrança");

        desktop.setPreferredSize(new java.awt.Dimension(537, 403));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistcobr/imgsicons/logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistcobr/imgsicons/fin.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        menIni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistcobr/imgsicons/door_open.png"))); // NOI18N
        menIni.setText("Início");

        sair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistcobr/imgsicons/cross.png"))); // NOI18N
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        menIni.add(sair);

        Menu.add(menIni);

        menCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistcobr/imgsicons/user_gray.png"))); // NOI18N
        menCli.setText("Cliente");
        menCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCliActionPerformed(evt);
            }
        });

        cadCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        cadCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistcobr/imgsicons/user_add.png"))); // NOI18N
        cadCli.setText("Cadastrar, Consulltar e Excluir");
        cadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadCliActionPerformed(evt);
            }
        });
        menCli.add(cadCli);

        Menu.add(menCli);

        menDiv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistcobr/imgsicons/application_form.png"))); // NOI18N
        menDiv.setText("Dívida");

        cadDiv.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        cadDiv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistcobr/imgsicons/application_add.png"))); // NOI18N
        cadDiv.setText("Cadastrar");
        cadDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadDivActionPerformed(evt);
            }
        });
        menDiv.add(cadDiv);

        conDiv.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        conDiv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistcobr/imgsicons/application_form_magnify.png"))); // NOI18N
        conDiv.setText("Consultar");
        conDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conDivActionPerformed(evt);
            }
        });
        menDiv.add(conDiv);

        Menu.add(menDiv);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistcobr/imgsicons/money.png"))); // NOI18N
        jMenu1.setText("Pagamento");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_CAPS_LOCK, 0));
        jMenuItem1.setText("Cadastro");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem2.setText("Consulta + Pagamento");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        Menu.add(jMenu1);

        menUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistcobr/imgsicons/user.png"))); // NOI18N
        menUser.setText("Usuário");

        cadUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        cadUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistcobr/imgsicons/user_add.png"))); // NOI18N
        cadUser.setText("Cadastrar, Consultar e Excluir");
        cadUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadUserActionPerformed(evt);
            }
        });
        menUser.add(cadUser);

        Menu.add(menUser);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(848, 490));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadUserActionPerformed
          //AS LINHAS ABAIXO VÃO ABRIR O FORM TELA USUARIO CADASTRO DENTRO DO DESKTOP MSI
          TelaUsuario cadUsu = new TelaUsuario();
          cadUsu.setVisible(true);
          desktop.add(cadUsu);
    }//GEN-LAST:event_cadUserActionPerformed

    private void conDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conDivActionPerformed
        ConsultaDivida coondDiv = new ConsultaDivida();
        coondDiv.setVisible(true);
        desktop.add(coondDiv);
    }//GEN-LAST:event_conDivActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
         //exibe uma caixa de diálogo
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção",
                JOptionPane.YES_NO_OPTION);
        if( sair == JOptionPane.YES_OPTION){
            System.exit(0);
    }
         
    }//GEN-LAST:event_sairActionPerformed

    private void cadDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadDivActionPerformed
        CadastroDivida caadDiv = new CadastroDivida();
        caadDiv.setVisible(true);
        desktop.add(caadDiv);
    }//GEN-LAST:event_cadDivActionPerformed

    private void menCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCliActionPerformed

    }//GEN-LAST:event_menCliActionPerformed

    private void cadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadCliActionPerformed
        TelaCliente caadClien = new TelaCliente();
        caadClien.setVisible(true);
        desktop.add(caadClien);
    }//GEN-LAST:event_cadCliActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       CadastroPagamento caadPag = new CadastroPagamento();
        caadPag.setVisible(true);
        desktop.add(caadPag);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Consultas coonPag = new Consultas();
        coonPag.setVisible(true);
        desktop.add(coonPag);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenuItem cadCli;
    private javax.swing.JMenuItem cadDiv;
    private javax.swing.JMenuItem cadUser;
    private javax.swing.JMenuItem conDiv;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu menCli;
    private javax.swing.JMenu menDiv;
    private javax.swing.JMenu menIni;
    private javax.swing.JMenu menUser;
    private javax.swing.JMenuItem sair;
    // End of variables declaration//GEN-END:variables
}