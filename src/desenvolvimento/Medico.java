package desenvolvimento;

import java.util.Scanner;

public class Medico {
    private int CRM;
    private String nome;

    public int getCRM() {
        return CRM;
    }

    public void setCRM(int CRM) {
        this.CRM = CRM;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cadastrar(){
        Scanner tec = new Scanner(System.in);
        System.out.println("Nome: ");
        this.setNome(tec.nextLine());
        System.out.println("CRM: ");
        this.setCRM(tec.nextInt());
    }
    public void imprimirMedico(){
        System.out.println("Médico: "+this.getNome());
        System.out.println("CRM: "+this.getCRM());
    }

    public void listarMedico(){
        System.out.println("  |  "+this.getCRM());
        System.out.println("  |  "+this.getNome());
    }
}
