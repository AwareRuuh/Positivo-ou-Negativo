import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int num1 = sc1.nextInt();
    if (num1 > 0){       
         System.out.println("número positivo");       
         } else if (num1 < 0) {       
         System.out.println("número negativo");       
         }
  }
}