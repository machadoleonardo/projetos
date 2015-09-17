/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import CONTROL.*;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author aluno
 */
public class TelaPrincipal extends javax.swing.JFrame {

    Controle ctrl;

    /**
     * Creates new form TelaLogin
     */
    public TelaPrincipal(Controle ctrl) {
        this.ctrl = ctrl;
        this.setVisible(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jCheckBoxMP3 = new javax.swing.JCheckBox();
        jLabelPesquisar = new javax.swing.JLabel();
        jLabelTiposDeArquivos = new javax.swing.JLabel();
        jLabelDiretorio = new javax.swing.JLabel();
        jCheckBoxOutro = new javax.swing.JCheckBox();
        jTextFieldoutrosTipos = new javax.swing.JTextField();
        jCheckBoxMP4 = new javax.swing.JCheckBox();
        jTextFieldPequisar = new javax.swing.JTextField();
        jCheckBoxAVI = new javax.swing.JCheckBox();
        jTextFieldDiretorio = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableRetornoBusca = new javax.swing.JTable();
        jCheckBoxWMA = new javax.swing.JCheckBox();
        jCheckBoxMostrarSimilares = new javax.swing.JCheckBox();
        jCheckBoxMKV = new javax.swing.JCheckBox();
        jCheckBoxWMV = new javax.swing.JCheckBox();
        jButtonBuscar = new javax.swing.JButton();
        jButtonAplicar = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuEditar = new javax.swing.JMenu();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuComprar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCheckBoxMP3.setText("MP3");

        jLabelPesquisar.setText("Pesquisar");

        jLabelTiposDeArquivos.setText("Tipos de Arquivos");

        jLabelDiretorio.setText("Diretório");

        jCheckBoxOutro.setText("Outro");
        jCheckBoxOutro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxOutroActionPerformed(evt);
            }
        });

        jTextFieldoutrosTipos.setEditable(false);
        jTextFieldoutrosTipos.setColumns(3);
        jTextFieldoutrosTipos.setMaximumSize(new java.awt.Dimension(3, 3));
        jTextFieldoutrosTipos.setMinimumSize(new java.awt.Dimension(1, 1));
        jTextFieldoutrosTipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldoutrosTiposMouseClicked(evt);
            }
        });
        jTextFieldoutrosTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldoutrosTiposActionPerformed(evt);
            }
        });

        jCheckBoxMP4.setText("MP4");

        jTextFieldPequisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPequisarActionPerformed(evt);
            }
        });

        jCheckBoxAVI.setText("AVI");

        jTextFieldDiretorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldDiretorioMouseClicked(evt);
            }
        });
        jTextFieldDiretorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDiretorioActionPerformed(evt);
            }
        });

        jTableRetornoBusca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "nome", "diretorio", "tamanho", "data de criação", "deletar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableRetornoBusca.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(jTableRetornoBusca);
        jTableRetornoBusca.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (jTableRetornoBusca.getColumnModel().getColumnCount() > 0) {
            jTableRetornoBusca.getColumnModel().getColumn(2).setPreferredWidth(1);
            jTableRetornoBusca.getColumnModel().getColumn(3).setPreferredWidth(1);
            jTableRetornoBusca.getColumnModel().getColumn(4).setPreferredWidth(1);
        }

        jCheckBoxWMA.setText("WMA");

        jCheckBoxMostrarSimilares.setText("Mostrar apenas similariedades");
        jCheckBoxMostrarSimilares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMostrarSimilaresActionPerformed(evt);
            }
        });

        jCheckBoxMKV.setText("MKV");

        jCheckBoxWMV.setText("WMV");

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonAplicar.setText("Aplicar");
        jButtonAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAplicarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelDiretorio, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDiretorio, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                            .addComponent(jTextFieldPequisar))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBuscar)
                            .addComponent(jCheckBoxMostrarSimilares, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAplicar))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTiposDeArquivos)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBoxMKV)
                                .addGap(24, 24, 24)
                                .addComponent(jCheckBoxAVI))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxMP3)
                                    .addComponent(jCheckBoxWMA))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxWMV)
                                    .addComponent(jCheckBoxMP4)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBoxOutro)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldoutrosTipos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPesquisar)
                    .addComponent(jTextFieldPequisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxMostrarSimilares)
                    .addComponent(jLabelTiposDeArquivos))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxMP3)
                            .addComponent(jCheckBoxMP4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxWMA)
                            .addComponent(jCheckBoxWMV))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxMKV)
                            .addComponent(jCheckBoxAVI)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDiretorio)
                            .addComponent(jTextFieldDiretorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxOutro)
                    .addComponent(jTextFieldoutrosTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAplicar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        jMenuArquivo.setText("Arquivo");
        jMenuBar.add(jMenuArquivo);

        jMenuEditar.setText("Editar");
        jMenuBar.add(jMenuEditar);

        jMenuAjuda.setText("Ajuda");
        jMenuBar.add(jMenuAjuda);

        jMenuComprar.setText("Comprar");
        jMenuBar.add(jMenuComprar);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public ArrayList<String> getOpcoesExt() {
        ArrayList<String> ext = new ArrayList<String>();
        if (jCheckBoxMP3.isSelected()) {
            ext.add("mp3");
        }
        if (jCheckBoxMP4.isSelected()) {
            ext.add("mp4");
        }
        if (jCheckBoxWMA.isSelected()) {
            ext.add("wma");
        }
        if (jCheckBoxWMV.isSelected()) {
            ext.add("wmv");
        }
        if (jCheckBoxMKV.isSelected()) {
            ext.add("mkv");
        }
        if (jCheckBoxAVI.isSelected()) {
            ext.add("avi");
        }
        if (jCheckBoxOutro.isSelected() && !jTextFieldoutrosTipos.getText().equals("")) {
            ext.add(jTextFieldoutrosTipos.getText());
        }
        return ext;

    }
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        ctrl.busca();
    }//GEN-LAST:event_jButtonBuscarActionPerformed
    public TableModel getModeloTabela() {
        return jTableRetornoBusca.getModel();
    }

    public String getPesquisar() {
        return jTextFieldPequisar.getText().trim();
    }

    public String getDiretorio() {
        return jTextFieldDiretorio.getText().trim();
    }

    public boolean getMostraSimilaridades() {
        return jCheckBoxMostrarSimilares.isSelected();
    }

    public void lancaMensagem(String msg) {
        JOptionPane.showMessageDialog(null, msg, null, WIDTH);
    }

    public JTable getjTableRetornoBusca() {
        return jTableRetornoBusca;
    }

    public void setjTableRetornoBusca(JTable jTableRetornoBusca) {
        this.jTableRetornoBusca = jTableRetornoBusca;
    }

    private void jCheckBoxOutroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxOutroActionPerformed
        if (jCheckBoxOutro.isSelected()) {
            jTextFieldoutrosTipos.setEditable(true);
        } else {
            jTextFieldoutrosTipos.setEditable(false);
        }

    }//GEN-LAST:event_jCheckBoxOutroActionPerformed

    private void jTextFieldoutrosTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldoutrosTiposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldoutrosTiposActionPerformed

    private void jTextFieldDiretorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDiretorioActionPerformed
        selecionaDiretorio();

    }//GEN-LAST:event_jTextFieldDiretorioActionPerformed
    private void selecionaDiretorio() {
        JButton abrir = new JButton();
        JFileChooser diretorio = new JFileChooser();
        diretorio.setCurrentDirectory(new File("%HomeDrive%"));
        diretorio.setDialogTitle("Selecione diretório:");
        diretorio.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (diretorio.showOpenDialog(abrir) == JFileChooser.APPROVE_OPTION) {
            jTextFieldDiretorio.setText(diretorio.getSelectedFile().getAbsolutePath());
        }
    }
    private void jTextFieldDiretorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldDiretorioMouseClicked
        selecionaDiretorio();
// TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDiretorioMouseClicked

    private void jTextFieldoutrosTiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldoutrosTiposMouseClicked
        if (!jCheckBoxOutro.isSelected()) {
            jCheckBoxOutro.doClick();
        }
    }//GEN-LAST:event_jTextFieldoutrosTiposMouseClicked

    private void jTextFieldPequisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPequisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPequisarActionPerformed

    private void jCheckBoxMostrarSimilaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMostrarSimilaresActionPerformed
        if (jCheckBoxMostrarSimilares.isSelected()) {
            jTextFieldPequisar.setEditable(false);
            jTextFieldPequisar.setText("");
        } else {
            jTextFieldPequisar.setEditable(true);
        }
    }//GEN-LAST:event_jCheckBoxMostrarSimilaresActionPerformed

    private void jButtonAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAplicarActionPerformed
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < jTableRetornoBusca.getRowCount(); i++) {
            if ((Boolean) jTableRetornoBusca.getValueAt(i, 4) == true ) {
               ctrl.deletaArquivo((String) jTableRetornoBusca.getValueAt(i, 1) + '\\' + (String) jTableRetornoBusca.getValueAt(i, 0), i);
           }
        }


    }//GEN-LAST:event_jButtonAplicarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAplicar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JCheckBox jCheckBoxAVI;
    private javax.swing.JCheckBox jCheckBoxMKV;
    private javax.swing.JCheckBox jCheckBoxMP3;
    private javax.swing.JCheckBox jCheckBoxMP4;
    private javax.swing.JCheckBox jCheckBoxMostrarSimilares;
    private javax.swing.JCheckBox jCheckBoxOutro;
    private javax.swing.JCheckBox jCheckBoxWMA;
    private javax.swing.JCheckBox jCheckBoxWMV;
    private javax.swing.JLabel jLabelDiretorio;
    private javax.swing.JLabel jLabelPesquisar;
    private javax.swing.JLabel jLabelTiposDeArquivos;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuComprar;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableRetornoBusca;
    private javax.swing.JTextField jTextFieldDiretorio;
    private javax.swing.JTextField jTextFieldPequisar;
    private javax.swing.JTextField jTextFieldoutrosTipos;
    // End of variables declaration//GEN-END:variables
}
