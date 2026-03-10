package br.com.fiapride.model;
public class Caneta {
    public String cor;
    public String material;
    public boolean tampa;
    public boolean tinta;

    public Caneta(String cor, String material, boolean tampa, boolean tinta) {
        this.cor = cor;
        this.material = material;
        this.tampa = tampa;
        this.tinta = tinta;
    }

    public void estaTampada() {
        if (this.tampa) {
            System.out.println("A caneta está tampada");
            return;
        }
        else {
            System.out.println("A caneta está destampada");
        }
    }

    public void temTinta() {
        if (this.tinta){
            System.out.println("A caneta tem tinta");
        }
        else {
            System.out.println("A caneta não tem tinta");
        }
    }

    public String getCor() {
        return this.cor; // Apenas devolve o valor, não altera nada.
    }

    private void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return this.material; // Apenas devolve o valor, não altera nada.
    }

    private void setMaterial(String material) {
        this.material = material;
    }

    public boolean getTampa() {
        return this.tampa; // Apenas devolve o valor, não altera nada.
    }

    private void setTampa(boolean tampa) {
        this.tampa = tampa;
    }

    public boolean getTinta() {
        return this.tinta; // Apenas devolve o valor, não altera nada.
    }

    private void setTinta(boolean tinta) {
        this.tinta = tinta;
    }
}