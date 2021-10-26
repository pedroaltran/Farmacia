package model;

public class Medicamento {
    private int id;
    private String marca;
    private String nomemed;
    private float preco;
    private int quant;
    
    public Medicamento () {
        
    }
    
    public Medicamento (int id, String marca, String nomemed, float preco, int quant) {
        this.id = id;
        this.marca = marca;
        this.nomemed = nomemed;
        this.preco = preco;
        this.quant = quant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNomemed() {
        return nomemed;
    }

    public void setNomemed(String nomemed) {
        this.nomemed = nomemed;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
    
}
