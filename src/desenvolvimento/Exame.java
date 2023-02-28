package desenvolvimento;
import java.util.Scanner;

import static desenvolvimento.Programa.contGe;
import static desenvolvimento.Programa.ge;

public class Exame {
    private int codigo;
    private String Descricao, procedimentos;
    private double valor;
    private GrupoExame grupoExame = new GrupoExame();
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

    public String getProcedimentos() {
        return procedimentos;
    }

    public void setProcedimentos(String procedimentos) {
        this.procedimentos = procedimentos;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public GrupoExame getGrupoExame() {
        return grupoExame;
    }

    public void setGrupoExame(GrupoExame grupoExame) {
        this.grupoExame = grupoExame;
    }

    public void cadastrar(){
        Scanner tec = new Scanner(System.in);
        int codGrupoExame;
        System.out.println("--------------------------------------------------------");
        System.out.println("Relação dos grupos");
        System.out.println("Código    |   Grupos");
        for (int i = 0; i < contGe; i++) {
            System.out.print("           "+i);
            ge[i].listarGrupoExame();
            System.out.println();
        }
        System.out.println("Vincule a um grupo");
        codGrupoExame = tec.nextInt();
        this.setGrupoExame(ge[codGrupoExame]);
        tec.nextLine();

        System.out.println("Codigo: ");
        this.setCodigo(tec.nextInt());
        tec.nextLine();

        System.out.println("Exame");
        this.setDescricao(tec.nextLine());
        System.out.println("Valor");
        this.setValor(tec.nextDouble());
        tec.nextLine();
        System.out.println("Procedimentos");
        this.setProcedimentos(tec.nextLine());
    }
    public void imprimirExame(){
        System.out.println("-------------------------------------------------------");
        System.out.println("Código...........: "+this.getCodigo());
        System.out.println("Exame............: "+this.getDescricao());
        System.out.println("Grupo do Exame...: "+this.getGrupoExame().getDescricao());
        System.out.println("Valor............: "+this.getValor());
        System.out.println("Procedimentos....: "+this.getProcedimentos());
        System.out.println("-------------------------------------------------------");
    }
    public void listarExame(){
        System.out.println("   |   "+this.getDescricao());
        System.out.println("   |   "+this.getValor());
    }
}
