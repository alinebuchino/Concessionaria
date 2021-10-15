package classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MetodosAcoes {

     public void salvar(DadosVeiculos x) { //Salva dados na ArrayList
        x.vetor_veiculos.add(x);
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso",
                "Cadastro de Veículos", 1);
    }
    public void salvar(DadosMovimentacoes x) { //Salva dados na ArrayList
        x.vetor_movimentacoes.add(x);
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso",
                "Cadastro de Movimentações", 1);
    }
    public ArrayList busca1(String data){
        
        DateFormat dat = new SimpleDateFormat("dd/MM/yyyy");
        
        ArrayList<DadosVeiculos> lista_busca = new ArrayList<>();
               
       for (int i=0; i<DadosVeiculos.vetor_veiculos.size();i++){
           
           if (dat.format(DadosMovimentacoes.vetor_movimentacoes.get(i).getData()).equalsIgnoreCase(data)){
                  
                  DadosVeiculos xx = new DadosVeiculos();
                  xx.setChassi(DadosVeiculos.vetor_veiculos.get(i).getChassi());
                  xx.setPlaca(DadosVeiculos.vetor_veiculos.get(i).getPlaca());
                  xx.setMarca(DadosVeiculos.vetor_veiculos.get(i).getMarca());
                  xx.setModelo(DadosVeiculos.vetor_veiculos.get(i).getModelo());
                  xx.setVelocidadeMaxima(DadosVeiculos.vetor_veiculos.get(i).getVelocidadeMaxima());
                  xx.setQntPassageiros(DadosVeiculos.vetor_veiculos.get(i).getQntPassageiros());
                                    
                  lista_busca.add(xx);
           } 
       }
        
        return lista_busca;
    } 
    public ArrayList busca2(String data){
        
        DateFormat dat = new SimpleDateFormat("dd/MM/yyyy");
        
        ArrayList<DadosMovimentacoes> lista_busca2 = new ArrayList<>();
               
       for (int i=0; i<DadosMovimentacoes.vetor_movimentacoes.size();i++){
           
           if (dat.format(DadosMovimentacoes.vetor_movimentacoes.get(i).getData()).equalsIgnoreCase(data)){
                  
                  DadosMovimentacoes ss = new DadosMovimentacoes();
                  ss.setNomeMotorista(DadosMovimentacoes.vetor_movimentacoes.get(i).getNomeMotorista());
                  ss.setQuilometragemInicial(DadosMovimentacoes.vetor_movimentacoes.get(i).getQuilometragemInicial());
                  ss.setQuilometragemFinal(DadosMovimentacoes.vetor_movimentacoes.get(i).getQuilometragemFinal());
                
                  lista_busca2.add(ss);
           }    
       }
        
        return lista_busca2;
    }
    
}
