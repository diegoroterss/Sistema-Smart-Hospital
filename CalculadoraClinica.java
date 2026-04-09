public class CalculadoraClinica {
    
    public static void main(String[] args) {
        double pesoPaciente = 85.5; // Exemplo de peso do paciente
        double alturaPaciente = 1.75; // Exemplo de altura do paciente

        double imcFinal = calcularIMC(pesoPaciente, alturaPaciente);
        System.out.println("O IMC do paciente é: " + imcFinal);
    }

    public static double calcularIMC(double peso, double altura) {
        double resultado = peso / (altura * altura); // Fórmula do IMC
        return resultado;
    }
}
