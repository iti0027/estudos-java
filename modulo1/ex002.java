import java.util.Scanner;

public class ex002{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Por favor, insira o seu nome.");
        String nome = sc.nextLine();
        System.out.println("Agora insira a sua idade.");
        int idade = sc.nextInt();

        if (idade <= 18){
            System.out.println("Você ainda não tem idade o suficiente para tirar a habilitação. Volte quando for de maior :)");
        } else{
            System.out.println("Você já pode tirar a habilitação :)");
        }
    }
}