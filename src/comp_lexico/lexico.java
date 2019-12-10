package comp_lexico;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class lexico {
    
    public int estado;
    public boolean fim;
    public String tipo;
    String token = "";
    
    public void lerCaractere() throws IOException{
        String linha;
        String frase1 = "";
        List<String> pr = new ArrayList<>();
        
        try {
            FileReader arquivo1 = new FileReader("src/textos/palavras_reservadas.txt");
            BufferedReader br1 = new BufferedReader(arquivo1);
            while ((linha = br1.readLine()) != null) {
                pr.add(linha);
            }
            FileReader arquivo2 = new FileReader("src/textos/codigo_teste.txt");
            BufferedReader br2 = new BufferedReader(arquivo2);
            while(br2.ready()){
                frase1 += br2.readLine() + "\n";
            }    
        }catch(IOException e){}
        
        estado = 0;
        fim = false;
        for (String caractere : frase1.split("")){
            analise_lexica(caractere);
            
            if(fim == true) {
                switch(estado){
                    case 1: 
                        verifica_palavra_reservada(token, pr); 
                        print_saida(tipo, token); break;
                    case 2: 
                        verifica_palavra_reservada(token, pr); 
                        print_saida(tipo, token); break;
                    case 3: tipo = "dig"; print_saida(tipo, token); break;
                    case 4: tipo = "simb"; print_saida(tipo, token); break;
                    case 5: tipo = "dig"; print_saida(tipo, token); break;
                    case 7: tipo = "dig"; print_saida(tipo, token); break;
                    case 8: tipo = "simb"; print_saida(tipo, token); break;
                    case 9: tipo = "simb"; print_saida(tipo, token); break;
                    case 10: tipo = "simb"; print_saida(tipo, token); break;
                    case 11: tipo = "simb"; print_saida(tipo, token); break;
                    case 12: tipo = "simb"; print_saida(tipo, token); break;
                    case 14: tipo = "comentLinha"; print_saida(tipo, token); break;
                    case 15: tipo = "simb"; print_saida(tipo, token); break;
                    case 18: tipo = "comentFim"; print_saida(tipo, token); break;
                    case 21: tipo = "comentFim"; print_saida(tipo, token); break;
                    default: tipo = "erro"; /*print_saida(tipo, token);*/ break;
                }
                if ("\n".equals(caractere) || " ".equals(caractere)){
                    estado = 0;
                    token = "";
                    fim = false;
                } else {
                    estado = 0;
                    fim = false;
                    analise_lexica(caractere);
                    token = caractere;
                }
            } else {
                if (!"\n".equals(caractere)){
                    token += caractere;    
                }
            } 
        }
    }
    
    public void analise_lexica(String caractere){
        switch(estado) {
            case 0:
                switch(caractere.toLowerCase()) {
                    case "a" : estado = 1; break;
                    case "b" : estado = 1; break;
                    case "c" : estado = 1; break;
                    case "d" : estado = 1; break;
                    case "e" : estado = 1; break;
                    case "f" : estado = 1; break;
                    case "g" : estado = 1; break;
                    case "h" : estado = 1; break;
                    case "i" : estado = 1; break;
                    case "j" : estado = 1; break;
                    case "k" : estado = 1; break;
                    case "l" : estado = 1; break;
                    case "m" : estado = 1; break;
                    case "n" : estado = 1; break;
                    case "o" : estado = 1; break;
                    case "p" : estado = 1; break;
                    case "q" : estado = 1; break;
                    case "r" : estado = 1; break;
                    case "s" : estado = 1; break;
                    case "t" : estado = 1; break;
                    case "u" : estado = 1; break;
                    case "v" : estado = 1; break;
                    case "w" : estado = 1; break;
                    case "x" : estado = 1; break;
                    case "y" : estado = 1; break;
                    case "z" : estado = 1; break;
                    
                    case "0" : estado = 3; break;
                    case "1" : estado = 3; break;
                    case "2" : estado = 3; break;
                    case "3" : estado = 3; break;
                    case "4" : estado = 3; break;
                    case "5" : estado = 3; break;
                    case "6" : estado = 3; break;
                    case "7" : estado = 3; break;
                    case "8" : estado = 3; break;
                    case "9" : estado = 3; break;
                    
                    case "-" : estado = 4; break;
                    case "+" : estado = 8; break;
                    case "<" : estado = 9; break;
                    case ":" : estado = 10; break;
                    case ">" : estado = 10; break;
                    case "." : estado = 11; break;
                    case "," : estado = 11; break;
                    case ";" : estado = 11; break;
                    case "*" : estado = 11; break;
                    case "(" : estado = 11; break;
                    case ")" : estado = 11; break;
                    case "{" : estado = 11; break;
                    case "}" : estado = 11; break;
                    case "=" : estado = 11; break;
                    
                    case "@" : estado = 12; break;
                    case "/" : estado = 15; break;
                    default: fim = true; break;
                }break;
            case 1 :
                switch(caractere.toLowerCase()) {
                    case "a" : estado = 1; break;
                    case "b" : estado = 1; break;
                    case "c" : estado = 1; break;
                    case "d" : estado = 1; break;
                    case "e" : estado = 1; break;
                    case "f" : estado = 1; break;
                    case "g" : estado = 1; break;
                    case "h" : estado = 1; break;
                    case "i" : estado = 1; break;
                    case "j" : estado = 1; break;
                    case "k" : estado = 1; break;
                    case "l" : estado = 1; break;
                    case "m" : estado = 1; break;
                    case "n" : estado = 1; break;
                    case "o" : estado = 1; break;
                    case "p" : estado = 1; break;
                    case "q" : estado = 1; break;
                    case "r" : estado = 1; break;
                    case "s" : estado = 1; break;
                    case "t" : estado = 1; break;
                    case "u" : estado = 1; break;
                    case "v" : estado = 1; break;
                    case "w" : estado = 1; break;
                    case "x" : estado = 1; break;
                    case "y" : estado = 1; break;
                    case "z" : estado = 1; break;
                    
                    case "0" : estado = 1; break;
                    case "1" : estado = 1; break;
                    case "2" : estado = 1; break;
                    case "3" : estado = 1; break;
                    case "4" : estado = 1; break;
                    case "5" : estado = 1; break;
                    case "6" : estado = 1; break;
                    case "7" : estado = 1; break;
                    case "8" : estado = 1; break;
                    case "9" : estado = 1; break;
                    
                    case "@" : estado = 2; break;
                    default: fim = true; break;
                }break;
            case 2: fim = true; break;
            case 3: 
                switch(caractere.toLowerCase()) {
                    case "0" : estado = 5; break;
                    case "1" : estado = 5; break;
                    case "2" : estado = 5; break;
                    case "3" : estado = 5; break;
                    case "4" : estado = 5; break;
                    case "5" : estado = 5; break;
                    case "6" : estado = 5; break;
                    case "7" : estado = 5; break;
                    case "8" : estado = 5; break;
                    case "9" : estado = 5; break;
           
                    case "," : estado = 6; break;
                    default: fim = true; break;
            }break;
            case 4: 
                switch(caractere.toLowerCase()) {
                    case "0" : estado = 3; break;
                    case "1" : estado = 3; break;
                    case "2" : estado = 3; break;
                    case "3" : estado = 3; break;
                    case "4" : estado = 3; break;
                    case "5" : estado = 3; break;
                    case "6" : estado = 3; break;
                    case "7" : estado = 3; break;
                    case "8" : estado = 3; break;
                    case "9" : estado = 3; break;
                    
                    case "-" : estado = 11; break;
                    default: fim = true; break;
            }break;
            case 5: 
                switch(caractere.toLowerCase()) {
                    case "0" : estado = 3; break;
                    case "1" : estado = 3; break;
                    case "2" : estado = 3; break;
                    case "3" : estado = 3; break;
                    case "4" : estado = 3; break;
                    case "5" : estado = 3; break;
                    case "6" : estado = 3; break;
                    case "7" : estado = 3; break;
                    case "8" : estado = 3; break;
                    case "9" : estado = 3; break;
                    
                    case "," : estado = 6; break;
                    default: fim = true; break;
            }break;
            case 6: 
                switch(caractere.toLowerCase()) {
                    case "0" : estado = 7; break;
                    case "1" : estado = 7; break;
                    case "2" : estado = 7; break;
                    case "3" : estado = 7; break;
                    case "4" : estado = 7; break;
                    case "5" : estado = 7; break;
                    case "6" : estado = 7; break;
                    case "7" : estado = 7; break;
                    case "8" : estado = 7; break;
                    case "9" : estado = 7; break;
                    default: fim = true; break;
            }break;
            case 7: 
                switch(caractere.toLowerCase()) {
                    case "0" : estado = 7; break;
                    case "1" : estado = 7; break;
                    case "2" : estado = 7; break;
                    case "3" : estado = 7; break;
                    case "4" : estado = 7; break;
                    case "5" : estado = 7; break;
                    case "6" : estado = 7; break;
                    case "7" : estado = 7; break;
                    case "8" : estado = 7; break;
                    case "9" : estado = 7; break;
                    default: fim = true; break;
            }break;
            case 8: 
                switch(caractere.toLowerCase()) {
                    case "+" : estado = 11; break;
                    default: fim = true; break;
            }break;
            case 9: 
                switch(caractere.toLowerCase()) {
                    case ">" : estado = 11; break;
                    case "=" : estado = 11; break;
                    default: fim = true; break;
            }break;
            case 10: 
                switch(caractere.toLowerCase()) {
                    case "=" : estado = 11; break;
                    default: fim = true; break;
            }break;
            case 11: fim = true; break;
            case 12: 
                switch(caractere.toLowerCase()) {
                    case "@" : estado = 13; break;
                    default: fim = true; break;
            }break;
            case 13: 
                switch(caractere.toLowerCase()) {                    
                    case "\n" : estado = 14; break;
                    default: break;
            }break;
            case 14:
                switch(caractere.toLowerCase()) {
                    default: fim = true; break;
            }break;
            case 15: 
                switch(caractere.toLowerCase()) {
                    case "/" : estado = 16; tipo = "comentInicio"; 
                    token += caractere; print_saida(tipo, token); break;
                    case "*" : estado = 19; tipo = "comentInicio"; 
                    token += caractere; print_saida(tipo, token); break;
                    default: fim = true; break;
            }break;
            case 16: 
                switch(caractere.toLowerCase()) {
                    case "/" : estado = 17; break;
                    default: estado = 16; token = ""; break;
            }break;
            case 17: 
                switch(caractere.toLowerCase()) {
                    case "/" : estado = 18; break;
                    default: estado = 16; token = ""; break;
            }break;
            case 18: fim = true; break;
            case 19: 
                switch(caractere.toLowerCase()) {
                    case "*" : estado = 20; break;
                    default: estado = 19; token = ""; break;
            }break;
            case 20: 
                switch(caractere.toLowerCase()) {
                    case "/" : estado = 21; break;
                    default: estado = 19; token = ""; break;
            }break;
            case 21: fim = true; break;   
        } 
    }
    
    public void verifica_palavra_reservada(String token, List pr){
        for (int i = 0; i < pr.size(); i++) {
            if(token.equals(pr.get(i))){
                tipo = "reser";
                break;
            } else {
                tipo = "ident";
            }
        }   
    }
    
    public void print_saida(String tipo, String token){
        switch(tipo) {
            case "ident": 
                System.out.println("Identificador: " + token); break;
            case "reser":
                System.out.println("Palavra Reservada: " + token); break;
            case "dig":
                System.out.println("Dígito: " + token); break;
            case "simb":
                System.out.println("Símbolo Especial: " + token); break;
            case "comentLinha":
                System.out.println("Comentário de uma linha: " + token); break;
            case "comentInicio":
                System.out.println("Início de Comentário: " + token); break;
            case "comentFim":
                System.out.println("Fim de Comentário: " + token); break;           
            default:
                System.out.println("ERRO: Token inválido"); break;  
        } 
    }
}