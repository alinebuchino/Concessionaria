package classes;

import java.util.ArrayList;
import java.util.Date;

public class DadosVeiculos {
    public static ArrayList<DadosVeiculos> vetor_veiculos = new ArrayList<>();

    
    public int chassi, qntPassageiros;
    public String marca, modelo;
    public double velocidadeMaxima;
    public char placa;
    public Date data;
    
    public DadosVeiculos(){
        
    }

    public static ArrayList<DadosVeiculos> getVetor_veiculos() {
        return vetor_veiculos;
    }

    public int getChassi() {
        return chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    public int getQntPassageiros() {
        return qntPassageiros;
    }

    public void setQntPassageiros(int qntPassageiros) {
        this.qntPassageiros = qntPassageiros;
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

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public char getPlaca() {
        return placa;
    }

    public void setPlaca(char placa) {
        this.placa = placa;
    }
     public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    
}
