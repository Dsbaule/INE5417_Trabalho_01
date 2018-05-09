/* --------------------------------------------------------------------------------
 * Autores:     Daniel de Souza Baulé
 *              Mirian de França Santos Pereira
 * Disciplina:  INE5417 - Engenharia de Software
 * Projeto:     Edito de Texto
-------------------------------------------------------------------------------- */
package Visao;

import Dados.Documento;
import Dados.Formatacao;
import Dados.INEdit;
import Dados.Usuario;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class EditorDeTexto extends javax.swing.JFrame {

    Usuario usuario;
    Documento documento;
    Formatacao formatacao;

    INEdit inedit;

    /**
     * Creates new form Tela_Principal
     */
    public EditorDeTexto() {
        inedit = new INEdit();

        initComponents();

        this.setTitle("INEdit");        // Altera o título
        this.barraMenu.setVisible(true);
        menuArquivo.setEnabled(false);
        menuUsuario.setEnabled(false);
        initPainelEscolheUsuario();
        this.setContentPane(PainelEscolheUsuario);
        this.pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JanelaEscolhePasta = new javax.swing.JFileChooser();
        PainelEscolheArquivo = new javax.swing.JPanel();
        textFieldNomeArquivo = new javax.swing.JTextField();
        botaoAdicionarArquivo = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        listaDeArquivos = new javax.swing.JList<>();
        BotaoSelecionarArquivo = new javax.swing.JButton();
        PainelEdicaoTexto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaDoTexto = new javax.swing.JTextArea();
        PainelEscolheUsuario = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        listaDeUsuarios = new javax.swing.JList<>();
        BotaoSelecionarUsuario = new javax.swing.JButton();
        textFieldSelecioneUsuario = new javax.swing.JTextField();
        barraMenu = new javax.swing.JMenuBar();
        menuUsuario = new javax.swing.JMenu();
        menuBotaoAlterarUsuario = new javax.swing.JMenuItem();
        menuArquivo = new javax.swing.JMenu();
        menuBotaoAbrir = new javax.swing.JMenuItem();
        menuBotaoSalvar = new javax.swing.JMenuItem();
        menuINEdit = new javax.swing.JMenu();
        menuBotaoSobre = new javax.swing.JMenuItem();
        menuBotaoAjuda = new javax.swing.JMenuItem();

        JanelaEscolhePasta.setDialogTitle("Seleção de Pasta");
        JanelaEscolhePasta.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        JanelaEscolhePasta.setToolTipText("Selecione a pasta onde sera criado o novo arquivo.");

        PainelEscolheArquivo.setMinimumSize(new java.awt.Dimension(500, 500));

        textFieldNomeArquivo.setText("Nome");
        textFieldNomeArquivo.setPreferredSize(new java.awt.Dimension(500, 50));
        textFieldNomeArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeArquivoActionPerformed(evt);
            }
        });

        botaoAdicionarArquivo.setText("Adicionar Arquivo");
        botaoAdicionarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarArquivoActionPerformed(evt);
            }
        });

        listaDeArquivos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(listaDeArquivos);

        BotaoSelecionarArquivo.setText("Selecionar Arquivo");
        BotaoSelecionarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSelecionarArquivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelEscolheArquivoLayout = new javax.swing.GroupLayout(PainelEscolheArquivo);
        PainelEscolheArquivo.setLayout(PainelEscolheArquivoLayout);
        PainelEscolheArquivoLayout.setHorizontalGroup(
            PainelEscolheArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEscolheArquivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelEscolheArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addComponent(BotaoSelecionarArquivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PainelEscolheArquivoLayout.createSequentialGroup()
                        .addComponent(textFieldNomeArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoAdicionarArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PainelEscolheArquivoLayout.setVerticalGroup(
            PainelEscolheArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEscolheArquivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelEscolheArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoAdicionarArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldNomeArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoSelecionarArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        AreaDoTexto.setColumns(20);
        AreaDoTexto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        AreaDoTexto.setLineWrap(true);
        AreaDoTexto.setRows(5);
        AreaDoTexto.setTabSize(4);
        jScrollPane1.setViewportView(AreaDoTexto);

        javax.swing.GroupLayout PainelEdicaoTextoLayout = new javax.swing.GroupLayout(PainelEdicaoTexto);
        PainelEdicaoTexto.setLayout(PainelEdicaoTextoLayout);
        PainelEdicaoTextoLayout.setHorizontalGroup(
            PainelEdicaoTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        PainelEdicaoTextoLayout.setVerticalGroup(
            PainelEdicaoTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );

        PainelEscolheUsuario.setMinimumSize(new java.awt.Dimension(500, 500));

        jTextField4.setEditable(false);
        jTextField4.setText("Nome");
        jTextField4.setPreferredSize(new java.awt.Dimension(500, 50));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton7.setText("Adicionar Usuário");
        jButton7.setEnabled(false);

        listaDeUsuarios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaDeUsuarios.setToolTipText("");
        listaDeUsuarios.setAutoscrolls(false);
        jScrollPane6.setViewportView(listaDeUsuarios);

        BotaoSelecionarUsuario.setText("Selecionar Usuário");
        BotaoSelecionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSelecionarUsuarioActionPerformed(evt);
            }
        });

        textFieldSelecioneUsuario.setEditable(false);
        textFieldSelecioneUsuario.setText("Selecione um Usuario:");
        textFieldSelecioneUsuario.setBorder(null);

        javax.swing.GroupLayout PainelEscolheUsuarioLayout = new javax.swing.GroupLayout(PainelEscolheUsuario);
        PainelEscolheUsuario.setLayout(PainelEscolheUsuarioLayout);
        PainelEscolheUsuarioLayout.setHorizontalGroup(
            PainelEscolheUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEscolheUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelEscolheUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldSelecioneUsuario)
                    .addComponent(jScrollPane6)
                    .addComponent(BotaoSelecionarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PainelEscolheUsuarioLayout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PainelEscolheUsuarioLayout.setVerticalGroup(
            PainelEscolheUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEscolheUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelEscolheUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldSelecioneUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoSelecionarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuUsuario.setText("Usuário");

        menuBotaoAlterarUsuario.setText("Alterar Usuário");
        menuBotaoAlterarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBotaoAlterarUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(menuBotaoAlterarUsuario);

        barraMenu.add(menuUsuario);

        menuArquivo.setText("Arquivo");

        menuBotaoAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuBotaoAbrir.setText("Trocar");
        menuBotaoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBotaoAbrirActionPerformed(evt);
            }
        });
        menuArquivo.add(menuBotaoAbrir);

        menuBotaoSalvar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuBotaoSalvar.setText("Salvar");
        menuBotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBotaoSalvarActionPerformed(evt);
            }
        });
        menuArquivo.add(menuBotaoSalvar);

        barraMenu.add(menuArquivo);

        menuINEdit.setText("INEdit");

        menuBotaoSobre.setText("Sobre");
        menuBotaoSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBotaoSobreActionPerformed(evt);
            }
        });
        menuINEdit.add(menuBotaoSobre);

        menuBotaoAjuda.setText("Ajuda");
        menuBotaoAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBotaoAjudaActionPerformed(evt);
            }
        });
        menuINEdit.add(menuBotaoAjuda);

        barraMenu.add(menuINEdit);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //! Botão para abertura de um arquivo
    private void menuBotaoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBotaoAbrirActionPerformed
        initPainelEscolheArquivo();
        this.setContentPane(PainelEscolheArquivo);
        this.pack();
    }//GEN-LAST:event_menuBotaoAbrirActionPerformed

    //! Botão para salvar o arquivo
    private void menuBotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBotaoSalvarActionPerformed
        documento.setTexto(AreaDoTexto.getText());   // Alteração do texto do documento
        documento.salvaDocumento(); // Salvar o documento
        JOptionPane.showMessageDialog(this, "Arquivo Salvo");   // Mostrar um diálogo para confirmação do salvamento do arquivo
    }//GEN-LAST:event_menuBotaoSalvarActionPerformed

    private void menuBotaoSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBotaoSobreActionPerformed
        TelaSobre telaSobre = new TelaSobre();
        telaSobre.setLocationRelativeTo(this);
        telaSobre.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        telaSobre.pack();
        telaSobre.setVisible(true);    }//GEN-LAST:event_menuBotaoSobreActionPerformed

    private void menuBotaoAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBotaoAjudaActionPerformed
        TelaAjuda telaAjuda = new TelaAjuda();
        telaAjuda.setLocationRelativeTo(this);
        telaAjuda.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        telaAjuda.setVisible(true);
    }//GEN-LAST:event_menuBotaoAjudaActionPerformed

    private void textFieldNomeArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeArquivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeArquivoActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void BotaoSelecionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSelecionarUsuarioActionPerformed
        usuario = inedit.retornaUsuario(listaDeUsuarios.getSelectedValue());

        initPainelEscolheArquivo();
        this.setContentPane(PainelEscolheArquivo);
        this.pack();
    }//GEN-LAST:event_BotaoSelecionarUsuarioActionPerformed

    private void BotaoSelecionarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSelecionarArquivoActionPerformed
        documento = inedit.retornaDocumento(listaDeArquivos.getSelectedValue());
        formatacao = inedit.retornaFormatacao(documento.getFormatacao().getNomeFormatacao());

        initEditorDeTexto();
        barraMenu.setVisible(true);
        this.setContentPane(PainelEdicaoTexto);
        this.pack();
    }//GEN-LAST:event_BotaoSelecionarArquivoActionPerformed

    private void menuBotaoAlterarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBotaoAlterarUsuarioActionPerformed
        initPainelEscolheUsuario();
        this.setContentPane(PainelEscolheUsuario);
        this.pack();
    }//GEN-LAST:event_menuBotaoAlterarUsuarioActionPerformed

    private void botaoAdicionarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarArquivoActionPerformed
        String nomeDocumento = textFieldNomeArquivo.getText();

        documento = inedit.retornaDocumento(nomeDocumento);

        if (documento != null) {
            JOptionPane.showMessageDialog(this, "Documento já existente!", "Nome Inválido", JOptionPane.ERROR_MESSAGE);   // Mostrar um diálogo para confirmação do salvamento do arquivo
        } else {
            int returnVal = JanelaEscolhePasta.showOpenDialog(this);    // Obtem a pasta para criação do novo arquivo através de um dialogo do sistema
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                System.out.println("Aprovado!");
                documento = new Documento(nomeDocumento, JanelaEscolhePasta.getSelectedFile().getPath().concat("\\").concat(nomeDocumento).concat(".txt"), usuario, inedit.retornaFormatacao("Padrao"));
                formatacao = inedit.retornaFormatacao(documento.getFormatacao().getNomeFormatacao());
                inedit.cadastraDocumento(documento);
                initEditorDeTexto();
                barraMenu.setVisible(true);
                this.setContentPane(PainelEdicaoTexto);
                this.pack();
            } else {
                System.out.println("Acesso cancelado pelo usuário!");
            }
        }
    }//GEN-LAST:event_botaoAdicionarArquivoActionPerformed

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
            java.util.logging.Logger.getLogger(EditorDeTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditorDeTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditorDeTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorDeTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorDeTexto().setVisible(true);
            }
        });
    }

    private void initPainelEscolheUsuario() {
        menuUsuario.setEnabled(false);
        menuArquivo.setEnabled(false);
        
        String[] usuarios = inedit.retornaUsuarios();

        DefaultListModel model = new DefaultListModel();

        if (usuarios != null) {
            for (String usuario : usuarios) {
                model.addElement(usuario);
            }
        }

        listaDeUsuarios.setModel(model);
        listaDeUsuarios.setSelectedIndex(0);
    }

    private void initPainelEscolheArquivo() {
        menuUsuario.setEnabled(true);
        menuArquivo.setEnabled(false);
        
        String[] arquivos = inedit.retornaDocumentos(usuario);
        DefaultListModel model = new DefaultListModel();
        
        if (arquivos != null) {
            for (String arquivo : arquivos) {
                model.addElement(arquivo);
            }
        }

        listaDeArquivos.setModel(model);
        listaDeArquivos.setSelectedIndex(0);
    }

    private void initEditorDeTexto() {
        menuUsuario.setEnabled(true);
        menuArquivo.setEnabled(true);
        
        documento.leDocumento();
        AreaDoTexto.setText(documento.getTexto());
    }

    private Usuario criaNovoUsuario() {
        Usuario usuarioCriado = null;
        while (usuarioCriado == null) {
            String nomeUsuario = JOptionPane.showInputDialog(this, "Nome do Usuario:", "Novo Usuario", JOptionPane.PLAIN_MESSAGE);  // Obtem o nome para o novo Usuario;
            if (inedit.retornaUsuario(nomeUsuario) == null) {
                inedit.cadastraUsuario(new Usuario(nomeUsuario));
                usuarioCriado = inedit.retornaUsuario(nomeUsuario);
            }
        }
        return usuarioCriado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaDoTexto;
    private javax.swing.JButton BotaoSelecionarArquivo;
    private javax.swing.JButton BotaoSelecionarUsuario;
    private javax.swing.JFileChooser JanelaEscolhePasta;
    private javax.swing.JPanel PainelEdicaoTexto;
    private javax.swing.JPanel PainelEscolheArquivo;
    private javax.swing.JPanel PainelEscolheUsuario;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton botaoAdicionarArquivo;
    private javax.swing.JButton jButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JList<String> listaDeArquivos;
    private javax.swing.JList<String> listaDeUsuarios;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuItem menuBotaoAbrir;
    private javax.swing.JMenuItem menuBotaoAjuda;
    private javax.swing.JMenuItem menuBotaoAlterarUsuario;
    private javax.swing.JMenuItem menuBotaoSalvar;
    private javax.swing.JMenuItem menuBotaoSobre;
    private javax.swing.JMenu menuINEdit;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JTextField textFieldNomeArquivo;
    private javax.swing.JTextField textFieldSelecioneUsuario;
    // End of variables declaration//GEN-END:variables
}

//! Filtro para arquivos .txt
class FiltroArquivo extends javax.swing.filechooser.FileFilter {

    @Override
    public boolean accept(File file) {
        return file.isDirectory() || file.getAbsolutePath().endsWith(".txt");
    }

    @Override
    public String getDescription() {
        return "Text documents (*.txt)";
    }
}
