import java.util.Scanner;

public class EstruturasRepeticao {

    boolean verificaRepeticao = true;
    Scanner recebeValor = new Scanner(System.in);
    int ANO_2023 = 2023;
    int enumeraEntrada = 0;
    int contador = 0;


    public void incrementoDecremento(int num){
        System.out.println("PRÉ: " + ++num);
        System.out.println("PÓS: " + num++);
        System.out.println("ATUALIZADO: " + num);
    }

    public void nomeIdade(String nome, int anoNascimento){        
        
        while (verificaRepeticao) {
            
            System.out.print("Insira seu nome (0 = encerra o programa) ");
            nome = recebeValor.next();
            if (nome.equals("0")) break;

            System.out.print("Insira seu ano de nascimento ");
            anoNascimento = recebeValor.nextInt();
            int calculaIdade = ANO_2023 - anoNascimento;
            System.out.println(nome +", "+ calculaIdade);            
            
        }      
      
    }

    public void recebeNota(int insereNota){
        System.out.println("Insira uma nota de 0 a 10: ");    
        insereNota = recebeValor.nextInt();
       
        while(insereNota <0 || insereNota>10){
            System.out.println("Valor inválido.Insira novamente: ");
            insereNota = recebeValor.nextInt();
        }
        
        System.out.println("Você inseriu: "+insereNota);
    }
    
    public void notaMaiorEmedia(int insereNota){
        int armazenaMaior = 0;
        int soma = 0;
        
        
        do{
            System.out.print("Insira suas notas (5 valores): \n"+ ++enumeraEntrada +". ");  

            insereNota = recebeValor.nextInt();
            contador++;
            
            if(insereNota > armazenaMaior){
                armazenaMaior = insereNota;
            }

            soma = soma +insereNota;            

        }while(contador < 5);
        
        int media = soma / contador;

        System.out.println("O maior número é " +armazenaMaior+ ", e a média é " + media);
        

    }

    public void verificaParImpar(int quantidadeValores, int insereValor){
        
        int contadorPares = 0;
        int contadorImpares = 0;
        
        System.out.println("Quantos valores serão inseridos?");
        quantidadeValores = recebeValor.nextInt();        

        do{
            System.out.print("Insira valor:\n"+ ++enumeraEntrada +". ");
            insereValor = recebeValor.nextInt();            
            contador++;
            // % mod verifica o resto, / divisão
            if (insereValor % 2 == 0){
                contadorPares++;
            }else{
                contadorImpares++;
            }

        }while(contador < quantidadeValores);

        System.out.println("A quantidade de pares é " + contadorPares + " e ímpares " + contadorImpares);

    }
    
}
