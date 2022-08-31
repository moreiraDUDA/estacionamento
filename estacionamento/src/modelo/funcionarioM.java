package modelo;

public class funcionarioM {
    private String nomeF;
    private String rgF;
    private String telefoneF;
    private String enderecoF;
    private String placaF;
    private String carroF;

    public funcionarioM() {
        this.nomeF = " ";
        this.rgF = " ";
        this.telefoneF = " ";
        this.enderecoF = " ";
        this.placaF = " ";
        this.carroF = " ";
    }
    
    public funcionarioM(String nomeF, String rgF, String telefoneF, String enderecoF, String placaF, String carroF) {
        this.nomeF = nomeF;
        this.rgF = rgF;
        this.telefoneF = telefoneF;
        this.enderecoF = enderecoF;
        this.placaF = placaF;
        this.carroF = carroF;
    }

    public String getNomeF() {
        return nomeF;
    }

    public void setNomeF(String nomeF) {
        this.nomeF = nomeF;
    }

    public String getRgF() {
        return rgF;
    }

    public void setRgF(String rgF) {
        this.rgF = rgF;
    }

    public String getTelefoneF() {
        return telefoneF;
    }

    public void setTelefoneF(String telefoneF) {
        this.telefoneF = telefoneF;
    }

    public String getEnderecoF() {
        return enderecoF;
    }

    public void setEnderecoF(String enderecoF) {
        this.enderecoF = enderecoF;
    }

    public String getPlacaF() {
        return placaF;
    }

    public void setPlacaF(String placaF) {
        this.placaF = placaF;
    }

    public String getCarroF() {
        return carroF;
    }

    public void setCarroF(String carroF) {
        this.carroF = carroF;
    }
    
    
}
