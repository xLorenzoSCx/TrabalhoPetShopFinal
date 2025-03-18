package br.ulbra.entity;

import java.util.Calendar;
import javax.swing.JOptionPane;

public class Pet {

    private String id;
    private String nomePet;
    private String raca;
    private int anoNascimento;
    private String sexo;
    private String corPelo;

    public String toString() {
        return " ID:    " + this.id
                + " Nome:  " + this.nomePet
                + " raca:" + this.raca
                + " Ano de nascimento: " + this.anoNascimento
                + " Sexo:  " + this.sexo
                + " Cor do pelo:  " + this.corPelo;
    }

    //setters e getters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public boolean validarNome(String nome) {
        if (nome.length() >= 3) {
            return true;
        }
        return false;
    }

    public void exibirInformacoes() {
        this.nomePet = nomePet;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.sexo = sexo;
        this.corPelo = corPelo;
        JOptionPane.showMessageDialog(null, "Nome: " + nomePet
                + "\nRaça: " + raca
                + "\nAno de Nascimento: " + anoNascimento
                + "\nSexo: " + sexo
                + "\nCor do pelo: " + corPelo
                + "\nIdade: " + calcularIdade() + " anos.");

    }

    public int calcularIdade() {
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        return anoAtual - this.anoNascimento;
    }

}
