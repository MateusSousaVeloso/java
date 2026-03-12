public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo Veiculo1 = new Veiculo("Fusca", "ABC-1234");
        Veiculo Veiculo2 = new Veiculo("Corolla", "AAA-1111");

        Veiculo1.acelerar();
        Veiculo1.abastecer();
        Veiculo2.acelerar();
        Veiculo2.abastecer();
        System.out.println("Game over...");
    }
}
