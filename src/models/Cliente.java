package models;

import java.util.Scanner;

import utilidades.Grafico;
import utilidades.Pausa;

public class Cliente implements IMostrarDatos{
	private String rut;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String domicilio;
	private String comuna;
	private String telefono;
	private String tipoCuenta;
	private int numeroCuenta;
	private CuentaAhorro cuenta;

	public Cliente(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String domicilio,
			String comuna, String telefono, String tipoCuenta, int numeroCuenta) {
		this.rut = rut;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.domicilio = domicilio;
		this.comuna = comuna;
		this.telefono = telefono;
		this.tipoCuenta = tipoCuenta;
		this.numeroCuenta = numeroCuenta;
		this.cuenta = new CuentaAhorro(numeroCuenta, 0);
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public boolean registrarCliente(Scanner scanner) {
		Grafico.formatoExito("CLIENTE REGISTRADO CORRECTAMENTE");
		System.out.println(""
				      + "Rut         : " + this.rut
				    + "\nNombre      : " + nombre + " " + apellidoPaterno + " " + apellidoMaterno
					+ "\nDomicilio   : " + domicilio + ", " + comuna
					+ "\nTeléfono    : (+56 9)" + telefono
					+ "\nTipo Cuenta : " + tipoCuenta
					+ "\nN° Cuenta   : " + cuenta.getNumeroCuenta()
					+ "\nSaldo       : " + Grafico.FORMATO_DINERO.format(cuenta.consultarSaldo()));
		Pausa.pausa(scanner);
			return true;
	}
	
	@Override
	public void mostrarInformacionCliente(Scanner scanner) {
		Grafico.formatoTitulo("******** INFORMACION DEL CLIENTE ********");
		System.out.println(""
			      + "Rut         : " + this.rut
			    + "\nNombre      : " + nombre + " " + apellidoPaterno + " " + apellidoMaterno
				+ "\nDomicilio   : " + domicilio + ", " + comuna
				+ "\nTeléfono    : (+56 9)" + telefono
				+ "\nTipo Cuenta : " + tipoCuenta
				+ "\nN° Cuenta   : " + cuenta.getNumeroCuenta()
				+ "\nSaldo       : " + Grafico.FORMATO_DINERO.format(cuenta.consultarSaldo()));
		Pausa.pausa(scanner);
	}

	public String getRut() {
		return this.rut;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public String getComuna() {
		return comuna;
	}

	public String getTelefono() {
		return telefono;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}
}