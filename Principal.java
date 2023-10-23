public class Principal {

	public static void main(String[] args) {

		Conta damiao1 = new Conta("Damião1", 12345);
		Conta damiao2 = new Conta("Damião2", 67890);

		damiao1.depositar(100);
		damiao1.transferePara(damiao2, 70);

		System.out.println("saldo da Conta = R$ " + damiao1.getSaldo());
		System.out.println("valor transferido = R$ " + damiao2.getSaldo());
		System.out.println("Total de contas = " + Conta.getTotalContas());
	}
}