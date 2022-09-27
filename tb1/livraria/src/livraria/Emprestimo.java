package livraria;

import java.util.Date;

public class Emprestimo {
    private Date dataRetirada;
    private Date dataDevolucao;

    public Emprestimo(Date dataRetirada, Date dataDevolucao){
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
    }

    public void apresentarEMPREST(){
        System.out.println("retirada "+this.dataRetirada);
        System.out.println("ddevolucao "+this.dataDevolucao);
        
    }
    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
