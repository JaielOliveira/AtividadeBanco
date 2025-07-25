package banco;

import java.util.Scanner;

class operacoes {
	
	public static void main(String[] args) {
		
		int operador;
		boolean operar = true;
		
		Conta minhaConta;
		minhaConta = new Conta();
		
		Conta conta2;
		conta2 = new Conta();
		
		
		Conta conta3;
		conta3 = new Conta();
		
		System.out.println("Olá, antes de iniciar eu preciso de alguns dados.");
		System.out.println("Como eu devo lhe chamar?");
		
		minhaConta.Titular();
		
			System.out.println(minhaConta.titular + ", digite um número correspondente a operação que deseja:");
			System.out.println("1.______Ver saldo");
			System.out.println("2.______Depositar");
			System.out.println("3.______Sacar");
			System.out.println("4.______Transferir");
			System.out.println("5.______Sair");
		
//		minhaConta.transfere();
			
		}
}