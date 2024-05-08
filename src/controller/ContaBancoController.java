package controller;

import model.ContaBanco;
import view.ContaBancoView;

public class ContaBancoController {
    private ContaBanco model;
    private ContaBancoView view;

    public ContaBancoController(ContaBanco model, ContaBancoView view) {
        this.model = model;
        this.view = view;
    }

    public void setContaNumero(int numero) {
        model.setNumero(numero);
    }

    public int getContaNumero() {
        return model.getNumero();
    }

    public void setContaAgencia(String agencia) {
        model.setAgencia(agencia);
    }

    public String getContaAgencia() {
        return model.getAgencia();
    }

    public void setContaNomeCliente(String nomeCliente) {
        model.setNomeCliente(nomeCliente);
    }

    public String getContaNomeCliente() {
        return model.getNomeCliente();
    }

    public void setContaSaldo(double saldo) {
        model.setSaldo(saldo);
    }

    public double getContaSaldo() {
        return model.getSaldo();
    }

    public void atualizarView() {
        view.exibirDetalhesConta(model);
    }
}
