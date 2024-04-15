package View;


import Controller.EscalonadorController;
import Model.Processo;
import br.edu.fateczl.fila.Fila;

public class Principal {
    public static void main(String[] args) {
        EscalonadorController EC = new EscalonadorController();
        Fila f = new Fila();

        Processo p1 = new Processo();

        p1.Nome = "notepad.exe";
        p1.QtdRetornos = 14;
        Processo p2 = new Processo();
        p2.Nome = "write.exe";
        p2.QtdRetornos = 35;
        Processo p3 = new Processo();
        p3.Nome = "chrome.exe";
        p3.QtdRetornos = 27;
        Processo p4 = new Processo();
        p4.Nome = "acrobat.exe";
        p4.QtdRetornos = 52;
        Processo p5 = new Processo();
        p5.Nome = "firefox.exe";
        p5.QtdRetornos = 18;
        Processo p6 = new Processo();
        p6.Nome = "word.exe";
        p6.QtdRetornos = 25;



        f.insert(p1);
        f.insert(p2);
        f.insert(p3);
        f.insert(p4);
        f.insert(p5);
        f.insert(p6);


        f = EC.escalonador(f);



    }
}
