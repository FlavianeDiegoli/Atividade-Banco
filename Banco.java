class Conta {
    int numeroConta;
    String titular;
    Double saldo;

    Boolean secar(double valor){
        saldo -= valor;
    }
    
    void depositar(double valor){
        saldo += valor;
    }

    void transferir(Conta contadestino, double valor){
        saldo -= valor;
        contadestino.saldo += valor;
    }
     
    
}

 class Programa{
     public static void main(String[] args) {
        Conta conta = new Conta();
        conta.numeroConta = 1;
        conta.titular = "Bebela";
        conta.saldo = 200 ;


        System.out.println(conta);
        System.out.println(conta.numeroConta);
        System.out.println(conta.titular);
        System.out.println(conta.saldo);



        
    }

}