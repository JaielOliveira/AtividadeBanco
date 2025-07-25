package banco;

import java.util.Scanner;

class testeMetodos {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Criando as contas
		
		Conta minhaConta;
		minhaConta = new Conta();
		
		Conta contaPai;
		contaPai = new Conta();
		
		Conta contaMae;
		contaMae = new Conta();
		
		//Atribuindo valores nas contas
		
		//minhaConta.titular = entrada.next();
		
		contaPai.titular = "Dilmar Gomes";
		contaPai.saldo = 1000;
		
		contaMae.titular = "Lila Rodrigues";
		contaMae.saldo = 10000;
		
		entrada.close();
		
//		//Fazendo algumas operações
//		
//		minhaConta.saca(200);
//		
//		minhaConta.deposita(1000);
//		System.out.println("Saldo após o depósito:_____" + minhaConta.saldo);
//		
//		contaMae.transfere(contaPai, 5000);
	}
}