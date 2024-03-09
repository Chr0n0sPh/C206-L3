//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Craindo um Cliente
        Cliente cliente1 = new Cliente("Paulo","132.037.366-67",3500.00,2000.00);
        Cliente cliente2 = new Cliente("Rita","157.458.789-99",17000.00,5000.00 );

        //Mostrando as informações das contas criadas
        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());

        //Realizando operação de saque
        cliente1.sacarDinheiro(500.00);
        System.out.println(cliente1.toString());

        //Realizando operação de deposito
        cliente1.depositarDinheiro(500.00);
        System.out.println(cliente1.toString());

        //Realizando compra com o credito
        cliente2.comprarComCredito(6000.00);
        cliente1.comprarComCredito(1000.00);

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());

        //Realizando operação de transferencia
        cliente2.transferir(cliente1,17000);

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
    }
}