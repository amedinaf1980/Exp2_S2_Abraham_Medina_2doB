package models;

import java.util.Scanner;

public abstract class Cuenta {
	protected int numeroCuenta;
	protected int saldo;

	public Cuenta(int numeroCuenta, int saldo) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}

	public void mostrarInformacionCuenta() {
		System.out.println("N° Cuenta: " + this.numeroCuenta);
		System.out.println("Saldo    : " + this.saldo);
	}

	public abstract boolean depositar(int monto, Scanner scanner);

	public abstract boolean girar(int monto, Scanner scanner);

	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	
	public int consultarSaldo() {
		return saldo;
	}
}