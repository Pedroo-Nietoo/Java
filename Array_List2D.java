import java.util.*;

public class Array_List2D{
    public static void main(String[] args){

        ArrayList<ArrayList<String>> listaGeral = new ArrayList();
        
        ArrayList<String> listaPadaria = new ArrayList();
        listaPadaria.add("queijo");
        listaPadaria.add("pão");
        listaPadaria.add("bolacha");

        ArrayList<String> listaProdutos = new ArrayList();
        listaProdutos.add("batata");
        listaProdutos.add("feijão");
        listaProdutos.add("arroz");

        ArrayList<String> listaBebidas = new ArrayList();
        listaBebidas.add("água");
        listaBebidas.add("coca-cola");

        listaGeral.add(listaPadaria);
        listaGeral.add(listaProdutos);
        listaGeral.add(listaBebidas);

        System.out.println(listaGeral); //Lista tudo
        //System.out.println(listaGeral.get(0)); Lista a primeira ArrayList
        //System.out.println(listaGeral.get(0).get(0)); Lista o primeiro item da primeira ArrayList
    }
}