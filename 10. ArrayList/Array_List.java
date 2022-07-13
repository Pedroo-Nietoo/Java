import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args){
        //ArrayList = uma array redimensionável
        //            elementos podem ser adicionados e removidos depois da fase de compilação
        //            armazena tipos de dados de referência

        ArrayList<String> food = new ArrayList();

        food.add("pizza");
        food.add("hambúrger");
        food.add("cachorro-quente");

        food.set(0, "sushi");
        food.remove(2);
        //food.clear();

        for(int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));}
    }
}