import java.util.Scanner;

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
        //fluxo de decisão
       if (trueA != falseA){
        System.out.println("Verdadeiro");
       }else if(trueA == falseA){
        System.out.println("Erro de compilação");
       }else{
        System.out.println("Falso");
       }
       System.out.println("Resultado:"+(i1 == i2) +","+ (c1 ==c2)+","+ (s1 ==s2));

    }

    public static void operadoresLogicos() {
        boolean carteiraCNHA = false;
        boolean carteiraCNHB = true;
        boolean carteiraCNHC = true;
        boolean carteiraCNHD = true;
        
        
        System.out.println("\n*** OPERADORES LÓGICOS\n");
        //fluxo de decisão
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
      
        //fluxo de decisão
       if( salarioBaixo = rendaPorPessoa){
        System.out.println(salarioBaixo + " | Recebe auxílio");

       } else{
        System.out.println(salarioBaixo + " | Não recebe auxílio com renda familiar de R$" + rendaFamiliar + ", pois esse valor dividido por " + quantidadePessoas + " é " + calculoPorPessoa + ", sendo acima de R$105,00 por pessoa." );
       }
        
        
    }

    public static void controleFluxoBonus(double salario, double mesesTrabalhados) {
    //operador ternário
    //Recebe bônus de 300.00 a cada 3 meses trabalhaos && salario maior que 600,00.
    boolean salarioRegular = salario > 600.00;
    boolean verificaMeses = mesesTrabalhados>=3;
    boolean verificaBonus = salarioRegular && verificaMeses;
    
    double calculoMesesTrabalhados = mesesTrabalhados/3;
    double valorBonus = calculoMesesTrabalhados*300.00;


    String bonus =  verificaBonus ? "Você receberá R$"+valorBonus+" de bonus." : "Não possui critérios para receber o bônus.";

    System.out.println(bonus);

    }

    public static void rodizioSaoPaulo(int diaDaSemana) {
        
        switch (diaDaSemana) {
        case 1:
            System.out.println("Segunda: Proibido placas final 1 e 2.");
            break;
        case 2:
            System.out.println("Terça: Proibido placas final 3 e 4.");
            break;
        case 3:
            System.out.println("Quarta: Proibido placas final 5 e 6.");
            break;
        case 4:
            System.out.println("Quinta: Proibido placas final 7 e 8.");
            break;
        case 5:
            System.out.println("Sexta: Proibido placas final 9 e 10.");
            break;
        case 6 & 7:
            System.out.println("Sábado e Domingo não possui restrição");
            break;
        default:
            System.out.println("Número inválido. Exemplo: 1 = segunda.");
        }
    }
  

    
    public static void main(String[] args) throws Exception {
        operadoresRelacionais();
        operadoresLogicos();
        receberAuxilioBrasil(500.00,5);
        controleFluxoBonus(600.00,4);
        rodizioSaoPaulo(8);
        
        System.out.println("\n*** ESTRUTURA DE REPETIÇÃO\n");
        try (//Usa Scanner para entrada de valor pelo usuário
        Scanner recebeValor = new Scanner(System.in)) {
            //Objetos que chamam as classes
            EstruturasRepeticao estruturasRepeticao  = new EstruturasRepeticao();
            RepeticaoArrays repeticaoArrays = new RepeticaoArrays();
            
            //Chama os métodos das outras classes
            System.out.println("Insira um número inteiro");
            estruturasRepeticao.incrementoDecremento(recebeValor.nextInt());
            //estruturasRepeticao.nomeIdade(null, 0);
            //estruturasRepeticao.recebeNota(0);
            //estruturasRepeticao.notaMaiorEmedia(0);
            //estruturasRepeticao.verificaParImpar(0, 0);
            //estruturasRepeticao.tabuada(0);
            estruturasRepeticao.fatorial(0);
            repeticaoArrays.ordemInversa();
            repeticaoArrays.consoantes();
            repeticaoArrays.numerosAleatorios();
            repeticaoArrays.arrayMultidimensional();
        }



        
    }
}
