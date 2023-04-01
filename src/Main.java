import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Veiculo fuca = new Veiculo();
        fuca.setModelo("Vw Fusca");
        fuca.setCor("Preto");
        fuca.setPlaca("ARY 1987");

        //jeitos top de fazer coisas mais faceis

        Carreta carreta = new Carreta();
        carreta.setCor("Azul");
        carreta.setModelo("Feneme");
        carreta.setPlaca("Azy 4231");

        List<Veiculo> estacionamento =new LinkedList<>();
        estacionamento.add(fuca);
        estacionamento.add(carreta);

        //lista facilitou top

        for (Veiculo v:estacionamento){
            System.out.println(v);
        }
        //polimorfismo pica

    }
}