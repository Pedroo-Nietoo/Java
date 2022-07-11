public class WrapperClasses{
    public static void main(String[] args){
        /* Classe Wrapper: permite tratar valores primitivos como objetos

        //Primitivo     //Wrapper
        -----------     ---------
        //boolean       //Boolean
        //char          //Character
        //int           //Integer
        //double        //Double

        "i." não tem acesso a método nenhum por ser de tipo primitivo. Ao utilizar os Wrappers, o tratamos como objetos, podendo ter acesso a métodos (x. tem acesso a métodos). Veja como funciona abaixo:*/

        int a = 1;
        Integer A = new Integer(1);

        short b = 1;
        Short B = new Short("1");

        byte c = 4;
        Byte C = new Byte("4");

        boolean d = true;
        Boolean D = new Boolean(true);

        double e = 3.14;
        Double E = new Double(3.14);

        float f = 4;
        Float F = new Float(4);

        char g = 'a';
        Character G = new Character('a');

        long h = 1;
        Long H = new Long(1);

        System.out.println(C.intValue());
        System.out.println(A.doubleValue());
        System.out.println(A.equals(B));
        
        System.out.println();
        System.out.println("----------------------------");
        System.out.println();
        
        /*Entretanto, há um jeito mais fácil de fazer isso: Autoboxing e unboxing.

        Autoboxing = conversão automática que o compilador de Java faz do valor primitivo para a classe Wrapper
        Unboxing = o contrário do autoboxing. Converte automaticamente da classe Wrapper para o seu valor primitivo.
        
        Veja funfionando abaixo:*/

        int a1 = 1; //
        Integer A1 = 1; //Autoboxing

        Short B1 = 1; //
        short b1 = B; //Unboxing

        byte c1 = 4;
        Byte C1 = 4;

        boolean d1 = true;
        Boolean D1 = true;

        double e1 = 3.14;
        Double E1 = 3.14;

        float f1 = 4;
        Float F1 = 4f;

        char g1 = 'a';
        Character G1 = 'a';

        long h1 = 1;
        Long H1 = 1L;

        //Primitivo: letra inical sempre minúscula
        //Wrapper: letra inical sempre maiúscula

        System.out.println(C1.intValue());
        System.out.println(A1.doubleValue());
        System.out.println(A1.equals(B1));
    }
}
