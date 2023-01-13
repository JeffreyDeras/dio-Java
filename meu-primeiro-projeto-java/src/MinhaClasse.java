import java.lang.invoke.StringConcatException;

import javax.print.DocFlavor.STRING;

public class MinhaClasse {

    public static void main(String[] args) {

        String primeiroNome = "Jeffrey";
        String segundoNome ="Barbosa";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
        
    }
    }
    
