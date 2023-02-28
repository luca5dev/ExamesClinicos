package desenvolvimento;
import static desenvolvimento.Programa.contEx;
import static desenvolvimento.Programa.contPexe;
import static desenvolvimento.Programa.ex;
import static desenvolvimento.Programa.pexe;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExamePedidoExame {
    private Date dataRealizacaoExame, dataPronto, horaRealizacaoExame, horaPronto;
    private Exame examePedido = new Exame();
    private String resultado;
    private Double valor;

    public Date getDataRealizacaoExame() {
        return dataRealizacaoExame;
    }

    public void setDataRealizacaoExame(Date dataRealizacaoExame) {
        this.dataRealizacaoExame = dataRealizacaoExame;
    }

    public Date getDataPronto() {
        return dataPronto;
    }

    public void setDataPronto(Date dataPronto) {
        this.dataPronto = dataPronto;
    }

    public Date getHoraRealizacaoExame() {
        return horaRealizacaoExame;
    }

    public void setHoraRealizacaoExame(Date horaRealizacaoExame) {
        this.horaRealizacaoExame = horaRealizacaoExame;
    }

    public Date getHoraPronto() {
        return horaPronto;
    }

    public void setHoraPronto(Date horaPronto) {
        this.horaPronto = horaPronto;
    }

    public Exame getExamePedido() {
        return examePedido;
    }

    public void setExamePedido(Exame examePedido) {
        this.examePedido = examePedido;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void cadastrar() throws ParseException{
        Scanner tec = new Scanner(System.in);
        int codE;
        System.out.println("-----------------------------------------------");
        System.out.println("Relação de exames");
        System.out.println("Codigo  |  Descrição               |  Valor");
        for (int i = 0; i < contEx; i++) {
            System.out.println("         "+i);
            ex[i].listarExame();
            System.out.println();
        }
        System.out.println("Escolha um exame: ");
        codE = tec.nextInt();
        this.setExamePedido(ex[codE]);
        System.out.println();

        System.out.println("Data da realização do exame Ex: [18/02/2022]: ");
        String dataRealizarExame = tec.nextLine();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        Date dt1 = sdf1.parse(dataRealizarExame);
        this.setDataRealizacaoExame(dt1);

        System.out.println("Data do exame pronto Ex: [18/02/2022]: ");
        String dataExamePronto = tec.nextLine();
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        Date dt2 = sdf2.parse(dataExamePronto);
        this.setDataPronto(dt2);

        System.out.println("Hora da realização do Exame Ex: [15:09]: ");
        String horaRealizarExame = tec.nextLine();
        SimpleDateFormat sdf3 = new SimpleDateFormat("HH:mm");
        Date dt3 = sdf3.parse(horaRealizarExame);
        this.setHoraRealizacaoExame(dt3);

        System.out.println("Hora do exame pronto Ex: [15:09]");
        String horaExamePronto = tec.nextLine();
        SimpleDateFormat sdf4 = new SimpleDateFormat("HH:mm");
        Date df4 = sdf4.parse(horaExamePronto);
        this.setHoraPronto(df4);

        System.out.println("Valor: "+ this.getValor());
    }
    public void imprimir(){
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        String dataRealizarExame = formataData.format(this.getDataRealizacaoExame());
        System.out.println("Data do Exame: "+dataRealizarExame);

        SimpleDateFormat formataHora = new SimpleDateFormat("HH:mm");
        String horaRealizarExame = formataHora.format(this.getHoraRealizacaoExame());
        System.out.println("Hora do Exame: "+ horaRealizarExame);

        String dataRetirarExame = formataData.format(this.getDataPronto());
        System.out.println("Data da retirada do exame: "+dataRetirarExame);

        String horaRetirarExame = formataHora.format(this.getHoraPronto());
        System.out.println("Hora da retirada do exame: "+horaRetirarExame);

        for (int i = 0; i < contPexe; i++) {
            System.out.println(pexe[i].getExamePedido().getDescricao());
        }
    }

}
