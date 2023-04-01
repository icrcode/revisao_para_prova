public class Carreta extends Veiculo{

    // basicamente pica

    private int quantidadeDeEixo;

    public int getQuantidadeDeEixo() {
        return quantidadeDeEixo;
    }

    public void setQuantidadeDeEixo(int quantidadeDeEixo) {
        this.quantidadeDeEixo = quantidadeDeEixo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carreta carreta)) return false;
        if (!super.equals(o)) return false;

        return getQuantidadeDeEixo() == carreta.getQuantidadeDeEixo();
    } 

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getQuantidadeDeEixo();
        return result;
    }
}