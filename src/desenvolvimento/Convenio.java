package desenvolvimento;

import java.util.Scanner;

public class Convenio {

    private int codigo;
    private String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cadastrar(){
        Scanner tec = new Scanner(System.in);
        System.out.println("Convênio: ");
        this.setNome(tec.nextLine());
    }

    public void imprimirConvenio(){
        System.out.println("  |  "+this.getNome());
    }
}
