public class Usuario{
    
    private volatile static Usuario _UniqueInstance;

    public String Nome;
    public String Login;
    public String Senha;
    public int MaximoEmprestimos;
    private boolean Punido = false;

    public Usuario GetInstance(){
        if(_UniqueInstance == null){
            _UniqueInstance = new Usuario();
        }

        return _UniqueInstance
    }

    public NovoUsuario(
        String Nome,
String Login,
String Senha,
int MaximoEmprestimos,
boolean Punido,
    ){
        Nome = Nome;
 Login = Login;
 Senha = Senha;
 MaximoEmprestimos = MaximoEmprestimos;
 Punido = Punido;
    }
}