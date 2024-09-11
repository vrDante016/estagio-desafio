import java.util.ArrayList;
import java.util.List;

public class Main {

    static int verificaALetraA(String nome) throws Exception {
        if (nome == null) {
            throw new Exception("O nome esta vazio");
        }
        List<Character> letras = new ArrayList<>();
        for(char letra : nome.toCharArray()){
            letras.add(letra);
            }

        int contagem = (int) letras.stream().filter(c -> c == 'A' || c == 'a' ).count();
        return contagem;


    }

    public static void main(String[] args) throws Exception {
        int quantidaddeDeLetrasA1 =  verificaALetraA("Amanda");
        int quantidaddeDeLetrasA2 =  verificaALetraA("veronica");
        System.out.println(quantidaddeDeLetrasA1);
        System.out.println(quantidaddeDeLetrasA2);
    }
}