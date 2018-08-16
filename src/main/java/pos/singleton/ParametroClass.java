package pos.singleton;

public class ParametroClass {

    private static ParametroClass instance;
    private Long qtdMaxima;
    private String destinoArquivos;

    private ParametroClass() {}

    public static ParametroClass getInstance() {
        if (instance == null) {
            instance = new ParametroClass();
        }
        return instance;
    }

    public Long getQtdMaxima() {
        return qtdMaxima;
    }

    public void setQtdMaxima(Long qtdMaxima) {
        this.qtdMaxima = qtdMaxima;
    }

    public String getDestinoArquivos() {
        return destinoArquivos;
    }

    public void setDestinoArquivos(String destinoArquivos) {
        this.destinoArquivos = destinoArquivos;
    }

}
