/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROL;

import MODEL.*;
import VIEW.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Controle {

    private final TelaPrincipal igu;
    private final Logica md;
    private int teste;
    private boolean licencaAtiva;
    private Compra compra;

    public Controle() {
        igu = new TelaPrincipal(this);
        md = new Logica(igu.getModeloTabela());
    }

    public boolean buscaArquivos(String nome, String diretorio, ArrayList<String> ext) {//throws Exception {
        return md.buscaArquivos(nome, diretorio, ext);

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        Controle controle;
        controle = new Controle();

    }

    private boolean verificaLicenca() {
        boolean liberado = false;
        if (teste > 2 && !licencaAtiva) {
            compra = new Compra(this);
            compra.setFrameInvisible(igu);
        } else if (teste < 4 || licencaAtiva) {
            liberado = true;
        }
        return liberado;
    }

    public void busca() {
        if (igu.getOpcoesExt().isEmpty()) {
            igu.lancaMensagem("Por favor selecionar pelo menos\n"
                    + " uma Extenção de Arquivo! ");
        } else if (igu.getDiretorio().equals("")) {
            igu.lancaMensagem("Por favor selecione o \n"
                    + "Diretório de Pesquisa!");
        } else if (!igu.getMostraSimilaridades() && verificaLicenca()) {
            setBusca(buscaArquivos(igu.getPesquisar(), igu.getDiretorio(), igu.getOpcoesExt()));

        } else if (igu.getMostraSimilaridades() && verificaLicenca()) {
            setBusca(pesquisarSimilaridades(igu.getDiretorio(), igu.getOpcoesExt()));

        }
    }

    private void setBusca(boolean encontrou) {
        if (encontrou) {
            igu.lancaMensagem("Busca Finalizada!");
            teste++;
        } else {
            igu.lancaMensagem("Não foi possível localizar arquivos\n"
                    + "com os parametros selecionados!");
        }

    }

    private boolean pesquisarSimilaridades(String diretorio, ArrayList<String> opcoesExt) {
        return md.pesquisarSimilaridade(diretorio, opcoesExt);
    }

    public void deletaArquivo(String arquivo, int linha) {
        if (md.deletaArquivo(arquivo)) {
            ((DefaultTableModel) igu.getModeloTabela()).removeRow(linha);
        } else {
            igu.lancaMensagem("Não foi possível excluir o arquivo: " + arquivo);

        }
    }

    public void compraRealizada() {
        teste = -1;
        licencaAtiva = true;
        igu.setVisible(true);
    }

}
