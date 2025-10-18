package pkg;

public class Cuenta {
	double saldo;

	public Cuenta(double d) {
		// TODO Auto-generated constructor stub
		saldo = d;
	}

	public Double getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	public void setSaldo(double d) {
		// TODO Auto-generated method stub
		saldo = d;
	}

	public void ingresar(double d) {
		// TODO Auto-generated method stub
		saldo += d;
	}

	public void reintegrar(double d) {
		// TODO Auto-generated method stub
		saldo -= d;
	}

}
