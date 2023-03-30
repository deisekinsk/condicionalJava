import java.util.Random;
import java.util.Scanner;

public class RepeticaoArrays {

    int count = 0;
    Scanner recebeValor = new Scanner(System.in);
    Random geraRandom = new Random();


    public void ordemInversa() {
        System.out.print("\nImprime ordem inversa\n Valores: {");

        int[] arrayValores = {0, -5, 50, 8, 4};
        int comprimento = arrayValores.length;

        for(int i = 0; i<comprimento; i++){
            System.out.print(arrayValores[i] + ", ");

        }

        System.out.print("}\n Invertido: {");


        for (int j = comprimento-1; j >= 0; j--){
            System.out.print(arrayValores[j] + ", ");

        }

        System.out.println("}");

        
    }
    
    public void consoantes(){
        
        String[] arrayConsoantes = new String[6];
        int comprimento = arrayConsoantes.length;
        int quantidadeConsoantes=0; 

        for(count = 0; count<comprimento; count++){
             
            System.out.println("Insira uma letra:");
            String letra = recebeValor.next();
            
            if( !(letra.equalsIgnoreCase("a") |
            letra.equalsIgnoreCase("e") |
            letra.equalsIgnoreCase("i") |
            letra.equalsIgnoreCase("o") |
            letra.equalsIgnoreCase("u")) ) {
                arrayConsoantes[count] = letra;
                quantidadeConsoantes++;

            };          

        }

        System.out.println("Imprimi consoantes:");

        //forEach
        for(String consoante :arrayConsoantes){
            if(consoante != null){
            System.out.print(consoante+" ");
            }
        }

        System.out.println("\nNº consotantes:"+quantidadeConsoantes);
    }

    public void numerosAleatorios(){

        int [] arrayNumeros = new int[20];

        int comprimento = arrayNumeros.length;

        for (count = 0; count < comprimento; count++){
            int armazenaNumeros = geraRandom.nextInt(100);
            arrayNumeros[count] = armazenaNumeros;            
        }

        System.out.println("20 números aleatórios:");
        for (int armazenaNumeros : arrayNumeros) {
            System.out.print(armazenaNumeros+ " ");
        }

        System.out.println("\nNúmeros Sucessores:");
        for (int armazenaNumeros : arrayNumeros) {
            System.out.print(++armazenaNumeros + " ");
        }
    }

    public void arrayMultidimensional(){
        //cria array multidimensional
        int [][] arrayMultidimensional = new int [4][4];

        int comprimento = arrayMultidimensional.length;
        

        //acessar a linha
        for (int linhas=0; linhas < comprimento; linhas++) {
            //percorrer colunas das linhas
            int comprimentoDaLinha = arrayMultidimensional[linhas].length;
            
            for (int colunas = 0; colunas < comprimentoDaLinha; colunas++ ){
                arrayMultidimensional[linhas][colunas] = geraRandom.nextInt(9);
                //System.out.print("\n"+arrayMultidimensional);
            }
            
        }

        System.out.println("\nArray multidimensional");
        //acessando cada elemento da linha !!!
            for (int[] elementoLinha : arrayMultidimensional) {
                for (int elementoColuna : elementoLinha) {
                    if(elementoColuna % 2 == 0){
                        System.out.print("K ");
                        }else{
                        System.out.print(elementoColuna + " ");
                    }
                }
                //Quebra de coluna dentro do for
                System.out.println();
            }      

    }

}
