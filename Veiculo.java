package PROJETO02;

public class Veiculo {
    private String placa;
    private String modelo;
    private String marca;
    private int ano;
    private Cliente cliente;

    public Veiculo(String placa, String modelo, String marca, int ano, Cliente cliente) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cliente = cliente;
    }

    // Getters
    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public Cliente getCliente() {
        return cliente;
    }
}