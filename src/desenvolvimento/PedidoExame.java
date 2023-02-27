package desenvolvimento;
import static desenvolvimento.Programa.c;
import static desenvolvimento.Programa.contC;
import static desenvolvimento.Programa.contM;
import static desenvolvimento.Programa.contP;
import static desenvolvimento.Programa.m;
import static desenvolvimento.Programa.p;


import java.util.Scanner;

public class PedidoExame {
    private int codigo;
    private Paciente paciente = new Paciente();
    private Medico medico = new Medico();
    private Convenio convenio = new Convenio();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Convenio getConvenio() {
        return convenio;
    }

    public void setConvenio(Convenio convenio) {
        this.convenio = convenio;
    }
    
    public void cadastrar(){
        Scanner tec = new Scanner(System.in);
        int codPaciente, codMedico, codConvenio;
        System.out.println("Relação de Pacientes");
        System.out.println("Codigo  |  CPF        |  Nome");
        for (int i = 0; i < contP; i++) {
            System.out.print("       "+i);
            p[i].listarPaciente();
            System.out.println();
        }
        System.out.println("Escolha um Paciente");
        codPaciente = tec.nextInt();
        this.setPaciente(p[codPaciente]);
        tec.nextLine();
        
        System.out.println("Relação de Médicos");
        System.out.println("Código   | CRM      | Nome");
        for (int i = 0; i < contM; i++) {
            System.out.print("       "+i);
            m[i].listarMedico();
            System.out.println();            
        }
        System.out.println("Escolha um médico");
        codMedico = tec.nextInt();
        this.setMedico(m[codMedico]);
        tec.nextLine();
        
        System.out.println("Relação de convênio");
        System.out.println("Codigo     |  Nome");
        for (int i = 0; i < contC; i++) {
            System.out.print("         "+i);
            c[i].imprimirConvenio();
            System.out.println();
        }
        System.out.println("Escolha um convênio");
        codConvenio = tec.nextInt();
        this.setConvenio(c[codConvenio]);
        tec.nextLine();
    }
    public void imprimirPedidoExame(){
        System.out.println("Medico: "+this.getMedico().getNome());
        System.out.println("Convênio: "+this.getConvenio().getNome());
        System.out.println("Paciente: "+this.getPaciente().getNome());
    }
    
}
