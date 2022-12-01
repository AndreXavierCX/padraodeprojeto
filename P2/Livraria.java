import java.util.Date;

public class Biblioteca {

    public static void main(String[] args) {
        Usuario.NovoUsuario("Andre", "andre123", "123", "5", false);
        Livro.NovoLivro("xavier", 2021, "fdsuhfuyds", "dsajhisda", true, "livro", 5)
        
        Emprestimo.Emprestar(Usuario.GetInstance(), Livro.GetInstance(), 0, new Date());

        Emprestimo.Renovar(new Date());

        Emprestimo.Devolver();


    }
}