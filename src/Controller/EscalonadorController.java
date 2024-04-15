package Controller;

import br.edu.fateczl.fila.Fila;
import Model.Processo;

public class EscalonadorController {

    public EscalonadorController() {
        super();
    }


    public Fila escalonador(Fila f) {
        Processo process;
        while(!f.isEmpty()) {

            process = (Processo) f.remove();
            if (process.QtdRetornos > 1) {
                System.out.println(process + " Retornou");
                process.QtdRetornos = process.QtdRetornos - 1;

            }

            if (process.QtdRetornos > 1) {
                System.out.println(process + " retornou a fila");
                f.insert(process);
            }
        }

        return f;
    }

}
