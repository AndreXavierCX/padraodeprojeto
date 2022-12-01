import java.util.Date;

public class Emprestimo{
    
    private volatile static Emprestimo _UniqueInstance;

    public Usuario Usuario;
    public Livro Livro;
    public int QTDRenovacoes;
    public Date DataDevolucao;
    public boolean Devolvido;


    public Emprestimo GetInstance(){
        if(_UniqueInstance == null){
            _UniqueInstance = new Livro();
        }

        return _UniqueInstance
    }

    public void Emprestar(Usuario usuario, Livro livro, int QTDRenovacoes, Date DataDevolucao){
        Usuario = usuario;
        Livro = livro;
        QTDRenovacoes = QTDRenovacoes;
        DataDevolucao = DataDevolucao;
        status = false;

        System.out.println("Livro emprestado");
    }

    public void Devolver(){
        Devolvido = true;
        System.out.println("Livro Devolvido");
    }

    public void Renovar(Date data){
        DataDevolucao = data;
        QTDRenovacoes++;
        System.out.println("Livro Renovado");
    }
}