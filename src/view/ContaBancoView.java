package view;

import java.util.Scanner;

import model.ContaBanco;

public class ContaBancoView {
	
	private Scanner scanner;
	
	public ContaBancoView() {
		scanner = new Scanner(System.in);
	}
	
	public ContaBanco oberDetalhesConta() {
		
	ContaBanco conta = new ContaBanco();
	
	System.out.println("Por favor, digite o número da Agência: ");
	conta.setAgencia(scanner.nextLine());
	
	System.out.println("Por favor, digite o número da Conta: ");
	conta.setNumero(Integer.parseInt(scanner.nextLine()));
	
	System.out.println("Por favor, digite o nome do Cliente: ");
	conta.setNomeCliente(scanner.nextLine());
	
	return conta;}
	
	public void exibirDetalhesConta(ContaBanco conta) {
		System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é "
		 + conta.getAgencia() + ", conta " + conta.getNumero() + "e seu saldo " + conta.getSaldo()
		 + " já está disponível para saque.");
	}

}
