package pos.factorymethod;

public interface Fabrica {

    String SMS = "SMS";
    String TELEFONE = "TELEFONE";
    String EMAIL = "EMAIL";

    ContatoIntF criar(String tipo);

}
