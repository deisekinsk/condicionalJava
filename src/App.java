public class App {


    public static void operadoresRelacionais() {
        int i1= 10;
        int i2= 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        char c1 = 'x';
        char c2 = 'y';
        String s1 ="Name";
        String s2 ="Name";
        boolean trueA = true;
        Boolean falseA = false;

        System.out.println("*** OPERADORES RELACIONAIS\n"+(f1 >= f2));

       if (trueA != falseA){
        System.out.println("Verdadeiro");
       }else if(trueA == falseA){
        System.out.println("Erro de compilação");
       }else{
        System.out.println("Falso");
       }

    }

    public static void operadoresLogicos() {
        boolean carteiraCNHA = false;
        boolean carteiraCNHB = true;
        boolean carteiraCNHC = true;
        boolean carteiraCNHD = true;
        
        
        System.out.println("\n*** OPERADORES LÓGICOS\n");

        if(carteiraCNHA){
            System.out.println("Candidato eliminado. Risco alto.");
        }else if(carteiraCNHB && !carteiraCNHC){
            System.out.println("Selecionado");
        }else if(!carteiraCNHD || carteiraCNHA){
            System.out.println("Aprovado");
        }else{
            System.out.println("Candidato eliminado. Fora dos critérios.");
        }
        
    }

    public static void receberAuxilioBrasil(double rendaFamiliar, int quantidadePessoas ) {
        boolean salarioBaixo = false;
        //quando a renda familiar for < que 105 por pessoa, recebe auxilio

        double calculoPorPessoa = rendaFamiliar/quantidadePessoas;

        boolean rendaPorPessoa = calculoPorPessoa <= 105.00;
      

       if( salarioBaixo = rendaPorPessoa){
        System.out.println(salarioBaixo + " | Recebe auxílio");

       } else{
        System.out.println(salarioBaixo + " | Não recebe auxílio com renda familiar de R$" + rendaFamiliar + ", pois esse valor dividido por " + quantidadePessoas + " é " + calculoPorPessoa + ", sendo acima de R$105,00 por pessoa." );
       }
        
        
        
    }



    
    public static void main(String[] args) throws Exception {
        operadoresRelacionais();
        operadoresLogicos();
        receberAuxilioBrasil(500.00,5);
    }
}
