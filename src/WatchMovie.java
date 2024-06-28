import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]){
       Scanner ler = new Scanner(System.in); 
       double ingresso = 12;
       int clasFilme = 5;
       
       System.out.print("Digite quantos ingressos deseja comprar: ");
       int qtIngresso = ler.nextInt();
       
       if(ingresso<12&&clasFilme==5){
        System.out.println("Estou interessado em assistir o filme.");
       }else{
        System.out.println("Nao estou interessado em assistir o filme.");
       } 

    }
}
