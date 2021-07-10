package hash;

public class TabelaHash {
    
    private Aluno[] array;

    public TabelaHash(int N) {
        
        this.array = new Aluno[N];
        
        for (int i = 0; i < N; i++) {
            array[i] = null;
        }
    }
    
    private int hash(int chave) {
        
        return (chave % array.length);
    }
	
	private int hash2(int chave) {
		return (array.length - 2 - chave % (array.length - 2));
	}
	
    public void insere(Aluno aluno) {
        
        int h = hash(aluno.getMatricula());
        Aluno p = array[h];
        
        // procura p
        while (p != null) {
            if (p.getMatricula() == aluno.getMatricula()) {
                break;
            }
            p = p.getProximo();
        }
        
        // nao encontrou aluno, entao cria novo
        if (p == null) {
            p = new Aluno();
            p.setMatricula(aluno.getMatricula());
            p.setProximo(array[h]);
            array[h] = p;
        }

        // atribui/modifica informacoes
        p.setNome(aluno.getNome());
        p.setMedia(aluno.getMedia());
    }
    
    public Aluno busca(int chave) {
        
        int h = hash(chave);
        Aluno p = array[h];
        
        if (p == null) {
            return null;
        }
        
        while (p != null) {
            
            if (p.getMatricula() == chave) {
                return p;
            } else {
                p = p.getProximo();
            }
        }
        
        return null;
    }
    
    public boolean remove(int chave) {
        
        int h = hash(chave);
        Aluno p = array[h];
        
        if (p == null) {
            return false;
        }
        
        Aluno anterior = null;
        
        while (p != null) {
            
            if (p.getMatricula() == chave) {
                if (anterior != null) {
                    anterior.setProximo(p.getProximo());
                } else {
                    array[h] = p.getProximo();
                }
                
                return true;
            } else {
                anterior = p;
                p        = p.getProximo();
            }
        }
        
        return false;
    }
    
    public void imprime() {
        
        for (int i = 0; i < array.length; i++) {
            
            System.out.print("Indice:  " + i + " = ");
            if (array[i] != null) {
                
                Aluno tmp = array[i];
                while (tmp != null) {
                    System.out.print(tmp.getMatricula() + "|" + tmp.getNome() + ", ");
                    tmp = tmp.getProximo();
                }
                System.out.println("");
            } else {
                System.out.println("null");
            }
        }
        
    }
    
    public String toString() {
        
        String s = "";
        
        for (int i = 0; i < array.length; i++) {
            
            s += "[" + i + "]  ";
            if (array[i] != null) {
                
            }
        }
        return "";
    }
}
