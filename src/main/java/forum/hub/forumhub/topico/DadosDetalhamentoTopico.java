package forum.hub.forumhub.topico;

public record DadosDetalhamentoTopico(Long id, String titulo, String mensagem, String autor, String curso, String estado) {

    public DadosDetalhamentoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getAutor(), topico.getCurso(), topico.getEstado());
    }
}
