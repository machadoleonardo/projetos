/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author aluno
 */
public class Logica {

    private String nomeArquivo;
    private String[] ext;
    private DefaultTableModel modelo;

    public Logica(TableModel modelo) {
        this.modelo = (DefaultTableModel) modelo;
    }

    public boolean buscaArquivos(String palavra, String diretorio, ArrayList<String> ext) {// throws Exception {
        ArrayList<File> lista = new ArrayList();
        boolean encontrou = false;
        //try {

        File arquivo = new File(diretorio);
        for (String tipoArquivo : ext) {
            lista = buscar(arquivo, palavra, tipoArquivo, lista);
        }
        if (!lista.isEmpty()) {
            setTabelaModelo(lista);
            encontrou = true;
        }
      return encontrou;
    }

    public ArrayList<File> buscar(File diretorio, String palavra, String tipoArquivo, ArrayList lista) {
        limpaTabelaModelo();
        if (diretorio.isDirectory()) {
            File[] subPastas = diretorio.listFiles();
            if (subPastas != null) {
                for (File subPasta : subPastas) {
                    lista = buscar(subPasta, palavra, tipoArquivo, lista);
                    if (diretorio.getName().toLowerCase().contains(palavra.toLowerCase()) && diretorio.getName().toLowerCase().endsWith(tipoArquivo.toLowerCase())) {
                        lista.add(diretorio.getAbsoluteFile());
                    }
                }
            }
        } else if (diretorio.getName().toLowerCase().contains(palavra.toLowerCase()) && diretorio.getName().toLowerCase().endsWith(tipoArquivo.toLowerCase())) {
            lista.add(diretorio.getAbsoluteFile());
        }
        return lista;
    }

    private void setTabelaModelo(ArrayList<File> lista) {

        for (File arquivo : lista) {
            try {
                String nome = arquivo.getName();
                String diretorio = arquivo.getParent();
                String tamanho = (arquivo.length() / 1024) + " KB";
                BasicFileAttributes attr = Files.readAttributes(arquivo.toPath(), BasicFileAttributes.class);
                String dataDeCriacao = new Date(attr.creationTime().to(TimeUnit.MILLISECONDS)).toString();
                Object[] linha = new Object[5];
                linha[0] = nome;
                linha[1] = diretorio;
                linha[2] = tamanho;
                linha[3] = dataDeCriacao;
                linha[4] = false;
                modelo.addRow(linha);
            } catch (IOException ex) {
                Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    private void limpaTabelaModelo() {
        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    public boolean pesquisarSimilaridade(String diretorio, ArrayList<String> opcoesExt) {
        ArrayList<File> lista = new ArrayList();
        ArrayList<File> listaTemp = new ArrayList();
        limpaTabelaModelo();
        boolean encontrou = false;
        File arquivo = new File(diretorio);
        for (String tipoArquivo : opcoesExt) {
            listaTemp = buscar(arquivo, "", tipoArquivo, listaTemp);

        }
        for (File arq1 : listaTemp) {
            for (File arq2 : listaTemp) {
                if (!arq1.getAbsolutePath().equalsIgnoreCase(arq2.getAbsolutePath()) && verificaDuplicidade(arq1, arq2)) {
                    lista.add(arq1);
                }
            }
        }
        if (!lista.isEmpty()) {
            setTabelaModelo(lista);
            encontrou = true;
        }
        return encontrou;
    }

    public boolean deletaArquivo(String arquivo) {
        File arq = new File(arquivo);
        return arq.delete();
    }

    public static boolean verificaDuplicidade(File arq1, File arq2) {
        byte[] arq1_buf = new byte[1048576];
        byte[] arq2_buf = new byte[1048576];
        int len;
        if (arq1.length() == arq2.length()) {
            try {
                InputStream isarq1 = new FileInputStream(arq1);
                InputStream isarq2 = new FileInputStream(arq2);
                try {
                    while (isarq1.read(arq1_buf) >= 0) {
                        len = isarq2.read(arq2_buf);
                        for (int j = 0; j < len; j++) {
                            if (arq1_buf[j] != arq2_buf[j]) {
                                return false; // tamanho igual e conteudo diferente 
                            }
                        }
                    }
                } catch (IOException e) {

                }

            } catch (FileNotFoundException e) {

            }

        } else {
            return false; // tamanho e conteudo diferente 
        }
        return true; // arquivos iguais }

    }
}
