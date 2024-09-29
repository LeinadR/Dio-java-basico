import java.util.Scanner;

public class DatasParaDias {
   public static void main(String[] args){

      try (Scanner scanner = new Scanner(System.in)) {

      System.out.println("Digite a quantidade de anos: ");
      int anos = scanner.nextInt(); 

      System.out.println("Digite a quantidade de meses: ");
      int meses = scanner.nextInt();

      System.out.println("Digite a quantidade de dias: ");
      int dias = scanner.nextInt();

      int total = (anos * 365) + (meses * 30) + dias;

      System.out.println("O número total de dias é: " + total);
      
      }
   }

}