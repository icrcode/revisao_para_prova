public class Veiculo {
    //atributos vvvvv
    private String modelo;
    private String cor;
    private String placa;

    //só recisa fazer essa parte se for maluco

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // essa parte só faz a comparação pra vc

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Veiculo veiculo)) return false;

        if (getModelo() != null ? !getModelo().equals(veiculo.getModelo()) : veiculo.getModelo() != null) return false;
        if (getCor() != null ? !getCor().equals(veiculo.getCor()) : veiculo.getCor() != null) return false;
        return getPlaca() != null ? getPlaca().equals(veiculo.getPlaca()) : veiculo.getPlaca() == null;
    }

    @Override
    public int hashCode() {
        int result = getModelo() != null ? getModelo().hashCode() : 0;
        result = 31 * result + (getCor() != null ? getCor().hashCode() : 0);
        result = 31 * result + (getPlaca() != null ? getPlaca().hashCode() : 0);
        return result;
    }

    //puxar o stringzinho pica
    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", placa='" + placa + '\'' +
                '}';
    }
}
