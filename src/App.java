import java.util.Scanner;

public class App {

    // Início do Programa
    public static void main(String[] args) throws Exception {

             // Declaração de Variaveis
     double area;
     double latas;
     double custo;
     
     // Solicitação de Dados
     Scanner teclado = new Scanner(System.in);
     System.out.println("Informe a área em metros quadrados a ser pintada: ");
     area = teclado.nextDouble();
     teclado.close();

     // Calcular Latas e Custo
     latas = Math.ceil(area / 54.0);
     custo = latas * 80;

     // Exibir a Resposta para o Usuário
     System.out.println("Você precisará de " + latas + " latas de tinta");
     System.out.println("O custo total será de R$" + custo);
    }
}
    
    
