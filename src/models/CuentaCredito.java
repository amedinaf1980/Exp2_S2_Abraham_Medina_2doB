package models;

import java.util.Scanner;

import utilidades.Grafico;
import utilidades.Pausa;

public class CuentaCredito extends Cuenta {

	public CuentaCredito(int numeroCuenta, int saldo) {
		super(numeroCuenta, saldo);
	}

	@Override
	public boolean depositar(int monto, Scanner scanner) {
		if (monto > 0) {
		saldo += monto;
		return true;
	}
	Grafico.formatoError("Error: El valor ingresado no es válido.");
	Pausa.pausa(scanner);
	return false;
}

	@Override
	public boolean girar(int monto, Scanner scanner) {
		if (monto <= 0) {
			Grafico.formatoError("Error: El valor ingresado no es válido.");
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
}