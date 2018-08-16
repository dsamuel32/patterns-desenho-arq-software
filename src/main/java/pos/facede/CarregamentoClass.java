package pos.facede;

public class CarregamentoClass {

    public void carregar() {
        SistemaGravacao sistemaGravacao = new SistemaGravacao();
        sistemaGravacao.carregarSistema();
        sistemaGravacao.checarGravadores();
        sistemaGravacao.verificandoPortas();

        SistemaTemporizador sistemaTemporizador = new SistemaTemporizador();
        sistemaTemporizador.checarContadores();
        sistemaTemporizador.iniciarContadores();

        SistemaFilaAtendimento sistemaFilaAtendimento = new SistemaFilaAtendimento();
        sistemaFilaAtendimento.selecionarAtendimento("Atendente");
        sistemaFilaAtendimento.ordenarAtendimentos();
        sistemaFilaAtendimento.disponibilizarAtendimentos();

    }

}
