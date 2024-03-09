public class Conta {
    private double saldo;
    private double limite;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "INFOS DA CONTA \n" +
                "Saldo R$ " + this.saldo + "\n" +
                "Limete R$ " + this.limite + "\n";
    }

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }
}
