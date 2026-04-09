public class FarmaciaHospitalar {
    public static void main(String[] args) {
        calcularDosagem("Antibiótico A", 70.5);
        calcularDosagem("Analgésico B", 12.0);
    }

    public static void calcularDosagem(String nomeMedicamento, double pesoPaciente) {
        double dosagemFinal = pesoPaciente * 0.6; // Exemplo de cálculo de dosagem
        System.out.println("Medicamento: " + nomeMedicamento);
        System.out.println("Dosagem recomendada: " + dosagemFinal + "mg");
        System.out.println("-----------------------------");
    }
}
