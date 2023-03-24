public class EstruturasRepeticao {

    boolean verificaRepeticao = true;

    public void repetiu(){
        verificaRepeticao=true;
        System.out.println(verificaRepeticao);
    }

    public void incrementoDecremento(int num){
        System.out.println("PRÉ: " + ++num);
        System.out.println("PÓS: " + num++);
        System.out.println("ATUALIZADO: " + num);
    }
    
}
