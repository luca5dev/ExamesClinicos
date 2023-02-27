package desenvolvimento;

import java.text.ParseException;
import java.util.Scanner;

public class Programa {
    static Paciente p[] = new Paciente[10];
    static Medico m[] = new Medico[10];
    static Convenio c[] = new Convenio[10];
    static PedidoExame pe[] = new PedidoExame[10];
    static GrupoExame ge[] = new GrupoExame[10];
    static Exame ex[] = new Exame[10];
    static ExamePedidoExame pexe[] = new ExamePedidoExame[10];

    public static int ContPe = 0;
    public static int ContP = 0;
    public static int ContM = 0;
    public static int ContC = 0;
    public static int ContGe = 0;
    public static int ContEx = 0;
    public static int ContPexe = 0;

    public static void imprimePaciente(){
        for (int i = 0; i < ContP; i++) {
            p[i].imprimirPaciente();
        }
    }
    public static void imprimeConvenio(){
        for (int i = 0; i < ContC; i++) {
            c[i].imprimirConvenio();
        }
    }
    public static void imprimeMedico(){
        for (int i = 0; i < ContM; i++) {
            m[i].imprimirMedico();
        }
    }
    public static void imprimePedidoExame(){
        for (int i = 0; i < ContPe; i++) {
                pe[i].imprimirPedidoExame();
            for (int j = 0; j < ContPexe; j++) {
                pexe[j].imprimir();
            }
        }
    }
    public static void imprimeGrupoExame(){
        for (int i = 0; i < ContGe; i++) {
            ge[i].imprimirGrupoExame();
        }
    }
    public static void imprimeExame(){
        for (int i = 0; i < ContEx; i++) {
            ex[i].imprimirExame();
        }
    }

    public static void main(String[] args) throws ParseException {
        Scanner tec = new Scanner(System.in);
        int opcao = 1;
        while (opcao != 0){
            System.out.println("---------------------------------------------------------");
            System.out.println("------------SISTEMA DE ANALISES CLINICAS-----------------");
            System.out.println("---------------------------------------------------------");
            System.out.println("|PACIENTE        [1 - Cadastrar]            [2 - Listar]|");
            System.out.println("|CONVÊNIO        [3 - Cadastrar]            [4 - Listar]|");
            System.out.println("|MÉDICO          [5 - Cadastrar]            [6 - Listar]|");
            System.out.println("|PEDIDO EXAME    [7 - Cadastrar]            [8 - Listar]|");
            System.out.println("|EXAME           [9 - Cadastrar]           [10 - Listar]|");
            System.out.println("|GRUPO EXAME    [11 - Cadastrar]           [12 - Listar]|");
            System.out.println("---------------------------------------------------------");
            System.out.println("| [ 0 ] Para sair");
            System.out.println("---------------------------------------------------------");
            System.out.println("Escolha uma Opção: ");
            opcao = tec.nextInt();
            tec.nextLine();
        }switch (opcao){
            case 1:
                p[contP] = new Paciente();
                p[contP] = cadastrar();
                contP++;
                break;
            case 2:

        }
    }

}
