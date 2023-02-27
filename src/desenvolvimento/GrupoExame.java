package desenvolvimento;

import java.util.Scanner;

public class GrupoExame {
    private int codigo;
    private String Descricao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }
    public void cadastrar(){
        Scanner tec = new Scanner(System.in);
        System.out.print("Código do grupo: ");
        this.setCodigo(tec.nextInt());
        tec.nextLine();
        System.out.print("Grupo do exame: ");
        this.setDescricao(tec.nextLine());
    }
    public void imprimirGrupoExame(){
        System.out.println("Código: "+this.getCodigo());
        System.out.println("Grupo do exame: "+this.getDescricao());
        System.out.println("-------------------------------------------");
    }
    public void listarGrupoExame(){
        System.out.println("   |   "+this.getDescricao());
    }
}

