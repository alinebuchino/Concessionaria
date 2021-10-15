package classes;
import java.util.ArrayList;
import java.util.Date;

public class DadosMovimentacoes {
     public static ArrayList<DadosMovimentacoes> vetor_movimentacoes = new ArrayList<>();
     
     public String nomeMotorista, marca, modelo, placa;
     public double quilometragemInicial, quilometragemFinal;
     public Date data;
     
     public DadosMovimentacoes(){
         
     }

    public static ArrayList<DadosMovimentacoes> getVetor_movimentacoes() {
        return vetor_movimentacoes;
    }

    public static void setVetor_movimentacoes(ArrayList<DadosMovimentacoes> vetor_movimentacoes) {
        DadosMovimentacoes.vetor_movimentacoes = vetor_movimentacoes;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getQuilometragemInicial() {
        return quilometragemInicial;
    }

    public void setQuilometragemInicial(double quilometragemInicial) {
        this.quilometragemInicial = quilometragemInicial;
    }

    public double getQuilometragemFinal() {
        return quilometragemFinal;
    }

    public void setQuilometragemFinal(double quilometragemFinal) {
        this.quilometragemFinal = quilometragemFinal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
     
}

