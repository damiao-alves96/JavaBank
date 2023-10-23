public class Conta {

	private String titular;
	private int numero;
	private double saldo;
	private static int total_contas;
	
	Conta(String titular, int numero) {
		this.titular = titular;
		this.numero = numero;
		Conta.total_contas++;		
	}
	
	public static int getTotalContas() {
		return Conta.total_contas;
	}

	public void transferePara(Conta destino, double valor) {
		if (sacar(valor)) // se eu conseguir sacar
			destino.depositar(valor); // irei depositar
	}

	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
		}
	}

	public boolean sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			return true; // deu certo sacar
		}
		return false;
	}

	public String getTitular() {
		return titular;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
}