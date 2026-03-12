public class Veiculo {
    private int gastoKM;
    private int combustivel;

    void SetGastoKM(int n) {
        this.gastoKM = n;
    }

    void SetCombustivel(int n) {
        if (n > 0 && n <= 100) {
            this.combustivel = n;
        } else {

            System.out.println("Combustivel deve ser entre 0 e 100");
        }
    }

    private void GetCombustivel() {
        System.out.println("Combustivel: " + this.combustivel);
    }

    void Percorrer1KM() {
        if (this.combustivel >= this.gastoKM) {
            System.out.println("Após andar 1km");
            this.combustivel -= this.gastoKM;
            GetCombustivel();
        } else {
            System.out.println("Após tentar andar 1km");
            System.out.println("Não há combustivel o suficiente pra percorrer 1km, tente reabastecer");
        }
    }

    void Reabastecer() {
        System.out.println("Após reabastecer");
        if ((this.combustivel + (this.gastoKM * 10)) < 100) {
            this.combustivel += this.gastoKM * 10;
            GetCombustivel();

        } else {
            this.combustivel = 100;
            GetCombustivel();

        }
    }
}
