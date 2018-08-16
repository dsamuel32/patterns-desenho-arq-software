package pos;

public class EmpresaClass {

    private static EmpresaClass instance;
    private String nome;
    private Long cnpj;

    private EmpresaClass() {}

    public static EmpresaClass getInstance() {
        if (instance == null) {
            instance = new EmpresaClass();
        }
        return instance;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }
}
