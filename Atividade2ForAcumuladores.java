import java.util.Scanner;
import java.util.Locale;

public class Atividade2ForAcumuladores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o número de Amostras (N > 0): ");
        int N = entrada.nextInt();
        
        double soma = 0.0;
        double MAIOR = Double.NEGATIVE_INFINITY;
        double MENOR = Double.POSITIVE_INFINITY;
        
        for (int i = 1; i <= N; i++) {
            System.out.print("Digite o Valor " + i + ": ");
            double v = entrada.nextDouble();
            
            soma += v;
            
            if (v > MAIOR) {
                MAIOR = v;
            }
            
            if (v < MENOR) {
                MENOR = v;
            }
        }
        
        double media = soma / N;
        
        System.out.println("\n=== Resultados ===");
        System.out.println("soma: " + String.format("%.2f", soma));
        System.out.println("média: " + String.format("%.2f", media));
        System.out.println("maior: " + String.format("%.2f", MAIOR));
        System.out.println("menor: " + String.format("%.2f", MENOR));
        
        entrada.close();
    }
}