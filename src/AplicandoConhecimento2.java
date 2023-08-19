//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AplicandoConhecimento2 {
    public AplicandoConhecimento2() {
    }

    public static void main(String[] args) throws FileNotFoundException {
        try {
            InputStream is = new FileInputStream("src/resources/alunos.txt");
            InputStreamReader ir = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(ir);
            String[] vetString = new String[15];

            String linha;
            while((linha = br.readLine()) != null) {
                String[] informacao = linha.split(";");
                String id = informacao[0];
                String nome = informacao[1];
                String nota = informacao[2];
                System.out.println("Id: " + id);
                System.out.println("Nome: " + nome);
                System.out.println("Nota: " + nota);
                System.out.println();
            }

            br.close();
        } catch (FileNotFoundException var10) {
            System.out.println("Erro na abertura do arquivo." + String.valueOf(var10));
        } catch (IOException var11) {
            System.out.println("Falha de leitura." + String.valueOf(var11));
        }

        System.out.println("Fim do programa.");
    }
}
