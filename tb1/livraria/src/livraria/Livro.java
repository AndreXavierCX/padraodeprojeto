package livraria;

public class Livro {
    private char nome;
    private char isbn;
    private char situacao;
    
    public Livro(char nome, char isbn, char situacao){
        this.nome = nome;
        this.isbn = isbn;
        this.situacao = situacao;
    }
    
    public void apresentarLIVRO(){
        System.out.println("nome "+this.nome);
        System.out.println("isbn "+this.isbn);
        System.out.println("situacao "+this.situacao);
    }

    public char getNome() {
        return nome;
    }

    public void setNome(char nome) {
        this.nome = nome;
    }

    public char getIsbn() {
        return isbn;
    }

    public void setIsbn(char isbn) {
        this.isbn = isbn;
    }

    public char getSituacao() {
        return situacao;
    }

    public void setSituacao(char situacao) {
        this.situacao = situacao;  
    }
}