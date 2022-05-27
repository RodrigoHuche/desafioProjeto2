package strategy;

public class ComportamentoAutoDestruir implements Comportamento {


    @Override
    public void mover() {
        System.out.println("Perigo! auto destruição em 3...2..1.");
        System.out.println("****Bummmm****.");
    }
}