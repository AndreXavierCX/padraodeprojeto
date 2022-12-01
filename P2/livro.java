public class Livro {
    
    private volatile static Livro _UniqueInstance;

    public String Autor;
    public int AnoLancamento;
    public String Titulo;
    public String SubTitutlo;
    public boolean CapaDura;
    public String Categoria; 
    public int Quantidade;

    public Livro() {
    }

    public Livro GetInstance(){
        if(_UniqueInstance == null){
            _UniqueInstance = new Livro();
        }

        return _UniqueInstance
    }

    public void NovoLivro(
        String autor,
        int anoLancamento,
        String titulo,
        String subTitutlo,
        boolean capaDura,
        String categoria,
        int Quantidade;
        ){
           Autor = autor;
           AnoLancamento = anoLancamento;
           Titulo = titulo;
           SubTitutlo = subTitutlo;
           capaDura = CapaDura;
           Categoria = categoria;
           Quantidade = Quantidade; 
        }

}
    