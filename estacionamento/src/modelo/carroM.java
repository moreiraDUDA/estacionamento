package modelo;

public class carroM {
    private String nome_cliente;
    private String nome_funcionario;
    private String tempo;
    private String placa;

    public carroM() {
        this.nome_cliente = " ";
        this.nome_funcionario = " ";
        this.tempo = " ";
        this.placa = " ";
    }
    
    public carroM(String nome_cliente, String nome_funcionario, String tempo, String placa) {
        this.nome_cliente = nome_cliente;
        this.nome_funcionario = nome_funcionario;
        this.tempo = tempo;
        this.placa = placa;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getNome_funcionario() {
        return nome_funcionario;
    }

    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
}









































