package Ex7;

public class Inimigo {
    private int vida;
    private double danoPorSegundo;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public double getDanoPorSegundo() {
        return danoPorSegundo;
    }

    public void setDanoPorSegundo(double danoPorSegundo) {
        this.danoPorSegundo = danoPorSegundo;
    }

    @Override
    public String toString() {
        return "Inimigo{" +
                "vida=" + vida +
                ", danoPorSegundo=" + danoPorSegundo +
                '}';
    }
}
