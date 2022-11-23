import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    double diarias, dias, taxa;

    System.out.println("Quantos dias você ficou hospedado?");
    dias = entrada.nextDouble();

    diarias = (dias * 500);

    if (dias < 15) {
      taxa = (dias * 15);
      diarias += taxa;
      System.out.println("O valor total a ser pago é:" + diarias);
    } else if (dias == 15) {
      taxa = (dias * 10);
      diarias += taxa;
      System.out.println("O valor total a ser pago é:" + diarias);
    } else if (dias > 15) {
      taxa = (dias * 5);
      diarias += taxa;
      System.out.println("O valor total a ser pago é:" + diarias);
    }

  }
}