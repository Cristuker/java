package treino;

import java.util.Scanner;

public class CCNH {

    public static void main(String[] args) {
       
        
        System.out.println("-------------");
        System.out.println(" Bem - Vindo ");
        System.out.println("-------------");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a sua idade: ");
        int age = Integer.parseInt(teclado.nextLine());
        String r = teclado.nextLine();
        
            if (age < 18) {
                System.out.println("Você não precisa continuar,pois não tem idade para ter uma CNH.");
            } else {
                System.out.println("Quantos pontos você tem na carteira? ");
                int pontos = Integer.parseInt(teclado.nextLine());
                if (pontos < 20) {
                    System.out.println(nome + " você ainda pode dirigir, mas tome CUIDADO!!!");
                } else {
                    System.out.println("Você não pode mais dirigir, a sua habilitação está suspensa!");
                    System.out.println("Você quer saber se a sua CNH está cassada?");
                    r = teclado.nextLine();
                }
                if ("Sim".equalsIgnoreCase(r)) {
                    System.out.println("Você tomou alguma multa durante o período de suspensão?");
                    String rc = teclado.nextLine();
                    if ("sim".equalsIgnoreCase(rc)) {
                        System.out.println("Você estáo cassado!");
                    } else {
                        System.out.println("Você não está cassado e ficara sem o direito de dirigir por dois anos.");
                    }
                } else {
                    System.out.println("Ok, cuidado no trânsito!!");
                }
            }

        } 
        

    }


