/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

/**
 *
 * @author Mirian
 */
public class TelaAjuda extends javax.swing.JFrame {

    /**
     * Creates new form TelaAjuda
     */
    public TelaAjuda() {
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

        labelAjuda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelAjuda.setText("<html>"
            + "Atalhos <br/>" +
            "Novo ->  Ctrl + N <br/>" +
            "Abrir ->  Ctrl + O <br/>" +
            "Salvar ->  Ctrl + S <br/>" +
            "Salvar como <br/>" +
            "<br/>" +
            "Para criar um novo arquivo: <br/>" +
            "no Menu, clique em Arquivo e depois em Novo.<br/>" +
            "<br/>" +
            "Para abrir um arquivo: <br/>" +
            "no Menu, clique em Arquivo e depois em Abrir. <br/>" +
            "<br/>" +
            "Para salvar um novo arquivo:<br/>" +
            "no Menu, clique em Arquivo e depois em Salvar.<br/>" +
            "<br/>" +
            "Para Salvar como um novo arquivo: <br/>" +
            "no Menu, clique em Arquivo e depois em Salvar como. <br/>" +
            "<br/>" +
            "Para exibir a janela ajuda:<br/>" +
            "no Menu, clique em Ajuda e depois em Ajuda.<br/>" +
            "<br/>" +
            "Para exibir a janela sobre:<br/>" +
            "no Menu, clique em Ajuda e depois em Sobre."
            + "<br/>"
            + "<html/>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelAjuda)
                .addGap(0, 297, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelAjuda)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaAjuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAjuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAjuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAjuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAjuda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelAjuda;
    // End of variables declaration//GEN-END:variables
}
