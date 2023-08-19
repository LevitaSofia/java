import java.io.*;

public class GravaArquivo {
    public static void main(String[] args) {
        try {
            // Abrir o arquivo de origem para leitura
            FileReader fileReader = new FileReader("src/resources/arquivo.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Abrir o arquivo de destino para escrita
            FileWriter fileWriter = new FileWriter("src/resources/arquivo01.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String linha;

            // Ler e copiar linha por linha
            while ((linha = bufferedReader.readLine()) != null) {
                bufferedWriter.write(linha);
                bufferedWriter.newLine(); // Adicionar uma nova linha no arquivo de destino
            }

            // Fechar os recursos
            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("Arquivo copiado com sucesso.");
        } catch (IOException ex) {
            System.out.println("Erro durante a cópia do arquivo: " + ex);
        }
    }
}
