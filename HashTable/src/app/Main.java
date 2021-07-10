package app;

import hash.Aluno;
import hash.TabelaHash;

public class Main {
    
    public static void main(String[] args) {
        
        TabelaHash tabela = new TabelaHash(3);
        
        tabela.insere(new Aluno("Joao", 9, 5.5));
        tabela.insere(new Aluno("Carlos", 3, 9.5));
        tabela.insere(new Aluno("Joao2", 9, 5.5));
        tabela.insere(new Aluno("Samuel", 12, 5.5));
        tabela.insere(new Aluno("teste", 15, 5.5));
          
        
        tabela.insere(new Aluno("Caio", 4, 6.5));
        
        tabela.imprime();
        
        //System.out.println(tabela.busca(3));
        
        tabela.remove(12);
        tabela.remove(15);
        tabela.imprime();
     
    }
}
