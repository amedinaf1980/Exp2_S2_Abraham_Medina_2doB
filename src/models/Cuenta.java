package models;

import java.util.Scanner;

import utilidades.Grafico;
import utilidades.Pausa;

public class Cuenta {
	private int numeroCuenta;
	private int saldo;

	public Cuenta(int numeroCuenta, int saldo) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}

	public void mostrarInformacionCuenta() {
		System.out.println("N° Cuenta: " + this.numeroCuenta);
		System.out.println("Saldo    : " + this.saldo);
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public boolean depositar(int monto, Scanner scanner) {
		if (monto > 0) {
			saldo += monto;
			return true;
		}
		Grafico.formatoError("Error: El valor ingreaado no es válido.");
		Pausa.pausa(scanner);
		return false;
	}

	public boolean girar(int monto, Scanner scanner) {
		if (monto <= 0) {
			Grafico.formatoError("Error: El valor ingreaado no es válido.");
			Pausa.pausa(scanner);
			return false;
		}
		if (saldo >= monto) {
			saldo -= monto;
			return true;
		} else {
			Grafico.formatoError("Error: Saldo insuficiente para realizar el giro!");
			Pausa.pausa(scanner);
			return false;
		}
	}

	public int consultarSaldo() {
		return saldo;
	}
}