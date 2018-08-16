package pos.contato;

public class ContatoFabrica implements Fabrica {

    public ContatoIntF criar(String tipo) {
        if (Fabrica.EMAIL.equals(tipo)) {
            return  new ContatoEmail();
        } else if (Fabrica.TELEFONE.equals(tipo)) {
            return new ContatoTelefone();
        } else {
            return new ContatoSMS();
        }
    }

}
