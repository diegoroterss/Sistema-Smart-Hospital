import java.util.Scanner;
import java.util.Locale;

public class Atividade3Validacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade de amostras (Maior Que Zero): ");
        int amostras = entrada.nextInt();

        while (amostras <= 0) {
            System.out.println("Valor inválido! Digite novamente");
            amostras = entrada.nextInt();
        }

        double somaTempo = 0.0;

        for (int i = 1; i <= amostras; i++) {
            System.out.print("Tempo Da Amostra " + i + " (Minutos, >= 0): ");
            double tempo = entrada.nextDouble();
        
            while (tempo < 0) {
                System.out.println("Tempo inválido! Digite novamente");
                tempo = entrada.nextDouble();
            }
            
            somaTempo += tempo;
        }

        double mediaTempo = somaTempo / amostras;
        System.out.println("Tempo Médio (Min): " + String.format("%.2f", mediaTempo));

        entrada.close();
    }
}