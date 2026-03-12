public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo Veiculo1 = new Veiculo();
        System.out.println("Veiculo 1");
        Veiculo1.SetCombustivel(100);
        Veiculo1.SetGastoKM(20);

        Veiculo1.Percorrer1KM();
        Veiculo1.Reabastecer();
        ///////////////////////////////////////////////
        System.out.println("\nVeiculo 2");
        Veiculo Veiculo2 = new Veiculo();
        Veiculo2.SetCombustivel(8);
        Veiculo2.SetGastoKM(10);

        Veiculo2.Percorrer1KM();
        Veiculo2.Reabastecer();
    }
}
