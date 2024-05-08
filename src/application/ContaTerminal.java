package application;

import controller.ContaBancoController;
import model.ContaBanco;
import view.ContaBancoView;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        ContaBanco model = new ContaBanco();
        ContaBancoView view = new ContaBancoView();
        ContaBancoController controller = new ContaBancoController(model, view);

        controller.setContaAgencia(obterInformacao("Por favor, digite o número da Agência: "));
        controller.setContaNumero(obterNumeroConta("Por favor, digite o número da Conta: "));
        controller.setContaNomeCliente(obterInformacao("Por favor, digite o nome do Cliente: "));
        controller.setContaSaldo(Double.parseDouble(obterInformacao("Por favor, digite o saldo: ")));

        controller.atualizarView();
    }

    private static String obterInformacao(String mensagem) {
        System.out.println(mensagem);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static int obterNumeroConta(String mensagem) {
        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(mensagem);
            input = scanner.nextLine();
            if (!input.matches("\\d{2,}-\\d{1,}")) {
                System.out.println("Número da conta inválido. O número deve ter no mínimo dois dígitos antes do traço.");
            }
        } while (!input.matches("\\d{2,}-\\d{1,}"));
        int index = input.indexOf("-");
        return Integer.parseInt(input.substring(0, index));
    }
}
