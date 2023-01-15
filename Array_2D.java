public class Array_2D {
    public static void main(String[] args){

        //2D array/multidimensiinal array = uma array de arrays

        String[][] carros = { 
                                {"Camaro", "BMW", "Ferrari"},
                                {"Palio", "Fiat", "Corsa"},
                                {"Lamborghini", "Tesla", "Mustang"}
                            };

        for(int i=0; i<carros.length; i++) {
            System.out.println();
            for(int j=0; j<carros[i].length; j++) {
                System.out.print(carros[i][j]+" ");}}
    }
}
        /* JEITO 2 - 2D Array
        String[][] carros = new String[3][3];

        carros[0][0] = "Camaro";
        carros[0][1] = "BMW";
        carros[0][2] = "Ferrari";
        carros[1][0] = "Palio";
        carros[1][1] = "Fiat";
        carros[1][2] = "Corsa";
        carros[2][0] = "Lamborghini";
        carros[2][1] = "Tesla";
        carros[2][2] = "Mustang";*/