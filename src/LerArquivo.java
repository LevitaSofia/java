import java.io.*;

public class LerArquivo {
    public static void main(String[] args) throws FileNotFoundException
    {
        try {
            // Leitura de um arquivo.
            InputStream is = new FileInputStream("src/resources/alunos.txt");
            InputStreamReader ir = new InputStreamReader(is);
            BufferedReader br = new  BufferedReader(ir );

            // formato de id, nome, nota


            String linha = br.readLine();
            String vetString[];

            vetString = linha.split(" ");

            System.out.println(vetString[0]);
            int num = Integer.parseInt(vetString[1]);
            System.out.println(num * 2);

            br.close();// Fecha arquivo de entrada




        } catch (FileNotFoundException ex) {
            System.out.println("Erro na abertura do arquivo."+ex);
        } catch (IOException ex){
            System.out.println("Falha de leitura." +ex);
        }
        System.out.println("Fim do programa.");
    }
}
