package banco;

import java.util.Scanner;

class Conta {
	
	Scanner dado = new Scanner(System.in);
	
	int numero;
	String titular;
	double saldo;
	double limite;
	String pix;
	
	//Métodos
	
	boolean saca (double quantidade) {
		if(this.saldo < quantidade) {
			System.out.println("Saldo Insuficiente para saque :c");
			System.out.println("Saldo atual:________" + this.saldo);
			return false;
		}
		
		else {
			this.saldo = this.saldo - quantidade;
			System.out.println("Saldo atual:________" + this.saldo);
			return true;	
		}
	}
	
	boolean transfere (Conta destino, double quantidade) {
		System.out.println("Digite a conta Destino:");
		System.out.println("Digite o valor:");
		quantidade = dado.nextDouble();
		if(this.saldo < quantidade) {
			System.out.println("Saldo Insuficiente para transferir :c");
			System.out.println("Saldo atual:________" + this.saldo);
			return false;
		}
		else {
			this.saldo = this.saldo - quantidade;
			destino.saldo = destino.saldo + quantidade;
			System.out.println("Transferência concluída c:");
			System.out.println("Saldo atual:________" + this.saldo);
			return true;
		}
			
	}
		
//		Método sem verificação do saldo atual
//		if (this.saldo >= quantidade) {
//			double novoSaldo = this.saldo - quantidade;
//			this.saldo = novoSaldo;
//		}
//		else System.out.println("Saldo indisponível para sacar :c");
		
	void deposita (double quantidade) {
		quantidade = dado.nextDouble();
		this.saldo += quantidade;
	}
	
	void Titular () {
		this.titular = dado.next();
	}
	
	
}