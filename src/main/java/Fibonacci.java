public class Fibonacci {
    public static void main(String [] args){
        int somaAnterior = 0;
        int um = 1;
        int somaGeral = 0;

        System.out.println(somaGeral);

        while(somaGeral < 46){

            somaGeral = somaAnterior + um;

            if(somaGeral < 46){
                System.out.println(somaGeral);
            }

            somaAnterior = um;
            um = somaGeral;
        }
    }
}