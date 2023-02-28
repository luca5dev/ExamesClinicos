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

    public static int contPe = 0;
    public static int contP = 0;
    public static int contM = 0;
    public static int contC = 0;
    public static int contGe = 0;
    public static int contEx = 0;
    public static int contPexe = 0;

    public static void imprimePaciente(){
        for (int i = 0; i < contP; i++) {
            p[i].imprimirPaciente();
        }
    }
    public static void imprimeConvenio(){
        for (int i = 0; i < contC; i++) {
            c[i].imprimirConvenio();
        }
    }
    public static void imprimeMedico(){
        for (int i = 0; i < contM; i++) {
            m[i].imprimirMedico();
        }
    }
    public static void imprimePedidoExame(){
        for (int i = 0; i < contPe; i++) {
                pe[i].imprimirPedidoExame();
            for (int j = 0; j < contPexe; j++) {
                pexe[j].imprimir();
            }
        }
    }
    public static void imprimeGrupoExame(){
        for (int i = 0; i < contGe; i++) {
            ge[i].imprimirGrupoExame();
        }
    }
    public static void imprimeExame(){
        for (int i = 0; i < contEx; i++) {
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
            System.out.print("Escolha uma Opção: ");
            opcao = tec.nextInt();
            tec.nextLine();
        }switch (opcao){
            case 1:
                p[contP] = new Paciente();
                p[contP].cadastrar();
                contP++;
                break;
            case 2:
                imprimePaciente();
                break;
            case 3:
                c[contC] = new Convenio();
                c[contC].cadastrar();
                contC++;
                break;
            case 4:
                imprimeConvenio();
                break;
            case 5:
                m[contM] = new Medico();
                m[contM].cadastrar();
                contM++;
                break;
            case 6:
                imprimeMedico();
                break;
            case 7:
                pe[contPe] = new PedidoExame();
                pe[contPe].cadastrar();
                contPe++;
                int resp = 1;
                while (resp == 1){
                    pexe[contPexe] = new ExamePedidoExame();
                    pexe[contPexe].cadastrar();
                    contPexe++;
                    System.out.println("Deseja cadastrar outro exame? [1 - para SIM] e [2 - para NÃO]: ");
                    resp = tec.nextInt();
                    tec.nextLine();
                }
                break;
            case 8:
                imprimePedidoExame();
                break;
            case 9:
                ex[contEx] = new Exame();
                ex[contEx].cadastrar();
                contEx++;
                break;
            case 10:
                imprimeExame();
                break;
            case 11:
                ge[contGe] = new GrupoExame();
                ge[contGe].cadastrar();
                contGe++;
                break;
            case 12:
                imprimeGrupoExame();
                break;
            default:
                System.exit(0);
        }
    }

}
