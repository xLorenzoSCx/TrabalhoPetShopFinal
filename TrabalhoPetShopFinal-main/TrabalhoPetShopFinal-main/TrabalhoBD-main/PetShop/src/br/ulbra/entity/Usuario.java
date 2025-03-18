package br.ulbra.entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Usuario {

    private int pkidUsu;
    private String nomeUsu;
    private String emailUsu;
    private String senhaUsu;

    private String foneUsu;
    private String cpfUsu;
    private String enderecoUsu;

    public Usuario() {
    }

    @Override
    public String toString() {
        return " ID:    " + this.pkidUsu
                + " Nome:  " + this.nomeUsu
                + " E-mail:" + this.emailUsu
                + " Senha: " + this.senhaUsu
                + " Fone:  " + this.foneUsu;

    }

    //setters e getters

    public int getPkidUsu() {
        return pkidUsu;
    }

    public void setPkidUsu(int pkidUsu) {
        this.pkidUsu = pkidUsu;
    }
    

    public String getNomeUsu() {
        return nomeUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public String getEmailUsu() {
        return emailUsu;
    }

    public void setEmailUsu(String emailUsu) {
        this.emailUsu = emailUsu;
    }

    public String getSenhaUsu() {
        return senhaUsu;
    }

    public void setSenhaUsu(String senhaUsu) {
        this.senhaUsu = senhaUsu;
    }

    public String getFoneUsu() {
        return foneUsu;
    }

    public void setFoneUsu(String foneUsu) {
        this.foneUsu = foneUsu;
    }

    public String getCpfUsu() {
        return cpfUsu;
    }

    public void setCpfUsu(String cpfUsu) {
        this.cpfUsu = cpfUsu;
    }

    public String getEnderecoUsu() {
        return enderecoUsu;
    }

    public void setEnderecoUsu(String enderecoUsu) {
        this.enderecoUsu = enderecoUsu;
    }

    public boolean validarSenha(String senha) {
        if (senha.length() >= 8) {

            return true;
        }
        //verificar se a senha atende aos requisitos
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$";
        return senha.matches(regex);

    }

    public boolean validarCpf(String cpf) {

        cpf = cpf.replaceAll("[^0-9]", ""); // Remove pontos e traços

        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) { // Verifica se tem 11 dígitos e não é repetido
            return false;
        }
        if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222")
                || cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555")
                || cpf.equals("66666666666") || cpf.equals("77777777777") || cpf.equals("88888888888")
                || cpf.equals("99999999999")) {
            return false;
        }

        int[] pesos = {10, 9, 8, 7, 6, 5, 4, 3, 2};
        int soma = 0, resto, digito1, digito2;

        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * pesos[i];
        }

        resto = soma % 11;
        digito1 = (resto < 2) ? 0 : 11 - resto;

        soma = 0;
        int[] pesos2 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * pesos2[i];
        }

        resto = soma % 11;
        digito2 = (resto < 2) ? 0 : 11 - resto;

        return (digito1 == (cpf.charAt(9) - '0')) && (digito2 == (cpf.charAt(10) - '0'));

    }

    public boolean confirmarSenha(String senha, String senhaConfirmada) {
        if (senha.equals(senhaConfirmada)) {
            return true;
        }
        return false;

    }

    public boolean verificarEmail(String email) {
        return email.contains("@") && email.contains(".com");

    }

    public void add(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
