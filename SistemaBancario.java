import java.util.Scanner;
 public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double saldo = 0.0;
        int opcao;

        do {
            System.out.println("Seja bem-vindo!");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Saldo");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser depositado: ");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Valor inválido!");
                    }
                    break;

                    case 2:
                        System.out.println("Digite o valor a ser sacado: ");
                        double saque = scanner.nextDouble();
                        if (saque > 0 && saque <= saldo) {
                            saldo -= saque;
                            System.out.println("saque realizado com sucesso!");
                        } else {
                            System.out.println("Saldo iinsuficiente ou valor inválido!");
                        }
                        break;

                        case 3:
                            System.out.println("Saldo Atual: " + saldo);
                            break;
                    
                            case 4:
                                System.out.println("Encerrando...");
                                break;

                                default:
                                    System.out.println("Opção inválida!");
                    }

                } while (opcao != 4);

                scanner.close();
            }
        }
                        