
package model;

public class Funcionario {
    private int id;
    private String nome;
    private String cpf;
    private String end;
    private String tel;
    
    public Funcionario () {
        
    }
    
    public Funcionario(int id, String nome, String cpf, String end, String tel) {
        this.id = id;
        this.nome= nome;
        this.cpf = cpf;
        this.end = end;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
}
