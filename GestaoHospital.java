public class GestaoHospital {
     // VARIÁVEL DE CLASSE (Escopo Global/Classe)
    // Todos os métodos podem ver e alterar esta variável.
    static int stockOxigenio = 500; 

    public static void main(String[] args) {
        int pedidoPaciente = 20; // LOCAL ao main
        
        usarOxigenio(pedidoPaciente);
        System.out.println("Stock atualizado no mural: " + stockOxigenio);
    }

    public static void usarOxigenio(int quantidade) {
        // 'quantidade' é LOCAL (parâmetro)
        // 'novaReserva' é LOCAL a este método
        int novaReserva = stockOxigenio - quantidade; 
        
        stockOxigenio = novaReserva; // Altera a global
        
        if (stockOxigenio < 100) {
            String alerta = "CRÍTICO"; // LOCAL ao bloco IF
            System.out.println("Status: " + alerta);
        }
        // System.out.println(alerta); // ERRO! 'alerta' morreu ao fechar o IF.
}
}
