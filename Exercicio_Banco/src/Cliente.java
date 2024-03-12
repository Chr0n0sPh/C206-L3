import java.security.PublicKey;

public class Cliente{
    private String nome;
    private String cpf;
    private Conta conta;

    public Conta getConta() {
        return conta;
    }

    public boolean sacarDinheiro(double valor){
        if(valor > this.conta.getSaldo()) {
            System.out.println("Saldo Insuficiente!");
            return false;
        }else{
            double novoSaldo = this.conta.getSaldo() - valor;
            this.conta.setSaldo(novoSaldo);
            return true;
        }
    }

    public boolean depositarDinheiro(double valor){
        double novoValor = this.conta.getSaldo() + valor;
        this.conta.setSaldo(novoValor);
        return true;
    }

    public boolean comprarComCredito(double valor){
        if(valor > this.conta.getLimite() || valor > this.conta.getSaldo())
        {
            System.out.println("Saldo ou Limite Insuficiente para realizar a operação!");

            return false;
        }else{
            //Calculando o novo saldo
            double novoSaldo = this.conta.getSaldo() - valor;
            this.conta.setSaldo(novoSaldo);

            //Calculando novo limite
            double novoLimite = this.conta.getLimite() - valor;
            this.conta.setLimite(novoLimite);

            System.out.println("Transação Aprovada!");
            return true;
        }
    }

    public boolean transferir(Conta contaParaReceber,double valor){
        if(valor > this.conta.getSaldo()){
            System.out.println("Saldo Insuficiente para Realizar a Operação!");
            return false;
        }else{
            double novoSaldo = this.conta.getSaldo() - valor;
            this.conta.setSaldo(novoSaldo);

            double valorRecebido;
            valorRecebido = contaParaReceber.getSaldo()+valor;
            contaParaReceber.setSaldo(valorRecebido);

            System.out.println("Trasnferência Efetuada");
            return true;
        }
    }

    @Override
    public String toString() {
        return "INFOS DO CLIENTE\n" +
                "Nome: " + this.nome + "\n" +
                "CPF: " + this.cpf + "\n" +
                this.conta;
    }

    public Cliente(String nome, String cpf, double saldo, double limite){
        this.nome = nome;
        this.cpf = cpf;
        this.conta = new Conta(saldo,limite);
    }
}
