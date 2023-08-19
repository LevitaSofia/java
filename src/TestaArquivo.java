import java.io.*;


public class TestaArquivo {
    // Abre o arquivo.txt
    public static void main(String[] args) throws IOException{
        InputStream is = new FileInputStream("src/resources/arquivo.txt");
        //Le um, byte do arquivo.txt

        int b = is.read();
        // Fecha o bye lido
        System.out.println("saida=>"+b);
        // fecha o flucho de stream
        is.close();
        System.out.println("fim de programa");


    }
}
