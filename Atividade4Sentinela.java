import java.util.Scanner;
import java.util.Locale;

public class Atividade4Sentinela {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite Tempos Em Minutos (Digite -1 Para Encerrar).");
        System.out.println("Dica: Valores Negativos Diferentes De -1 Serão Considerados Inválidos.\n");

        double soma = 0.0;
        int contValidos = 0;

        while (true) {
            System.out.print("Informe Um Tempo: ");
            double tempo = entrada.nextDouble();

            // Sentinela: Quando O Usuário Digita -1, O Programa Encerra A Entrada De Dados.
            if (tempo == -1) {
                break;
            }

            // Validação: Tempo Não Pode Ser Negativo (Exceto O -1 Que É O Encerramento).
            if (tempo < 0) {
                System.out.println("Tempo Inválido. Tente Novamente.");
                continue;
            }

            soma += tempo;
            contValidos++;
        }

        System.out.println("\n=== Resultados ===");
        System.out.println("Quantidade De Tempos Válidos: " + contValidos);

        if (contValidos > 0) {
            double media = soma / contValidos;
            System.out.println("Soma Dos Tempos: " + String.format("%.2f", soma));
            System.out.println("Média Dos Tempos: " + String.format("%.2f", media));
        } else {
            System.out.println("Nenhum Tempo Válido Foi Informado.");
        }

        entrada.close();
    }
}