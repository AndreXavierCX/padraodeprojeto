package livraria;

public class Leitor {
    private char nome;
    private char endereco;
    
    public Leitor(char nome,char endereco){
        this.nome= nome;
        this.endereco = endereco;
    }
    
    public void apresentarLEITOR(){
        System.out.println("NOME: "+ this.nome);
        System.out.println("ENDEREÇO: "+this.endereco);
    }
    public char getNome() {
        return nome;
    }

    public void setNome(char nome) {
        this.nome = nome;
    }

    public char getEndereco() {
        return endereco;
    }

    public void setEndereco(char endereco) {
        this.endereco = endereco;
    }
}
