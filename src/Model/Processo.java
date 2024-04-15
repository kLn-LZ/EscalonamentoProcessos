package Model;

public class Processo {

    public String Nome;
    public int QtdRetornos;


    @Override
    public String toString() {
        String ret = "Processo - " + Nome + " Retornos - " + QtdRetornos;

        return ret;
    }

}
