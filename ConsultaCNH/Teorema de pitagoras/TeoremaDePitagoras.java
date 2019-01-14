package teorema.de.pitagoras;

public class TeoremaDePitagoras {

    public static void main(String[] args) {
         //variaveis   
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;

        int v1 = 1;
        int v2 = 2;
        int v3 = 3;

        int cont = 1;

        int r1 ;
        int r2 ;
        int r3 ;
       
        int tt = 0 ;
        int not = 0 ;
        //Código 
        for (; cont <= 50; cont++) {

            System.out.println("Procura por triângulos número: " + cont);
            System.out.println(n1 + " x " + v1 + "= " + (n1 * v1));
            System.out.println(n2 + " x " + v2 + "= " + (n2 * v2));
            System.out.println(n3 + " x " + v3 + "= " + (n3 * v3));

            r1 = (n1 * v1);
            r2 = (n2 * v2);
            r3 = (n3 * n3);

            if ((r1 + r2 == r3)) {
                System.out.println("Achamos um triângulo retângulo!!!!!");
                
                tt++;
                
            } else {
                System.out.println("Ainda não achamos um triângulo retângulo");
                
                not++;
            }

            System.out.println("------------------------------------------");

            // Contadores
            
            v1++;
            v2++;
            v3++;

            n1++;
            n2++;
            n3++;
        }
       System.out.println("Entre 1 e 50 existem "+tt+" triângulos retângulos e "+not+" outros triângulos");
    }

}
