public class LaboratorioCentral {

    public static void main(String[] args) {
        double tempFahrenheit = 98.6;
        double tempCelsius = converterparaCelsius(tempFahrenheit);

        System.out.println("A temperatura processada é: " + tempCelsius + "°C");

        if(tempCelsius > 37.5) {
            System.out.println("Alerta: Paciente com febre!");
    }
}

public static double converterparaCelsius(double Fahrenheit) {
    double resultado = (Fahrenheit - 32) * 5.0/9.0;
    return resultado;
}
}