import java.util.Scanner;

public class RepeticaoArrays {

    int count = 0;
    Scanner recebeValor = new Scanner(System.in);

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
}
