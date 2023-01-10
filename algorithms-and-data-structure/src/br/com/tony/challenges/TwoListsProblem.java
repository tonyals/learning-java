package br.com.tony.challenges;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class FileStructure {
    private final String name;

    public FileStructure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ", ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileStructure that = (FileStructure) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

/* Problema:
 * Dado dois servidores SFTP, chamados externalSFTP e internalSFTP. Faça o seguinte:
 * Crie um algoritmo que copie do externalSFTP para o internalSFTP somente os arquivos que o internalSFTP ainda nao possui;
 * O externalSFTP pode apagar periodicamente arquivos antigos, mas o internalSFTP sempre manterá suas copias.
 * Nao é necessario copiar arquivos do internalSFTP para o externalSFTP
 *
 *
 * */
public class TwoListsProblem {
    public static void main(String[] args) {
        //  List 1 - external sftp = report1, report2, report3
        //  List 2 - internal sftp = report1, report2, report3, report4, report5

        Set<FileStructure> extSftp = new HashSet<>(
                Arrays.asList(new FileStructure("report1"),
                        new FileStructure("report2"),
                        new FileStructure("report3")));

        Set<FileStructure> intSftp = new HashSet<>(
                Arrays.asList(new FileStructure("report1"),
                        new FileStructure("report2"),
                        new FileStructure("report3")));

        Set<FileStructure> extSftpLessThan = new HashSet<>(
                Arrays.asList(new FileStructure("report1"),
                        new FileStructure("report2"),
                        new FileStructure("report3"),
                        new FileStructure("report6")));

        Set<FileStructure> intSftpGreaterThan = new HashSet<>(
                Arrays.asList(new FileStructure("report1"),
                        new FileStructure("report2"),
                        new FileStructure("report3"),
                        new FileStructure("report4"),
                        new FileStructure("report5")));

        Set<FileStructure> extSftpGreaterThan = new HashSet<>(
                Arrays.asList(new FileStructure("report1"),
                        new FileStructure("report2"),
                        new FileStructure("report3"),
                        new FileStructure("report4"),
                        new FileStructure("report5")));

        Set<FileStructure> intSftpLessThan = new HashSet<>(
                Arrays.asList(new FileStructure("report1"),
                        new FileStructure("report2"),
                        new FileStructure("report3")));

        //  Se o SFTP interno contem todos os files do externo, nao é necessário tirar cópias.
        if (intSftp.containsAll(extSftp)) {
            System.out.println("No files to copy from external sftp");
        }

        //  Se o SFTP externo tiver tamanho maior que o interno, quer dizer que devemos copiar
        //  os arquivos que faltam no interno.
        if (extSftpGreaterThan.size() > intSftpLessThan.size()) {
            System.out.println("External sftp is greater than internal sftp. Copy files to internal...");
            System.out.println("Before operation extSftpGreaterThan: " + extSftpGreaterThan);
            System.out.println("Before operation intSftpLessThan: " + intSftpLessThan);
            //  Remove todos os arquivos que existem nos dois
            extSftpGreaterThan.removeAll(intSftpLessThan);
            //  Copia o restante - o que sobra do removeAll só existe no extSftpGreaterThan:
            System.out.println("After operation, files to copy: " + extSftpGreaterThan);
        }

        //  Se o SFTP interno tiver tamanho maior que o externo, quer dizer que algum arquivo
        //  foi deletado do sftp externo, mas devemos copiar somente os arquivos que ainda nao temos.
        if (intSftpGreaterThan.size() > extSftpLessThan.size()) {
            System.out.println("Internal sftp is greater than external sftp. Copy new files if exists...");
            System.out.println("Before operation intSftpGreaterThan: " + intSftpGreaterThan);
            System.out.println("Before operation extSftpLessThan: " + extSftpLessThan);

            //  Remove todos os arquivos que existem nos dois:
            extSftpLessThan.removeAll(intSftpGreaterThan);
            HashSet<FileStructure> toCopy = new HashSet<>();

            //  Itera sobre os restantes para saber qual existe no ext e nao existe no int:
            extSftpLessThan.forEach(extFile -> {
                if (!intSftpGreaterThan.contains(extFile)) {
                    toCopy.add(extFile);
                }
            });

            System.out.println("After operation, files to copy: " + toCopy);
        }
    }
}
