package modelo;

public class clienteM {
    private String nomeC;
    private String rgC;
    private String telefoneC;
    private String enderecoC;
    private String placaC;
    private String carroC;

    public clienteM (){
        this.nomeC = " ";
        this.rgC = " ";
        this.telefoneC = " ";
        this.enderecoC = " ";
        this.placaC = " ";
        this.carroC = " ";
    }
    
    public clienteM(String nomeC, String rgC, String telefoneC, String enderecoC, String placaC, String carroC) {
        this.nomeC = nomeC;
        this.rgC = rgC;
        this.telefoneC = telefoneC;
        this.enderecoC = enderecoC;
        this.placaC = placaC;
        this.carroC = carroC;
    }

    public String getNomeC() {
        return nomeC;
    }

    public void setNomeC(String nomeC) {
        this.nomeC = nomeC;
    }

    public String getRgC() {
        return rgC;
    }

    public void setRgC(String rgC) {
        this.rgC = rgC;
    }

    public String getTelefoneC() {
        return telefoneC;
    }

    public void setTelefoneC(String telefoneC) {
        this.telefoneC = telefoneC;
    }

    public String getEnderecoC() {
        return enderecoC;
    }

    public void setEnderecoC(String enderecoC) {
        this.enderecoC = enderecoC;
    }

    public String getPlacaC() {
        return placaC;
    }

    public void setPlacaC(String placaC) {
        this.placaC = placaC;
    }

    public String getCarroC() {
        return carroC;
    }

    public void setCarroC(String carroC) {
        this.carroC = carroC;
    }
    
}
