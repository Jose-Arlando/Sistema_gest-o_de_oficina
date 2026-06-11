package PROJETO02;

public class Cliente {
    private int id;
    private String nome;
    private String tel;
    private String cpf;

    public Cliente(int id, String nome, String tel, String cpf) {
        this.id = id;
        this.nome = nome;
        this.tel = tel;
        this.cpf = cpf;
    }

    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public String getTel(){
        return tel;
    }
    public String getCpf(){
        return cpf;
    }
}
