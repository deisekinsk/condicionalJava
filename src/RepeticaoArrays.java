public class RepeticaoArrays {

    int count = 0;

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
    
}
