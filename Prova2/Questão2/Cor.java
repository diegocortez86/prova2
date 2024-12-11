public class Cor {

    private int vermelho;
    private int verde;
    private int azul;

    public Cor(int vermelho, int verde, int azul) {
        this.vermelho = Math.min(Math.max(vermelho, 0), 255);
        this.verde = Math.min(Math.max(verde, 0), 255);
        this.azul = Math.min(Math.max(azul, 0), 255);
    }

    @Override
    public String toString() {
        return String.format("rgb( %d, %d, %d )", vermelho, verde, azul);
    }

    public int getVermelho() {
        return vermelho;
    }

    public void setVermelho(int vermelho) {
        this.vermelho = Math.min(Math.max(vermelho, 0), 255);
    }

    public int getVerde() {
        return verde;
    }

    public void setVerde(int verde) {
        this.verde = Math.min(Math.max(verde, 0), 255);
    }

    public int getAzul() {
        return azul;
    }

    public void setAzul(int azul) {
        this.azul = Math.min(Math.max(azul, 0), 255);
    }
}
