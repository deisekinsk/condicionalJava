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
        
        
        
        System.out.println("\n*** OPERADORES LÓGICOS\n");

        
    }



    
    public static void main(String[] args) throws Exception {
        operadoresRelacionais();
        operadoresLogicos();
    }
}
