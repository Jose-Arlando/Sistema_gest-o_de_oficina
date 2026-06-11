package PROJETO02;

public class OS{
    private int num;
    private String data; 
    private String descricao; 
    private Veiculo veiculo;
    private Servico servico;
    private String status;
    private double valor;

    public OS(int num, String data, String descricao, Veiculo veiculo, String status, double valor, Servico servico) {
        this.num = num;
        this.data = data;
        this.descricao = descricao;
        this.veiculo = veiculo;
        this.status = status;
        this.valor = valor;
        this.servico = servico;
    }
    public int getNum() {
        return num;
    }
    public String getData() {
        return data;
    }
    public String getDescricao() {
        return descricao;
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public String getStatus() {
        return status;
    }
    public double getValor() {
        return valor;
    }
    public Servico getServico(){
        return servico;
    }

    public void setStatus(String status){
        this.status = status;
    }
}