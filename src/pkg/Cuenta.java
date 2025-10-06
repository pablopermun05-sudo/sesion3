package pkg;

public class Cuenta {
	String numero;
	String titular;
	Double saldo;
	
	public Cuenta(double saldo) {
		this.saldo = saldo;
	}

	public void ingresar(double i) {
		saldo += i;
	}

	public void retirar(double i) {
		saldo -= i;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
